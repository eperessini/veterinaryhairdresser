package ar.edu.undec.veterinaryhairdresser.controller;


import ar.edu.undec.veterinaryhairdresser.dto.Response;
import ar.edu.undec.veterinaryhairdresser.model.PetEntity;
import ar.edu.undec.veterinaryhairdresser.services.PetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetServices petServices;
    private static final Logger LOG = LoggerFactory.getLogger(PetController.class);


    @RequestMapping("/")
    public ResponseEntity<Response> list(){
        Response response = new Response();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/getall")
    public ResponseEntity<Response> getAll(){
        Response response = petServices.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<Response> getById(@PathVariable Integer id){
        Response response = petServices.getById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Response> create(@RequestBody PetEntity pet){
        LOG.info("Create a pet");
        Response response = petServices.create(pet);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<Response> deleteById(@PathVariable Integer id){
        Response response = petServices.deleteById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/updatebyid/{id}")
    public ResponseEntity<Response> updateById(@PathVariable(value = "id") Integer id, @RequestBody PetEntity pet){
        Response response = petServices.updateById(pet);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }


}
