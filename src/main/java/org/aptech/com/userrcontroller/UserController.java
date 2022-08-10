package org.aptech.com.userrcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
public class UserController {

	@GetMapping("/user")
	  public String userhome() {
	  return "This is the user controller in Master Branch";
		}
	
	}

