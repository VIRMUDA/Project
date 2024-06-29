package com.demo_virmuda.wiki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo_virmuda.wiki.entity.Wiki;

@Repository
public interface WikiRepository extends JpaRepository<Wiki, Long> {
	Wiki findByIndexValue(String indexValue);
}
