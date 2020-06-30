package com.studydemo.demo.DAO;

import com.studydemo.demo.POJO.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

/**
 * Author:cafe3165
 * Date:2020-04-18
 */
@Repository
//@Resource
public class AccountDaoImpl implements AccountDao {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession session = sqlSessionFactory.openSession();

    public AccountDaoImpl() throws IOException {
    }

    @Override
    public void moveIn(int id, float money) {
        Account account=new Account();
        account.setId(id);
        account.setBalance(money);

        session.update("moveIn", account);
        session.commit();
//        session.close();

    }

    @Override
    public void moveOut(int id, float money) {
        Account account=new Account();
        account.setId(id);
        account.setBalance(money);

        session.update("moveOut", account);
        session.commit();
//        session.close();
    }
}
