/*
Controller is now responsible only for processing the user request and returning the required view name and model. 
It uses the PostService class to get the required data to respond to the client request.
*/

package com.blog.controller;

import com.blog.model.Post;
import com.blog.service.PostService;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private PostService postService; // Dependency Injection(Instance Variable)
    
    @RequestMapping("/")
    public String getAllPosts(Model model){
        
        ArrayList<Post> posts = postService.getAllPosts();

        /*Inbuild model object to constust model , which is imported from org.springframework.ui.Model
            always a model object is passed from controller to view so we are using inbuilt model for now.. 
        */
        model.addAttribute("posts",posts); 
        
        return "index";
    }
}