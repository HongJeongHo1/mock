package thymeleaf.exam.dto;

import java.security.PrivateKey;

public class User {

	


	private String userId;
	private String userPw;
	private String UserName;
	private String UserGrade;
	private String UserEmail;
	private String UserMobile;
	


	public User() {}
	
	
	public User(String userId, String userPw, String userName, String userGrade, String userEmail, String userMobile) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		UserName = userName;
		UserGrade = userGrade;
		UserEmail = userEmail;
		UserMobile = userMobile;
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getUserMobile() {
		return UserMobile;
	}
	public void setUserMobile(String userMobile) {
		UserMobile = userMobile;
	}
	
	
	public String getUserGrade() {
		return UserGrade;
	}


	public void setUserGrade(String userGrade) {
		UserGrade = userGrade;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userId=");
		builder.append(userId);
		builder.append(", userPw=");
		builder.append(userPw);
		builder.append(", UserName=");
		builder.append(UserName);
		builder.append(", UserGrade=");
		builder.append(UserGrade);
		builder.append(", UserEmail=");
		builder.append(UserEmail);
		builder.append(", UserMobile=");
		builder.append(UserMobile);
		builder.append("]");
		return builder.toString();
	}
	

	
}
