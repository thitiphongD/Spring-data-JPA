package web;

import java.util.List;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    List<Student> findByGender(char g);
    List<Student> findByScoreGreaterThan(double x);
}
