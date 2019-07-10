package com.cesec.ssm.controller;

import com.cesec.ssm.pojo.Customer;
import com.cesec.ssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 功能  []
 *
 * @author：梁洋 on 2019/7/11 0011 00:07
 * 邮箱：m18513333561@163.com
 */
@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customer/list")
    public String showCustomerList() {
        return "customer";
    }

    @RequestMapping("/customer/edit")
    @ResponseBody
    public Customer getCustomerById(Long id) {
        Customer customer = customerService.getCustomerById(id);
        System.out.println(customer);
        return customer;
    }
}
