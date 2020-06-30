package com.studydemo.demo.Controller;

import com.studydemo.demo.POJO.Category;
import com.studydemo.demo.POJO.Order;
import com.studydemo.demo.POJO.OrderItem;
import com.studydemo.demo.POJO.Product;
import com.studydemo.demo.mapper.CategoryMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author:cafe3165
 * Date:2020-04-15
 */
@RestController
public class mybatistest {
    public String resource = "mybatis-config.xml";
    public InputStream inputStream = Resources.getResourceAsStream(resource);
    public SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    public mybatistest() throws IOException {
    }

    @GetMapping("/my1")
    public void test1() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        List<Category> cs = session.selectList("listCategory");
        for (Category c : cs) {
            System.out.println(c.getName());
        }
        Category c = new Category();
        c.setName("new");
        session.insert("addCategory", c);
        System.out.println("--------------");
        List<Category> cs2 = session.selectList("listCategory");
        for (Category cc : cs2) {
            System.out.println(cc.getName());
        }
        Category tmp = new Category();
        tmp.setId(6);
        session.delete("delCategory", tmp);

        Category get = session.selectOne("getCategory", 7);
        System.out.println(get.getName());


        session.commit();
        session.close();

    }


    @GetMapping("/newmy1")
    public void test2() throws IOException {

        SqlSession session = sqlSessionFactory.openSession();
        List<Category> cs = session.selectList("listCategoryByName", "cat");
        for (Category c : cs) {
            System.out.println(c.getName());
        }

        Map<String, Object> params = new HashMap<>();
        params.put("id", 3);
        params.put("name", "n");
        List<Category> sl = session.selectList("listCategoryByIdAndName", params);
        for (int i = 0; i < sl.size(); i++) {
            System.out.println(sl.get(i).getName() + " " + sl.get(i).getId());
        }

        session.commit();
        session.close();


    }

    @GetMapping("/newmy2")
    public void test3() {
        SqlSession session = sqlSessionFactory.openSession();
//        List<Category> cs = session.selectList("listCategory");
//        for (Category c : cs) {
//            List<Product> ps=c.getProducts();
//            for (Product p :
//                    ps) {
//                System.out.println(c+" "+p);
//            }
//        }
//        List<Product> ps=session.selectList("listProduct");
//        for (Product p : ps) {
//            System.out.println(p.getCategory());
//        }
        List<Order> os = session.selectList("listOrder");
        for (Order o : os) {
            System.out.println(o.getCode());
            List<OrderItem> ois = o.getOrderItems();
            for (OrderItem oi : ois) {
                System.out.format("\t%s\t%f\t%d%n", oi.getProduct().getName(), oi.getProduct().getPrice(), oi.getNumber());
            }
        }


        session.commit();
        session.close();

    }

    @GetMapping("/newmy3")
    public void test4() {
        SqlSession session = sqlSessionFactory.openSession();

//        List<Product> pl=session.selectList("listProduct2");
//        for (Product p : pl) {
//            System.out.println(p);
//        }
//        Map<String,Object> params = new HashMap<>();
//        params.put("name","a");
//        List<Product> ps2 = session.selectList("listProduct2",params);
//        for (Product p : ps2) {
//            System.out.println(p);
//        }


        System.out.println("多条件查询");
        Map<String, Object> params = new HashMap<>();
//        params.put("name","a");
        params.put("price", "10");
        List<Product> ps2 = session.selectList("listProduct2", params);
        for (Product p : ps2) {
            System.out.println(p);
        }
        Product p = new Product();
        p.setId(6);
        p.setName("product zz");
        p.setPrice(99.99f);
        session.update("updateProduct", p);

        session.commit();
        session.close();

    }

    @GetMapping("/newmy5")
    public void test5() {
        SqlSession session = sqlSessionFactory.openSession();
        CategoryMapper mapper = session.getMapper(CategoryMapper.class);
        add(mapper);
        delete(mapper);
        get(mapper);
        update(mapper);
        listAll(mapper);

        session.commit();
        session.close();


    }
    private static void update(CategoryMapper mapper) {
        Category c= mapper.get(1);
        c.setName("修改了的Category名稱");
        mapper.update(c);
        listAll(mapper);
    }

    private static void get(CategoryMapper mapper) {
        Category c= mapper.get(1);
        System.out.println(c.getName());
    }

    private static void delete(CategoryMapper mapper) {
        mapper.delete(2);
        listAll(mapper);
    }

    private static void add(CategoryMapper mapper) {
        Category c = new Category();
        c.setName("新增加的Category");
        mapper.add(c);
        listAll(mapper);
    }

    private static void listAll(CategoryMapper mapper) {
        List<Category> cs = mapper.list();
        for (Category c : cs) {
            System.out.println(c.getName());
        }
    }


}
