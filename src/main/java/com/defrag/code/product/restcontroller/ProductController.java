package com.defrag.code.product.restcontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.defrag.code.product.ProductVO;

@RestController
@RequestMapping("/category")
public class ProductController {
	
	@RequestMapping(value = "/{productCode}", method = RequestMethod.GET)
	public ProductVO home(@PathVariable String productCode) {
		ProductVO product = new ProductVO();
		
		return product;
	}
	
}
