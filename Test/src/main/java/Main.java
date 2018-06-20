import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();
        Products[] prod = mapper.readValue(new File("C:\\Users\\Vlad\\Desktop\\Projects\\Test\\src\\main\\java\\goods.json"), Products[].class);
        Products.list = new LinkedList<>(Arrays.asList(prod));
        String line = scan.nextLine();
        try {
            double number = (Double.parseDouble(line));
            Products.infoFilter(number);
        } catch (NumberFormatException ex) {
            Products.infoFilter(line);
        }
        scan.close();
    }
}
