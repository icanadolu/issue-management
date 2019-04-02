package com.okan.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.okan.dto.IssueDto;
import com.okan.entity.Issue;
import com.okan.entity.IssueHistory;
import com.okan.util.TPage;

public interface IssueService {
	
	IssueDto save(IssueDto issue);
	
	IssueDto getById(Long id);
	
	TPage<IssueDto> getAllPageable(Pageable pageable);
	
	Boolean delete(IssueDto issue);
}
