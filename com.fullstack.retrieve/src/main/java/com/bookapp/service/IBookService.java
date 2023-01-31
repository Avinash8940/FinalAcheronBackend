/**
 * 
 */
package com.bookapp.service;

import java.util.List;

import java.util.Optional;

import javax.ws.rs.DefaultValue;

import org.springframework.boot.autoconfigure.graphql.GraphQlProperties.Graphiql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookapp.model.Book;

/**
 * @author AvinashSankineni
 *
 */
public interface IBookService {
	
	/**
	 * @return the list of books
	 */
	List<Book> getAll();
	
	/**
	 * @param id is used to get the book by id
	 * @return the book details
	 */
	Book getById(int id);
	
	/**
	 * @param field is used to choose the exact field
	 * @param direction is used to pick the exact sorting
	 * @return the list of data
	 */
	List<Book> findBySorting(String field,String direction);
	
	/**
	 * @param pageSize is used to mention the list of books
	 * @param pageNumber is used to mention the page name
	 * @return the list of books
	 */
	Page<Book> findByPagination(int pageNumber,int pageSize);
	
}
