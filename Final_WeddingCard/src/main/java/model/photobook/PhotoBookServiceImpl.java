package model.photobook;

import java.util.List;

public class PhotoBookServiceImpl implements PhotoBookService{
	private PhotoBookDao photoBookDao;

	public void setPhotoBookDao(PhotoBookDao photoBookDao) {
		this.photoBookDao = photoBookDao;
	}

	public List<PhotoBookVO> getPhotoBookList(String memberId) {
		return photoBookDao.getPhotoBookList(memberId);
	}

	public PhotoBookVO getPhotoBookByNo(PhotoBookVO pbvo) {
		return photoBookDao.getPhotoBookByNo(pbvo);
	}

	public void createPhotoBook(PhotoBookVO pbvo) {
		photoBookDao.createPhotoBook(pbvo);
	}

	public void modifyPhotoBook(PhotoBookVO pbvo) {
		photoBookDao.modifyPhotoBook(pbvo);
	}

	public void deletePhotoBook(int bookNo) {
		photoBookDao.deletePhotoBook(bookNo);
	}

	public String[] urlList(String url) {
		
		return url.split("`'");
	}
}
