import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

/**
 * Created by parde on 5/10/2017.
 */
public class Book implements ApplicationContextAware, BeanNameAware {

    private String name;
    private float price;
    private Author author;

    private ApplicationContext context;

//    private List<Author> authorsList;

    // Getters
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public Author getAuthor() {
        return author;
    }
//    public List<Author> getAuthorsList() {
//        return authorsList;
//    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
//    public void setAuthorsList(List<Author> authorsList) {
//        this.authorsList = authorsList;
//    }

    public void print() {
        System.out.println("The book name is: " + getName() + ", price is: " + getPrice());
        System.out.println("The name of author is: " + author.getName());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
        System.out.println("Application Context Aware " + this.context);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware " + s);
    }
}
