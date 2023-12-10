package com.example.demo.user;

import com.example.demo.model.TaskDVO;
import com.example.demo.service.UserService;
import com.example.demo.model.UserDvo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/hi")
    @ResponseBody
    public List<UserDvo> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "/getTask/{userId}")
    @ResponseBody
    public List<TaskDVO> getAllTask(@PathVariable String userId) {
        return userService.getAllTask(userId);
    }
}
