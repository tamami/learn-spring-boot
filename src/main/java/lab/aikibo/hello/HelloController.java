package lab.aikibo.hello;

/**
 * Created by tamami on 19/11/16.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
