package guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guestbook.bean.GuestbookDTO;
import guestbook.dao.GuestbookDAO;
@Service
public class GuestbookServiveImpl implements GuestbookService{

	@Autowired
	private GuestbookDAO guestbookDAO;
	@Override
	public int write_guestbook(GuestbookDTO guestbookDTO) {
		
		return guestbookDAO.write_guestbook(guestbookDTO);
	}

	@Override
	public List<GuestbookDTO> getguestbookList(int startNum, int endNum) {
		
		return guestbookDAO.getguestbookList(startNum, endNum);
	}

	@Override
	public int guestbookListCount() {
		
		return guestbookDAO.guestbookListCount();
	}


}
