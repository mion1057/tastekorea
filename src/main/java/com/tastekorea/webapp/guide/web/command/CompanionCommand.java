package com.tastekorea.webapp.guide.web.command;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.tastekorea.webapp.guide.domain.Companion;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanionCommand {
	//------------------------
	//		로그인 정보
	//------------------------
	private String email;
	private String passwd;
	
	//------------------------
	//		기본 신상 정보
	//------------------------	
	private String name;
	private String phone;
	private String ssn;
	private char sex;
	private String region;
	private MultipartFile photoFile;
	
	//------------------------
	//		가능한 언어 정보
	//------------------------	
	private List<LanguageSkillCommand> languageSkillCommandList; 
	
	//------------------------
	//		제공가능한 서비스
	//------------------------
	private String provision;	//ex) 운전가능 (콤마로 구분)
	
	private String introduction;
	
	public CompanionCommand() {
		if(languageSkillCommandList == null) {
			languageSkillCommandList = new ArrayList<>(); 
		}
	}
	public Companion buildCompanion() {
		Companion c = new Companion();
		c.setEmail(this.email);
		c.setPasswd(this.passwd);
		c.setName(name);
		c.setPhone(phone);
		c.setSsn(ssn);
		c.setSex(sex);
		c.setIntroduction(introduction);
		
		return c;
	}
}