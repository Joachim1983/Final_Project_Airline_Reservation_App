package intec.joachim.flight.controller;

import intec.joachim.flight.data.User;
import intec.joachim.flight.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    //a Logger object is used to log messages for a specific system or application component
    private static final Logger LOGGER= LoggerFactory.getLogger(UserController.class);

    //use BCrypt password encoder? (Spring Security provides BCryptPasswordEncoder , and implementation of Spring's PasswordEncoder interface that uses the BCrypt strong hashing function to encode the password)
}
