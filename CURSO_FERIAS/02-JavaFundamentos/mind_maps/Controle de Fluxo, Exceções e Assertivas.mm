<map version="freeplane 1.3.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node TEXT="Controle de Fluxo, Exce&#xe7;&#xf5;es e Assertivas" ID="ID_468085269" CREATED="1359221115001" MODIFIED="1363617514410" LINK="OCJP_16.mm">
<icon BUILTIN="full-5"/>
<font NAME="SansSerif" SIZE="12" BOLD="true"/>
<hook NAME="MapStyle" zoom="1.5">

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
<node TEXT="Tratamento de exce&#xe7;&#xf5;es (Obj. 2.4 e 2.5)" POSITION="right" ID="ID_1789889597" CREATED="1363551678965" MODIFIED="1366819385926">
<icon BUILTIN="button_ok"/>
<node TEXT="Capturando uma exce&#xe7;&#xe3;o usando try-catch" ID="ID_1399922695" CREATED="1363551799660" MODIFIED="1363551819981"/>
<node TEXT="Usando finally" ID="ID_85384767" CREATED="1363551821341" MODIFIED="1363551827584"/>
<node TEXT="Propagando exce&#xe7;&#xf5;es n&#xe3;o capturadas" ID="ID_127527613" CREATED="1363551828031" MODIFIED="1363551876500"/>
<node TEXT="Definindo exce&#xe7;&#xf5;es" ID="ID_305852475" CREATED="1363551877237" MODIFIED="1363551897585"/>
<node TEXT="Hierarquia de exce&#xe7;&#xf5;es" ID="ID_124525315" CREATED="1363551898061" MODIFIED="1366819035586">
<node ID="ID_1605578356" CREATED="1363620327741" MODIFIED="1363620368874"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <img src="exceptions.jpg" />
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1513787231" CREATED="1363617465146" MODIFIED="1363617485781"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <img src="ExceptionHierarchy.gif" />
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="Manipulando uma hierarquia inteira de classes de exece&#xe7;&#xf5;es" ID="ID_401647624" CREATED="1363551909813" MODIFIED="1363551936502"/>
<node TEXT="Correspond&#xea;ncia/Combina&#xe7;&#xe3;o de exce&#xe7;&#xf5;es" ID="ID_281731782" CREATED="1363551937077" MODIFIED="1363551970831">
<font NAME="SansSerif" SIZE="12"/>
</node>
<node TEXT="Declara&#xe7;&#xe3;o de exce&#xe7;&#xf5;es e interfaces p&#xfa;blicas" ID="ID_1087185917" CREATED="1363552045441" MODIFIED="1363552065804"/>
<node TEXT="Relan&#xe7;ando a mesma exce&#xe7;&#xe3;o" ID="ID_1971544972" CREATED="1363552067925" MODIFIED="1363552082203"/>
</node>
<node TEXT="Erros e exce&#xe7;&#xf5;es comuns (Obj. 2.6)" POSITION="right" ID="ID_168359435" CREATED="1363552087667" MODIFIED="1366819031399">
<icon BUILTIN="button_ok"/>
<node TEXT="De onde vem as exce&#xe7;&#xf5;es" ID="ID_84098381" CREATED="1363552119975" MODIFIED="1363552186008"/>
<node TEXT="Exce&#xe7;&#xf5;es lan&#xe7;adas pela JVM" ID="ID_1146672679" CREATED="1363552187879" MODIFIED="1363552196131"/>
<node TEXT="Exce&#xe7;&#xf5;es lan&#xe7;adas programaticamente" ID="ID_473053712" CREATED="1363552196821" MODIFIED="1363552210438"/>
<node TEXT="Um resumo das exce&#xe7;&#xf5;es e erros para o exame" ID="ID_119292413" CREATED="1363552210974" MODIFIED="1363552232862"/>
</node>
<node TEXT="Resumo de exce&#xe7;&#xf5;es" POSITION="right" ID="ID_1804881367" CREATED="1363552955380" MODIFIED="1366819426910">
<icon BUILTIN="button_ok"/>
<node TEXT="podem ser" ID="ID_35703939" CREATED="1363553042744" MODIFIED="1366819381390">
<node TEXT="Definidas" ID="ID_1922173959" CREATED="1363552883485" MODIFIED="1363553119177">
<node TEXT="Criando uma subclasse de Exception" ID="ID_367641605" CREATED="1363554972003" MODIFIED="1363554985608"/>
</node>
<node TEXT="Declaradas" ID="ID_1674179949" CREATED="1363552986915" MODIFIED="1363553123964">
<node TEXT="Colocando-se na assinatura do m&#xe9;todo a palavra throws seguida das exce&#xe7;&#xf5;es que ele pode lan&#xe7;ar" ID="ID_1249347500" CREATED="1363554991357" MODIFIED="1363613807189"/>
</node>
<node TEXT="Lan&#xe7;adas" ID="ID_1107316732" CREATED="1363552992887" MODIFIED="1363553128810">
<node TEXT="Ou n&#xe3;o se capturando a exce&#xe7;&#xe3;o ou usando  &quot;throw e&quot; ou &quot;throw new MinhaExcecao()&quot;" ID="ID_351149357" CREATED="1363613798985" MODIFIED="1363613865272"/>
</node>
<node TEXT="Tratadas" ID="ID_1457319350" CREATED="1363553001387" MODIFIED="1363553134503">
<node TEXT="Usando-se blocos try-catch" ID="ID_328452202" CREATED="1363613874469" MODIFIED="1363613886062"/>
</node>
</node>
<node TEXT="Quanto ao tipo s&#xe3;o" ID="ID_1527836190" CREATED="1363553338810" MODIFIED="1366819380046">
<node TEXT="Checadas" ID="ID_972228754" CREATED="1363553697763" MODIFIED="1366819217124">
<node TEXT="Estendem de Exception" ID="ID_564206802" CREATED="1363553738906" MODIFIED="1363553749170"/>
<node TEXT="Devem ser declaradas" ID="ID_459456720" CREATED="1363553749999" MODIFIED="1363553766014"/>
<node TEXT="S&#xe3;o lan&#xe7;adas programaticamente" ID="ID_700973498" CREATED="1363553767266" MODIFIED="1363553779117"/>
<node TEXT="Indicam quando uma condi&#xe7;&#xe3;o necess&#xe1;rioa para o funcionamento da opera&#xe7;&#xe3;o n&#xe3;o &#xe9; satisfeita" ID="ID_134842805" CREATED="1363553780502" MODIFIED="1363553829087"/>
</node>
<node TEXT="N&#xe3;o checadas" ID="ID_731731454" CREATED="1363553703558" MODIFIED="1366819379007">
<node TEXT="Extendem de RuntimeException" ID="ID_1160572534" CREATED="1363553851281" MODIFIED="1363553861068"/>
<node TEXT="A sua declara&#xe7;&#xe3;o &#xe9; opcional (normalmente n&#xe3;o se declara)" ID="ID_112765170" CREATED="1363553862117" MODIFIED="1363553917510"/>
<node TEXT="S&#xe3;o lan&#xe7;adas pela JVM" ID="ID_1193207741" CREATED="1363553922959" MODIFIED="1363553930438"/>
<node TEXT="Representam defeitos no programa, bugs" ID="ID_462413981" CREATED="1363553931558" MODIFIED="1363554212115" COLOR="#990000"/>
<node TEXT="Alguns exemplos s&#xe3;o" ID="ID_1908832378" CREATED="1363554428690" MODIFIED="1366819304087">
<node TEXT="ArrayIndexOutOffBoundsException" ID="ID_1703959455" CREATED="1363554439379" MODIFIED="1363554510653"/>
<node TEXT="ClassCastException" ID="ID_441776401" CREATED="1363554511490" MODIFIED="1363554528328"/>
<node TEXT="NullPointerException" ID="ID_1755516232" CREATED="1363554530933" MODIFIED="1363554545347"/>
<node TEXT="IllegalArgumentException" ID="ID_1631338833" CREATED="1363554283410" MODIFIED="1363554363802"/>
<node TEXT="IllegalStateException" ID="ID_1674438655" CREATED="1363554365097" MODIFIED="1363554380315"/>
<node TEXT="NumberFormatException" ID="ID_1376996977" CREATED="1363554381518" MODIFIED="1363554404957"/>
</node>
<node TEXT="" ID="ID_1784324898" CREATED="1363554239954" MODIFIED="1382813770945">
<node TEXT="" ID="ID_2365017" CREATED="1363554255689" MODIFIED="1382813793752"/>
</node>
</node>
<node TEXT="Erros" ID="ID_1308744068" CREATED="1363553710042" MODIFIED="1366819263392" COLOR="#338800">
<node TEXT="Estendem de Error" ID="ID_1382878513" CREATED="1363554734991" MODIFIED="1363554746359"/>
<node TEXT="A sua declara&#xe7;&#xe3;o &#xe9; opcional (normalmente n&#xe3;o se declara)" ID="ID_882167559" CREATED="1363554747840" MODIFIED="1363554766615"/>
<node TEXT="S&#xe3;o lan&#xe7;adas pela JVM" ID="ID_1796004101" CREATED="1363554767911" MODIFIED="1363554780235"/>
<node TEXT="Representam erros ocorrido internamente na JVM (alguns impossibilitam a continua&#xe7;&#xe3;o do programa)" ID="ID_1915447705" CREATED="1363554781073" MODIFIED="1363554827990"/>
<node TEXT="Alguns exemplos s&#xe3;o" ID="ID_980213570" CREATED="1363554830075" MODIFIED="1363554843001">
<node TEXT="ExceptionInInitializerError" ID="ID_254651453" CREATED="1363554843003" MODIFIED="1363554880101"/>
<node TEXT="StackOverFlowError" ID="ID_1244725889" CREATED="1363554881501" MODIFIED="1363554896978"/>
<node TEXT="NoClassDefFoundError" ID="ID_254559561" CREATED="1363554897587" MODIFIED="1363554925750">
<font NAME="SansSerif" SIZE="12" BOLD="true"/>
</node>
</node>
</node>
</node>
</node>
</node>
</map>
