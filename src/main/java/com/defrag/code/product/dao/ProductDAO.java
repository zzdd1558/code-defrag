package com.defrag.code.product.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.defrag.code.base.dao.AbstractDAO;
import com.defrag.code.product.ProductVO;

@Repository("productDAO")
public class ProductDAO extends AbstractDAO {

	public ProductVO selectProductList(String productCode) {
		return (ProductVO)selectOne("com.defrag.code.product.selectProductList", productCode);
	}
	
}
