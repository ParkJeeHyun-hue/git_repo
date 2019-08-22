package guestbook.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import guestbook.bean.GuestbookDTO;

@Repository
public class GuestbookDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//방명록작성
	public int write_guestbook(GuestbookDTO guestbookDTO) {
		return sqlSession.insert("mybatis.guestbookMapper.write_guestbook",guestbookDTO);
	}
	//방명록 목록
	public List<GuestbookDTO> getguestbookList(int startNum, int endNum){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("startNum", startNum);
		map.put("endNum", endNum);
		return sqlSession.selectList("mybatis.guestbookMapper.getguestbookList",map);
	}
	//방명록 글 총 갯수
	public int guestbookListCount() {
		return sqlSession.selectOne("mybatis.guestbookMapper.guestbookListCount");
	}
}
