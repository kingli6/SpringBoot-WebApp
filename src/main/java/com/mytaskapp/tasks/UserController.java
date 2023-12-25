// package com.mytaskapp.tasks;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/api/users")
// public class UserController {
// @Autowired
// private TaskService taskService;

// @GetMapping
// public List<User> getAllUsers() {
// return taskService.getAllUsers();
// }

// @GetMapping("/{userId}")
// public User getUserById(@PathVariable Long userId) {
// return taskService.getUserById(userId).orElse(null);
// }

// @PostMapping
// public User createUser(@RequestBody User user) {
// return taskService.createUser(user);
// }

// @DeleteMapping("/{userId}")
// public void deleteUser(@PathVariable Long userId) {
// taskService.deleteUser(userId);
// }
// }
