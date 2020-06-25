package com.ycy.service.impl;

import com.ycy.dao.IAccountDao;
import com.ycy.domain.Account;
import com.ycy.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户的service层实现类
 */
@Service(value = "accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("service层：查询所有账户");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("service层：保存账户");
        accountDao.saveAccount(account);
    }
}
