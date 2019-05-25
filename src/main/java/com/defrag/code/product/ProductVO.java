package com.defrag.code.product;

import java.sql.Date;

/**
 * ���̺�� : TPRODUCTM
 * ���� ���̺� : TPRODUCTDT, TPRODUCT_GRADE, TPRODUCT_REVIEW, TPRODUCT_PRICE
 * @author joon7
 */
public class ProductVO {
	private String productCode;			/* ��ǰ�ڵ�(pk) */
	private String productTitle;		/* Ÿ��Ʋ */
	private String categoryCode;		/* ī�װ� */
//	private String productContents;		/* ���� > TPRODUCTDT */
//	private int productPrice;			/* �ݾ� > TPRODUCT_PRICE */
//	private String productGradeSeq;		/* �򰡵�� ������ > TPRODUCT_GRADE */
//	private String productReviewSeq;	/* ���� ������ > TPRODUCT_REVIEW */
	private int hit;					/* ��ȸ�� */
	private int like;					/* ��Ƚ�� */
	private String useYn;				/* ���迩�� */
	private String delYn;				/* �������� */
	private String insertId;			/* ������ */
	private Date insertDate;			/* �������� */
	private String modifyId;			/* ������ */
	private Date modifyDate;			/* �������� */
	
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
