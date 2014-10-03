package com.resthelloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Arrays;

@Service
@Path("/test")
@Produces("application/json")
public class TestWebService {
    @GET
    public String HelloWorld() {
        return "HelloWorld";
    }

    @GET()
    @Path("/helloWorld2")
    public String HelloWorld2() {
        return "HelloWorld";
    }
}
