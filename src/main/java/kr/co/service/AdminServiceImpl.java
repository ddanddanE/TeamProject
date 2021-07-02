package kr.co.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.domain.MemberDTO;
import kr.co.persistence.AdminDAO;

@Service
public class AdminServiceImpl implements AdminService{
	@Inject
	private AdminDAO aDAO;

	@Override
	public void insert(MemberDTO dto) {
		aDAO.insert(dto);
		
	}
}
