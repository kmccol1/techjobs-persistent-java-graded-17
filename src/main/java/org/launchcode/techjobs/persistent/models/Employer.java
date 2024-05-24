package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity
{
    @NotBlank
    @Size(max=128)
    private String location;

    public Employer(){}

    public String getLocation() {
        return location;
    }
}
