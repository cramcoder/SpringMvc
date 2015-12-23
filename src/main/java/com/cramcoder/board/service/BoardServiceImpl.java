package com.cramcoder.board.service;

import java.lang.reflect.WildcardType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Spring;






import com.cramcoder.board.repository.BoardDto;

import mybatis.BoardManager;

public class BoardServiceImpl implements BoardService {
	
	
	public List getList() throws SQLException {
		/*
		List list = new ArrayList();
		list.add("aaa");
		list.add("aaa");
		list.add("aaa");
		*/
		/*
		String sql = "select * from tblspringboard order by b_seq desc";
		List<BoardDto> list = new ArrayList<BoardDto>();
		*/
	
		/*
		list = jdbcTemplate.query(sql, rowmap);
		return list;
		*/
		return BoardManager.getList();
	}
	
	/*
	class RowMapperImpl implements RowMapper{
		public Object mapRow(ResultSet rs, int arg1) throws SQLException {
			BoardDto dto = new BoardDto();
			dto.setB_content(rs.getString("b_content"));
			dto.setB_hitcount(rs.getInt("b_hitcount"));
			dto.setB_password(rs.getString("b_password"));
			dto.setB_regdate(rs.getString("b_regdate"));
			dto.setB_seq(rs.getInt("b_seq"));
			dto.setB_title(rs.getString("b_title"));
			dto.setB_writer(rs.getString("b_writer"));
			return dto;
		}			
	}
	*/

	public BoardDto findBySeq(int seq) throws SQLException {
		return BoardManager.findBySeq(seq);
	}

	public void write(BoardDto dto) throws SQLException {
		BoardManager.write(dto);
	}
	

	/*
	class WriteParams implements PreparedStatementSetter{
		private BoardDto dto;
		
		
		//반드시 생성자로 넘겨주어야한다.
		public WriteParams(BoardDto dto){
			this.dto = dto;
		}
		
		
		
		public void setValues(PreparedStatement pstmt) throws SQLException {
			pstmt.setString(1, dto.getB_title());
			pstmt.setString(2, dto.getB_content());
			pstmt.setString(3, dto.getB_writer());
			pstmt.setString(4, dto.getB_password());
			
		}
	
	}
	*/

	public void update(BoardDto dto) throws SQLException {
		BoardManager.update(dto);
	}

	public void delete(int seq, String password) throws SQLException {
		//BoardManager.delete(seq, password);
	}

	public void delete(int seq) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	
}
