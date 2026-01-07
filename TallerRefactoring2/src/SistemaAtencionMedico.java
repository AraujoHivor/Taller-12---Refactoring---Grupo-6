import java.util.ArrayList;
import java.util.List;

public class SistemaAtencionMedico {

    private static final double DESCUENTO_ADULTO_MAYOR = 0.25;

    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<ServicioMedico> serviciosMedicos;

    public SistemaAtencionMedico() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.serviciosMedicos = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarServicioMedico(ServicioMedico servicioMedico) {
        serviciosMedicos.add(servicioMedico);
    }

    public void registrarConsulta(Paciente paciente, Consulta consulta) {
        double costoFinal = calcularValorFinalConsulta(consulta.getServicioMedico().getCosto(), paciente);
        System.out.println("Se han cobrado " + costoFinal + " dolares de su tarjeta de credito");
        paciente.getHistorialMedico().agregarConsulta(consulta);
    }

    public double calcularValorFinalConsulta(double costoConsulta, Paciente paciente) {
        if (paciente.esAdultoMayor()) {
            return costoConsulta - (costoConsulta * DESCUENTO_ADULTO_MAYOR);
        }
        return costoConsulta;
    }

    public <T> T obtenerPorNombre(List<T> lista, String nombre) {
        for (T elemento : lista) {
            if (elemento instanceof Paciente && ((Paciente) elemento).getNombre().equals(nombre))
                return elemento;
            if (elemento instanceof Medico && ((Medico) elemento).getNombre().equals(nombre))
                return elemento;
            if (elemento instanceof ServicioMedico && ((ServicioMedico) elemento).getNombre().equals(nombre))
                return elemento;
        }
        return null;
    }

    public Paciente obtenerPaciente(String nombrePaciente) {
        return obtenerPorNombre(pacientes, nombrePaciente);
    }

    public Medico obtenerMedico(String nombreMedico) {
        return obtenerPorNombre(medicos, nombreMedico);
    }

    public ServicioMedico obtenerServicioMedico(String nombreServicio) {
        return obtenerPorNombre(serviciosMedicos, nombreServicio);
    }
}

