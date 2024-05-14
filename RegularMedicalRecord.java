public class RegularMedicalRecord extends MedicalRecord{
    private double hospitalFee;

    public RegularMedicalRecord(String recordCode, String patientCode, String patientName, String admissionDate, String dischargeDate, String reason, double hospitalFee) {
        super(recordCode,patientCode, patientName, admissionDate, dischargeDate, reason);
        this.hospitalFee = hospitalFee;
    }

    public double getHospitalFee() {
        return hospitalFee;
    }

    public void setHospitalFee(double hospitalFee) {
        this.hospitalFee = hospitalFee;
    }

    @Override
    String getAdditionalInfo() {
        return "Hospital Fee: " + hospitalFee + " VND";
    }
}
