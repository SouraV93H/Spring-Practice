package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("/fileform")
	public String showUploadForm() {
		
		return "fileform";
	}
	
	@RequestMapping(value = "uploadimage", method = RequestMethod.POST)
	public String uploadimage(@RequestParam("upload") CommonsMultipartFile file, HttpSession s, Model m) {
		System.out.println("File handler is working");
		byte[] data = file.getBytes();
		String path = s.getServletContext().getRealPath("/")+"WEB-INF"+ File.separator+"views"+File.separator+ file.getOriginalFilename();
		System.out.println(path);
		try {
			
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("File uploaded...");
			m.addAttribute("msg", "Uploaded Successfully");
			m.addAttribute("filename", file.getOriginalFilename());
		}catch (Exception e) {
			System.out.println("File uploaded Failed...");
			m.addAttribute("msg", "Uploading Unsuccessfully");
		}
		
		
		return "filesuccess";
		
	}
	@RequestMapping("/user/{id}")
	public String userDetails(@PathVariable("id") int id) {
		System.out.println(id);
		return "home";
	}

}
