package com.testSpring.Ex02;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostGetEx {

	@RequestMapping("/inputMem")
	public String goInputMem() {
		return "inputForm";
	}

	/*
	 * [Request요청: GET방식, POST방식] Request요청을 보낼때 GET방식으로 하는방법과 POST 방식으로 하는 방법이 있다.
	 *
	 * - 만약 GET, POST 상관없이 Controller의 로직을 수행하게 하고 싶다면,
	 *
	 * @RequestMapping의 method 부분을 지우면 된다.
	 *
	 * - GET방식 (Idempotent) 주로 조회를 할 때에 사용
	 *  = GET은 요청을 전송할 때 필요한 데이터를 Body에 담지 않고, 쿼리스트링을 통해 전송
	 *  = 불필요한 요청을 제한하기 위해 요청이 캐시될 수 있음
	 *  = 헤더에 붙어서 전송이 되기 때문에, 도메인주소를 보면 내가 입력한 값이 노출 됨
	 *   + URL에 요청 파라미터를 가지고 있기 때문에 링크를 걸 때, URL에 파라미터를 사용해 더 디테일하게 페이지를 링크할 수 있다.
	 *
	 * - POST방식 (Non-idempotent) 생성에는 POST, 수정은 PUT 또는 PATCH, 삭제는 DELETE
	 *  = 패킷안에 숨겨져서 전송 됨(HTTP 메세지의 Body에 담아서 전송)
	 *  = GET과 달리 대용량 데이터를 전송 = 요청 헤더의 Content-Type에 요청 데이터의 타입을 표시해야함
	 *
	 * Idempotent(멱등) : 연산의 한 성질을 나타내는 것으로, 연산을 여러 번 적용하더라도 결과가 달라지지 않는 성질
	 */

	@RequestMapping(value = "person", method = RequestMethod.GET)
	public String goPerson(HttpServletRequest request, Model model) {

		String id = request.getParameter("id");
		String name = request.getParameter("name");

		System.out.println("id : " + id);
		System.out.println("name : " + name);

		model.addAttribute("id", id);
		model.addAttribute("name", name);

		return "person/infoMem";
	}//goPerson

	// goPerson 을 오버로딩 (하나의 비지니스 로직 이므로 이름을 같게 해서 사용함)
	// ModelAndView 객체를 리턴 해야하기때문에 ModelAndView로 선언
	@RequestMapping(value = "person", method = RequestMethod.POST)
	public ModelAndView goPerson(HttpServletRequest request) {

		String id = request.getParameter("id");
		String name = request.getParameter("name");

		System.out.println("id : " + id);
		System.out.println("name : " + name);

		//		model.addAttribute("id", id);
		//		model.addAttribute("name", name);

		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("person/infoMem");
		modelView.addObject("id", id);
		modelView.addObject("name", name);

		return modelView;
	}//goPerson

}
