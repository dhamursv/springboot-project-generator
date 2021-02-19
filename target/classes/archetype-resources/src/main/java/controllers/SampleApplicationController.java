package ${package}.controllers;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class SampleApplicationController {

    
    public static final Logger LOGGER = LoggerFactory.getLogger(SampleApplicationController.class);

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        LOGGER.warn("Warning Message");
        LOGGER.debug("Debug Message");
        LOGGER.error("Error Message");
        LOGGER.info("Info Message");
        return "This is Simple API";

    }
   
}
