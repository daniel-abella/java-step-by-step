/*
 * RESPOSTA
 * B C
 */
class Foo {
	static void alpha() {
		// C. Method beta() can directly call method alpha().
		beta();
	}

	void beta() {

		// A. Foo.beta() is a valid invocation of beta().
		Foo.beta();

		// B. Foo.alpha() is a valid invocation of alpha().
		Foo.alpha();

		// D. Method alpha() can directly call method beta().
		alpha();

	}
}