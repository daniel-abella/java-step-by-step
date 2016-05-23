<map version="freeplane 1.3.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node TEXT="JAVA IO" ID="ID_404197355" CREATED="1364348938187" MODIFIED="1364348950989"><hook NAME="MapStyle" zoom="3.0">

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
<node TEXT="Classes B&#xe1;sicas" POSITION="right" ID="ID_1868494622" CREATED="1364349104023" MODIFIED="1364421541894">
<node TEXT="Stream de bytes (8 bits)" ID="ID_388040148" CREATED="1364349156062" MODIFIED="1364421460904">
<node TEXT="InputStream" ID="ID_1394417093" CREATED="1364349222776" MODIFIED="1364349236346"/>
<node TEXT="OutputStream" ID="ID_615577207" CREATED="1364349236898" MODIFIED="1364349244780"/>
</node>
<node TEXT="Stream de caracteres (Unicodes de 16 bits)" ID="ID_1020138421" CREATED="1364349246743" MODIFIED="1364421491863">
<node TEXT="Reader" ID="ID_1726689301" CREATED="1364349260328" MODIFIED="1364349267846"/>
<node TEXT="Writer" ID="ID_1217900728" CREATED="1364349268805" MODIFIED="1364349275119">
<font NAME="SansSerif" SIZE="12" BOLD="true"/>
</node>
</node>
</node>
<node TEXT="Perguntas antes de usar" POSITION="left" ID="ID_110230678" CREATED="1364349511024" MODIFIED="1364421546207">
<node TEXT="Vai trabalhar apenas operando sobre arquivos, n&#xe3;o acessando o conte&#xfa;do ?" ID="ID_805701610" CREATED="1364351253678" MODIFIED="1364421572921">
<node TEXT="Sim" ID="ID_1214985264" CREATED="1364351351019" MODIFIED="1364421576022">
<node TEXT="File" ID="ID_38650723" CREATED="1364351378572" MODIFIED="1364351383171"/>
</node>
<node TEXT="N&#xe3;o" ID="ID_1832585070" CREATED="1364351385933" MODIFIED="1364351388932">
<node TEXT="Qual o formato ?" ID="ID_77901135" CREATED="1364349522851" MODIFIED="1364421616454">
<node TEXT="Texto" ID="ID_805032821" CREATED="1364349531647" MODIFIED="1364421622815">
<node TEXT="Ler" ID="ID_1282816333" CREATED="1364350025737" MODIFIED="1364350036228">
<node TEXT="Reader" ID="ID_1037977961" CREATED="1364350036229" MODIFIED="1364350045429"/>
</node>
<node TEXT="Escrever" ID="ID_1993779495" CREATED="1364350058304" MODIFIED="1364350067705">
<node TEXT="Writer" ID="ID_924824982" CREATED="1364350046916" MODIFIED="1364350073789"/>
</node>
</node>
<node TEXT="Bin&#xe1;rio" ID="ID_1789553419" CREATED="1364349541400" MODIFIED="1364421635790">
<node TEXT="Ler" ID="ID_1655750533" CREATED="1364350083972" MODIFIED="1364350086903">
<node TEXT="InputStream" ID="ID_1039897218" CREATED="1364350086903" MODIFIED="1364350107049"/>
</node>
<node TEXT="Escrever" ID="ID_794690885" CREATED="1364350110134" MODIFIED="1364350139040">
<node TEXT="OutputStream" ID="ID_749737398" CREATED="1364350139041" MODIFIED="1364350147042"/>
</node>
</node>
</node>
<node TEXT="Voc&#xea; precisa de acesso rand&#xf4;mico ?" ID="ID_1532636546" CREATED="1364349549282" MODIFIED="1364421681046">
<node TEXT="Ler e Escrever" ID="ID_5799542" CREATED="1364350192237" MODIFIED="1364350200272">
<node TEXT="RandomAccessFile" ID="ID_1714076730" CREATED="1364350200273" MODIFIED="1364350219133"/>
</node>
</node>
<node TEXT="Vai trabalhar lendo ou escrevendo objetos ?" ID="ID_1809345841" CREATED="1364349581304" MODIFIED="1364421740125">
<node TEXT="Ler" ID="ID_1261809093" CREATED="1364350083972" MODIFIED="1364350086903">
<node TEXT="ObjectInputStream" ID="ID_1891530952" CREATED="1364350086903" MODIFIED="1364350286847"/>
</node>
<node TEXT="Escrever" ID="ID_1801373773" CREATED="1364350110134" MODIFIED="1364350139040">
<node TEXT="ObjectOutputStream" ID="ID_1214849298" CREATED="1364350139041" MODIFIED="1364350295748"/>
</node>
</node>
<node TEXT="Qual sua fonte ou destino do dados ? " ID="ID_1963514658" CREATED="1364349608661" MODIFIED="1364421876468">
<node TEXT="String" ID="ID_1671781882" CREATED="1364350390548" MODIFIED="1364350394635"/>
<node TEXT="Sockets" ID="ID_1238292102" CREATED="1364350395038" MODIFIED="1364350413953"/>
<node TEXT="Array de bytes" ID="ID_1193692659" CREATED="1364350414483" MODIFIED="1364350434923"/>
<node TEXT="Array de caracteres" ID="ID_1758421716" CREATED="1364350436486" MODIFIED="1364350446586"/>
<node TEXT="Console" ID="ID_706315299" CREATED="1364350447234" MODIFIED="1364350453813"/>
<node TEXT="Arquivos" ID="ID_857616971" CREATED="1364350454898" MODIFIED="1364350459156"/>
<node TEXT="Qualquer coisa" ID="ID_1211897171" CREATED="1364350459647" MODIFIED="1364350467521">
<font NAME="SansSerif" SIZE="12"/>
</node>
</node>
</node>
</node>
</node>
<node TEXT="Mas o que cai na prova ?" POSITION="right" ID="ID_1536679118" CREATED="1364351563995" MODIFIED="1366821034250">
<node TEXT="Classes para o formato texto" ID="ID_414721116" CREATED="1364351651073" MODIFIED="1366819555616">
<node TEXT="FileReader" ID="ID_1541302651" CREATED="1364351679588" MODIFIED="1364351710208"/>
<node TEXT="BufferedReader" ID="ID_989014012" CREATED="1364351710971" MODIFIED="1364354628474"/>
<node TEXT="FileWriter" ID="ID_1805444249" CREATED="1364351727470" MODIFIED="1364351735418"/>
<node TEXT="BufferedWriter" ID="ID_372489440" CREATED="1364351736351" MODIFIED="1364354636235"/>
<node TEXT="PrintWriter" ID="ID_1074174" CREATED="1364351749164" MODIFIED="1364351769154"/>
<node TEXT="Console" ID="ID_1293393707" CREATED="1364351771165" MODIFIED="1364351782453"/>
</node>
<node TEXT="Manipula&#xe7;&#xe3;o de Arquivos" ID="ID_1417920659" CREATED="1364351804923" MODIFIED="1366820313768">
<node TEXT="File" ID="ID_1861643174" CREATED="1364351817601" MODIFIED="1364351820281"/>
</node>
<node TEXT="Serializa&#xe7;&#xe3;o" ID="ID_906307598" CREATED="1364351823064" MODIFIED="1366820351144">
<node TEXT="ObjectInputStream" ID="ID_517319032" CREATED="1364351921470" MODIFIED="1364351932137"/>
<node TEXT="ObjectOutputStream" ID="ID_1496459291" CREATED="1364351932626" MODIFIED="1364351941827"/>
</node>
</node>
</node>
</map>
