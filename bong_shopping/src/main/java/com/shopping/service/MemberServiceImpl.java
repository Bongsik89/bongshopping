package com.shopping.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.shopping.dao.MemberDAO;
import com.shopping.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject
	MemberDAO memberDAO;

	@Override
	public void memberJoin(MemberVO memberVO) throws Exception {
		memberDAO.memberJoin(memberVO);
	}

	@Override
	public int idCheck(String memberId) throws Exception {		
		return memberDAO.idCheck(memberId);
	}

	@Override
	public MemberVO memberLogin(MemberVO memberVO) throws Exception {
		return memberDAO.memberLogin(memberVO);
	} 

}
