package org.cory.rice.bingetv.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "token")
public class VerificationToken {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	private String token;
	@OneToOne(fetch = LAZY, cascade = ALL, orphanRemoval = true)
	private User user;
}