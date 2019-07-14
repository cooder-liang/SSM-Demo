package com.cesec.ssm.service;

import com.cesec.ssm.pojo.Customer;
import org.springframework.stereotype.Service;

/**
 * 功能  []
 *
 * @author：梁洋 on 2019/7/11 0011 00:34
 * 邮箱：m18513333561@163.com
 */
public interface CustomerService {

    Customer getCustomerById(Long id);

}
