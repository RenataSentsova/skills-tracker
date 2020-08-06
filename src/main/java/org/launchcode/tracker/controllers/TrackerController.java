package org.launchcode.tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TrackerController {
    @GetMapping
    @ResponseBody
    public String getAllSkills(){
        String html =
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
        return html;
    }

    @GetMapping(value="form")
    @ResponseBody
    public String getFormSkills(){
        String html_Skills =
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Python'>Python</option>";
        String html =
                "<html>" +
                "<body>" +
                    "<form method='post'>" +
                        "Name:<br><input type='text' name='name'/><br>" +
                        "<label>My fav language:"+
                        "<select name='firstSkill'>" +
                        html_Skills +
                        "</select></label><br>" +
                        "<label>My second fav language:"
                        + "<select name='secondSkill'>" +
                        html_Skills +
                        "</select></label><br>" +
                        "<label>My third fav language:" +
                        "<select name='thirdSkill'>" +
                        html_Skills +
                        "</select></label><br>" +
                        "<input type='submit' value='Submit'/>" +
                    "</form>" +
                "</body>" +
                "</html>";
        return html;
    }

    @PostMapping(value="form")
    @ResponseBody
    public String getInfo(@RequestParam String name, @RequestParam String firstSkill,
                           @RequestParam String secondSkill, @RequestParam String thirdSkill){
        String html =
                "<html>" +
                "<body>" +
                    "<h1>"+ name +"</h1>" +
                    "<ol>" +
                        "<li>" + firstSkill + "</li>" +
                        "<li>" + secondSkill + "</li>" +
                        "<li>" + thirdSkill + "</li>" +
                    "</ol>" +
                "</body>" +
                "</html>";
        return html;
    }
}
