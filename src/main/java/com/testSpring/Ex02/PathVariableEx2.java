package com.testSpring.Ex02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableEx2 {

	/**
	 * Get방식 컨트롤러
	 * @param key1
	 * @param key2
	 **/
	@RequestMapping("/resByGet")
	public void resByGet(String key1, String key2) {

		//http://localhost:9090/Ex02/resByGet?key1=aaa&key2=bbb
		System.out.println("key1 : " + key1);
		System.out.println("key2 : " + key2);
	}

	/**
	 * Get방식 컨트롤러
	 * @param key1
	 * @param key2
	 * @param key3
	 **/
	@RequestMapping("/resByPath/{key1}/{key2}/{key3}")
	public String resByPath(@PathVariable String key1,
							@PathVariable String key2,
							@PathVariable String key3, Model model) {

		// 콘솔창에 출력
		System.out.println("key1 : " + key1);
		System.out.println("key2 : " + key2);
		System.out.println("key3 : " + key3);

		//model 객체에 추가
		model.addAttribute("key1", key1);
		model.addAttribute("key2", key2);
		model.addAttribute("key3", key3);

		// PathVariable로 전달 받은 값 확인
		// http://localhost:9090/Ex02/resByPath/홍길동/문재인/노무현
		return "resByPath/path3";
	}
}
