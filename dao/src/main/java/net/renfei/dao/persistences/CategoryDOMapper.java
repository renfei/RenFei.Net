package net.renfei.dao.persistences;

import java.util.List;
import net.renfei.dao.entity.CategoryDO;
import net.renfei.dao.entity.CategoryDOExample;
import org.apache.ibatis.annotations.Param;

public interface CategoryDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Jun 05 18:24:36 CST 2019
     */
    long countByExample(CategoryDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Jun 05 18:24:36 CST 2019
     */
    int deleteByExample(CategoryDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Jun 05 18:24:36 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Jun 05 18:24:36 CST 2019
     */
    int insert(CategoryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Jun 05 18:24:36 CST 2019
     */
    int insertSelective(CategoryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Jun 05 18:24:36 CST 2019
     */
    List<CategoryDO> selectByExample(CategoryDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Jun 05 18:24:36 CST 2019
     */
    CategoryDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Jun 05 18:24:36 CST 2019
     */
    int updateByExampleSelective(@Param("record") CategoryDO record, @Param("example") CategoryDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Jun 05 18:24:36 CST 2019
     */
    int updateByExample(@Param("record") CategoryDO record, @Param("example") CategoryDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Jun 05 18:24:36 CST 2019
     */
    int updateByPrimaryKeySelective(CategoryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Wed Jun 05 18:24:36 CST 2019
     */
    int updateByPrimaryKey(CategoryDO record);
}