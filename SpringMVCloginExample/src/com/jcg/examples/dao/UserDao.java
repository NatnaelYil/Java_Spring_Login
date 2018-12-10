package com.jcg.examples.dao;

import java.sql.SQLException;


public interface UserDao
{
		public boolean isValidUser(String username, String password) throws SQLException;
}
