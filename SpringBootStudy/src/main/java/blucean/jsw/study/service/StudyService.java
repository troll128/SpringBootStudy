package blucean.jsw.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blucean.jsw.study.dao.StudyMapper;

@Service
public class StudyService {
	
	@Autowired
	StudyMapper mapper;
	
	public String indexOne() throws Exception {
		return mapper.indexOne();
	}
	
	public String indexTwo() throws Exception {
		return mapper.indexTwo();
	}
}
