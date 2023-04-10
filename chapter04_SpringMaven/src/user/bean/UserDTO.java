package user.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Scope("prototype")
@Setter
@Getter
public class UserDTO {
	private String name;
	private String id;
	private String pwd;
	
}
