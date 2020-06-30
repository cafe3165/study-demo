package com.studydemo.demo.Controller;

import com.studydemo.demo.POJO.Category;
import com.studydemo.demo.mapper.CategoryMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Author:cafe3165
 * Date:2020-04-19
 */
@RestController
public class mytran {
    @RequestMapping("/mt")
    public void test() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        CategoryMapper mapper = session.getMapper(CategoryMapper.class);

        Category c1 = new Category();
        c1.setName("长度够短的名称");
        mapper.add(c1);

//        Category c2 = new Category();
//        c2.setName("超过最大长度30的名称超过最大长度30的名称超过最大长度30的名称超过最大长度30的名称超过最大长度30的名称超过最大长度30的名称");
//        mapper.add(c2);

        listAll(mapper);
        session.commit();
        session.close();
    }
    private static void listAll(CategoryMapper mapper) {
        List<Category> cs = mapper.list();
        for (Category c : cs) {
            System.out.println(c.getName());
        }
    }


}
