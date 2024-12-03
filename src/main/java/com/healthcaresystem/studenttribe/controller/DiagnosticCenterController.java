package com.healthcaresystem.studenttribe.controller;

import com.healthcaresystem.studenttribe.entity.DiagnosticCenter;
import com.healthcaresystem.studenttribe.service.IDiagnosticCenterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/diagnosticsCenter")
public class DiagnosticCenterController {

    @Autowired
    private IDiagnosticCenterService diagnosticCenterService;

    private static final Logger logger = LoggerFactory.getLogger(DiagnosticCenterController.class);

    @PostMapping("/addDiagnosticCenter")
    public ResponseEntity<DiagnosticCenter> addDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter) {
       // logger.info("Received request to add diagnostic center: {}", diagnosticCenter);
        return new ResponseEntity<DiagnosticCenter>(diagnosticCenterService.addDiagnosticCenter(diagnosticCenter), HttpStatus.OK);
    }

    @DeleteMapping("/deleteDiagnosticCenter/{diagnosticCenterId}")
    public ResponseEntity<DiagnosticCenter> deleteDiagnosticCenter(@PathVariable int diagnosticCenterId)
    {
        return new ResponseEntity<DiagnosticCenter>(diagnosticCenterService.deleteDiagnosticCenter(diagnosticCenterId), HttpStatus.OK);
    }

    @PutMapping("/updateDiagnosticCenter/{diagnosticCenterId}")
    public ResponseEntity<DiagnosticCenter> updateDiagnosticCenter(@PathVariable int diagnosticCenterId, @RequestBody DiagnosticCenter diagnosticCenter)
    {
        return new ResponseEntity<DiagnosticCenter>(diagnosticCenterService.updateDiagnosticCenter(diagnosticCenter, diagnosticCenterId), HttpStatus.OK);
    }

    @GetMapping("/viewDiagnosticCenter/{diagnosticCenterId}")
    public ResponseEntity<DiagnosticCenter> viewDiagnosticCenter(@PathVariable int diagnosticCenterId)
    {
        return new ResponseEntity<DiagnosticCenter>(diagnosticCenterService.viewDiagnosticCenter(diagnosticCenterId), HttpStatus.OK);
    }

    @GetMapping("/viewAllDiagnosticCenters")
    public ResponseEntity<Iterable<DiagnosticCenter>> viewAllDiagnosticCenters()
    {
        return new ResponseEntity<Iterable<DiagnosticCenter>>(diagnosticCenterService.viewAllDiagnosticCenters(), HttpStatus.OK);
    }

}
