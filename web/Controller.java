package web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {
    @RequestMapping("/api/read-students")
    Iterable m1() {
        return x.findAll();
    }
    
    @RequestMapping("/api/read-male-students")
    List m2() {
        return x.findByGender('M');
    }
    
    @RequestMapping("/api/read-score-ninety")
    List m3() {
        return x.findByScoreGreaterThan(90);
    }
    
    @Autowired
    StudentRepository x;
}
