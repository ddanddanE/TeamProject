package kr.co.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.domain.MemberDTO;

@Repository
public class AdminDAOImpl implements AdminDAO{
	
	@Inject
	private SqlSession session;
	
	private final String NAMESPACE = "kr.co.admin";
	
	@Override
	public void insert(MemberDTO dto) {
		session.insert(NAMESPACE+".insert", dto);
	}

}
