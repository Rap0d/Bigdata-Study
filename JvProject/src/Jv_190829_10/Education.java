package Jv_190829_10;

public class Education {
    private String name; // 수강생
    private String subject; // 수강 과목
    private double fee;// 교육비
    private double addfee = 0.0; // 환급금
    private double chul; // 출석율

    // 읽기 전용의 변수는 final 키워드를 붙여서 편집을 하지 못하게 한다.
    private final String sosok = "IT 교육 센터";
    private final double add_refund = 3000.0; // 추가 환급금

    public Education(String name, String subject, double fee, double chul) {
        this.name = name;
        this.subject = subject;
        this.fee = fee;
        this.chul = chul;
        this.calcFee();
    }

    private void calcFee() {
        // 환급금을 구해 주는 메소드
        // subject 변수는 문자열이므로 ==을 사용하면 안된다.
        if (this.chul < 0.8)
            this.addfee = 1000;
        else {
            if (this.subject.equalsIgnoreCase("java")) {
                this.addfee = this.fee * 0.25 + add_refund;

            } else if (this.subject.equalsIgnoreCase("jdbc")) {
                this.addfee = this.fee * 0.20 + add_refund;

            } else if (this.subject.equalsIgnoreCase("jsp")) {
                this.addfee = this.fee * 0.15 + add_refund;
            }
        }
    }

    public void Display() { // 결과물을 출력한다.
        System.out.println("수강생 : " + this.name);
        System.out.println("교육 센터 : " + this.sosok);
        System.out.println("수강 과목 : " + this.subject);
        System.out.println("교육비 : " + this.fee);
        System.out.println("환급금 : " + this.addfee);
    }
}
