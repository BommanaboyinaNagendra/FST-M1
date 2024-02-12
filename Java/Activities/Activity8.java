package Activites;

class CustomException extends Exception{
    private  String message;

    CustomException(String message){
    this.message=message;
    }
    @Override
    public String getMessage() {
        return message;
    }


}


public class Activity8 {
   public void verifyException(String exception) throws CustomException {
       if(exception == null) {
           throw new CustomException("Exception -> getting null");
       } else {
           System.out.println(exception);
       }
   }

    public static void main(String[] args) throws CustomException {
       // new Activity8().verifyException(null);
        new Activity8().verifyException("No Exception-> Ok");
    }

}
