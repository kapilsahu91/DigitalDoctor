/**
 * 
 */
package com.afour.digital.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.afour.digital.core.CustomUserDetails;
import com.afour.digital.model.Role;
import com.afour.digital.model.User;
import com.afour.digital.service.IUserService;
import com.afour.digital.utils.FileUploadUtility;

/**
 * @author kapil.s
 *
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	IUserService userService;

	@Autowired
	FileUploadUtility fileUpload;

	/*@Autowired
	private AuthorizationServerTokenServices tokenServices;*/

	@PostMapping("/addUser")
	@ResponseBody
	public String addUser(@RequestParam(value = "file" , required = false)
	MultipartFile file , User user ,OAuth2Authentication authentication) {
		CustomUserDetails customUserDetails = (CustomUserDetails) authentication.getPrincipal();
		System.out.println("custom info-----------------------" + customUserDetails.getUsername());

		Role role = new Role();
		role.setRoleId(2);
		user.setRole(role);
		userService.adduser(user);
		fileUpload.singleFileUpload(file, user);
		return  "user added successfully";

	}


	@GetMapping("/getUser")
	@ResponseBody
	public User getUser(@RequestParam int userId) {
		return userService.getuserById(userId);
	}

	@GetMapping("/getAllUser")
	@ResponseBody
	public List<User> getAllUser() {
		return userService.getAllusers();
	}


}
