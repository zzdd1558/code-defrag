package com.defrag.code.product.service;

import java.util.Map;

import com.defrag.code.product.ProductVO;

public interface ProductService {
	
	ProductVO selectProductList(String productCode) throws Exception;

}
