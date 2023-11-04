package br.dev.victor.todolist.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import br.dev.victor.todolist.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
