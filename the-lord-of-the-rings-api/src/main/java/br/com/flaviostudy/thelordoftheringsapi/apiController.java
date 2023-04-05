package br.com.flaviostudy.thelordoftheringsapi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class apiController {
    
    private List<Character> Fellowship = 
        List.of(
            new Character("Gandalf", "https://br.web.img2.acsta.net/r_1920_1080/medias/nmedia/18/87/86/02/19973435.jpg", "Wizard"),
            new Character("Legolas", "https://br.web.img3.acsta.net/r_1920_1080/medias/nmedia/18/87/86/02/19973434.jpg", "Fighter")
        );
    
    @GetMapping(value="/hello-world")
    public String printaHelloWorld() {
        return "Hello, World!";
    } 

        
    @GetMapping("/fellowship")
    public List<Character> getFellowship() {
       return Fellowship; 
    }

}
