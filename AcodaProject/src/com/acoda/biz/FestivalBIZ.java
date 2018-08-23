package com.acoda.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acoda.dao.BuyDAO;
import com.acoda.dao.FestivalDAO;
import com.acoda.vo.BuyVO;
import com.acoda.vo.FestivalVO;

@Service
public class FestivalBIZ {

	@Autowired
	FestivalDAO festivalDAO;

	public List<FestivalVO> getAllFestival() {
		System.out.println("���� ����");
		System.out.println(festivalDAO.getAllFestival().toString());
		return festivalDAO.getAllFestival();

	}
	//�˻�
	public List<FestivalVO> getSearch(String s){
		System.out.println("���⼭ �˻��Ѵ�....");
		System.out.println(festivalDAO.getSearch(s).size());
		return  festivalDAO.getSearch(s);
	}
	//click
	public List<FestivalVO> getClickfestival(String name){
	System.out.println("����� Ŭ�� ���� : "+name.toString());
		return festivalDAO.getClickfestival(name);
	}

	 public int getInsertFestival(FestivalVO vo) {

	      return festivalDAO.getInsertFestival(vo);
	   }


	public int getDelFestival(String del_name) {
		
		return festivalDAO.getDelFestival(del_name);

	}

	public int getUpdateFestival(FestivalVO vo) {
		System.out.println("����� ������Ʈ ����"+festivalDAO.getUpdateFestival(vo));

		
		return festivalDAO.getUpdateFestival(vo);
	}

	public FestivalVO getFindFestival(String f_number) {
		System.out.println("����� ���ε� ����"+f_number);
		return festivalDAO.getFindFestival(f_number);

	}

}
