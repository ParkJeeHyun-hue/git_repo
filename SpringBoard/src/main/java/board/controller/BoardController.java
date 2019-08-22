package board.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import board.bean.BoardDTO;
import board.dao.BoardDAO;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;
	
	//목록보기 작성
	@RequestMapping(value="/board/boardList.do")
	public ModelAndView boardList(HttpServletRequest request) {
		
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		
		int pg = Integer.parseInt(request.getParameter("pg"));
		int endNum = pg*5;
		int startNum = endNum-4;
		List<BoardDTO> list = boardService.boardList(startNum,endNum);
		
		//==>5개씩 끊어서 목록 보여주기!(1,5),(6,10),
		/*페이징 처리(목록은 5줄씩 페이지는 3개씩 끊어서 보여주기)
		기본적으로 필요한 데이터 : 총 페이지수가 필요함. 총 페이지수= (총글수+4)/5 
		총글수 : 12
		총페이지수 : 3개 [1][2][3]
				
		총글수 : 23
		총페이지수 : 5개 [1][2][3][4]
		
		*/
		int totalA = boardService.getTotalA();//총글수
		int totalP = (totalA+4)/5;
		/*페이지는 3개씩 끊어서 보여줌
		  총 페이지수 : 8
		  	[1][2][3][다음]
		[이전][4][5][6][다음]
		[이전][7][8]*/
		int startPage = (pg-1)/3*3+1;
		int endPage = startPage +2;
		if(totalP <endPage) endPage = totalP;
		
		//ModelAndView = 공유데이터 저장 + view 처리 파일 이름 저장
		//화면 네비게이션
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pg",pg);
		modelAndView.addObject("list",list);
		modelAndView.addObject("startPage", startPage);
		modelAndView.addObject("endPage", endPage);
		modelAndView.addObject("totalP",totalP);
		modelAndView.setViewName("boardList.jsp");
		return modelAndView;
	}
	@RequestMapping(value="/board/boardModifyForm.do")
	public ModelAndView boardModifyForm(HttpServletRequest request) {
		
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int seq = Integer.parseInt(request.getParameter("seq"));
		int pg = Integer.parseInt(request.getParameter("pg"));
		//BoardDAO boardDAO = new BoardDAO();
		BoardDTO boardDTO =boardService.selectOne(seq);
	
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("seq",seq);
		modelAndView.addObject("pg",pg);
		modelAndView.addObject("boardDTO",boardDTO);
		modelAndView.setViewName("boardModifyForm.jsp");
		return modelAndView;
		
	}
	@RequestMapping(value="/board/boardModify.do")
	public ModelAndView boardModify(HttpServletRequest request) {
		System.out.println("boardModify.do 진입확인용");
	 	try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	String subject = request.getParameter("subject");
	 	String content = request.getParameter("content");
	 	int seq=Integer.parseInt(request.getParameter("seq"));
	 	String pg = request.getParameter("pg");
	 	System.out.println("seq="+seq);
	 	System.out.println("pg="+seq);
	 	//DB처리
	 	BoardDTO boardDTO = new BoardDTO();
	 	boardDTO.setSubject(subject);
	 	boardDTO.setContent(content);
	 	boardDTO.setSeq(seq);
	 	//BoardDAO boardDAO = new BoardDAO();
	 	
	 	int su = boardService.boardmodify(boardDTO);
	 
	 	System.out.println("1 seq=" +seq);
	 	System.out.println("1 pg=" +pg);
		ModelAndView modelAndView = new ModelAndView();
		//데이터 공유
		modelAndView.addObject("pg",pg);
		modelAndView.addObject("seq",seq);
		modelAndView.addObject("su",su);
		modelAndView.addObject("boardDTO",boardDTO);
		modelAndView.setViewName("boardModify.jsp");
		return modelAndView;
		
	}
	@RequestMapping(value="/board/boardView.do")
	public ModelAndView boardView(HttpServletRequest request) {
		int seq = Integer.parseInt(request.getParameter("seq"));
		int pg = Integer.parseInt(request.getParameter("pg"));
		
		//BoardDAO boardDAO = new BoardDAO();
		//조회수 증가
		boardService.updateHit(seq);
		BoardDTO boardDTO = boardService.selectOne(seq);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pg",pg);
		System.out.println("pg="+pg);
		modelAndView.addObject("seq",seq);
		System.out.println("seq="+seq);
		modelAndView.addObject("boardDTO", boardDTO);
		modelAndView.setViewName("boardView.jsp");
		return modelAndView;
		
	}
	@RequestMapping(value="/board/boardWrite.do")
	public ModelAndView boardWrite(HttpServletRequest request) {
		System.out.println("boardWrite.do 진입 확인용");
	 	try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = request.getSession();
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		String name = (String)session.getAttribute("memName");
		String id = (String)session.getAttribute("memId");//나중에 써야하므로 미리 작업하기
		
		//DB처리--변수가 7개라고 해서 모든것을 다 쓸 필요는 없다. 
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setId(id);
		boardDTO.setName(name);
		boardDTO.setSubject(subject);
		boardDTO.setContent(content);
		
		//BoardDAO boardDAO = new BoardDAO();
		int su = boardService.write_board(boardDTO);
		modelAndView.addObject("su",su);
		modelAndView.addObject("subject",subject);
		modelAndView.addObject("content",content);
		modelAndView.setViewName("boardWrite.jsp");		
		return modelAndView;
		
	}
	@RequestMapping(value="/board/boardWriteForm.do")
	public ModelAndView boardWriteForm(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("boardWriteForm.jsp");
		return modelAndView;
		
	}
	@RequestMapping(value="/board/boardDelete.do")
	public ModelAndView boardDelete(HttpServletRequest request) {
		int pg = Integer.parseInt(request.getParameter("pg"));
		int seq = Integer.parseInt(request.getParameter("seq"));
		// DB
		//BoardDAO boardDAO = new BoardDAO();
		int su = boardService.boardDelete(seq);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pg",pg);
		System.out.println("pg="+pg);
		modelAndView.addObject("seq",seq);
		System.out.println("seq="+seq);
		modelAndView.addObject("su",su);
		System.out.println("su="+su);
		modelAndView.setViewName("boardDelete.jsp");
		return modelAndView;
		
	}
}
