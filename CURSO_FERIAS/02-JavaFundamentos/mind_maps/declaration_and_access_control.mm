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
<node TEXT="Declara&#xe7;&#xe3;o e Controle de Acesso" POSITION="right" ID="ID_555023327" CREATED="1359220840721" MODIFIED="1452977116057">
<icon BUILTIN="full-1"/>
<font NAME="SansSerif" SIZE="12" BOLD="true"/>
<edge COLOR="#ff0000"/>
<node TEXT="Identificadores e JavaBeans (Obj 1.3 e 1.4)" ID="ID_1733315656" CREATED="1359221306765" MODIFIED="1363551471099">
<icon BUILTIN="button_ok"/>
<font NAME="SansSerif" SIZE="12" ITALIC="true"/>
<node TEXT="Identificadores Legais" ID="ID_595864382" CREATED="1359221403889" MODIFIED="1359294342428">
<font NAME="SansSerif" SIZE="12" ITALIC="true"/>
<node TEXT="Podem comen&#xe7;ar com letra, sublinha ou cifr&#xe3;o" ID="ID_1835913213" CREATED="1359294371757" MODIFIED="1359294405089">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Depois do primeiro caracter, identificadores pode incluir n&#xfa;meros" ID="ID_490865625" CREATED="1359294413970" MODIFIED="1359294447024">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Identificadores podem ter qualquer tamanho" ID="ID_1142689994" CREATED="1359294449388" MODIFIED="1359294475767">
<icon BUILTIN="yes"/>
</node>
<node TEXT="N&#xe3;o pode ser uma palavra reservada" ID="ID_1281465091" CREATED="1359294598947" MODIFIED="1359294723973">
<icon BUILTIN="yes"/>
</node>
</node>
<node TEXT="Conven&#xe7;&#xf5;es de C&#xf3;digo Java da Sun" ID="ID_82740640" CREATED="1359294171316" MODIFIED="1359294272092">
<node TEXT="Classes e Interfaces" ID="ID_1300685453" CREATED="1359295012289" MODIFIED="1359295228316">
<icon BUILTIN="yes"/>
<node TEXT="Primeira letra mai&#xfa;scula e CamelCase" ID="ID_990684817" CREATED="1359295144096" MODIFIED="1359295146125"/>
<node TEXT="Normalmente os nomes s&#xe3;o substantivos" ID="ID_1478640910" CREATED="1359295091428" MODIFIED="1359295154760"/>
</node>
<node TEXT="M&#xe9;todos" ID="ID_226362164" CREATED="1359295162705" MODIFIED="1359295295189">
<icon BUILTIN="yes"/>
<node TEXT="Primeira min&#xfa;scula seguido de camelCase" ID="ID_400738997" CREATED="1359295176913" MODIFIED="1359295217151"/>
<node TEXT="Normalmente os nomes s&#xe3;o pares verboSubstantivo" ID="ID_1037066018" CREATED="1359295220493" MODIFIED="1359295253639"/>
</node>
<node TEXT="Vari&#xe1;veis" ID="ID_1394479753" CREATED="1359295266866" MODIFIED="1359295276243">
<icon BUILTIN="yes"/>
<node TEXT="Primeira min&#xfa;scula seguido de camelCase" ID="ID_1714571331" CREATED="1359295278697" MODIFIED="1359295306154"/>
<node TEXT="Nomes curtos e significativos" ID="ID_577920518" CREATED="1359295308323" MODIFIED="1359295328009"/>
</node>
<node TEXT="Constantes" ID="ID_1693037705" CREATED="1359295332714" MODIFIED="1359295337545">
<icon BUILTIN="yes"/>
<node TEXT="Letras MAI&#xda;SCULAS" ID="ID_1458079272" CREATED="1359295340433" MODIFIED="1359295398166"/>
<node TEXT="Usam sublinha &quot;_&quot; como separadores" ID="ID_297468389" CREATED="1359295399150" MODIFIED="1359295424290"/>
</node>
</node>
<node TEXT="Padr&#xf5;es JavaBeans" ID="ID_488830673" CREATED="1359221428449" MODIFIED="1359294273875">
<node TEXT="Propriedades com privadas com m&#xe9;todos getters e setters para acesso e modifica&#xe7;&#xe3;o" ID="ID_1747133030" CREATED="1359295528402" MODIFIED="1379782168454">
<icon BUILTIN="yes"/>
</node>
</node>
<node TEXT="Regras de Nome&#xe7;&#xe3;o de Propriedades JavaBeans" ID="ID_1862349457" CREATED="1359221453703" MODIFIED="1359294276481">
<node TEXT="M&#xe9;todo de acesso getXxx ou isXxx (se xxx for booleano)" ID="ID_106487494" CREATED="1359295813441" MODIFIED="1359295891125">
<icon BUILTIN="yes"/>
</node>
<node TEXT="M&#xe9;todo de modifica&#xe7;&#xe3;o setXxx" ID="ID_1065438932" CREATED="1359295874475" MODIFIED="1359295893080">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Gets devem ser publicos e o tipo de retorno deve combinar com argumento do m&#xe9;todo set" ID="ID_1351372470" CREATED="1359296032508" MODIFIED="1359296081037">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Gets n&#xe3;o devem ter argumentos" ID="ID_1699326834" CREATED="1359296109830" MODIFIED="1359296119425">
<icon BUILTIN="yes"/>
</node>
</node>
<node TEXT="Regras de Nomea&#xe7;&#xe3;o de Listeners JavaBeans" ID="ID_185383935" CREATED="1359221477495" MODIFIED="1359227609410">
<node TEXT="addXxxListener(XxxListener l)" ID="ID_1253726899" CREATED="1359296124036" MODIFIED="1359296228882">
<icon BUILTIN="yes"/>
</node>
<node TEXT="removeXxxListener(XxxListener l)" ID="ID_252855288" CREATED="1359296230581" MODIFIED="1359296240227">
<icon BUILTIN="yes"/>
</node>
</node>
</node>
<node TEXT="Declarar Classes (Obj 1.1)" ID="ID_1056810497" CREATED="1359221511897" MODIFIED="1363551473145">
<icon BUILTIN="button_ok"/>
<font NAME="SansSerif" SIZE="12" ITALIC="true"/>
<node TEXT="Regras de Declara&#xe7;&#xe3;o para Arquivos-Fonte" ID="ID_1783181146" CREATED="1359221550608" MODIFIED="1359378994840">
<node TEXT="S&#xf3; pode haver uma classe public em cada arquivo" ID="ID_1687160735" CREATED="1359296414695" MODIFIED="1359296439938">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Os coment&#xe1;rios podem aparecer no in&#xed;cio ou fim de qualquer linha." ID="ID_1274873549" CREATED="1359296441035" MODIFIED="1359296483550">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Caso exista uma classe p&#xfa;blica, o arquivo deve ter o mesmo nome dessa classe" ID="ID_1521668470" CREATED="1359296484422" MODIFIED="1359296525923">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Se a classe estiver num pacote, a declara&#xe7;&#xe3;o do pacote deve vir na primeira linha, antes dos imports" ID="ID_664807808" CREATED="1359296527157" MODIFIED="1359296575419">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Os imports devem ficar entre a declara&#xe7;&#xe3;o do pacote(se houver) e a da classe" ID="ID_1002582378" CREATED="1359296577211" MODIFIED="1359296642475">
<icon BUILTIN="yes"/>
</node>
<node TEXT="As delcara&#xe7;&#xf5;es package e import se aplicam a todas as classes dentro do arquivo" ID="ID_1456525494" CREATED="1359296643080" MODIFIED="1359296707246">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Um arquivo pode ter v&#xe1;rias classes n&#xe3;o p&#xfa;blicas" ID="ID_1776632312" CREATED="1359296707933" MODIFIED="1359296732507">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Arquivos que n&#xe3;o tenham classes p&#xfa;blicas podem ter qualquer nome" ID="ID_175929265" CREATED="1359296735536" MODIFIED="1359296771499">
<icon BUILTIN="yes"/>
</node>
</node>
<node TEXT="Declara&#xe7;&#xf5;es e Modificadores de Classes" ID="ID_1762971100" CREATED="1359221571695" MODIFIED="1359378995839">
<node TEXT="Acesso a Classes" ID="ID_1251864837" CREATED="1359221587669" MODIFIED="1359221600579">
<node TEXT="Classes s&#xf3; podem ter acesso public ou default" ID="ID_1114399079" CREATED="1359303487185" MODIFIED="1359303516024">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Sendo default ela s&#xf3; pode ser vista por classes dentro do mesmo pacote" ID="ID_799345581" CREATED="1359303512119" MODIFIED="1359303548006">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Sendo public ela pode ser vista por todas as classes de todos os pacotes" ID="ID_1680887803" CREATED="1359303548743" MODIFIED="1359303567658">
<icon BUILTIN="yes"/>
</node>
</node>
<node TEXT="Outros Modificadores de Classes (N&#xe3;o referentes a Acesso)" ID="ID_23090858" CREATED="1359221602049" MODIFIED="1359221641424">
<node TEXT="Classes podem ser modificadas por final, abstract ou (strictfp)" ID="ID_1092201358" CREATED="1359303579913" MODIFIED="1359304003787" BACKGROUND_COLOR="#ffffff">
<icon BUILTIN="yes"/>
<font NAME="SansSerif" SIZE="12"/>
</node>
<node TEXT="Uma classe n&#xe3;o pode ser final e abstract ao mesmo tempo" ID="ID_605787256" CREATED="1359303756215" MODIFIED="1359303872721">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Uma classe final n&#xe3;o pode ser herdada" ID="ID_1573687695" CREATED="1359303784099" MODIFIED="1359303800933">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Uma classe abstract n&#xe3;o pode ser instanciada" ID="ID_1104262045" CREATED="1359303801991" MODIFIED="1359303812525">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Uma classe abstrata pode ter m&#xe9;todo abstratos e n&#xe3;o abstratos" ID="ID_1612186122" CREATED="1359303883405" MODIFIED="1359303906948">
<icon BUILTIN="yes"/>
</node>
<node TEXT="A primeira classe concreta que estende de uma abstrata deve implementar todos os m&#xe9;todos abstratos" ID="ID_1436717680" CREATED="1359303907880" MODIFIED="1359303937959">
<icon BUILTIN="yes"/>
</node>
</node>
</node>
</node>
<node TEXT="Declarar Interfaces (Obj 1.1 e 1.2)" ID="ID_1728423636" CREATED="1359221703463" MODIFIED="1363551475414">
<icon BUILTIN="button_ok"/>
<font NAME="SansSerif" SIZE="12" ITALIC="true"/>
<node TEXT="Declarando uma Interface" ID="ID_911739780" CREATED="1359221725137" MODIFIED="1359227609410">
<node TEXT="Todos os m&#xe9;todos de uma interface s&#xe3;o public e abstract implicitamente. " ID="ID_1462360323" CREATED="1359304116638" MODIFIED="1359304276082"/>
</node>
<node TEXT="Declarando Constantes de Interface" ID="ID_1152448657" CREATED="1359221741711" MODIFIED="1359227609410"/>
</node>
<node TEXT="Declarar Membros de Classes (Obj 1.3 e 1.4)" ID="ID_1544204859" CREATED="1359221761320" MODIFIED="1359227229800">
<icon BUILTIN="button_ok"/>
<font NAME="SansSerif" SIZE="12" ITALIC="true"/>
<node TEXT="Modificadores de Acesso" ID="ID_249473871" CREATED="1359221808410" MODIFIED="1359227609410">
<node TEXT="Membros Public" ID="ID_1424474456" CREATED="1359221835472" MODIFIED="1359221870054"/>
<node TEXT="Membros Private" ID="ID_1997943897" CREATED="1359221871233" MODIFIED="1359221875668"/>
<node TEXT="Membros Protected e Default" ID="ID_296040507" CREATED="1359221876342" MODIFIED="1359221888067"/>
<node TEXT="Detalhes de Default" ID="ID_1692482011" CREATED="1359221888871" MODIFIED="1359221905688"/>
<node TEXT="Vari&#xe1;veis Locais e Modificadores de Acesso" ID="ID_1454653079" CREATED="1359221907780" MODIFIED="1359221917938"/>
</node>
<node TEXT="Modificadores N&#xe3;o Referentes a Acesso" ID="ID_1581228758" CREATED="1359221955836" MODIFIED="1359227609410">
<node TEXT="M&#xe9;todos Final" ID="ID_480577797" CREATED="1359221996565" MODIFIED="1359222011998"/>
<node TEXT="Argumentos Final" ID="ID_1847287267" CREATED="1359222014129" MODIFIED="1359222019811"/>
<node TEXT="M&#xe9;todos Abstratos" ID="ID_1138300701" CREATED="1359222020767" MODIFIED="1359222132251"/>
<node TEXT="M&#xe9;todos Sincronizados" ID="ID_1449951473" CREATED="1359222137083" MODIFIED="1359222143639"/>
<node TEXT="M&#xe9;todos Nativos" ID="ID_73696341" CREATED="1359222144685" MODIFIED="1359222149007"/>
<node TEXT="M&#xe9;todos Strictfp" ID="ID_1036496869" CREATED="1359222149628" MODIFIED="1359222159134"/>
<node TEXT="M&#xe9;todos com Listas de Argumentos Vari&#xe1;veis (var-args)" ID="ID_885906193" CREATED="1359222165461" MODIFIED="1359222182623"/>
</node>
<node TEXT="Declara&#xe7;&#xe3;o de Construtores" ID="ID_1891385258" CREATED="1359222193429" MODIFIED="1359227609411"/>
<node TEXT="Declara&#xe7;&#xe3;o de Vari&#xe1;veis" ID="ID_353594996" CREATED="1359222202198" MODIFIED="1359227609411">
<node TEXT="Declarando Primitivos e Intervalos de Primitivos" ID="ID_358455825" CREATED="1359222212001" MODIFIED="1359222230468"/>
<node TEXT="Declara&#xe7;&#xe3;o de Vari&#xe1;veis de Refer&#xea;ncia" ID="ID_1832277402" CREATED="1359222237813" MODIFIED="1359222268073"/>
<node TEXT="Vari&#xe1;veis Locais (Autom&#xe1;tica / de Pilha / M&#xe9;todo)" ID="ID_257704125" CREATED="1359222269362" MODIFIED="1359222312994"/>
<node TEXT="Vari&#xe1;veis Final" ID="ID_754304377" CREATED="1359222315559" MODIFIED="1359222342032"/>
<node TEXT="Vari&#xe1;veis Transient" ID="ID_1605908041" CREATED="1359222343479" MODIFIED="1359222349107"/>
<node TEXT="Vari&#xe1;veis Volatile" ID="ID_438657803" CREATED="1359222349523" MODIFIED="1359222358178"/>
<node TEXT="Vari&#xe1;veis e M&#xe9;todos Est&#xe1;ticos" ID="ID_805909885" CREATED="1359222391555" MODIFIED="1359222404273">
<node TEXT="N&#xe3;o est&#xe3;o ligados a qualquer inst&#xe2;ncia espec&#xed;fica de uma classe" ID="ID_1888336903" CREATED="1359309513263" MODIFIED="1359309580336">
<icon BUILTIN="yes"/>
</node>
<node TEXT="N&#xe3;o &#xe9; preciso instanciar uma classe para usar membros static" ID="ID_1527751070" CREATED="1359309581016" MODIFIED="1359309608027">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Existe apenas uma c&#xf3;pia de uma vari&#xe1;vel e/ou classe est&#xe1;tica, que &#xe9; compartilhada por todas as inst&#xe2;ncias" ID="ID_1809514708" CREATED="1359309608758" MODIFIED="1359309647799">
<icon BUILTIN="yes"/>
</node>
<node TEXT="M&#xe9;todos static n&#xe3;o tem acesso direto a membros n&#xe3;o static" ID="ID_1631867505" CREATED="1359309664655" MODIFIED="1359309679951">
<icon BUILTIN="yes"/>
</node>
</node>
</node>
<node TEXT="Declarando Enums" ID="ID_1102442630" CREATED="1359222404999" MODIFIED="1359379003781">
<node TEXT="Declara&#xe7;&#xe3;o de Construtores, M&#xe9;todos e Varia&#xe7;&#xf5;es em um enum" ID="ID_1536877527" CREATED="1359222413262" MODIFIED="1359222436670">
<node TEXT="Um enum especifica uma lista de valores constantes que pode ser atribu&#xed;do a um determinado tipo" ID="ID_1779891665" CREATED="1359308584756" MODIFIED="1359308634023">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Enums n&#xe3;o s&#xe3;o Strings nem ints. O tipo cas constantes do enum &#xe9; o tipo do pr&#xf3;prio enum." ID="ID_1924366073" CREATED="1359308635152" MODIFIED="1359308724783">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Um enum pode ser declarado fora ou dentro de uma classe, mas n&#xe3;o num m&#xe9;todo" ID="ID_1231550390" CREATED="1359308696268" MODIFIED="1359308722489">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Os enums podem conter contrutores, m&#xe9;todos, vari&#xe1;veis e corpos de classes constantes" ID="ID_1457632814" CREATED="1359308727494" MODIFIED="1359308846917">
<icon BUILTIN="yes"/>
</node>
<node TEXT="As constantes enum podem passar argumentos para o construtor do enum." ID="ID_1691213062" CREATED="1359308847524" MODIFIED="1359308896004">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Os construtores dos enum podem ter argumentos e podem ser sobrecarregados" ID="ID_410668991" CREATED="1359308897201" MODIFIED="1359308929562">
<icon BUILTIN="yes"/>
</node>
<node TEXT="Os construtores dos enums nunca podem ser chamados diretamento no c&#xf3;digo. Eles s&#xe3;o semnpre chamados automaticamente quando um enum &#xe9; inicializado" ID="ID_447713923" CREATED="1359308933368" MODIFIED="1359308984037">
<icon BUILTIN="yes"/>
</node>
<node TEXT="O ponto e v&#xed;rgural ao final da declara&#xe7;&#xe3;o de um enum &#xe9; opcional" ID="ID_1065648733" CREATED="1359308985448" MODIFIED="1359309023562">
<icon BUILTIN="yes"/>
</node>
<node TEXT="MyEnum.values() retorna um array dos valores de MyEnum" ID="ID_1143662888" CREATED="1359309032624" MODIFIED="1359309072901">
<icon BUILTIN="yes"/>
</node>
</node>
</node>
</node>
</node>
</node>
</map>
