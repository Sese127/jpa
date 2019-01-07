package net.secudev.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

	@Autowired
	IPaysRepository pays;

	@Autowired
	IPersonneRepository personnes;
	@Test
	public void testCreationPersonneFrancaise()
	{
		if(pays.existsByNom("France"))
		{
			Pays france = pays.findByNom("France");
			Personne marcel = new Personne("Bichon","Marcel",france);
			personnes.save(marcel);
		}
	}
	
	@Test
	public void testCreationPays() {

		Pays France = new Pays("France");
		if(! pays.existsByNom("France"))pays.save(France);
	}

}
