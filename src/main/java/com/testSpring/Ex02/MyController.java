package com.testSpring.Ex02;

//import java.io.UnsupportedEncodingException;
//import java.net.URLDecoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	//경로상의 변수(PATH Variable)를 받아와 View에 전달 한다.
	/*
	 * @RequestMapping 어노테이션 값으로 {템플릿변수} 를 사용
	 * 1) @PathVariable 어노테이션을 이용해서 {템플릿 변수} 와 동일한 이름을 갖는 파라미터를 추가
	 * 2) RequestMapping 어노테이션에 변수를 포함
	 * 3) 이들 변수는 @PathVariable 어노테이션이 적용된 동일한 이름을 갖는 파라미터에 매핑
	 *
	 * null이나 공백값이 들어가는 parameter라면 적용하지 말도록!
	 * Spring 에서 @PathVariable 사용하여 값을 넘겨받을때 값에 . 가 포함되어 있으면 .포함하여 그뒤가 잘려서 들어온다
	 */
	@RequestMapping("/person/{personName}")
//	public String getPerson(@PathVariable String personName, Model model) throws UnsupportedEncodingException {
	public String getPerson(@PathVariable("personName") String personName, Model model) {

		//URL 한글 입력 처리
//		URLDecoder.decode(URLDecoder.decode(personName, "8859_1"), "UTF-8");
		System.out.println(personName);
		model.addAttribute("personInfo", personName);

		// 아래의 URL주소를 호출하여 확인 ---> 홍길동 출력
		// http://localhost:9090/Ex02/person/홍길동
		return ("person/personInfo");
	}//getPerson()
}
