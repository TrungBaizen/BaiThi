public class VIPMedicalRecord extends MedicalRecord{
    private String vipType;
    private String vipExpiration;

    public VIPMedicalRecord(String recordCode,String patientCode, String patientName, String admissionDate, String dischargeDate, String reason, String vipType, String vipExpiration) {
        super(recordCode,patientCode, patientName, admissionDate, dischargeDate, reason);
        this.vipType = vipType;
        this.vipExpiration = vipExpiration;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public String getVipExpiration() {
        return vipExpiration;
    }

    public void setVipExpiration(String vipExpiration) {
        this.vipExpiration = vipExpiration;
    }

    @Override
    String getAdditionalInfo() {
        return "VIP Type: " + vipType + ", VIP Expiration: " + vipExpiration.toString();
    }
}
