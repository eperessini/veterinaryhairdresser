package ar.edu.undec.veterinaryhairdresser.controller;

import ar.edu.undec.veterinaryhairdresser.dto.Response;
import ar.edu.undec.veterinaryhairdresser.model.CutTypeEntity;
import ar.edu.undec.veterinaryhairdresser.model.PetTypeEntity;
import ar.edu.undec.veterinaryhairdresser.services.CutTypeService;
import ar.edu.undec.veterinaryhairdresser.services.PetTypeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cuttype")

public class CutTypeController {
    @Autowired
    private CutTypeService cutTypeService;

    @RequestMapping()
    public ResponseEntity<Response> list(){
        Response response = new Response();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/findall")
    public ResponseEntity<Response>findAll(){
        Response response = cutTypeService.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Response>findById(@PathVariable Integer id){
        Response response = cutTypeService.findById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PostMapping("create")
    public ResponseEntity<Response>create(@RequestBody CutTypeEntity cutType){
        Response response = cutTypeService.create(cutType);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<Response>deleteById(@PathVariable Integer cutTypeId){
        Response response = cutTypeService.deleteById(cutTypeId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PutMapping("/updatebyid/{id}")
    public ResponseEntity<Response>updateById(@PathVariable(value="id") Integer cutTypeId,
                                              CutTypeEntity cutType){
        Response response = cutTypeService.updateById(cutType);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
