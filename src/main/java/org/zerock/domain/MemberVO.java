package org.zerock.domain;

import java.util.List;

import lombok.Data;

@Data
public class MemberVO {
	
	private String uid, upw, uname;
	
	//한사라ㅏㅁㅇ에게 모자 여러개 씌우기
	private List<MemberAuthVO> authList;
}
