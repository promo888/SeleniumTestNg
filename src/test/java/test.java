
class Test {
    Integer var=0;

    public void print(Integer val) {
        this.var = val;
        System.out.println(var);
    }

    public static void main(String[] args) {
        Test test =  new Test();
        //System.out.println(test.var);
        test.print(1);
        System.out.println(test.var);

    }

}
