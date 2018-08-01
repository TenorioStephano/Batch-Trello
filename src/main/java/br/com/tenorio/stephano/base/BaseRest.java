package br.com.tenorio.stephano.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Component
public abstract class BaseRest {

	private RestTemplate restTemplate = new RestTemplate();
	private HttpHeaders headers = null;

	private <T> Object responseDefault(String url, String request, T response, HttpMethod httpMethod) {
		if (response instanceof ArrayList) {
			return restTemplate.exchange(url, httpMethod, new HttpEntity<>(request, headers),
					new ParameterizedTypeReference<List<?>>() {
					}).getBody();
		} else {
			return restTemplate.exchange(url, httpMethod, new HttpEntity<>(request, headers), (Class<?>) response)
					.getBody();
		}
	}

	protected void setHeaders(HttpHeaders headers) {
		this.headers = headers;
	}

	protected <T> Object getResponse(String url, T response) {
		return responseDefault(url, null, response, HttpMethod.GET);
	}

	protected <T> Object getResponse(String url, String request, T response) {
		return responseDefault(url, request, response, HttpMethod.GET);
	}

	protected <T> Object postResponse(String url, T response) {
		return responseDefault(url, null, response, HttpMethod.POST);
	}

	protected <T> Object postResponse(String url, String request, T response) {
		return responseDefault(url, request, response, HttpMethod.POST);
	}

	protected ResponseEntity<String> postResponse(String url, MultiValueMap<String, String> parameters) {
		return new RestTemplate().exchange(url, HttpMethod.POST, new HttpEntity<>(parameters, this.headers),
				String.class);
	}
}
