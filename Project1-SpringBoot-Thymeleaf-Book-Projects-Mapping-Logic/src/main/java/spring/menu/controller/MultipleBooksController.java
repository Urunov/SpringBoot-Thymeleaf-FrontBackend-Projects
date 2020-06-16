package spring.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import spring.menu.main.Books;
import spring.menu.repository.BookRepository;
import spring.menu.service.BookServices;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created 16 / 06 / 2020 - 3:53 PM
 * @project SpringBootMenu
 * @Author Hamdamboy
 */

@Controller
public class MultipleBooksController {

    @Autowired
    private BookServices bookServices;

    @GetMapping(value = "/")
    public String index(){

        return "redirect:/books/index";
    }

    @GetMapping(value = "books/all")
    public String showAll(Model model) {
        model.addAttribute("books", bookServices.findAll());

        return "allBooks";
    }

    @GetMapping(value = "books/create")
    public String showCreateForm(Model model) {
        BookRepository booksForm = new BookRepository();

        for (int i = 1; i <= 3; i++) {
            booksForm.addBook(new Books());
        }

        model.addAttribute("form", booksForm);

        return "createBooksForm";
    }

    @GetMapping(value = "books/edit")
    public String showEditForm(Model model) {

        List<Books> books = new ArrayList<>();
        bookServices.findAll()
                .iterator()
                .forEachRemaining(books::add);

        model.addAttribute("form", new BookRepository(books));

        return "editBooksForm";
    }

    @PostMapping(value = "books/save")
    public String saveBooks(@ModelAttribute BookRepository form, Model model) {
        bookServices.saveAll(form.getBooks());

        model.addAttribute("books", bookServices.findAll());

        return "allBooks";
    }
}
