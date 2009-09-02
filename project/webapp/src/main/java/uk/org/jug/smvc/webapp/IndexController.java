package uk.org.jug.smvc.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author janm
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index1", method = RequestMethod.GET)
    public String index1(Model model) {
        model.addAttribute("greeting", "Hello, World");
        return "index1";
    }

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    @ModelAttribute("greeting")
    public String index2() {
        return "Hello, World";
    }

    @RequestMapping(value = "/index3", method = RequestMethod.GET)
    @ModelAttribute("message")
    public String index3(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "p", defaultValue = "0", required = false) int page) {
        return String.format("%s on page %d", name, page);
    }

    @RequestMapping(value = "/index4/{name}/{page}", method = RequestMethod.GET)
    public String index4(
            @PathVariable String name,
            @PathVariable("page") int pagex,
            Model model) {
        model.addAttribute("message", String.format("%s on page %d", name, pagex)); 
        return "index3";
    }
}
