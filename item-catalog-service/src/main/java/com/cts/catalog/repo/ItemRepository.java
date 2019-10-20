/**
 * 
 */
package com.cts.catalog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cts.catalog.model.Item;

/**
 * @author Santosh Rathod
 *
 */
@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, Long> {}