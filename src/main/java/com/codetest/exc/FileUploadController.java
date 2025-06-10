package com.codetest.exc;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@RestController
@RequestMapping("/updload")
public class FileUploadController {
	
	@PostMapping("/file")
	public void handleFileUpload(
			@PathVariable int ivtrSeq
			,MultipartHttpServletRequest request) {
		    request.getParameter("data");
		    request.getParameterValues(null);
		    
	}
}
