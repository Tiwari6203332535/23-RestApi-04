package in.happy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	@GetMapping("/")
	public Customer getCustomer() {
		Customer c = new Customer();
		c.setId(101);
		c.setName("Happy");
		c.setEmail("tiwari95874@gmail.com");
		c.setPhon(06203332535);
		
		return c;
	}

}
