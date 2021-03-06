package org.cory.rice.bingetv.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationResponse {
//	handles Response for all Auth requests
	private String authenticationToken;
	private String refreshToken;
	private Instant expiresAt;
	private String username;
	private Long userId;
}


