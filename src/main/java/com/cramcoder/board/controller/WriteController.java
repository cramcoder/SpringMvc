package com.cramcoder.board.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cramcoder.board.repository.BoardDto;
import com.cramcoder.board.service.BoardService;

@Controller
public class WriteController {
	private BoardService boardService;
	
	
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}

	@RequestMapping(value="/write.board", method=RequestMethod.GET)
	public String pageHandler(){
		return "/WEB-INF/views/board/write.jsp";
	}
	
	@RequestMapping(value="/write.board", method=RequestMethod.POST)
	public String submitted(@ModelAttribute BoardDto dto) {
		try {
			boardService.write(dto);
		} catch (SQLException err) {
			System.out.println("submitted post :" + err);
		
		}
		return "redirect:list.board";
	}

}
