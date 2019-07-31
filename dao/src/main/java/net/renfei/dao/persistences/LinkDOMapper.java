package net.renfei.dao.persistences;

import java.util.List;
import net.renfei.dao.entity.LinkDO;
import net.renfei.dao.entity.LinkDOExample;
import net.renfei.dao.entity.LinkDOWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface LinkDOMapper {
    long countByExample(LinkDOExample example);

    int deleteByExample(LinkDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LinkDOWithBLOBs record);

    int insertSelective(LinkDOWithBLOBs record);

    List<LinkDOWithBLOBs> selectByExampleWithBLOBs(LinkDOExample example);

    List<LinkDO> selectByExample(LinkDOExample example);

    LinkDOWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LinkDOWithBLOBs record, @Param("example") LinkDOExample example);

    int updateByExampleWithBLOBs(@Param("record") LinkDOWithBLOBs record, @Param("example") LinkDOExample example);

    int updateByExample(@Param("record") LinkDO record, @Param("example") LinkDOExample example);

    int updateByPrimaryKeySelective(LinkDOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LinkDOWithBLOBs record);

    int updateByPrimaryKey(LinkDO record);
}