public class Report4 {
    public static void main(String[] args) {

        try{
            String str = null;
            System.out.println(str.length());

        } catch (Exception e){
            System.out.println(e.getMessage());
            throw new NullPointerException("0で割ったときの例外を発生させる");
        }
    }
}

