package com.afour.digital.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource("classpath:configuration.properties")
public class AppProperties {
	
	@Value("${auth.user}")
	private String user;
	
	@Value("${auth.password}")
	private String password;
	
	@Value("${auth.token.validity}")
	private int accessTokenValidity;
	
	@Value("${file.upload.folder.userDP}")
	private String fileUploadFolderUserDP;
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the accessTokenValidity
	 */
	public int getAccessTokenValidity() {
		return accessTokenValidity;
	}
	/**
	 * @param accessTokenValidity the accessTokenValidity to set
	 */
	public void setAccessTokenValidity(int accessTokenValidity) {
		this.accessTokenValidity = accessTokenValidity;
	}
	/**
	 * @return the fileUploadFolderUserDP
	 */
	public String getFileUploadFolderUserDP() {
		return fileUploadFolderUserDP;
	}
	/**
	 * @param fileUploadFolderUserDP the fileUploadFolderUserDP to set
	 */
	public void setFileUploadFolderUserDP(String fileUploadFolderUserDP) {
		this.fileUploadFolderUserDP = fileUploadFolderUserDP;
	}
	
}