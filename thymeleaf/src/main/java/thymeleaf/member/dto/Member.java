package thymeleaf.member.dto;

public class Member {


	

	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberGrade;
	private String memberEmail;

	
	
	
	
	
	

	public Member(String memberId, String memberPw, String memberName, String memberGrade, String memberEmail) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberGrade = memberGrade;
		this.memberEmail = memberEmail;
	}
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberGrade() {
		return memberGrade;
	}
	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [memberId=");
		builder.append(memberId);
		builder.append(", memberPw=");
		builder.append(memberPw);
		builder.append(", memberName=");
		builder.append(memberName);
		builder.append(", memberGrade=");
		builder.append(memberGrade);
		builder.append(", memberEmail=");
		builder.append(memberEmail);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
