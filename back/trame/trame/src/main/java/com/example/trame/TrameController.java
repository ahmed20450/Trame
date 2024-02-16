package com.example.trame;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TrameController {

    @PostMapping("/envoyer_trame")
    public String envoyerTrame(@RequestBody Trame trame) {
        // Envoyer la trame à la destination souhaitée
        return "Trame envoyée avec succès !";
    }
}
