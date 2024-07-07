package fr.sciam.workshop.javase.codesnippet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MonUtilTest {

	@Test
	void additionnerDevrait_avec2et3_renvoyer5() {
		long resultat = MonUtil.additionner(2,3);
		assertEquals(5, resultat, "Valeur attendue différente");
	}
}
