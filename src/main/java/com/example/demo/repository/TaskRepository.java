package com.example.demo.repository;

import com.example.demo.model.TaskDVO;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TaskRepository extends MongoRepository<TaskDVO, String> {
    @Query(value = "{ 'user_id': ?0 }", fields = "{ 'task_name': 1, 'des': 1, 'user.name': 1 }")
    List<TaskDVO> getTasksWithUserName(String userId);
}
