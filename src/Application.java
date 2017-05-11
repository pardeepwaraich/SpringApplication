import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by parde on 5/10/2017.
 */
public class Application {

    public static void main(String args[]) {

//        Book book = new Book();
//        book.setName("ABC");
//        book.setPrice(23.5f);

//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("springConfig.xml"));

        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");

        Book book = (Book) context.getBean("book");

        book.print();

    }

}
