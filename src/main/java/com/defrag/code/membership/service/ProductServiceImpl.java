package com.defrag.code.membership.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.defrag.code.product.dao.ProductDAO;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Resource(name="productDAO")
	private ProductDAO productDAO;

	@Override
	public boolean joinResult(String productCode) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
