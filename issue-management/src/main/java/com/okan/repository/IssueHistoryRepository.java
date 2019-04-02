package com.okan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.okan.entity.IssueHistory;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {

}
