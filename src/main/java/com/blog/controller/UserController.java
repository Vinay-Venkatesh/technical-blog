package com.blog.controller;

import com.blog.service.UserService;
import java.util.ArrayList;
import com.blog.model.Post;
import com.blog.model.User;
import com.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private PostService postService;
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("users/login") // Get method
    public String login(){
        return "users/login"; // templates --> users --> login.html
    }

    @RequestMapping(value = "users/login", method=RequestMethod.POST)
    public String loginUser(User user) {
        userService.login(user);
        if(userService.login(user)) {
            return "redirect:/posts";
        }
        else {
            return "users/login";
        }
    }

    @RequestMapping(value = "users/logout", method=RequestMethod.POST)
    public String logout(Model model) {
        ArrayList<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts); // If this is not created the index page will not have any data.
        return "index";
    }
  
    @RequestMapping("users/registration")
    public String registration(){
        return "users/registration"; // templates --> users --> registration.html
    }

    @RequestMapping(value = "users/registration", method=RequestMethod.POST) // post method
    public String registration(User user) {
        return "users/login";
    }
}
