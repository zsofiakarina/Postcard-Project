package project.intalk.PostcardProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.intalk.PostcardProject.personas.Postcard;

import java.util.List;

public interface PostcardRepository extends JpaRepository<Postcard, Long> {

    List<Postcard> findAll();

/*    List<Postcard> findByName(String name);

    List<Postcard> findByStatusAndName(String status, String name);*/

    List<Postcard> findByStatus(String status);
}

