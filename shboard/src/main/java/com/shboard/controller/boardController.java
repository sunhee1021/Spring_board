package com.shboard.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shboard.domain.boardVO;
import com.shboard.service.boardService;
import com.shboard.utils.Criteria;

@Controller
@RequestMapping("/board")
public class boardController {
		
		@Autowired
		private boardService service;
		
		@Autowired
		private BCryptPasswordEncoder bCryptPasswordEncoder;
		//다시시작
		/*
		// 개인회원 리스트
		@RequestMapping(value = "/user.do", method = RequestMethod.GET)
		public String adminUser(Criteria cri, Model model) {
			cri.setStartNum((cri.getPageNum() - 1) * cri.getAmount());

			List<boardVO> list = service.userList(cri);
			int count = service.getUserCount();
			model.addAttribute("list", list);
			model.addAttribute("pageMaker", new PageDTO(cri, count));
			model.addAttribute("count", count);

			return "admin/userList";
		}

		// 개인회원 상세
		@RequestMapping(value = "/userEdit.do", method = RequestMethod.GET)
		public String getUserList(@RequestParam("member_email") String email, Model model) {
			boardVO vo = service.getUserList(email);
			model.addAttribute("list", vo);

			return "admin/userEdit";
		}

		// 개인회원 수정
		@RequestMapping(value = "/userEdit.do", method = RequestMethod.POST)
		public String userEdit(boardVO vo, HttpServletRequest request) {

			if(vo.getMember_password() != null) {
				vo.setMember_password(bCryptPasswordEncoder.encode(vo.getMember_password()));
			}
			return service.userEdit(vo, request);
		}
		*/
}
