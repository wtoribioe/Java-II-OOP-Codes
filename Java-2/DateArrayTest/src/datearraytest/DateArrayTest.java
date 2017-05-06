import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import static java.lang.System.out;
import static java.util.UUID.fromString;

public class DateArrayTest {

    private static final SimpleDateFormat dateFormat 
                   = new SimpleDateFormat("dd/MM/yyyy");
    private static final Date invalidDate = new Date(0);


    // test creating a date from a string.
    public static void main( String [] args ) { 
        Date [] randomDates = {
            fromString("01/01/2010"), // new year
            fromString("16/09/2010"), // 200 yrs Mex indepence 
            fromString("21/03/2010"), // uhhmm next spring?
            fromString("this/should/fail"), // invalid date.
        };

        for( Date date: randomDates ) {
            print( date );
        }
    }
