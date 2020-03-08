package main;

public enum Mensajes {

    PETICION_RADIO ( "ingresa el radio del cículo:"),
    MENSAJE_RESPUESTA("EL area del círculo es:");
    private  String mensaje;

    Mensajes(String s) {
        this.mensaje=s;

    }

    public String getMensaje() {
        return mensaje;
    }
}
