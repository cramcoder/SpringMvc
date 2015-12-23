package com.cramcoder.board.service;

import java.sql.SQLException;
import java.util.List;

import com.cramcoder.board.repository.BoardDto;

public interface BoardService {
	//��ü �� ��������
	public List getList() throws SQLException;
	
	//Ư�� �� ��������
	public BoardDto findBySeq(int seq) throws SQLException;
	
	//�� �����ϱ�
	public void write(BoardDto dto) throws SQLException;
	
	//�� �����ϱ�
	public void update(BoardDto dto) throws SQLException;
	
	//�� �����ϱ�
	public void delete(int seq) throws SQLException;

}
