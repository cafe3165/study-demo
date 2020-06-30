package com.studydemo.demo.mapper;

/**
 * Author:cafe3165
 * Date:2020-04-17
 */
import java.util.List;

import com.studydemo.demo.POJO.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


public interface CategoryMapper {

    @Insert(" insert into category_ ( name ) values (#{name}) ")
    int add(Category category);

    @Delete(" delete from category_ where id= #{id} ")
    void delete(int id);

    @Select("select * from category_ where id= #{id} ")
    Category get(int id);

    @Update("update category_ set name=#{name} where id=#{id} ")
    int update(Category category);

    @Select(" select * from category_ ")
    List<Category> list();
}