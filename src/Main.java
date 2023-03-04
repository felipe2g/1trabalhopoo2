import Entities.Doctor;
import Entities.DoctorsAppointment;
import Entities.Pacient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Paciente
//        Medico
//        Consultas
        Pacient pacient1 = new Pacient("João JQuery", new Date());
        Doctor doctor1 = new Doctor("Doctor AJAX", "111111", "Consulta de rotas");
        Pacient pacient2 = new Pacient("Maluco do Bradesco", new Date());

        DoctorsAppointment consulta1 = new DoctorsAppointment(doctor1, pacient1, new Date());
        DoctorsAppointment consulta2 = new DoctorsAppointment(doctor1, pacient2, new Date());

        System.out.println(consulta1);

        consulta1.cancelAppointment("Pinéu da cabeça com as rotas");

        System.out.println(consulta1);

        System.out.println(consulta2);

        consulta2.finishAppoitment("O cara estava maluco fazendo rotas o dia inteiro");

        System.out.println(consulta2);


    }
}