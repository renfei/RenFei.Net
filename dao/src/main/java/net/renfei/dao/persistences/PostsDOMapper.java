package net.renfei.dao.persistences;

import java.util.List;
import net.renfei.dao.entity.PostsDO;
import net.renfei.dao.entity.PostsDOExample;
import net.renfei.dao.entity.PostsDOWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface PostsDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_posts
     *
     * @mbg.generated Thu Jun 06 13:14:39 CST 2019
     */
    long countByExample(PostsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_posts
     *
     * @mbg.generated Thu Jun 06 13:14:39 CST 2019
     */
    int deleteByExample(PostsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_posts
     *
     * @mbg.generated Thu Jun 06 13:14:39 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_posts
     *
     * @mbg.generated Thu Jun 06 13:14:39 CST 2019
     */
    int insert(PostsDOWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_posts
     *
     * @mbg.generated Thu Jun 06 13:14:39 CST 2019
     */
    int insertSelective(PostsDOWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_posts
     *
     * @mbg.generated Thu Jun 06 13:14:39 CST 2019
     */
    List<PostsDOWithBLOBs> selectByExampleWithBLOBs(PostsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_posts
     *
     * @mbg.generated Thu Jun 06 13:14:39 CST 2019
     */
    List<PostsDO> selectByExample(PostsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_posts
     *
     * @mbg.generated Thu Jun 06 13:14:39 CST 2019
     */
    PostsDOWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_posts
     *
     * @mbg.generated Thu Jun 06 13:14:39 CST 2019
     */
    int updateByExampleSelective(@Param("record") PostsDOWithBLOBs record, @Param("example") PostsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_posts
     *
     * @mbg.generated Thu Jun 06 13:14:39 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") PostsDOWithBLOBs record, @Param("example") PostsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_posts
     *
     * @mbg.generated Thu Jun 06 13:14:39 CST 2019
     */
    int updateByExample(@Param("record") PostsDO record, @Param("example") PostsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_posts
     *
     * @mbg.generated Thu Jun 06 13:14:39 CST 2019
     */
    int updateByPrimaryKeySelective(PostsDOWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_posts
     *
     * @mbg.generated Thu Jun 06 13:14:39 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(PostsDOWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_posts
     *
     * @mbg.generated Thu Jun 06 13:14:39 CST 2019
     */
    int updateByPrimaryKey(PostsDO record);
}