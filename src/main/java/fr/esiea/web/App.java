package fr.esiea.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
 
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args); 
    }
}
