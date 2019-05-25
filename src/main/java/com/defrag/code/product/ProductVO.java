package com.defrag.code.product;

import java.sql.Date;

/**
 * 테이블명 : TPRODUCTM
 * 연관 테이블 : TPRODUCTDT, TPRODUCT_GRADE, TPRODUCT_REVIEW, TPRODUCT_PRICE
 * @author joon7
 */
public class ProductVO {
	private String productCode;			/* 상품코드(pk) */
	private String productTitle;		/* 타이틀 */
	private String categoryCode;		/* 카테고리 */
//	private String productContents;		/* 내용 > TPRODUCTDT */
//	private int productPrice;			/* 금액 > TPRODUCT_PRICE */
//	private String productGradeSeq;		/* 평가등급 시퀀스 > TPRODUCT_GRADE */
//	private String productReviewSeq;	/* 리뷰 시퀀스 > TPRODUCT_REVIEW */
	private int hit;					/* 조회수 */
	private int like;					/* 찜횟수 */
	private String useYn;				/* 숨김여부 */
	private String delYn;				/* 삭제여부 */
	private String insertId;			/* 생성자 */
	private Date insertDate;			/* 생성일자 */
	private String modifyId;			/* 수정자 */
	private Date modifyDate;			/* 수정일자 */
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductTitle() {
		return productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	public String getInsertId() {
		return insertId;
	}
	public void setInsertId(String insertId) {
		this.insertId = insertId;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public String getModifyId() {
		return modifyId;
	}
	public void setModifyId(String modifyId) {
		this.modifyId = modifyId;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	
	
}
