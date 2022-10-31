package com.interfacemapping.MappingUdemy;

import com.interfacemapping.MappingUdemy.entity.Check;
import com.interfacemapping.MappingUdemy.entity.CreditCard;
import com.interfacemapping.MappingUdemy.repos.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class MappingUdemyApplicationTests {

	@Autowired
	PaymentRepository paymentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateCard(){
		CreditCard c2=new CreditCard();
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
