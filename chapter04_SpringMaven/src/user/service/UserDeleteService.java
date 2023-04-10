package user.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserDeleteService implements UserService {

	@Autowired
	private UserDAO userDAO = null;
	/* 생성된 빈들 중에서 userDTO을 찾아서 자동으로 매핑 */
	
	@Override
	public void execute() {
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("삭제 할 아이디 입력 : ");
		String id = scanner.next();
		
		//DB
		UserDTO userDTO = userDAO.getUser(id);
		
		if (userDTO == null) {
			System.out.println("찾고자 하는 아이디가 없습니다.");
			return;
		}
		
		
		
		
		userDAO.delete(id);
		
		System.out.println("DB 내용을 삭제했습니다.");
		
	}

}
