package com.mucfc.test;

import java.io.IOException;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mucfc.model.BankMapper;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
		SqlSession sqlSesion = sqlSessionFactory.openSession();
		BankMapper bankMapper = sqlSesion.getMapper(BankMapper.class);
	}

}
