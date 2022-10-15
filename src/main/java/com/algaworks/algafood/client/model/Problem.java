package com.algaworks.algafood.client.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Problem {

	private String userMessage;
	private Integer status;
	private OffsetDateTime timesTamp;
	
	private List<Object> objects = new ArrayList<>();

	
	@Data
	public static class Object {
	  
	  private String name;
	  private String userMessage;
	  
	}
	
}
