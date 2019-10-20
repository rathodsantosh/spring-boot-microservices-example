/**
 * 
 */
package com.cts.edge.model;

import lombok.Data;

/**
 * @author Santosh Rathod
 *
 */
@Data
public class Item {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
