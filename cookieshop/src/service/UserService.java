package service;

import java.sql.SQLException;
import java.util.List;

import dao.UserDao;
import model.User;

public class UserService {
	private UserDao dao=new UserDao();
	private String username;
	
	//登入
	public User login(String uname,String password) {
		User user=null;
		try {
			User vo=new User();
			vo.setUsername(uname);
			vo.setPassword(password);
			List<User> list=dao.findUserByParams(vo);
			if(list.size()>=1) {
				user=list.get(0);
				return user;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		if(user==null) {
			try {
				User vo=new User();
				vo.setEmail(uname);
				vo.setPassword(password);
				List<User> list=dao.findUserByParams(vo);
				if(list.size()>=1) {
					user=list.get(0);
					return user;
				}
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		
		return user;
	}
	//注册，添加客户
	public boolean regist(User user) {
		//要用户名，邮箱要唯一
		boolean flag=false;
		try {
			int r=dao.addUser(user);
			if(r>0) {
				flag=true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	//查找用户名是否存在
	public boolean isExistUsername(String email) {
		boolean flag=false;
		try {
		User vo=new User();
		vo.setUsername(username);
		List<User> list=dao.findUserByParams(vo);
		if(list.size()>=1) {
			flag=true;
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	//查找email是否存在
	public boolean isExistEmail(String email) {
		boolean flag=false;
		
		return flag;
	}
	//修改密码
	public boolean modifyPassword(User user) {
		boolean flag=false;
		return flag;
	}
	//修改收货地址
	public boolean modifyaddress(User user) {
		boolean flag=false;
		return flag;
	}
	//重置密码
	public boolean resetPassword(User user) {
		boolean flag=false;
		return flag;
	}
	//删除用户
	public boolean deleteUser(User user) {
		boolean flag=false;
		return flag;
	}
	//修改
	public boolean dmodifyUser(User user) {
		boolean flag=false;
		return flag;
	}
	//分页
	

}
