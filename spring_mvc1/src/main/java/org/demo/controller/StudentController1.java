package org.demo.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController1 {

    @GetMapping("/students1")
    @ResponseBody
    public String getStudent() {
        List<String[]> students = List.of(
            new String[]{"Chaithra", "chaithra@gmail.com", "9945291421", "chaithra@123", "Bengaluru", "F"},
            new String[]{"Aarav", "aarav@gmail.com", "9845011223", "aarav@123", "Bengaluru", "M"},
            new String[]{"Ananya", "ananya@gmail.com", "9845022334", "ananya@123", "Mysuru", "F"},
            new String[]{"Rohan", "rohan@gmail.com", "9845033445", "rohan@123", "Chennai", "M"},
            new String[]{"Meera", "meera@gmail.com", "9845044556", "meera@123", "Kochi", "F"},
            new String[]{"Karthik", "karthik@gmail.com", "9845055667", "karthik@123", "Hyderabad", "M"},
            new String[]{"Sneha", "sneha@gmail.com", "9845066778", "sneha@123", "Mangaluru", "F"},
            new String[]{"Vikram", "vikram@gmail.com", "9845077889", "vikram@123", "Pune", "M"},
            new String[]{"Pooja", "pooja@gmail.com", "9845088990", "pooja@123", "Hubballi", "F"},
            new String[]{"Siddharth", "siddharth@gmail.com", "9845099001", "siddharth@123", "Bengaluru", "M"}
        );

        StringBuilder html = new StringBuilder();
        html.append("<table border=\"2\" cellpadding=\"5\" cellspacing=\"5\">");
        html.append("<tr><th>Name</th><th>Email</th><th>Mobile</th><th>Password</th><th>Address</th><th>Gender</th></tr>");

        for (String[] row : students) {
            html.append("<tr>");
            for (String cell : row) {
                html.append("<td>").append(cell).append("</td>");
            }
            html.append("</tr>");
        }

        html.append("</table>");
        return html.toString();
    }

    @PostMapping("/students1")
    @ResponseBody
    public String insertStudent() {
        return "Data inserted successfully";
    }

    @PutMapping("/students1")
    @ResponseBody
    public String updateStudent() {
        return "Student updated successfully";
    }

    @DeleteMapping("/students1")
    @ResponseBody
    public String deleteStudent() {
        return "Student deleted successfully";
    }
}