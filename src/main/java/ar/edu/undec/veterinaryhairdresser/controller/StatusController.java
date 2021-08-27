package ar.edu.undec.veterinaryhairdresser.controller;

import ar.edu.undec.veterinaryhairdresser.dto.Response;
import ar.edu.undec.veterinaryhairdresser.dto.Status;
import ar.edu.undec.veterinaryhairdresser.model.StatusEntity;
import ar.edu.undec.veterinaryhairdresser.services.StatusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    StatusServices statusServices;

    @RequestMapping()
    public ResponseEntity<Response> list(){
        Response response = new Response();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    ///Get all the appointment's status in the DataBase
    @GetMapping("/getall")
    public ResponseEntity<Response> FindAll(){
        Response response = statusServices.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    ///Get a single status by its ID
    @GetMapping(value = "/getbyid/{id}")
    public ResponseEntity <Response> getById(@PathVariable Integer id){
        Response response = statusServices.findById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    ///Create a single appointment's status
    @PostMapping("/create")
    public ResponseEntity<Response> create(@Valid @RequestBody StatusEntity statusEntity) {
        Response response = statusServices.create(statusEntity);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PutMapping("/updatebyid/{id}")
    ResponseEntity<Response> updateById(@PathVariable(value = "id") Integer statusId,
                                        @Valid @RequestBody StatusEntity statusEntity) {
        Response response = statusServices.updateById(statusEntity);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }





    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<Response> deleteById(@PathVariable(value="id") Integer statusId){
        Response response = statusServices.deleteById(statusId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
