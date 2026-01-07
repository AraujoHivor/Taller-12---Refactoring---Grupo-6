public class Paciente extends Persona {

    private static final int EDAD_ADULTO_MAYOR = 65;

    private HistorialMedico historialMedico;

    public Paciente(String nombre, int edad, String genero, String direccion,
                    String telefono, String correoElectronico) {
        super(nombre, edad, genero, direccion, telefono, correoElectronico);
        this.historialMedico = new HistorialMedico();
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public boolean esAdultoMayor() {
        return getEdad() >= EDAD_ADULTO_MAYOR;
    }
}
