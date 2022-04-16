package org.erlking.springboot.neo4j.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

public class Files {
    @Id
    @GeneratedValue
    private final Long id;

    private final String encryptedFile;


    public Files(Long id, String encryptedFile) {
        this.id = id;
        this.encryptedFile = encryptedFile;
    }

    public boolean isEmpty(Files file){
        if (file == NULL){

        }
    }
}
