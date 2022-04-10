package com.midt.java;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/teachers")

public class TeachersController {
    @Autowired
    private com.midt.java.TeachersRepository teachersRepository;
    @PostMapping("/add")
    public @ResponseBody String addNewprojctdata(@RequestBody Teachers user) {
        teachersRepository.save(user);
        return "OK";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Teachers> getAllTeachers() {
        return teachersRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody
    Teachers one(@PathVariable Integer id) {
        return teachersRepository.findById(id).orElseThrow(() -> new com.midt.java.TeachersNotFoundException(id));
    }

    @PutMapping("/{id}")
    public @ResponseBody
    Teachers put(@RequestBody Teachers replaceTeachers, @PathVariable Integer id) {
        return teachersRepository.findById(id).map(teachers -> {
            teachers = replaceTeachers;
            teachers.setId(id);
            return teachersRepository.save(teachers);
        }).orElseThrow(() -> new com.midt.java.TeachersNotFoundException(id));
    }
    @DeleteMapping("/{id}")
    void del(@PathVariable Integer id) {

        teachersRepository.deleteById(id);
    }
}
