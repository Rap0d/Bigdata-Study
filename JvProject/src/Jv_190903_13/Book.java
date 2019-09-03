package Jv_190903_13;

class Book {
    private String name; // 과목
    private double price; // 단가
    private String education; // 교육 기관

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getEducation() {
        return education;
    }

    public Book(String name, double price, String education) {
        this.name = name;
        this.price = price;
        this.education = education;
    }

    @Override
    public String toString() {
        String result = "";
        ;
        result += "과목 : " + this.name + "\n";
        result += "수업료 : " + this.price + "\n";
        result += "교육 기관 : " + this.education;

        return result;
    }
}