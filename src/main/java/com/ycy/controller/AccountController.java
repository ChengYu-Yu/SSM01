package com.ycy.controller;

import com.ycy.domain.Account;
import com.ycy.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户web层
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;


    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("测试springMVC");
        List<Account> accountList = accountService.findAll();
        System.out.println(accountList);
        model.addAttribute("success",accountList);
        return "success";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        accountService.saveAccount(account);
        httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/account/findAll");

//        return "success";
    }

}
