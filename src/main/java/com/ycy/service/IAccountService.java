package com.ycy.service;

import com.ycy.domain.Account;

import java.util.List;

public interface IAccountService {
    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     */
    public void saveAccount(Account account);
}
