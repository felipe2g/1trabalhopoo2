import Entities.Doctor;
import Entities.DoctorsAppointment;
import Entities.Pacient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Pessoa 1", new Date());
        Doctor doctor1 = new Doctor("Doutor 1", "111111", "Endocrinologia");
        Pacient pacient2 = new Pacient("Paciente 2", new Date());

        DoctorsAppointment consulta1 = new DoctorsAppointment(doctor1, pacient1, new Date());
        DoctorsAppointment consulta2 = new DoctorsAppointment(doctor1, pacient2, new Date());

        System.out.println(consulta1);

        consulta1.cancelAppointment("Dor de cabeça");

        System.out.println(consulta1);

        System.out.println(consulta2);

        consulta2.finishAppoitment("Estava trabalhando muito");

        System.out.println(consulta2);
    }
}
