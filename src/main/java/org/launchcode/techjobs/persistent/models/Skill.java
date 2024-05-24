package org.launchcode.techjobs.persistent.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Skill extends AbstractEntity
{
    @NotBlank
    @Size(max=128)
    private String description;

    public String getDescription() {
        return description;
    }
}
