package com.geekshubs.microservice.infraestructure.ui.rest;


import com.geekshubs.microservice.domain.entity.Patient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {


    @GetMapping
    public ResponseEntity<Void> home(){
        return new ResponseEntity("prueba", HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Patient> savePatient(@RequestBody Patient patient){
        return null;

    }


}
