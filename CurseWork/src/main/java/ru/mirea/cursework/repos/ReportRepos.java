package ru.mirea.cursework.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import ru.mirea.cursework.entity.Report;

public interface ReportRepos extends CrudRepository <Report, Long> {
    Report findByName(String name);
    Report findByMail(String mail);
}
