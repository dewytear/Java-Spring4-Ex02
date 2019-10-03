package com.testSpring.Ex02;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate );

		return "home";
	}//home()

	//HttpServletRequest 를 사용하여 Parameter를 받는 방법 예제
	@RequestMapping("member/test1")
	public String test(HttpServletRequest httpServletRequest, Model model) {
		String company = httpServletRequest.getParameter("company");
		String group = httpServletRequest.getParameter("group");
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");

		model.addAttribute("company", company);
		model.addAttribute("group", group);
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		//아래 URL처럼 파라메터 전달하여 확인!
		//http://localhost:9090/Ex02/member/test1?company=test&group=test&id=dewytear&pw=1234567

		return "member/test1";
	}//test()

	//Annotation 을 사용하여 Parameter를 받는방법
	@RequestMapping("member/test2")
	public String test2(@RequestParam("id") String id, @RequestParam("name") String name, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("name", name);

		//아래 URL처럼 파라메터 전달하여 확인!
		//http://localhost:9090/Ex02/member/test2?id=test&name=test2
		return "member/test2";
	}//test2()

	//person class 객체를 Model에 전달하여 view를 호출
	/*
	 * @RequestMapping("member/join")
	 * public String personInfo(@RequestParam("name") String name,
	 * @RequestParam("id") String id,
	 * @RequestParam("address") String address,
	 * @RequestParam("email") String email, Model model) {
	 *
	 * Person person = new Person(); person.setName(name); person.setId(id);
	 * person.setAddress(address); person.setEmail(email);
	 *
	 * model.addAttribute("personInfo", person);
	 *
	 * //http://localhost:9090/Ex02/member/join?name=RONY&id=dewytear&address=seoul&email=dewytear@naver.com
	 * return "member/join"; }
	 */

	//person calss 객체를 바로 전달하여 view를 호출
	@RequestMapping("member/join")
	public String personInfo(Person person) {

		return "member/join";
	}
}
