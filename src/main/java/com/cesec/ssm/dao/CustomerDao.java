package com.cesec.ssm.dao;

import com.cesec.ssm.pojo.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 功能  []
 *
 * @author：梁洋 on 2019/7/11 0011 00:25
 * 邮箱：m18513333561@163.com
 */
public interface CustomerDao {

    /**
     * 查询所有客户列表
     * @return
     */
    List<Customer> getCustomerList();

    /**
     * 查询用户
     * @param id
     * @return
     */
    Customer getCustomerById(Long id);

}
