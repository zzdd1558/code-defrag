package com.defrag.code.product.service;

import java.util.List;
import java.util.Map;

import com.defrag.code.product.ProductVO;

public interface ProductService {
	
	List<ProductVO> selectProductList(Map<String, Object> paramMap) throws Exception;

	ProductVO selectProductDetail(Map<String, Object> paramMap) throws Exception;

}
