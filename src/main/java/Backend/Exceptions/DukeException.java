package Backend.Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.format.DateTimeParseException;

public class DukeException extends Exception {

    String errorMsg;
    Exception e;

    public DukeException( Exception e ){

        String errorMsg = getErrorMsg();

        this.e = e;
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {

        return "I was unable to complete your request due to this exception, sir:\n " + errorMsg;

    }

    public String getErrorMsg(){

        if( e instanceof StringIndexOutOfBoundsException ) {
            return "I'm afraid I am currently not equipped to handle that task sir.";
        } else if( e instanceof  IndexOutOfBoundsException ){
            return "I don't think that exists sir.";
        } else if( e instanceof DateTimeParseException ){
            return "The date you gave was familiar... but could you perhaps format it as YYYY-MM-MM?";
        } else if( e instanceof FileNotFoundException ){
            return "I couldn't find the file I was supposed to sir. I'll try again tomorrow.";
        } else if( e instanceof IOException){
            return "I lost the tasks you gave me sir. My resignation will be on your table shortly.";
        } else {
            return "Something went wrong and I'm not sure what";
        }

    }

}
