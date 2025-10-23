import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime datetime = LocalDateTime.parse(appointmentDateDescription,formatter);
        return datetime;

    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime currentDateTime = LocalDateTime.now();
         return appointmentDate.isBefore(currentDateTime);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return (hour >= 12) && (hour <18);
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a", Locale.US);
        String formattedDateTime = appointmentDate.format(formatter);
        return "You have an appointment on " + formattedDateTime + ".";

    }

    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDateTime.now().getYear();
        return LocalDate.of(currentYear,9,15);
    }
}
