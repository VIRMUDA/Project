package com.demo_virmuda.wiki.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "wiki")
@NoArgsConstructor
public class Wiki {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "birth", length = 50)
	private String birth;
	
	@Column(name = "agency", length = 50)
	private String agency;
	
	@Column(name = "group_name", length = 50)
	private String groupName;
	
	@Column(name = "debut", length = 50)
	private String debut;
	
	@Column(name = "fandom", length = 50)
	private String fandom;
	
	@Column(name = "mbti", length = 10)
	private String mbti;
	
	@Column(name = "index_value", length = 50, unique = true)
	private String indexValue;
	
}
