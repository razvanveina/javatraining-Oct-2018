package sessions.s08.animals;

public class AnimalClient {
	public static void main(String[] args) {
		Caine c = new Caine();
		c.latra();

		Animal a = new Caine();
		a.mananca();

		Mamifer m = new Caine();
		m.naste();

		Caine c2 = (Caine) m;
		c2.latra();

		if (m instanceof Pisica) {
			Pisica p = (Pisica) m;
			p.toarce();
		} else {
			System.out.println("Nu pot sa transform un caine intr-o pisica");
		}

		Caine c3 = new Caine();
		Pisica p3 = new Pisica();

		c3.scoateUnSunet();
		p3.scoateUnSunet();

		Caine.doSomething();
		Animal.doSomething();

		System.out.println("------------------");

		Animal[] animals = { c3, p3, c2, new Duck() };

		for (Animal animal : animals) {
			// var1: animal.afiseazaMesaj();
			// animal.scoateUnSunet();
			animal.afiseazaMesaj();
		}

		System.out.println(c3.toString());

//		Animal an = new Animal();
//		an.scoateUnSunet();
	}
}
