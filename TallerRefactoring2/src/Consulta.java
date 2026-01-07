import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class Consulta {
    /* Replace Data Value with Object */
    private LocalDateTime fechaHora;
    /* Encapsulate Field */
    private Paciente paciente;
    private Medico medico;
    private ServicioMedico servicioMedico;
    private boolean realizada;
    private String diagnostico;
    private String tratamiento;
    /* Encapsulate Collection */
    private List<String> examenesMedicos;

    
    public Consulta(
            LocalDateTime fechaHora,
            Paciente paciente,
            Medico medico,
            ServicioMedico servicioMedico,
            String diagnostico,
            String tratamiento,
            List<String> examenesMedicos
    ) {
        setFechaHora(fechaHora);
        setPaciente(paciente);
        setMedico(medico);
        setServicioMedico(servicioMedico);
        setDiagnostico(diagnostico);
        setTratamiento(tratamiento);
        setExamenesMedicos(examenesMedicos);
        this.realizada = false;
    }

    /* Self Encapsulate Field */
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        if (fechaHora == null) {
            throw new IllegalArgumentException("La fecha y hora no pueden ser nulas");
        }
        this.fechaHora = fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public ServicioMedico getServicioMedico() {
        return servicioMedico;
    }

    public void setServicioMedico(ServicioMedico servicioMedico) {
        this.servicioMedico = servicioMedico;
    }

    public boolean isRealizada() {
        return realizada;
    }

    /* Rename Method */
    public void marcarComoRealizada() {
        this.realizada = true;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public List<String> getExamenesMedicos() {
        return Collections.unmodifiableList(examenesMedicos);
    }

    public void setExamenesMedicos(List<String> examenesMedicos) {
        this.examenesMedicos = examenesMedicos;
    }
}
