package com.healthcaresystem.studenttribe.entity;

import jakarta.persistence.*;

@Entity
public class DiagnosticCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int diagnosticCenterId;

    private String diagnosticCenterName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="diagnostic_center_address_id")
    private DiagnosticCenterAddress diagnosticCenterAddress;

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