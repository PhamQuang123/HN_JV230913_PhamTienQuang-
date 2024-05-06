package ra.exam_javacore_webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ra.exam_javacore_webapp.model.Student;
import ra.exam_javacore_webapp.service.StudentService;

import java.util.List;

@Controller
@RequestMapping
public class StudentController {
    @Autowired
    private StudentService studentService;


    @RequestMapping("/findAll")
    public ModelAndView findAll() {
        ModelAndView mav = new ModelAndView("student");
        List<Student> listStudents = studentService.findAll();
        mav.addObject("listStudents", listStudents);
        return mav;
    }

    @GetMapping("/newAdd")
    public String add() {
        return "newStudent";
    }

    @PostMapping("/add")
    public String doAdd(Student student) {
        studentService.save(student);
        return "redirect:/findAll";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int studentId){
        studentService.deleteById(studentId);
        return "redirect:/findAll";
    }

    @GetMapping("/edit")
    public ModelAndView edit(@RequestParam Integer id){
        ModelAndView view = new ModelAndView("updatStudent");
        view.addObject("student",studentService.findById(id));
        return view;
    }
    @PostMapping("/update")
    public String doUpdate(@ModelAttribute Student student){
        studentService.update(student);
        return "redirect:/categoryController/findAll";
    }
}
