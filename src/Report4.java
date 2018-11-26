/*public class Report4 {
    public static void main(String[] args) {

        try{
            String str = null;
            System.out.println(str.length());

        } catch (Exception e){
            System.out.println(e.getMessage());
            throw new NullPointerException("NullPointerExceptionが発生しました");
        }
    }
}*/

public class Report4 {
    public static void main(String[] args) {
        String str = "百二十三";
        int value = Integer.parseInt(str);
    }
}

