import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat1 = (Cat) applicationContext.getBean("Cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("Cat");

        System.out.println(beanCat1.equals(beanCat2));
        System.out.println(bean.equals(bean1));


    }
}