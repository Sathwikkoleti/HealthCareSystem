package com.healthcaresystem.studenttribe.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class DiagnosticCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int diagnosticCenterId;

    @Column(nullable = false)
    private String diagnosticCenterName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="diagnostic_center_address_id")
    private DiagnosticCenterAddress diagnosticCenterAddress;
    
    @OneToMany(mappedBy = "diagnosticCenter", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DiagnosticTest> diagnosticTests;

    @OneToMany(mappedBy = "diagnosticCenter", cascade = CascadeType.ALL)  // No foreign key column in DiagnosticCenter table
    private List<Appointment> appointment;
    
    // Getters and Setters
    public int getDiagnosticCenterId() {
        return diagnosticCenterId;
    }

    public void setDiagnosticCenterId(int diagnosticCenterId) {
        this.diagnosticCenterId = diagnosticCenterId;
    }

    public String getDiagnosticCenterName() {
        return diagnosticCenterName;
    }

    public void setDiagnosticCenterName(String diagnosticCenterName) {
        this.diagnosticCenterName = diagnosticCenterName;
    }

    public DiagnosticCenterAddress getDiagnosticCenterAddress() {
        return diagnosticCenterAddress;
    }

    public void setDiagnosticCenterAddress(DiagnosticCenterAddress diagnosticCenterAddress) {
        this.diagnosticCenterAddress = diagnosticCenterAddress;
    }
}