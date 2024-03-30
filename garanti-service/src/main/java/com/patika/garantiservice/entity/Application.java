package com.patika.garantiservice.entity;

import java.time.LocalDateTime;
import com.patika.garantiservice.enums.ApplicationStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Application {

    private Long userId;
    private LocalDateTime createDate;
    private ApplicationStatus applicationStatus;
    
}

