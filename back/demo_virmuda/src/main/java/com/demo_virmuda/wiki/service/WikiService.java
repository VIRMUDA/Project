package com.demo_virmuda.wiki.service;

import org.springframework.http.ResponseEntity;

import com.demo_virmuda.wiki.dto.WikiDto;

public interface WikiService {

	ResponseEntity<WikiDto> searchWiki(String indexValue);
}
