package com.defrag.code.product.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.defrag.code.product.ProductVO;
import com.defrag.code.product.dao.ProductDAO;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Resource(name="productDAO")
	private ProductDAO productDAO;

	@Override
	public ProductVO selectProductList(String productCode) throws Exception {
		return productDAO.selectProductList(productCode);
	}

}
