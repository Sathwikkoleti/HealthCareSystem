package com.healthcaresystem.studenttribe.service;

import com.healthcaresystem.studenttribe.entity.DiagnosticCenter;
import com.healthcaresystem.studenttribe.exceptions.DiagnosticCenterNotFound;
import com.healthcaresystem.studenttribe.repository.IDiagnosticCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiagnosticCenterServiceImp implements IDiagnosticCenterService
{
    @Autowired
    private IDiagnosticCenterRepository diagnosticCenterRepository;

    @Override
    public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
        return diagnosticCenterRepository.save(diagnosticCenter);
    }

    @Override
    public DiagnosticCenter deleteDiagnosticCenter(int diagnosticCenterId) throws DiagnosticCenterNotFound {
        Optional<DiagnosticCenter> oldDiagnosticCenter = diagnosticCenterRepository.findById(diagnosticCenterId);
        if (oldDiagnosticCenter.isEmpty())
            throw new RuntimeException("Diagnostic Center not found with id: " + diagnosticCenterId);
        diagnosticCenterRepository.deleteById(diagnosticCenterId);
        return oldDiagnosticCenter.get();
    }

    @Override
    public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter, int diagnosticCenterId) throws DiagnosticCenterNotFound {
        Optional<DiagnosticCenter> oldDiagnosticCenter = diagnosticCenterRepository.findById(diagnosticCenterId);
        if (oldDiagnosticCenter.isEmpty())
            throw new RuntimeException("Diagnostic Center not found with id: " + diagnosticCenterId);
        diagnosticCenter.setDiagnosticCenterId(diagnosticCenterId);
        return diagnosticCenterRepository.save(diagnosticCenter);
    }

    @Override
    public DiagnosticCenter viewDiagnosticCenter(int diagnosticCenterId) throws DiagnosticCenterNotFound {
        Optional<DiagnosticCenter> oldDiagnosticCenter = diagnosticCenterRepository.findById(diagnosticCenterId);
        if (oldDiagnosticCenter.isEmpty())
            throw new RuntimeException("Diagnostic Center not found with id: " + diagnosticCenterId);
        return oldDiagnosticCenter.get();
    }

    @Override
    public List<DiagnosticCenter> viewAllDiagnosticCenters() throws DiagnosticCenterNotFound {
        if (diagnosticCenterRepository.findAll().isEmpty())
            throw new RuntimeException("No Diagnostic Centers found");
        return diagnosticCenterRepository.findAll();
    }
}
