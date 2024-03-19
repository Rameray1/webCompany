package Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.webcompany.service.UserService;
import com.example.webcompany.entity.User;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test(@RequestBody User user) {
        return userService.test(user);
    }

}
