class Exercise6_4 {
    public static void main(String args[]) {
        Student4 s = new Student4();
        s.name = "Jeffrey";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println("name : "+s.name); //이름
        System.out.println("total :"+s.getTotal()); //총점
        System.out.println("average : "+s.getAverage()); //평균
    }
}

class Student4 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int getTotal() {
        return kor + eng + math;
    }
    float getAverage() {
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }
}