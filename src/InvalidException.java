public class InvalidException extends Exception{
    String message;


    // default constructor
    public InvalidException(){
        super("Error: Input row cannot be parsed due to missing information");
    }

    // constructor with desired message
    public InvalidException(String message){
        super(message);
    }

}
