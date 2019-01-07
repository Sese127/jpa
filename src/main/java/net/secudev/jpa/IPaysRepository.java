package net.secudev.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaysRepository extends JpaRepository<Pays, Long> {
	
	public Boolean existsByNom(String nom);
	public Pays findByNom(String nom);

}
