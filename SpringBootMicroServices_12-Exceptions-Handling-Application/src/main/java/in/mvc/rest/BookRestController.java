package in.mvc.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.mvc.exception.noDataFoundException;

@RestController
public class BookRestController {

	@GetMapping("/price/{isbn}")
	public String getPrice(@PathVariable String isbn) {
		String msg = "";
		if(isbn.equals("ISBN001")) {
			msg = "Book Price is 400rs";
		}
		else {
			throw new noDataFoundException("Invalid ISBN001");
		}
		return msg;
	}
}
