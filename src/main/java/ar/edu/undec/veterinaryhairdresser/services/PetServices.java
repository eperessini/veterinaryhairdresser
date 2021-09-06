package ar.edu.undec.veterinaryhairdresser.services;


import ar.edu.undec.veterinaryhairdresser.dto.Response;
import ar.edu.undec.veterinaryhairdresser.model.PetEntity;
import ar.edu.undec.veterinaryhairdresser.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetServices{

    @Autowired
    PetRepository petRepository;


    // Get all pets
    public Response findAll() {
        Response response = new Response();
        try {
            response.setData(petRepository.findAll());
            response.setMessage("Pets found.");
        } catch (Exception e) {
            response.setData("An error ocurred.");
        } return response;

    }

    public Response getById(Integer id) {
        Response response = new Response();
        try {
            response.setData(petRepository.findById(id));
            response.setMessage("Pet found.");
        } catch (Exception e) {
            response.setMessage("Pet not found.");
        } return response;
    }

    public Response create(PetEntity pet) {
        Response response = new Response();

        try {
            if (petRepository.existsById(pet.getId())) {
                response.setMessage("Pet ID already exists.");
            }else{
                petRepository.save(pet);
                response.setMessage("Pet saved.");
            }
        } catch (Exception e){
            response.setMessage("Pet couldn't be saved.");
        } return response;
    }

    public Response deleteById(Integer id) {
        Response response = new Response();
        try{
            if (petRepository.existsById(id)) {
                petRepository.deleteById(id);
                response.setMessage("Pet Deleted.");
            } else {
                response.setMessage("The pet ID doesn't exists.");
            }
        } catch (Exception e) {
            response.setMessage("An error has ocurred.");
        } return response;
    }

    public Response updateById(PetEntity pet) {
        Response response = new Response();

        try {
            petRepository.save(pet);
            response.setMessage("Pet Saved.");

        } catch (Exception e) {
            response.setMessage("Can't save the pet.");
        } return response;
    }
}
