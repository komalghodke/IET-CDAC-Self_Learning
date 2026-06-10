package com.demo.controller;

import com.demo.dao.BookDAO;
import com.demo.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
	private BookDAO dao = new BookDAO();

	@GetMapping("/books")
	public String listBooks(Model model) {
		model.addAttribute("books", dao.getAllBooks());
		return "viewBooks";
	}
	
	@GetMapping("/books/add")
	public String showAddForm(Model model) {
		model.addAttribute("book", new Book());
		return "addBook";
	}

	@PostMapping("/books")
	public String addBook(@ModelAttribute Book book) {
		dao.addBook(book);
		return "redirect:/books";
	}

	@GetMapping("/books/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		dao.deleteBook(id);
		return "redirect:/books";
	}
}