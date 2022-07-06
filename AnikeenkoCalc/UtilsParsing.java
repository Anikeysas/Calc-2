import java.io.IOException;
import java.util.List;

public class UtilsParsing {
    public static Variable parseVariable(String line) throws Exception {
        String[] tokens =  line.split("");
        if (tokens.length == 1) {
          return new Variable(TypeVariable.INT, line);
        }
        return new Variable(TypeVariable.STRING, line);
    }
}
