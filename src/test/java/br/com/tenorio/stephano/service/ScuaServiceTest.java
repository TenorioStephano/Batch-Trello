package br.com.tenorio.stephano.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.tenorio.stephano.BatchTrelloApplication;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BatchTrelloApplication.class})
public class ScuaServiceTest {
	
	@Autowired
	ScuaService scuaService;

	@Test
	public void testGetCookie() {
		List<String> response = scuaService.getCookies();
		assertTrue(response != null && !response.isEmpty());
	}
	
	@Test
	public void testGetResponseScua() {
		String response = scuaService.getResponseScua("18013024");
		assertTrue(response != null && !response.isEmpty());
	}

}
