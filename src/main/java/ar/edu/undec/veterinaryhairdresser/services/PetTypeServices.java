package ar.edu.undec.veterinaryhairdresser.services;

import ar.edu.undec.veterinaryhairdresser.dto.Response;
import ar.edu.undec.veterinaryhairdresser.model.PetTypeEntity;
import ar.edu.undec.veterinaryhairdresser.repository.PetRepository;
import ar.edu.undec.veterinaryhairdresser.repository.PetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServices {

    @Autowired
    private PetTypeRepository petTypeRepository;

    /// Get all pets from the database
    public Response findAll() {
        Response response = new Response();
        try {
            response.setData(petTypeRepository.findAll());
            response.setMessage("All pets");
        } catch (Exception e){
            response.setMessage("An error has ocurred.");
        } return response;

    }

    /// Find a pet type by its ID
    public Response findById(Integer id) {
        Response response = new Response();

        try {
            response.setData(petTypeRepository.findById(id));
            response.setMessage("Pet found.");
        } catch (Exception e) {
            response.setData("An error has ocurred");
        } return response;
    }

    /// Create a single pet
    public Response create(PetTypeEntity petType) {
        Response response = new Response();

        try {
            response.setData(petTypeRepository.save(petType));
            response.setMessage("Pet created.");
        } catch (Exception exception) {
            response.setMessage("An error has ocurred.");
        } return response;
    }


    /// Delete a pet type by its ID
    public Response deleteById(Integer petTypeId) {

        Response response = new Response();

        try {
            petTypeRepository.deleteById(petTypeId);
            response.setMessage("Pet type deleted.");
        } catch (Exception exception){
            response.setMessage("An error has ocurred.");
        } return response;
    }

    /// Update a pet type by its ID
    public Response updateById(PetTypeEntity petType) {
        Response response = new Response();
        try {
            petTypeRepository.save(petType);
            response.setMessage("Pet updated.");
        } catch (Exception exception){
            response.setMessage("An error has ocurred.");
        } return response;
    }
}
