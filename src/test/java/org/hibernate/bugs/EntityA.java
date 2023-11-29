package org.hibernate.bugs;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ENTITY_A")
public class EntityA {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	Integer id;

	@Column(name = "FOO")
	Integer foo;

	@JoinColumn(name = "CURRENT_ENTITY_B")
	@ManyToOne
	EntityB currentEntityB;

	// not needed for bug report
	// @OneToMany(mappedBy = "entityA")
	// List<EntityB> listOfEntitiesB = new ArrayList<>();
}