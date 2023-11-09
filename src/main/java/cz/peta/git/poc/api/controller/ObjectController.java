package cz.peta.git.poc.api.controller;

import cz.peta.git.poc.api.dto.ObjectDto;
import cz.peta.git.poc.api.service.ObjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bpmn/process-instance")
@CrossOrigin
@AllArgsConstructor
public class ObjectController {

    ObjectService objectService;

    @GetMapping("/{id}")
    public ObjectDto getProcessInstance(@PathVariable("id") String id) {
        return objectService.getObject(id);
    }
}
