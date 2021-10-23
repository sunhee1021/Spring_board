package com.shboard.domain;

import java.sql.Date;

import lombok.Data;

//테이블설계부터
@Data
public class boardVO {
	
	private int boardNum;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private int viewCount;
}
