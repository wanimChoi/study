package com.sp.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor  // 테스트 하기위해서는 값을 모두 넣고 해야하는거니까 인자가 있는 생성자 필요. 
public class Board {
	private long num;
	private String name;
	private String pwd;
	private String subject;
	private String content;
	private String ipAddr;
	private String reg_date;
	private int hitCount;
}
