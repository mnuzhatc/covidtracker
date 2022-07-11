package com.nuzhat.covidtracker.controllers;

import com.nuzhat.covidtracker.models.LocationStats;
import com.nuzhat.covidtracker.services.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CovidDataService cvData;

    @GetMapping("/") //root URL
    public String home(Model model) {
        List<LocationStats> allStats = cvData.getAllStats();
        int totalCases = allStats.stream().mapToInt(stat -> stat.getNewTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalCases);
        model.addAttribute("totalNewCases", totalNewCases);
        
        return "home"; //name binding to template, mapped to HTML file
    }
}
