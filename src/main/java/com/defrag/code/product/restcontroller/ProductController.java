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
@RequestMapping(value= {"/search"})
public class ProductController {
	
	@Resource(name="productService")
	private ProductService productSerivce;
	
	@RequestMapping(value = {"", "/", "/category/", "/category/{categoryCode}"}, method = RequestMethod.GET)
	public List<ProductVO> productList(@PathVariable(required=false) Map<String, Object> paramMap) {
		List<ProductVO> product = null;
		
		System.out.println(paramMap.toString());
		
		try {
			product = productSerivce.selectProductList(paramMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	@RequestMapping(value = {"/product/{productCode}","/category/{categoryCode}/product/{productCode}"}, method = RequestMethod.GET)
	public ProductVO productDetail(@PathVariable(required=true) Map<String, Object> paramMap) {
		ProductVO product = null;
		
		System.out.println(paramMap.toString());
		
		try {
			product = productSerivce.selectProductDetail(paramMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
}
