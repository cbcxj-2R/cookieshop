package service;

import java.sql.SQLException;
import java.util.List;

import dao.UserDao;
import model.User;

public class UserService {
	private UserDao dao=new UserDao();
	private String username;
	
	//����
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
	//ע�ᣬ��ӿͻ�
	public boolean regist(User user) {
		//Ҫ�û���������ҪΨһ
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
	//�����û����Ƿ����
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
	//����email�Ƿ����
	public boolean isExistEmail(String email) {
		boolean flag=false;
		
		return flag;
	}
	//�޸�����
	public boolean modifyPassword(User user) {
		boolean flag=false;
		return flag;
	}
	//�޸��ջ���ַ
	public boolean modifyaddress(User user) {
		boolean flag=false;
		return flag;
	}
	//��������
	public boolean resetPassword(User user) {
		boolean flag=false;
		return flag;
	}
	//ɾ���û�
	public boolean deleteUser(User user) {
		boolean flag=false;
		return flag;
	}
	//�޸�
	public boolean dmodifyUser(User user) {
		boolean flag=false;
		return flag;
	}
	//��ҳ
	

}
