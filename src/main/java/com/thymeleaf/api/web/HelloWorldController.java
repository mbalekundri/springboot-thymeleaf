package com.thymeleaf.api.web;

import com.thymeleaf.api.model.Employee;
import com.thymeleaf.api.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello world");
        return "helloworld";
    }

    @GetMapping("/style")
    public String style() {
        return "add-css-js-demo";
    }

    @GetMapping("/bootstrap")
    public String bootstrap() {
        return "add-bootstrap";
    }

    @GetMapping("/iteration")
    public String iteration(Model model) {
        List<Employee> employees = new ArrayList<>();
        employees.add(Employee.builder().name("Rohit").age(43).phone("9740911665").build());
        employees.add(Employee.builder().name("Ratika").age(33).phone("9740911665").build());
        employees.add(Employee.builder().name("Rashmika").age(3).phone("9740911665").build());
        model.addAttribute("employeesData", employees);
        return "iteration";
    }

    @GetMapping("/if-unless")
    public String ifUnless(Model model) {
        List<User> users = new ArrayList<>();
        users.add(User.builder().username("Rohit").role("ADMIN").phone("9740911665").build());
        users.add(User.builder().username("Ratika").role("MANAGER").phone("9740911665").build());
        users.add(User.builder().username("Rashmika").role("Others").phone("9740911665").build());
        model.addAttribute("usersData", users);
        return "if-unless";
    }

    @GetMapping("/switch")
    public String switchCase(Model model) {
        List<User> users = new ArrayList<>();
        users.add(User.builder().username("Rohit").role("ADMIN").phone("9740911665").build());
        users.add(User.builder().username("Ratika").role("MANAGER").phone("9740911665").build());
        users.add(User.builder().username("Rashmika").role("Others").phone("9740911665").build());
        model.addAttribute("usersData", users);
        return "switch";
    }
}
