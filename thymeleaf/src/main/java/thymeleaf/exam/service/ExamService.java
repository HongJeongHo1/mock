package thymeleaf.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import thymeleaf.exam.dto.User;

@Service("examService")
public interface ExamService {

	//회원 정보
	public User getUserInfo();
	
	//회원 목록
	List<User> getUserList();
}
