/**
 * 
 */
package com.cts.edge.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.edge.model.Item;
import com.cts.edge.service.ItemClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author Santosh Rathod
 *
 */
@RestController
public class GoodItemApiAdapterRestController {

	private final ItemClient itemClient;

	public GoodItemApiAdapterRestController(ItemClient itemClient) {
		this.itemClient = itemClient;
	}

	@HystrixCommand(fallbackMethod = "fallback")
	@GetMapping("/top-brands")
	public Collection<Item> goodItems() {
		return itemClient.readItems()
				.getContent()
				.stream()
				.filter(this::isGreat)
				.collect(Collectors.toList());
	}

	private boolean isGreat(Item item) {
		return !item.getName().equals("Nike") &&
				!item.getName().equals("Adidas") &&
				!item.getName().equals("Reebok");
	}
	
	public Collection<Item> fallback() {
	    return new ArrayList<>();
	}
}
