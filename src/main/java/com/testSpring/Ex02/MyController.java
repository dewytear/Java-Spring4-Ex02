package com.testSpring.Ex02;

//import java.io.UnsupportedEncodingException;
//import java.net.URLDecoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	//경로상의 변수를 받아와 View에 전달 한다.
	@RequestMapping("/person/{personName}")
//	public String getPerson(@PathVariable String personName, Model model) throws UnsupportedEncodingException {
	public String getPerson(@PathVariable String personName, Model model) {

		//URL 한글 입력 처리
//		URLDecoder.decode(URLDecoder.decode(personName, "8859_1"), "UTF-8");
		System.out.println(personName);
		model.addAttribute("personInfo", personName);

		return ("person/personInfo");
	}//getPerson()
}
