<map version="0.9.0">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1371587904909" ID="ID_578228071" MODIFIED="1371587966835" TEXT="AJAX">
<node CREATED="1371587978764" ID="ID_84581228" MODIFIED="1371588040798" POSITION="right" TEXT="&#xc9; um modo do browser fazer requisi&#xe7;&#xf5;es em sedundo plano sem sair da p&#xe1;gina em que est&#xe1; ou precisar recarreg&#xe1;-la"/>
<node CREATED="1371588210289" ID="ID_1880454367" MODIFIED="1371588214680" POSITION="left" TEXT="Comet">
<node CREATED="1371588214681" ID="ID_888133329" MODIFIED="1371588305724" TEXT="Outras nomenclaturas">
<node CREATED="1371588229900" ID="ID_1395003509" MODIFIED="1371588258295" TEXT=" Ajax Push"/>
<node CREATED="1371588259743" ID="ID_479314926" MODIFIED="1371588763451" TEXT="Reverse Ajax"/>
<node CREATED="1371588279960" ID="ID_414829010" MODIFIED="1371588292279" TEXT="Http Server push">
<node CREATED="1371588468174" ID="ID_1523412704" MODIFIED="1371588514698" TEXT="Faz um nova requisi&#xe7;&#xe3;o de tempos em tempos solicitando o response."/>
<node CREATED="1371588422771" ID="ID_1558143500" MODIFIED="1371588747423" TEXT="O servidor cria uma conex&#xe3;o persistente com um &#xfa;nico request e de tempos em tempos envia o response"/>
</node>
</node>
<node CREATED="1371588349759" ID="ID_336804080" MODIFIED="1371588358109" TEXT="Termos relacionados">
<node CREATED="1371588359372" ID="ID_1169697203" MODIFIED="1371588377707" TEXT="Conex&#xe3;p persistente"/>
<node CREATED="1371588379709" ID="ID_754569110" MODIFIED="1371588384467" TEXT="Http 1.1"/>
</node>
</node>
<node CREATED="1371588782726" ID="ID_937463077" MODIFIED="1371588789293" POSITION="right" TEXT="API">
<node CREATED="1371588789295" ID="ID_1242129621" MODIFIED="1371588797738" TEXT="Servlets">
<node CREATED="1371588805516" ID="ID_193438945" MODIFIED="1371588836125" TEXT="&lt;async-supported&gt;true&lt;/async-supported&gt;"/>
<node CREATED="1371588840025" ID="ID_1512832270" MODIFIED="1371588868623" TEXT="@WebServlet(asyncSupported=true"/>
</node>
<node CREATED="1371588798649" ID="ID_1996532406" MODIFIED="1371588801147" TEXT="Filters">
<node CREATED="1371588805516" ID="ID_256833113" MODIFIED="1371588836125" TEXT="&lt;async-supported&gt;true&lt;/async-supported&gt;"/>
<node CREATED="1371588840025" ID="ID_1157768643" MODIFIED="1371588887011" TEXT="@WebFilter(asyncSupported=true"/>
</node>
<node CREATED="1371589068017" ID="ID_1998135522" MODIFIED="1371589075498" TEXT="Clico de vida">
<node CREATED="1371589075500" ID="ID_553175232" MODIFIED="1371589091572" TEXT="1-Container recebe a requisi&#xe7;&#xe3;o"/>
<node CREATED="1371589092339" ID="ID_1676811008" MODIFIED="1371589133283" TEXT="2-service() do Servlet solicitado &#xe9; acionado"/>
<node CREATED="1371589134968" ID="ID_477214619" MODIFIED="1371589276251" TEXT="3-Dentro do service o m&#xe9;todo ServletRequest.startAsync() &#xe9; chamado">
<node CREATED="1371589276256" ID="ID_395956434" MODIFIED="1371589290295" TEXT="Ele retorna um AsyncContext">
<node CREATED="1371589290297" ID="ID_1639565640" MODIFIED="1371589377874" TEXT="AsyncContext.getRequest()"/>
<node CREATED="1371589290297" ID="ID_747710088" MODIFIED="1371589374561" TEXT="AsyncContext.getResponse()"/>
</node>
</node>
</node>
<node CREATED="1371589669124" ID="ID_1692613799" MODIFIED="1371589847031" TEXT="ServletRequest">
<node CREATED="1371589688407" ID="ID_1675367893" MODIFIED="1371589713705" TEXT="boolean isAsyncSupported()"/>
<node CREATED="1371589714710" ID="ID_872831674" MODIFIED="1371589727631" TEXT="boolean isAsyncStarted()"/>
<node CREATED="1371589728699" ID="ID_1209341559" MODIFIED="1371589759483" TEXT="AsyncContext startAsync(servletRequest, servletResponse)"/>
<node CREATED="1371589728699" ID="ID_667802188" MODIFIED="1371589802699" TEXT="AsyncContext startAsync()"/>
<node CREATED="1371589806316" ID="ID_1083809627" MODIFIED="1371590468483" TEXT="AsyncContext getAsyncContext() ">
<font NAME="SansSerif" SIZE="13"/>
</node>
</node>
<node CREATED="1371589837033" ID="ID_1290124420" MODIFIED="1371589856164" TEXT="AsyncContext">
<node CREATED="1371589858028" ID="ID_159041712" MODIFIED="1371589877844" TEXT="void setTimeout(long mili)"/>
<node CREATED="1371589879367" ID="ID_1921755723" MODIFIED="1371589892565" TEXT="long getTimeout()"/>
<node CREATED="1371589895780" ID="ID_1907324476" MODIFIED="1371589912346" TEXT="void start(Runnable task)"/>
<node CREATED="1371589960227" ID="ID_205717789" MODIFIED="1371590006119" TEXT="void complete()"/>
<node CREATED="1371590086973" ID="ID_1770975285" MODIFIED="1371590168088" TEXT="&lt;T extends AsyncListener&gt; T createListener(Class&lt;T&gt;)"/>
<node CREATED="1371590171021" ID="ID_942146218" MODIFIED="1371590190144" TEXT="void addListener(AsyncListener l)"/>
<node CREATED="1371590191752" ID="ID_1498815788" MODIFIED="1371590251317" TEXT="void addListener(AsyncListener, ServletRequest, ServletResponse)"/>
</node>
</node>
</node>
</map>
