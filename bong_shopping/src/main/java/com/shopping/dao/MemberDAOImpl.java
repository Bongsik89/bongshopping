package com.shopping.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shopping.model.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static String namespace="com.shopping.mappers.MemberMapper";

	@Override
	public void memberJoin(MemberVO memberVO) throws Exception {
		sqlSession.insert(namespace + ".memberJoin", memberVO);
	}

	@Override
	public int idCheck(String memberId) throws Exception {
		return sqlSession.selectOne(namespace + ".idCheck", memberId);
	}

	@Override
	public MemberVO memberLogin(MemberVO memberVO) throws Exception {
		return sqlSession.selectOne(namespace + ".memberLogin", memberVO);
	}

}
