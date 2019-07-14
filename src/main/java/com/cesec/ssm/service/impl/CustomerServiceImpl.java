package com.cesec.ssm.service.impl;

import com.cesec.ssm.dao.CustomerDao;
import com.cesec.ssm.pojo.Customer;
import com.cesec.ssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能  []
 *
 * @author：梁洋 on 2019/7/11 0011 00:36
 * 邮箱：m18513333561@163.com
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer getCustomerById(Long id) {
        return customerDao.getCustomerById(id);
    }
}
