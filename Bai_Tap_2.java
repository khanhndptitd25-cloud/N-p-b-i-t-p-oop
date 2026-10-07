interface EmailSender {
    void sendEmail();
}

interface Programmer {
    void code();
}

interface Salesperson {
    void sell();
}

class OfficeEmployee2 implements EmailSender {
    private String name;

    public OfficeEmployee2(String name) {
        this.name = name;
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " đang gửi email báo cáo.");
    }
}

class TechnicalEmployee2 implements Programmer, EmailSender {
    private String name;

    public TechnicalEmployee2(String name) {
        this.name = name;
    }

    @Override
    public void code() {
        System.out.println(name + " đang viết mã nguồn ứng dụng.");
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " đang gửi email kỹ thuật.");
    }
}

class SalesEmployee2 implements Salesperson, EmailSender {
    private String name;

    public SalesEmployee2(String name) {
        this.name = name;
    }

    @Override
    public void sell() {
        System.out.println(name + " đang tư vấn bán hàng.");
    }

    @Override
    public void sendEmail() {
        System.out.println(name + " đang gửi email báo giá.");
    }
}

public class Bai_Tap_2 {
    public static void main(String[] args) {
        OfficeEmployee2 officeEmp = new OfficeEmployee2("Nguyễn Văn A");
        TechnicalEmployee2 techEmp = new TechnicalEmployee2("Trần Thị B");
        SalesEmployee2 salesEmp = new SalesEmployee2("Lê Văn C");

        System.out.println("=== CHỨC NĂNG NHÂN VIÊN VĂN PHÒNG ===");
        officeEmp.sendEmail();

        System.out.println("\n=== CHỨC NĂNG NHÂN VIÊN KĨ THUẬT ===");
        techEmp.code();
        techEmp.sendEmail();

        System.out.println("\n=== CHỨC NĂNG NHÂN VIÊN BÁN HÀNG ===");
        salesEmp.sell();
        salesEmp.sendEmail();
    }
}