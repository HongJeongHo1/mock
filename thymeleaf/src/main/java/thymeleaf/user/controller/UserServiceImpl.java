package thymeleaf.user.controller;
import org.springframework.stereotype.Service;

import thymeleaf.exam.dto.User;


@Service
public class UserServiceImpl implements UserService{

	 @Override
	    public User getUserInfoById(String userId) {
	
		 
		 User userInfo = null;
		 if (userId != null && !userId.equals("")) {
		     String[] grade = new String[] {"관리자", "판매자", "구매자"};
		     String pattern = userId.substring(2);
		     int patterNum = Integer.parseInt(pattern);

		     String userPw = "pw" + String.format("%03d", patterNum);
		     String userName = "홍" + String.format("%02d", patterNum);
		     String userGrade = grade[(patterNum-1) % grade.length];
		     String userEmail = userName + "@ksmart.or.kr";
		     String userMobile = "010-" + String.format("%04d", patterNum) + "-" + String.format("%04d", patterNum);

		     userInfo = new User(userId, userPw, userName, userGrade, userEmail, userMobile);
		 }

		 return userInfo;
		
		 
//	        String idnum = userId.substring(4);
//	        int userNum = Integer.parseInt(idnum);
//	        
//	      
//	        String[] grade = new String[] {"관리자", "판매자", "구매자"};
//	        
//	   
//	        String userPw = "pw" + String.format("%03d", userNum);
//	        String userName = "홍" + String.format("%02d", userNum);
//	        String userGrade = grade[(userNum) % grade.length];
//	        String userEmail = userName + "@ksmart.or.kr";
//	        String userMobile = "010-" + String.format("%04d", userNum) + "-" + String.format("%04d", userNum);
	        
	   
//	        User userinfo = new User(userId, userPw, userName, userGrade, userEmail, userMobile);
//	        userinfo.toString();
//	        return userinfo;
	 }
}
