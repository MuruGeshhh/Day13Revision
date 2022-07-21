package sg.edu.nus.iss.day13revision.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.day13revision.models.*; // import model
import sg.edu.nus.iss.day13revision.services.PersonService;

//ANNOTE AS CONTROLLER

@Controller
//@RequestMapping(path="/person")
public class PersonController {

    private List<Person> personList = new ArrayList<Person>();

    @Autowired //calling a service , import the serivce on top.
    PersonService perSvc;

    @Value("${welcome.message}") // calling the message function in appplication.propetied
    private String message;

    @Value("${error.message}")
    private String errorMessage;

@RequestMapping(value={"/","/home","/index"}, method=RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", message); // injecting message into the html
        return "index";
    }

   /* @RequestMapping(value="/testRetrieve", method=RequestMethod.GET, produces="application.json") 
    public @ResponseBody List<Person> getAllPersons() {

        personList = perSvc.getPersons(); //from person service

        return personList;
        }  */

 @RequestMapping(value="/personList", method=RequestMethod.GET)      
   public String personList(Model model){

    personList = perSvc.getPersons();
    model.addAttribute("persons",personList);

      return "personList";

   }
    

   }





    

