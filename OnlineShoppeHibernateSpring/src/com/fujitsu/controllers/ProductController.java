package com.fujitsu.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fujitsu.beans.Product;
import com.fujitsu.exceptions.ServiceException;
import com.fujitsu.services.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public String viewAllProducts(HttpSession session)
	{
		try {
			List<Product> product=productService.findAllProducts();
			session.setAttribute("productList", product);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "productview";
	}
	
	@GetMapping("/add")
	public String addProductForm()
	{
		return "productaddform";
	}
	
	@PostMapping("/addproduct")
	public String addProduct(Product product,ModelMap map)
	{
		try {
			productService.add(product);
			map.addAttribute("message","Product" +product.getProductId() + " is saved Sucessfully....");
			return "success";
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.addAttribute("productadderror","Sorry!!!!! Product could not be save.....");
			return "productaddform";
		}
		
	
	}
	
	@GetMapping("/edit")
	public String editProductForm()
	{
		return "producteditform";
				
	}
	
	@PostMapping("/editproduct")
	public String editProduct(Product product,ModelMap map)
	{
		try {
			productService.update(product);
			map.addAttribute("message","Product" +product.getProductId() + " is Edited Sucessfully....");

			return "success";
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.addAttribute("productediterror","Sorry!!!!! Product could not be save.....");
			return "productaddform";
		}
	}
	
	@GetMapping("/delete")
	public String deleteProductForm()
	{
		return "productdeleteform";
				
	}
	
	@PostMapping("/deleteproduct")
	public String deleteProduct(Product product,ModelMap map)
	{
		try {
			productService.remove(product);
			map.addAttribute("message","Product" +product.getProductId() + " is deleted Sucessfully....");
			return "success";
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.addAttribute("productdeleteerror","Sorry!!!!! Product can not be deleted.....");
			return "productdeleteform";
		}
	}
}
