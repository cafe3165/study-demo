package com.studydemo.demo.DAO;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Author:cafe3165
 * Date:2020-04-18
 */
//@Repository
//@Transactional(rollbackFor = Exception.class)
public interface AccountDao {
    public void moveIn(@Param("id") int id, @Param("money") float money) ; // 转入

    public void moveOut(@Param("id") int id, @Param("money") float money); // 转出
}
