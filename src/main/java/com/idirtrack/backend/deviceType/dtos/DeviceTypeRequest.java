package com.idirtrack.backend.deviceType.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceTypeRequest {

    @NotBlank(message = "Name is required")
    private String name;
}
