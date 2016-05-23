//Q: 02 Given:
class Q02{
	Oracle Certified Expert, Java EE 6 Java Persistence API DeveloperOracle Certified Expert, Java EE 6 Enterprise JavaBeans DeveloperOracle Certified Professional, Java ME 1 Mobile Application DeveloperOracle Certified Expert, Java EE 6 Web Services Developer

/*84.*/ try {
/*85.*/ ResourceConnection con = resourceFactory.getConnection();
/*86.*/ Results r = con.query("GET INFO FROM CUSTOMER");
/*87.*/ info = r.getData();
/*88.*/ con.close();
/*89.*/ } catch (ResourceException re) {
/*90.*/ errorLog.write(re.getMessage());
/*91.*/ }
/*92.*/ return info;
}
/*
Which statement is true if a ResourceException is thrown on line 86?
A. Line 92 will not execute.
B. The connection will not be retrieved in line 85.
C. The resource connection will not be closed on line 88.
D. The enclosing method will throw an exception to its caller.
Answer: C
*/