package com.acoda.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.acoda.vo.ProductVO;


@Repository
public class ProductDAO implements IProduct{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<ProductVO> getAllProduct(){
		List<ProductVO> list= jdbcTemplate.query(select_product,new RowMapper<ProductVO>() {

			@Override
			public ProductVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				ProductVO pvo=new ProductVO();
				pvo.setItem_number(rs.getInt("item_number"));
				pvo.setProduct_name(rs.getString("product_name"));
				pvo.setId(rs.getString("id"));
				pvo.setPrice(rs.getInt("price"));
				pvo.setHead_count(rs.getInt("head_count"));
				pvo.setSell_date(rs.getString("sell_date"));
				pvo.setSchedule(rs.getString("schedule"));
				pvo.setTrip_date(rs.getString("trip_date"));
				pvo.setNote(rs.getString("note"));
				return pvo;
			} 
		});
		return list;
		
	}
	
	public int getDelProduct(String del_name) {
		int p=jdbcTemplate.update(delete_product, del_name);
		return p;
		
	}
	//��ǰ�߰� 
	public int getInsertProduct(ProductVO vo) {
		System.out.println("��ǰ �߰� �ٿ�");
		int p=jdbcTemplate.update(insert_product, new Object[] {
				vo.getProduct_name(),vo.getUser_number(),
				vo.getPrice(),vo.getHead_count(),vo.getSell_date(),vo.getSchedule(),
				vo.getTrip_date(),vo.getNote(),vo.getPic()
		});
			if (p > 0) {     
				return p;
		      } else {
		         return 0;
		      }
	}
	
	public ProductVO getFindProduct(String find_product) {
		return null;
		
	}
	
	public int getUpdateProduct(ProductVO vo) {
		return 0;
		
	}

	public List<ProductVO> getDetailinfo(int item_num) {
		List<ProductVO> list= jdbcTemplate.query(select_detail,new RowMapper<ProductVO>() {
			@Override
			public ProductVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				ProductVO pvo=new ProductVO();
				pvo.setItem_number(rs.getInt("item_number"));
				pvo.setProduct_name(rs.getString("product_name"));
				pvo.setId(rs.getString("id"));
				pvo.setPrice(rs.getInt("price"));
				pvo.setHead_count(rs.getInt("head_count"));
				pvo.setSell_date(rs.getString("sell_date"));
				pvo.setSchedule(rs.getString("schedule"));
				pvo.setTrip_date(rs.getString("trip_date"));
				pvo.setNote(rs.getString("note"));
				pvo.setPic(rs.getString("pic"));
				return pvo;
			} 
		});
		return list;
		
	}

}
