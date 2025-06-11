package org.example.restaurantproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class paintController {

        @GetMapping("/index")
        public String home() {
            return "index";
        }

        @GetMapping("/menu")
        public String menu() {
            return "menu";
        }

        @GetMapping("/about")
        public String about() {
            return "about";
        }

        @GetMapping("/cart")
        public String cart() {
            return "cart";
        }

        @GetMapping("/contacts")
        public String contacts() {
            return "contacts";
        }

        @GetMapping("/feedback")
        public String feedback() {
            return "feedback";
        }

        @GetMapping("/profile")
        public String profile() {
            return "profile";
        }

        @GetMapping("/drinks")
        public String drinks() {
            return "drinks";
        }

        @GetMapping("/burgers")
        public String burgers() {
            return "burgers";
        }

        @GetMapping("/pizzas")
        public String pizzas() {
            return "pizzas";
        }

        @GetMapping("/salads")
        public String salads() {
            return "salads";
        }
}

