package com.ycy.test;

import com.ycy.dao.IAccountDao;
import com.ycy.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.InputStream;

public class TestMybatis {
    /**
     * test findAll
     * @throws Exception
     */
    @Test
    public void run2() throws  Exception{
        //1.加载mybatis的配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.创建SqlSessionFactory对象，构造者模式
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3.使用工厂创建SqlSession对象，工厂模式
        SqlSession session = factory.openSession();
        //4.获取代理对象，代理模式
        IAccountDao dao = session.getMapper(IAccountDao.class);
        //5.代理对象执行方法
        dao.findAll();

        //6.释放资源
        session.close();
        resourceAsStream.close();

    }

    @Test
    public void run3() throws  Exception{
        //1.加载mybatis的配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.创建SqlSessionFactory对象，构造者模式
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3.使用工厂创建SqlSession对象，工厂模式
        SqlSession session = factory.openSession();
        //4.获取代理对象，代理模式
        IAccountDao dao = session.getMapper(IAccountDao.class);
        //5.代理对象执行方法
        dao.findAll();
        Account account=new Account();
        account.setName("aa");
        account.setMoney(100d);
        dao.saveAccount(account);

        session.commit();//更新需要提交事务

        //6.释放资源
        session.close();
        resourceAsStream.close();

    }
}
