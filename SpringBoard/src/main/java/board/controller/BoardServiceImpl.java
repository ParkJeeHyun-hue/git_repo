package board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.bean.BoardDTO;
import board.dao.BoardDAO;
@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDAO boardDAO;
	
	public int write_board(BoardDTO boardDTO) {
		
		return boardDAO.write_board(boardDTO);
	}

	@Override
	public List<BoardDTO> boardList(int startNum, int endNum) {
		
		return boardDAO.boardList(startNum, endNum);
	}

	@Override
	public BoardDTO selectOne(int seq) {
		
		return boardDAO.selectOne(seq);
	}

	@Override
	public int getTotalA() {
		
		return boardDAO.getTotalA();
	}

	@Override
	public int updateHit(int seq) {
		
		return boardDAO.updateHit(seq);
	}

	@Override
	public int boardDelete(int seq) {
		
		return boardDAO.boardDelete(seq);
	}

	@Override
	public int boardmodify(BoardDTO boardDTO) {
		
		return boardDAO.boardmodify(boardDTO);
	}

}
