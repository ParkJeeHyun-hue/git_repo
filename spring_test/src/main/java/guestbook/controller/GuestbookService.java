package guestbook.controller;

import java.util.List;

import guestbook.bean.GuestbookDTO;

public interface GuestbookService {
	int write_guestbook(GuestbookDTO guestbookDTO);//방명록작성
	List<GuestbookDTO> getguestbookList(int startNum, int endNum);//방명록목록
	int guestbookListCount();// 방명록 총 갯수

}
