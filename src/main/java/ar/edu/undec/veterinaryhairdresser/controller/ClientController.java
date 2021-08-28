package ar.edu.undec.veterinaryhairdresser.controller;


import ar.edu.undec.veterinaryhairdresser.dto.Response;
import ar.edu.undec.veterinaryhairdresser.model.ClientEntity;
import ar.edu.undec.veterinaryhairdresser.model.PetEntity;
import ar.edu.undec.veterinaryhairdresser.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")

public class ClientController {
    @Autowired
    private ClientServices clientServices;

    @RequestMapping()
    public ResponseEntity<Response> list(){
        Response response = new Response();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/getall")
    public ResponseEntity<Response> getAll(){
        Response response = clientServices.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<Response> getById(@PathVariable Integer id){
        Response response = clientServices.getById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Response> create(@RequestBody ClientEntity client){
        Response response = clientServices.create(client);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<Response> deleteById(@PathVariable Integer id){
        Response response = clientServices.deleteById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/updatebyid/{id}")
    public ResponseEntity<Response> updateById(@PathVariable(value = "id") Integer id, @RequestBody ClientEntity client){
        Response response = clientServices.updateById(client);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
