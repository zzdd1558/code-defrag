package com.defrag.code.product.service;

import java.util.List;

import com.defrag.code.product.ProductVO;

public interface ProductService {
	
	List<ProductVO> selectProductList(String productCode) throws Exception;

}
