package com.acoda.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acoda.dao.ProductDAO;
import com.acoda.vo.ProductVO;


@Service
public class ProductBIZ {
	
	@Autowired
	ProductDAO productDAO;
	
	public List<ProductVO> getAllProduct(){
		return productDAO.getAllProduct();
		
	}
	
	public int getInsertProduct(ProductVO vo) {
		System.out.println("��ǰ �߰� ����");
		return productDAO.getInsertProduct(vo);
		
	}
	//�˻�
	public List<ProductVO> getSearch_product(String name){
		System.out.println("��ǰ�˻� ����"+productDAO.getSearch_product(name).size());
		return productDAO.getSearch_product(name);
	}
	//Ŭ��
	public List<ProductVO> getClickProduct(int number){
		return productDAO.getClickProduct(number);
	}
	
	public ProductVO getFindProduct(String name) {
		return null;
		
	}
	//����
	public int getDelProduct(String del_name) {
		
		return productDAO.getDelProduct(del_name);
		
	}
	
	public int getUpdateProduct(ProductVO vo) {
		return productDAO.getUpdateProduct(vo);
	}

	public ProductVO getDetail(int item_num) {

		return productDAO.getDetailinfo(item_num);
	}


	public ProductVO getproductupdateinfo(int num) {
		return productDAO.getupdateinfo(num);
	}

}
