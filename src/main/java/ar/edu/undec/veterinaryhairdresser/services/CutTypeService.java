package ar.edu.undec.veterinaryhairdresser.services;

import ar.edu.undec.veterinaryhairdresser.controller.CutTypeController;
import ar.edu.undec.veterinaryhairdresser.dto.Response;
import ar.edu.undec.veterinaryhairdresser.model.CutTypeEntity;
import ar.edu.undec.veterinaryhairdresser.model.PetTypeEntity;
import ar.edu.undec.veterinaryhairdresser.repository.CutTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CutTypeService {

    @Autowired
    private CutTypeRepository cutTypeRepository;

    /// Get all cut types from the database
    public Response findAll() {
        Response response = new Response();
        try {
            response.setData(cutTypeRepository.findAll());
            response.setMessage("All cut types");
        } catch (Exception e){
            response.setMessage("An error has ocurred.");
        } return response;

    }

    /// Find a cut type by its ID
    public Response findById(Integer id) {
        Response response = new Response();

        try {
            response.setData(cutTypeRepository.findById(id));
            response.setMessage("Cut Type found.");
        } catch (Exception e) {
            response.setData("An error has ocurred");
        } return response;
    }

    /// Create a single cut type
    public Response create(CutTypeEntity cutType) {
        Response response = new Response();

        try {
            response.setData(cutTypeRepository.save(cutType));
            response.setMessage("Cut Type created.");
        } catch (Exception exception) {
            response.setMessage("An error has ocurred.");
        } return response;
    }


    /// Delete a cut type by its ID
    public Response deleteById(Integer cutTypeId) {

        Response response = new Response();

        try {
            cutTypeRepository.deleteById(cutTypeId);
            response.setMessage("cut type deleted.");
        } catch (Exception exception){
            response.setMessage("An error has ocurred.");
        } return response;
    }

    /// Update a cut type by its ID
    public Response updateById(CutTypeEntity cutType) {
        Response response = new Response();
        try {
            cutTypeRepository.save(cutType);
            response.setMessage("Cut Type updated.");
        } catch (Exception exception){
            response.setMessage("An error has ocurred.");
        } return response;
    }
}
