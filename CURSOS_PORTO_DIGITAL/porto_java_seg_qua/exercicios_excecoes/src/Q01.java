//Q: 01 Given:
class Q01 {
	/* 11. */public static void parse(String str) {
		/* 12. */try {
				/* 13. */float f = Float.parseFloat(str);
		/* 14. */} catch (NumberFormatException nfe) {
				/* 15. */f = 0;
		/* 16. */} finally {
				/* 17. */System.out.println(f);
		/* 18. */}
	/* 19. */}

	/* 20. */public static void main(String[] args) {
		/* 21. */parse("invalid");
	/* 22. */}
}
/*
 * What is the result? A. 0.0 B. Compilation fails. C. A ParseException is
 * thrown by the parse method at runtime. D. A NumberFormatException is thrown
 * by the parse method at runtime. Answer: B
 */