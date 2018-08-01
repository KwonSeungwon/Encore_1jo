package com.acoda.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acoda.dao.FestivalDAO;
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
	public List<FestivalVO> getsearch(String s){
		System.out.println("���⼭ �˻��Ѵ�....");
		System.out.println(festivalDAO.getsearch(s).size());
		return  festivalDAO.getsearch(s);
	}
	//click
	public List<FestivalVO> getClickfestival(String name){
	System.out.println("����� Ŭ�� ���� : "+name.toString());
		return festivalDAO.getClickfestival(name);
	}

	 public int getInsertFestival(FestivalVO vo) {

	      return festivalDAO.getInsertFestival(vo);
	   }

	public FestivalVO getFindFestival(String name) {
		System.out.println("����� ���ε� ����"+name);
		return festivalDAO.getFindFestival(name);

	}

	public int getDelFestival(String del_name) {
		
		return festivalDAO.getDelFestival(del_name);

	}

	public int getUpdateFestival(FestivalVO vo) {
		System.out.println("����� ������Ʈ ����"+festivalDAO.getUpdateFestival(vo));
		
		return festivalDAO.getUpdateFestival(vo);
	}

}
