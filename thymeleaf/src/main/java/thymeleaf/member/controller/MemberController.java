package thymeleaf.member.controller;

import org.springframework.boot.json.JsonWriter.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import thymeleaf.exam.dto.User;
import thymeleaf.user.controller.UserService;


@Controller
public class MemberController {

    private final UserService userService;

    public MemberController(UserService userService) {
        this.userService = userService;
    }

    
    @PostMapping("/member/addMember")
    public String addMember(Member member) {
    	
    	Member memberInfo = 
    	
    	System.out.println("회원가입 폼에서 입력한 데이터 : " + member);
    	
    	return "redirect:/";
    }
    
    
    @GetMapping("/member/{userId}")
    public String getMemberDetail(@PathVariable String userId, Model model) {
        User userInfo = userService.getUserInfoById(userId); 
        model.addAttribute("memberInfo", userInfo);
        model.addAttribute("title", "회원 상세 정보");
        return "member/memberDetail";
    }
}