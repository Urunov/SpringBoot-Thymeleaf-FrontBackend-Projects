package spring.menu.service;

import org.springframework.stereotype.Service;
import spring.menu.main.Books;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Created 16 / 06 / 2020 - 3:42 PM
 * @project SpringBootMenu
 * @Author Hamdamboy
 */
@Service
public class InMemoryBookService implements BookServices {

    static Map<Long, Books> booksDB = new HashMap<>();

    @Override
    public List<Books> findAll() {

        return new ArrayList<>(booksDB.values());
    }


    @Override
    public void saveAll(List<Books> books) {
        long nextId = getNextId();
        for (Books book : books) {
            if (book.getId() == 0) {
                book.setId((int) nextId++);
            }
        }

        Map<Long, Books> booksMap = books.stream()
                .collect(Collectors.toMap(Books::getId, Function.identity()));
        booksDB.putAll(booksMap);

    }

    private  Long getNextId(){
        return booksDB.keySet()
                .stream()
                .mapToLong(value -> value)
                .max()
                .orElse(0) +1;
    }
}
