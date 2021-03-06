package org.cory.rice.bingetv.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Shows")
public class Shows {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	@Column
	private Long showId;
	@Column
	private String showName;
	
	@JsonBackReference
	@ManyToOne(targetEntity = User.class, fetch = LAZY, cascade = ALL)
	@JoinColumn(name = "users_user_id")
	private User users;
	
	
	public Shows(User users) {
		this.users = users;
	}
}
