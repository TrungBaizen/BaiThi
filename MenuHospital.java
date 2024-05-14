import java.util.ArrayList;
import java.util.List;

public class MenuHospital {
    HospitalManagementSystem hospitalManagementSystem = new HospitalManagementSystem();
    public void ShowMenu(){
        while (true){
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN--");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách các bệnh án");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng:");
            int choice = common.ScannerInteger();
            switch (choice){
                case 1:
                    showAdd();
                    break;
                case 2:
                    showRemove();
                    break;
                case 3:
                    showAllList();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Không có chức năng này");
                    break;
            }
        }
    }
    public void showAdd(){
        System.out.println("Thêm mới bệnh án");
        System.out.println("1.Bệnh án thường");
        System.out.println("2.Bệnh án Vip");
        System.out.println("3.Thoát");
        System.out.println("Nhập lựa chọn:");
        int choice = common.ScannerInteger();
        switch (choice){
            case 1:
                showAddNormal();
                break;
            case 2:
                showAddVip();
                break;
            case 3:
                showAllList();
                return;
            default:
                System.out.println("Không có loại bệnh án này");
                break;
        }
    }
    public void showAddVip(){
        System.out.println("Nhập mã bệnh án:");
        String medicalRecordCode = common.ScannerBA();
        System.out.println("Nhập mã bệnh nhân:");
        String patientCode = common.ScannerBN();
        System.out.println("Nhập tên bệnh nhân:");
        String patientName = common.ScannerString();
        System.out.println("Ngày nhập viện:");
        String admissionDate = common.ScannerDate();
        System.out.println("Ngày ra viện:");
        String dischargeDate = common.ScannerDate();
        System.out.println("Lý do nhập viện:");
        String reason = common.ScannerString();
        System.out.println("Vui lòng chọn loại Vip");
        System.out.println("1.Vip1");
        System.out.println("2.Vip2");
        System.out.println("3.Vip3");
        int choice = common.ScannerInteger();
        String vipType = null;
        switch (choice){
            case 1:
                vipType = "VipI";
                break;
            case 2:
                vipType = "VipII";
                break;
            case 3:
                vipType = "VipIII";
                break;
            default:
                System.out.println("Không có loại vip này");
                break;
        }
        System.out.println("Ngày hết hạn vip:");
        String vipExpiration = common.ScannerDate();
        VIPMedicalRecord vipMedicalRecord = new VIPMedicalRecord(medicalRecordCode,patientCode,patientName,admissionDate,dischargeDate,reason,vipType,vipExpiration);
        HospitalManagementSystem.listHopital.add(vipMedicalRecord);
        System.out.println("Thêm thành công");
    }
    public void showAddNormal(){
        System.out.println("Nhập mã bệnh án:");
        String medicalRecordCode = common.ScannerBA();
        if (hospitalManagementSystem.checkMedicalRecordCode(medicalRecordCode)!=-1){
            System.out.println("Đã có mã bệnh án này");
        }else {
            System.out.println("Nhập mã bệnh nhân:");
            String patientCode = common.ScannerBN();
            System.out.println("Nhập tên bệnh nhân:");
            String patientName = common.ScannerString();
            System.out.println("Ngày nhập viện:");
            String admissionDate = common.ScannerDate();
            System.out.println("Ngày ra viện:");
            String dischargeDate = common.ScannerDate();
            System.out.println("Lý do nhập viện:");
            String reason = common.ScannerString();
            System.out.println("Phí nằm viện");
            double hospitalFee = common.ScannerDouble();
            RegularMedicalRecord regularMedicalRecord = new RegularMedicalRecord(medicalRecordCode,patientCode,patientName,admissionDate,dischargeDate,reason,hospitalFee);
            HospitalManagementSystem.listHopital.add(regularMedicalRecord);
            System.out.println("Thêm thành công");
        }
    }
    public void showRemove(){
        System.out.println("Nhập mã bệnh án cần xóa:");
        String medicalRecordCode = common.ScannerBA();
        int index = hospitalManagementSystem.checkMedicalRecordCode(medicalRecordCode);
        if (index != -1){
            HospitalManagementSystem.listHopital.remove(index);
        }else {
            System.out.println("Sản phẩm hiện không có");
        }
    }
    public void showAllList(){
        System.out.println("Danh sách bệnh án");
        HospitalManagementSystem.listHopital.forEach(System.out::println);
    }
}
