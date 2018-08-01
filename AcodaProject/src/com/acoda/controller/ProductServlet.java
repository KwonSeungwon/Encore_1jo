package com.acoda.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;

import com.acoda.biz.ProductBIZ;
import com.acoda.vo.ProductVO;

@Controller
@RequestMapping("/product")
public class ProductServlet {
	
	@Autowired
	ProductBIZ productBIZ;

	@RequestMapping("/select.do")
	public String Product_Select(Model m) {
		
		List<ProductVO> list=productBIZ.getAllProduct();
		m.addAttribute("list",list);
		return "product/list_product";
	}
	
	
	//���� �μ�Ʈ
	@RequestMapping(value ="/insert.do",method=RequestMethod.POST)
	public ModelAndView Product_Insert(@ModelAttribute ProductVO vo) throws IOException {

		
		System.out.println("��ǰ �߰� ��Ʈ�ѷ�");
		int p=productBIZ.getInsertProduct(vo);//sql��(insert)����
		
	
		
		List<ProductVO>list=productBIZ.getAllProduct();//����� ����� ��Ͽ� �־ ������.
		ModelAndView m=new ModelAndView("/product/list_product","list",list);
		
		return m;
	}
	
	public String Product_find() {
		return null;
	}
	@RequestMapping("/delete.do")
	public ModelAndView Product_delete(@RequestParam("del_number")String name) {
		int p=productBIZ.getDelProduct(name);
	   ModelAndView m=new ModelAndView();
		
		if(p>0) {
		List<ProductVO>list=productBIZ.getAllProduct();
		m=new ModelAndView("/product/list_product","list",list);
		
		return m;
		}else {
			return null;
		}
		
	}
	
	public String Product_update() {
		return null;
	}
	

	//�������ε� AJAX 
	@RequestMapping(value = "/picup.do",method=RequestMethod.POST)
	public @ResponseBody String Product_Select(MultipartHttpServletRequest uploadFile) throws Exception{
		String result = "";
		String f_realname = "";
		String path = "C:\\Users\\Playdata\\git\\Encore_1jooo\\AcodaProject\\WebContent\\img\\"; // ���� ������
		File dir = new File(path);
		if(!dir.isDirectory()) {
			dir.mkdir();
		}
		
		
		Iterator<String> files = uploadFile.getFileNames();
		while(files.hasNext()) {
			String upload = files.next();
			MultipartFile mult = uploadFile.getFile(upload);
			f_realname = mult.getOriginalFilename();
			System.out.println("��������� :" + f_realname);

				mult.transferTo(new File(path+f_realname));
		}
	
		result = path+f_realname;
		return result;
		
		
		
		
		
	}

	
	
}
