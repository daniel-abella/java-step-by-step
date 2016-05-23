<map version="freeplane 1.2.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node TEXT="OCEJWCD" ID="ID_221539887" CREATED="1364128498026" MODIFIED="1366751917543"><hook NAME="MapStyle">

<map_styles>
<stylenode LOCALIZED_TEXT="styles.root_node">
<stylenode LOCALIZED_TEXT="styles.predefined" POSITION="right">
<stylenode LOCALIZED_TEXT="default" MAX_WIDTH="600" COLOR="#000000" STYLE="as_parent">
<font NAME="SansSerif" SIZE="10" BOLD="false" ITALIC="false"/>
</stylenode>
<stylenode LOCALIZED_TEXT="defaultstyle.details"/>
<stylenode LOCALIZED_TEXT="defaultstyle.note"/>
<stylenode LOCALIZED_TEXT="defaultstyle.floating">
<edge STYLE="hide_edge"/>
<cloud COLOR="#f0f0f0" SHAPE="ROUND_RECT"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.user-defined" POSITION="right">
<stylenode LOCALIZED_TEXT="styles.topic" COLOR="#18898b" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subtopic" COLOR="#cc3300" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subsubtopic" COLOR="#669900">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.important">
<icon BUILTIN="yes"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.AutomaticLayout" POSITION="right">
<stylenode LOCALIZED_TEXT="AutomaticLayout.level.root" COLOR="#000000">
<font SIZE="18"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,1" COLOR="#0033ff">
<font SIZE="16"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,2" COLOR="#00b439">
<font SIZE="14"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,3" COLOR="#990000">
<font SIZE="12"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,4" COLOR="#111111">
<font SIZE="10"/>
</stylenode>
</stylenode>
</stylenode>
</map_styles>
</hook>
<node TEXT="Chapter 4: Servlet Contexts" POSITION="right" ID="ID_396319881" CREATED="1364128664966" MODIFIED="1367361786125">
<node TEXT="The Interfaces" ID="ID_1359509499" CREATED="1364128718279" MODIFIED="1366756096405">
<node TEXT="ServletContext" ID="ID_1118870973" CREATED="1364128725985" MODIFIED="1366756090514">
<node TEXT="Context (Application-Scoped) Attributes" ID="ID_1241593753" CREATED="1364129500562" MODIFIED="1366755802624">
<node TEXT="Attributes have a single String as an identifier, and take any Object as a value" ID="ID_1244966209" CREATED="1364129545960" MODIFIED="1364129668683"/>
<node TEXT="Are accessed via the following methods" ID="ID_1331054395" CREATED="1364129669709" MODIFIED="1364129701994">
<node TEXT="Object getAttribute(String name)" ID="ID_1220615343" CREATED="1364129701996" MODIFIED="1364129722577"/>
<node TEXT="Enumeration getAttributeNames()" ID="ID_1054325634" CREATED="1364129723014" MODIFIED="1364129751175"/>
<node TEXT="void removeAttribute(String name)" ID="ID_632173181" CREATED="1364129752826" MODIFIED="1364129769849"/>
<node TEXT="void setAttribute(Stjring name, Object value)" ID="ID_427661829" CREATED="1364129779420" MODIFIED="1364129835021">
<node TEXT="binding" ID="ID_1390394093" CREATED="1364129867213" MODIFIED="1364129896429"/>
</node>
</node>
<node TEXT="" ID="ID_530520341" CREATED="1364135771466" MODIFIED="1364135771466"/>
</node>
<node TEXT="Obtaining Context Information" ID="ID_1331452003" CREATED="1364129933676" MODIFIED="1366755933897">
<node TEXT="Methods" ID="ID_1796766243" CREATED="1364129952998" MODIFIED="1364129973616">
<node TEXT="String getServletContextName()" ID="ID_395780882" CREATED="1364129975385" MODIFIED="1364129998058"/>
<node TEXT="String getRealPath(String path)" ID="ID_506847254" CREATED="1364129999009" MODIFIED="1364130017221"/>
<node TEXT="Set getResourcePaths(String path)" ID="ID_280114692" CREATED="1364130018565" MODIFIED="1364130067471"/>
<node TEXT="ServletContext getServletContext(String appUrl)" ID="ID_992754685" CREATED="1364130108499" MODIFIED="1366755889300">
<node TEXT="Acces ServletContext of other applications" ID="ID_1740018586" CREATED="1364130145256" MODIFIED="1364130195258"/>
<node TEXT="Must begin &quot;/&quot;" ID="ID_269301345" CREATED="1364130195885" MODIFIED="1364130221111"/>
</node>
</node>
</node>
<node TEXT="Accessing Static Resources" ID="ID_824650150" CREATED="1364130227864" MODIFIED="1366755914364">
<node TEXT="Methods" ID="ID_775381879" CREATED="1364130275657" MODIFIED="1364130286119">
<node TEXT="java.net.URL getResource(String path)" ID="ID_264173724" CREATED="1364130287251" MODIFIED="1364130320596"/>
<node TEXT="java.io.InputStream getResourceAsStream(String path)" ID="ID_1179782450" CREATED="1364130321136" MODIFIED="1364130351452"/>
</node>
</node>
<node TEXT="Obtaining MIME type for the resource" ID="ID_516651148" CREATED="1364130563270" MODIFIED="1366755935334">
<arrowlink SHAPE="CUBIC_CURVE" COLOR="#000000" WIDTH="2" TRANSPARENCY="80" FONT_SIZE="9" FONT_FAMILY="SansSerif" DESTINATION="ID_1102968649" STARTINCLINATION="50;0;" ENDINCLINATION="50;0;" STARTARROW="NONE" ENDARROW="DEFAULT"/>
<node TEXT="String getMimeType(String path)" ID="ID_1111058974" CREATED="1364130597159" MODIFIED="1364130631027"/>
</node>
<node TEXT="Obtaining RequestDispatchers" ID="ID_227381037" CREATED="1364130659810" MODIFIED="1366755707003">
<font NAME="SansSerif" SIZE="12"/>
<node TEXT="Methods" ID="ID_1410493342" CREATED="1364130684581" MODIFIED="1366755702565">
<node TEXT="RequestDispatcher getRequestDispatcher(String path)" ID="ID_1733301093" CREATED="1364130722924" MODIFIED="1364130746280"/>
<node TEXT="RequestDispatcher getNamedDispatcher(String name)" ID="ID_1726396014" CREATED="1364130747722" MODIFIED="1364130776986"/>
</node>
</node>
<node TEXT="Context Initialisation Parameters" ID="ID_1102968649" CREATED="1364130797592" MODIFIED="1366756024714">
<node TEXT="Methods" ID="ID_760423072" CREATED="1364130821999" MODIFIED="1364130825160">
<node TEXT="String getInitParameter(String name)" ID="ID_1615531981" CREATED="1364130825161" MODIFIED="1364130869090"/>
<node TEXT="Enumeration getInitParameterNames()" ID="ID_1543234000" CREATED="1364130871086" MODIFIED="1364130891614"/>
</node>
</node>
</node>
<node TEXT="ServletConfig" ID="ID_1370265808" CREATED="1364128735748" MODIFIED="1366755236244">
<node TEXT="Servlet Names and Contexts" ID="ID_1833409519" CREATED="1364130947859" MODIFIED="1364130967505">
<node TEXT="Methods" ID="ID_1550628027" CREATED="1364130967507" MODIFIED="1364130971200">
<node TEXT="String getServletName()" ID="ID_448628642" CREATED="1364130971201" MODIFIED="1364130988395"/>
<node TEXT="ServletContext getServletContext()" ID="ID_487119939" CREATED="1364130998892" MODIFIED="1364131013010"/>
</node>
</node>
<node TEXT="Servlet Initialisation Parameters" ID="ID_1285669033" CREATED="1364131042458" MODIFIED="1364131054856">
<node TEXT="Methods" ID="ID_58164806" CREATED="1364131054858" MODIFIED="1366755228384">
<node TEXT="String getInitParameter(String name)" ID="ID_1536805141" CREATED="1364131057661" MODIFIED="1364131092474"/>
<node TEXT="Enumeration getInitParameterNames()" ID="ID_394705806" CREATED="1364131095843" MODIFIED="1364131111148"/>
<node TEXT="All parameters contained in web.xml, inside &lt;init-param&gt; tag under &lt;servlet&gt; tag" ID="ID_1691826715" CREATED="1364131122787" MODIFIED="1364131290169"/>
</node>
</node>
</node>
</node>
<node TEXT="GenericServlet Support for Contexts" ID="ID_320482401" CREATED="1364128746586" MODIFIED="1366756241459">
<node TEXT="Initialisation" ID="ID_428286640" CREATED="1364128775480" MODIFIED="1364128790016">
<node TEXT="Methods" ID="ID_1265604012" CREATED="1364131617186" MODIFIED="1364131630358">
<node TEXT="init(ServletConfig)" ID="ID_309048218" CREATED="1364131630360" MODIFIED="1364131644302"/>
<node TEXT="init()" ID="ID_1903602060" CREATED="1364131645075" MODIFIED="1364131655649"/>
</node>
</node>
<node TEXT="Convenience Methods" ID="ID_1258732999" CREATED="1364128791233" MODIFIED="1364128805271">
<node TEXT="Methods" ID="ID_1043355896" CREATED="1364131411298" MODIFIED="1364131579466">
<node TEXT="ServletConfig getServletConfig()" ID="ID_251104285" CREATED="1364131415214" MODIFIED="1364131433483"/>
<node TEXT="ServletContext getServletContext()" ID="ID_9740971" CREATED="1364131434107" MODIFIED="1364131488892"/>
<node TEXT="String getInitParameter(String name)" ID="ID_385775749" CREATED="1364131491008" MODIFIED="1364131510531"/>
<node TEXT="Enumeration getInitParameterNames()" ID="ID_1791776150" CREATED="1364131511519" MODIFIED="1364131536831"/>
<node TEXT="String getServletName()" ID="ID_750854212" CREATED="1364131537097" MODIFIED="1364131554030"/>
</node>
</node>
</node>
<node TEXT="Context Listeners" ID="ID_1153665726" CREATED="1364128807040" MODIFIED="1366756300509">
<node TEXT="Life Cycle" ID="ID_371111127" CREATED="1364132825218" MODIFIED="1364132837110">
<node TEXT="Initialisation" ID="ID_1463932298" CREATED="1364132838473" MODIFIED="1364132846761"/>
<node TEXT="Lifetime" ID="ID_164920926" CREATED="1364132847013" MODIFIED="1364132851291"/>
<node TEXT="Destruction" ID="ID_30877282" CREATED="1364132851696" MODIFIED="1364132858641"/>
</node>
<node TEXT="ServletContextListener" ID="ID_1514034721" CREATED="1364128817531" MODIFIED="1366756417953">
<node TEXT="Methods" ID="ID_979224566" CREATED="1364132865939" MODIFIED="1364132901789">
<node TEXT="void contextInitialized(ServletContextEvent event)" ID="ID_1472342182" CREATED="1364132901791" MODIFIED="1364132992177"/>
<node TEXT="void contextDestroyed(ServletContextEvent event)" ID="ID_1793261436" CREATED="1364132997712" MODIFIED="1364133021713"/>
</node>
<node TEXT="ServletContextEvent" ID="ID_1526424624" CREATED="1364133029580" MODIFIED="1364133136267">
<node TEXT="Methods" ID="ID_19921136" CREATED="1364133138621" MODIFIED="1364133155021">
<node TEXT="ServletContext getServletContext()" ID="ID_1269366966" CREATED="1364133155023" MODIFIED="1364133172948"/>
</node>
</node>
</node>
<node TEXT="ServletContextAttributeListener" ID="ID_1513489397" CREATED="1364128834626" MODIFIED="1366756413703">
<node TEXT="Methods" ID="ID_210027643" CREATED="1364133195942" MODIFIED="1366756412390">
<node TEXT="void attributeAdded(ServletContextAttributeEvent event)" ID="ID_870267899" CREATED="1364133202344" MODIFIED="1364133250029"/>
<node TEXT="void attributeRemoved(ServletContextAttributeEvent event)" ID="ID_596579439" CREATED="1364133251038" MODIFIED="1364133262122"/>
<node TEXT="void attributeReplaced(ServletContextAttributeEvent event)" ID="ID_1606680695" CREATED="1364133264150" MODIFIED="1364133279340"/>
</node>
<node TEXT="ServletContextAttributeEvent" ID="ID_1437139998" CREATED="1364133287576" MODIFIED="1366756410609">
<node TEXT="Methods" ID="ID_939491164" CREATED="1364133324434" MODIFIED="1364133328924">
<node TEXT="ServletContext getServletContext()" ID="ID_320365222" CREATED="1364133328926" MODIFIED="1364133347576"/>
<node TEXT="String getName()" ID="ID_793768744" CREATED="1364133381958" MODIFIED="1364133390204"/>
<node TEXT="Object getValue()" ID="ID_1850639745" CREATED="1364133390960" MODIFIED="1364133398036"/>
</node>
</node>
</node>
</node>
</node>
<node TEXT="Chapter 5: Requests and Responses" POSITION="right" ID="ID_1945178694" CREATED="1364128853730" MODIFIED="1367357062204">
<node TEXT="Request Listeners" ID="ID_1723796231" CREATED="1364128902825" MODIFIED="1364128917205">
<node TEXT="ServletRequestListener" ID="ID_152488421" CREATED="1364128917206" MODIFIED="1364128942295">
<node TEXT="Methods" ID="ID_600056367" CREATED="1364133496975" MODIFIED="1364133499990">
<node TEXT="void requestInitialized(ServletRequestEvent event)" ID="ID_635260433" CREATED="1364133499992" MODIFIED="1364133546649"/>
<node TEXT="void requestIDetroyed(ServletRequestEvent event)" ID="ID_21642812" CREATED="1364133547091" MODIFIED="1364133570086"/>
</node>
<node TEXT="ServletRequestEvent" ID="ID_197506220" CREATED="1364133701903" MODIFIED="1364133714763">
<node TEXT="ServletContext getServletContext()" ID="ID_1832047350" CREATED="1364133714765" MODIFIED="1364133732770"/>
<node TEXT="ServletRequest getServletRequest()" ID="ID_45796185" CREATED="1364133733215" MODIFIED="1364133782588"/>
</node>
</node>
<node TEXT="ServletRequestAttributeListener" ID="ID_1767028684" CREATED="1364128933020" MODIFIED="1366756573367">
<node TEXT="Methods" ID="ID_124517652" CREATED="1364133496975" MODIFIED="1364133499990">
<node TEXT="void attributeAdded(ServletRequestAttributeEvent event)" ID="ID_443261543" CREATED="1364133499992" MODIFIED="1364133612608"/>
<node TEXT="void attributeRemoved(ServletRequestAttributeEvent event)" ID="ID_1075905486" CREATED="1364133547091" MODIFIED="1364133634539"/>
<node TEXT="void attributeReplaced(ServletRequestAttributeEvent event)" ID="ID_104838457" CREATED="1364133638401" MODIFIED="1364133651877"/>
</node>
<node TEXT="ServletRequestAttributeEvent" ID="ID_366756691" CREATED="1364133701903" MODIFIED="1364133840369">
<node TEXT="ServletContext getServletContext()" ID="ID_396223801" CREATED="1364133714765" MODIFIED="1364133732770"/>
<node TEXT="ServletRequest getServletRequest()" ID="ID_276080861" CREATED="1364133733215" MODIFIED="1364133782588"/>
<node TEXT="String getName()" ID="ID_203155427" CREATED="1364133852338" MODIFIED="1364133863437"/>
<node TEXT="Object getValue()" ID="ID_214261887" CREATED="1364133866649" MODIFIED="1364133875298"/>
</node>
</node>
</node>
</node>
<node TEXT="Chapter 6: RequestDispatcher &amp; Wrappers" POSITION="right" ID="ID_610951687" CREATED="1364128987123" MODIFIED="1367187196496">
<node TEXT="The RequestDispatcher Mechanism" ID="ID_1235522312" CREATED="1364129020126" MODIFIED="1364129040014">
<node TEXT="Como obter ?" ID="ID_1636723768" CREATED="1364739650552" MODIFIED="1364739783188">
<node TEXT="ServletContext" ID="ID_308026198" CREATED="1364739663787" MODIFIED="1364739674647">
<node TEXT="getRequestDispatcher(String path)" ID="ID_1572984236" CREATED="1364739674648" MODIFIED="1364747445124">
<node TEXT="" ID="ID_272188386" CREATED="1364747413519" MODIFIED="1364747457379">
<node TEXT="public class Dispatcher extends HttpServlet { &#x9;public void doGet(HttpServletRequest req, HttpServletResponse res) { &#x9;&#x9;RequestDispatcher dispatcher = &#x9;&#x9;&#x9;getServletContext().getRequestDispatcher(&quot;/banner&quot;); &#x9;&#x9;if (dispatcher != null) dispatcher.include(request, response); &#x9;} }" ID="ID_1432799350" CREATED="1364747487506" MODIFIED="1364747489961"/>
</node>
</node>
<node TEXT="getNamedDispatcher(String name)" ID="ID_774416644" CREATED="1364739723228" MODIFIED="1364739744940"/>
</node>
<node TEXT="ServletRequest" ID="ID_1134617339" CREATED="1364739750692" MODIFIED="1364739759388">
<node TEXT="getRequestDispatcher(String path)" ID="ID_1680566454" CREATED="1364739759389" MODIFIED="1364739773614">
<node TEXT="public class Dispatcher extends HttpServlet { &#x9;public void doGet(HttpServletRequest req, HttpServletResponse res) { &#x9;    RequestDispatcher dispatcher =  &#x9;&#x9;&#x9;request.getRequestDispatcher(&quot;/template.jsp&quot;); &#x9;    if (dispatcher != null) dispatcher.forward(request, response); &#x9;} }" ID="ID_1354995351" CREATED="1364747462742" MODIFIED="1364747464592"/>
</node>
</node>
</node>
<node TEXT="The Request Dispatcher Interface" ID="ID_1295031383" CREATED="1364129040017" MODIFIED="1364742176952">
<node ID="ID_1699261719" CREATED="1364742037490" MODIFIED="1364742158414"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <img src="requestDispatcherMechanism.png" />
  </body>
