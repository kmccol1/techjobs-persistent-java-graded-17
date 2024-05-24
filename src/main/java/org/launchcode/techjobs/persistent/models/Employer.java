package org.launchcode.techjobs.persistent.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Employer extends AbstractEntity
{
    @NotBlank
    @Size(max=128)
    private String location;

    public String getLocation() {
        return location;
    }
}
