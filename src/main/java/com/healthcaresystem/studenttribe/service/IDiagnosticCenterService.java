package com.healthcaresystem.studenttribe.service;

import com.healthcaresystem.studenttribe.entity.DiagnosticCenter;
import com.healthcaresystem.studenttribe.exceptions.DiagnosticCenterNotFound;

import java.util.List;

public interface IDiagnosticCenterService
{
    DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter);
    DiagnosticCenter deleteDiagnosticCenter(int diagnosticCenterId) throws DiagnosticCenterNotFound;
    DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter, int diagnosticCenterId)throws DiagnosticCenterNotFound;
    DiagnosticCenter viewDiagnosticCenter(int diagnosticCenterId) throws DiagnosticCenterNotFound;
    List<DiagnosticCenter> viewAllDiagnosticCenters() throws DiagnosticCenterNotFound;
}
