package ar.edu.undec.veterinaryhairdresser.services;


import ar.edu.undec.veterinaryhairdresser.dto.Response;
import ar.edu.undec.veterinaryhairdresser.model.ClientEntity;
import ar.edu.undec.veterinaryhairdresser.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServices {

    @Autowired
    private ClientRepository clientRepository;

    public Response findAll() {
        Response response = new Response();
        try {
            response.setData(clientRepository.findAll());
            response.setMessage("Clients found.");
        } catch (Exception e) {
            response.setData("An error ocurred.");
        } return response;
    }

    public Response getById(Integer id) {
        Response response = new Response();
        try {
            response.setData(clientRepository.findById(id));
            response.setMessage("Client found.");
        } catch (Exception e) {
            response.setMessage("Client not found.");
        } return response;
    }

    public Response create(ClientEntity client) {
        Response response = new Response();
        try {
            clientRepository.save(client);
            response.setMessage("Client saved.");
        } catch (Exception e){
            response.setMessage("Client couldn't be saved.");
        } return response;
    }

    public Response deleteById(Integer id) {
        Response response = new Response();
        try{
            clientRepository.deleteById(id);
            response.setMessage("Client Deleted.");
        } catch (Exception e) {
            response.setMessage("An error has ocurred.");
        } return response;
    }

    public Response updateById(ClientEntity client) {
        Response response = new Response();

        try {
            clientRepository.save(client);
            response.setMessage("Client modified.");

        } catch (Exception e) {
            response.setMessage("Can't save the pet.");
        } return response;
    }

}


