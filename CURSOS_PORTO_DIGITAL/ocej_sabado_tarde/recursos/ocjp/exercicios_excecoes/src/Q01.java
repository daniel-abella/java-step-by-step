//Q: 01 Given:
class Q01 {
	public static void parse(String str) {          /* 11. */
		try {                                       /* 12. */
			float f = Float.parseFloat(str);        /* 13. */
		} catch (NumberFormatException nfe) {       /* 14. */
			f = 0;                                  /* 15. */
		} finally {                                 /* 16. */
			System.out.println(f);                  /* 17. */
		}                                           /* 18. */
	}                                               /* 19. */
                                                             
	public static void main(String[] args) {        /* 20. */
		parse("invalid");                           /* 21. */
	}                                               /* 22. */
}
/*
 * What is the result? A. 0.0 B. Compilation fails. C. A ParseException is
 * thrown by the parse method at runtime. D. A NumberFormatException is thrown
 * by the parse method at runtime. Answer: B
 */