</html>
</richcontent>
</node>
<node TEXT="Methods" ID="ID_1190481244" CREATED="1364742176952" MODIFIED="1364742181595">
<node TEXT="void forward(ServletRequest, ServletResponse)" ID="ID_159027409" CREATED="1364742181596" MODIFIED="1364742208607"/>
<node TEXT="void include(ServletRequest, ServletResponse)" ID="ID_537769288" CREATED="1364742209013" MODIFIED="1364742219527"/>
</node>
</node>
<node TEXT="Using RequestDispatchers" ID="ID_1505996760" CREATED="1364129063098" MODIFIED="1366756980123">
<node TEXT="Uso b&#xe1;sico" ID="ID_1857739601" CREATED="1364747624083" MODIFIED="1364747638610"/>
<node TEXT="Foreign Context RequestDispatchers" ID="ID_1419683943" CREATED="1364747638936" MODIFIED="1364747669025"/>
<node TEXT="Additional Request Attributes" ID="ID_1895198823" CREATED="1364747675282" MODIFIED="1366756973201">
<node TEXT="Include" ID="ID_927377025" CREATED="1364747751690" MODIFIED="1364747754337">
<node TEXT="javax.servlet.include.request_uri" ID="ID_629012865" CREATED="1364747888451" MODIFIED="1364747888451"/>
<node TEXT="javax.servlet.include.context_path" ID="ID_453427666" CREATED="1364747888452" MODIFIED="1364747888452"/>
<node TEXT="javax.servlet.include.servlet_path" ID="ID_1396653662" CREATED="1364747888453" MODIFIED="1364747888453"/>
<node TEXT="javax.servlet.include.path_info" ID="ID_85279047" CREATED="1364747888454" MODIFIED="1364747888454"/>
<node TEXT="javax.servlet.include.query_string" ID="ID_127437880" CREATED="1364747888454" MODIFIED="1364747888454"/>
</node>
<node TEXT="Forward" ID="ID_854866248" CREATED="1364747754798" MODIFIED="1364747761763">
<node TEXT="javax.servlet.forward.request_uri" ID="ID_478294312" CREATED="1364747902166" MODIFIED="1364747902166"/>
<node TEXT="javax.servlet.forward.context_path" ID="ID_656930222" CREATED="1364747902166" MODIFIED="1364747902166"/>
<node TEXT="javax.servlet.forward.servlet_path" ID="ID_1497784835" CREATED="1364747902167" MODIFIED="1364747902167"/>
<node TEXT="javax.servlet.forward.path_info" ID="ID_1833793207" CREATED="1364747902167" MODIFIED="1364747902167"/>
<node TEXT="javax.servlet.forward.query_string" ID="ID_733943759" CREATED="1364747902167" MODIFIED="1364747902167"/>
</node>
</node>
</node>
</node>
<node TEXT="Wrapping Requests and Responses" ID="ID_1810302517" CREATED="1364129085514" MODIFIED="1364752957232">
<node TEXT="Request Wrappers" ID="ID_1650860562" CREATED="1364129101923" MODIFIED="1364748894090">
<node ID="ID_1535695363" CREATED="1364748831477" MODIFIED="1364748845346"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <img src="RequestWrapper.png" />
  </body>
