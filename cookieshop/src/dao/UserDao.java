package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import model.User;
import utils.C3P0Utils;
import utils.ToolUtils;

public class UserDao {
	
	//多条件组合查询
	public List<User> findUserByParams(User vo) throws SQLException{
		List<User> list = new ArrayList<>();
		
		QueryRunner runner = new QueryRunner(C3P0Utils.getDataSource());
		
		StringBuilder sql = new StringBuilder("select * from user where 1=1");
		
		List params = new ArrayList();
		
		String username = vo.getUsername();
		if(!ToolUtils.isEmpty(username)) {
			sql.append(" and username=?");
			params.add(username);
		}
		
		String email = vo.getEmail();
		if(!ToolUtils.isEmpty(email)) {
			sql.append(" and email=?");
			params.add(email);
		}
		
		String password = vo.getPassword();
		if(!ToolUtils.isEmpty(password)) {
			sql.append(" and password=?");
			params.add(password);
		}
		
		String name = vo.getName();
		if(!ToolUtils.isEmpty(name)) {
			sql.append(" and name like ?");
			params.add("%"+name+"%");
		}
		
		System.out.print(sql.toString());
		
		list = runner.query(sql.toString(), new BeanListHandler<>(User.class),
				params.toArray());
		
		return list;
	}
	
	// 增
	public int addUser(User user) throws SQLException {
		int result = 0;
		QueryRunner runner = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "insert user(username,email,password,name,phone,address,isadmin,isvalidate) "
				+ "values(?,?,?,?,?,?,?,?,?)";
		result = runner.update(sql, user.getUsername(), user.getEmail(),user.getPassword(),
				user.getName(),user.getPhone(),user.getAddress(),user.isIsadmin(),user.isIsvalidate());
		return result;
	}

	// 鍒 
	public int deleteUser(int id) throws SQLException {
		int result = 0;
		QueryRunner runner = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "delete from user where id=?";
		result = runner.update(sql, id);
		return result;
	}

	// 鏀 
	public int updateUser(User user) throws SQLException {
		int result = 0;
		QueryRunner runner = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "update user set username=?,email=?,password=?, "
				+ "name=?,phone=?,address=?,isadmin=?,idvalidate=? "
				+ "where id=?";
		result = runner.update(sql, user.getUsername(),user.getEmail(),
				user.getPassword(), user.getName(),user.getPhone(),
				user.getAddress(),user.isIsadmin(),user.isIsvalidate(),
				user.getId());
		return result;
	}
	
	public User findById(int id) {
		User user = null;
		QueryRunner runner = new QueryRunner(C3P0Utils.getDataSource());
		
		
		return user;
		
	}

	// 鏌 
	public List<User> findAll(int page, int pageSize) throws SQLException {
		List<User> list = new ArrayList<>();
		QueryRunner runner = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from user limit ?,?";
		list = runner.query(sql, new BeanListHandler<>(User.class), (page - 1) * pageSize, pageSize);
		return list;
	}

}
