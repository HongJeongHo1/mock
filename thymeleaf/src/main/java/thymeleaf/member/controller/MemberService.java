package thymeleaf.member.controller;

import org.springframework.stereotype.Service;


import thymeleaf.exam.dto.User;

@Service
public interface MemberService {
	 public User getUserInfoById(String userId);

}
