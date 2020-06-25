import java.lang.Exception;

class InvalidException extends Exception{
  public InvalidException(String message){
    super(message);
  }
}