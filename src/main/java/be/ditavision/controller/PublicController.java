package be.ditavision.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Mapping public pages.
 */
@Controller
public class PublicController {

    private String hostname;

    @RequestMapping("/")
    public String index(){
        return "home";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @RequestMapping("/chat/{user}")
    public String chat(ModelMap map, @PathVariable String user){
        map.addAttribute("user", user);
        map.addAttribute("hostname", getHostname());
        return "chat";
    }

    protected String getHostname() {
        try {
            if (this.hostname == null) {
                this.hostname = InetAddress.getLocalHost().getHostName();
            }
        } catch (UnknownHostException ex) {
            this.hostname = String.format("<unknown> : %s", ex.getMessage());
        }
        return this.hostname;
    }

}
