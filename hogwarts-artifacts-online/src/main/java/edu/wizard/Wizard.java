package edu.wizard;
import java.util.List;

import org.springframework.data.annotation.Id;

import edu.artifact.Artifact;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
@Entity
public class Wizard implements Serializable{
    
    @Id
    private Integer id;

    private String name;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "owner")
    private List<Artifact> artifacts; 
    
    public Wizard(){

    }

    public Integer getId(){
        return id;        
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Artifact> getArtifact(){
        return artifacts;
    }

    public void setArtifact(List<Artifact> artifacts){
        this.artifacts = artifacts;
    }

    
}
