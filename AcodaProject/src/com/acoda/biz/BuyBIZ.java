package com.acoda.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acoda.dao.BuyDAO;
import com.acoda.vo.BuyVO;

@Service
public class BuyBIZ {

	@Autowired
	BuyDAO buyDAO;
	
	public int getInsertBuy(BuyVO vo) {
		return buyDAO.getInsertBuy(vo);
		
	}
	
	public BuyVO getFindBuy(String name) {
		return null;
		
	}
	
	
	public int getUpdateBuy(BuyVO vo) {
		return 0;
	}

	public List<BuyVO> BuyAllSelectBiz(int unumber) {
		
		return buyDAO.getAllBuy(unumber);
	}

	public int getDelBuy(int itemnum) {
		return buyDAO.getDelBuy(itemnum);

	}
	//��û�� ��� �����ִ� ����
	public List<BuyVO> getApllication_list(int a){
		return  buyDAO.getApllication_list(a);
		
	}


}
