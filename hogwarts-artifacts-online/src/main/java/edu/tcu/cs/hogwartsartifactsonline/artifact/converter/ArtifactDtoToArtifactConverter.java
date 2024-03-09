package edu.tcu.cs.hogwartsartifactsonline.artifact.converter;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

import edu.tcu.cs.hogwartsartifactsonline.artifact.Artifact;
import edu.tcu.cs.hogwartsartifactsonline.artifact.dto.ArtifactDto;

@Component
public class ArtifactDtoToArtifactConverter implements Converter<ArtifactDto, Artifact>{

    @Override
    public Artifact convert(ArtifactDto source){
        Artifact artifact = new Artifact();
        artifact.setId(source.id());
        artifact.setName(source.name());
        artifact.setDescription(source.description());
        artifact.setImageUrl(source.imageUrl());
        return artifact;

    }

    @Override
    public JavaType getInputType(TypeFactory typeFactory) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInputType'");
    }

    @Override
    public JavaType getOutputType(TypeFactory typeFactory) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOutputType'");
    }

    
}
