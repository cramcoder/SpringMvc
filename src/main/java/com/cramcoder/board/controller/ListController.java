package com.cramcoder.board.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cramcoder.board.service.BoardService;


@Controller
public class ListController {
	private BoardService boardService;
	
	
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}

	@RequestMapping("/list.board")
	public ModelAndView pageHandler(){
		ModelAndView mav = new ModelAndView("/WEB-INF/views/board/list.jsp");
		
		try {
			
			List list = boardService.getList();
			mav.addObject("list", list);
			
		} catch (SQLException err) {
			System.out.println("ListController:pageHandler():" + err);
		}		
		return  mav;
	}
	
}
