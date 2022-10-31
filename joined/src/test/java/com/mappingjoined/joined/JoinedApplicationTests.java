package com.mappingjoined.joined;

import com.mappingjoined.joined.entity.Card;
import com.mappingjoined.joined.entity.Check;
import com.mappingjoined.joined.repos.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JoinedApplicationTests {
	@Autowired
	PaymentRepository repository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createPayment() {
		Card cc = new Card();
		cc.setId(123);
		cc.setAmount(1000);
		cc.setCardNumber("1234567890");
		repository.save(cc);
	}

	@Test
	public void createCheckPayment() {
		Check ch = new Check();
		ch.setId(124);
		ch.setAmount(1000);
		ch.setCheckNumber("1234567890");
		repository.save(ch);
	}

}
