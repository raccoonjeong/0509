package org.zerock.security;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.zerock.domain.MemberVO;

import lombok.Data;

@Data
public class CustumMemberDetails extends User {
	
	private MemberVO member; //멤버VO로 받을것이다
	private String displayName;

	public CustumMemberDetails(String username, String password, 
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	
	}

	public CustumMemberDetails(MemberVO member) {
		
		this(member.getUid(), member.getUpw(), member.getAuthList().stream()
				.map(authVO -> new SimpleGrantedAuthority(authVO.getAuth()))
				.collect(Collectors.toList()));
		this.member=member;
		this.displayName = member.getUname();
			
	}

}
