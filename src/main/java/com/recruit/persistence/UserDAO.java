package com.recruit.persistence;

import java.util.Date;
import java.util.List;

import com.recruit.domain.BoardVO;
import com.recruit.domain.UserVO;
import com.recruit.dto.LoginDTO;

public interface UserDAO {

	public UserVO read(String uid) throws Exception;
	public List<UserVO> listAll() throws Exception;
	public BoardVO login(LoginDTO dto)throws Exception;
	public void keepLogin(String id, String sessionId, Date next);
	public BoardVO checkUserWithSessionKey(String value);	

}
