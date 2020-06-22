package com.win.subscriberlist.subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SubscriberController {

    // getting one thing to another, controller and repository
    @Autowired
    private SubscriberRepository subscriberRepository;
    // Tells our application what template to return at a specific url
    @GetMapping
    public String index(Subscriber subscriber){
        return "subscriber/index";
    }

    // takes the data entered in the form and adds it to the database
    // Posts the data then displays a new template called "result"
    private Subscriber subscriber;
    @PostMapping
    public String addNewSubscriber(Subscriber subscriber, Model model){
        subscriberRepository.save(new Subscriber(subscriber.getFirstName(), subscriber.getLastName(), subscriber.getUserName(), subscriber.getSignedUp()));
        model.addAttribute("firstName", subscriber.getFirstName());
        model.addAttribute("lastName", subscriber.getLastName());
        model.addAttribute("userName", subscriber.getUserName());

        return "subscriber/result";
    }


}