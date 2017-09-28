/**
 * 
 */
package com.afour.digital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kapil.s
 *
 */
@RestController
public class HomeController {
	
	@GetMapping("/getApplicationStatus")
	public String startUp(){
		return "Application successfully started";
	}
}
