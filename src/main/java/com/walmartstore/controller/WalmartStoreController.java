package com.walmartstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.walmartstore.model.Book;
import com.walmartstore.model.Item;


@Controller
@RequestMapping(value = {"/book","/"},  produces = {MediaType.TEXT_HTML_VALUE} )
@ResponseBody
public class WalmartStoreController {

	private static List<Item> selectedBook = new ArrayList<Item>();
	private Book book;

	@RequestMapping(method = RequestMethod.GET, produces = {MediaType.TEXT_HTML_VALUE} )
	@ResponseBody
	public ModelAndView book() {
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://api.walmartlabs.com/v1/paginated/items?format=json&category=3920&apiKey=vkzvuphdrezkzf24vpurv4ya";
		book = restTemplate.getForObject(url, Book.class);
		return new ModelAndView("book", "book", book.getItems());
	}

	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ModelAndView submit(@PathVariable("id") int id) {
		selectedBook.clear();
		selectedBook.add(0, book.getItems().get(id));
		System.out.println("Id: " + selectedBook.get(0).getItemId() + "\nName: " + selectedBook.get(0).getName()
				+ "\nPrice: " + selectedBook.get(0).getSalePrice());
		return new ModelAndView("result", "book", selectedBook);
	}
}
