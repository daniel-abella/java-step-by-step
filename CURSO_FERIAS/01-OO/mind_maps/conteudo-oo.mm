<map version="freeplane 1.3.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node LOCALIZED_TEXT="new_mindmap" ID="ID_1723255651" CREATED="1283093380553" MODIFIED="1283093380553"><hook NAME="MapStyle">

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
<hook NAME="AutomaticEdgeColor" COUNTER="1"/>
<node TEXT="cap5: Object orientation, Overloading and Overriding, Constructors and Return Types" POSITION="right" ID="Freemind_Link_181120073" CREATED="1132575412484" MODIFIED="1452977568233">
<edge COLOR="#ff0000"/>
<node TEXT="Benefits of Encapsulation " ID="Freemind_Link_975652670" CREATED="1132576431691" MODIFIED="1132577496853">
<font NAME="SansSerif" SIZE="12" BOLD="true"/>
<node TEXT="The goal of encapsulation is to hide implementation behind an interface" ID="Freemind_Link_319623409" CREATED="1134741406366" MODIFIED="1134741407473"/>
<node TEXT="poder modificar o c&#xf3;digo sem quebrar os clientes" ID="Freemind_Link_1089514878" CREATED="1134389354054" MODIFIED="1134389370458"/>
<node TEXT="get set" ID="Freemind_Link_259378460" CREATED="1134389428938" MODIFIED="1134389432539"/>
<node TEXT="problemas de encapsulamento" ID="Freemind_Link_1963683632" CREATED="1134389704502" MODIFIED="1134389722858">
<icon BUILTIN="messagebox_warning"/>
<node TEXT="tal condi&#xe7;&#xe3;o ser&#xe1; sempre verdade?" ID="Freemind_Link_251767441" CREATED="1134389724543" MODIFIED="1134389736000"/>
<node TEXT="n&#xe3;o, pq as vari&#xe1;veis s&#xe3;o publicas e qq um pode alter&#xe1;-las" ID="Freemind_Link_278398560" CREATED="1134389736909" MODIFIED="1134389755337"/>
</node>
<node TEXT="IS-A" ID="Freemind_Link_450771681" CREATED="1134389786200" MODIFIED="1134390163853">
<node TEXT="heran&#xe7;a" ID="Freemind_Link_1753752816" CREATED="1134390165451" MODIFIED="1134390167911"/>
</node>
<node TEXT="HAS-A" ID="Freemind_Link_521313653" CREATED="1134390169179" MODIFIED="1134390172061">
<node TEXT="refer&#xea;ncia" ID="Freemind_Link_590124005" CREATED="1134390175347" MODIFIED="1134390181045"/>
</node>
</node>
<node TEXT="Overridden and Overloaded Methods " ID="Freemind_Link_1086436912" CREATED="1132576438426" MODIFIED="1132577501013" COLOR="#ff0000">
<node TEXT="override" ID="Freemind_Link_137020887" CREATED="1134390362996" MODIFIED="1134391427018" COLOR="#006699">
<node TEXT="argumentos" ID="Freemind_Link_1755036651" CREATED="1134391066808" MODIFIED="1134391431630" COLOR="#669900">
<node TEXT="tem que ser a mesma, exatamente" ID="Freemind_Link_784745318" CREATED="1134390925710" MODIFIED="1134391158816"/>
</node>
<node TEXT="tipo de retorno" ID="Freemind_Link_347599063" CREATED="1134391077635" MODIFIED="1134391431625" COLOR="#669900">
<node TEXT="o mesmo" ID="Freemind_Link_1123022005" CREATED="1134390925719" MODIFIED="1134391165279"/>
</node>
<node TEXT="nivel de acesso" ID="Freemind_Link_3264807" CREATED="1134391091553" MODIFIED="1134391431619" COLOR="#669900">
<node TEXT="n&#xe3;o pode ser mais restritivo" ID="Freemind_Link_954559910" CREATED="1134390925728" MODIFIED="1134391375957">
<icon BUILTIN="button_cancel"/>
</node>
<node TEXT="pode ser menos" ID="Freemind_Link_1195714131" CREATED="1134390925729" MODIFIED="1134391380424">
<icon BUILTIN="button_ok"/>
</node>
</node>
<node TEXT="exception" ID="Freemind_Link_1292292155" CREATED="1134391106522" MODIFIED="1134391431603" COLOR="#669900">
<node TEXT="N&#xe3;o pode lan&#xe7;ar exce&#xe7;&#xf5;es mais abrangentes nem novas" ID="Freemind_Link_226922841" CREATED="1134390925729" MODIFIED="1134391371201">
<icon BUILTIN="button_cancel"/>
</node>
<node TEXT="Pode lan&#xe7;ar subclasses" ID="Freemind_Link_1272313100" CREATED="1134390925733" MODIFIED="1134391367493">
<icon BUILTIN="button_ok"/>
</node>
<node TEXT="N&#xe3;o precisa lan&#xe7;ar nada, se n&#xe3;o quiser" ID="Freemind_Link_1951053082" CREATED="1134391297104" MODIFIED="1134391389120">
<icon BUILTIN="messagebox_warning"/>
</node>
</node>
<node TEXT="final" ID="Freemind_Link_1360625147" CREATED="1134391115354" MODIFIED="1134391431598" COLOR="#669900">
<node TEXT="n&#xe3;o pode" ID="Freemind_Link_1249330956" CREATED="1134391337212" MODIFIED="1134391343144">
<icon BUILTIN="button_cancel"/>
</node>
</node>
<node TEXT="n&#xe3;o pode ser herdado" ID="Freemind_Link_549606094" CREATED="1134391128290" MODIFIED="1134391431589" COLOR="#669900">
<node TEXT="n&#xe3;o pode ser sobrescrto" ID="Freemind_Link_1832479087" CREATED="1134391351004" MODIFIED="1134391358250">
<icon BUILTIN="button_cancel"/>
</node>
</node>
<node TEXT="invocar do pai" ID="Freemind_Link_486189725" CREATED="1134391460465" MODIFIED="1134391482472" COLOR="#669900">
<node TEXT="super.bla()" ID="Freemind_Link_272332963" CREATED="1134391466818" MODIFIED="1134391475188" COLOR="#cc6600"/>
</node>
</node>
<node TEXT="overload" ID="Freemind_Link_103370618" CREATED="1134390367045" MODIFIED="1134391427012" COLOR="#006699">
<node TEXT="precisa mudar os argumentos" ID="Freemind_Link_1856852351" CREATED="1134391644465" MODIFIED="1134391729224" COLOR="#669900"/>
<node TEXT="pode" ID="Freemind_Link_698779591" CREATED="1134391681054" MODIFIED="1134391725715" COLOR="#669900">
<node TEXT="muda o retorno" ID="Freemind_Link_353946450" CREATED="1134391701223" MODIFIED="1134391705037"/>
<node TEXT="mudar o nivel de acesso" ID="Freemind_Link_1628005309" CREATED="1134391705870" MODIFIED="1134391711165"/>
<node TEXT="lan&#xe7;ar qq exce&#xe7;&#xe3;o" ID="Freemind_Link_248164569" CREATED="1134391712004" MODIFIED="1134391721639"/>
</node>
<node TEXT="pode ser sobrecarregado na filha" ID="Freemind_Link_669293142" CREATED="1134391644466" MODIFIED="1134391753560" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node TEXT="parece sobrescrita, mas &#xe9; sobrecarga" ID="Freemind_Link_1128902599" CREATED="1134391796909" MODIFIED="1134391873343">
<icon BUILTIN="messagebox_warning"/>
<edge WIDTH="thin"/>
<font NAME="SansSerif" SIZE="12"/>
<node TEXT="public class Foo {&#xa;   public void doStuff(int y, String s) { }&#xa;   public void moreThings(int x) { }&#xa;}&#xa;class Bar extends Foo {&#xa;   public void doStuff(int y, float s) throws IOException { }&#xa;}&#xa;" ID="Freemind_Link_1670072617" CREATED="1134391848932" MODIFIED="1134742717935">
<font NAME="Dialog" SIZE="12"/>
</node>
</node>
<node TEXT="invoca&#xe7;&#xe3;o" ID="Freemind_Link_1288249775" CREATED="1134391999551" MODIFIED="1134392006516" COLOR="#669900">
<node TEXT="depende dos parametros" ID="Freemind_Link_189633176" CREATED="1134392007632" MODIFIED="1134392015289"/>
<node TEXT="para objetos" ID="Freemind_Link_1233562257" CREATED="1134392018785" MODIFIED="1134392028454" COLOR="#006699">
<node TEXT="chama o mais restrito primeiro" ID="Freemind_Link_531328203" CREATED="1134392030722" MODIFIED="1134392042335"/>
<node TEXT="vale a classe declarada" ID="Freemind_Link_1159231957" CREATED="1134392043062" MODIFIED="1134392049134">
<node TEXT="n&#xe3;o a instanciada" ID="Freemind_Link_897040688" CREATED="1134392050201" MODIFIED="1134392068460" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
</node>
</node>
</node>
<node TEXT=" Polymorphism applies to overriding, not to overloading" ID="Freemind_Link_551907520" CREATED="1134742088517" MODIFIED="1134742091036"/>
</node>
<node TEXT="Constructors and Instantiation " ID="Freemind_Link_780853306" CREATED="1132576461789" MODIFIED="1134737749984" COLOR="#ff0000" VSHIFT="45">
<node TEXT="a &#xfa;nica forma de se criar um objeto &#xe9; pelo construtor" ID="Freemind_Link_493033221" CREATED="1134393278381" MODIFIED="1134393296596"/>
<node TEXT="todas as classes possuem pelo menos um construtor" ID="Freemind_Link_829629889" CREATED="1134393330070" MODIFIED="1134393344714">
<node TEXT="at&#xe9; as abstratas" ID="Freemind_Link_1437617563" CREATED="1134393346469" MODIFIED="1134393354694">
<icon BUILTIN="messagebox_warning"/>
</node>
<node TEXT="se n&#xe3;o definir construtor o compiler cria um" ID="Freemind_Link_34430749" CREATED="1134393401490" MODIFIED="1134393413373">
<node TEXT="s&#xf3; se n&#xe3;o definir nenhum" ID="Freemind_Link_171039897" CREATED="1134393415776" MODIFIED="1134393427240">
<icon BUILTIN="messagebox_warning"/>
</node>
<node TEXT="o construtor default tem o mesmo n&#xed;vel de acesso da classe" ID="Freemind_Link_884539594" CREATED="1134738334950" MODIFIED="1134738362194">
<icon BUILTIN="messagebox_warning"/>
</node>
</node>
</node>
<node TEXT="O construtor sempre chama o construtor do pai antes" ID="Freemind_Link_1739190069" CREATED="1134393854962" MODIFIED="1134393867455">
<node TEXT="implicito" ID="Freemind_Link_1112036963" CREATED="1134393875303" MODIFIED="1134393877918"/>
<node TEXT="explitico" ID="Freemind_Link_45169100" CREATED="1134393878542" MODIFIED="1134393880740"/>
</node>
<node TEXT="regras" ID="Freemind_Link_766760938" CREATED="1134737842124" MODIFIED="1134737844200">
<node TEXT="se tiver tipo de retorno, &#xe9; um m&#xe9;todo, n&#xe3;o consrutor" ID="Freemind_Link_1719122721" CREATED="1134737845888" MODIFIED="1134737873726">
<icon BUILTIN="messagebox_warning"/>
</node>
<node TEXT="a primeira coisa tem que ser this() ou super()" ID="Freemind_Link_1525547597" CREATED="1134737957587" MODIFIED="1134737971036">
<node TEXT="implicito" ID="Freemind_Link_720258443" CREATED="1134737972263" MODIFIED="1134737976865"/>
<node TEXT="expl&#xed;cito" ID="Freemind_Link_112871588" CREATED="1134737977783" MODIFIED="1134737983769"/>
<node TEXT="s&#xf3; pode acessar m&#xe9;todos ou vari&#xe1;veis de inst&#xe2;ncia depois" ID="Freemind_Link_994110895" CREATED="1134738074273" MODIFIED="1134742908892">
<icon BUILTIN="messagebox_warning"/>
</node>
<node TEXT="pode usar m&#xe9;todos e vari&#xe1;veis est&#xe1;ticas, mas s&#xf3; na chamada ao super() ou this()" ID="Freemind_Link_1554824906" CREATED="1134738114807" MODIFIED="1134738138541"/>
<node TEXT="n&#xe3;o pode ter os 2" ID="Freemind_Link_1485488840" CREATED="1134739665509" MODIFIED="1134739673670">
<icon BUILTIN="messagebox_warning"/>
</node>
</node>
</node>
<node TEXT="Se o pai n&#xe3;o tiver construtor vazio" ID="Freemind_Link_1076144137" CREATED="1134738545877" MODIFIED="1134738554520">
<node TEXT="tem que declarar um construtor para poder chamar o super direito" ID="Freemind_Link_608389980" CREATED="1134738555604" MODIFIED="1134738572850"/>
</node>
<node TEXT="construtor n&#xe3;o &#xe9; herdado nem pode ser sobrescrito" ID="Freemind_Link_1363123428" CREATED="1134739327926" MODIFIED="1134739340113"/>
</node>
<node TEXT="Legal Return Types " ID="Freemind_Link_1349417740" CREATED="1132576470343" MODIFIED="1134739791213" COLOR="#ff0000" VSHIFT="106">
<node TEXT="overloading" ID="Freemind_Link_537961192" CREATED="1134740023062" MODIFIED="1134740037235">
<node TEXT="pode mudar o retorno." ID="Freemind_Link_531798462" CREATED="1134740042601" MODIFIED="1134740054804">
<node TEXT="s&#xe3;o m&#xe9;todos diferentes" ID="Freemind_Link_207529420" CREATED="1134740056215" MODIFIED="1134740076531"/>
</node>
</node>
<node TEXT="overriding" ID="Freemind_Link_1691080524" CREATED="1134740037928" MODIFIED="1134740040946">
<node TEXT="n&#xe3;o pode mudar o retorno" ID="Freemind_Link_923243498" CREATED="1134740079486" MODIFIED="1134740088557">
<node TEXT="nem para subclasses, nem nada" ID="Freemind_Link_1616465053" CREATED="1134740089529" MODIFIED="1134740099998">
<icon BUILTIN="messagebox_warning"/>
</node>
</node>
</node>
<node TEXT="short s = (short) 90 + 900000;" ID="Freemind_Link_1128960459" CREATED="1134740340280" MODIFIED="1134740345960" COLOR="#cc6600">
<icon BUILTIN="messagebox_warning"/>
<node TEXT="n&#xe3;o compila" ID="Freemind_Link_235042132" CREATED="1134740347553" MODIFIED="1134740354168">
<icon BUILTIN="button_cancel"/>
</node>
</node>
</node>
</node>
</node>
</map>
