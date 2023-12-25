// package com.mytaskapp.tasks;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;
// import java.util.Optional;

// @Service
// public class TaskService {
// private final TaskRepository taskRepository;

// @Autowired
// public TaskService(TaskRepository taskRepository) {
// this.taskRepository = taskRepository;
// }

// public List<Task> getAllTasks() {
// return taskRepository.findAll();
// }

// public Optional<Task> getTaskById(Long taskId) {
// return taskRepository.findById(taskId);
// }

// public Task createTask(Task task) {
// return taskRepository.save(task);
// }

// public void deleteTask(Long taskId) {
// taskRepository.deleteById(taskId);
// }
// }
