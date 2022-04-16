package org.erlking.springboot.neo4j.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

public class KeyWords {
    @Id
    @GeneratedValue
    private final Long id;

    private String encryption;
    private String tag;

    public KeyWords(Long id, String encryption, String tag){
        this.id = id;
        this.encryption = encryption;
        this.tag = tag;
    }

    @Relationship(type = "CONCLUDED_IN", direction = Relationship.OUTGOING)
    private List<Files> aFile;

    public void addPointFile(Files file){
        if (this.aFile == NULL){
            this.aFile = new ArrayList<>();
        }
        this.aFile.add(file);
    }


    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    public String getEncryption() {
        return encryption;
    }

    public String getTag() {
        return tag;
    }

}
