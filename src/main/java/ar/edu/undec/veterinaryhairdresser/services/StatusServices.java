package ar.edu.undec.veterinaryhairdresser.services;


import ar.edu.undec.veterinaryhairdresser.dto.Response;
import ar.edu.undec.veterinaryhairdresser.dto.Status;
import ar.edu.undec.veterinaryhairdresser.model.StatusEntity;
import ar.edu.undec.veterinaryhairdresser.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class StatusServices {

    @Autowired
    private StatusRepository statusRepository;


    public Response findAll(){
        Response response = new Response();
        try {
            response.setData(statusRepository.findAll());
        } catch (Exception e) {

        }
        return response;
    }


    public Response findById(Integer id) {
        Response response = new Response();
        try {
            response.setData(statusRepository.findById(id).get());
            response.setMessage("Status found.");
        } catch (Exception e) {
            response.setMessage("Status not found.");
        }
        return response;
    }

    public Response save(StatusEntity statusEntity) {
        Response response = new Response();
        try {
            response.setData(statusRepository.save(statusEntity));
            response.setMessage("Status successfully created.");
        } catch (Exception e) {

        }
        return response;
    }


    public Response deleteById(Integer id) {

        Response response = new Response();

        try{
            statusRepository.delete(statusRepository.getById(id));
            response.setData("ok");
            response.setMessage("The status was deleted.");
        } catch (Exception e) {

        }
        return response;
    }


    public Response createStatus(Object input) {
        Response response = new Response();

        try{


        } catch (Exception e) {

        }
        return response;
    }

    public Response updateById(StatusEntity statusEntity) {

        Response response = new Response();
        try{

            statusRepository.save(statusEntity);
            response.setMessage("The status was updated");

        } catch (Exception e) {
            response.setMessage("The status wasn't updated");
        } return response;
    }
}
