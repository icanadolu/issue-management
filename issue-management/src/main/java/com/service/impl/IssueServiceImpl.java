package com.service.impl;

import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.okan.dto.IssueDto;
import com.okan.entity.Issue;
import com.okan.repository.IssueRepository;
import com.okan.service.IssueService;
import com.okan.util.TPage;

public class IssueServiceImpl implements IssueService {

	private final IssueRepository issueRepository;
	private final ModelMapper modelMapper;
		
	public IssueServiceImpl(IssueRepository issueRepository,ModelMapper modelMapper) {
		super();
		this.issueRepository = issueRepository;
	    this.modelMapper = modelMapper;
	}

	
	@Override
	public IssueDto save(IssueDto issue) {
		if(issue.getDate() == null){
			throw new IllegalAccessError("issue date cannot be null");
		}
		Issue IssueDb = modelMapper.map(issue, Issue.class);
		IssueDb =	issueRepository.save(IssueDb);
		
		return modelMapper.map(IssueDb, IssueDto.class);
	}

	@Override
	public IssueDto getById(Long id) {
		
		return null;
	}

	@Override
	public Boolean delete(IssueDto issue) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TPage<IssueDto> getAllPageable(Pageable pageable) {
	 Page<Issue> data =	issueRepository.findAll(pageable);
	 IssueDto[] dtos = modelMapper.map(data.getContent(), IssueDto[].class);
	 TPage page = new TPage<IssueDto>();
	 page.setStat(data, Arrays.asList(dtos));
		return page;
	}

}
