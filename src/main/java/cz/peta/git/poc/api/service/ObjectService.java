package cz.peta.git.poc.api.service;

import cz.peta.git.poc.api.dto.ObjectDto;
import org.springframework.stereotype.Service;

@Service
public class ObjectService {
    public ObjectDto getObject(String id) {
        ObjectDto dto = new ObjectDto();
        dto.setData(id);
        return dto;
    }
}
