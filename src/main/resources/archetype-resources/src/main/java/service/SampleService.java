package ${package}.service;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;



@Service
public class SampleService {

    public static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(SampleService.class);
    
    public String sampleFunctionInsideService(){
        return "Howdy springboot Dev!";
    }
}
