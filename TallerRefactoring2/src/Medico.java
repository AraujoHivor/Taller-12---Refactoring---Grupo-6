public class Medico extends Persona {

    public Medico(String nombre, int edad, String genero, String direccion,
                  String telefono, String correoElectronico) {
        super(nombre, edad, genero, direccion, telefono, correoElectronico);
    }

    public void realizarConsulta(Paciente paciente) {
        System.out.println("Realizando consulta a " + paciente.getNombre());
        String tratamiento = "Conservador...";
        prescribirTratamiento(paciente, tratamiento);
    }

    // Método interno: no debe ser accesible desde otras clases
    private void prescribirTratamiento(Paciente paciente, String tratamiento) {
        System.out.println("Prescribiendo tratamiento: " + tratamiento);
    }

    public void administrarMedicamento(Paciente paciente, String medicamento) {
        // Implementación para administrar medicamentos al paciente.
    }
}

