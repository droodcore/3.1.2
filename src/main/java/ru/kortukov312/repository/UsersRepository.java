package ru.kortukov312.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kortukov312.model.User;


@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}
