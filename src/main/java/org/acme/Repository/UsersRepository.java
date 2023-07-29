package org.acme.Repository;


import org.acme.Entity.Users;
import jakarta.enterprise.context.ApplicationScoped;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class UsersRepository implements PanacheRepository<Users>{
    
}
