<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="SimplePDL2LTL"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="/home/alex/workspace/ATL/Models/"/>
		<constant value="1"/>
		<constant value="Sequence"/>
		<constant value="#native"/>
		<constant value="Process"/>
		<constant value="simplepdl"/>
		<constant value="J.allInstances():J"/>
		<constant value="2"/>
		<constant value="J.toLTL():J"/>
		<constant value="name"/>
		<constant value="J.+(J):J"/>
		<constant value=".ltl"/>
		<constant value="J.writeTo(J):J"/>
		<constant value="B.not():B"/>
		<constant value="24"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="3:27-3:61"/>
		<constant value="4:3-4:20"/>
		<constant value="4:3-4:35"/>
		<constant value="5:20-5:24"/>
		<constant value="5:20-5:32"/>
		<constant value="5:41-5:51"/>
		<constant value="5:54-5:58"/>
		<constant value="5:54-5:63"/>
		<constant value="5:41-5:63"/>
		<constant value="5:66-5:72"/>
		<constant value="5:41-5:72"/>
		<constant value="5:20-5:73"/>
		<constant value="4:3-5:74"/>
		<constant value="3:2-5:74"/>
		<constant value="spdl"/>
		<constant value="repertoire"/>
		<constant value="self"/>
		<constant value="concatenateStrings"/>
		<constant value="J"/>
		<constant value="3"/>
		<constant value=""/>
		<constant value="4"/>
		<constant value="5"/>
		<constant value="12:36-12:38"/>
		<constant value="12:2-12:9"/>
		<constant value="12:41-12:44"/>
		<constant value="12:47-12:53"/>
		<constant value="12:41-12:53"/>
		<constant value="12:56-12:57"/>
		<constant value="12:41-12:57"/>
		<constant value="12:60-12:65"/>
		<constant value="12:41-12:65"/>
		<constant value="12:2-12:66"/>
		<constant value="s"/>
		<constant value="acc"/>
		<constant value="strings"/>
		<constant value="before"/>
		<constant value="after"/>
		<constant value="toLTL"/>
		<constant value="Msimplepdl!Process;"/>
		<constant value="op finished = "/>
		<constant value="0"/>
		<constant value="processElements"/>
		<constant value="J.concatenateStrings(JJJ):J"/>
		<constant value=";"/>
		<constant value="17:2-17:18"/>
		<constant value="19:4-19:8"/>
		<constant value="19:4-19:24"/>
		<constant value="19:38-19:39"/>
		<constant value="19:38-19:47"/>
		<constant value="19:4-19:48"/>
		<constant value="21:4-21:14"/>
		<constant value="21:34-21:56"/>
		<constant value="21:58-21:60"/>
		<constant value="21:62-21:64"/>
		<constant value="21:4-21:65"/>
		<constant value="18:3-21:65"/>
		<constant value="17:2-22:3"/>
		<constant value="22:6-22:9"/>
		<constant value="17:2-22:9"/>
		<constant value="p"/>
		<constant value="processElementsStrings"/>
		<constant value="Msimplepdl!WorkDefinition;"/>
		<constant value="_finished /\ "/>
		<constant value="28:2-28:6"/>
		<constant value="28:2-28:11"/>
		<constant value="28:14-28:30"/>
		<constant value="28:2-28:30"/>
		<constant value="Msimplepdl!WorkSequence;"/>
		<constant value="34:2-34:4"/>
	</cp>
	<operation name="1">
		<context type="2"/>
		<parameters>
		</parameters>
		<code>
			<push arg="3"/>
			<store arg="4"/>
			<push arg="5"/>
			<push arg="6"/>
			<new/>
			<push arg="7"/>
			<push arg="8"/>
			<findme/>
			<call arg="9"/>
			<iterate/>
			<store arg="10"/>
			<load arg="10"/>
			<call arg="11"/>
			<load arg="4"/>
			<load arg="10"/>
			<get arg="12"/>
			<call arg="13"/>
			<push arg="14"/>
			<call arg="13"/>
			<call arg="15"/>
			<call arg="16"/>
			<if arg="17"/>
			<load arg="10"/>
			<call arg="18"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="19" begin="0" end="0"/>
			<lne id="20" begin="5" end="7"/>
			<lne id="21" begin="5" end="8"/>
			<lne id="22" begin="11" end="11"/>
			<lne id="23" begin="11" end="12"/>
			<lne id="24" begin="13" end="13"/>
			<lne id="25" begin="14" end="14"/>
			<lne id="26" begin="14" end="15"/>
			<lne id="27" begin="13" end="16"/>
			<lne id="28" begin="17" end="17"/>
			<lne id="29" begin="13" end="18"/>
			<lne id="30" begin="11" end="19"/>
			<lne id="31" begin="2" end="24"/>
			<lne id="32" begin="0" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="10" end="23"/>
			<lve slot="1" name="34" begin="1" end="24"/>
			<lve slot="0" name="35" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="36">
		<context type="2"/>
		<parameters>
			<parameter name="4" type="37"/>
			<parameter name="10" type="37"/>
			<parameter name="38" type="37"/>
		</parameters>
		<code>
			<push arg="39"/>
			<store arg="40"/>
			<load arg="4"/>
			<iterate/>
			<store arg="41"/>
			<load arg="40"/>
			<load arg="10"/>
			<call arg="13"/>
			<load arg="41"/>
			<call arg="13"/>
			<load arg="38"/>
			<call arg="13"/>
			<store arg="40"/>
			<enditerate/>
			<load arg="40"/>
		</code>
		<linenumbertable>
			<lne id="42" begin="0" end="0"/>
			<lne id="43" begin="2" end="2"/>
			<lne id="44" begin="5" end="5"/>
			<lne id="45" begin="6" end="6"/>
			<lne id="46" begin="5" end="7"/>
			<lne id="47" begin="8" end="8"/>
			<lne id="48" begin="5" end="9"/>
			<lne id="49" begin="10" end="10"/>
			<lne id="50" begin="5" end="11"/>
			<lne id="51" begin="0" end="14"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="5" name="52" begin="4" end="12"/>
			<lve slot="4" name="53" begin="1" end="14"/>
			<lve slot="0" name="35" begin="0" end="14"/>
			<lve slot="1" name="54" begin="0" end="14"/>
			<lve slot="2" name="55" begin="0" end="14"/>
			<lve slot="3" name="56" begin="0" end="14"/>
		</localvariabletable>
	</operation>
	<operation name="57">
		<context type="58"/>
		<parameters>
		</parameters>
		<code>
			<push arg="59"/>
			<push arg="5"/>
			<push arg="6"/>
			<new/>
			<load arg="60"/>
			<get arg="61"/>
			<iterate/>
			<store arg="4"/>
			<load arg="4"/>
			<call arg="11"/>
			<call arg="18"/>
			<enditerate/>
			<store arg="4"/>
			<getasm/>
			<load arg="4"/>
			<push arg="39"/>
			<push arg="39"/>
			<call arg="62"/>
			<call arg="13"/>
			<push arg="63"/>
			<call arg="13"/>
		</code>
		<linenumbertable>
			<lne id="64" begin="0" end="0"/>
			<lne id="65" begin="4" end="4"/>
			<lne id="66" begin="4" end="5"/>
			<lne id="67" begin="8" end="8"/>
			<lne id="68" begin="8" end="9"/>
			<lne id="69" begin="1" end="11"/>
			<lne id="70" begin="13" end="13"/>
			<lne id="71" begin="14" end="14"/>
			<lne id="72" begin="15" end="15"/>
			<lne id="73" begin="16" end="16"/>
			<lne id="74" begin="13" end="17"/>
			<lne id="75" begin="1" end="17"/>
			<lne id="76" begin="0" end="18"/>
			<lne id="77" begin="19" end="19"/>
			<lne id="78" begin="0" end="20"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="79" begin="7" end="10"/>
			<lve slot="1" name="80" begin="12" end="17"/>
			<lve slot="0" name="35" begin="0" end="20"/>
		</localvariabletable>
	</operation>
	<operation name="57">
		<context type="81"/>
		<parameters>
		</parameters>
		<code>
			<load arg="60"/>
			<get arg="12"/>
			<push arg="82"/>
			<call arg="13"/>
		</code>
		<linenumbertable>
			<lne id="83" begin="0" end="0"/>
			<lne id="84" begin="0" end="1"/>
			<lne id="85" begin="2" end="2"/>
			<lne id="86" begin="0" end="3"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="35" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="57">
		<context type="87"/>
		<parameters>
		</parameters>
		<code>
			<push arg="39"/>
		</code>
		<linenumbertable>
			<lne id="88" begin="0" end="0"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="35" begin="0" end="0"/>
		</localvariabletable>
	</operation>
</asm>
