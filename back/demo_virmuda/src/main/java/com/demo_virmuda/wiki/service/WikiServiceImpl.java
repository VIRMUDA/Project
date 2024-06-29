package com.demo_virmuda.wiki.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo_virmuda.wiki.dto.WikiDto;
import com.demo_virmuda.wiki.entity.Wiki;
import com.demo_virmuda.wiki.repository.WikiRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class WikiServiceImpl implements WikiService {

	private final WikiRepository wikiRepository;
	
	@Override
	public ResponseEntity<WikiDto> searchWiki(String indexValue) {
		Wiki wiki = wikiRepository.findByIndexValue(indexValue);
		
		if (wiki != null) {
			WikiDto dto = new WikiDto();
			
			dto.setName(wiki.getName());
			dto.setBirth(wiki.getBirth());
			dto.setAgency(wiki.getAgency());
			dto.setGroupName(wiki.getGroupName());
			dto.setDebut(wiki.getDebut());
			dto.setFandom(wiki.getFandom());
			dto.setMbti(wiki.getMbti());
			
			return ResponseEntity.ok(dto);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
}
