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
<node TEXT="Array Declaration, Construction, and Initialization " POSITION="right" ID="Freemind_Link_1461212718" CREATED="1132576012887" MODIFIED="1452977821408" COLOR="#ff0000"><richcontent TYPE="NOTE">

<html><head/><body><p>Write code that declares, constructs, and initializes arrays of any base type using any of<br/>the permitted forms both for declaration and for initialization.<br/></p></body></html>
</richcontent>
<edge COLOR="#ff0000"/>
<node TEXT="declara&#xe7;&#xe3;o" ID="Freemind_Link_405610757" CREATED="1132940689201" MODIFIED="1132940697215"/>
<node TEXT="constru&#xe7;&#xe3;o" ID="Freemind_Link_799434887" CREATED="1132940849238" MODIFIED="1132940855225">
<node TEXT="qtos objetos s&#xe3;o criados" ID="Freemind_Link_789487606" CREATED="1132940933177" MODIFIED="1132940944091">
<icon BUILTIN="messagebox_warning"/>
</node>
</node>
<node TEXT="atribui&#xe7;&#xe3;o" ID="Freemind_Link_1205060584" CREATED="1132940855845" MODIFIED="1132940866376">
<node TEXT="cuidado com indice &gt; capacidade" ID="Freemind_Link_1320982760" CREATED="1132940979054" MODIFIED="1132941042877" COLOR="#999999">
<icon BUILTIN="messagebox_warning"/>
<font NAME="SansSerif" SIZE="10"/>
</node>
<node TEXT="elemento por elemento" ID="Freemind_Link_1491891959" CREATED="1132941044508" MODIFIED="1132941048638"/>
<node TEXT="no loop" ID="Freemind_Link_368286791" CREATED="1132941049405" MODIFIED="1133177877152"/>
<node TEXT="numa s&#xf3; linha" ID="Freemind_Link_1410459517" CREATED="1132941053456" MODIFIED="1132941056637"/>
<node TEXT="anonimo" ID="Freemind_Link_1493875357" CREATED="1132941057251" MODIFIED="1132941061369">
<node TEXT="n&#xe3;o especifica o tamanho" ID="Freemind_Link_1789521583" CREATED="1132941098868" MODIFIED="1132941108041" COLOR="#999999">
<icon BUILTIN="messagebox_warning"/>
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node TEXT="formas legais" ID="Freemind_Link_59673674" CREATED="1132941135885" MODIFIED="1132941152787" COLOR="#006699">
<node TEXT="tipos primitivos" ID="Freemind_Link_1567535216" CREATED="1132941169090" MODIFIED="1132941172891"/>
<node TEXT="referencias a objetos" ID="Freemind_Link_1591714164" CREATED="1132941173537" MODIFIED="1132941178137">
<node TEXT="is-a" ID="Freemind_Link_1871101029" CREATED="1133179342187" MODIFIED="1133179344217"/>
</node>
<node TEXT="atribui&#xe7;&#xe3;o de referencias a arrays" ID="Freemind_Link_996565676" CREATED="1133178384380" MODIFIED="1133178516941" COLOR="#006699">
<node TEXT="uma dimens&#xe3;o" ID="Freemind_Link_1420368201" CREATED="1133179127941" MODIFIED="1133179131191">
<node TEXT="tipos primitivos: n&#xe3;o pode promover" ID="Freemind_Link_1365954793" CREATED="1133178411426" MODIFIED="1133178428936">
<node TEXT="int[] splats;&#xa;int[] dats = new int[4];&#xa;char[] letters = new char[5];&#xa;splats = dats; // OK, dats refers to an int array&#xa;splats = letters; // NOT OK, letters refers to a char array&#xa;" ID="Freemind_Link_1764183748" CREATED="1133178447660" MODIFIED="1133178474461"/>
</node>
<node TEXT="objetos: pode (is a)" ID="Freemind_Link_1957065949" CREATED="1133178430226" MODIFIED="1133178445540">
<node TEXT="Car[] cars;&#xa;Honda[] cuteCars = new Honda[5];&#xa;cars = cuteCars; // OK because Honda is a type of Car (extends)&#xa;" ID="Freemind_Link_282838989" CREATED="1133178479493" MODIFIED="1195909659461"/>
</node>
</node>
<node TEXT="multidimensional" ID="Freemind_Link_1112376638" CREATED="1133179132775" MODIFIED="1133179139213">
<node TEXT="Tem que ter a mesma dimens&#xe3;o" ID="Freemind_Link_1371879064" CREATED="1133179193460" MODIFIED="1133179210692">
<node TEXT="int[] blots;&#xa;int[][] squeegees = new int[3][];&#xa;blots = squeegees; // NOT OK, squeegees is a two-d array of int arrays&#xa;" ID="Freemind_Link_1449256414" CREATED="1133179254114" MODIFIED="1133179282502"/>
</node>
<node TEXT="pode construir s&#xf3; uma dimens&#xe3;o" ID="Freemind_Link_101547800" CREATED="1133179212356" MODIFIED="1133179244293">
<node TEXT="//vale&#xa;int[][] teste = new int[2][];&#xa;&#xa;teste[0] = new int[2];&#xa;teste[1] = new int[3];&#xa;" ID="Freemind_Link_1579471127" CREATED="1133179148967" MODIFIED="1133179187811"/>
</node>
</node>
</node>
</node>
</node>
</node>
</node>
</map>
