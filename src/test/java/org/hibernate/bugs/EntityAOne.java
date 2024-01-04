package org.hibernate.bugs;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@DiscriminatorValue("1")
public class EntityAOne extends EntityA {

	@JoinColumn(name = "ENTITY_B")
	@ManyToOne
	EntityB entityB;
}