package thymeleaf.user.controller;

import org.springframework.stereotype.Service;

import thymeleaf.exam.dto.User;

@Service
public interface UserService {
	 User getUserInfoById(String userId);

}
