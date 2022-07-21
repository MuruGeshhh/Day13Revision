package sg.edu.nus.iss.day13revision;

import java.util.Collection;
import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class Day13revisionApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(Day13revisionApplication.class, args);


	// Taking port nyumber on args and default is port 8085


	//mvn spring-boot:run -Dspring-boot.run.arguments="--port8089"
	SpringApplication app = new SpringApplication(Day13revisionApplication.class);

     String port = "8085";
	 ApplicationArguments cliOpts = new DefaultApplicationArguments(args);

	 if (cliOpts.containsOption("port")) {

		port = cliOpts.getOptionValues("port").get(0);
	 }


	 app.setDefaultProperties(
		  Collections.singletonMap("server.port", port)
	 );

	 app.run(args);

    
	
    
	/*@Bean 
	public CommonsRequestLoggingFilter log(){

		CommonsRequestLoggingFilter logger = new CommonsRequestLoggingFilter();
		logger.setIncludeClientInfo(includeClientInfo:true);
		logger.setIncludeQueryString(includeQueryString:true);
		return logger;


	} */









	}

}
