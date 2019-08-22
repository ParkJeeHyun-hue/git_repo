package board.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.bean.BoardDTO;
@Repository
public class BoardDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;
	//sql문 처리
	public int write_board(BoardDTO boardDTO) {
		return sqlSession.insert("mybatis.board.write_board",boardDTO);
	}
	public List<BoardDTO> boardList(int startNum, int endNum){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("startNum",startNum);
		map.put("endNum",endNum);
		return sqlSession.selectList("mybatis.board.boardList",map);
	}
	public BoardDTO selectOne(int seq) {
		return sqlSession.selectOne("mybatis.board.selectOne",seq);
			
	}
	
	public int getTotalA() {
		return sqlSession.selectOne("mybatis.board.getTotalA");
	}
	//조회수 증가
	public int updateHit(int seq) {
		return sqlSession.update("mybatis.board.updateHit",seq);
	}
	//글삭제
	public int boardDelete(int seq) {
		return sqlSession.delete("mybatis.board.boardDelete",seq);
	}
	//데이터 검색

	//글수정
	public int boardmodify(BoardDTO boardDTO) {
		return sqlSession.update("mybatis.board.boardmodify",boardDTO);
	}
}

