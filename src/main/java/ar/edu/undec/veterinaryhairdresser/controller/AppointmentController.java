package ar.edu.undec.veterinaryhairdresser.controller;

import ar.edu.undec.veterinaryhairdresser.dto.Response;
import ar.edu.undec.veterinaryhairdresser.model.AppointmentEntity;
import ar.edu.undec.veterinaryhairdresser.model.ClientEntity;
import ar.edu.undec.veterinaryhairdresser.services.AppointmentServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private AppointmentServices appointmentServices;

    @RequestMapping()
    public ResponseEntity<Response> list(){
        Response response = new Response();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/getall")
    public ResponseEntity<Response> getAll(){
        Response response = appointmentServices.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<Response> getById(@PathVariable Integer id){
        Response response = appointmentServices.getById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Response> create(@RequestBody AppointmentEntity appointment){
        Response response = appointmentServices.create(appointment);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<Response> deleteById(@PathVariable Integer id){
        Response response = appointmentServices.deleteById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/updatebyid/{id}")
    public ResponseEntity<Response> updateById(@PathVariable(value = "id") Integer id, @RequestBody AppointmentEntity appointment){
        Response response = appointmentServices.updateById(appointment);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
