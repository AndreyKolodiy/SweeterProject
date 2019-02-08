package com.example.StadyProject.Repos;

import com.example.StadyProject.Domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Андрей on 05.02.2019.
 */
public interface MessageRepo extends CrudRepository< Message, Long> {
    List<Message> findByTag(String tag);
}
