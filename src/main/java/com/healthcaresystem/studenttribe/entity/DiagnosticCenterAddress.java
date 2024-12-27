package com.healthcaresystem.studenttribe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DiagnosticCenterAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int diagnosticCenterAddressId;
    @Column(nullable = false)
    private String diagnosticCenterPlotNumber;
    @Column(nullable = false)
    private String diagnosticCenterStreet;
    @Column(nullable = false)
    private String diagnosticCenterLandmark;
    @Column(nullable = false)
    private String diagnosticCenterCity;
    @Column(nullable = false)
    private String diagnosticCenterPincode;

    // Getters and Setters
    public int getDiagnosticCenterAddressId() {
        return diagnosticCenterAddressId;
    }

    public void setDiagnosticCenterAddressId(int diagnosticCenterAddressId) {
        this.diagnosticCenterAddressId = diagnosticCenterAddressId;
    }

    public String getDiagnosticCenterPlotNumber() {
        return diagnosticCenterPlotNumber;
    }

    public void setDiagnosticCenterPlotNumber(String diagnosticCenterPlotNumber) {
        this.diagnosticCenterPlotNumber = diagnosticCenterPlotNumber;
    }

    public String getDiagnosticCenterStreet() {
        return diagnosticCenterStreet;
    }

    public void setDiagnosticCenterStreet(String diagnosticCenterStreet) {
        this.diagnosticCenterStreet = diagnosticCenterStreet;
    }

    public String getDiagnosticCenterLandmark() {
        return diagnosticCenterLandmark;
    }

    public void setDiagnosticCenterLandmark(String diagnosticCenterLandmark) {
        this.diagnosticCenterLandmark = diagnosticCenterLandmark;
    }

    public String getDiagnosticCenterCity() {
        return diagnosticCenterCity;
    }

    public void setDiagnosticCenterCity(String diagnosticCenterCity) {
        this.diagnosticCenterCity = diagnosticCenterCity;
    }

    public String getDiagnosticCenterPincode() {
        return diagnosticCenterPincode;
    }

    public void setDiagnosticCenterPincode(String diagnosticCenterPincode) {
        this.diagnosticCenterPincode = diagnosticCenterPincode;
    }
}