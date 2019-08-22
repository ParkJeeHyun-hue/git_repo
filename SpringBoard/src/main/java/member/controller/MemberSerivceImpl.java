package member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import member.bean.MemberDTO;
import member.dao.MemberDAO;
@Service
public class MemberSerivceImpl implements MemberService{
	@Autowired
	private MemberDAO memberDAO;
	@Override
	public int write(MemberDTO memberDTO) {
		
		return memberDAO.write(memberDTO);
	}

	@Override
	public String login(String id, String pwd) {
		
		return memberDAO.login(id, pwd);
	}

	@Override
	public MemberDTO selectOne(String id) {
		
		return memberDAO.selectOne(id);
	}

	@Override
	public int modify(MemberDTO memberDTO) {
		
		return memberDAO.modify(memberDTO);
	}

	@Override
	public int delete(String id) {
		
		return memberDAO.delete(id);
	}

	@Override
	public boolean isExistID(String id) {
		
		return memberDAO.isExistID(id);
	}

	@Override
	public int totalMember() {
		
		return memberDAO.totalMember();
	}

	@Override
	public List<MemberDTO> selectList(int startNum, int endNum) {
		
		return memberDAO.selectList(startNum, endNum);
	}

}
