package com.example.autoheroback.achat;


import com.example.autoheroback.utilisateur.UtilisateurRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="api/v1/achat")

public class AchatController {

    private final AchatService achatService;

    @Autowired
    public AchatController(AchatService achatService) {
        this.achatService = achatService;
    }

    @PostMapping(path = "new",  consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> add (@RequestBody Achat achat){

        String result = achatService.SaveAndSendMail(achat);

        System.out.println(result);

        if(result == "OK") {
            return new ResponseEntity(HttpStatus.CREATED);
        }else{
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping(path = "all")
    public Iterable<Achat> getAllAchats(@RequestBody UtilisateurRequest request) {
        return achatService.getAllAchat();
    }
}
