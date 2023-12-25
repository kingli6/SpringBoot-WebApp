// package com.mytaskapp.tasks;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/api/tasks")
// public class TaskController {
// @Autowired
// private TaskService taskService;
//
// @GetMapping
// public List<Task> getAllTasks() {
// return taskService.getAllTasks();
// }

// @GetMapping("/{taskId}")
// public Task getTaskById(@PathVariable Long taskId) {
// return taskService.getTaskById(taskId).orElse(null);
// }

// @PostMapping
// public Task createTask(@RequestBody Task task) {
// return taskService.createTask(task);
// }

// @DeleteMapping("/{taskId}")
// public void deleteTask(@PathVariable Long taskId) {
// taskService.deleteTask(taskId);
// }
// }
