package member.controller;

import java.util.List;

import member.bean.MemberDTO;

public interface MemberService {
	int write(MemberDTO memberDTO);
	String login(String id, String pwd);
	MemberDTO selectOne(String id);
	int modify(MemberDTO memberDTO);
	int delete(String id);
	boolean isExistID(String id);
	int totalMember();
	List<MemberDTO> selectList(int startNum, int endNum);

}
