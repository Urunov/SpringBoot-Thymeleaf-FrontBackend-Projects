package spring.menu.service;


import org.springframework.stereotype.Service;
import spring.menu.main.Books;


import java.util.List;

/**
 * @Created 16 / 06 / 2020 - 3:28 PM
 * @project SpringBootMenu
 * @Author Hamdamboy
 */
@Service
public interface BookServices {

    List<Books> findAll();
    void saveAll(List<Books> books);
}
