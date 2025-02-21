import dao.PatientDAO;
import model.Patient;

public class Main {
    public static void main(String[] args) {
        PatientDAO patientDAO = new PatientDAO();

        // Ajouter un patient
        Patient patient = new Patient(0, "Jean Dupont", "jean.dupont@mail.com", "0612345678");
        patientDAO.ajouterPatient(patient);

        // Afficher les patients
        for (Patient p : patientDAO.getPatients()) {
            System.out.println(p.getNom() + " - " + p.getEmail());
        }
    }
}
