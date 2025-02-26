package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("GABRIEL NUNES");
        user.setUsername("gabrielnunes");
        user.setPassword("santos123");

        repository.save(user);

        List<User> users = repository.findAll();
        users.forEach(System.out::println);
    }
    private void insertUser(){
        User user = new User();
        user.setName("GABRIEL NUNES");
        user.setUsername("gabriel");
        user.setPassword("santos");
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
