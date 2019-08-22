package guestbook.controller;



import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import guestbook.bean.GuestbookDTO;

@Controller
public class GuestbookController {
	@Autowired
	private GuestbookService guestbookService;
	@RequestMapping(value="/guestbook/guestbookWriteForm.do")
	public ModelAndView guestbookWriteForm(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("display","../guestbook/guestbookWriteForm.jsp");
		modelAndView.setViewName("/main/section.jsp");
		
		return modelAndView;
	}
	@RequestMapping(value="/guestbook/guestbookWrite.do")
	public ModelAndView guestbookWrite(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("guestbook/guestbookWrite 진입 확인용");
		  try {
		         request.setCharacterEncoding("UTF-8");
		      } catch (UnsupportedEncodingException e) {
		         e.printStackTrace();
		      }
		 String name = request.getParameter("name");
		 String email = request.getParameter("email");
		 String title = request.getParameter("title");
		 String content = request.getParameter("content");
		 String logtime = request.getParameter("logtime");
		 
		 //디비작업
		 GuestbookDTO guestbookDTO = new GuestbookDTO();
		 guestbookDTO.setName(name);
		 guestbookDTO.setEmail(email);
		 guestbookDTO.setTitle(title);
		 guestbookDTO.setContent(content);
		 guestbookDTO.setLogtime(logtime);
		 
		 int result=0;
		 result = guestbookService.write_guestbook(guestbookDTO);
		 
		 //데이터공유
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.addObject("result",result);
		 System.out.println("result="+result);
		 modelAndView.addObject("display","../guestbook/guestbookWrite.jsp");
		 modelAndView.setViewName("/main/section.jsp");
		 
		 return modelAndView;	 
	}
	//방명록 목록 처리
	@RequestMapping(value="/guestbook/guestbookList.do")
	public ModelAndView guestbookList(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("방명록 목록");
		
		//1) 데이터 처리
		int pg=Integer.parseInt(request.getParameter("pg"));
		int endNum=pg*10;
		int startNum =endNum-9;
		
		//2)DB처리
		List<GuestbookDTO> list
		=guestbookService.getguestbookList(startNum, endNum);
		//목록얻기(10줄)
		int totalA = guestbookService.guestbookListCount();//총 방명록수
		int totalP=(totalA+9)/10;
		
		//페이징데이터 얻기
		int startPage = (pg-1)/3*3+1;
		int endPage = startPage+2;
		if(totalP<endPage) endPage=totalP;
		
		//데이터 공유처리
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("list",list);
		modelAndView.addObject("startPage", startPage);
		modelAndView.addObject("endPage", endPage);
		modelAndView.addObject("totalP", totalP);
		modelAndView.addObject("pg",pg);
		System.out.println("pg="+pg);
		modelAndView.addObject("display","../guestbook/guestbookList.jsp");
		modelAndView.setViewName("/main/section.jsp");
		//4)화면 네비게이션
		return modelAndView;
	}

}
