package ru.mirea.cursework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.mirea.cursework.entity.Report;
import ru.mirea.cursework.entity.User;
import ru.mirea.cursework.repos.ReportRepos;
import ru.mirea.cursework.repos.UserRepos;

@Controller
public class Services {
    @Autowired
    ReportRepos Repos;
    @GetMapping("/")
    public String homepage(){
        return ("index");
    }
    @PostMapping("/")
    public String home(@RequestParam("theme") String Theme,
                       @RequestParam("name") String Name,
                       @RequestParam("email") String Mail,
                       @RequestParam("date") String Date,
                       @RequestParam("message") String Note){
        Report report = new Report();
        report.setServ(Theme);
        report.setName(Name);
        report.setMail(Mail);
        report.setDate(Date);
        report.setNote(Note);
        Repos.save(report);
        return ("index");
    }

}
