package com.hemant11ks;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
//        return List.of(
//                new SoftwareEngineer(1, "Alex", "C++, Java"),
//                new SoftwareEngineer(2, "Niel", "DevOPS"),
//                new SoftwareEngineer(3, "Maven", "Test Automation")
//        );
        return softwareEngineerService.getAllSoftwareEngineers();
    }
    @PostMapping
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }

    @GetMapping("{id}")
    public SoftwareEngineer getEngineerById(@PathVariable Integer id) {
       return softwareEngineerService.getSoftwareEngineerById(id);
    }

}
