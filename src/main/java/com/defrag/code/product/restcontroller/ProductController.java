package com.defrag.code.product.restcontroller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.defrag.code.product.ProductVO;
import com.defrag.code.product.service.ProductService;

@RestController
@RequestMapping(value= {"/category"})
public class ProductController {
	
	@Resource(name="productService")
	private ProductService productSerivce;
	
	@RequestMapping(value = {"", "/{categoryCode}"}, method = RequestMethod.GET)
	public List<ProductVO> productList(@PathVariable(required=false) String categoryCode) {
		List<ProductVO> product = null;
		
		if("".equals(categoryCode) || categoryCode==null){
			System.out.println("/index/category - null.");
		}
		
		try {
			product = productSerivce.selectProductList(categoryCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
}
