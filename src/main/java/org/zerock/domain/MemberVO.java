package org.zerock.domain;

import java.util.List;

import lombok.Data;

@Data
public class MemberVO {
	
	private String uid, upw, uname;
	
	//�ѻ�󤿤������� ���� ������ �����
	private List<MemberAuthVO> authList;
}
