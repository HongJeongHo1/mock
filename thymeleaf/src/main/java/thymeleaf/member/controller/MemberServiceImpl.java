package thymeleaf.member.controller;
import org.springframework.stereotype.Service;

import thymeleaf.exam.dto.User;


@Service
public class MemberServiceImpl implements MemberService{

	 @Override
	    public User getUserInfoById(String userId) {
	
	        String idnum = userId.substring(4);
	        int userNum = Integer.parseInt(idnum);
	        
	      
	        String[] grade = new String[] {"관리자", "판매자", "구매자"};
	        
	   
	        String userPw = "pw" + String.format("%03d", userNum);
	        String userName = "홍" + String.format("%02d", userNum);
	        String userGrade = grade[(userNum) % grade.length];
	        String userEmail = userName + "@ksmart.or.kr";
	        String userMobile = "010-" + String.format("%04d", userNum) + "-" + String.format("%04d", userNum);
	        
	   
	        User userinfo = new User(userId, userPw, userName, userGrade, userEmail, userMobile);
	        return userinfo;
	 }
}
