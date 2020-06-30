package com.studydemo.demo.Service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * Author:cafe3165
 * Date:2020-04-18
 */
//@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public interface AccountService {
    //转账
     public void transfer(int outter,int inner,Integer money);
}
