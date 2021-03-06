package com.shopping.dao;

import com.shopping.model.MemberVO;

public interface MemberDAO {
	
	//회원가입
	public void memberJoin(MemberVO memberVO) throws Exception;
	
	//아이디 중복 검사
	public int idCheck(String memberId) throws Exception;
	
	//로그인
	public MemberVO memberLogin(MemberVO memberVO) throws Exception;

}
