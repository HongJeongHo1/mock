package thymeleaf.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import thymeleaf.exam.dto.User;

@Service("examService")
public class ExamServiceImpl implements ExamService {

	@Override
	public User getUserInfo() {
	
		return new User("id001", "pw001", "홍01", "판매자" ,"홍01@ksmart.or.kr", "010-0001-0001");
//		
		
	
	}

	@Override
	public List<User> getUserList() {
		
		//등급
		String[] grade = new String[] {"관리자", "판매자", "구매자"};		
		
		
			//새로운 UserArrayList를 userList에 할당함 		
		List<User> userList = new ArrayList<User>();
		
//		빈객체 생성
		User userInfo = null;
		
		// id001~9 //관리자, 판매자, 구매자 ...
		for(int i=1; i<10; i+=1) {
			String userId = "id00" + i;
			String userPw = "pw" + String.format("%03d", i);
			String userName = "홍" + String.format("%02d", i);
			String userGrade = grade[(i-1) % grade.length]; 
			String userEmail = userName + "@ksmart.or.kr";
			String userMobile = "010-" + String.format("%04d", i) + "-" + String.format("%04d", i);
          //			
			
			userInfo = new User(userId, userPw, userName, userGrade, userEmail, userMobile);
			
//			UserInfo가 userLiST에 담김
			userList.add(userInfo);
			
		}
		return userList;
	}

}
