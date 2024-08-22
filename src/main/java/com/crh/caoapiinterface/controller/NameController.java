package com.crh.caoapiinterface.controller;

import com.crh.caoapiinterface.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("name")
public class NameController {
    @GetMapping("/")
    public String getName(String name) {
        return "get你的名字是" + name;
    }

    @PostMapping("/")
    public String postName(@RequestParam String name) {
        return "post你的名字是" + name;
    }

    @PostMapping("/user")
    public String getNamesByUser(@RequestBody User user) {
        return "post用户的名字是" + user.getName();
    }
}
