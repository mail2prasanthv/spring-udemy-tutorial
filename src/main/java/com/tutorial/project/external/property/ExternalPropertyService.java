package com.tutorial.project.external.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalPropertyService {

	@Value("${external.service.url}")
	private String extUrl;

	public String getExtUrl() {
		return extUrl;
	}
}
