package com.randomizer.address.api;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.randomizer.address.service.RandomizerAddressService;

@RestController
@RequestMapping("/randomizer/v1")
public class RandomizerAddressApi {
	
	@Autowired
	RandomizerAddressService randomizerAddressService;
	
	@GetMapping("/address")
	@ResponseBody
	public String getAddress() {
		return randomizerAddressService.getAddress();
	}

}
