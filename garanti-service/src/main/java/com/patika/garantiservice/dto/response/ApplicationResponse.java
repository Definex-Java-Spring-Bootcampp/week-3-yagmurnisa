package com.patika.garantiservice.dto.response;

import java.time.LocalDateTime;

import com.patika.garantiservice.enums.ApplicationStatus;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ApplicationResponse {

    private Long userId;
    private LocalDateTime createDate;
    private ApplicationStatus applicationStatus;
    
}