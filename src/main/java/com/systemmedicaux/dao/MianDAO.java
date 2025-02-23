import dao.PatientDAO;
import model.Patient;

public class Main {
    public static void main(String[] args) {
        PatientDAO patientDAO = new PatientDAO();

       
        Patient patient = new Patient(0, "Jean Dupont", "jean.dupont@mail.com", "0612345678");
        patientDAO.ajouterPatient(patient);

 
        for (Patient p : patientDAO.getPatients()) {
            System.out.println(p.getNom() + " - " + p.getEmail());
        }
    }
}


public class Main {
    public static void main(String[] args) {
        RendezVousDAO rendezVousDAO = new RendezVousDAO();

    
        RendezVous rdv = new RendezVous(0, new Date(), Time.valueOf("10:30:00"), "Consultation Générale", "Confirmé");
        rendezVousDAO.ajouterRendezVous(rdv);

      
        for (RendezVous r : rendezVousDAO.getRendezVous()) {
            System.out.println(r.getId() + " | " + r.getDate() + " | " + r.getHeure() + " | " + r.getMotif());
        }
    }
}
