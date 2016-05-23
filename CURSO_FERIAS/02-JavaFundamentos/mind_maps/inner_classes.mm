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
<node TEXT="Classes Internas" POSITION="right" ID="ID_782117345" CREATED="1359221245724" MODIFIED="1452977346205">
<icon BUILTIN="full-8"/>
<font NAME="SansSerif" SIZE="12" BOLD="true"/>
<edge COLOR="#ff0000"/>
<node TEXT="Classes Internas" ID="ID_1115011289" CREATED="1367170016760" MODIFIED="1367251450094">
<node TEXT="Criada dentro das chaves da classe continente" ID="ID_226043290" CREATED="1367170192965" MODIFIED="1367249611342"/>
<node TEXT="Pode ter qualquer modificador de acesso e os modificadores abstract e final" ID="ID_1581067948" CREATED="1367170246732" MODIFIED="1367249553676"/>
<node TEXT="Tem uma refer&#xea;ncia impl&#xed;cita &#xe0; classe continente" ID="ID_1245809192" CREATED="1367249613556" MODIFIED="1367249640877">
<node TEXT="ClasseExterna.this" ID="ID_213021947" CREATED="1367249652643" MODIFIED="1367249666355"/>
</node>
<node TEXT="Compartilha recursos com a classe externa" ID="ID_1970527466" CREATED="1367249671682" MODIFIED="1367249693996">
<node TEXT="imports" ID="ID_1746492461" CREATED="1367249693998" MODIFIED="1367249697357"/>
<node TEXT="todos os m&#xe9;todos, inclusive private" ID="ID_654263717" CREATED="1367249698116" MODIFIED="1367249722249"/>
<node TEXT="todos os atributos, inclusive private" ID="ID_1962183961" CREATED="1367249722978" MODIFIED="1367249751550"/>
</node>
<node TEXT="S&#xf3; pode ser acessada a partir de uma inst&#xe2;ncia da classe continente" ID="ID_1904535382" CREATED="1367249900116" MODIFIED="1367249921836">
<node TEXT="Para ter uma inst&#xe2;ncia da classe interna, necessariamente devo ter antes uma da externa" ID="ID_1814257961" CREATED="1367249928672" MODIFIED="1367249958614"/>
</node>
<node TEXT="Instanciando" ID="ID_1855386020" CREATED="1367249756055" MODIFIED="1367249763989">
<node TEXT="Dentro da classe continente" ID="ID_557878310" CREATED="1367249763991" MODIFIED="1367249773629">
<node TEXT="ClasseInterna interna = new ClasseInterna();" ID="ID_168204035" CREATED="1367249773631" MODIFIED="1367249793767"/>
</node>
<node TEXT="Fora da classe continente" ID="ID_1262605997" CREATED="1367249801870" MODIFIED="1367249812364">
<node TEXT="ClasseExterna.ClasseInterna interna = new ClasseExterna().new ClasseInterna();" ID="ID_1177231522" CREATED="1367249812366" MODIFIED="1367250084861"/>
<node TEXT="ClasseExterna externa = new ClasseExterna(); ClasseExterna.ClasseInterna interna = externa.new ClasseInterna();" ID="ID_273906764" CREATED="1367250076136" MODIFIED="1367250078554"/>
</node>
</node>
<node TEXT="Terminam em }" ID="ID_255574345" CREATED="1367250431486" MODIFIED="1367250438776"/>
</node>
<node TEXT="Classes Internas Locais de M&#xe9;todo" ID="ID_974422362" CREATED="1367170307186" MODIFIED="1367251452044">
<node TEXT="Criada dentro de um m&#xe9;todo" ID="ID_422109359" CREATED="1367170322050" MODIFIED="1367250116641"/>
<node TEXT="Instanciando" ID="ID_1481403985" CREATED="1367250117881" MODIFIED="1367250147747">
<node TEXT="Deve ocorrer dentro do mesmo m&#xe9;todo" ID="ID_50678025" CREATED="1367250147749" MODIFIED="1367250159589"/>
<node TEXT="Deve ocorrer AP&#xd3;S a declara&#xe7;&#xe3;o da classe" ID="ID_1016540318" CREATED="1367250160315" MODIFIED="1367250250308"/>
</node>
<node TEXT="N&#xe3;o pode acessar as vari&#xe1;veis locais do m&#xe9;todo" ID="ID_697719154" CREATED="1367250276784" MODIFIED="1367250311776">
<node TEXT="Somente se declaradas como final" ID="ID_137715891" CREATED="1367250311777" MODIFIED="1367250318740"/>
</node>
<node TEXT="S&#xf3; aceita os modificadores abstract e final" ID="ID_243940086" CREATED="1367250338349" MODIFIED="1367250350703"/>
<node TEXT="Termina em }" ID="ID_78329818" CREATED="1367250462712" MODIFIED="1367250468844"/>
</node>
<node TEXT="Classes Internas An&#xf4;nimas" ID="ID_585245614" CREATED="1367170365609" MODIFIED="1367252282003">
<node TEXT="Subclasse" ID="ID_477196933" CREATED="1367170489396" MODIFIED="1367252684695">
<node TEXT="Termina em };" ID="ID_1292402160" CREATED="1367250487816" MODIFIED="1367250521433"/>
<node TEXT="Normalmente usada em atribui&#xe7;&#xf5;es" ID="ID_393972581" CREATED="1367250521926" MODIFIED="1367250530820"/>
<node TEXT="M&#xe9;todos da classe pai podem ser sobrescritos" ID="ID_25757449" CREATED="1367250541595" MODIFIED="1367250557082"/>
<node TEXT="M&#xe9;todos novos podem ser criados" ID="ID_1096637994" CREATED="1367250557576" MODIFIED="1367250565042"/>
<node TEXT="Mas somente os m&#xe9;todos vis&#xed;veis na classe pai podem ser acessados" ID="ID_1331857830" CREATED="1367250565763" MODIFIED="1367250583275"/>
<node TEXT="N&#xe3;o pode estender uma outra classe nem implementar um interface" ID="ID_392946581" CREATED="1367250594240" MODIFIED="1367250613448"/>
</node>
<node TEXT="Implementador de uma interface" ID="ID_318694231" CREATED="1367170560335" MODIFIED="1367249144268"/>
<node TEXT="Definida no Argumento de um m&#xe9;todo" ID="ID_1393778055" CREATED="1367170571881" MODIFIED="1367249165009"/>
</node>
<node TEXT="Classes Est&#xe1;ticas Aninhadas" ID="ID_1298383722" CREATED="1367170914091" MODIFIED="1367250658405">
<node TEXT="Instanciando" ID="ID_306507995" CREATED="1367170931786" MODIFIED="1367170944574"/>
</node>
</node>
</node>
</map>
