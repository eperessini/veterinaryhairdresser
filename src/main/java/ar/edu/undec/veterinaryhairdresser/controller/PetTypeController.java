package ar.edu.undec.veterinaryhairdresser.controller;


import ar.edu.undec.veterinaryhairdresser.dto.Response;
import ar.edu.undec.veterinaryhairdresser.model.PetTypeEntity;
import ar.edu.undec.veterinaryhairdresser.services.PetTypeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pettype")
public class PetTypeController {

    @Autowired
    private PetTypeServices petTypeServices;

    @RequestMapping()
    public ResponseEntity<Response>list(){
        Response response = new Response();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/findall")
    public ResponseEntity<Response>findAll(){
        Response response = petTypeServices.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Response>findById(@PathVariable Integer id){
        Response response = petTypeServices.findById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PostMapping("create")
    public ResponseEntity<Response>create(@RequestBody PetTypeEntity petType){
        Response response = petTypeServices.create(petType);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<Response>deleteById(@PathVariable Integer petTypeId){
        Response response = petTypeServices.deleteById(petTypeId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PutMapping("/updatebyid/{id}")
    public ResponseEntity<Response>updateById(@PathVariable(value="id") Integer petTypeId,
                                              PetTypeEntity petType){
        Response response = petTypeServices.updateById(petType);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
