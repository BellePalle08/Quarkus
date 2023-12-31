package org.acme.Resources;

import org.acme.Entity.Users;
import org.acme.Repository.UsersRepository;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResources {
    
    @Inject
    UsersRepository userRepository;


    @POST
    @Transactional
    public Response create(Users user){
        userRepository.persist(user);
        return Response.ok(user).status(Response.Status.CREATED).build();
    }

}
