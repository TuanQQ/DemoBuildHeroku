package com.example.demo.service;

import com.example.demo.model.TaskDVO;
import com.example.demo.model.UserDvo;
import com.example.demo.repository.TaskRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final TaskRepository taskRepository;

    @Autowired
    public UserService(UserRepository userRepository, TaskRepository taskRepository) {
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
    }

    public List<UserDvo> getAllUsers() {
        return userRepository.findAll();
    }

    public List<TaskDVO> getAllTask(String userId) {
        return taskRepository.getTasksWithUserName(userId);
    }


}
