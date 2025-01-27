package com.idirtrack.backend.boitier.https;

import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class BoitierGetByIDResponse {
    private long deviceMicroserviceId;
    private long simMicroserviceId;
    private Date startDate;
    private Date endDate;


}
