package model.photobook;

import org.springframework.web.multipart.MultipartFile;

import model.member.MemberVO;

public class PhotoBookVO {
	
	private int bookNo;
	private String bookName;
	private String fileName;
	private String createDate;
	private MemberVO memberVO;
	private MultipartFile file;
	
	public PhotoBookVO() {}
	
	public PhotoBookVO(int bookNo, String bookName, String createDate,
			MemberVO memberVO) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.createDate = createDate;
		this.memberVO = memberVO;
	}

	public PhotoBookVO(int bookNo, String bookName, String fileName,
			String createDate, MemberVO memberVO) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.fileName = fileName;
		this.createDate = createDate;
		this.memberVO = memberVO;
	}
	
	public PhotoBookVO(int bookNo, String bookName, String fileName,
			String createDate, MultipartFile file) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.fileName = fileName;
		this.createDate = createDate;
		this.file = file;
	}

	public PhotoBookVO(int bookNo, String bookName, String fileName,
			String createDate, MemberVO memberVO, MultipartFile file) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.fileName = fileName;
		this.createDate = createDate;
		this.memberVO = memberVO;
		this.file = file;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public MemberVO getMemberVO() {
		return memberVO;
	}

	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "PhotoBookVO [bookNo=" + bookNo + ", bookName=" + bookName
				+ ", fileName=" + fileName + ", createDate=" + createDate
				+ ", memberVO=" + memberVO + ", file=" + file + "]";
	}
}
