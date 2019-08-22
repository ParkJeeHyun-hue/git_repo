package member.controller;


import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import member.bean.MemberDTO;;

@Controller
public class MemberController{
	@Autowired
	private MemberService memberService;
	@RequestMapping(value="/member/checkID.do")
	public ModelAndView checkID(HttpServletRequest request, HttpServletResponse response) {
		
		String id=request.getParameter("id");
		//DB처리
		//MemberDAO memberDAO = new MemberDAO();
		boolean exist = memberService.isExistID(id);
		
		//데이터 공유
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("id",id);
		modelAndView.addObject("exist",exist);
		modelAndView.setViewName("../member/checkID.jsp");
		return modelAndView;
		
	}
	@RequestMapping(value="/member/delete.do")
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String memId=(String)session.getAttribute("memId");
		//MemberDAO memberDAO =new MemberDAO();
		int su =memberService.delete(memId);
		session.removeAttribute("memName");
		session.removeAttribute("memId");	
		session.invalidate(); //무효화, 전부삭제
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("su",su);
		modelAndView.setViewName("delete.jsp");
		return modelAndView;
		
		
	}
	@RequestMapping(value="/member/deleteForm.do")
	public ModelAndView deleteForm(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("deleteForm.jsp");
		return modelAndView;
		
	}
	@RequestMapping(value="/member/login.do")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("login.do 진입확인용");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		ModelAndView modelAndView  =new ModelAndView();
		modelAndView.addObject("id",id);
		modelAndView.addObject("pwd",pwd);
		String name=memberService.login(id,pwd);
		modelAndView.addObject("name",name);
		System.out.println("id="+id);
		System.out.println("pwd="+pwd);
		System.out.println("name="+name);
		if(name!=null){//로그인이 성공하면! loginOK
			HttpSession session = request.getSession();
			session.setAttribute("memName", name);
			session.setAttribute("memId",id);
			modelAndView.setViewName("../member/loginOk.jsp");
		}
		else{//로그인에 실패하면!
			modelAndView.setViewName("../member/loginFail.jsp");
		}
		return modelAndView;
	}
	@RequestMapping(value="/member/loginFail.do")
	public ModelAndView loginFail(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("../member/loginFail.jsp");
		return modelAndView;
		
	}
	@RequestMapping(value="/member/loginForm.do")
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("../member/loginForm.jsp");
		return modelAndView;
	}
	@RequestMapping(value="/member/loginOK.do")
	public ModelAndView loginOK(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("../member/loginOK.jsp");
		return modelAndView;
	}
	@RequestMapping(value="/member/logout.do")
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = request.getSession();
		session.removeAttribute("memName");
		session.removeAttribute("memId");
		session.invalidate(); //무효화, 전부삭제
		modelAndView.setViewName("../member/logout.jsp");
		return modelAndView;
		
		
	}
	@RequestMapping(value="/member/memberList.do")
	public ModelAndView memberList(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		//MemberDAO memberDAO = new MemberDAO();
		
		int pg = Integer.parseInt(request.getParameter("pg"));
		//==>5개씩 끊어서
		//(1,5) (6,10),,,
		int endNum=pg*5;
		int startNum=endNum-4;
		List<MemberDTO> list =memberService.selectList(startNum,endNum);
		int totalMember = memberService.totalMember();//총 회원수
		int totalMemberP = (totalMember+4)/5;
		int startPage = (pg-1)/3*3+1;
		int endPage=startPage+2;
		if(totalMemberP <endPage) endPage = totalMemberP;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pg",pg);
		modelAndView.addObject("endNum",endNum);
		modelAndView.addObject("startNum",startNum);
		modelAndView.addObject("list",list);
		modelAndView.addObject("totalMember",totalMember);
		modelAndView.addObject("totalMemberP",totalMemberP);
		modelAndView.addObject("startPage",startPage);
		modelAndView.addObject("endPage",endPage);
		modelAndView.setViewName("../member/memberList.jsp");
		
		return modelAndView;
		
		
	}
	@RequestMapping(value="/member/modify.do")
	public ModelAndView modify(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String gender = request.getParameter("gender");	
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String TEL1 = request.getParameter("TEL1");
		String TEL2 = request.getParameter("TEL2");
		String TEL3 = request.getParameter("TEL3");
		String addr = request.getParameter("addr");
		
		//DB처리
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setName(name);
		System.out.println("name="+name);
		memberDTO.setId(id);
		System.out.println("id="+id);
		memberDTO.setPwd(pwd);
		memberDTO.setGender(gender);
		memberDTO.setEmail1(email1);
		memberDTO.setEmail2(email2);
		memberDTO.setTel1(TEL1);
		memberDTO.setTel2(TEL2);
		memberDTO.setTel3(TEL3);
		memberDTO.setAddr(addr);

		//MemberDAO memberDAO =new MemberDAO();

		int su =memberService.modify(memberDTO);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("memberDTO",memberDTO);
		modelAndView.addObject("su",su);
		System.out.println("su="+su);
		modelAndView.setViewName("modify.jsp");
		return modelAndView;
		
		
	}
	@RequestMapping(value="/member/modifyForm.do")
	public ModelAndView modifyForm(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession session = request.getSession();
		String memId=(String)session.getAttribute("memId");
		//MemberDAO memberDAO = new MemberDAO();
		MemberDTO id=memberService.selectOne(memId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("id",id);
		modelAndView.setViewName("modifyForm.jsp");
		return modelAndView;
		
		
	}
	@RequestMapping(value="/member/write.do")
	public ModelAndView write(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("write.do 진입 확인용");
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String gender = request.getParameter("gender");	
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String TEL1 = request.getParameter("TEL1");
		String TEL2 = request.getParameter("TEL2");
		String TEL3 = request.getParameter("TEL3");
		String addr = request.getParameter("addr");
		
		//DB처리
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setName(name);
		memberDTO.setId(id);
		memberDTO.setPwd(pwd);
		memberDTO.setGender(gender);
		memberDTO.setEmail1(email1);
		memberDTO.setEmail2(email2);
		memberDTO.setTel1(TEL1);
		memberDTO.setTel2(TEL2);
		memberDTO.setTel3(TEL3);
		memberDTO.setAddr(addr);
		
		//MemberDAO memberDAO =new MemberDAO();
		int su = memberService.write(memberDTO);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("memberDTO",memberDTO);
		modelAndView.addObject("su",su);
		modelAndView.setViewName("write.jsp");
		return modelAndView;
		
		
	}
	@RequestMapping(value="/member/writeForm.do")
	public ModelAndView writeForm(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("writeForm.jsp");
		return modelAndView;
		
		
	}

}
