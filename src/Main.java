class AutoBox{
    static void m(Integer v){
        System.out.println("m() received " + v);

    }
    static int m2(){
        return 10;
    }

    static Integer m3(){
        return 99;
    }

    public static void main(String[] args) {

        m(199);

        Integer iOb=m2();

        System.out.println("return value from m2() is " + iOb);

        int i = m3();
        System.out.println("return value from m3() is " + i);

        iOb = 100;
        System.out.println("square root of iOb is " + Math.sqrt(iOb));
    }
}