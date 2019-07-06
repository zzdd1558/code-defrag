package com.defrag.code.product.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.defrag.code.base.dao.AbstractDAO;
import com.defrag.code.product.ProductVO;

@Repository("productDAO")
public class ProductDAO extends AbstractDAO {

	@SuppressWarnings("unchecked")
	public List<ProductVO> selectProductList(Map<String, Object> paramMap) {
		return (List<ProductVO>)selectList("com.defrag.code.product.selectProductList", paramMap);
	}

	public ProductVO selectProductDetail(Map<String, Object> paramMap) {
		return (ProductVO)selectOne("com.defrag.code.product.selectProductDetail", paramMap);
	}
	
}
