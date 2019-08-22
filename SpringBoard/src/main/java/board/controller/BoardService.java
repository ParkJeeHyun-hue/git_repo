package board.controller;

import java.util.List;

import board.bean.BoardDTO;

public interface BoardService {
	public int write_board(BoardDTO boardDTO);
	public List<BoardDTO> boardList(int startNum, int endNum);
	public BoardDTO selectOne(int seq);
	public int getTotalA();
	public int updateHit(int seq);
	public int boardDelete(int seq);
	public int boardmodify(BoardDTO boardDTO);
	
}
