package ru.msaggik.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.msaggik.spring.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
