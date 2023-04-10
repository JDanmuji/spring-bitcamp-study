package user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import user.bean.UserDTO;

public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO { //extends JdbcDaoSupport implements UserDAO {
	
	
//
//	@Override
//	public void write(UserDTO userDTO) {
//		String sql = "insert into usertable values(?, ?, ?)";
//		
//		//insert + update
//		JdbcTemplate.update(sql,userDTO.getName()  , userDTO.getId(), userDTO.getPwd());
//	}
//
//	@Override
//	public List<UserDTO> getUserList() {
//		String sql = "select * from usertable";
//
//		return JdbcTemplate.query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
//	}
//	
	
	
//	@Override
//	public void write(UserDTO userDTO) {
//		String sql = "insert into usertable values(?, ?, ?)";
//		
//		//insert + update
//		getJdbcTemplate().update(sql,userDTO.getName()  , userDTO.getId(), userDTO.getPwd());
//	}
//
//	@Override
//	public List<UserDTO> getUserList() {
//		String sql = "select * from usertable";
//
//		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
//	}
	
	                                                                                                    
    @Override                                                                                           
    public void write(UserDTO userDTO) {                                                                
    	String sql = "insert into usertable values(:name, :id, :pwd)";                                           
    	                                  
    	Map<String, String> map = new HashMap<String, String>();
    	map.put("name", userDTO.getName());
    	map.put("id", userDTO.getId());
    	map.put("pwd", userDTO.getPwd());
    	//insert + update                                                                               
    	//getNamedParameterJdbcTemplate().update(sql, map);           
    	getNamedParameterJdbcTemplate().update(sql, map);           
    }                                                                                                   
                                                                                                        
    @Override                                                                                           
    public List<UserDTO> getUserList() {                                                                
    	String sql = "select * from usertable";                                                         
          
    	return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));         
    }

	@Override
	public UserDTO getUser(String id) {
		String sql = "select * from usertable where id=?";
		
		try {
			
			//데이터가 존재하지 않는 경우 Exception 뱉음
			return getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class) ,id);
			
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		
		
	}

	@Override
	public void update(Map<String, String> map) {
		String sql = "update usertable set name=:name, pwd=:pwd where id = :id";                                           
        
    	getNamedParameterJdbcTemplate().update(sql, map);     
		
	}

	@Override
	public void delete(Map<String, String> map) {
		String sql = "delete from usertable where id = :id";                                           
        
    	//getNamedParameterJdbcTemplate().update(sql, map);
		getJdbcTemplate().update(sql, map);
	}    

}

                                                                                                        