</html>
</richcontent>
</node>
<node TEXT="S&#xe3;o duas classes" ID="ID_1290321115" CREATED="1364748914289" MODIFIED="1364748942172">
<node TEXT="ServletRequestWrapper" ID="ID_1505889142" CREATED="1364748942172" MODIFIED="1364750320284">
<node TEXT="Provides a convenient implementation of the ServletRequest interface that can be subclassed by developers wishing to adapt the request to a Servlet. This class implements the Wrapper or Decorator pattern. Methods default to calling through to the wrapped request object." ID="ID_1493466186" CREATED="1364749451803" MODIFIED="1364749453619"/>
<node TEXT="/**  * Provides a convenient implementation of the ServletRequest interface that can  * be subclassed by developers wishing to adapt the request to a Servlet. This  * class implements the Wrapper or Decorator pattern. Methods default to calling  * through to the wrapped request object.  */ public class ServletRequestWrapper implements ServletRequest {  &#x9;private ServletRequest request;" ID="ID_1822088619" CREATED="1364750320284" MODIFIED="1364750323050"/>
<node TEXT="" ID="ID_58246431" CREATED="1364750328724" MODIFIED="1364750328724"/>
</node>
<node TEXT="HttpServletRequestWrapper" ID="ID_262134848" CREATED="1364748958928" MODIFIED="1364748969583"/>
</node>
</node>
<node TEXT="Response Wrappers" ID="ID_1398055208" CREATED="1364129116752" MODIFIED="1364748900936">
<node ID="ID_1096142622" CREATED="1364748849011" MODIFIED="1364748859815"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <img src="ResponseWrapper.png" />
  </body>
