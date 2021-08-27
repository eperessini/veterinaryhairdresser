package ar.edu.undec.veterinaryhairdresser.controller;

import ar.edu.undec.veterinaryhairdresser.dto.Response;
import ar.edu.undec.veterinaryhairdresser.model.SizeEntity;
import ar.edu.undec.veterinaryhairdresser.services.SizeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sizes")
public class SizeController {

    @Autowired
    private SizeServices sizeServices;


    @RequestMapping()
    public ResponseEntity<Response> list(){
        Response response = new Response();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @GetMapping("/findall")
    public ResponseEntity<Response> findAll(){
        Response response = sizeServices.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Response> findById(@PathVariable Integer id){
        Response response = sizeServices.findById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Response> create(@PathVariable (value="id")Integer id, SizeEntity size) {
        Response response = sizeServices.save(size);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/updateById/{id}")
    public ResponseEntity<Response> updateById(@PathVariable (value="id")Integer id, SizeEntity size){
        Response response = sizeServices.save(size);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/deletebyid")
    public ResponseEntity<Response> deleteById(@PathVariable Integer id){
        Response response = sizeServices.deleteById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
