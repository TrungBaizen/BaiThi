import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {
    private static final String FILE_PATH = "data/medical_records.csv";
    static List<MedicalRecord> listHopital = new ArrayList<>();

    public int checkMedicalRecordCode(String medicalRecordCode) {
        for (int i = 0; i < listHopital.size(); i++) {
            if (listHopital.get(i).getRecordCode().equals(medicalRecordCode)) {
                return i;
            }
        }
        return -1;
    }
}

