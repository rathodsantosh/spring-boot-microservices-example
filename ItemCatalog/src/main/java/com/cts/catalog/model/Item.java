/**
 * 
 */
package com.cts.catalog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Santosh Rathod
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Item {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    
    public Item() {
		// TODO Auto-generated constructor stub
	}
	
    public Item(String name) {
        this.name = name;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
