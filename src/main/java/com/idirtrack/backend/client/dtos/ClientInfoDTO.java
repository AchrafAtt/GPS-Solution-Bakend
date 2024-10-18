package com.idirtrack.backend.client.dtos;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientInfoDTO {
    private String username;
    private String name;
    private String email;
    private String phone;
    private String company;
    private String cne;
    private String category;
    private String remarque;
    private boolean isDisabled;
    private long categoryId;
}
