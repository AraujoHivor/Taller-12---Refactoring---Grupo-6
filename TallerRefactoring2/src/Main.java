import java.time.LocalDateTime;

public class Main {

    private static SistemaAtencionMedico sistemaAtencionMedica;

    public static void main(String[] args) {
        inicializarSistema();
        Paciente paciente = sistemaAtencionMedica.obtenerPaciente("Dario");
        ServicioMedico servicioMedico = sistemaAtencionMedica.obtenerServicioMedico("Psiquiatria");
        Medico medico = sistemaAtencionMedica.obtenerMedico("Nohelia");

        LocalDateTime fechaHoraConsulta = LocalDateTime.of(2002, 5, 5, 12, 5);

        Consulta consulta = new Consulta(
        fechaHoraConsulta,
        paciente,
        medico,
        servicioMedico,
        "dvasdv",
        "asdvas",
        null
);

        sistemaAtencionMedica.registrarConsulta(paciente, consulta);
    }

    private static void inicializarSistema() {
        sistemaAtencionMedica = new SistemaAtencionMedico();

        Paciente paciente = new Paciente(
                "Dario", 21, "Masculino",
                "Floresta 2", "0948759754",
                "dlaborde@espol.edu.ec"
        );

        Medico medico = new Medico(
                "Nohelia", 20, "Femenino",
                "Duran", "0991459625",
                "nohePasaca@espol.edu.ec"
        );

        ServicioMedico servicioMedico = new ServicioMedico(
                "Psiquiatria",
                "rama que trata problemas mentales",
                45.5,
                40
        );

        sistemaAtencionMedica.agregarPaciente(paciente);
        sistemaAtencionMedica.agregarMedico(medico);
        sistemaAtencionMedica.agregarServicioMedico(servicioMedico);
    }
}

