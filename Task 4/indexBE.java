import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class AstrologyWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(AstrologyWebsiteApplication.class, args);
    }
}

@Controller
class AstrologyController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/zodiac")
    @ResponseBody
    public String getZodiacSign(@RequestParam("birthdate") String birthdate) {
        // Parse the birthdate and determine the zodiac sign (you can use the JavaScript code you provided)
        // Replace the following line with the actual logic to determine the zodiac sign
        String zodiacSign = "Aries";
        return "Your zodiac sign is " + zodiacSign + ".";
    }

    @PostMapping("/traits")
    @ResponseBody
    public String getZodiacTraits(@RequestParam("zodiac-sign") String selectedZodiac) {
        // Define the zodiac traits (you can use the JavaScript code you provided)
        // Replace the following line with the actual traits for each zodiac sign
        String traits = "Energetic, adventurous, and confident.";
        return "<h2>" + selectedZodiac + "</h2>\n<p>" + traits + "</p>";
    }
}