</html>
</richcontent>
</node>
</node>
</node>
<node TEXT="Wrappers and RequestDispatchers" ID="ID_654456694" CREATED="1364129136698" MODIFIED="1364129219742"/>
</node>
<node TEXT="Chapter 7: Filters" POSITION="right" ID="ID_1196405896" CREATED="1364738900278" MODIFIED="1366756587040">
<node TEXT="The Filter Mechanism" ID="ID_802277097" CREATED="1364738916051" MODIFIED="1364738967003">
<node TEXT="Why use Filters ?" ID="ID_1450399968" CREATED="1364738967005" MODIFIED="1364738977465"/>
<node TEXT="Filter Chains" ID="ID_1374449896" CREATED="1364738977798" MODIFIED="1364739009546"/>
<node TEXT="Filter X Request Dispatcher Mechanisms" ID="ID_1223383662" CREATED="1364739009791" MODIFIED="1364739044820"/>
<node TEXT="The Filter Life Cycle" ID="ID_1277070185" CREATED="1364739045187" MODIFIED="1364739058303"/>
</node>
<node TEXT="The Interfaces" ID="ID_1943053633" CREATED="1364739059549" MODIFIED="1364739069271">
<node TEXT="Filter" ID="ID_1418644587" CREATED="1364739069272" MODIFIED="1364739074094"/>
<node TEXT="FilterChain" ID="ID_766642442" CREATED="1364739074568" MODIFIED="1364739079388"/>
<node TEXT="FilterConfig" ID="ID_1930966610" CREATED="1364739079677" MODIFIED="1364739083537"/>
</node>
</node>
<node TEXT="Chapter 8: Asynchronous Requests" POSITION="right" ID="ID_1939534448" CREATED="1368547216551" MODIFIED="1368547249624"/>
<node TEXT="Chapter 9: Session Management" POSITION="right" ID="ID_853156652" CREATED="1368547251126" MODIFIED="1368547274700">
<node TEXT="Operating with Sessions" ID="ID_281851336" CREATED="1368547274710" MODIFIED="1368547292625">
<node TEXT="Session Tracking" ID="ID_1762320245" CREATED="1368547292635" MODIFIED="1368547315559"/>
<node TEXT="Session Life Cycles" ID="ID_1871487278" CREATED="1368547318344" MODIFIED="1368547326226"/>
</node>
<node TEXT="The HttpSession Interface" ID="ID_512540190" CREATED="1368547329595" MODIFIED="1368547345946">
<node TEXT="Session-Scoped Attributes" ID="ID_712637576" CREATED="1368547345956" MODIFIED="1368547365324"/>
<node TEXT="Life Cycle" ID="ID_1318705929" CREATED="1368547366438" MODIFIED="1368547374010"/>
</node>
<node TEXT="Session Listeners" ID="ID_778584953" CREATED="1368547377780" MODIFIED="1368547389767">
<node TEXT="HttpSessionListener" ID="ID_1960512237" CREATED="1368547389783" MODIFIED="1368547412006"/>
<node TEXT="HttpSessionActivationListener" ID="ID_281426770" CREATED="1368547412511" MODIFIED="1368547423737"/>
<node TEXT="HttpSessionAttributeListener" ID="ID_807993602" CREATED="1368547424243" MODIFIED="1368547433505"/>
<node TEXT="HttpSessionBindingListener" ID="ID_812612149" CREATED="1368547434033" MODIFIED="1368547451796"/>
</node>
</node>
<node TEXT="Chapter 1: Networks and HTTP" POSITION="left" ID="ID_391225263" CREATED="1366748448568" MODIFIED="1367361699385">
<node TEXT="The Internet" ID="ID_1587785926" CREATED="1366748488483" MODIFIED="1366748499663">
<node TEXT="IP Address" ID="ID_822828251" CREATED="1366748499663" MODIFIED="1366748506054"/>
<node TEXT="DNS" ID="ID_1952756709" CREATED="1366748506998" MODIFIED="1366748510265"/>
<node TEXT="URI, URL and URN" ID="ID_872975228" CREATED="1366748510677" MODIFIED="1366748528351"/>
<node TEXT="The Client-Server Model" ID="ID_1033868837" CREATED="1366748529013" MODIFIED="1366748540109"/>
</node>
<node TEXT="The Transfer of Data and Networks Protocols" ID="ID_844914135" CREATED="1366748542802" MODIFIED="1366748590406">
<node TEXT="Protocols in General" ID="ID_719198924" CREATED="1366748591536" MODIFIED="1366748618914"/>
<node TEXT="The Protocol HTTP" ID="ID_1616924086" CREATED="1366748619263" MODIFIED="1366748634827"/>
<node TEXT="HTTP Methods" ID="ID_1148247812" CREATED="1366748635552" MODIFIED="1366748646725"/>
<node TEXT="HTTP Status Codes" ID="ID_629880627" CREATED="1366748647168" MODIFIED="1366748654654"/>
</node>
</node>
<node TEXT="Chaper 2: Java EE Architeture" POSITION="left" ID="ID_791843481" CREATED="1366748673402" MODIFIED="1366753799292">
<node TEXT="Terminology" ID="ID_448077207" CREATED="1366748694020" MODIFIED="1366748704699">
<node TEXT="Web Components" ID="ID_1995939876" CREATED="1366748704699" MODIFIED="1366748711043">
<node TEXT="JSP" ID="ID_1405268191" CREATED="1366751283187" MODIFIED="1366751316891"/>
<node TEXT="Servlets" ID="ID_361809448" CREATED="1366751291413" MODIFIED="1366751310477"/>
</node>
<node TEXT="Web Applications" ID="ID_734112071" CREATED="1366748711268" MODIFIED="1366748777054"/>
<node TEXT="Web Containers" ID="ID_612489867" CREATED="1366748777294" MODIFIED="1366748781983">
<node TEXT="Web Application Contexts" ID="ID_1305143398" CREATED="1366751544405" MODIFIED="1366751552844">
<node TEXT="Context Root" ID="ID_1498541434" CREATED="1366751580239" MODIFIED="1366751585069"/>
<node TEXT="ClassLoader" ID="ID_1632868850" CREATED="1366751669094" MODIFIED="1366751673845"/>
</node>
<node TEXT="Communications between Applications" ID="ID_1788608524" CREATED="1366751553115" MODIFIED="1366751570273"/>
</node>
</node>
<node TEXT="Packaging Applications" ID="ID_1884752076" CREATED="1366748791511" MODIFIED="1366748806472">
<node TEXT="WAR Files" ID="ID_1975489108" CREATED="1366748806472" MODIFIED="1366748815864"/>
<node TEXT="Context Paths" ID="ID_448315197" CREATED="1366748816322" MODIFIED="1366748821886"/>
<node TEXT="WAR Structure" ID="ID_1534501620" CREATED="1366748822907" MODIFIED="1366748831768">
<node TEXT="WEB-INF/classes" ID="ID_1310111600" CREATED="1366751836511" MODIFIED="1366751849387"/>
<node TEXT="WEB-INF/lib" ID="ID_37545338" CREATED="1366751849596" MODIFIED="1366751853832"/>
<node TEXT="WEB-INF/tags" ID="ID_779795396" CREATED="1366751854650" MODIFIED="1366751859151"/>
</node>
<node TEXT="The Deployment Descriptor" ID="ID_1280579393" CREATED="1366748833383" MODIFIED="1366748841416"/>
<node TEXT="Key Java EE Web Components" ID="ID_1205337823" CREATED="1366748842265" MODIFIED="1366748866249">
<node TEXT="Servlets" ID="ID_1480639702" CREATED="1366751814912" MODIFIED="1366751822413"/>
<node TEXT="JSPs" ID="ID_1970925014" CREATED="1366751823075" MODIFIED="1366751825545"/>
<node TEXT="Tags" ID="ID_1906936350" CREATED="1366751826191" MODIFIED="1366751828442"/>
</node>
</node>
</node>
<node TEXT="Chapeter 3: Servlet Basics" POSITION="left" ID="ID_1237824569" CREATED="1366748869692" MODIFIED="1366754937619">
<node TEXT="Generic Servlets" ID="ID_986884276" CREATED="1366748883935" MODIFIED="1366748895067">
<node TEXT="Servlet Life Cycle" ID="ID_1260243093" CREATED="1366748895067" MODIFIED="1366754710074">
<node TEXT="Loaded" ID="ID_1628891455" CREATED="1366749053351" MODIFIED="1366753932487">
<node TEXT="WEB-INF/classes" ID="ID_75901792" CREATED="1366749528953" MODIFIED="1366749561806"/>
<node TEXT="WEB-INF/lib" ID="ID_1782290156" CREATED="1366749562452" MODIFIED="1366749570297"/>
</node>
<node TEXT="Instantiated" ID="ID_307588257" CREATED="1366749060748" MODIFIED="1366753929518">
<node TEXT="Default Constructor" ID="ID_1676064080" CREATED="1366749508539" MODIFIED="1366749524385"/>
</node>
<node TEXT="Initialisation" ID="ID_558196453" CREATED="1366749432134" MODIFIED="1366754307647">
<node TEXT="Comunicate configuration information to the Servlet" ID="ID_1158626701" CREATED="1366749600108" MODIFIED="1366749614516"/>
<node TEXT="Servlet.init(ServletConfig)" ID="ID_1939513512" CREATED="1366749614850" MODIFIED="1366749652437"/>
<node TEXT="GenericServlet.init()" ID="ID_97912064" CREATED="1366749653005" MODIFIED="1366749665163"/>
<node TEXT="GenericServlet.getServletConfig()" ID="ID_988772132" CREATED="1366749741945" MODIFIED="1366749773620"/>
<node TEXT="Exceptions" ID="ID_124738936" CREATED="1366749837055" MODIFIED="1366749843954">
<node TEXT="1 - ServletException" ID="ID_1161700153" CREATED="1366749843954" MODIFIED="1366749917683"/>
<node TEXT="2 - Garbage" ID="ID_18610006" CREATED="1366749921439" MODIFIED="1366749928518"/>
<node TEXT="3 - Reinstanciate" ID="ID_1120409312" CREATED="1366749933780" MODIFIED="1366749947376"/>
<node TEXT="4 - UnavailableException" ID="ID_1338782373" CREATED="1366749948632" MODIFIED="1366749971368"/>
</node>
</node>
<node TEXT="Service" ID="ID_842394868" CREATED="1366749464424" MODIFIED="1366749469019"/>
<node TEXT="Destroyed" ID="ID_1397959502" CREATED="1366749470259" MODIFIED="1366754637414">
<node TEXT="Servlet.destroy()" ID="ID_586169034" CREATED="1366749987585" MODIFIED="1366749999617"/>
<node TEXT="No arguments" ID="ID_1198678451" CREATED="1366750049960" MODIFIED="1366750056008"/>
<node TEXT="Throws no exceptions" ID="ID_1581810553" CREATED="1366750056389" MODIFIED="1366750081310"/>
<node TEXT="In case of an exception being throw at initalisation, it will not be invoked" ID="ID_1970220543" CREATED="1366750108181" MODIFIED="1366750149763"/>
</node>
</node>
<node TEXT="Request Servicing" ID="ID_1723910291" CREATED="1366748905949" MODIFIED="1366748914998">
<node TEXT="Servlet.service(ServletRequest, ServletResponse)" ID="ID_1650410441" CREATED="1366750215638" MODIFIED="1366750913714"/>
<node TEXT="Exceptions" ID="ID_61939684" CREATED="1366750442605" MODIFIED="1366750921326">
<node TEXT="ServletException" ID="ID_1170325735" CREATED="1366750449863" MODIFIED="1366750455379"/>
<node TEXT="UnavailableException" ID="ID_1763878788" CREATED="1366750456415" MODIFIED="1366750478056">
<node TEXT="HTTP Status code &quot;503 Service Unavailable&quot;" ID="ID_947224776" CREATED="1366750492797" MODIFIED="1366750535503"/>
</node>
<node TEXT="If the failure is permanent, the container remove the servlet from service" ID="ID_500847110" CREATED="1366750568517" MODIFIED="1366750753706">
<node TEXT="Further request : HTTP Status 404" ID="ID_1250865676" CREATED="1366750753706" MODIFIED="1366750838545"/>
</node>
</node>
</node>
</node>
<node TEXT="HTTP Servlets" ID="ID_501665356" CREATED="1366748915972" MODIFIED="1366754934306">
<node TEXT="HTTP Request Servicing" ID="ID_145325" CREATED="1366748929230" MODIFIED="1366748941996">
<node TEXT="HttpServletRequest" ID="ID_72575764" CREATED="1366750943996" MODIFIED="1366750956481"/>
<node TEXT="HttpServletResponse" ID="ID_1780503951" CREATED="1366750957143" MODIFIED="1366750962754"/>
</node>
<node TEXT="HttpServlet doXxx Methods" ID="ID_1446558580" CREATED="1366748942581" MODIFIED="1366748962036">
<node TEXT="GET" ID="ID_1990068538" CREATED="1366751020622" MODIFIED="1366751024170">
<node TEXT="doGet(HttpServletRequest, HttpServletResponse)" ID="ID_1264547600" CREATED="1366751045827" MODIFIED="1366751085064"/>
</node>
<node TEXT="POST" ID="ID_243843520" CREATED="1366751025129" MODIFIED="1366751026536">
<node TEXT="doPost(HttpServletRequest, HttpServletResponse)" ID="ID_1566835232" CREATED="1366751087132" MODIFIED="1366751094727"/>
</node>
<node TEXT="HEAD" ID="ID_1610219139" CREATED="1366751027526" MODIFIED="1366751028840">
<node TEXT="doHead(HttpServletRequest, HttpServletResponse)" ID="ID_861771174" CREATED="1366751101358" MODIFIED="1366751109719"/>
</node>
<node TEXT="PUT" ID="ID_1230310266" CREATED="1366751030299" MODIFIED="1366751031768">
<node TEXT="doPut(HttpServletRequest, HttpServletResponse)" ID="ID_1277697988" CREATED="1366751113193" MODIFIED="1366751128687"/>
</node>
<node TEXT="DELETE" ID="ID_1083154709" CREATED="1366751032775" MODIFIED="1366751035917">
<node TEXT="doDelete(HttpServletRequest, HttpServletResponse)" ID="ID_23273045" CREATED="1366751131427" MODIFIED="1366751138272"/>
</node>
<node TEXT="OPTIONS" ID="ID_518865048" CREATED="1366751036625" MODIFIED="1366751039127">
<node TEXT="doOptions(HttpServletRequest, HttpServletResponse)" ID="ID_1002235347" CREATED="1366751142059" MODIFIED="1366751149998"/>
</node>
<node TEXT="TRACE" ID="ID_1984327557" CREATED="1366751039742" MODIFIED="1366751041133">
<node TEXT="doTrace(HttpServletRequest, HttpServletResponse)" ID="ID_939275297" CREATED="1366751152754" MODIFIED="1366751159084"/>
</node>
</node>
</node>
</node>
</node>
</map>