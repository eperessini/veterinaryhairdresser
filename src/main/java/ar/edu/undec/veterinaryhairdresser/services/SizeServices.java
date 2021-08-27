package ar.edu.undec.veterinaryhairdresser.services;

import ar.edu.undec.veterinaryhairdresser.dto.Response;
import ar.edu.undec.veterinaryhairdresser.model.SizeEntity;
import ar.edu.undec.veterinaryhairdresser.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class SizeServices {

    @Autowired
    private SizeRepository sizeRepository;


    public Response findAll() {
        Response response = new Response();

        try{
            response.setData(sizeRepository.findAll());
        } catch (Exception exception) {
            response.setData("An error has ocurred.");
        } return response;

    }

    public Response findById(Integer id) {
        Response response = new Response();

        try{
            response.setData(sizeRepository.findById(id));
            response.setData("A size has been found.");
        } catch (Exception exception) {
            response.setData("An error has ocurred.");
        } return response;
    }

    public Response save(SizeEntity size) {
        Response response = new Response();

        try{
            sizeRepository.save(size);
            response.setMessage("Size saved.");
        } catch (Exception exception) {
            response.setMessage("An error has ocurred.");
        } return response;
    }

    public Response updateById(SizeEntity size) {
        Response response = new Response();

        try{
            sizeRepository.save(size);
            response.setMessage("Size updated.");
        } catch (Exception exception) {
            response.setMessage("An error has ocurred.");
        } return response;
    }

    public Response deleteById(Integer id) {
        Response response = new Response();

        try{
            sizeRepository.deleteById(id);
            response.setMessage("A size has been found.");
        } catch (Exception exception) {
            response.setData("An error has ocurred.");
        } return response;
    }
}
