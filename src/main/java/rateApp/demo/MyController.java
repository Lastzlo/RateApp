package rateApp.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import rateApp.demo.model.Rate;

@Controller
public class MyController {

    private final RestTemplate restTemplate;

    public MyController (RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getRate")
    public String getRate(Model model) {

        ResponseEntity<Rate[]> response =
                restTemplate.getForEntity(
                        "https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5",
                        Rate[].class);
        Rate[] list = response.getBody();

        model.addAttribute("rates", list);
        return "getRate";
    }




}
