package com.shboard.domain;

import java.util.List;

import com.shboard.utils.Criteria;

public interface boardDAO {
	
		// 개인회원 리스트
		public List<boardVO> boardList(Criteria cri);

		// 개인회원 수정
		public int updateBoard(boardVO vo);

		/* 개인회원 상세
		public board getDetail(String email);
		 */
		
		// 개인회원 수
		public int getUserCount();

		// 총 리스트 개수
		public int totalBoardCount();

}
