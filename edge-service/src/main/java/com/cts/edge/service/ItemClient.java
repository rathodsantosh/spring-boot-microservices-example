/**
 * 
 */
package com.cts.edge.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;

import com.cts.edge.model.Item;

/**
 * @author Santosh Rathod
 *
 */
@FeignClient("item-catalog-service")
public interface ItemClient {
	
	@GetMapping("/items")
    Resources<Item> readItems();
}
