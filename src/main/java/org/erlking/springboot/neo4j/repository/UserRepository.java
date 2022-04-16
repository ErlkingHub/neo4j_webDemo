package org.erlking.springboot.neo4j.repository;

import org.erlking.springboot.neo4j.entity.User;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends Neo4jRepository<User,Long> {

    @Query("MATCH (n:User) " +
            "WHERE n.name = {name}  " +
            "RETURN n")
    User getUserByName(@Param("name") String Name);

    User findByName( String Name );
}