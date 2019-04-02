package com.service.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.okan.entity.IssueHistory;
import com.okan.repository.IssueHistoryRepository;
import com.okan.service.IssueHistoryService;

@Service
public class IssueHistoryServiceImpl implements IssueHistoryService{
	private final IssueHistoryRepository issueHistoryRepository;
	private final ModelMapper modelMapper;
	
	
	public IssueHistoryServiceImpl(IssueHistoryRepository issueHistoryRepository,ModelMapper modelMapper) {
		super();
		this.issueHistoryRepository = issueHistoryRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public IssueHistory save(IssueHistory issueHistory) {
		if(issueHistory.getDate()==null){
			throw new IllegalArgumentException("Issue History cannot be null ");
		}
		return issueHistoryRepository.save(issueHistory);
	}

	@Override
	public IssueHistory getById(Long id) {
		// TODO Auto-generated method stub
		return issueHistoryRepository.getOne(id);
	}

	@Override
	public Page<IssueHistory> getAllPageable(Pageable pageable) {
		// TODO Auto-generated method stub
		return issueHistoryRepository.findAll(pageable);
	}

	@Override
	public Boolean delete(IssueHistory issueHistory) {
		// TODO Auto-generated method stub
		 issueHistoryRepository.delete(issueHistory);
		 return Boolean.TRUE;
	}
	
	

}
