
package kr.co.controller;

import javax.inject.Inject;
import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.domain.MemberDTO;
import kr.co.service.AdminService;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	@Inject
	private AdminService aService;
	
	@Inject
	private ServletContext sc;
	
	@RequestMapping(value = "/insert_member_admin", method = RequestMethod.GET)
	public void insert(){
		
	}
	@RequestMapping(value = "/insertPost", method = RequestMethod.POST)
	public String insert(MemberDTO dto) {
		aService.insert(dto);
		return "home";
	}
}
