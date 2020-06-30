package com.studydemo.demo.Service;

import com.studydemo.demo.DAO.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Author:cafe3165
 * Date:2020-04-18
 */
@Service

public class AccountServiceImpl implements AccountService {
    @Autowired
//    @Resource
    private AccountDao accountDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transfer(int outter, int inner, Integer money) {
        accountDao.moveOut(outter, money);
        //转出
//        System.exit(0);
//        int i = 1 / 0;
        accountDao.moveIn(inner, money);
        //转入
    }
}
