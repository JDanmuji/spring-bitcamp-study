package user.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;


@Service
@Scope("prototype")
public class UserInsertService implements UserService {

	@Autowired
	private UserDTO userDTO =  null;
	
	@Autowired
	private UserDAO userDAO =  null;
	
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = scan.next();
		System.out.println("아이디 입력 : ");
		String id = scan.next();
		System.out.println("비밀번호 입력 : ");
		String pwd = scan.next();
	
		userDTO.setName(name);
		userDTO.setId(id);
		userDTO.setPwd(pwd);
		
		userDAO.write(userDTO);
	
		System.out.println(name + " 님의 데이터를 저장하였습니다.");
	}

}