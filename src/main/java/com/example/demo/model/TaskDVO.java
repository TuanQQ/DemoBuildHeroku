package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "task")
public class TaskDVO {
    private  String id;
    private String name;
    private String user_id;
    private String des;

}
