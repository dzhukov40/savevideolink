package ru.doneathome.savevideolink.base.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dzhukov on 11.11.17.
 * ---
 */

@RestController
public class AbstractBaseController {

	@RequestMapping("/echo")
	public String echo() {
		return "Hello World!";
	}

}
