package thymeleaf.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	/**
	 * @requestMapping : 요청하는 주소와 실행하는 메소드를 매핑해주는 어노테이션
	 * @return
	 */
	
	
	@RequestMapping(method=RequestMethod.GET, path= "/")
	public ModelAndView index() {
		
     //ModelAndView : 화면에 전송할 데이터와 화면의 논리적 경로를 저장하는 객체 		
		ModelAndView mav = new ModelAndView();
		//ks53 thymeleaf를 content에 담음
		mav.addObject("content", "ks dev53 thymeleaf");
		//html파일 지정
		mav.setViewName("index");
		return mav;
	}
}
