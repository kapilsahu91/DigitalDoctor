/**
 * 
 */
package com.afour.digital.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.afour.digital.core.AppProperties;
import com.afour.digital.model.User;

/**
 * @author kapil.s
 *
 */
@Component
public class FileUploadUtility {
	
	@Autowired
	AppProperties app;

	public String singleFileUpload(MultipartFile file , User user) {
		try {
			byte[] bytes = file.getBytes();
			Path path = Paths.get(app.getFileUploadFolderUserDP() + user.getEmail()  + ".jpg");
			Files.write(path, bytes);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "File uploaded successfully";
	}

}
