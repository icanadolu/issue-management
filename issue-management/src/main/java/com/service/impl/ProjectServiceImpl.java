package com.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.okan.entity.Project;
import com.okan.repository.ProjectRepository;
import com.okan.service.ProjectService;

@Service
public class ProjectServiceImpl  implements ProjectService{

	private final ProjectRepository projectRepository;
	
			
	
	public ProjectServiceImpl(ProjectRepository projectRepository) {
		super();
		this.projectRepository = projectRepository;
	}



	@Override
	public Project save(Project project) {
		if (project.getProjectCode() == null) {
			throw new IllegalArgumentException("Project code cannot be null");
		}
		return projectRepository.save(project);
	}

	@Override
	public Project getById(Long id) {
		
		return projectRepository.getOne(id);
	}

	@Override
	public List<Project> getByProjectCode(String projectCode) {
		// TODO Auto-generated method stub
		return projectRepository.getByProjectCode(projectCode);
	}

	@Override
	public List<Project> getByProjectCodeContains(String projectCode) {
		
		return projectRepository.getByProjectCodeContains(projectCode);
	}

	@Override
	public Page<Project> getAllPageable(Pageable pageable) {
		// TODO Auto-generated method stub
		return projectRepository.findAll(pageable);
	}

	@Override
	public Boolean delete(Project project) {
		projectRepository.delete(project);
		return Boolean.TRUE;
	}

}
