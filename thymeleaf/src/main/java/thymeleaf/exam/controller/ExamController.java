package thymeleaf.exam.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import thymeleaf.exam.dto.User;
import thymeleaf.exam.service.ExamService;


/* @ (애노테이션) : 컴파일러한테 정보를 전달해주는 키워드 */
/**
 * @controller : 클라이언트 주소 요청과 응답을 수행하는 계층
 */

@Controller
@RequestMapping("/exam")
public class ExamController {

	/**
	 * DI(Dependency Injection) : 의존성주입
	 * 1. 필드 주입방식
	 * @Autowired
	 * private ExamService examService;
	 * 2. 수정자 메소드 주입방식
	 * private ExamService examService;
	 * @AutoWired
	 *public void setExamService(ExamService examService) {
		this.examService = examService;
	}
	 * 3. 생성자 메소드 주입방식
	 * 순환참조 방지
	 * 
	 * 
	 */
	
	// final = 불변
	//인자를 한번만 사용하기 위해 final 사용
	private final ExamService examService;
	
	public ExamController(ExamService examService) {
		//examService 받음
		this.examService = examService;
		
	}
	
	
	
	@GetMapping("/exam7")
	public String exam7(Model model) {
		
		model.addAttribute("title", "exam7");
		
		return "exam/exam7";
	}
	
	
	
	
	@GetMapping("/exam6")
	public String exam6(Model model) {
		
		List<User> userList = examService.getUserList();
		
		model.addAttribute("title", "exam6");
		model.addAttribute("userList", userList);
		model.addAttribute("emptyList", new ArrayList<String>());
		model.addAttribute("nullList", null);
		model.addAttribute("now", new Date());
		model.addAttribute("price", 123456789);
		
		return "exam/exam6";
	}
	
	
	
	@GetMapping("/exam5")
	public String exam5(Model model) {
		User userInfo = examService.getUserInfo();
		List<User> userList = examService.getUserList();
		model.addAttribute("title", "exam5");
		model.addAttribute("userInfo", userInfo);
		model.addAttribute("userList", userList);
		
		
		return "exam/exam5";
		
		
	}
	
	
	
	
	@GetMapping("/exam4")
	public String exam4(Model model) {
		User userInfo = examService.getUserInfo();
		List<User> userList = examService.getUserList();
		model.addAttribute("title", "exam4");
		model.addAttribute("userInfo", userInfo);
		model.addAttribute("userList", userList);
		return "exam/exam4";
		
		
	}
	
	
	
	@GetMapping("/exam3")
	public String exam3(Model model){
		User userInfo = examService.getUserInfo();
		List<User> userList = examService.getUserList();
		model.addAttribute("title", "exam3");
		model.addAttribute("userInfo", userInfo);
		model.addAttribute("userList", userList);
		return "exam/exam3";
	}
	
	@GetMapping("/exam2")
	public String exam2(Model model) {
		var userList = examService.getUserList();
		model.addAttribute("title", "exam2");
		model.addAttribute("userList", userList);
		
		return "exam/exam2";
	}
	
	
	

		@GetMapping("/exam1")
		public String exam1(Model model) {
			
			//인터페이스로 구현한 클래스 객체 생성
//			ExamService examService = new ExamServiceImpl2();
			
			
			User userInfo = examService.getUserInfo();
//			System.out.println(examService);
			System.out.println(userInfo);
			

			//exam을 title에 집어넣음 
			model.addAttribute("title", "exam1");
			//userInfo 배열을 userInfo에 집어넣음
			model.addAttribute("userInfo", userInfo);
			
			//html 파일 return
			return "exam/exam1";
		}
	
	
	
}
