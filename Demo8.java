import java.lang.*;
class stringException extends Exception{
    public stringException(String s){

        super(s);
    }
}
class Demo8{

    private int value;

    public <T> double twoThird(T a) throws stringException{
        
        if(a.getClass() ==   String.class)
            throw new stringException("string value passed");

        int num = (Integer)a;
        double res = ((num*2)/3);

        return  res;
    }

    public static void main(String[] args) {
        Demo8 ob = new Demo8();
        try{
            System.out.println(ob.twoThird(6));
            System.out.println(ob.twoThird("watermelon"));
            
        }
        catch(Exception e){
            System.out.println("Exception occured: " + e );
        }
        
    }
}