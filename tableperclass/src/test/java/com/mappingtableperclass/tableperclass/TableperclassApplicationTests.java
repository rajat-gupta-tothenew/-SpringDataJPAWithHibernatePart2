package com.mappingtableperclass.tableperclass;

import com.mappingtableperclass.tableperclass.entity.Check;
import com.mappingtableperclass.tableperclass.entity.Card;
import com.mappingtableperclass.tableperclass.repos.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TableperclassApplicationTests {

	@Autowired
	PaymentRepository paymentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateCard(){
		Card c2=new Card();
		c2.setId(123);
		c2.setAmount(1000);
		c2.setCardNumber("12387838");

		paymentRepository.save(c2);
	}

	@Test
	public void testCreateCheck(){
		Check c1=new Check();
		c1.setId(124);
		c1.setAmount(4000);
		c1.setCheckNumber("763787838");

		paymentRepository.save(c1);
	}
}
