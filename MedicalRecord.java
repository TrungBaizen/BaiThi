abstract class MedicalRecord {
    protected int count = 0;
    protected int recordNumber ;
    protected String recordCode;
    protected String patientCode;
    protected String patientName;
    protected String admissionDate;
    protected String dischargeDate;
    protected String reason;

    public MedicalRecord(String recordCode , String patientCode, String patientName, String admissionDate, String dischargeDate, String reason) {
        this.recordNumber = ++count;
        this.recordCode = recordCode;
        this.patientCode = patientCode;
        this.patientName = patientName;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.reason = reason;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getRecordCode() {
        return recordCode;
    }

    public void setRecordCode(String recordCode) {
        this.recordCode = recordCode;
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    abstract String getAdditionalInfo();

    @Override
    public String toString() {
        return "MedicalRecord:" +
                "count=" + count +
                ", recordNumber=" + recordNumber +
                ", recordCode='" + recordCode + '\'' +
                ", patientCode='" + patientCode + '\'' +
                ", patientName='" + patientName + '\'' +
                ", admissionDate='" + admissionDate + '\'' +
                ", dischargeDate='" + dischargeDate + '\'' +
                ", reason='" + reason + '\'';
    }
}
