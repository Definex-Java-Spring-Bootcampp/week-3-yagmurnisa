package com.patika.kredinbizdeservice.client.dto.request;

import java.time.LocalDateTime;

import com.patika.kredinbizdeservice.client.dto.response.ApplicationStatus;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GarantiApplicationRequest {

	 private Long userId;
}
