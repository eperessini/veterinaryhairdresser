package ar.edu.undec.veterinaryhairdresser.dto;

public class Response {

    private Integer status;
    private String message;
    private Object data;

    public Response() {
        this.status = 0;
        this.message = "";
    }

    public Response(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
