package org.zerock.mapper;

import org.apache.ibatis.annotations.Insert;
import org.zerock.domain.MemberAuthVO;
import org.zerock.domain.MemberVO;

public interface MemberMapper {
	
	@Insert("insert into tbl_member_secu (uid, upw, uname) values (#{uid},#{upw},#{uname})")
	public void insert(MemberVO vo);
	
	//짧은 SQL은 이게 편하지만 동적SQL은 어노테이션이 더 불편함..
	@Insert("insert into tbl_member_auth (uid, auth) values (#{uid},#{auth})")
	public void insertAuth(MemberAuthVO vo);
	
	
	public MemberVO read(String mid);

}
