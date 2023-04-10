package user.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserUpdateService implements UserService {

	@Autowired
	private UserDAO userDAO = null;
	

	@Override
	public void execute() {
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수정 할 아이디 입력 : ");
		String id = scanner.next();
		
		//DB
		UserDTO userDTO = userDAO.getUser(id);
		System.out.println(userDTO.getName() + "\t" + userDTO.getId() + "\t"  + userDTO.getPwd()); 
		
		if (userDTO == null) {
			System.out.println("찾고자 하는 아이디가 없습니다.");
			return;
		}
		
		System.out.println();
		System.out.print("수정 할 이름 입력 : ");
		String name = scanner.next();
		System.out.print("수정 할 비밀번호 입력 : ");
		String pwd = scanner.next();
		
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("id", id);
		map.put("pwd", pwd);
		
		userDAO.update(map);

	}

	
}
