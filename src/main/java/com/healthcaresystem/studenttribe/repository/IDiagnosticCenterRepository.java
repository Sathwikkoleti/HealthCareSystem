package com.healthcaresystem.studenttribe.repository;

import com.healthcaresystem.studenttribe.entity.DiagnosticCenter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IDiagnosticCenterRepository extends JpaRepository<DiagnosticCenter, Integer>
{
    Optional<DiagnosticCenter> findById(Integer diagnosticCenterId);
}
