package com.defrag.code.product.restcontroller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.defrag.code.product.ProductVO;
import com.defrag.code.product.service.ProductService;

@RestController
@RequestMapping("/category")
public class ProductController {
	
	@Resource(name="productService")
	private ProductService productSerivce;
	
	@RequestMapping(value = "/{productCode}", method = RequestMethod.GET)
	public ProductVO home(@PathVariable String productCode) {
		ProductVO product = null;
		
		try {
			product = productSerivce.selectProductList(productCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
}
