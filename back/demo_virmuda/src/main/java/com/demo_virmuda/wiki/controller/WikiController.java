package com.demo_virmuda.wiki.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo_virmuda.wiki.dto.WikiDto;
import com.demo_virmuda.wiki.service.WikiServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/wiki")
@RequiredArgsConstructor
public class WikiController {

	private final WikiServiceImpl wikiService;
	
	@GetMapping("/{indexValue}")
	public ResponseEntity<WikiDto> searchWiki(@PathVariable String indexValue) {
		ResponseEntity<WikiDto> response = wikiService.searchWiki(indexValue);
		return response;
	}
}
