package ar.edu.undec.veterinaryhairdresser.services;


import ar.edu.undec.veterinaryhairdresser.dto.Response;
import ar.edu.undec.veterinaryhairdresser.model.AppointmentEntity;
import ar.edu.undec.veterinaryhairdresser.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServices {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public Response findAll() {
        Response response = new Response();
        try {
            response.setData(appointmentRepository.findAll());
            response.setMessage("Appointments found.");
        } catch (Exception e) {
            response.setData("An error ocurred.");
        } return response;
    }

    public Response getById(Integer id) {
        Response response = new Response();
        try {
            response.setData(appointmentRepository.findById(id));
            response.setMessage("Appointment found.");
        } catch (Exception e) {
            response.setMessage("An error ocurred.");
        } return response;
    }

    public Response create(AppointmentEntity appointment) {
        Response response = new Response();
        try {
            appointmentRepository.save(appointment);
            response.setMessage("Appointment saved.");
        } catch (Exception e){
            response.setMessage("An error ocurred.");
        } return response;
    }

    public Response deleteById(Integer id) {
        Response response = new Response();
        try{
            appointmentRepository.deleteById(id);
            response.setMessage("Appointment Deleted.");
        } catch (Exception e) {
            response.setMessage("An error has ocurred.");
        } return response;
    }

    public Response updateById(AppointmentEntity appointment) {
        Response response = new Response();

        try {
            appointmentRepository.save(appointment);
            response.setMessage("Appointment modified.");

        } catch (Exception e) {
            response.setMessage("Can't save the pet.");
        } return response;
    }
}
