package Entities;

import java.util.Date;

enum Status {
    OVERDUE,
    FINISHED,
    ONGOING,
    CANCELLED
}
public class DoctorsAppointment {
    Doctor doctor;
    Pacient pacient;
    Date date;
    Status appointmentStatus;
    String doctorsConclusion;
    String cancelReason;

    public DoctorsAppointment(Doctor doctor, Pacient pacient, Date date) {
        this.doctor = doctor;
        this.pacient = pacient;
        this.date = date;
    }

    public void cancelAppointment(String cancelReason) {
        this.cancelReason = cancelReason;
        this.appointmentStatus = Status.CANCELLED;
    }

    public void finishAppoitment(String conclusion) {
        this.appointmentStatus = Status.FINISHED;
        this.doctorsConclusion = conclusion;
    }

    @Override
    public String toString() {
        return "Consulta {" +
                "Médico = " + doctor.name +
                ", Paciente =" + pacient.name +
                ", Data =" + date +
                ", Status =" + appointmentStatus +
                ", Relatório médico ='" + doctorsConclusion + '\'' +
                ", Motivo do cancelamento ='" + cancelReason + '\'' +
                '}';
    }
}
