package member.dao;
/**JDBC 작업단계
 * 1.Driver Loading
 * 2.Connection
 * 3.SQL 작업처리
 * 4.반환값 처리
 * 5. 접속 종료
 */


import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import member.bean.MemberDTO;
@Repository
public class MemberDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int write(MemberDTO memberDTO) {
		return sqlSession.insert("mybatis.memberMapper.write",memberDTO);	
	}
	// 로그인 검사
	public String login(String id, String pwd) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("pwd", pwd);
		return sqlSession.selectOne("mybatis.memberMapper.login",map);
	}
	//데이터 검색
	public MemberDTO selectOne(String id) {
		return sqlSession.selectOne("mybatis.memberMapper.selectOne",id);
	}
		
	//데이터 수정
	public int modify(MemberDTO memberDTO) {
		return sqlSession.update("mybatis.memberMapper.modify",memberDTO);
	}
	//ID 데이터 검색
	public boolean isExistID(String id) {
		boolean exist= false;
		if(sqlSession.selectOne("mybatis.memberMapper.isExistID",id)!=null) {
			exist= true;
		}
		return exist;
	}
	public int totalMember() {
		return sqlSession.selectOne("mybatis.memberMapper.totalMember");
	}
	//전체 검색
	public List<MemberDTO> selectList(int startNum, int endNum){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("startNum", startNum);
		map.put("endNum", endNum);
		return sqlSession.selectList("mybatis.memberMapper.selectList",map);
	}
	public int delete(String id) {
		return sqlSession.delete("mybatis.memberMapper.delete",id);
	}
}
