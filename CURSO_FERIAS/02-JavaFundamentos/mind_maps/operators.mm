<map version="freeplane 1.3.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node LOCALIZED_TEXT="new_mindmap" ID="ID_1723255651" CREATED="1283093380553" MODIFIED="1283093380553"><hook NAME="MapStyle">
    <properties show_note_icons="true"/>

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
<node TEXT="Java Operators " POSITION="right" ID="Freemind_Link_78435410" CREATED="1132576211219" MODIFIED="1452977488929" COLOR="#ff0000"><richcontent TYPE="NOTE">

<html><head/><body><p>Determine the result of applying any operator (including assignment operators and<br/>instanceof) to operands of any type, class, scope, or accessibility, or any combination<br/>of these.<br/></p></body></html>
</richcontent>
<edge COLOR="#ff0000"/>
<node TEXT="assignment" ID="Freemind_Link_1995447502" CREATED="1133548809756" MODIFIED="1133549014790" COLOR="#006699">
<node TEXT="primitive" ID="Freemind_Link_1586496938" CREATED="1133548821969" MODIFIED="1133554493345" COLOR="#006699">
<node TEXT="o resultado de qq express&#xe3;o envolvendo inteiros &#xe9; implicitamente int" ID="Freemind_Link_1985912392" CREATED="1133553035750" MODIFIED="1133553110508" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node TEXT="de int pra byte, char e short tem que ter cast" ID="Freemind_Link_734208357" CREATED="1133553091071" MODIFIED="1133553111310" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="floating-point" ID="Freemind_Link_643961637" CREATED="1133548831549" MODIFIED="1133554492706" COLOR="#006699">
<node TEXT="literais s&#xe3;o implicitamente double" ID="Freemind_Link_745853336" CREATED="1133553216852" MODIFIED="1133553226947" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node TEXT="de double pra float, precisa de cast" ID="Freemind_Link_119324532" CREATED="1133553233091" MODIFIED="1133553245146" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="literal maior que a capacidade" ID="Freemind_Link_1232788693" CREATED="1133548845493" MODIFIED="1133554486185" COLOR="#669900">
<node TEXT="os bits mais altos s&#xe3;o jogados fora" ID="Freemind_Link_597489367" CREATED="1133553536548" MODIFIED="1133553569164" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
<node TEXT="(byte) 128 = -128" ID="Freemind_Link_1259735147" CREATED="1133553572470" MODIFIED="1133553593544" COLOR="#cc6600">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="operador composto " ID="Freemind_Link_1691468742" CREATED="1133553628209" MODIFIED="1133553690342" COLOR="#669900">
<icon BUILTIN="messagebox_warning"/>
<font NAME="SansSerif" SIZE="10"/>
<node TEXT="byte b; &#xa;b+= 7 //compila sem cast" ID="Freemind_Link_1296111781" CREATED="1133553663105" MODIFIED="1133869156233" COLOR="#cc6600">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
</node>
<node TEXT="uma vari&#xe1;vel primitiva a outra" ID="Freemind_Link_1652006815" CREATED="1133548869649" MODIFIED="1133554479664" COLOR="#669900">
<node TEXT="c&#xf3;pia, n&#xe3;o refer&#xea;ncia" ID="Freemind_Link_788318635" CREATED="1133553802666" MODIFIED="1133553817092" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="refer&#xea;ncia" ID="Freemind_Link_1424235159" CREATED="1133548885823" MODIFIED="1133548915199">
<node TEXT="refer&#xea;ncia, d&#xe3;!" ID="Freemind_Link_1746081745" CREATED="1133554051227" MODIFIED="1133554062307" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="uma refer&#xea;ncia a outra" ID="Freemind_Link_1102267992" CREATED="1133548903333" MODIFIED="1133554480523" COLOR="#669900">
<node TEXT="as duas referenciam o mesmo objeto" ID="Freemind_Link_1474769006" CREATED="1133554425439" MODIFIED="1133554450804" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node TEXT="strings s&#xe3;o imut&#xe1;veis" ID="Freemind_Link_1845022822" CREATED="1133554441411" MODIFIED="1133554457097" COLOR="#999999">
<icon BUILTIN="messagebox_warning"/>
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="operadores compostos" ID="Freemind_Link_1430573610" CREATED="1133869056525" MODIFIED="1133869063320">
<node TEXT="*=, /=, %=, +=, -=, &lt;&lt;=, &gt;&gt;=, &gt;&gt;&gt;=, &amp;=, ^=, |= " ID="Freemind_Link_1499086463" CREATED="1133869091731" MODIFIED="1133869103104" COLOR="#cc6600"/>
<node TEXT="faz cast autom&#xe1;tico" ID="Freemind_Link_1493074328" CREATED="1133869141001" MODIFIED="1133869156259">
<icon BUILTIN="messagebox_warning"/>
<arrowlink SHAPE="CUBIC_CURVE" COLOR="#000000" WIDTH="2" TRANSPARENCY="80" FONT_SIZE="9" FONT_FAMILY="SansSerif" DESTINATION="Freemind_Link_1296111781" STARTINCLINATION="236;0;" ENDINCLINATION="236;0;" STARTARROW="NONE" ENDARROW="DEFAULT"/>
</node>
</node>
</node>
<node TEXT="compara&#xe7;&#xe3;o" ID="Freemind_Link_1484686763" CREATED="1133548923772" MODIFIED="1133549013152" COLOR="#006699">
<node TEXT="&gt;" ID="Freemind_Link_763945080" CREATED="1133548950072" MODIFIED="1133549010702" COLOR="#cc6600"/>
<node TEXT="&gt;=" ID="Freemind_Link_332114096" CREATED="1133548952066" MODIFIED="1133549010708" COLOR="#cc6600"/>
<node TEXT="&lt;" ID="Freemind_Link_179853570" CREATED="1133548954587" MODIFIED="1133549010713" COLOR="#cc6600"/>
<node TEXT="&lt;=" ID="Freemind_Link_1011682205" CREATED="1133548955957" MODIFIED="1133549010723" COLOR="#cc6600"/>
<node TEXT="pode usar" ID="Freemind_Link_1798891861" CREATED="1133548985976" MODIFIED="1133548996693" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
<node TEXT="inteiros" ID="Freemind_Link_1652253506" CREATED="1133548973211" MODIFIED="1133549005905" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node TEXT="floating points" ID="Freemind_Link_265375638" CREATED="1133548978205" MODIFIED="1133549005894" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node TEXT="character" ID="Freemind_Link_954943300" CREATED="1133548983432" MODIFIED="1133549005879" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
</node>
<node TEXT="instanceof" ID="Freemind_Link_984915594" CREATED="1133549023446" MODIFIED="1133549029761" COLOR="#cc6600">
<node TEXT="null instanceof X" ID="Freemind_Link_1837957713" CREATED="1133554927261" MODIFIED="1133555019851" COLOR="#999999">
<icon BUILTIN="button_cancel"/>
<font NAME="SansSerif" SIZE="10"/>
</node>
<node TEXT="array istanceof Object" ID="Freemind_Link_1579567358" CREATED="1133554989405" MODIFIED="1133555065968" COLOR="#999999">
<icon BUILTIN="button_ok"/>
<font NAME="SansSerif" SIZE="10"/>
<edge WIDTH="thin"/>
</node>
<node TEXT="A extends B implements C =&gt; A instanceof C" ID="Freemind_Link_559661576" CREATED="1133554955029" MODIFIED="1133554980268" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="igualdade" ID="Freemind_Link_1143780219" CREATED="1133549049286" MODIFIED="1133549419203" COLOR="#006699">
<node TEXT="==" ID="Freemind_Link_463807552" CREATED="1133549060185" MODIFIED="1133549066212" COLOR="#cc6600"/>
<node TEXT="!=" ID="Freemind_Link_1907924983" CREATED="1133549062381" MODIFIED="1133549066872" COLOR="#cc6600"/>
<node TEXT="primitivos" ID="Freemind_Link_1897275666" CREATED="1133549076680" MODIFIED="1133549079294">
<node TEXT="vale qq num&#xe9;ricos misturados" ID="Freemind_Link_216378532" CREATED="1133555603630" MODIFIED="1133555620225" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node TEXT="cuidado com == e =" ID="Freemind_Link_1244811145" CREATED="1133555623531" MODIFIED="1133555634698" COLOR="#999999">
<icon BUILTIN="messagebox_warning"/>
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="refer&#xea;ncias" ID="Freemind_Link_793577425" CREATED="1133549087048" MODIFIED="1133549090509">
<node TEXT="mesmo ponteiro" ID="Freemind_Link_716555844" CREATED="1133555754228" MODIFIED="1133555760301" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
</node>
<node TEXT="aritm&#xe9;ticos" ID="Freemind_Link_997916373" CREATED="1133549095981" MODIFIED="1133549420410" COLOR="#006699">
<node TEXT="+" ID="Freemind_Link_1900428900" CREATED="1133549109574" MODIFIED="1133549122596" COLOR="#999900"/>
<node TEXT="-" ID="Freemind_Link_1958952613" CREATED="1133549111735" MODIFIED="1133549122602" COLOR="#999900"/>
<node TEXT="*" ID="Freemind_Link_306198493" CREATED="1133549112947" MODIFIED="1133549122606" COLOR="#999900"/>
<node TEXT="/" ID="Freemind_Link_1568230646" CREATED="1133549113387" MODIFIED="1133549122611" COLOR="#999900"/>
<node TEXT="%" ID="Freemind_Link_1733979037" CREATED="1133555884795" MODIFIED="1133555889730" COLOR="#cc6600">
<node TEXT="resto da divis&#xe3;o inteira" ID="Freemind_Link_324591708" CREATED="1133555891592" MODIFIED="1133555902354" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="divis&#xe3;o por zero" ID="Freemind_Link_1791697764" CREATED="1133556019805" MODIFIED="1133556026134" COLOR="#669900">
<node TEXT="com inteiros - RuntimeException" ID="Freemind_Link_1566777557" CREATED="1133556027620" MODIFIED="1133556041162" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node TEXT="com floating-point - inifinito + e -" ID="Freemind_Link_539917342" CREATED="1133556041814" MODIFIED="1133556065090" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="concatena&#xe7;&#xe3;o de string" ID="Freemind_Link_1749423006" CREATED="1133549161262" MODIFIED="1133556296724" COLOR="#669900">
<edge WIDTH="thin"/>
<node TEXT="&quot;&quot; + 2 + 3 = &quot;23&quot;" ID="Freemind_Link_557463798" CREATED="1133556278807" MODIFIED="1133556293695" COLOR="#cc6600">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="incremento e decremento" ID="Freemind_Link_1190952004" CREATED="1133549176405" MODIFIED="1133549181278">
<node TEXT="cuidado com incremento em vari&#xe1;veis final" ID="Freemind_Link_1744051996" CREATED="1133556444746" MODIFIED="1133556460421" COLOR="#999999">
<icon BUILTIN="messagebox_warning"/>
<font NAME="SansSerif" SIZE="10"/>
</node>
<node TEXT="antes e depois" ID="Freemind_Link_498548820" CREATED="1133556463597" MODIFIED="1133556468317" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
</node>
<node TEXT="shift" ID="Freemind_Link_692327707" CREATED="1133549226683" MODIFIED="1133561015901" COLOR="#006699">
<icon BUILTIN="flag"/>
<node TEXT="&gt;&gt;" ID="Freemind_Link_1123057297" CREATED="1133549248804" MODIFIED="1133549257149" COLOR="#cc6600">
<node TEXT="4 &gt;&gt;= 1 == 2" ID="Freemind_Link_1154373217" CREATED="1133561865549" MODIFIED="1133561972496" COLOR="#cc6600">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node TEXT="0x80 &gt;&gt; 1 == 0xC0" ID="Freemind_Link_332496702" CREATED="1133561891927" MODIFIED="1133561970472" COLOR="#cc6600">
<font NAME="SansSerif" SIZE="10"/>
<node TEXT="mant&#xe9;m o sinal" ID="Freemind_Link_559936111" CREATED="1133561954745" MODIFIED="1133561966564" COLOR="#999999">
<icon BUILTIN="messagebox_warning"/>
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
</node>
<node TEXT="&gt;&gt;&gt;" ID="Freemind_Link_1114069013" CREATED="1133549252637" MODIFIED="1133549257160" COLOR="#cc6600">
<node TEXT="0x80 &gt;&gt;= 1 == 0x40" ID="Freemind_Link_1852676167" CREATED="1133562037114" MODIFIED="1133562056280" COLOR="#cc6600">
<font NAME="SansSerif" SIZE="10"/>
<node TEXT="n&#xe3;o mant&#xe9;m o sinal" ID="Freemind_Link_1057819199" CREATED="1133562065329" MODIFIED="1133562073249" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
</node>
<node TEXT="&lt;&lt;" ID="Freemind_Link_1594098587" CREATED="1133549250457" MODIFIED="1133549257155" COLOR="#cc6600"/>
<node TEXT="X shift N == X shift N%32 (capacidade)" ID="Freemind_Link_1883510446" CREATED="1133561983960" MODIFIED="1133562031881" COLOR="#999999">
<icon BUILTIN="messagebox_warning"/>
<font NAME="SansSerif" SIZE="10"/>
<node TEXT="n&#xe3;o d&#xe1; a volta!" ID="Freemind_Link_519546594" CREATED="1133562013474" MODIFIED="1133562021645" COLOR="#999999">
<icon BUILTIN="messagebox_warning"/>
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="s&#xf3; pode ser usado em inteiros" ID="Freemind_Link_8839269" CREATED="1133869474384" MODIFIED="1133869538750" COLOR="#999999">
<icon BUILTIN="messagebox_warning"/>
<font NAME="SansSerif" SIZE="10"/>
</node>
<node TEXT="operandos s&#xe3;o promovidos a int" ID="Freemind_Link_618917492" CREATED="1133869523675" MODIFIED="1133869536084" COLOR="#999999">
<icon BUILTIN="messagebox_warning"/>
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="bitwise" ID="Freemind_Link_721589213" CREATED="1133549277481" MODIFIED="1133549423362" COLOR="#006699">
<node TEXT="&amp;" ID="Freemind_Link_1572776234" CREATED="1133549287083" MODIFIED="1133549377706" COLOR="#cc6600"/>
<node TEXT="|" ID="Freemind_Link_1877985317" CREATED="1133549289794" MODIFIED="1133549377712" COLOR="#cc6600"/>
<node TEXT="exclusive or (circunflexo)" ID="Freemind_Link_745333730" CREATED="1133549291380" MODIFIED="1133562199282" COLOR="#cc6600">
<node TEXT="1 xor 1 = 0" ID="Freemind_Link_293802881" CREATED="1133562206018" MODIFIED="1133562215603" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
</node>
<node TEXT="bitwise complement (til)" ID="Freemind_Link_926542941" CREATED="1133549322902" MODIFIED="1133562242665">
<node TEXT="troca todos os bits" ID="Freemind_Link_1559865376" CREATED="1133562232760" MODIFIED="1133562250966" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="condicional" ID="Freemind_Link_136753132" CREATED="1133549351270" MODIFIED="1133549354576">
<node TEXT="x ? y : z" ID="Freemind_Link_334145649" CREATED="1133549356297" MODIFIED="1133549374234" COLOR="#cc6600">
<node TEXT="aninhados" ID="Freemind_Link_641876573" CREATED="1133562295284" MODIFIED="1133562304354" COLOR="#999999">
<icon BUILTIN="messagebox_warning"/>
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
</node>
<node TEXT="primitive casting" ID="Freemind_Link_922704955" CREATED="1133549395750" MODIFIED="1133549401133">
<node TEXT="maior no menor - precisa de cast explicito" ID="Freemind_Link_1828529023" CREATED="1133563028824" MODIFIED="1133563042522" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node TEXT="floating-point em inteiro - precisa de cast" ID="Freemind_Link_87226907" CREATED="1133563043254" MODIFIED="1133563059250" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
<node TEXT="perde-se as casas decimais" ID="Freemind_Link_320611967" CREATED="1133563060341" MODIFIED="1133563070206" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="se passar, joga-se os bits mais altos fora" ID="Freemind_Link_1896045431" CREATED="1133563080194" MODIFIED="1133563095769" COLOR="#999999">
<font NAME="SansSerif" SIZE="10"/>
<node TEXT="byte b = (byte)130; // (b == -126)&#xa;                               // o um que sobe vira sinal&#xa;&#xa;" ID="Freemind_Link_565491137" CREATED="1133563096762" MODIFIED="1133563171538" COLOR="#cc6600">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
</node>
</node>
</node>
</map>
