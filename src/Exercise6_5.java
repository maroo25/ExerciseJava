class Exercise6_5 {
    public static void main(String args[]) {
        Student6_5 s = new Student6_5(" ",1,1,100,60,76); //홍길동
        System.out.println(s.info());
    }
}
class Student6_5 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    Student6_5(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal() {
        return kor+eng+math;
    }
    float getAverage() {
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }
    public String info() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage()
                ;
    }
}
