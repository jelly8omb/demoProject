package org.iclass.service;

import static org.junit.jupiter.api.Assertions.*;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class HashingTest {

	@Test
	void test() {
		MemberService service = new MemberService();
		try {
			String hashvalue = service.encrypt("1111");
			log.info("해시값 : {}",hashvalue);
			hashvalue = service.encrypt("thGh123!@4");
			log.info("해시값 : {}",hashvalue);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

}
