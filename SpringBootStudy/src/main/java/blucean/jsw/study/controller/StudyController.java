package blucean.jsw.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import blucean.jsw.study.model.StudyVO;
import blucean.jsw.study.service.StudyService;

@Controller
public class StudyController {
	@Autowired
	StudyService service;
	
	/**
	 * 서버를 시작시키고, /index1 페이지를 호출하면, DB에서 현재 시간조회하여 jsp 화면에 노출
	 *	ex) 현재 시간은 [2019-03-22 18:29:34.277] 입니다.
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping("/index1")
	public @ResponseBody String indexOne() throws Exception {
		return service.indexOne();
	}
	
	/**
	 * /index2 페이지를 호출하면 DB에서 현재시간을 조회하여, json 형태로 리턴 ex) {"time" : "2019-03-22 18:29:34.277"}
	 * @return StudyVO
	 * @throws Exception
	 */
	@RequestMapping("/index2")
	public @ResponseBody StudyVO indexTwo() throws Exception {
		// TestVO 객체 선언
		StudyVO vo = new StudyVO();
				
		// DB에서 쿼리로 현재 시간 값을 가져옴
		String now = service.indexTwo();
		
		// now를 VO에 담기
		vo.setNow(now); 
		
		return vo;
	}
	
	/**
	 *  https://startbootstrap.com/previews/sb-admin/ 를 적용하기. 
	 *  index 페이지를 호출하면, 로그인 페이지 노출.
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String indexLogin() throws Exception {
		return "login";
	}
	
	/**
	 *  https://startbootstrap.com/previews/sb-admin/ 를 적용하기. 
	 *  / 를 호출하면, 메인 페이지 노출.
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() throws Exception {
		return "index";
	}
	
	/**
	 *  https://startbootstrap.com/previews/sb-admin/ 를 적용하기. 
	 *  index 페이지를 호출하면, 메인 페이지 노출.
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public String login() throws Exception {
		return "index";
	}
}
