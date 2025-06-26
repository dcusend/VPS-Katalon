<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_var XSRF_UUID_PARAMETER_KEY  f4214bec-9_0e4326</name>
   <tag></tag>
   <elementGuidId>72422ea1-5bc9-41a4-bc0c-d6e769cb38aa</elementGuidId>
   <selectorCollection>
      <entry>
         <key>BASIC</key>
         <value>//*[(text() = concat(&quot;&#xd;
        	&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
var XSRF_UUID_PARAMETER_KEY = &quot; , &quot;'&quot; , &quot;f4214bec-9a6f-414d-9a9f-84cc386a9100&quot; , &quot;'&quot; , &quot;;&#xd;
var WAITING_MESSAGE = &quot;Processing...&quot;;&#xd;
function onchanged(value) {&#xd;
 setLanguageSelectMessage();&#xd;
 var ajax = new Ajax();&#xd;
 ajax.get(&quot; , &quot;'&quot; , &quot;/vbills/mbills/languageSelect.go?action=languageSelect&amp;forgotType=null&amp;locale=&quot; , &quot;'&quot; , &quot;+value, windowReload, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);&#xd;
 }&#xd;
function windowReload(){&#xd;
  window.location.reload();&#xd;
}&#xd;
function setLanguageSelectMessage() {&#xd;
    var waitingInfoDiv = getWaitingInfoDivControl();&#xd;
    waitingInfoDiv.innerHTML = &quot;&lt;strong>&quot;+WAITING_MESSAGE+&quot;&lt;\/strong>&quot; ;&#xd;
}&#xd;
function getWaitingInfoDivControl() {&#xd;
    return document.getElementById(&quot; , &quot;'&quot; , &quot;waitingInfoDiv&quot; , &quot;'&quot; , &quot;);&#xd;
}&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
            &#xd;
&#xd;
&#xd;
     &#xd;
&#xd;
&#xd;
            &#xd;
&#xd;
 &#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
  &#xd;
  &#xd;
   &#xd;
   &#xd;
&#xd;
&#xd;
   &#xd;
&#xd;
&#xd;
   &#xd;
&#xd;
&#xd;
function toURL(url){&#xd;
	var obj = document.getElementById(&quot;toURLForm&quot;);&#xd;
	obj.action = url;&#xd;
	obj.submit();&#xd;
}&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
            &#xd;
                &#xd;
                    &#xd;
                     &#xd;
                    &#xd;
                    &#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&lt;!--&#xd;
td.totalMessage{font-size:110%;}&#xd;
th.obvious{background:#b2b2b2;}&#xd;
.dis{color:gray;}&#xd;
&#xd;
.bulb a:link {&#xd;
    color: #f4f3f3;&#xd;
    text-decoration: none;&#xd;
    background-color: #f4f3f3;&#xd;
}&#xd;
.bulb a:active {&#xd;
    color: #f4f3f3;&#xd;
    text-decoration: none;&#xd;
    background-color: #f4f3f3;&#xd;
}&#xd;
.bulb a:hover {&#xd;
    color: #f4f3f3;&#xd;
    text-decoration: none;&#xd;
    background-color: #f4f3f3;&#xd;
}&#xd;
.bulb a:visited {&#xd;
    color: #f4f3f3;&#xd;
    text-decoration: none;&#xd;
    background-color: #f4f3f3;&#xd;
}&#xd;
h2{&#xd;
    color: #000000;&#xd;
    font-size: 11px;&#xd;
    font-weight: bold;&#xd;
    margin: 10px 0;&#xd;
    padding: 5px 0 0 5px;&#xd;
    width: 100%;&#xd;
}&#xd;
-->&#xd;
&#xd;
&#xd;
    &#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&lt;!--&#xd;
var INITIAL_INDEX = 1;&#xd;
 var checkedNum = 0;&#xd;
function getElementsByPrefix(prefix) {&#xd;
	var element = null;&#xd;
	var i = INITIAL_INDEX;&#xd;
	var array = new Array();&#xd;
	while ((element = document.getElementById(prefix + i)) != null) {&#xd;
		array[i] = element;&#xd;
		i = i + 1;&#xd;
	}&#xd;
	return array;&#xd;
}&#xd;
&#xd;
function getElementsByPrefixByCount(prefix, count) {&#xd;
	var element = null;&#xd;
	var array = new Array();&#xd;
	for (var i = INITIAL_INDEX; i &lt; count; i++) {&#xd;
		element = document.getElementById(prefix + i)&#xd;
		array[i] = element;&#xd;
	}&#xd;
	return array;&#xd;
}&#xd;
&#xd;
function showHideElements(spanArray, targetArray, distargetArray, checkboxArray, showFlag) {&#xd;
	var i = INITIAL_INDEX;&#xd;
	/* if(spanArray.length != targetArray.length) {&#xd;
		return;&#xd;
	} */&#xd;
    for(var j=INITIAL_INDEX;j&lt;=targetArray.length;j++){&#xd;
    	 if (targetArray[j] != null) {&#xd;
		        if (showFlag) {&#xd;
		        	targetArray[j].style.display = &quot; , &quot;'&quot; , &quot;block&quot; , &quot;'&quot; , &quot;;&#xd;
		        	if(spanArray[j] != null){&#xd;
		        		spanArray[j].innerHTML = contractsymbol;&#xd;
		        	}&#xd;
		        } else {&#xd;
		        	targetArray[j].style.display = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;;&#xd;
		        	if(spanArray[j] != null){&#xd;
		        		spanArray[j].innerHTML = expandsymbol;&#xd;
		        	}&#xd;
		        }&#xd;
		    }&#xd;
    }&#xd;
}&#xd;
&#xd;
function checkUncheckBoxes(array, checkFlag) {&#xd;
	var alltags=document.all? document.all : document.getElementsByTagName(&quot;*&quot;);&#xd;
	var statecollects=getElementbyClass(alltags, &quot;showstate&quot;);&#xd;
	var i = INITIAL_INDEX;&#xd;
	while (array[i] != null) {&#xd;
	    if (array[i]) {&#xd;
	    	var formNum = i-1;&#xd;
	        if (checkFlag) {&#xd;
	            if(array[i].checked == false){&#xd;
	        		array[i].checked = true;&#xd;
	        		setPayAmountFromAmountDue(amountDueArray[i], payAmountArray[i], payAmountSpanArray[i]);&#xd;
	        	}&#xd;
	        	&#xd;
	        	if(document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
	        		document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;black&quot;;&#xd;
				    document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i).style.display=&quot;block&quot;;&#xd;
				}&#xd;
	        	&#xd;
	        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){&#xd;
	        		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	        			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = false;&#xd;
	   	    	 }else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }	    &#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color = &quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){&#xd;
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = false;&#xd;
	   	    	 }else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){&#xd;
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}    	    	&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){&#xd;
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = false;&#xd;
	   	    	 }else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){&#xd;
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = false;&#xd;
	   	    	 }else{&#xd;
	   	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;black&quot;;&#xd;
	   	    		}&#xd;
	   	    	}&#xd;
	   	    }	&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}	    	    	&#xd;
	   	    }&#xd;
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
			    	document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;black&quot;;&#xd;
			    }&#xd;
			    if(document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
				    document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i).disabled=false;&#xd;
				}&#xd;
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
			    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i).disabled=false;&#xd;
			    }&#xd;
			    if(document.getElementById(&quot;c_payDate&quot; + i) != null){&#xd;
			    	document.getElementById(&quot;c_payDate&quot; + i).style.display=&quot;block&quot;;&#xd;
			    }&#xd;
			    if(document.getElementById(&quot;disc_payDate&quot; + i) != null){&#xd;
					document.getElementById(&quot;disc_payDate&quot; + i).style.display=&quot;none&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;time&quot; + i) != null){&#xd;
					document.getElementById(&quot;time&quot; + i).style.display=&quot;block&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;distime&quot; + i) != null){&#xd;
					document.getElementById(&quot;distime&quot; + i).style.display=&quot;none&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;arrow&quot; + i) != null){&#xd;
					document.getElementById(&quot;arrow&quot; + i).src=&quot;/vbills/_assets/img/b.gif&quot;;&#xd;
				}&#xd;
&#xd;
				if(billDetailSpanArray[i] != null){&#xd;
					billDetailSpanArray[i].innerHTML=&quot; , &quot;'&quot; , &quot;&lt;img src=&quot;/vbills/_assets/img/minus.gif&quot; align=&quot;absmiddle&quot; alt=&quot;Collapse bill details&quot;>&quot; , &quot;'&quot; , &quot;;&#xd;
				}&#xd;
	        } else {&#xd;
	            if(array[i].checked){&#xd;
		        	array[i].checked = false;&#xd;
		        	setPayAmountToZero(payAmountArray[i],payAmountSpanArray[i]);&#xd;
	        	}&#xd;
	        	&#xd;
		        if(document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
			    	document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;gray&quot;;&#xd;
			    }&#xd;
		        if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){&#xd;
					 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
						 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = true;&#xd;
			    	 }else{&#xd;
			        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
			        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = true;&#xd;
			        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;gray&quot;;&#xd;
				    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    &#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					        }&#xd;
				        }&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}			    	&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = true;&#xd;
				    	 }else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = true;&#xd;
				    	 }else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){&#xd;
				    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = true;&#xd;
				    	 }else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
			    if(document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
		        	document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;gray&quot;;&#xd;
		        }&#xd;
		        if(document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
		   	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i).disabled=true;&#xd;
		   	    }&#xd;
		   	    if(document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
		   	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i).disabled=true;&#xd;
		   	    }&#xd;
		   	    if(document.getElementById(&quot;c_payDate&quot; + i) != null){&#xd;
		   	    	document.getElementById(&quot;c_payDate&quot; + i).style.display=&quot;none&quot;;&#xd;
		   	    }&#xd;
		   	    if(document.getElementById(&quot;disc_payDate&quot; + i) != null){&#xd;
					document.getElementById(&quot;disc_payDate&quot; + i).style.display=&quot;block&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;time&quot; + i) != null){&#xd;
					document.getElementById(&quot;time&quot; + i).style.display=&quot;none&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;distime&quot; + i) != null){&#xd;
					document.getElementById(&quot;distime&quot; + i).style.display=&quot;block&quot;;	&#xd;
				}&#xd;
				if(document.getElementById(&quot;arrow&quot; + i) != null){&#xd;
					document.getElementById(&quot;arrow&quot; + i).src=&quot;/vbills/_assets/img/a.gif&quot;;&#xd;
				}&#xd;
				&#xd;
	        }&#xd;
	    }&#xd;
    	i = i + 1;&#xd;
	}&#xd;
	updateTotal();&#xd;
}&#xd;
//checkbox&#xd;
function populatePayAmount(element, amountDueId, payAmountId, spanPayAmountId) {&#xd;
	if (element.checked) {&#xd;
		setPayAmountFromAmountDue(document.getElementById(amountDueId), document.getElementById(payAmountId), document.getElementById(spanPayAmountId));&#xd;
	} else {&#xd;
		setPayAmountToZero(document.getElementById(payAmountId), document.getElementById(spanPayAmountId));&#xd;
	}&#xd;
	updateTotal();&#xd;
}&#xd;
function populatePayAmount(element, amountDueId, payAmountId, spanPayAmountId, udfs, countValue) {&#xd;
    var formNum = countValue - 1;&#xd;
	var trId = &quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + countValue;&#xd;
	var alltags=document.all? document.all : document.getElementsByTagName(&quot;*&quot;);&#xd;
	var statecollects=getElementbyClass(alltags, &quot;showstate&quot;);&#xd;
	var pictureObj = document.getElementById(&quot;arrow&quot; + countValue);&#xd;
	if (pictureObj.src.indexOf(&quot; , &quot;'&quot; , &quot;/vbills/_assets/img/a.gif&quot; , &quot;'&quot; , &quot;) > -1) {	  &#xd;
	    document.getElementById(&quot; , &quot;'&quot; , &quot;payCheckbox&quot; , &quot;'&quot; , &quot; + countValue).checked = true;&#xd;
	    &#xd;
	    if(document.getElementById(udfs) != null){&#xd;
		    document.getElementById(udfs).style.display=&quot;block&quot;;&#xd;
		    document.getElementById(udfs).style.color=&quot;black&quot;;&#xd;
		}&#xd;
&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }	    &#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color = &quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){&#xd;
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = false;&#xd;
	    	 }else{&#xd;
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
	    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = false;&#xd;
	    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;black&quot;;&#xd;
	    		}&#xd;
	    	}	    	    	&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){&#xd;
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = false;&#xd;
	    	 }else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){&#xd;
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = false;&#xd;
	    	 }else{&#xd;
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }	&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}	    	    	&#xd;
	    }&#xd;
	    if(document.getElementById(trId) != null){&#xd;
		    document.getElementById(trId).style.color=&quot;black&quot;;&#xd;
        }&#xd;
        if(document.getElementById(payAmountId) != null)	   {&#xd;
           document.getElementById(payAmountId).disabled=false;&#xd;
        }   &#xd;
	    if( document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue) != null){&#xd;
	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue).disabled=false;&#xd;
	    }	   &#xd;
	    	    &#xd;
	 		&#xd;
		if(document.getElementById(&quot;time&quot; + countValue) != null){		&#xd;
			document.getElementById(&quot;time&quot; + countValue).style.display=&quot;block&quot;;&#xd;
		}				&#xd;
		if(document.getElementById(&quot;distime&quot; + countValue) != null){&#xd;
			document.getElementById(&quot;distime&quot; + countValue).style.display=&quot;none&quot;;&#xd;
		}		&#xd;
		if(document.getElementById(&quot;arrow&quot; + countValue)!=null){&#xd;
			document.getElementById(&quot;arrow&quot; + countValue).src=&quot;/vbills/_assets/img/b.gif&quot;;&#xd;
		}&#xd;
		setPayAmountFromAmountDue(document.getElementById(amountDueId), document.getElementById(payAmountId), document.getElementById(spanPayAmountId));	&#xd;
	} else {&#xd;
		document.getElementById(&quot; , &quot;'&quot; , &quot;payCheckbox&quot; , &quot;'&quot; , &quot; + countValue).checked = false;&#xd;
		&#xd;
		if(document.getElementById(udfs)){&#xd;
		    document.getElementById(udfs).style.color=&quot;gray&quot;;&#xd;
		}&#xd;
		 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){&#xd;
			 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = true;&#xd;
	    	 }else{&#xd;
	        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
	        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = true;&#xd;
	        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;gray&quot;;&#xd;
		    	}&#xd;
		    }&#xd;
		   }&#xd;
		    &#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = true;&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;gray&quot;;&#xd;
		    		}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = true;&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;gray&quot;;&#xd;
		       		}&#xd;
		        }&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = true;&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color=&quot;gray&quot;;&#xd;
		    		}&#xd;
		    	}		    	&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = true;&#xd;
		    	 }else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = true;&#xd;
		    	 }else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){&#xd;
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = true;&#xd;
		    	 }else{&#xd;
			    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
	    &#xd;
		if(document.getElementById(trId)){&#xd;
	        document.getElementById(trId).style.color=&quot;gray&quot;;&#xd;
	    }&#xd;
	    if(document.getElementById(payAmountId)){&#xd;
   	    	document.getElementById(payAmountId).disabled=true;&#xd;
   	    }&#xd;
   	    if( document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue) != null){&#xd;
   	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue).disabled=true;&#xd;
   	    }&#xd;
   	   &#xd;
		if(document.getElementById(&quot;time&quot; + countValue) != null){&#xd;
			document.getElementById(&quot;time&quot; + countValue).style.display=&quot;none&quot;;&#xd;
		}&#xd;
		if(document.getElementById(&quot;distime&quot; + countValue)!=null){&#xd;
			document.getElementById(&quot;distime&quot; + countValue).style.display=&quot;block&quot;;&#xd;
		}&#xd;
		if(document.getElementById(&quot;arrow&quot; + countValue) != null){&#xd;
			document.getElementById(&quot;arrow&quot; + countValue).src=&quot;/vbills/_assets/img/a.gif&quot;;&#xd;
		}&#xd;
		setPayAmountToZero(document.getElementById(payAmountId), document.getElementById(spanPayAmountId));&#xd;
	}&#xd;
	if(billDetailSpanArray[countValue] != null){&#xd;
		billDetailSpanArray[countValue].innerHTML=&quot; , &quot;'&quot; , &quot;&lt;img src=&quot;/vbills/_assets/img/minus.gif&quot; align=&quot;absmiddle&quot; alt=&quot;Collapse bill details&quot;>&quot; , &quot;'&quot; , &quot;&#xd;
	}&#xd;
	updateTotal();&#xd;
&#xd;
}&#xd;
function setPayAmountFromAmountDue(amountDue, payAmount, spanPayAmount) {&#xd;
	payAmount.value = amountDue.value;&#xd;
	if (spanPayAmount != null) {&#xd;
		spanPayAmount.innerHTML = payAmount.value;&#xd;
	}&#xd;
	checkedNum++;&#xd;
}&#xd;
&#xd;
function setPayAmountToZero(payAmount, spanPayAmount) {&#xd;
	payAmount.value = &quot;0.00&quot;;&#xd;
	if (spanPayAmount != null) {&#xd;
		spanPayAmount.innerHTML = payAmount.value;&#xd;
	}&#xd;
	checkedNum--;&#xd;
}&#xd;
&#xd;
function formatMoney(money) {&#xd;
	var index = money.indexOf(&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;);&#xd;
	var len = money.length;&#xd;
	if (index == -1) {&#xd;
		return money + &quot;.00&quot;;&#xd;
	} else if (len - index == 2) {&#xd;
		return money + &quot;0&quot;;s&#xd;
	}&#xd;
	return money;&#xd;
}&#xd;
&#xd;
function truncateMoneyValue(moneyValue) {&#xd;
	var moneyValue = moneyValue.replace(/,/g, &quot;&quot;);&#xd;
	var index = moneyValue.indexOf(&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;);&#xd;
	if (index > -1) {&#xd;
		var len = moneyValue.length;&#xd;
		if(index &lt; len - 3) {&#xd;
			moneyValue = moneyValue.substring(0, index + 3);&#xd;
		}&#xd;
	}&#xd;
	return moneyValue;&#xd;
}&#xd;
&#xd;
function resetCheckbox(inputField, payCheckboxId,zeroAccepted, amountDueId, consolidateBills) {          &#xd;
	setTimeout(&quot;timeoutResetCheckbox(&quot; , &quot;'&quot; , &quot;&quot; + inputField.id + &quot;&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&quot; + payCheckboxId + &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; + zeroAccepted + &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; + amountDueId + &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; + consolidateBills + &quot;&quot; , &quot;'&quot; , &quot;);&quot;, 1);&#xd;
}&#xd;
&#xd;
function timeoutResetCheckbox(inputFieldId, payCheckboxId, zeroAccepted, amountDueId, consolidateBills) {&#xd;
	var inputField = document.getElementById(inputFieldId);&#xd;
	var moneyValue = truncateMoneyValue(inputField.value);&#xd;
	var floatValue = parseFloat(moneyValue);&#xd;
	var amountDue = document.getElementById(amountDueId);&#xd;
	var amountDueValue = truncateMoneyValue(amountDue.value);&#xd;
	var floatAmountDueValue = parseFloat(amountDueValue);&#xd;
	&#xd;
	if (isNaN(floatValue)) {&#xd;
		inputField.value = &quot;0.00&quot;&#xd;
		document.getElementById(payCheckboxId).checked = false;&#xd;
		return;&#xd;
	}&#xd;
	inputField.value = formatMoney(floatValue.toString());&#xd;
	updateTotal();&#xd;
}&#xd;
&#xd;
var TOTAL_TO_PAY = &quot; , &quot;'&quot; , &quot;totalToPay&quot; , &quot;'&quot; , &quot;;&#xd;
var SPAN_TOTAL_TO_PAY = &quot; , &quot;'&quot; , &quot;spanTotalToPay&quot; , &quot;'&quot; , &quot;;&#xd;
var SAVE_PAYMENT_CHECKBOX_TR = &quot; , &quot;'&quot; , &quot;savePaymentCheckboxTr&quot; , &quot;'&quot; , &quot;;&#xd;
var STORE_PAYMENT_METHOD_CHKBOX_ID = &quot; , &quot;'&quot; , &quot;storePaymentMethod&quot; , &quot;'&quot; , &quot;;&#xd;
var SAVE_NICKNAME_TR = &quot; , &quot;'&quot; , &quot;saveNickNameTr&quot; , &quot;'&quot; , &quot;;&#xd;
var NUM_TOTAL_TO_PAY = &quot; , &quot;'&quot; , &quot;numTotalToPay&quot; , &quot;'&quot; , &quot;;&#xd;
&#xd;
var checkboxArray = null;&#xd;
var divArray = null;&#xd;
var billDetailSpanArray = null;&#xd;
var payAmountArray = null;&#xd;
var payAmountSpanArray = null;&#xd;
var amountDueArray = null;&#xd;
&#xd;
&#xd;
function initVariables() {&#xd;
	checkboxArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;payCheckbox&quot; , &quot;'&quot; , &quot;);&#xd;
	divArray = getElementsByPrefixByCount(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot;, checkboxArray.length);&#xd;
	disdivArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;disudf&quot; , &quot;'&quot; , &quot;);&#xd;
	billDetailSpanArray = getElementsByPrefixByCount(&quot; , &quot;'&quot; , &quot;billDetailsSpan&quot; , &quot;'&quot; , &quot;, checkboxArray.length);&#xd;
	payAmountArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot;);&#xd;
	payAmountSpanArray = getElementsByPrefixByCount(&quot; , &quot;'&quot; , &quot;spanPayAmount&quot; , &quot;'&quot; , &quot;, payAmountArray.length);&#xd;
	amountDueArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;amountDue&quot; , &quot;'&quot; , &quot;);	&#xd;
}&#xd;
&#xd;
var BILL_PAYMENT_DERIVED_URL_PREFIX = &quot; , &quot;'&quot; , &quot;/vbills/mbills/billPaymentDerivedField.go?&amp;forgotType=null&quot; , &quot;'&quot; , &quot;;&#xd;
&#xd;
function outputComma(num) {&#xd;
    num = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; + num;&#xd;
    var number = num;&#xd;
	var decimalPart = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;&#xd;
    if (num.indexOf(&quot;.&quot;)!=-1) {&#xd;
	  number = num.substring(0,num.indexOf(&quot;.&quot;));&#xd;
	  decimalPart = num.substring(num.indexOf(&quot;.&quot;) , num.length);&#xd;
	}&#xd;
    if (number.length > 3) {&#xd;
        var mod = number.length%3;&#xd;
        var output = (mod > 0 ? (number.substring(0,mod)) : &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);&#xd;
        for (i=0 ; i &lt; Math.floor(number.length/3) ; i++) {&#xd;
            if ((mod ==0) &amp;&amp; (i ==0))&#xd;
                output+= number.substring(mod+3*i,mod+3*i+3);&#xd;
            else&#xd;
                output+= &quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot; + number.substring(mod+3*i,mod+3*i+3);&#xd;
        }&#xd;
        return (output)+decimalPart;&#xd;
    }&#xd;
    else return number+decimalPart;&#xd;
}&#xd;
&#xd;
function updateTotal() {&#xd;
	var amountArray = new Array();	&#xd;
	var total=0;&#xd;
	for (var i = INITIAL_INDEX; i &lt; payAmountArray.length; i++) {&#xd;
	    if(payAmountArray[i].value == &quot;&quot;){&#xd;
	    	payAmountArray[i].value = &quot;0.00&quot;;&#xd;
	    }&#xd;
		amountArray.push(payAmountArray[i].value);&#xd;
		total += parseFloat(payAmountArray[i].value.replace(&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;));	&#xd;
&#xd;
	} &#xd;
    document.getElementById(NUM_TOTAL_TO_PAY).innerHTML = checkedNum;&#xd;
	document.getElementById(TOTAL_TO_PAY).value = outputComma(total.toFixed(2));&#xd;
	document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = outputComma(total.toFixed(2));&#xd;
	 &#xd;
}&#xd;
&#xd;
function getTotalAmountCalculatedCallback(responseText) {&#xd;
	var total = handleAjaxResponse(responseText);&#xd;
	document.getElementById(TOTAL_TO_PAY).value = total;&#xd;
	document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = total;&#xd;
}&#xd;
&#xd;
function handleAjaxResponse(responseText) {&#xd;
	enableDisableButtons(true);&#xd;
    var responseArray = eval(responseText);&#xd;
    if (responseArray[0] == true) {&#xd;
       return responseArray[1];&#xd;
    } else {&#xd;
    	return responseArray[1];&#xd;
    }   &#xd;
}&#xd;
&#xd;
function setCalculatingValueMessage(element) {&#xd;
	enableDisableButtons(false);&#xd;
	element.innerHTML = &quot; , &quot;'&quot; , &quot;Calculating ...&quot; , &quot;'&quot; , &quot;;&#xd;
//    span.className = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;&#xd;
}&#xd;
&#xd;
function enableDisableButtons(isEnable) {&#xd;
	document.getElementById(&quot; , &quot;'&quot; , &quot;nextButton&quot; , &quot;'&quot; , &quot;).enabled = isEnable;&#xd;
}&#xd;
&#xd;
var LABEL_SUFFIX = &quot; , &quot;'&quot; , &quot; &lt;span class=&quot;requiredField&quot;>*&lt;\/span>&quot; , &quot;'&quot; , &quot;;&#xd;
&#xd;
function setLabel(id, label, isRequred) {&#xd;
    if(isRequred) {&#xd;
            document.getElementById(id).innerHTML = label + LABEL_SUFFIX;&#xd;
    } else {&#xd;
            document.getElementById(id).innerHTML = label;&#xd;
    }&#xd;
}&#xd;
&#xd;
PAYMENT_METHOD_SELECTBOX_ID = &quot; , &quot;'&quot; , &quot;selectedPaymentMethod&quot; , &quot;'&quot; , &quot;;&#xd;
PAYMENT_METHOD_INFO_URL_PREFIX = &quot; , &quot;'&quot; , &quot;/vbills/mbills/paymentMethodInfo.go?&amp;forgotType=null&quot; , &quot;'&quot; , &quot;;&#xd;
PAYMENT_METHOD_INFO_DIV_ID = &quot; , &quot;'&quot; , &quot;paymentMethodInfoDiv&quot; , &quot;'&quot; , &quot;;&#xd;
PAYMENT_METHOD_TYPE_FORM_DIV_ID = &quot; , &quot;'&quot; , &quot;paymentMethodTypeFormDiv&quot; , &quot;'&quot; , &quot;;&#xd;
&#xd;
function toggle() {&#xd;
	if(area > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; area != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
		document.getElementById(&quot; , &quot;'&quot; , &quot;pay_via_debit_credit&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&quot;;&#xd;
	}&#xd;
    var area = safeGetInputValue(PAYMENT_METHOD_SELECTBOX_ID);&#xd;
    if(area != null &amp;&amp; area != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){&#xd;
	    if(area.indexOf(&quot;_&quot;)  >0 ){&#xd;
	    	hideShowElementFrfx(PAYMENT_METHOD_TYPE_FORM_DIV_ID, false);&#xd;
	    	hideShowElementFrfx(SAVE_PAYMENT_CHECKBOX_TR, false);&#xd;
	    	var str = area.split(&quot;_&quot;);&#xd;
	    	var arean = &quot;name_&quot; + str[str.length-1];&#xd;
	    	displayPaymentMethodInfo(arean);&#xd;
	    } else {&#xd;
	    	hideShowElementFrfx(PAYMENT_METHOD_INFO_DIV_ID, false);&#xd;
	    	hideShowElementFrfx(PAYMENT_METHOD_TYPE_FORM_DIV_ID, true);&#xd;
	    	hideShowElementFrfx(SAVE_PAYMENT_CHECKBOX_TR, true);&#xd;
	    	if(area==&quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;check_accCondition&quot; , &quot;'&quot; , &quot;,false);&#xd;
	    //	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;achTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);&#xd;
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;ccTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,true);&#xd;
	    	}else{&#xd;
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;check_accCondition&quot; , &quot;'&quot; , &quot;,false);&#xd;
	    //	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;achTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);&#xd;
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;ccTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);&#xd;
	    	}&#xd;
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;area_creditCard&quot; , &quot;'&quot; , &quot;, (area == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;));&#xd;
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;creditCardInfo&quot; , &quot;'&quot; , &quot;,area == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot;);&#xd;
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;debitCardInfo&quot; , &quot;'&quot; , &quot;,area == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;);&#xd;
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;area_achPayment&quot; , &quot;'&quot; , &quot;, (area > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; area != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;));&#xd;
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;addressForm&quot; , &quot;'&quot; , &quot;, true);&#xd;
		    if (area > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; area != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;) {&#xd;
		    hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;check_accCondition&quot; , &quot;'&quot; , &quot;, true);&#xd;
		//    hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;achTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,true);&#xd;
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;ccTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);&#xd;
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;bankInfo1&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;4&quot; , &quot;'&quot; , &quot;);&#xd;
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;bankInfo2&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;4&quot; , &quot;'&quot; , &quot;);&#xd;
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;personalRoutingGif&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;2&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;3&quot; , &quot;'&quot; , &quot;);&#xd;
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;businessRoutingGif&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;4&quot; , &quot;'&quot; , &quot;);                &#xd;
		        setLabel(&quot; , &quot;'&quot; , &quot;bankInfo3&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&lt;span id=&quot;paymentMethod.firstName&quot;>First Name:&lt;/span>&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;2&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;3&quot; , &quot;'&quot; , &quot;);&#xd;
		        setLabel(&quot; , &quot;'&quot; , &quot;bankInfo4&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&lt;span id=&quot;paymentMethod.lastName&quot;>Last Name:&lt;/span>&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;2&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;3&quot; , &quot;'&quot; , &quot;);&#xd;
		    }&#xd;
	    }&#xd;
    }&#xd;
}&#xd;
&#xd;
function togglePaymentMethodType() {&#xd;
  	toggle();&#xd;
    if(document.getElementById(SPAN_TOTAL_TO_PAY) != null &amp;&amp; document.getElementById(TOTAL_TO_PAY) != null){&#xd;
		document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = document.getElementById(TOTAL_TO_PAY).value;&#xd;
    }&#xd;
}&#xd;
&#xd;
function toggleSaveNickNameTr() {&#xd;
	hideShowElementFrfx(SAVE_NICKNAME_TR, document.getElementById(STORE_PAYMENT_METHOD_CHKBOX_ID).checked);&#xd;
}&#xd;
&#xd;
function schedulePayment(index) {&#xd;
    document.getElementById(&quot; , &quot;'&quot; , &quot;schedulePaymentForBillIndex&quot; , &quot;'&quot; , &quot;).value = index;&#xd;
    submitForm(&quot; , &quot;'&quot; , &quot;billListForm&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;/vbills/mbills/billList.go?action=schedulePayment&amp;forgotType=null&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;You have already submitted this form&quot; , &quot;'&quot; , &quot;);&#xd;
}&#xd;
&#xd;
//========= Saved Payment Information Ajax Call&#xd;
&#xd;
function displayPaymentMethodInfo(selectedId) {&#xd;
    if (selectedId == &quot;&quot;) {&#xd;
        return;&#xd;
    }&#xd;
    disableElementById(PAYMENT_METHOD_SELECTBOX_ID);&#xd;
    setWaitingMessageOnInfoDiv();&#xd;
    var ajax = new Ajax();&#xd;
    ajax.add(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;, selectedId);&#xd;
    ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);&#xd;
    ajax.post(PAYMENT_METHOD_INFO_URL_PREFIX + &quot; , &quot;'&quot; , &quot;&amp;action=getInfo&quot; , &quot;'&quot; , &quot;, paymentMethodInfoCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);  &#xd;
}&#xd;
&#xd;
function paymentMethodInfoCallback(responseText) {&#xd;
    var pmiDiv = getPmiDivControl();&#xd;
    pmiDiv.innerHTML = responseText;&#xd;
	hideShowElementFrfx(PAYMENT_METHOD_INFO_DIV_ID, true);&#xd;
    enableElementById(PAYMENT_METHOD_SELECTBOX_ID);&#xd;
    if(document.getElementById(&quot;paymentMethodTypeId&quot;) != null){&#xd;
	    var paymentMethodTypeIdValue = document.getElementById(&quot;paymentMethodTypeId&quot;).value;&#xd;
	    if(paymentMethodTypeIdValue == &quot;1&quot; || paymentMethodTypeIdValue == &quot;5&quot; ){&#xd;
	   		document.getElementById(&quot;check_accCondition&quot;).style.display=&quot;none&quot;;&#xd;
	   	//	document.getElementById(&quot;achTermsAndConditionsMessage&quot;).style.display=&quot;none&quot;;&#xd;
	   		document.getElementById(&quot;ccTermsAndConditionsMessage&quot;).style.display=&quot;block&quot;;&#xd;
	    }else{&#xd;
	    	document.getElementById(&quot;check_accCondition&quot;).style.display=&quot;block&quot;;&#xd;
	  //  	document.getElementById(&quot;achTermsAndConditionsMessage&quot;).style.display=&quot;block&quot;;&#xd;
	   		document.getElementById(&quot;ccTermsAndConditionsMessage&quot;).style.display=&quot;none&quot;;&#xd;
	    }&#xd;
    }&#xd;
}&#xd;
&#xd;
function setWaitingMessageOnInfoDiv() {&#xd;
    var pmiDiv = getPmiDivControl();&#xd;
    pmiDiv.innerHTML = &quot; , &quot;'&quot; , &quot;&lt;br/>&lt;strong>Retrieving Information ...&lt;/strong>&quot; , &quot;'&quot; , &quot;;&#xd;
}&#xd;
&#xd;
function getPmiDivControl() {&#xd;
    return document.getElementById(PAYMENT_METHOD_INFO_DIV_ID);&#xd;
}&#xd;
 &#xd;
addOnloadHandler(togglePaymentMethodType);&#xd;
//addOnloadHandler(toggleSaveNickNameTr);&#xd;
addOnloadHandler(initVariables);&#xd;
setFieldsThatNeedToBeClearedBetweenPageFlow([&quot; , &quot;'&quot; , &quot;paymentMethodForm.cardAccountNumber&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;paymentMethodForm.bankAccountNumber&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;paymentMethodForm.cvv&quot; , &quot;'&quot; , &quot;]);&#xd;
//-->&#xd;
&#xd;
function PendingBillsSearch(){&#xd;
	var pageResultNum = document.getElementById(&quot;pageSize&quot;).value;&#xd;
	var url=&quot;/vbills/mbills/billList.go?action=navigateForGuestPay&amp;forgotType=null&amp;pageNumber=1&amp;pageSize=&quot;+pageResultNum;&#xd;
	var obj = document.getElementById(&quot;pagingForm&quot;);&#xd;
	obj.action = url;&#xd;
	obj.submit();	&#xd;
}&#xd;
&#xd;
function wsug(e, str){ &#xd;
 var oThis = arguments.callee;&#xd;
 if(!str) {&#xd;
  oThis.sug.style.visibility = &quot; , &quot;'&quot; , &quot;hidden&quot; , &quot;'&quot; , &quot;;&#xd;
  document.onmousemove = null;&#xd;
  document.getElementById(&quot;helpIMG&quot;).src=&quot;/vbills/_assets/img/help3.gif&quot;;&#xd;
  return;&#xd;
 }  &#xd;
 if(!oThis.sug){  &#xd;
  var div = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;top:0; left:0; position:absolute; z-index:100; visibility:hidden&quot; , &quot;'&quot; , &quot;;&#xd;
   div.style.cssText = css;&#xd;
   div.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  var sug = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css= &quot; , &quot;'&quot; , &quot;font:normal 12px/16px; white-space:nowrap; color:#666; padding:3px; position:absolute; left:0; top:0; z-index:10; background:#f9fdfd; border:1px solid #0aa&quot; , &quot;'&quot; , &quot;;&#xd;
   sug.style.cssText = css;&#xd;
   sug.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  var dr = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;position:absolute; top:3px; left:3px; background:#333; filter:alpha(opacity=50); opacity:0.5; z-index:9&quot; , &quot;'&quot; , &quot;;&#xd;
   dr.style.cssText = css;&#xd;
   dr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  var ifr = document.createElement(&quot; , &quot;'&quot; , &quot;iframe&quot; , &quot;'&quot; , &quot;), css=&quot; , &quot;'&quot; , &quot;position:absolute; left:0; top:0; z-index:8; filter:alpha(opacity=0); opacity:0&quot; , &quot;'&quot; , &quot;;&#xd;
   ifr.style.cssText = css;&#xd;
   ifr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  div.appendChild(ifr);&#xd;
  div.appendChild(dr);&#xd;
  div.appendChild(sug);&#xd;
  div.sug = sug;&#xd;
  document.body.appendChild(div);&#xd;
  oThis.sug = div;&#xd;
  oThis.dr = dr;&#xd;
  oThis.ifr = ifr;&#xd;
  div = dr = ifr = sug = null;&#xd;
 }&#xd;
 document.getElementById(&quot;helpIMG&quot;).src=&quot;/vbills/_assets/img/help.gif&quot;;&#xd;
 var e = e || window.event, obj = oThis.sug, dr = oThis.dr, ifr = oThis.ifr;&#xd;
 obj.sug.innerHTML = str;&#xd;
 &#xd;
 var w = obj.sug.offsetWidth, h = obj.sug.offsetHeight, dw = document.documentElement.clientWidth||document.body.clientWidth; dh = document.documentElement.clientHeight || document.body.clientHeight;&#xd;
 var st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;&#xd;
 var left = e.clientX +sl +17 + w &lt; dw + sl  &amp;&amp;  e.clientX + sl + 15 || e.clientX +sl-8 - w, top = e.clientY + st +17 + h &lt; dh + st  &amp;&amp;  e.clientY + st + 17 || e.clientY + st - 5 - h;&#xd;
 obj.style.left = left+ 10 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 obj.style.top = top + 10 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 dr.style.width = w + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 dr.style.height = h + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 ifr.style.width = w + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 ifr.style.height = h + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 obj.style.visibility = &quot; , &quot;'&quot; , &quot;visible&quot; , &quot;'&quot; , &quot;;&#xd;
 document.onmousemove = function(e){&#xd;
  var e = e || window.event, st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;&#xd;
  var left = e.clientX +sl +17 + w &lt; dw + sl  &amp;&amp;  e.clientX + sl + 15 || e.clientX +sl-8 - w, top = e.clientY + st +17 + h &lt; dh + st  &amp;&amp;  e.clientY + st + 17 || e.clientY + st - 5 - h;&#xd;
  obj.style.left = left + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
  obj.style.top = top + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 }&#xd;
}&#xd;
function instruction(e, str){ &#xd;
var oThis = arguments.callee;&#xd;
 if(!str) {&#xd;
  oThis.sug.style.visibility = &quot; , &quot;'&quot; , &quot;hidden&quot; , &quot;'&quot; , &quot;;&#xd;
  return;&#xd;
 }  &#xd;
&#xd;
 if(!oThis.sug){  &#xd;
  var div = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;position:fixed; z-index:100; visibility:visibiled; width:220px;&quot; , &quot;'&quot; , &quot;;&#xd;
   div.style.cssText = css;&#xd;
   div.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  var sug = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css= &quot; , &quot;'&quot; , &quot;font:normal 12px/16px; color:#666; padding:3px; position:fixed; z-index:10; background:#f9fdfd; border:1px solid #0aa; width:220px;&quot; , &quot;'&quot; , &quot;;&#xd;
   sug.style.cssText = css;&#xd;
   sug.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  var dr = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;position:fixed; background:#333; filter:alpha(opacity=50); opacity:0.5; z-index:9; width:220px;&quot; , &quot;'&quot; , &quot;;&#xd;
   dr.style.cssText = css;&#xd;
   dr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  var ifr = document.createElement(&quot; , &quot;'&quot; , &quot;iframe&quot; , &quot;'&quot; , &quot;), css=&quot; , &quot;'&quot; , &quot;position:fixed; z-index:8; filter:alpha(opacity=0); opacity:0; width:220px;&quot; , &quot;'&quot; , &quot;;&#xd;
   ifr.style.cssText = css;&#xd;
   ifr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  div.appendChild(ifr);&#xd;
  div.appendChild(dr);&#xd;
  div.appendChild(sug);&#xd;
  div.sug = sug;&#xd;
  document.body.appendChild(div);&#xd;
  oThis.sug = div;&#xd;
  oThis.dr = dr;&#xd;
  oThis.ifr = ifr;&#xd;
  div = dr = ifr = sug = null;&#xd;
 }&#xd;
&#xd;
 var e = e , obj = oThis.sug, dr = oThis.dr, ifr = oThis.ifr;&#xd;
 var pos = findPosition(e);&#xd;
 obj.sug.innerHTML = str;&#xd;
 &#xd;
 var w = obj.sug.offsetWidth, h = obj.sug.offsetHeight, dw = document.documentElement.clientWidth||document.body.clientWidth; dh = document.documentElement.clientHeight || document.body.clientHeight;&#xd;
 var st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;&#xd;
 var left = pos[0] +sl +17 + w &lt; dw + sl  &amp;&amp;  pos[0] + sl + 15 || pos[0] +sl-8 - w, top = pos[1] + st + h &lt; dh + st  &amp;&amp;  pos[1] + st || pos[1] + st - 5 - h; obj.style.left = left+ 10 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 obj.style.top = top + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 var left0 = left - w - 50;&#xd;
 obj.style.left = left0 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 dr.style.width = w + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 dr.style.height = h + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 dr.style.top = top + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 dr.style.left = left0 + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 ifr.style.width = w + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 ifr.style.height = h + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 obj.style.visibility = &quot; , &quot;'&quot; , &quot;visible&quot; , &quot;'&quot; , &quot;;&#xd;
&#xd;
}&#xd;
&#xd;
function findPosition( oElement ) &#xd;
{&#xd;
  var x2 = 0;&#xd;
  var y2 = 0;&#xd;
  var width = oElement.offsetWidth;&#xd;
  var height = oElement.offsetHeight;&#xd;
  if( typeof( oElement.offsetParent ) != &quot; , &quot;'&quot; , &quot;undefined&quot; , &quot;'&quot; , &quot; ) &#xd;
  {&#xd;
    for( var posX = 0, posY = 0; oElement; oElement = oElement.offsetParent ) &#xd;
    {&#xd;
      posX += oElement.offsetLeft;&#xd;
      posY += oElement.offsetTop;      &#xd;
    }&#xd;
    x2 = posX + width;&#xd;
    y2 = posY + height;&#xd;
    return [ posX, posY ,x2, y2];&#xd;
    &#xd;
    } else{&#xd;
      x2 = oElement.x + width;&#xd;
      y2 = oElement.y + height;&#xd;
      return [ oElement.x, oElement.y, x2, y2];&#xd;
  }&#xd;
}&#xd;
		function getStateList(countryId){&#xd;
			var ajax = new Ajax();&#xd;
			ajax.add(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;, countryId);&#xd;
			ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);			&#xd;
			ajax.get(&quot; , &quot;'&quot; , &quot;/vbills/mbills/stateInfo.go?action=getStateTypesByCountry&amp;forgotType=null&quot; , &quot;'&quot; , &quot; + &quot; , &quot;'&quot; , &quot;&amp;action=getStateTypesByCountry&quot; , &quot;'&quot; , &quot;, stateTypeByCountryCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);&#xd;
		}&#xd;
		function stateTypeByCountryCallback(responseText){&#xd;
			var datalist = responseText.parseJSON();&#xd;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.state&quot; , &quot;'&quot; , &quot;).innerHTML= datalist.stateLabel;&#xd;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.stateLabel&quot; , &quot;'&quot; , &quot;).value= datalist.stateLabel;&#xd;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.zipCode&quot; , &quot;'&quot; , &quot;).innerHTML= datalist.zipLabel;&#xd;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.zipLabel&quot; , &quot;'&quot; , &quot;).value=datalist.zipLabelKey;&#xd;
			if(datalist.stateList.length>0){&#xd;
				showStateSelect();&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&quot;;&#xd;
				for(var i=0;i&lt;datalist.stateList.length;i++){&#xd;
					var option = document.createElement(&quot;option&quot;);&#xd;
					var rs =  datalist.stateList[i];&#xd;
					option.value = rs.id;&#xd;
                    option.innerHTML = rs.value;&#xd;
                    document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).appendChild(option);           &#xd;
				}&#xd;
			}else{&#xd;
				hideStateSelect();&#xd;
			}&#xd;
		}&#xd;
        &#xd;
       &#xd;
        function changeCountry(val){&#xd;
        	if(val != 840){&#xd;
        		hideZipCodeSplit();&#xd;
        		&#xd;
        	}else{&#xd;
        		showZipCodeSplit();&#xd;
        	}&#xd;
			var paymentMethodType = document.getElementById(&quot; , &quot;'&quot; , &quot;selectedPaymentMethod&quot; , &quot;'&quot; , &quot;).value;&#xd;
        	if(65 > 1){        		&#xd;
		 		showStateSelect();&#xd;
		 	}else{		 		&#xd;
		 		hideStateSelect();&#xd;
		 	}&#xd;
&#xd;
			if(paymentMethodType == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || paymentMethodType == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
			} &#xd;
			if(paymentMethodType > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; paymentMethodType != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
				if(val == 840){&#xd;
        			document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
        			document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
        		}else{&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
				}&#xd;
			}	&#xd;
        }&#xd;
        function showStateSelect(){&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.state&quot;);&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);&#xd;
        }&#xd;
        function hideStateSelect(){&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.stateCode&quot;);&#xd;
        }&#xd;
        function cleanInput(val){&#xd;
			var paymentMethodType = document.getElementById(&quot; , &quot;'&quot; , &quot;selectedPaymentMethod&quot; , &quot;'&quot; , &quot;).value;&#xd;
&#xd;
			if(paymentMethodType == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || paymentMethodType == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
				if(840 == val){&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
				}else{&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
				}&#xd;
			}&#xd;
			if(paymentMethodType > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; paymentMethodType != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
				if(840 == val){&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
				}else{&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
				}&#xd;
					&#xd;
			}	&#xd;
        }&#xd;
        &#xd;
        function showZipCodeSplit(){&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.zipCode&quot;);&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;zipSplit&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);&#xd;
        }&#xd;
        function hideZipCodeSplit(){&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;zipSplit&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.zipCode&quot;);&#xd;
        }&#xd;
        &#xd;
        function linkageStateAndCountry(val){&#xd;
        	if(val != 840){&#xd;
        		hideZipCodeSplit();&#xd;
        		&#xd;
        	}else{&#xd;
        		showZipCodeSplit();&#xd;
        	}&#xd;
	        cleanInput(val);&#xd;
	        getStateList(val);&#xd;
        }&#xd;
        function is_valid_zip(zip) {&#xd;
			var re = /^\d{5}(\d{4})?$/;&#xd;
			return re.test(zip);&#xd;
		}&#xd;
        function alertErrMsg(){&#xd;
				//document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&lt;ul>&lt;li>ZIP_Code is not valid.&lt;/li>&lt;/ul>&quot;;&#xd;
        		//document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;block&quot;;        	&#xd;
        }&#xd;
        function zipCodeValidate(){&#xd;
        	var countryId = document.getElementById(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;).value;&#xd;
        	&#xd;
        		&#xd;
            	var current = document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value; // + document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value;&#xd;
            	if( !is_valid_zip(current)){&#xd;
            		//alert errors.&#xd;
            		alertErrMsg();&#xd;
            	}else{&#xd;
            		document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
            		var ajax = new Ajax();&#xd;
        			ajax.add(&quot;zipCode&quot; , current);&#xd;
        			ajax.add(&quot;countryId&quot;,countryId);&#xd;
        	        ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);&#xd;
        			ajax.post(&quot; , &quot;'&quot; , &quot;/vbills/mbills/validateZipCode.go?action=getValidateZipCode&amp;forgotType=null&quot; , &quot;'&quot; , &quot; + &quot; , &quot;'&quot; , &quot;&amp;action=getStateTypesByCountry&quot; , &quot;'&quot; , &quot;,zipCodeValidateCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);&#xd;
            	}&#xd;
        	&#xd;
		}&#xd;
		function zipCodeValidateCallback(responseText){&#xd;
			var data = responseText.parseJSON();&#xd;
			if(data!=null &amp;&amp; data !=&quot;&quot;){&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value=data.city;&#xd;
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).style.display=&quot;block&quot;){&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).value=data.state.id;&#xd;
				}else{&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).value = data.state.value;&#xd;
				}&#xd;
			}else{&#xd;
				alertErrMsg();&#xd;
			}&#xd;
		}&#xd;
		function setCityAndStateRequired (val){&#xd;
			if(val == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || val == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
			} &#xd;
			if(val > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; val != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;).value == 840){&#xd;
        			document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
        			document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
        		}else{&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
				}&#xd;
			}&#xd;
		}&#xd;
&#xd;
		function rtnValidate(){&#xd;
&#xd;
			var rtnString = document.getElementById(&quot; , &quot;'&quot; , &quot;routingNumber&quot; , &quot;'&quot; , &quot;).value;&#xd;
			var ajax = new Ajax();&#xd;
			ajax.add(&quot;rtnStr&quot; , rtnString);&#xd;
			ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);&#xd;
			ajax.post(&quot; , &quot;'&quot; , &quot;/vbills/mbills/RTNValidate.go?action=rtnValidation&amp;forgotType=null&quot; , &quot;'&quot; , &quot; + &quot; , &quot;'&quot; , &quot;&amp;action=AchRTNValidate&quot; , &quot;'&quot; , &quot;,rtnValidateCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);&#xd;
&#xd;
		}&#xd;
		function rtnValidateCallback(responseText){&#xd;
			var data = responseText.parseJSON();&#xd;
			if(data!=null &amp;&amp; data !=&quot;&quot;){&#xd;
				if(data.message !=null &amp;&amp; data.message){&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;routingError&quot; , &quot;'&quot; , &quot;).innerHTML= data.message;&#xd;
				}else{&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;routingError&quot; , &quot;'&quot; , &quot;).innerHTML= &quot;Invalid Routing Number&quot;;&#xd;
				}&#xd;
			}&#xd;
		}&#xd;
		&#xd;
		function debitCardNumberValidate(cardNumber){&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
            		var ajax = new Ajax();&#xd;
            	    ajax.add(&quot; , &quot;'&quot; , &quot;cn&quot; , &quot;'&quot; , &quot;, cardNumber);&#xd;
            	    ajax.get(PAYMENT_METHOD_INFO_URL_PREFIX + &quot; , &quot;'&quot; , &quot;&amp;action=debitCardNumberValidate&quot; , &quot;'&quot; , &quot;, debitCardNumberValidateCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);  &#xd;
		}&#xd;
		function debitCardNumberValidateCallback(responseText){&#xd;
			var data = responseText.parseJSON();&#xd;
			if(data!=null &amp;&amp; data !=&quot;&quot;){&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
				var isDebit = data.isDebit;&#xd;
&#xd;
				if(isDebit == &quot; , &quot;'&quot; , &quot;true&quot; , &quot;'&quot; , &quot;){&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;pay_via_debit_credit&quot; , &quot;'&quot; , &quot;).innerHTML=&quot; , &quot;'&quot; , &quot;&lt;table width=&quot;100%&quot; border=&quot;0&quot; cellspacing=&quot;0&quot; cellpadding=&quot;0&quot;>&quot; , &quot;'&quot; , &quot;+&#xd;
		                &quot; , &quot;'&quot; , &quot; &lt;tr>&lt;td class=&quot;strong&quot; width=&quot;40%&quot;>&lt;span >Process As Debit Credit:&lt;/span>&lt;/td>&quot; , &quot;'&quot; , &quot;+&#xd;
		                  &quot; , &quot;'&quot; , &quot; &lt;td width=&quot;60%&quot;>&lt;input type=&quot;radio&quot; name=&quot;payViaDebitCredit&quot; value=&quot;true&quot; />&amp;nbsp;Yes&amp;nbsp;&amp;nbsp;&quot; , &quot;'&quot; , &quot; +&#xd;
		                  &quot; , &quot;'&quot; , &quot; &lt;input type=&quot;radio&quot; name=&quot;payViaDebitCredit&quot; value=&quot;false&quot; checked />No&quot; , &quot;'&quot; , &quot; +&#xd;
	                      &quot; , &quot;'&quot; , &quot;&lt;/td>&quot; , &quot;'&quot; , &quot;+&#xd;
	                 &quot; , &quot;'&quot; , &quot; &lt;/tr>&quot; , &quot;'&quot; , &quot; +&#xd;
	             &quot; , &quot;'&quot; , &quot; &lt;/table>&quot; , &quot;'&quot; , &quot;;&#xd;
				}else{&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;pay_via_debit_credit&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&quot;;&#xd;
				}&#xd;
			}else{&#xd;
				alertErrMsg();&#xd;
			}&#xd;
		}&#xd;
		function openNewWindow(clientAccountNumber,lookupValue1,lookupValue2,lookupValue3){&#xd;
			/*alert(clientAccountNumber.value);&#xd;
			alert(lookupValue1.value);&#xd;
			alert(lookupValue2.value);&#xd;
			alert(lookupValue3.value);*/&#xd;
			&#xd;
			var url = &quot; , &quot;'&quot; , &quot;https://aws.amazon.com&quot; , &quot;'&quot; , &quot;;&#xd;
			window.open(url, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;width=800,height=600&quot; , &quot;'&quot; , &quot;);&#xd;
		}&#xd;
		$(&quot;#addressForm&quot;).show();&#xd;
    		var isHideBillingAddress = false;&#xd;
    		console.log(&quot;cc.getHideBillingAddress() - &quot; + isHideBillingAddress);&#xd;
&#xd;
&#xd;
&#xd;
&lt;!--&#xd;
&#xd;
var currentDay = new Date(); var thisYear =  currentDay.getFullYear(); var nextYear = currentDay.getFullYear() + 1; var dateRange=[thisYear,nextYear];function customInit() {var foo=1;}function dateStatusHandler(date, y, m, d) {    var today = new Date();    var myYesterday=new Date();myYesterday.setDate(today.getDate() - 1);if (date &lt;= myYesterday) {return &quot;special&quot;;} else {return false;}} function customCheckBox(obj, checkboxArray, udfscope) { var foo=1; } function customOnChangeUdf1(obj) { var foo=1; } function customOnChangeUdf2(obj) { var foo=1; } function customOnChangeUdf3(obj) { var foo=1; } function customOnChangeUdf4(obj) { var foo=1; } function customOnChangeUdf5(obj) { var foo=1; } function customOnChangeUdf6(obj) { var foo=1; } function customOnChangeUdf7(obj) { var foo=1; } function customOnChangeUdf8(obj) { var foo=1; } function customOnChangeUdf9(obj) { var foo=1; } function customOnChangeUdf10(obj) { var foo=1; }&#xd;
addOnloadHandler(customInit);&#xd;
//-->&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
    &#xd;
&#xd;
    Available Bill Label&#xd;
    * Indicates required field &#xd;
	&#xd;
	Step 1: Pay Your Bill Label(s) By Checking One or More Checkboxes in the &quot;Check to Pay&quot; Column Below.  &#xd;
	&#xd;
&#xd;
    &#xd;
	&#xd;
	&#xd;
		 One bill found.&#xd;
				 &#xd;
			&#xd;
	    	&#xd;
	    		Display102550 results&#xd;
	    		&#xd;
				&#xd;
					&#xd;
			&#xd;
		&#xd;
	&#xd;
	&#xd;
	&#xd;
	&#xd;
    &#xd;
	&#xd;
    &#xd;
 		   &#xd;
        Select All /&#xd;
        Unselect All |  &#xd;
        Show All /&#xd;
        Hide All &#xd;
     &#xd;
    &#xd;
        &#xd;
            Check to Pay&#xd;
            Bill Label&#xd;
	   		             &#xd;
             &#xd;
	            Due Date &#xd;
	         &#xd;
&#xd;
            Pay Date&#xd;
&#xd;
         &#xd;
	            Amount Due &#xd;
	     &#xd;
&#xd;
            Amount to Pay&#xd;
            &#xd;
            &#xd;
           &#xd;
        &#xd;
&#xd;
        &#xd;
&#xd;
	&#xd;
    &#xd;
    &#xd;
                &#xd;
	&#xd;
&#xd;
&#xd;
&#xd;
               &#xd;
                &#xd;
                    &#xd;
                        &#xd;
                    &#xd;
                   &#xd;
                  &#xd;
 485bills&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
	&#xd;
	    04/01/2026&#xd;
	    &#xd;
	&#xd;
 &#xd;
    &#xd;
&#xd;
               	&#xd;
&#xd;
       		 &#xd;
        		 &#xd;
       		 &#xd;
       &#xd;
&#xd;
         &#xd;
    &#xd;
&#xd;
	&#xd;
	$40.00&#xd;
&#xd;
	&#xd;
	&#xd;
	&#xd;
$&#xd;
&#xd;
&#xd;
&lt;!--&#xd;
if(document.getElementById(&quot;payCheckbox1&quot;) != null){&#xd;
	if(document.getElementById(&quot;payCheckbox1&quot;).checked){&#xd;
	    document.getElementById(&quot;payAmount1&quot;).disabled=false;&#xd;
	}else{&#xd;
	 	document.getElementById(&quot;payAmount1&quot;).disabled=true;&#xd;
	}&#xd;
}&#xd;
//-->&#xd;
&#xd;
                &#xd;
                &#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
    &#xd;
        &#xd;
            &#xd;
                                              &#xd;
                    485UDF3:&#xd;
                &#xd;
                &#xd;
	                &#xd;
	                	udf3 data&#xd;
	                &#xd;
                &#xd;
            &#xd;
        &#xd;
            &#xd;
                                              &#xd;
                     :&#xd;
                &#xd;
                &#xd;
					&#xd;
	                    Select One					&#xd;
								&#xd;
										Orange&#xd;
					&#xd;
				&#xd;
            &#xd;
        &#xd;
        &#xd;
    &#xd;
        &#xd;
    &#xd;
&#xd;
&#xd;
                    &#xd;
            &#xd;
            &#xd;
            &#xd;
            	1 bills selected for payment, totaling &#xd;
            &#xd;
            $&#xd;
                40.00&#xd;
            &#xd;
        &#xd;
    &#xd;
    &#xd;
    checkedNum = 0&#xd;
    &#xd;
    &#xd;
    &#xd;
    &#xd;
    	&#xd;
       Step 2: Enter a Payment Method&#xd;
       &#xd;
        &#xd;
            &#xd;
                &#xd;
                &#xd;
                Payment Type: *&#xd;
                    Select One&#xd;
		              Credit Card&#xd;
Personal Checking&#xd;
Personal Savings&#xd;
Business Checking&#xd;
Check&#xd;
                    &#xd;
                &#xd;
            &#xd;
            &#xd;
                &#xd;
                 &#xd;
                    &#xd;
                    &#xd;
                    &#xd;
                        &#xd;
                            Credit Card Information&#xd;
                            Debit Card Information&#xd;
                            &#xd;
                            Please enter the following information about your credit card.&#xd;
                            &#xd;
                            &#xd;
                                &#xd;
                                    Name Appearing on Card: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                       &#xd;
                                &#xd;
                                    Cards Accepted:&#xd;
                                    &#xd;
                                        &#xd;
													&#xd;
										&#xd;
										           	&#xd;
										&#xd;
																				&#xd;
										&#xd;
                                    &#xd;
                                                          &#xd;
                                &#xd;
                                    Card Number: *&#xd;
                                    &#xd;
                                       &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                        CVV: *&#xd;
                                        &#xd;
                                            &#xd;
                                            &#xd;
                                            &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    Expiration Date: *&#xd;
                                     &#xd;
                                        Month...&#xd;
                                            01&#xd;
                                            02&#xd;
                                            03&#xd;
                                            04&#xd;
                                            05&#xd;
                                            06&#xd;
                                            07&#xd;
                                            08&#xd;
                                            09&#xd;
                                            10&#xd;
                                            11&#xd;
                                            12&#xd;
                                        Year...&#xd;
                                            2024&#xd;
2025&#xd;
2026&#xd;
2027&#xd;
2028&#xd;
2029&#xd;
2030&#xd;
2031&#xd;
2032&#xd;
2033&#xd;
2034&#xd;
2035&#xd;
2036&#xd;
2037&#xd;
2038&#xd;
                                    &#xd;
                                &#xd;
                            &#xd;
                              &#xd;
                        &#xd;
                        &#xd;
                        &#xd;
                            Bank Account Information&#xd;
                            &#xd;
                                &#xd;
                                    Company Name: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    Business Tax ID:&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    Routing Number: *&#xd;
                                    &#xd;
                                        &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    Account Number: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                 &#xd;
                                 &#xd;
                                    Confirm Account Number: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                &#xd;
                            &#xd;
                        &#xd;
                        &#xd;
                        &#xd;
                            &#xd;
                                &#xd;
                                    Billing Address:  &#xd;
                                     &#xd;
                                &#xd;
                                &#xd;
                                    Address Line 1: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                 &#xd;
		                            Address Line 2:   &#xd;
		                            &#xd;
		                                &#xd;
		                            &#xd;
		                        &#xd;
		                         &#xd;
		                        	Country: *&#xd;
										&#xd;
			                        		United States&#xd;
										&#xd;
		                        &#xd;
		                        &#xd;
                                    &#xd;
                                    	ZIP:&#xd;
                                    	*&#xd;
                                    	&#xd;
										&#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                       	-&#xd;
                                        &#xd;
										                                   &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
										City:&#xd;
										*&#xd;
									&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    	State :&#xd;
                                    	&#xd;
                                    		*&#xd;
                                    	&#xd;
                                    	&#xd;
                                    &#xd;
                                        Select One&#xd;
                                            Armed Forces Canada                     &#xd;
Armed Forces Africa                     &#xd;
Armed Forces Middle East                &#xd;
Armed Forces Americas                   &#xd;
Armed Forces Europe                     &#xd;
Alaska                                  &#xd;
Alabama                                 &#xd;
Armed Forces Pacific                    &#xd;
Arkansas                                &#xd;
American Samoa                          &#xd;
Arizona                                 &#xd;
California                              &#xd;
Colorado                                &#xd;
Connecticut                             &#xd;
District of Columbia                    &#xd;
Delaware                                &#xd;
Florida                                 &#xd;
Federated States of Micronesia          &#xd;
Georgia                                 &#xd;
Guam                                    &#xd;
Hawaii                                  &#xd;
Iowa                                    &#xd;
Idaho                                   &#xd;
Illinois                                &#xd;
Indiana                                 &#xd;
Kansas                                  &#xd;
Kentucky                                &#xd;
Louisiana                               &#xd;
Massachusetts                           &#xd;
Maryland                                &#xd;
Maine                                   &#xd;
Marshall Island                         &#xd;
Michigan                                &#xd;
Minnesota                               &#xd;
Missouri                                &#xd;
Northern Mariana Islands                &#xd;
Mississippi                             &#xd;
Montana                                 &#xd;
North Carolina                          &#xd;
North Dakota                            &#xd;
Nebraska                                &#xd;
New Hampshire                           &#xd;
New Jersey                              &#xd;
New Mexico                              &#xd;
Nevada                                  &#xd;
New York                                &#xd;
Ohio                                    &#xd;
Oklahoma                                &#xd;
Oregon                                  &#xd;
Pennsylvania                            &#xd;
Puerto Rico                             &#xd;
Palau                                   &#xd;
Rhode Island                            &#xd;
South Carolina                          &#xd;
South Dakota                            &#xd;
Tennessee                               &#xd;
Texas                                   &#xd;
Utah                                    &#xd;
Virginia                                &#xd;
Virgin Islands                          &#xd;
Vermont                                 &#xd;
Washington                              &#xd;
Wisconsin                               &#xd;
West Virginia                           &#xd;
Wyoming                                 &#xd;
                                        	&#xd;
                                    &#xd;
                                &#xd;
                            &#xd;
                            &#xd;
                          &#xd;
                        &#xd;
                            &#xd;
                                &#xd;
                                    &#xd;
                                     &#xd;
                                     	Receipt Email Address:&#xd;
                                     &#xd;
                                     &#xd;
                                    &#xd;
                                &#xd;
							                                                                          &#xd;
                        &#xd;
                    &#xd;
                    &#xd;
                &#xd;
            &#xd;
        &#xd;
        &#xd;
                        &#xd;
                          &#xd;
	                               ACH Terms &amp;&#xd;
Conditions HTML: &#xd;
                             &#xd;
                           &#xd;
                        &#xd;
       &#xd;
       &#xd;
       CC Terms &amp;&#xd;
 Conditions HTML:&#xd;
        &#xd;
            &#xd;
                &#xd;
                     &#xd;
                    &#xd;
							&#xd;
                        &#xd;
&#xd;
                        &#xd;
                    &#xd;
                &#xd;
            &#xd;
                &#xd;
      &#xd;
   &#xd;
&#xd;
&#xd;
var isHideBillingAddress = false;&#xd;
var aID = 485;&#xd;
console.log(&quot;isHideBillingAddress = &quot;+isHideBillingAddress+&quot; aID = &quot;+aID);&#xd;
		changeCountry(document.getElementById(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;).value);&#xd;
    	function PaymentCleanInput(val){&#xd;
    		if(val != 1 &amp;&amp; val != 2 &amp;&amp; val != 3 &amp;&amp; val != 4 &amp;&amp; val != 5){&#xd;
    			cleanInput(0);&#xd;
    		}&#xd;
    		setCityAndStateRequired(val)&#xd;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.paymentMethodTypeKey&quot; , &quot;'&quot; , &quot;).value=val;	&#xd;
    	}&#xd;
    	&#xd;
    	&#xd;
    	console.log(&quot;cc.isHideBillingAddress()   ------ &quot; + cc.getHideBillingAddress());&#xd;
    	console.log(&quot;applicationConfig.getGuestPaymentsMode().equals(guestPayments)   ------ &quot; + applicationConfig.getGuestPaymentsMode().equals(&quot;guestPayments&quot;));&#xd;
    	$(&quot;#tblBillingAddress&quot;).show();&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
                &#xd;
            &#xd;
            &#xd;
            &#xd;
                &#xd;
                 &#xd;
            &#xd;
            &#xd;
&#xd;
     &#xd;
&#xd;
&#xd;
if (document.getElementsByTagName) {&#xd;
	var formElements = document.getElementsByTagName(&quot;form&quot;);&#xd;
	for (i=0; formElements[i]; i++) {&#xd;
		formElements[i].setAttribute(&quot;autocomplete&quot;,&quot;off&quot;);&#xd;
	}		&#xd;
}&#xd;
&#xd;
&#xd;
        &quot;) or . = concat(&quot;&#xd;
        	&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
var XSRF_UUID_PARAMETER_KEY = &quot; , &quot;'&quot; , &quot;f4214bec-9a6f-414d-9a9f-84cc386a9100&quot; , &quot;'&quot; , &quot;;&#xd;
var WAITING_MESSAGE = &quot;Processing...&quot;;&#xd;
function onchanged(value) {&#xd;
 setLanguageSelectMessage();&#xd;
 var ajax = new Ajax();&#xd;
 ajax.get(&quot; , &quot;'&quot; , &quot;/vbills/mbills/languageSelect.go?action=languageSelect&amp;forgotType=null&amp;locale=&quot; , &quot;'&quot; , &quot;+value, windowReload, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);&#xd;
 }&#xd;
function windowReload(){&#xd;
  window.location.reload();&#xd;
}&#xd;
function setLanguageSelectMessage() {&#xd;
    var waitingInfoDiv = getWaitingInfoDivControl();&#xd;
    waitingInfoDiv.innerHTML = &quot;&lt;strong>&quot;+WAITING_MESSAGE+&quot;&lt;\/strong>&quot; ;&#xd;
}&#xd;
function getWaitingInfoDivControl() {&#xd;
    return document.getElementById(&quot; , &quot;'&quot; , &quot;waitingInfoDiv&quot; , &quot;'&quot; , &quot;);&#xd;
}&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
            &#xd;
&#xd;
&#xd;
     &#xd;
&#xd;
&#xd;
            &#xd;
&#xd;
 &#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
  &#xd;
  &#xd;
   &#xd;
   &#xd;
&#xd;
&#xd;
   &#xd;
&#xd;
&#xd;
   &#xd;
&#xd;
&#xd;
function toURL(url){&#xd;
	var obj = document.getElementById(&quot;toURLForm&quot;);&#xd;
	obj.action = url;&#xd;
	obj.submit();&#xd;
}&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
            &#xd;
                &#xd;
                    &#xd;
                     &#xd;
                    &#xd;
                    &#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&lt;!--&#xd;
td.totalMessage{font-size:110%;}&#xd;
th.obvious{background:#b2b2b2;}&#xd;
.dis{color:gray;}&#xd;
&#xd;
.bulb a:link {&#xd;
    color: #f4f3f3;&#xd;
    text-decoration: none;&#xd;
    background-color: #f4f3f3;&#xd;
}&#xd;
.bulb a:active {&#xd;
    color: #f4f3f3;&#xd;
    text-decoration: none;&#xd;
    background-color: #f4f3f3;&#xd;
}&#xd;
.bulb a:hover {&#xd;
    color: #f4f3f3;&#xd;
    text-decoration: none;&#xd;
    background-color: #f4f3f3;&#xd;
}&#xd;
.bulb a:visited {&#xd;
    color: #f4f3f3;&#xd;
    text-decoration: none;&#xd;
    background-color: #f4f3f3;&#xd;
}&#xd;
h2{&#xd;
    color: #000000;&#xd;
    font-size: 11px;&#xd;
    font-weight: bold;&#xd;
    margin: 10px 0;&#xd;
    padding: 5px 0 0 5px;&#xd;
    width: 100%;&#xd;
}&#xd;
-->&#xd;
&#xd;
&#xd;
    &#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&lt;!--&#xd;
var INITIAL_INDEX = 1;&#xd;
 var checkedNum = 0;&#xd;
function getElementsByPrefix(prefix) {&#xd;
	var element = null;&#xd;
	var i = INITIAL_INDEX;&#xd;
	var array = new Array();&#xd;
	while ((element = document.getElementById(prefix + i)) != null) {&#xd;
		array[i] = element;&#xd;
		i = i + 1;&#xd;
	}&#xd;
	return array;&#xd;
}&#xd;
&#xd;
function getElementsByPrefixByCount(prefix, count) {&#xd;
	var element = null;&#xd;
	var array = new Array();&#xd;
	for (var i = INITIAL_INDEX; i &lt; count; i++) {&#xd;
		element = document.getElementById(prefix + i)&#xd;
		array[i] = element;&#xd;
	}&#xd;
	return array;&#xd;
}&#xd;
&#xd;
function showHideElements(spanArray, targetArray, distargetArray, checkboxArray, showFlag) {&#xd;
	var i = INITIAL_INDEX;&#xd;
	/* if(spanArray.length != targetArray.length) {&#xd;
		return;&#xd;
	} */&#xd;
    for(var j=INITIAL_INDEX;j&lt;=targetArray.length;j++){&#xd;
    	 if (targetArray[j] != null) {&#xd;
		        if (showFlag) {&#xd;
		        	targetArray[j].style.display = &quot; , &quot;'&quot; , &quot;block&quot; , &quot;'&quot; , &quot;;&#xd;
		        	if(spanArray[j] != null){&#xd;
		        		spanArray[j].innerHTML = contractsymbol;&#xd;
		        	}&#xd;
		        } else {&#xd;
		        	targetArray[j].style.display = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;;&#xd;
		        	if(spanArray[j] != null){&#xd;
		        		spanArray[j].innerHTML = expandsymbol;&#xd;
		        	}&#xd;
		        }&#xd;
		    }&#xd;
    }&#xd;
}&#xd;
&#xd;
function checkUncheckBoxes(array, checkFlag) {&#xd;
	var alltags=document.all? document.all : document.getElementsByTagName(&quot;*&quot;);&#xd;
	var statecollects=getElementbyClass(alltags, &quot;showstate&quot;);&#xd;
	var i = INITIAL_INDEX;&#xd;
	while (array[i] != null) {&#xd;
	    if (array[i]) {&#xd;
	    	var formNum = i-1;&#xd;
	        if (checkFlag) {&#xd;
	            if(array[i].checked == false){&#xd;
	        		array[i].checked = true;&#xd;
	        		setPayAmountFromAmountDue(amountDueArray[i], payAmountArray[i], payAmountSpanArray[i]);&#xd;
	        	}&#xd;
	        	&#xd;
	        	if(document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
	        		document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;black&quot;;&#xd;
				    document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i).style.display=&quot;block&quot;;&#xd;
				}&#xd;
	        	&#xd;
	        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){&#xd;
	        		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	        			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = false;&#xd;
	   	    	 }else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }	    &#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color = &quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){&#xd;
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = false;&#xd;
	   	    	 }else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){&#xd;
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}    	    	&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){&#xd;
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = false;&#xd;
	   	    	 }else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){&#xd;
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = false;&#xd;
	   	    	 }else{&#xd;
	   	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;black&quot;;&#xd;
	   	    		}&#xd;
	   	    	}&#xd;
	   	    }	&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}	    	    	&#xd;
	   	    }&#xd;
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
			    	document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;black&quot;;&#xd;
			    }&#xd;
			    if(document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
				    document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i).disabled=false;&#xd;
				}&#xd;
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
			    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i).disabled=false;&#xd;
			    }&#xd;
			    if(document.getElementById(&quot;c_payDate&quot; + i) != null){&#xd;
			    	document.getElementById(&quot;c_payDate&quot; + i).style.display=&quot;block&quot;;&#xd;
			    }&#xd;
			    if(document.getElementById(&quot;disc_payDate&quot; + i) != null){&#xd;
					document.getElementById(&quot;disc_payDate&quot; + i).style.display=&quot;none&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;time&quot; + i) != null){&#xd;
					document.getElementById(&quot;time&quot; + i).style.display=&quot;block&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;distime&quot; + i) != null){&#xd;
					document.getElementById(&quot;distime&quot; + i).style.display=&quot;none&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;arrow&quot; + i) != null){&#xd;
					document.getElementById(&quot;arrow&quot; + i).src=&quot;/vbills/_assets/img/b.gif&quot;;&#xd;
				}&#xd;
&#xd;
				if(billDetailSpanArray[i] != null){&#xd;
					billDetailSpanArray[i].innerHTML=&quot; , &quot;'&quot; , &quot;&lt;img src=&quot;/vbills/_assets/img/minus.gif&quot; align=&quot;absmiddle&quot; alt=&quot;Collapse bill details&quot;>&quot; , &quot;'&quot; , &quot;;&#xd;
				}&#xd;
	        } else {&#xd;
	            if(array[i].checked){&#xd;
		        	array[i].checked = false;&#xd;
		        	setPayAmountToZero(payAmountArray[i],payAmountSpanArray[i]);&#xd;
	        	}&#xd;
	        	&#xd;
		        if(document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
			    	document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;gray&quot;;&#xd;
			    }&#xd;
		        if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){&#xd;
					 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
						 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = true;&#xd;
			    	 }else{&#xd;
			        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
			        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = true;&#xd;
			        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;gray&quot;;&#xd;
				    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    &#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					        }&#xd;
				        }&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}			    	&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = true;&#xd;
				    	 }else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = true;&#xd;
				    	 }else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){&#xd;
				    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = true;&#xd;
				    	 }else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
			    if(document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
		        	document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;gray&quot;;&#xd;
		        }&#xd;
		        if(document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
		   	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i).disabled=true;&#xd;
		   	    }&#xd;
		   	    if(document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i) != null){&#xd;
		   	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i).disabled=true;&#xd;
		   	    }&#xd;
		   	    if(document.getElementById(&quot;c_payDate&quot; + i) != null){&#xd;
		   	    	document.getElementById(&quot;c_payDate&quot; + i).style.display=&quot;none&quot;;&#xd;
		   	    }&#xd;
		   	    if(document.getElementById(&quot;disc_payDate&quot; + i) != null){&#xd;
					document.getElementById(&quot;disc_payDate&quot; + i).style.display=&quot;block&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;time&quot; + i) != null){&#xd;
					document.getElementById(&quot;time&quot; + i).style.display=&quot;none&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;distime&quot; + i) != null){&#xd;
					document.getElementById(&quot;distime&quot; + i).style.display=&quot;block&quot;;	&#xd;
				}&#xd;
				if(document.getElementById(&quot;arrow&quot; + i) != null){&#xd;
					document.getElementById(&quot;arrow&quot; + i).src=&quot;/vbills/_assets/img/a.gif&quot;;&#xd;
				}&#xd;
				&#xd;
	        }&#xd;
	    }&#xd;
    	i = i + 1;&#xd;
	}&#xd;
	updateTotal();&#xd;
}&#xd;
//checkbox&#xd;
function populatePayAmount(element, amountDueId, payAmountId, spanPayAmountId) {&#xd;
	if (element.checked) {&#xd;
		setPayAmountFromAmountDue(document.getElementById(amountDueId), document.getElementById(payAmountId), document.getElementById(spanPayAmountId));&#xd;
	} else {&#xd;
		setPayAmountToZero(document.getElementById(payAmountId), document.getElementById(spanPayAmountId));&#xd;
	}&#xd;
	updateTotal();&#xd;
}&#xd;
function populatePayAmount(element, amountDueId, payAmountId, spanPayAmountId, udfs, countValue) {&#xd;
    var formNum = countValue - 1;&#xd;
	var trId = &quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + countValue;&#xd;
	var alltags=document.all? document.all : document.getElementsByTagName(&quot;*&quot;);&#xd;
	var statecollects=getElementbyClass(alltags, &quot;showstate&quot;);&#xd;
	var pictureObj = document.getElementById(&quot;arrow&quot; + countValue);&#xd;
	if (pictureObj.src.indexOf(&quot; , &quot;'&quot; , &quot;/vbills/_assets/img/a.gif&quot; , &quot;'&quot; , &quot;) > -1) {	  &#xd;
	    document.getElementById(&quot; , &quot;'&quot; , &quot;payCheckbox&quot; , &quot;'&quot; , &quot; + countValue).checked = true;&#xd;
	    &#xd;
	    if(document.getElementById(udfs) != null){&#xd;
		    document.getElementById(udfs).style.display=&quot;block&quot;;&#xd;
		    document.getElementById(udfs).style.color=&quot;black&quot;;&#xd;
		}&#xd;
&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }	    &#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color = &quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){&#xd;
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = false;&#xd;
	    	 }else{&#xd;
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
	    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = false;&#xd;
	    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;black&quot;;&#xd;
	    		}&#xd;
	    	}	    	    	&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){&#xd;
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = false;&#xd;
	    	 }else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){&#xd;
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = false;&#xd;
	    	 }else{&#xd;
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }	&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}	    	    	&#xd;
	    }&#xd;
	    if(document.getElementById(trId) != null){&#xd;
		    document.getElementById(trId).style.color=&quot;black&quot;;&#xd;
        }&#xd;
        if(document.getElementById(payAmountId) != null)	   {&#xd;
           document.getElementById(payAmountId).disabled=false;&#xd;
        }   &#xd;
	    if( document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue) != null){&#xd;
	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue).disabled=false;&#xd;
	    }	   &#xd;
	    	    &#xd;
	 		&#xd;
		if(document.getElementById(&quot;time&quot; + countValue) != null){		&#xd;
			document.getElementById(&quot;time&quot; + countValue).style.display=&quot;block&quot;;&#xd;
		}				&#xd;
		if(document.getElementById(&quot;distime&quot; + countValue) != null){&#xd;
			document.getElementById(&quot;distime&quot; + countValue).style.display=&quot;none&quot;;&#xd;
		}		&#xd;
		if(document.getElementById(&quot;arrow&quot; + countValue)!=null){&#xd;
			document.getElementById(&quot;arrow&quot; + countValue).src=&quot;/vbills/_assets/img/b.gif&quot;;&#xd;
		}&#xd;
		setPayAmountFromAmountDue(document.getElementById(amountDueId), document.getElementById(payAmountId), document.getElementById(spanPayAmountId));	&#xd;
	} else {&#xd;
		document.getElementById(&quot; , &quot;'&quot; , &quot;payCheckbox&quot; , &quot;'&quot; , &quot; + countValue).checked = false;&#xd;
		&#xd;
		if(document.getElementById(udfs)){&#xd;
		    document.getElementById(udfs).style.color=&quot;gray&quot;;&#xd;
		}&#xd;
		 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){&#xd;
			 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
				 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = true;&#xd;
	    	 }else{&#xd;
	        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
	        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = true;&#xd;
	        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;gray&quot;;&#xd;
		    	}&#xd;
		    }&#xd;
		   }&#xd;
		    &#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = true;&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;gray&quot;;&#xd;
		    		}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = true;&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;gray&quot;;&#xd;
		       		}&#xd;
		        }&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = true;&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color=&quot;gray&quot;;&#xd;
		    		}&#xd;
		    	}		    	&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = true;&#xd;
		    	 }else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = true;&#xd;
		    	 }else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){&#xd;
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = true;&#xd;
		    	 }else{&#xd;
			    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
	    &#xd;
		if(document.getElementById(trId)){&#xd;
	        document.getElementById(trId).style.color=&quot;gray&quot;;&#xd;
	    }&#xd;
	    if(document.getElementById(payAmountId)){&#xd;
   	    	document.getElementById(payAmountId).disabled=true;&#xd;
   	    }&#xd;
   	    if( document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue) != null){&#xd;
   	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue).disabled=true;&#xd;
   	    }&#xd;
   	   &#xd;
		if(document.getElementById(&quot;time&quot; + countValue) != null){&#xd;
			document.getElementById(&quot;time&quot; + countValue).style.display=&quot;none&quot;;&#xd;
		}&#xd;
		if(document.getElementById(&quot;distime&quot; + countValue)!=null){&#xd;
			document.getElementById(&quot;distime&quot; + countValue).style.display=&quot;block&quot;;&#xd;
		}&#xd;
		if(document.getElementById(&quot;arrow&quot; + countValue) != null){&#xd;
			document.getElementById(&quot;arrow&quot; + countValue).src=&quot;/vbills/_assets/img/a.gif&quot;;&#xd;
		}&#xd;
		setPayAmountToZero(document.getElementById(payAmountId), document.getElementById(spanPayAmountId));&#xd;
	}&#xd;
	if(billDetailSpanArray[countValue] != null){&#xd;
		billDetailSpanArray[countValue].innerHTML=&quot; , &quot;'&quot; , &quot;&lt;img src=&quot;/vbills/_assets/img/minus.gif&quot; align=&quot;absmiddle&quot; alt=&quot;Collapse bill details&quot;>&quot; , &quot;'&quot; , &quot;&#xd;
	}&#xd;
	updateTotal();&#xd;
&#xd;
}&#xd;
function setPayAmountFromAmountDue(amountDue, payAmount, spanPayAmount) {&#xd;
	payAmount.value = amountDue.value;&#xd;
	if (spanPayAmount != null) {&#xd;
		spanPayAmount.innerHTML = payAmount.value;&#xd;
	}&#xd;
	checkedNum++;&#xd;
}&#xd;
&#xd;
function setPayAmountToZero(payAmount, spanPayAmount) {&#xd;
	payAmount.value = &quot;0.00&quot;;&#xd;
	if (spanPayAmount != null) {&#xd;
		spanPayAmount.innerHTML = payAmount.value;&#xd;
	}&#xd;
	checkedNum--;&#xd;
}&#xd;
&#xd;
function formatMoney(money) {&#xd;
	var index = money.indexOf(&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;);&#xd;
	var len = money.length;&#xd;
	if (index == -1) {&#xd;
		return money + &quot;.00&quot;;&#xd;
	} else if (len - index == 2) {&#xd;
		return money + &quot;0&quot;;s&#xd;
	}&#xd;
	return money;&#xd;
}&#xd;
&#xd;
function truncateMoneyValue(moneyValue) {&#xd;
	var moneyValue = moneyValue.replace(/,/g, &quot;&quot;);&#xd;
	var index = moneyValue.indexOf(&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;);&#xd;
	if (index > -1) {&#xd;
		var len = moneyValue.length;&#xd;
		if(index &lt; len - 3) {&#xd;
			moneyValue = moneyValue.substring(0, index + 3);&#xd;
		}&#xd;
	}&#xd;
	return moneyValue;&#xd;
}&#xd;
&#xd;
function resetCheckbox(inputField, payCheckboxId,zeroAccepted, amountDueId, consolidateBills) {          &#xd;
	setTimeout(&quot;timeoutResetCheckbox(&quot; , &quot;'&quot; , &quot;&quot; + inputField.id + &quot;&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&quot; + payCheckboxId + &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; + zeroAccepted + &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; + amountDueId + &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; + consolidateBills + &quot;&quot; , &quot;'&quot; , &quot;);&quot;, 1);&#xd;
}&#xd;
&#xd;
function timeoutResetCheckbox(inputFieldId, payCheckboxId, zeroAccepted, amountDueId, consolidateBills) {&#xd;
	var inputField = document.getElementById(inputFieldId);&#xd;
	var moneyValue = truncateMoneyValue(inputField.value);&#xd;
	var floatValue = parseFloat(moneyValue);&#xd;
	var amountDue = document.getElementById(amountDueId);&#xd;
	var amountDueValue = truncateMoneyValue(amountDue.value);&#xd;
	var floatAmountDueValue = parseFloat(amountDueValue);&#xd;
	&#xd;
	if (isNaN(floatValue)) {&#xd;
		inputField.value = &quot;0.00&quot;&#xd;
		document.getElementById(payCheckboxId).checked = false;&#xd;
		return;&#xd;
	}&#xd;
	inputField.value = formatMoney(floatValue.toString());&#xd;
	updateTotal();&#xd;
}&#xd;
&#xd;
var TOTAL_TO_PAY = &quot; , &quot;'&quot; , &quot;totalToPay&quot; , &quot;'&quot; , &quot;;&#xd;
var SPAN_TOTAL_TO_PAY = &quot; , &quot;'&quot; , &quot;spanTotalToPay&quot; , &quot;'&quot; , &quot;;&#xd;
var SAVE_PAYMENT_CHECKBOX_TR = &quot; , &quot;'&quot; , &quot;savePaymentCheckboxTr&quot; , &quot;'&quot; , &quot;;&#xd;
var STORE_PAYMENT_METHOD_CHKBOX_ID = &quot; , &quot;'&quot; , &quot;storePaymentMethod&quot; , &quot;'&quot; , &quot;;&#xd;
var SAVE_NICKNAME_TR = &quot; , &quot;'&quot; , &quot;saveNickNameTr&quot; , &quot;'&quot; , &quot;;&#xd;
var NUM_TOTAL_TO_PAY = &quot; , &quot;'&quot; , &quot;numTotalToPay&quot; , &quot;'&quot; , &quot;;&#xd;
&#xd;
var checkboxArray = null;&#xd;
var divArray = null;&#xd;
var billDetailSpanArray = null;&#xd;
var payAmountArray = null;&#xd;
var payAmountSpanArray = null;&#xd;
var amountDueArray = null;&#xd;
&#xd;
&#xd;
function initVariables() {&#xd;
	checkboxArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;payCheckbox&quot; , &quot;'&quot; , &quot;);&#xd;
	divArray = getElementsByPrefixByCount(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot;, checkboxArray.length);&#xd;
	disdivArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;disudf&quot; , &quot;'&quot; , &quot;);&#xd;
	billDetailSpanArray = getElementsByPrefixByCount(&quot; , &quot;'&quot; , &quot;billDetailsSpan&quot; , &quot;'&quot; , &quot;, checkboxArray.length);&#xd;
	payAmountArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot;);&#xd;
	payAmountSpanArray = getElementsByPrefixByCount(&quot; , &quot;'&quot; , &quot;spanPayAmount&quot; , &quot;'&quot; , &quot;, payAmountArray.length);&#xd;
	amountDueArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;amountDue&quot; , &quot;'&quot; , &quot;);	&#xd;
}&#xd;
&#xd;
var BILL_PAYMENT_DERIVED_URL_PREFIX = &quot; , &quot;'&quot; , &quot;/vbills/mbills/billPaymentDerivedField.go?&amp;forgotType=null&quot; , &quot;'&quot; , &quot;;&#xd;
&#xd;
function outputComma(num) {&#xd;
    num = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; + num;&#xd;
    var number = num;&#xd;
	var decimalPart = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;&#xd;
    if (num.indexOf(&quot;.&quot;)!=-1) {&#xd;
	  number = num.substring(0,num.indexOf(&quot;.&quot;));&#xd;
	  decimalPart = num.substring(num.indexOf(&quot;.&quot;) , num.length);&#xd;
	}&#xd;
    if (number.length > 3) {&#xd;
        var mod = number.length%3;&#xd;
        var output = (mod > 0 ? (number.substring(0,mod)) : &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);&#xd;
        for (i=0 ; i &lt; Math.floor(number.length/3) ; i++) {&#xd;
            if ((mod ==0) &amp;&amp; (i ==0))&#xd;
                output+= number.substring(mod+3*i,mod+3*i+3);&#xd;
            else&#xd;
                output+= &quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot; + number.substring(mod+3*i,mod+3*i+3);&#xd;
        }&#xd;
        return (output)+decimalPart;&#xd;
    }&#xd;
    else return number+decimalPart;&#xd;
}&#xd;
&#xd;
function updateTotal() {&#xd;
	var amountArray = new Array();	&#xd;
	var total=0;&#xd;
	for (var i = INITIAL_INDEX; i &lt; payAmountArray.length; i++) {&#xd;
	    if(payAmountArray[i].value == &quot;&quot;){&#xd;
	    	payAmountArray[i].value = &quot;0.00&quot;;&#xd;
	    }&#xd;
		amountArray.push(payAmountArray[i].value);&#xd;
		total += parseFloat(payAmountArray[i].value.replace(&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;));	&#xd;
&#xd;
	} &#xd;
    document.getElementById(NUM_TOTAL_TO_PAY).innerHTML = checkedNum;&#xd;
	document.getElementById(TOTAL_TO_PAY).value = outputComma(total.toFixed(2));&#xd;
	document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = outputComma(total.toFixed(2));&#xd;
	 &#xd;
}&#xd;
&#xd;
function getTotalAmountCalculatedCallback(responseText) {&#xd;
	var total = handleAjaxResponse(responseText);&#xd;
	document.getElementById(TOTAL_TO_PAY).value = total;&#xd;
	document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = total;&#xd;
}&#xd;
&#xd;
function handleAjaxResponse(responseText) {&#xd;
	enableDisableButtons(true);&#xd;
    var responseArray = eval(responseText);&#xd;
    if (responseArray[0] == true) {&#xd;
       return responseArray[1];&#xd;
    } else {&#xd;
    	return responseArray[1];&#xd;
    }   &#xd;
}&#xd;
&#xd;
function setCalculatingValueMessage(element) {&#xd;
	enableDisableButtons(false);&#xd;
	element.innerHTML = &quot; , &quot;'&quot; , &quot;Calculating ...&quot; , &quot;'&quot; , &quot;;&#xd;
//    span.className = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;&#xd;
}&#xd;
&#xd;
function enableDisableButtons(isEnable) {&#xd;
	document.getElementById(&quot; , &quot;'&quot; , &quot;nextButton&quot; , &quot;'&quot; , &quot;).enabled = isEnable;&#xd;
}&#xd;
&#xd;
var LABEL_SUFFIX = &quot; , &quot;'&quot; , &quot; &lt;span class=&quot;requiredField&quot;>*&lt;\/span>&quot; , &quot;'&quot; , &quot;;&#xd;
&#xd;
function setLabel(id, label, isRequred) {&#xd;
    if(isRequred) {&#xd;
            document.getElementById(id).innerHTML = label + LABEL_SUFFIX;&#xd;
    } else {&#xd;
            document.getElementById(id).innerHTML = label;&#xd;
    }&#xd;
}&#xd;
&#xd;
PAYMENT_METHOD_SELECTBOX_ID = &quot; , &quot;'&quot; , &quot;selectedPaymentMethod&quot; , &quot;'&quot; , &quot;;&#xd;
PAYMENT_METHOD_INFO_URL_PREFIX = &quot; , &quot;'&quot; , &quot;/vbills/mbills/paymentMethodInfo.go?&amp;forgotType=null&quot; , &quot;'&quot; , &quot;;&#xd;
PAYMENT_METHOD_INFO_DIV_ID = &quot; , &quot;'&quot; , &quot;paymentMethodInfoDiv&quot; , &quot;'&quot; , &quot;;&#xd;
PAYMENT_METHOD_TYPE_FORM_DIV_ID = &quot; , &quot;'&quot; , &quot;paymentMethodTypeFormDiv&quot; , &quot;'&quot; , &quot;;&#xd;
&#xd;
function toggle() {&#xd;
	if(area > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; area != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
		document.getElementById(&quot; , &quot;'&quot; , &quot;pay_via_debit_credit&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&quot;;&#xd;
	}&#xd;
    var area = safeGetInputValue(PAYMENT_METHOD_SELECTBOX_ID);&#xd;
    if(area != null &amp;&amp; area != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){&#xd;
	    if(area.indexOf(&quot;_&quot;)  >0 ){&#xd;
	    	hideShowElementFrfx(PAYMENT_METHOD_TYPE_FORM_DIV_ID, false);&#xd;
	    	hideShowElementFrfx(SAVE_PAYMENT_CHECKBOX_TR, false);&#xd;
	    	var str = area.split(&quot;_&quot;);&#xd;
	    	var arean = &quot;name_&quot; + str[str.length-1];&#xd;
	    	displayPaymentMethodInfo(arean);&#xd;
	    } else {&#xd;
	    	hideShowElementFrfx(PAYMENT_METHOD_INFO_DIV_ID, false);&#xd;
	    	hideShowElementFrfx(PAYMENT_METHOD_TYPE_FORM_DIV_ID, true);&#xd;
	    	hideShowElementFrfx(SAVE_PAYMENT_CHECKBOX_TR, true);&#xd;
	    	if(area==&quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;check_accCondition&quot; , &quot;'&quot; , &quot;,false);&#xd;
	    //	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;achTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);&#xd;
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;ccTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,true);&#xd;
	    	}else{&#xd;
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;check_accCondition&quot; , &quot;'&quot; , &quot;,false);&#xd;
	    //	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;achTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);&#xd;
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;ccTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);&#xd;
	    	}&#xd;
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;area_creditCard&quot; , &quot;'&quot; , &quot;, (area == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;));&#xd;
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;creditCardInfo&quot; , &quot;'&quot; , &quot;,area == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot;);&#xd;
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;debitCardInfo&quot; , &quot;'&quot; , &quot;,area == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;);&#xd;
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;area_achPayment&quot; , &quot;'&quot; , &quot;, (area > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; area != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;));&#xd;
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;addressForm&quot; , &quot;'&quot; , &quot;, true);&#xd;
		    if (area > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; area != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;) {&#xd;
		    hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;check_accCondition&quot; , &quot;'&quot; , &quot;, true);&#xd;
		//    hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;achTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,true);&#xd;
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;ccTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);&#xd;
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;bankInfo1&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;4&quot; , &quot;'&quot; , &quot;);&#xd;
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;bankInfo2&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;4&quot; , &quot;'&quot; , &quot;);&#xd;
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;personalRoutingGif&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;2&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;3&quot; , &quot;'&quot; , &quot;);&#xd;
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;businessRoutingGif&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;4&quot; , &quot;'&quot; , &quot;);                &#xd;
		        setLabel(&quot; , &quot;'&quot; , &quot;bankInfo3&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&lt;span id=&quot;paymentMethod.firstName&quot;>First Name:&lt;/span>&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;2&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;3&quot; , &quot;'&quot; , &quot;);&#xd;
		        setLabel(&quot; , &quot;'&quot; , &quot;bankInfo4&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&lt;span id=&quot;paymentMethod.lastName&quot;>Last Name:&lt;/span>&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;2&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;3&quot; , &quot;'&quot; , &quot;);&#xd;
		    }&#xd;
	    }&#xd;
    }&#xd;
}&#xd;
&#xd;
function togglePaymentMethodType() {&#xd;
  	toggle();&#xd;
    if(document.getElementById(SPAN_TOTAL_TO_PAY) != null &amp;&amp; document.getElementById(TOTAL_TO_PAY) != null){&#xd;
		document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = document.getElementById(TOTAL_TO_PAY).value;&#xd;
    }&#xd;
}&#xd;
&#xd;
function toggleSaveNickNameTr() {&#xd;
	hideShowElementFrfx(SAVE_NICKNAME_TR, document.getElementById(STORE_PAYMENT_METHOD_CHKBOX_ID).checked);&#xd;
}&#xd;
&#xd;
function schedulePayment(index) {&#xd;
    document.getElementById(&quot; , &quot;'&quot; , &quot;schedulePaymentForBillIndex&quot; , &quot;'&quot; , &quot;).value = index;&#xd;
    submitForm(&quot; , &quot;'&quot; , &quot;billListForm&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;/vbills/mbills/billList.go?action=schedulePayment&amp;forgotType=null&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;You have already submitted this form&quot; , &quot;'&quot; , &quot;);&#xd;
}&#xd;
&#xd;
//========= Saved Payment Information Ajax Call&#xd;
&#xd;
function displayPaymentMethodInfo(selectedId) {&#xd;
    if (selectedId == &quot;&quot;) {&#xd;
        return;&#xd;
    }&#xd;
    disableElementById(PAYMENT_METHOD_SELECTBOX_ID);&#xd;
    setWaitingMessageOnInfoDiv();&#xd;
    var ajax = new Ajax();&#xd;
    ajax.add(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;, selectedId);&#xd;
    ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);&#xd;
    ajax.post(PAYMENT_METHOD_INFO_URL_PREFIX + &quot; , &quot;'&quot; , &quot;&amp;action=getInfo&quot; , &quot;'&quot; , &quot;, paymentMethodInfoCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);  &#xd;
}&#xd;
&#xd;
function paymentMethodInfoCallback(responseText) {&#xd;
    var pmiDiv = getPmiDivControl();&#xd;
    pmiDiv.innerHTML = responseText;&#xd;
	hideShowElementFrfx(PAYMENT_METHOD_INFO_DIV_ID, true);&#xd;
    enableElementById(PAYMENT_METHOD_SELECTBOX_ID);&#xd;
    if(document.getElementById(&quot;paymentMethodTypeId&quot;) != null){&#xd;
	    var paymentMethodTypeIdValue = document.getElementById(&quot;paymentMethodTypeId&quot;).value;&#xd;
	    if(paymentMethodTypeIdValue == &quot;1&quot; || paymentMethodTypeIdValue == &quot;5&quot; ){&#xd;
	   		document.getElementById(&quot;check_accCondition&quot;).style.display=&quot;none&quot;;&#xd;
	   	//	document.getElementById(&quot;achTermsAndConditionsMessage&quot;).style.display=&quot;none&quot;;&#xd;
	   		document.getElementById(&quot;ccTermsAndConditionsMessage&quot;).style.display=&quot;block&quot;;&#xd;
	    }else{&#xd;
	    	document.getElementById(&quot;check_accCondition&quot;).style.display=&quot;block&quot;;&#xd;
	  //  	document.getElementById(&quot;achTermsAndConditionsMessage&quot;).style.display=&quot;block&quot;;&#xd;
	   		document.getElementById(&quot;ccTermsAndConditionsMessage&quot;).style.display=&quot;none&quot;;&#xd;
	    }&#xd;
    }&#xd;
}&#xd;
&#xd;
function setWaitingMessageOnInfoDiv() {&#xd;
    var pmiDiv = getPmiDivControl();&#xd;
    pmiDiv.innerHTML = &quot; , &quot;'&quot; , &quot;&lt;br/>&lt;strong>Retrieving Information ...&lt;/strong>&quot; , &quot;'&quot; , &quot;;&#xd;
}&#xd;
&#xd;
function getPmiDivControl() {&#xd;
    return document.getElementById(PAYMENT_METHOD_INFO_DIV_ID);&#xd;
}&#xd;
 &#xd;
addOnloadHandler(togglePaymentMethodType);&#xd;
//addOnloadHandler(toggleSaveNickNameTr);&#xd;
addOnloadHandler(initVariables);&#xd;
setFieldsThatNeedToBeClearedBetweenPageFlow([&quot; , &quot;'&quot; , &quot;paymentMethodForm.cardAccountNumber&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;paymentMethodForm.bankAccountNumber&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;paymentMethodForm.cvv&quot; , &quot;'&quot; , &quot;]);&#xd;
//-->&#xd;
&#xd;
function PendingBillsSearch(){&#xd;
	var pageResultNum = document.getElementById(&quot;pageSize&quot;).value;&#xd;
	var url=&quot;/vbills/mbills/billList.go?action=navigateForGuestPay&amp;forgotType=null&amp;pageNumber=1&amp;pageSize=&quot;+pageResultNum;&#xd;
	var obj = document.getElementById(&quot;pagingForm&quot;);&#xd;
	obj.action = url;&#xd;
	obj.submit();	&#xd;
}&#xd;
&#xd;
function wsug(e, str){ &#xd;
 var oThis = arguments.callee;&#xd;
 if(!str) {&#xd;
  oThis.sug.style.visibility = &quot; , &quot;'&quot; , &quot;hidden&quot; , &quot;'&quot; , &quot;;&#xd;
  document.onmousemove = null;&#xd;
  document.getElementById(&quot;helpIMG&quot;).src=&quot;/vbills/_assets/img/help3.gif&quot;;&#xd;
  return;&#xd;
 }  &#xd;
 if(!oThis.sug){  &#xd;
  var div = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;top:0; left:0; position:absolute; z-index:100; visibility:hidden&quot; , &quot;'&quot; , &quot;;&#xd;
   div.style.cssText = css;&#xd;
   div.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  var sug = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css= &quot; , &quot;'&quot; , &quot;font:normal 12px/16px; white-space:nowrap; color:#666; padding:3px; position:absolute; left:0; top:0; z-index:10; background:#f9fdfd; border:1px solid #0aa&quot; , &quot;'&quot; , &quot;;&#xd;
   sug.style.cssText = css;&#xd;
   sug.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  var dr = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;position:absolute; top:3px; left:3px; background:#333; filter:alpha(opacity=50); opacity:0.5; z-index:9&quot; , &quot;'&quot; , &quot;;&#xd;
   dr.style.cssText = css;&#xd;
   dr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  var ifr = document.createElement(&quot; , &quot;'&quot; , &quot;iframe&quot; , &quot;'&quot; , &quot;), css=&quot; , &quot;'&quot; , &quot;position:absolute; left:0; top:0; z-index:8; filter:alpha(opacity=0); opacity:0&quot; , &quot;'&quot; , &quot;;&#xd;
   ifr.style.cssText = css;&#xd;
   ifr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  div.appendChild(ifr);&#xd;
  div.appendChild(dr);&#xd;
  div.appendChild(sug);&#xd;
  div.sug = sug;&#xd;
  document.body.appendChild(div);&#xd;
  oThis.sug = div;&#xd;
  oThis.dr = dr;&#xd;
  oThis.ifr = ifr;&#xd;
  div = dr = ifr = sug = null;&#xd;
 }&#xd;
 document.getElementById(&quot;helpIMG&quot;).src=&quot;/vbills/_assets/img/help.gif&quot;;&#xd;
 var e = e || window.event, obj = oThis.sug, dr = oThis.dr, ifr = oThis.ifr;&#xd;
 obj.sug.innerHTML = str;&#xd;
 &#xd;
 var w = obj.sug.offsetWidth, h = obj.sug.offsetHeight, dw = document.documentElement.clientWidth||document.body.clientWidth; dh = document.documentElement.clientHeight || document.body.clientHeight;&#xd;
 var st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;&#xd;
 var left = e.clientX +sl +17 + w &lt; dw + sl  &amp;&amp;  e.clientX + sl + 15 || e.clientX +sl-8 - w, top = e.clientY + st +17 + h &lt; dh + st  &amp;&amp;  e.clientY + st + 17 || e.clientY + st - 5 - h;&#xd;
 obj.style.left = left+ 10 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 obj.style.top = top + 10 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 dr.style.width = w + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 dr.style.height = h + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 ifr.style.width = w + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 ifr.style.height = h + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 obj.style.visibility = &quot; , &quot;'&quot; , &quot;visible&quot; , &quot;'&quot; , &quot;;&#xd;
 document.onmousemove = function(e){&#xd;
  var e = e || window.event, st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;&#xd;
  var left = e.clientX +sl +17 + w &lt; dw + sl  &amp;&amp;  e.clientX + sl + 15 || e.clientX +sl-8 - w, top = e.clientY + st +17 + h &lt; dh + st  &amp;&amp;  e.clientY + st + 17 || e.clientY + st - 5 - h;&#xd;
  obj.style.left = left + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
  obj.style.top = top + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 }&#xd;
}&#xd;
function instruction(e, str){ &#xd;
var oThis = arguments.callee;&#xd;
 if(!str) {&#xd;
  oThis.sug.style.visibility = &quot; , &quot;'&quot; , &quot;hidden&quot; , &quot;'&quot; , &quot;;&#xd;
  return;&#xd;
 }  &#xd;
&#xd;
 if(!oThis.sug){  &#xd;
  var div = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;position:fixed; z-index:100; visibility:visibiled; width:220px;&quot; , &quot;'&quot; , &quot;;&#xd;
   div.style.cssText = css;&#xd;
   div.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  var sug = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css= &quot; , &quot;'&quot; , &quot;font:normal 12px/16px; color:#666; padding:3px; position:fixed; z-index:10; background:#f9fdfd; border:1px solid #0aa; width:220px;&quot; , &quot;'&quot; , &quot;;&#xd;
   sug.style.cssText = css;&#xd;
   sug.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  var dr = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;position:fixed; background:#333; filter:alpha(opacity=50); opacity:0.5; z-index:9; width:220px;&quot; , &quot;'&quot; , &quot;;&#xd;
   dr.style.cssText = css;&#xd;
   dr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  var ifr = document.createElement(&quot; , &quot;'&quot; , &quot;iframe&quot; , &quot;'&quot; , &quot;), css=&quot; , &quot;'&quot; , &quot;position:fixed; z-index:8; filter:alpha(opacity=0); opacity:0; width:220px;&quot; , &quot;'&quot; , &quot;;&#xd;
   ifr.style.cssText = css;&#xd;
   ifr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);&#xd;
  div.appendChild(ifr);&#xd;
  div.appendChild(dr);&#xd;
  div.appendChild(sug);&#xd;
  div.sug = sug;&#xd;
  document.body.appendChild(div);&#xd;
  oThis.sug = div;&#xd;
  oThis.dr = dr;&#xd;
  oThis.ifr = ifr;&#xd;
  div = dr = ifr = sug = null;&#xd;
 }&#xd;
&#xd;
 var e = e , obj = oThis.sug, dr = oThis.dr, ifr = oThis.ifr;&#xd;
 var pos = findPosition(e);&#xd;
 obj.sug.innerHTML = str;&#xd;
 &#xd;
 var w = obj.sug.offsetWidth, h = obj.sug.offsetHeight, dw = document.documentElement.clientWidth||document.body.clientWidth; dh = document.documentElement.clientHeight || document.body.clientHeight;&#xd;
 var st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;&#xd;
 var left = pos[0] +sl +17 + w &lt; dw + sl  &amp;&amp;  pos[0] + sl + 15 || pos[0] +sl-8 - w, top = pos[1] + st + h &lt; dh + st  &amp;&amp;  pos[1] + st || pos[1] + st - 5 - h; obj.style.left = left+ 10 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 obj.style.top = top + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 var left0 = left - w - 50;&#xd;
 obj.style.left = left0 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 dr.style.width = w + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 dr.style.height = h + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 dr.style.top = top + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 dr.style.left = left0 + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 ifr.style.width = w + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 ifr.style.height = h + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;&#xd;
 obj.style.visibility = &quot; , &quot;'&quot; , &quot;visible&quot; , &quot;'&quot; , &quot;;&#xd;
&#xd;
}&#xd;
&#xd;
function findPosition( oElement ) &#xd;
{&#xd;
  var x2 = 0;&#xd;
  var y2 = 0;&#xd;
  var width = oElement.offsetWidth;&#xd;
  var height = oElement.offsetHeight;&#xd;
  if( typeof( oElement.offsetParent ) != &quot; , &quot;'&quot; , &quot;undefined&quot; , &quot;'&quot; , &quot; ) &#xd;
  {&#xd;
    for( var posX = 0, posY = 0; oElement; oElement = oElement.offsetParent ) &#xd;
    {&#xd;
      posX += oElement.offsetLeft;&#xd;
      posY += oElement.offsetTop;      &#xd;
    }&#xd;
    x2 = posX + width;&#xd;
    y2 = posY + height;&#xd;
    return [ posX, posY ,x2, y2];&#xd;
    &#xd;
    } else{&#xd;
      x2 = oElement.x + width;&#xd;
      y2 = oElement.y + height;&#xd;
      return [ oElement.x, oElement.y, x2, y2];&#xd;
  }&#xd;
}&#xd;
		function getStateList(countryId){&#xd;
			var ajax = new Ajax();&#xd;
			ajax.add(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;, countryId);&#xd;
			ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);			&#xd;
			ajax.get(&quot; , &quot;'&quot; , &quot;/vbills/mbills/stateInfo.go?action=getStateTypesByCountry&amp;forgotType=null&quot; , &quot;'&quot; , &quot; + &quot; , &quot;'&quot; , &quot;&amp;action=getStateTypesByCountry&quot; , &quot;'&quot; , &quot;, stateTypeByCountryCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);&#xd;
		}&#xd;
		function stateTypeByCountryCallback(responseText){&#xd;
			var datalist = responseText.parseJSON();&#xd;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.state&quot; , &quot;'&quot; , &quot;).innerHTML= datalist.stateLabel;&#xd;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.stateLabel&quot; , &quot;'&quot; , &quot;).value= datalist.stateLabel;&#xd;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.zipCode&quot; , &quot;'&quot; , &quot;).innerHTML= datalist.zipLabel;&#xd;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.zipLabel&quot; , &quot;'&quot; , &quot;).value=datalist.zipLabelKey;&#xd;
			if(datalist.stateList.length>0){&#xd;
				showStateSelect();&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&quot;;&#xd;
				for(var i=0;i&lt;datalist.stateList.length;i++){&#xd;
					var option = document.createElement(&quot;option&quot;);&#xd;
					var rs =  datalist.stateList[i];&#xd;
					option.value = rs.id;&#xd;
                    option.innerHTML = rs.value;&#xd;
                    document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).appendChild(option);           &#xd;
				}&#xd;
			}else{&#xd;
				hideStateSelect();&#xd;
			}&#xd;
		}&#xd;
        &#xd;
       &#xd;
        function changeCountry(val){&#xd;
        	if(val != 840){&#xd;
        		hideZipCodeSplit();&#xd;
        		&#xd;
        	}else{&#xd;
        		showZipCodeSplit();&#xd;
        	}&#xd;
			var paymentMethodType = document.getElementById(&quot; , &quot;'&quot; , &quot;selectedPaymentMethod&quot; , &quot;'&quot; , &quot;).value;&#xd;
        	if(65 > 1){        		&#xd;
		 		showStateSelect();&#xd;
		 	}else{		 		&#xd;
		 		hideStateSelect();&#xd;
		 	}&#xd;
&#xd;
			if(paymentMethodType == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || paymentMethodType == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
			} &#xd;
			if(paymentMethodType > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; paymentMethodType != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
				if(val == 840){&#xd;
        			document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
        			document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
        		}else{&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
				}&#xd;
			}	&#xd;
        }&#xd;
        function showStateSelect(){&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.state&quot;);&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);&#xd;
        }&#xd;
        function hideStateSelect(){&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.stateCode&quot;);&#xd;
        }&#xd;
        function cleanInput(val){&#xd;
			var paymentMethodType = document.getElementById(&quot; , &quot;'&quot; , &quot;selectedPaymentMethod&quot; , &quot;'&quot; , &quot;).value;&#xd;
&#xd;
			if(paymentMethodType == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || paymentMethodType == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
				if(840 == val){&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
				}else{&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
				}&#xd;
			}&#xd;
			if(paymentMethodType > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; paymentMethodType != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
				if(840 == val){&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
				}else{&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
				}&#xd;
					&#xd;
			}	&#xd;
        }&#xd;
        &#xd;
        function showZipCodeSplit(){&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.zipCode&quot;);&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;zipSplit&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);&#xd;
        }&#xd;
        function hideZipCodeSplit(){&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;zipSplit&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;&#xd;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.zipCode&quot;);&#xd;
        }&#xd;
        &#xd;
        function linkageStateAndCountry(val){&#xd;
        	if(val != 840){&#xd;
        		hideZipCodeSplit();&#xd;
        		&#xd;
        	}else{&#xd;
        		showZipCodeSplit();&#xd;
        	}&#xd;
	        cleanInput(val);&#xd;
	        getStateList(val);&#xd;
        }&#xd;
        function is_valid_zip(zip) {&#xd;
			var re = /^\d{5}(\d{4})?$/;&#xd;
			return re.test(zip);&#xd;
		}&#xd;
        function alertErrMsg(){&#xd;
				//document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&lt;ul>&lt;li>ZIP_Code is not valid.&lt;/li>&lt;/ul>&quot;;&#xd;
        		//document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;block&quot;;        	&#xd;
        }&#xd;
        function zipCodeValidate(){&#xd;
        	var countryId = document.getElementById(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;).value;&#xd;
        	&#xd;
        		&#xd;
            	var current = document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value; // + document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value;&#xd;
            	if( !is_valid_zip(current)){&#xd;
            		//alert errors.&#xd;
            		alertErrMsg();&#xd;
            	}else{&#xd;
            		document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
            		var ajax = new Ajax();&#xd;
        			ajax.add(&quot;zipCode&quot; , current);&#xd;
        			ajax.add(&quot;countryId&quot;,countryId);&#xd;
        	        ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);&#xd;
        			ajax.post(&quot; , &quot;'&quot; , &quot;/vbills/mbills/validateZipCode.go?action=getValidateZipCode&amp;forgotType=null&quot; , &quot;'&quot; , &quot; + &quot; , &quot;'&quot; , &quot;&amp;action=getStateTypesByCountry&quot; , &quot;'&quot; , &quot;,zipCodeValidateCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);&#xd;
            	}&#xd;
        	&#xd;
		}&#xd;
		function zipCodeValidateCallback(responseText){&#xd;
			var data = responseText.parseJSON();&#xd;
			if(data!=null &amp;&amp; data !=&quot;&quot;){&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value=data.city;&#xd;
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).style.display=&quot;block&quot;){&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).value=data.state.id;&#xd;
				}else{&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).value = data.state.value;&#xd;
				}&#xd;
			}else{&#xd;
				alertErrMsg();&#xd;
			}&#xd;
		}&#xd;
		function setCityAndStateRequired (val){&#xd;
			if(val == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || val == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
			} &#xd;
			if(val > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; val != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){&#xd;
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;).value == 840){&#xd;
        			document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
        			document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
        		}else{&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;&#xd;
				}&#xd;
			}&#xd;
		}&#xd;
&#xd;
		function rtnValidate(){&#xd;
&#xd;
			var rtnString = document.getElementById(&quot; , &quot;'&quot; , &quot;routingNumber&quot; , &quot;'&quot; , &quot;).value;&#xd;
			var ajax = new Ajax();&#xd;
			ajax.add(&quot;rtnStr&quot; , rtnString);&#xd;
			ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);&#xd;
			ajax.post(&quot; , &quot;'&quot; , &quot;/vbills/mbills/RTNValidate.go?action=rtnValidation&amp;forgotType=null&quot; , &quot;'&quot; , &quot; + &quot; , &quot;'&quot; , &quot;&amp;action=AchRTNValidate&quot; , &quot;'&quot; , &quot;,rtnValidateCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);&#xd;
&#xd;
		}&#xd;
		function rtnValidateCallback(responseText){&#xd;
			var data = responseText.parseJSON();&#xd;
			if(data!=null &amp;&amp; data !=&quot;&quot;){&#xd;
				if(data.message !=null &amp;&amp; data.message){&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;routingError&quot; , &quot;'&quot; , &quot;).innerHTML= data.message;&#xd;
				}else{&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;routingError&quot; , &quot;'&quot; , &quot;).innerHTML= &quot;Invalid Routing Number&quot;;&#xd;
				}&#xd;
			}&#xd;
		}&#xd;
		&#xd;
		function debitCardNumberValidate(cardNumber){&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
            		var ajax = new Ajax();&#xd;
            	    ajax.add(&quot; , &quot;'&quot; , &quot;cn&quot; , &quot;'&quot; , &quot;, cardNumber);&#xd;
            	    ajax.get(PAYMENT_METHOD_INFO_URL_PREFIX + &quot; , &quot;'&quot; , &quot;&amp;action=debitCardNumberValidate&quot; , &quot;'&quot; , &quot;, debitCardNumberValidateCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);  &#xd;
		}&#xd;
		function debitCardNumberValidateCallback(responseText){&#xd;
			var data = responseText.parseJSON();&#xd;
			if(data!=null &amp;&amp; data !=&quot;&quot;){&#xd;
				document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;&#xd;
				var isDebit = data.isDebit;&#xd;
&#xd;
				if(isDebit == &quot; , &quot;'&quot; , &quot;true&quot; , &quot;'&quot; , &quot;){&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;pay_via_debit_credit&quot; , &quot;'&quot; , &quot;).innerHTML=&quot; , &quot;'&quot; , &quot;&lt;table width=&quot;100%&quot; border=&quot;0&quot; cellspacing=&quot;0&quot; cellpadding=&quot;0&quot;>&quot; , &quot;'&quot; , &quot;+&#xd;
		                &quot; , &quot;'&quot; , &quot; &lt;tr>&lt;td class=&quot;strong&quot; width=&quot;40%&quot;>&lt;span >Process As Debit Credit:&lt;/span>&lt;/td>&quot; , &quot;'&quot; , &quot;+&#xd;
		                  &quot; , &quot;'&quot; , &quot; &lt;td width=&quot;60%&quot;>&lt;input type=&quot;radio&quot; name=&quot;payViaDebitCredit&quot; value=&quot;true&quot; />&amp;nbsp;Yes&amp;nbsp;&amp;nbsp;&quot; , &quot;'&quot; , &quot; +&#xd;
		                  &quot; , &quot;'&quot; , &quot; &lt;input type=&quot;radio&quot; name=&quot;payViaDebitCredit&quot; value=&quot;false&quot; checked />No&quot; , &quot;'&quot; , &quot; +&#xd;
	                      &quot; , &quot;'&quot; , &quot;&lt;/td>&quot; , &quot;'&quot; , &quot;+&#xd;
	                 &quot; , &quot;'&quot; , &quot; &lt;/tr>&quot; , &quot;'&quot; , &quot; +&#xd;
	             &quot; , &quot;'&quot; , &quot; &lt;/table>&quot; , &quot;'&quot; , &quot;;&#xd;
				}else{&#xd;
					document.getElementById(&quot; , &quot;'&quot; , &quot;pay_via_debit_credit&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&quot;;&#xd;
				}&#xd;
			}else{&#xd;
				alertErrMsg();&#xd;
			}&#xd;
		}&#xd;
		function openNewWindow(clientAccountNumber,lookupValue1,lookupValue2,lookupValue3){&#xd;
			/*alert(clientAccountNumber.value);&#xd;
			alert(lookupValue1.value);&#xd;
			alert(lookupValue2.value);&#xd;
			alert(lookupValue3.value);*/&#xd;
			&#xd;
			var url = &quot; , &quot;'&quot; , &quot;https://aws.amazon.com&quot; , &quot;'&quot; , &quot;;&#xd;
			window.open(url, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;width=800,height=600&quot; , &quot;'&quot; , &quot;);&#xd;
		}&#xd;
		$(&quot;#addressForm&quot;).show();&#xd;
    		var isHideBillingAddress = false;&#xd;
    		console.log(&quot;cc.getHideBillingAddress() - &quot; + isHideBillingAddress);&#xd;
&#xd;
&#xd;
&#xd;
&lt;!--&#xd;
&#xd;
var currentDay = new Date(); var thisYear =  currentDay.getFullYear(); var nextYear = currentDay.getFullYear() + 1; var dateRange=[thisYear,nextYear];function customInit() {var foo=1;}function dateStatusHandler(date, y, m, d) {    var today = new Date();    var myYesterday=new Date();myYesterday.setDate(today.getDate() - 1);if (date &lt;= myYesterday) {return &quot;special&quot;;} else {return false;}} function customCheckBox(obj, checkboxArray, udfscope) { var foo=1; } function customOnChangeUdf1(obj) { var foo=1; } function customOnChangeUdf2(obj) { var foo=1; } function customOnChangeUdf3(obj) { var foo=1; } function customOnChangeUdf4(obj) { var foo=1; } function customOnChangeUdf5(obj) { var foo=1; } function customOnChangeUdf6(obj) { var foo=1; } function customOnChangeUdf7(obj) { var foo=1; } function customOnChangeUdf8(obj) { var foo=1; } function customOnChangeUdf9(obj) { var foo=1; } function customOnChangeUdf10(obj) { var foo=1; }&#xd;
addOnloadHandler(customInit);&#xd;
//-->&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
    &#xd;
&#xd;
    Available Bill Label&#xd;
    * Indicates required field &#xd;
	&#xd;
	Step 1: Pay Your Bill Label(s) By Checking One or More Checkboxes in the &quot;Check to Pay&quot; Column Below.  &#xd;
	&#xd;
&#xd;
    &#xd;
	&#xd;
	&#xd;
		 One bill found.&#xd;
				 &#xd;
			&#xd;
	    	&#xd;
	    		Display102550 results&#xd;
	    		&#xd;
				&#xd;
					&#xd;
			&#xd;
		&#xd;
	&#xd;
	&#xd;
	&#xd;
	&#xd;
    &#xd;
	&#xd;
    &#xd;
 		   &#xd;
        Select All /&#xd;
        Unselect All |  &#xd;
        Show All /&#xd;
        Hide All &#xd;
     &#xd;
    &#xd;
        &#xd;
            Check to Pay&#xd;
            Bill Label&#xd;
	   		             &#xd;
             &#xd;
	            Due Date &#xd;
	         &#xd;
&#xd;
            Pay Date&#xd;
&#xd;
         &#xd;
	            Amount Due &#xd;
	     &#xd;
&#xd;
            Amount to Pay&#xd;
            &#xd;
            &#xd;
           &#xd;
        &#xd;
&#xd;
        &#xd;
&#xd;
	&#xd;
    &#xd;
    &#xd;
                &#xd;
	&#xd;
&#xd;
&#xd;
&#xd;
               &#xd;
                &#xd;
                    &#xd;
                        &#xd;
                    &#xd;
                   &#xd;
                  &#xd;
 485bills&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
	&#xd;
	    04/01/2026&#xd;
	    &#xd;
	&#xd;
 &#xd;
    &#xd;
&#xd;
               	&#xd;
&#xd;
       		 &#xd;
        		 &#xd;
       		 &#xd;
       &#xd;
&#xd;
         &#xd;
    &#xd;
&#xd;
	&#xd;
	$40.00&#xd;
&#xd;
	&#xd;
	&#xd;
	&#xd;
$&#xd;
&#xd;
&#xd;
&lt;!--&#xd;
if(document.getElementById(&quot;payCheckbox1&quot;) != null){&#xd;
	if(document.getElementById(&quot;payCheckbox1&quot;).checked){&#xd;
	    document.getElementById(&quot;payAmount1&quot;).disabled=false;&#xd;
	}else{&#xd;
	 	document.getElementById(&quot;payAmount1&quot;).disabled=true;&#xd;
	}&#xd;
}&#xd;
//-->&#xd;
&#xd;
                &#xd;
                &#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
    &#xd;
        &#xd;
            &#xd;
                                              &#xd;
                    485UDF3:&#xd;
                &#xd;
                &#xd;
	                &#xd;
	                	udf3 data&#xd;
	                &#xd;
                &#xd;
            &#xd;
        &#xd;
            &#xd;
                                              &#xd;
                     :&#xd;
                &#xd;
                &#xd;
					&#xd;
	                    Select One					&#xd;
								&#xd;
										Orange&#xd;
					&#xd;
				&#xd;
            &#xd;
        &#xd;
        &#xd;
    &#xd;
        &#xd;
    &#xd;
&#xd;
&#xd;
                    &#xd;
            &#xd;
            &#xd;
            &#xd;
            	1 bills selected for payment, totaling &#xd;
            &#xd;
            $&#xd;
                40.00&#xd;
            &#xd;
        &#xd;
    &#xd;
    &#xd;
    checkedNum = 0&#xd;
    &#xd;
    &#xd;
    &#xd;
    &#xd;
    	&#xd;
       Step 2: Enter a Payment Method&#xd;
       &#xd;
        &#xd;
            &#xd;
                &#xd;
                &#xd;
                Payment Type: *&#xd;
                    Select One&#xd;
		              Credit Card&#xd;
Personal Checking&#xd;
Personal Savings&#xd;
Business Checking&#xd;
Check&#xd;
                    &#xd;
                &#xd;
            &#xd;
            &#xd;
                &#xd;
                 &#xd;
                    &#xd;
                    &#xd;
                    &#xd;
                        &#xd;
                            Credit Card Information&#xd;
                            Debit Card Information&#xd;
                            &#xd;
                            Please enter the following information about your credit card.&#xd;
                            &#xd;
                            &#xd;
                                &#xd;
                                    Name Appearing on Card: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                       &#xd;
                                &#xd;
                                    Cards Accepted:&#xd;
                                    &#xd;
                                        &#xd;
													&#xd;
										&#xd;
										           	&#xd;
										&#xd;
																				&#xd;
										&#xd;
                                    &#xd;
                                                          &#xd;
                                &#xd;
                                    Card Number: *&#xd;
                                    &#xd;
                                       &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                        CVV: *&#xd;
                                        &#xd;
                                            &#xd;
                                            &#xd;
                                            &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    Expiration Date: *&#xd;
                                     &#xd;
                                        Month...&#xd;
                                            01&#xd;
                                            02&#xd;
                                            03&#xd;
                                            04&#xd;
                                            05&#xd;
                                            06&#xd;
                                            07&#xd;
                                            08&#xd;
                                            09&#xd;
                                            10&#xd;
                                            11&#xd;
                                            12&#xd;
                                        Year...&#xd;
                                            2024&#xd;
2025&#xd;
2026&#xd;
2027&#xd;
2028&#xd;
2029&#xd;
2030&#xd;
2031&#xd;
2032&#xd;
2033&#xd;
2034&#xd;
2035&#xd;
2036&#xd;
2037&#xd;
2038&#xd;
                                    &#xd;
                                &#xd;
                            &#xd;
                              &#xd;
                        &#xd;
                        &#xd;
                        &#xd;
                            Bank Account Information&#xd;
                            &#xd;
                                &#xd;
                                    Company Name: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    Business Tax ID:&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    Routing Number: *&#xd;
                                    &#xd;
                                        &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    Account Number: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                 &#xd;
                                 &#xd;
                                    Confirm Account Number: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                &#xd;
                            &#xd;
                        &#xd;
                        &#xd;
                        &#xd;
                            &#xd;
                                &#xd;
                                    Billing Address:  &#xd;
                                     &#xd;
                                &#xd;
                                &#xd;
                                    Address Line 1: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                 &#xd;
		                            Address Line 2:   &#xd;
		                            &#xd;
		                                &#xd;
		                            &#xd;
		                        &#xd;
		                         &#xd;
		                        	Country: *&#xd;
										&#xd;
			                        		United States&#xd;
										&#xd;
		                        &#xd;
		                        &#xd;
                                    &#xd;
                                    	ZIP:&#xd;
                                    	*&#xd;
                                    	&#xd;
										&#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                       	-&#xd;
                                        &#xd;
										                                   &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
										City:&#xd;
										*&#xd;
									&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    	State :&#xd;
                                    	&#xd;
                                    		*&#xd;
                                    	&#xd;
                                    	&#xd;
                                    &#xd;
                                        Select One&#xd;
                                            Armed Forces Canada                     &#xd;
Armed Forces Africa                     &#xd;
Armed Forces Middle East                &#xd;
Armed Forces Americas                   &#xd;
Armed Forces Europe                     &#xd;
Alaska                                  &#xd;
Alabama                                 &#xd;
Armed Forces Pacific                    &#xd;
Arkansas                                &#xd;
American Samoa                          &#xd;
Arizona                                 &#xd;
California                              &#xd;
Colorado                                &#xd;
Connecticut                             &#xd;
District of Columbia                    &#xd;
Delaware                                &#xd;
Florida                                 &#xd;
Federated States of Micronesia          &#xd;
Georgia                                 &#xd;
Guam                                    &#xd;
Hawaii                                  &#xd;
Iowa                                    &#xd;
Idaho                                   &#xd;
Illinois                                &#xd;
Indiana                                 &#xd;
Kansas                                  &#xd;
Kentucky                                &#xd;
Louisiana                               &#xd;
Massachusetts                           &#xd;
Maryland                                &#xd;
Maine                                   &#xd;
Marshall Island                         &#xd;
Michigan                                &#xd;
Minnesota                               &#xd;
Missouri                                &#xd;
Northern Mariana Islands                &#xd;
Mississippi                             &#xd;
Montana                                 &#xd;
North Carolina                          &#xd;
North Dakota                            &#xd;
Nebraska                                &#xd;
New Hampshire                           &#xd;
New Jersey                              &#xd;
New Mexico                              &#xd;
Nevada                                  &#xd;
New York                                &#xd;
Ohio                                    &#xd;
Oklahoma                                &#xd;
Oregon                                  &#xd;
Pennsylvania                            &#xd;
Puerto Rico                             &#xd;
Palau                                   &#xd;
Rhode Island                            &#xd;
South Carolina                          &#xd;
South Dakota                            &#xd;
Tennessee                               &#xd;
Texas                                   &#xd;
Utah                                    &#xd;
Virginia                                &#xd;
Virgin Islands                          &#xd;
Vermont                                 &#xd;
Washington                              &#xd;
Wisconsin                               &#xd;
West Virginia                           &#xd;
Wyoming                                 &#xd;
                                        	&#xd;
                                    &#xd;
                                &#xd;
                            &#xd;
                            &#xd;
                          &#xd;
                        &#xd;
                            &#xd;
                                &#xd;
                                    &#xd;
                                     &#xd;
                                     	Receipt Email Address:&#xd;
                                     &#xd;
                                     &#xd;
                                    &#xd;
                                &#xd;
							                                                                          &#xd;
                        &#xd;
                    &#xd;
                    &#xd;
                &#xd;
            &#xd;
        &#xd;
        &#xd;
                        &#xd;
                          &#xd;
	                               ACH Terms &amp;&#xd;
Conditions HTML: &#xd;
                             &#xd;
                           &#xd;
                        &#xd;
       &#xd;
       &#xd;
       CC Terms &amp;&#xd;
 Conditions HTML:&#xd;
        &#xd;
            &#xd;
                &#xd;
                     &#xd;
                    &#xd;
							&#xd;
                        &#xd;
&#xd;
                        &#xd;
                    &#xd;
                &#xd;
            &#xd;
                &#xd;
      &#xd;
   &#xd;
&#xd;
&#xd;
var isHideBillingAddress = false;&#xd;
var aID = 485;&#xd;
console.log(&quot;isHideBillingAddress = &quot;+isHideBillingAddress+&quot; aID = &quot;+aID);&#xd;
		changeCountry(document.getElementById(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;).value);&#xd;
    	function PaymentCleanInput(val){&#xd;
    		if(val != 1 &amp;&amp; val != 2 &amp;&amp; val != 3 &amp;&amp; val != 4 &amp;&amp; val != 5){&#xd;
    			cleanInput(0);&#xd;
    		}&#xd;
    		setCityAndStateRequired(val)&#xd;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.paymentMethodTypeKey&quot; , &quot;'&quot; , &quot;).value=val;	&#xd;
    	}&#xd;
    	&#xd;
    	&#xd;
    	console.log(&quot;cc.isHideBillingAddress()   ------ &quot; + cc.getHideBillingAddress());&#xd;
    	console.log(&quot;applicationConfig.getGuestPaymentsMode().equals(guestPayments)   ------ &quot; + applicationConfig.getGuestPaymentsMode().equals(&quot;guestPayments&quot;));&#xd;
    	$(&quot;#tblBillingAddress&quot;).show();&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
                &#xd;
            &#xd;
            &#xd;
            &#xd;
                &#xd;
                 &#xd;
            &#xd;
            &#xd;
&#xd;
     &#xd;
&#xd;
&#xd;
if (document.getElementsByTagName) {&#xd;
	var formElements = document.getElementsByTagName(&quot;form&quot;);&#xd;
	for (i=0; formElements[i]; i++) {&#xd;
		formElements[i].setAttribute(&quot;autocomplete&quot;,&quot;off&quot;);&#xd;
	}		&#xd;
}&#xd;
&#xd;
&#xd;
        &quot;))]</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.shell</value>
      </entry>
   </selectorCollection>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>308a14e9-0dba-45d6-a1b8-3748e607140d</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>shell</value>
      <webElementGuid>1fc6079b-e372-4d3d-8cf4-f80bd3553877</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>&#xd;
        	&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
var XSRF_UUID_PARAMETER_KEY = 'f4214bec-9a6f-414d-9a9f-84cc386a9100';&#xd;
var WAITING_MESSAGE = &quot;Processing...&quot;;&#xd;
function onchanged(value) {&#xd;
 setLanguageSelectMessage();&#xd;
 var ajax = new Ajax();&#xd;
 ajax.get('/vbills/mbills/languageSelect.go?action=languageSelect&amp;forgotType=null&amp;locale='+value, windowReload, '');&#xd;
 }&#xd;
function windowReload(){&#xd;
  window.location.reload();&#xd;
}&#xd;
function setLanguageSelectMessage() {&#xd;
    var waitingInfoDiv = getWaitingInfoDivControl();&#xd;
    waitingInfoDiv.innerHTML = &quot;&lt;strong>&quot;+WAITING_MESSAGE+&quot;&lt;\/strong>&quot; ;&#xd;
}&#xd;
function getWaitingInfoDivControl() {&#xd;
    return document.getElementById('waitingInfoDiv');&#xd;
}&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
            &#xd;
&#xd;
&#xd;
     &#xd;
&#xd;
&#xd;
            &#xd;
&#xd;
 &#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
  &#xd;
  &#xd;
   &#xd;
   &#xd;
&#xd;
&#xd;
   &#xd;
&#xd;
&#xd;
   &#xd;
&#xd;
&#xd;
function toURL(url){&#xd;
	var obj = document.getElementById(&quot;toURLForm&quot;);&#xd;
	obj.action = url;&#xd;
	obj.submit();&#xd;
}&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
            &#xd;
                &#xd;
                    &#xd;
                     &#xd;
                    &#xd;
                    &#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&lt;!--&#xd;
td.totalMessage{font-size:110%;}&#xd;
th.obvious{background:#b2b2b2;}&#xd;
.dis{color:gray;}&#xd;
&#xd;
.bulb a:link {&#xd;
    color: #f4f3f3;&#xd;
    text-decoration: none;&#xd;
    background-color: #f4f3f3;&#xd;
}&#xd;
.bulb a:active {&#xd;
    color: #f4f3f3;&#xd;
    text-decoration: none;&#xd;
    background-color: #f4f3f3;&#xd;
}&#xd;
.bulb a:hover {&#xd;
    color: #f4f3f3;&#xd;
    text-decoration: none;&#xd;
    background-color: #f4f3f3;&#xd;
}&#xd;
.bulb a:visited {&#xd;
    color: #f4f3f3;&#xd;
    text-decoration: none;&#xd;
    background-color: #f4f3f3;&#xd;
}&#xd;
h2{&#xd;
    color: #000000;&#xd;
    font-size: 11px;&#xd;
    font-weight: bold;&#xd;
    margin: 10px 0;&#xd;
    padding: 5px 0 0 5px;&#xd;
    width: 100%;&#xd;
}&#xd;
-->&#xd;
&#xd;
&#xd;
    &#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&lt;!--&#xd;
var INITIAL_INDEX = 1;&#xd;
 var checkedNum = 0;&#xd;
function getElementsByPrefix(prefix) {&#xd;
	var element = null;&#xd;
	var i = INITIAL_INDEX;&#xd;
	var array = new Array();&#xd;
	while ((element = document.getElementById(prefix + i)) != null) {&#xd;
		array[i] = element;&#xd;
		i = i + 1;&#xd;
	}&#xd;
	return array;&#xd;
}&#xd;
&#xd;
function getElementsByPrefixByCount(prefix, count) {&#xd;
	var element = null;&#xd;
	var array = new Array();&#xd;
	for (var i = INITIAL_INDEX; i &lt; count; i++) {&#xd;
		element = document.getElementById(prefix + i)&#xd;
		array[i] = element;&#xd;
	}&#xd;
	return array;&#xd;
}&#xd;
&#xd;
function showHideElements(spanArray, targetArray, distargetArray, checkboxArray, showFlag) {&#xd;
	var i = INITIAL_INDEX;&#xd;
	/* if(spanArray.length != targetArray.length) {&#xd;
		return;&#xd;
	} */&#xd;
    for(var j=INITIAL_INDEX;j&lt;=targetArray.length;j++){&#xd;
    	 if (targetArray[j] != null) {&#xd;
		        if (showFlag) {&#xd;
		        	targetArray[j].style.display = 'block';&#xd;
		        	if(spanArray[j] != null){&#xd;
		        		spanArray[j].innerHTML = contractsymbol;&#xd;
		        	}&#xd;
		        } else {&#xd;
		        	targetArray[j].style.display = 'none';&#xd;
		        	if(spanArray[j] != null){&#xd;
		        		spanArray[j].innerHTML = expandsymbol;&#xd;
		        	}&#xd;
		        }&#xd;
		    }&#xd;
    }&#xd;
}&#xd;
&#xd;
function checkUncheckBoxes(array, checkFlag) {&#xd;
	var alltags=document.all? document.all : document.getElementsByTagName(&quot;*&quot;);&#xd;
	var statecollects=getElementbyClass(alltags, &quot;showstate&quot;);&#xd;
	var i = INITIAL_INDEX;&#xd;
	while (array[i] != null) {&#xd;
	    if (array[i]) {&#xd;
	    	var formNum = i-1;&#xd;
	        if (checkFlag) {&#xd;
	            if(array[i].checked == false){&#xd;
	        		array[i].checked = true;&#xd;
	        		setPayAmountFromAmountDue(amountDueArray[i], payAmountArray[i], payAmountSpanArray[i]);&#xd;
	        	}&#xd;
	        	&#xd;
	        	if(document.getElementById('udf' + i) != null){&#xd;
	        		document.getElementById('udf' + i).style.color=&quot;black&quot;;&#xd;
				    document.getElementById('udf' + i).style.display=&quot;block&quot;;&#xd;
				}&#xd;
	        	&#xd;
	        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){&#xd;
	        		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'select-one'){&#xd;
	        			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = false;&#xd;
	   	    	 }else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'text'){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }	    &#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'select-one'){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'text'){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'select-one'){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'text'){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'select-one'){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'text'){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color = &quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){&#xd;
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'select-one'){&#xd;
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = false;&#xd;
	   	    	 }else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'text'){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){&#xd;
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'select-one'){&#xd;
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'text'){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}    	    	&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){&#xd;
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'select-one'){&#xd;
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = false;&#xd;
	   	    	 }else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'text'){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'select-one'){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'text'){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}&#xd;
	   	    }&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){&#xd;
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'select-one'){&#xd;
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = false;&#xd;
	   	    	 }else{&#xd;
	   	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'text'){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;black&quot;;&#xd;
	   	    		}&#xd;
	   	    	}&#xd;
	   	    }	&#xd;
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){&#xd;
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'select-one'){&#xd;
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = false;&#xd;
	   	    	}else{&#xd;
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'text'){&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = false;&#xd;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;black&quot;;&#xd;
		   	    	}&#xd;
	   	    	}	    	    	&#xd;
	   	    }&#xd;
				if(document.getElementById('tr' + i) != null){&#xd;
			    	document.getElementById('tr' + i).style.color=&quot;black&quot;;&#xd;
			    }&#xd;
			    if(document.getElementById('payAmount' + i) != null){&#xd;
				    document.getElementById('payAmount' + i).disabled=false;&#xd;
				}&#xd;
				if(document.getElementById('payDate' + i) != null){&#xd;
			    	document.getElementById('payDate' + i).disabled=false;&#xd;
			    }&#xd;
			    if(document.getElementById(&quot;c_payDate&quot; + i) != null){&#xd;
			    	document.getElementById(&quot;c_payDate&quot; + i).style.display=&quot;block&quot;;&#xd;
			    }&#xd;
			    if(document.getElementById(&quot;disc_payDate&quot; + i) != null){&#xd;
					document.getElementById(&quot;disc_payDate&quot; + i).style.display=&quot;none&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;time&quot; + i) != null){&#xd;
					document.getElementById(&quot;time&quot; + i).style.display=&quot;block&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;distime&quot; + i) != null){&#xd;
					document.getElementById(&quot;distime&quot; + i).style.display=&quot;none&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;arrow&quot; + i) != null){&#xd;
					document.getElementById(&quot;arrow&quot; + i).src=&quot;/vbills/_assets/img/b.gif&quot;;&#xd;
				}&#xd;
&#xd;
				if(billDetailSpanArray[i] != null){&#xd;
					billDetailSpanArray[i].innerHTML='&lt;img src=&quot;/vbills/_assets/img/minus.gif&quot; align=&quot;absmiddle&quot; alt=&quot;Collapse bill details&quot;>';&#xd;
				}&#xd;
	        } else {&#xd;
	            if(array[i].checked){&#xd;
		        	array[i].checked = false;&#xd;
		        	setPayAmountToZero(payAmountArray[i],payAmountSpanArray[i]);&#xd;
	        	}&#xd;
	        	&#xd;
		        if(document.getElementById('udf' + i) != null){&#xd;
			    	document.getElementById('udf' + i).style.color=&quot;gray&quot;;&#xd;
			    }&#xd;
		        if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){&#xd;
					 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'select-one'){&#xd;
						 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = true;&#xd;
			    	 }else{&#xd;
			        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'text'){&#xd;
			        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = true;&#xd;
			        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;gray&quot;;&#xd;
				    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    &#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'select-one'){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'text'){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'select-one'){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'text'){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					        }&#xd;
				        }&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'select-one'){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'text'){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}			    	&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'select-one'){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = true;&#xd;
				    	 }else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'text'){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'select-one'){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'text'){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'select-one'){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = true;&#xd;
				    	 }else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'text'){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'select-one'){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'text'){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){&#xd;
				    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'select-one'){&#xd;
				    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = true;&#xd;
				    	 }else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'text'){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){&#xd;
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'select-one'){&#xd;
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = true;&#xd;
				    	}else{&#xd;
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'text'){&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = true;&#xd;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;gray&quot;;&#xd;
					    	}&#xd;
				    	}&#xd;
				    }&#xd;
			    if(document.getElementById('tr' + i) != null){&#xd;
		        	document.getElementById('tr' + i).style.color=&quot;gray&quot;;&#xd;
		        }&#xd;
		        if(document.getElementById('payAmount' + i) != null){&#xd;
		   	    	document.getElementById('payAmount' + i).disabled=true;&#xd;
		   	    }&#xd;
		   	    if(document.getElementById('payDate' + i) != null){&#xd;
		   	    	document.getElementById('payDate' + i).disabled=true;&#xd;
		   	    }&#xd;
		   	    if(document.getElementById(&quot;c_payDate&quot; + i) != null){&#xd;
		   	    	document.getElementById(&quot;c_payDate&quot; + i).style.display=&quot;none&quot;;&#xd;
		   	    }&#xd;
		   	    if(document.getElementById(&quot;disc_payDate&quot; + i) != null){&#xd;
					document.getElementById(&quot;disc_payDate&quot; + i).style.display=&quot;block&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;time&quot; + i) != null){&#xd;
					document.getElementById(&quot;time&quot; + i).style.display=&quot;none&quot;;&#xd;
				}&#xd;
				if(document.getElementById(&quot;distime&quot; + i) != null){&#xd;
					document.getElementById(&quot;distime&quot; + i).style.display=&quot;block&quot;;	&#xd;
				}&#xd;
				if(document.getElementById(&quot;arrow&quot; + i) != null){&#xd;
					document.getElementById(&quot;arrow&quot; + i).src=&quot;/vbills/_assets/img/a.gif&quot;;&#xd;
				}&#xd;
				&#xd;
	        }&#xd;
	    }&#xd;
    	i = i + 1;&#xd;
	}&#xd;
	updateTotal();&#xd;
}&#xd;
//checkbox&#xd;
function populatePayAmount(element, amountDueId, payAmountId, spanPayAmountId) {&#xd;
	if (element.checked) {&#xd;
		setPayAmountFromAmountDue(document.getElementById(amountDueId), document.getElementById(payAmountId), document.getElementById(spanPayAmountId));&#xd;
	} else {&#xd;
		setPayAmountToZero(document.getElementById(payAmountId), document.getElementById(spanPayAmountId));&#xd;
	}&#xd;
	updateTotal();&#xd;
}&#xd;
function populatePayAmount(element, amountDueId, payAmountId, spanPayAmountId, udfs, countValue) {&#xd;
    var formNum = countValue - 1;&#xd;
	var trId = 'tr' + countValue;&#xd;
	var alltags=document.all? document.all : document.getElementsByTagName(&quot;*&quot;);&#xd;
	var statecollects=getElementbyClass(alltags, &quot;showstate&quot;);&#xd;
	var pictureObj = document.getElementById(&quot;arrow&quot; + countValue);&#xd;
	if (pictureObj.src.indexOf('/vbills/_assets/img/a.gif') > -1) {	  &#xd;
	    document.getElementById('payCheckbox' + countValue).checked = true;&#xd;
	    &#xd;
	    if(document.getElementById(udfs) != null){&#xd;
		    document.getElementById(udfs).style.display=&quot;block&quot;;&#xd;
		    document.getElementById(udfs).style.color=&quot;black&quot;;&#xd;
		}&#xd;
&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'select-one'){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'text'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }	    &#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'select-one'){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'text'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'select-one'){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'text'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'select-one'){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'text'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color = &quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){&#xd;
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'select-one'){&#xd;
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = false;&#xd;
	    	 }else{&#xd;
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'text'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'select-one'){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'text'){&#xd;
	    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = false;&#xd;
	    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;black&quot;;&#xd;
	    		}&#xd;
	    	}	    	    	&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){&#xd;
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'select-one'){&#xd;
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = false;&#xd;
	    	 }else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'text'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'select-one'){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'text'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){&#xd;
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'select-one'){&#xd;
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = false;&#xd;
	    	 }else{&#xd;
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'text'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}&#xd;
	    }	&#xd;
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){&#xd;
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'select-one'){&#xd;
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = false;&#xd;
	    	}else{&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'text'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = false;&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;black&quot;;&#xd;
		    	}&#xd;
	    	}	    	    	&#xd;
	    }&#xd;
	    if(document.getElementById(trId) != null){&#xd;
		    document.getElementById(trId).style.color=&quot;black&quot;;&#xd;
        }&#xd;
        if(document.getElementById(payAmountId) != null)	   {&#xd;
           document.getElementById(payAmountId).disabled=false;&#xd;
        }   &#xd;
	    if( document.getElementById('payDate' + countValue) != null){&#xd;
	    	document.getElementById('payDate' + countValue).disabled=false;&#xd;
	    }	   &#xd;
	    	    &#xd;
	 		&#xd;
		if(document.getElementById(&quot;time&quot; + countValue) != null){		&#xd;
			document.getElementById(&quot;time&quot; + countValue).style.display=&quot;block&quot;;&#xd;
		}				&#xd;
		if(document.getElementById(&quot;distime&quot; + countValue) != null){&#xd;
			document.getElementById(&quot;distime&quot; + countValue).style.display=&quot;none&quot;;&#xd;
		}		&#xd;
		if(document.getElementById(&quot;arrow&quot; + countValue)!=null){&#xd;
			document.getElementById(&quot;arrow&quot; + countValue).src=&quot;/vbills/_assets/img/b.gif&quot;;&#xd;
		}&#xd;
		setPayAmountFromAmountDue(document.getElementById(amountDueId), document.getElementById(payAmountId), document.getElementById(spanPayAmountId));	&#xd;
	} else {&#xd;
		document.getElementById('payCheckbox' + countValue).checked = false;&#xd;
		&#xd;
		if(document.getElementById(udfs)){&#xd;
		    document.getElementById(udfs).style.color=&quot;gray&quot;;&#xd;
		}&#xd;
		 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){&#xd;
			 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'select-one'){&#xd;
				 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = true;&#xd;
	    	 }else{&#xd;
	        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'text'){&#xd;
	        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = true;&#xd;
	        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;gray&quot;;&#xd;
		    	}&#xd;
		    }&#xd;
		   }&#xd;
		    &#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'select-one'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'text'){&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = true;&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;gray&quot;;&#xd;
		    		}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'select-one'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'text'){&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = true;&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;gray&quot;;&#xd;
		       		}&#xd;
		        }&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'select-one'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'text'){&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = true;&#xd;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color=&quot;gray&quot;;&#xd;
		    		}&#xd;
		    	}		    	&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'select-one'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = true;&#xd;
		    	 }else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'text'){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'select-one'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'text'){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'select-one'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = true;&#xd;
		    	 }else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'text'){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'select-one'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'text'){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){&#xd;
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'select-one'){&#xd;
		    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = true;&#xd;
		    	 }else{&#xd;
			    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'text'){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){&#xd;
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'select-one'){&#xd;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = true;&#xd;
		    	}else{&#xd;
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'text'){&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = true;&#xd;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;gray&quot;;&#xd;
			    	}&#xd;
		    	}&#xd;
		    }&#xd;
	    &#xd;
		if(document.getElementById(trId)){&#xd;
	        document.getElementById(trId).style.color=&quot;gray&quot;;&#xd;
	    }&#xd;
	    if(document.getElementById(payAmountId)){&#xd;
   	    	document.getElementById(payAmountId).disabled=true;&#xd;
   	    }&#xd;
   	    if( document.getElementById('payDate' + countValue) != null){&#xd;
   	    	document.getElementById('payDate' + countValue).disabled=true;&#xd;
   	    }&#xd;
   	   &#xd;
		if(document.getElementById(&quot;time&quot; + countValue) != null){&#xd;
			document.getElementById(&quot;time&quot; + countValue).style.display=&quot;none&quot;;&#xd;
		}&#xd;
		if(document.getElementById(&quot;distime&quot; + countValue)!=null){&#xd;
			document.getElementById(&quot;distime&quot; + countValue).style.display=&quot;block&quot;;&#xd;
		}&#xd;
		if(document.getElementById(&quot;arrow&quot; + countValue) != null){&#xd;
			document.getElementById(&quot;arrow&quot; + countValue).src=&quot;/vbills/_assets/img/a.gif&quot;;&#xd;
		}&#xd;
		setPayAmountToZero(document.getElementById(payAmountId), document.getElementById(spanPayAmountId));&#xd;
	}&#xd;
	if(billDetailSpanArray[countValue] != null){&#xd;
		billDetailSpanArray[countValue].innerHTML='&lt;img src=&quot;/vbills/_assets/img/minus.gif&quot; align=&quot;absmiddle&quot; alt=&quot;Collapse bill details&quot;>'&#xd;
	}&#xd;
	updateTotal();&#xd;
&#xd;
}&#xd;
function setPayAmountFromAmountDue(amountDue, payAmount, spanPayAmount) {&#xd;
	payAmount.value = amountDue.value;&#xd;
	if (spanPayAmount != null) {&#xd;
		spanPayAmount.innerHTML = payAmount.value;&#xd;
	}&#xd;
	checkedNum++;&#xd;
}&#xd;
&#xd;
function setPayAmountToZero(payAmount, spanPayAmount) {&#xd;
	payAmount.value = &quot;0.00&quot;;&#xd;
	if (spanPayAmount != null) {&#xd;
		spanPayAmount.innerHTML = payAmount.value;&#xd;
	}&#xd;
	checkedNum--;&#xd;
}&#xd;
&#xd;
function formatMoney(money) {&#xd;
	var index = money.indexOf('.');&#xd;
	var len = money.length;&#xd;
	if (index == -1) {&#xd;
		return money + &quot;.00&quot;;&#xd;
	} else if (len - index == 2) {&#xd;
		return money + &quot;0&quot;;s&#xd;
	}&#xd;
	return money;&#xd;
}&#xd;
&#xd;
function truncateMoneyValue(moneyValue) {&#xd;
	var moneyValue = moneyValue.replace(/,/g, &quot;&quot;);&#xd;
	var index = moneyValue.indexOf('.');&#xd;
	if (index > -1) {&#xd;
		var len = moneyValue.length;&#xd;
		if(index &lt; len - 3) {&#xd;
			moneyValue = moneyValue.substring(0, index + 3);&#xd;
		}&#xd;
	}&#xd;
	return moneyValue;&#xd;
}&#xd;
&#xd;
function resetCheckbox(inputField, payCheckboxId,zeroAccepted, amountDueId, consolidateBills) {          &#xd;
	setTimeout(&quot;timeoutResetCheckbox('&quot; + inputField.id + &quot;', '&quot; + payCheckboxId + &quot;','&quot; + zeroAccepted + &quot;','&quot; + amountDueId + &quot;','&quot; + consolidateBills + &quot;');&quot;, 1);&#xd;
}&#xd;
&#xd;
function timeoutResetCheckbox(inputFieldId, payCheckboxId, zeroAccepted, amountDueId, consolidateBills) {&#xd;
	var inputField = document.getElementById(inputFieldId);&#xd;
	var moneyValue = truncateMoneyValue(inputField.value);&#xd;
	var floatValue = parseFloat(moneyValue);&#xd;
	var amountDue = document.getElementById(amountDueId);&#xd;
	var amountDueValue = truncateMoneyValue(amountDue.value);&#xd;
	var floatAmountDueValue = parseFloat(amountDueValue);&#xd;
	&#xd;
	if (isNaN(floatValue)) {&#xd;
		inputField.value = &quot;0.00&quot;&#xd;
		document.getElementById(payCheckboxId).checked = false;&#xd;
		return;&#xd;
	}&#xd;
	inputField.value = formatMoney(floatValue.toString());&#xd;
	updateTotal();&#xd;
}&#xd;
&#xd;
var TOTAL_TO_PAY = 'totalToPay';&#xd;
var SPAN_TOTAL_TO_PAY = 'spanTotalToPay';&#xd;
var SAVE_PAYMENT_CHECKBOX_TR = 'savePaymentCheckboxTr';&#xd;
var STORE_PAYMENT_METHOD_CHKBOX_ID = 'storePaymentMethod';&#xd;
var SAVE_NICKNAME_TR = 'saveNickNameTr';&#xd;
var NUM_TOTAL_TO_PAY = 'numTotalToPay';&#xd;
&#xd;
var checkboxArray = null;&#xd;
var divArray = null;&#xd;
var billDetailSpanArray = null;&#xd;
var payAmountArray = null;&#xd;
var payAmountSpanArray = null;&#xd;
var amountDueArray = null;&#xd;
&#xd;
&#xd;
function initVariables() {&#xd;
	checkboxArray = getElementsByPrefix('payCheckbox');&#xd;
	divArray = getElementsByPrefixByCount('udf', checkboxArray.length);&#xd;
	disdivArray = getElementsByPrefix('disudf');&#xd;
	billDetailSpanArray = getElementsByPrefixByCount('billDetailsSpan', checkboxArray.length);&#xd;
	payAmountArray = getElementsByPrefix('payAmount');&#xd;
	payAmountSpanArray = getElementsByPrefixByCount('spanPayAmount', payAmountArray.length);&#xd;
	amountDueArray = getElementsByPrefix('amountDue');	&#xd;
}&#xd;
&#xd;
var BILL_PAYMENT_DERIVED_URL_PREFIX = '/vbills/mbills/billPaymentDerivedField.go?&amp;forgotType=null';&#xd;
&#xd;
function outputComma(num) {&#xd;
    num = '' + num;&#xd;
    var number = num;&#xd;
	var decimalPart = '';&#xd;
    if (num.indexOf(&quot;.&quot;)!=-1) {&#xd;
	  number = num.substring(0,num.indexOf(&quot;.&quot;));&#xd;
	  decimalPart = num.substring(num.indexOf(&quot;.&quot;) , num.length);&#xd;
	}&#xd;
    if (number.length > 3) {&#xd;
        var mod = number.length%3;&#xd;
        var output = (mod > 0 ? (number.substring(0,mod)) : '');&#xd;
        for (i=0 ; i &lt; Math.floor(number.length/3) ; i++) {&#xd;
            if ((mod ==0) &amp;&amp; (i ==0))&#xd;
                output+= number.substring(mod+3*i,mod+3*i+3);&#xd;
            else&#xd;
                output+= ',' + number.substring(mod+3*i,mod+3*i+3);&#xd;
        }&#xd;
        return (output)+decimalPart;&#xd;
    }&#xd;
    else return number+decimalPart;&#xd;
}&#xd;
&#xd;
function updateTotal() {&#xd;
	var amountArray = new Array();	&#xd;
	var total=0;&#xd;
	for (var i = INITIAL_INDEX; i &lt; payAmountArray.length; i++) {&#xd;
	    if(payAmountArray[i].value == &quot;&quot;){&#xd;
	    	payAmountArray[i].value = &quot;0.00&quot;;&#xd;
	    }&#xd;
		amountArray.push(payAmountArray[i].value);&#xd;
		total += parseFloat(payAmountArray[i].value.replace(',',''));	&#xd;
&#xd;
	} &#xd;
    document.getElementById(NUM_TOTAL_TO_PAY).innerHTML = checkedNum;&#xd;
	document.getElementById(TOTAL_TO_PAY).value = outputComma(total.toFixed(2));&#xd;
	document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = outputComma(total.toFixed(2));&#xd;
	 &#xd;
}&#xd;
&#xd;
function getTotalAmountCalculatedCallback(responseText) {&#xd;
	var total = handleAjaxResponse(responseText);&#xd;
	document.getElementById(TOTAL_TO_PAY).value = total;&#xd;
	document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = total;&#xd;
}&#xd;
&#xd;
function handleAjaxResponse(responseText) {&#xd;
	enableDisableButtons(true);&#xd;
    var responseArray = eval(responseText);&#xd;
    if (responseArray[0] == true) {&#xd;
       return responseArray[1];&#xd;
    } else {&#xd;
    	return responseArray[1];&#xd;
    }   &#xd;
}&#xd;
&#xd;
function setCalculatingValueMessage(element) {&#xd;
	enableDisableButtons(false);&#xd;
	element.innerHTML = 'Calculating ...';&#xd;
//    span.className = '';&#xd;
}&#xd;
&#xd;
function enableDisableButtons(isEnable) {&#xd;
	document.getElementById('nextButton').enabled = isEnable;&#xd;
}&#xd;
&#xd;
var LABEL_SUFFIX = ' &lt;span class=&quot;requiredField&quot;>*&lt;\/span>';&#xd;
&#xd;
function setLabel(id, label, isRequred) {&#xd;
    if(isRequred) {&#xd;
            document.getElementById(id).innerHTML = label + LABEL_SUFFIX;&#xd;
    } else {&#xd;
            document.getElementById(id).innerHTML = label;&#xd;
    }&#xd;
}&#xd;
&#xd;
PAYMENT_METHOD_SELECTBOX_ID = 'selectedPaymentMethod';&#xd;
PAYMENT_METHOD_INFO_URL_PREFIX = '/vbills/mbills/paymentMethodInfo.go?&amp;forgotType=null';&#xd;
PAYMENT_METHOD_INFO_DIV_ID = 'paymentMethodInfoDiv';&#xd;
PAYMENT_METHOD_TYPE_FORM_DIV_ID = 'paymentMethodTypeFormDiv';&#xd;
&#xd;
function toggle() {&#xd;
	if(area > '1' &amp;&amp; area != '5'){&#xd;
		document.getElementById('pay_via_debit_credit').innerHTML=&quot;&quot;;&#xd;
	}&#xd;
    var area = safeGetInputValue(PAYMENT_METHOD_SELECTBOX_ID);&#xd;
    if(area != null &amp;&amp; area != ''){&#xd;
	    if(area.indexOf(&quot;_&quot;)  >0 ){&#xd;
	    	hideShowElementFrfx(PAYMENT_METHOD_TYPE_FORM_DIV_ID, false);&#xd;
	    	hideShowElementFrfx(SAVE_PAYMENT_CHECKBOX_TR, false);&#xd;
	    	var str = area.split(&quot;_&quot;);&#xd;
	    	var arean = &quot;name_&quot; + str[str.length-1];&#xd;
	    	displayPaymentMethodInfo(arean);&#xd;
	    } else {&#xd;
	    	hideShowElementFrfx(PAYMENT_METHOD_INFO_DIV_ID, false);&#xd;
	    	hideShowElementFrfx(PAYMENT_METHOD_TYPE_FORM_DIV_ID, true);&#xd;
	    	hideShowElementFrfx(SAVE_PAYMENT_CHECKBOX_TR, true);&#xd;
	    	if(area=='1' || area == '5'){&#xd;
	    	hideShowElementFrfx('check_accCondition',false);&#xd;
	    //	hideShowElementFrfx('achTermsAndConditionsMessage',false);&#xd;
	    	hideShowElementFrfx('ccTermsAndConditionsMessage',true);&#xd;
	    	}else{&#xd;
	    	hideShowElementFrfx('check_accCondition',false);&#xd;
	    //	hideShowElementFrfx('achTermsAndConditionsMessage',false);&#xd;
	    	hideShowElementFrfx('ccTermsAndConditionsMessage',false);&#xd;
	    	}&#xd;
			hideShowElementFrfx('area_creditCard', (area == '1' || area == '5'));&#xd;
			hideShowElementFrfx('creditCardInfo',area == '1');&#xd;
			hideShowElementFrfx('debitCardInfo',area == '5');&#xd;
			hideShowElementFrfx('area_achPayment', (area > '1' &amp;&amp; area != '5'));&#xd;
			hideShowElementFrfx('addressForm', true);&#xd;
		    if (area > '1' &amp;&amp; area != '5') {&#xd;
		    hideShowElementFrfx('check_accCondition', true);&#xd;
		//    hideShowElementFrfx('achTermsAndConditionsMessage',true);&#xd;
	    	hideShowElementFrfx('ccTermsAndConditionsMessage',false);&#xd;
		    	hideShowElementFrfx('bankInfo1', area == '4');&#xd;
		    	hideShowElementFrfx('bankInfo2', area == '4');&#xd;
		    	hideShowElementFrfx('personalRoutingGif', area == '2' || area == '3');&#xd;
		    	hideShowElementFrfx('businessRoutingGif', area == '4');                &#xd;
		        setLabel('bankInfo3', '&lt;span id=&quot;paymentMethod.firstName&quot;>First Name:&lt;/span>', area == '2' || area == '3');&#xd;
		        setLabel('bankInfo4', '&lt;span id=&quot;paymentMethod.lastName&quot;>Last Name:&lt;/span>', area == '2' || area == '3');&#xd;
		    }&#xd;
	    }&#xd;
    }&#xd;
}&#xd;
&#xd;
function togglePaymentMethodType() {&#xd;
  	toggle();&#xd;
    if(document.getElementById(SPAN_TOTAL_TO_PAY) != null &amp;&amp; document.getElementById(TOTAL_TO_PAY) != null){&#xd;
		document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = document.getElementById(TOTAL_TO_PAY).value;&#xd;
    }&#xd;
}&#xd;
&#xd;
function toggleSaveNickNameTr() {&#xd;
	hideShowElementFrfx(SAVE_NICKNAME_TR, document.getElementById(STORE_PAYMENT_METHOD_CHKBOX_ID).checked);&#xd;
}&#xd;
&#xd;
function schedulePayment(index) {&#xd;
    document.getElementById('schedulePaymentForBillIndex').value = index;&#xd;
    submitForm('billListForm', '/vbills/mbills/billList.go?action=schedulePayment&amp;forgotType=null','You have already submitted this form');&#xd;
}&#xd;
&#xd;
//========= Saved Payment Information Ajax Call&#xd;
&#xd;
function displayPaymentMethodInfo(selectedId) {&#xd;
    if (selectedId == &quot;&quot;) {&#xd;
        return;&#xd;
    }&#xd;
    disableElementById(PAYMENT_METHOD_SELECTBOX_ID);&#xd;
    setWaitingMessageOnInfoDiv();&#xd;
    var ajax = new Ajax();&#xd;
    ajax.add('id', selectedId);&#xd;
    ajax.add('uuid', XSRF_UUID_PARAMETER_KEY);&#xd;
    ajax.post(PAYMENT_METHOD_INFO_URL_PREFIX + '&amp;action=getInfo', paymentMethodInfoCallback, '');  &#xd;
}&#xd;
&#xd;
function paymentMethodInfoCallback(responseText) {&#xd;
    var pmiDiv = getPmiDivControl();&#xd;
    pmiDiv.innerHTML = responseText;&#xd;
	hideShowElementFrfx(PAYMENT_METHOD_INFO_DIV_ID, true);&#xd;
    enableElementById(PAYMENT_METHOD_SELECTBOX_ID);&#xd;
    if(document.getElementById(&quot;paymentMethodTypeId&quot;) != null){&#xd;
	    var paymentMethodTypeIdValue = document.getElementById(&quot;paymentMethodTypeId&quot;).value;&#xd;
	    if(paymentMethodTypeIdValue == &quot;1&quot; || paymentMethodTypeIdValue == &quot;5&quot; ){&#xd;
	   		document.getElementById(&quot;check_accCondition&quot;).style.display=&quot;none&quot;;&#xd;
	   	//	document.getElementById(&quot;achTermsAndConditionsMessage&quot;).style.display=&quot;none&quot;;&#xd;
	   		document.getElementById(&quot;ccTermsAndConditionsMessage&quot;).style.display=&quot;block&quot;;&#xd;
	    }else{&#xd;
	    	document.getElementById(&quot;check_accCondition&quot;).style.display=&quot;block&quot;;&#xd;
	  //  	document.getElementById(&quot;achTermsAndConditionsMessage&quot;).style.display=&quot;block&quot;;&#xd;
	   		document.getElementById(&quot;ccTermsAndConditionsMessage&quot;).style.display=&quot;none&quot;;&#xd;
	    }&#xd;
    }&#xd;
}&#xd;
&#xd;
function setWaitingMessageOnInfoDiv() {&#xd;
    var pmiDiv = getPmiDivControl();&#xd;
    pmiDiv.innerHTML = '&lt;br/>&lt;strong>Retrieving Information ...&lt;/strong>';&#xd;
}&#xd;
&#xd;
function getPmiDivControl() {&#xd;
    return document.getElementById(PAYMENT_METHOD_INFO_DIV_ID);&#xd;
}&#xd;
 &#xd;
addOnloadHandler(togglePaymentMethodType);&#xd;
//addOnloadHandler(toggleSaveNickNameTr);&#xd;
addOnloadHandler(initVariables);&#xd;
setFieldsThatNeedToBeClearedBetweenPageFlow(['paymentMethodForm.cardAccountNumber', 'paymentMethodForm.bankAccountNumber', 'paymentMethodForm.cvv']);&#xd;
//-->&#xd;
&#xd;
function PendingBillsSearch(){&#xd;
	var pageResultNum = document.getElementById(&quot;pageSize&quot;).value;&#xd;
	var url=&quot;/vbills/mbills/billList.go?action=navigateForGuestPay&amp;forgotType=null&amp;pageNumber=1&amp;pageSize=&quot;+pageResultNum;&#xd;
	var obj = document.getElementById(&quot;pagingForm&quot;);&#xd;
	obj.action = url;&#xd;
	obj.submit();	&#xd;
}&#xd;
&#xd;
function wsug(e, str){ &#xd;
 var oThis = arguments.callee;&#xd;
 if(!str) {&#xd;
  oThis.sug.style.visibility = 'hidden';&#xd;
  document.onmousemove = null;&#xd;
  document.getElementById(&quot;helpIMG&quot;).src=&quot;/vbills/_assets/img/help3.gif&quot;;&#xd;
  return;&#xd;
 }  &#xd;
 if(!oThis.sug){  &#xd;
  var div = document.createElement('div'), css = 'top:0; left:0; position:absolute; z-index:100; visibility:hidden';&#xd;
   div.style.cssText = css;&#xd;
   div.setAttribute('style',css);&#xd;
  var sug = document.createElement('div'), css= 'font:normal 12px/16px; white-space:nowrap; color:#666; padding:3px; position:absolute; left:0; top:0; z-index:10; background:#f9fdfd; border:1px solid #0aa';&#xd;
   sug.style.cssText = css;&#xd;
   sug.setAttribute('style',css);&#xd;
  var dr = document.createElement('div'), css = 'position:absolute; top:3px; left:3px; background:#333; filter:alpha(opacity=50); opacity:0.5; z-index:9';&#xd;
   dr.style.cssText = css;&#xd;
   dr.setAttribute('style',css);&#xd;
  var ifr = document.createElement('iframe'), css='position:absolute; left:0; top:0; z-index:8; filter:alpha(opacity=0); opacity:0';&#xd;
   ifr.style.cssText = css;&#xd;
   ifr.setAttribute('style',css);&#xd;
  div.appendChild(ifr);&#xd;
  div.appendChild(dr);&#xd;
  div.appendChild(sug);&#xd;
  div.sug = sug;&#xd;
  document.body.appendChild(div);&#xd;
  oThis.sug = div;&#xd;
  oThis.dr = dr;&#xd;
  oThis.ifr = ifr;&#xd;
  div = dr = ifr = sug = null;&#xd;
 }&#xd;
 document.getElementById(&quot;helpIMG&quot;).src=&quot;/vbills/_assets/img/help.gif&quot;;&#xd;
 var e = e || window.event, obj = oThis.sug, dr = oThis.dr, ifr = oThis.ifr;&#xd;
 obj.sug.innerHTML = str;&#xd;
 &#xd;
 var w = obj.sug.offsetWidth, h = obj.sug.offsetHeight, dw = document.documentElement.clientWidth||document.body.clientWidth; dh = document.documentElement.clientHeight || document.body.clientHeight;&#xd;
 var st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;&#xd;
 var left = e.clientX +sl +17 + w &lt; dw + sl  &amp;&amp;  e.clientX + sl + 15 || e.clientX +sl-8 - w, top = e.clientY + st +17 + h &lt; dh + st  &amp;&amp;  e.clientY + st + 17 || e.clientY + st - 5 - h;&#xd;
 obj.style.left = left+ 10 + 'px';&#xd;
 obj.style.top = top + 10 + 'px';&#xd;
 dr.style.width = w + 'px';&#xd;
 dr.style.height = h + 'px';&#xd;
 ifr.style.width = w + 3 + 'px';&#xd;
 ifr.style.height = h + 3 + 'px';&#xd;
 obj.style.visibility = 'visible';&#xd;
 document.onmousemove = function(e){&#xd;
  var e = e || window.event, st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;&#xd;
  var left = e.clientX +sl +17 + w &lt; dw + sl  &amp;&amp;  e.clientX + sl + 15 || e.clientX +sl-8 - w, top = e.clientY + st +17 + h &lt; dh + st  &amp;&amp;  e.clientY + st + 17 || e.clientY + st - 5 - h;&#xd;
  obj.style.left = left + 'px';&#xd;
  obj.style.top = top + 'px';&#xd;
 }&#xd;
}&#xd;
function instruction(e, str){ &#xd;
var oThis = arguments.callee;&#xd;
 if(!str) {&#xd;
  oThis.sug.style.visibility = 'hidden';&#xd;
  return;&#xd;
 }  &#xd;
&#xd;
 if(!oThis.sug){  &#xd;
  var div = document.createElement('div'), css = 'position:fixed; z-index:100; visibility:visibiled; width:220px;';&#xd;
   div.style.cssText = css;&#xd;
   div.setAttribute('style',css);&#xd;
  var sug = document.createElement('div'), css= 'font:normal 12px/16px; color:#666; padding:3px; position:fixed; z-index:10; background:#f9fdfd; border:1px solid #0aa; width:220px;';&#xd;
   sug.style.cssText = css;&#xd;
   sug.setAttribute('style',css);&#xd;
  var dr = document.createElement('div'), css = 'position:fixed; background:#333; filter:alpha(opacity=50); opacity:0.5; z-index:9; width:220px;';&#xd;
   dr.style.cssText = css;&#xd;
   dr.setAttribute('style',css);&#xd;
  var ifr = document.createElement('iframe'), css='position:fixed; z-index:8; filter:alpha(opacity=0); opacity:0; width:220px;';&#xd;
   ifr.style.cssText = css;&#xd;
   ifr.setAttribute('style',css);&#xd;
  div.appendChild(ifr);&#xd;
  div.appendChild(dr);&#xd;
  div.appendChild(sug);&#xd;
  div.sug = sug;&#xd;
  document.body.appendChild(div);&#xd;
  oThis.sug = div;&#xd;
  oThis.dr = dr;&#xd;
  oThis.ifr = ifr;&#xd;
  div = dr = ifr = sug = null;&#xd;
 }&#xd;
&#xd;
 var e = e , obj = oThis.sug, dr = oThis.dr, ifr = oThis.ifr;&#xd;
 var pos = findPosition(e);&#xd;
 obj.sug.innerHTML = str;&#xd;
 &#xd;
 var w = obj.sug.offsetWidth, h = obj.sug.offsetHeight, dw = document.documentElement.clientWidth||document.body.clientWidth; dh = document.documentElement.clientHeight || document.body.clientHeight;&#xd;
 var st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;&#xd;
 var left = pos[0] +sl +17 + w &lt; dw + sl  &amp;&amp;  pos[0] + sl + 15 || pos[0] +sl-8 - w, top = pos[1] + st + h &lt; dh + st  &amp;&amp;  pos[1] + st || pos[1] + st - 5 - h; obj.style.left = left+ 10 + 'px';&#xd;
 obj.style.top = top + 'px';&#xd;
 var left0 = left - w - 50;&#xd;
 obj.style.left = left0 + 'px';&#xd;
 dr.style.width = w + 'px';&#xd;
 dr.style.height = h + 'px';&#xd;
 dr.style.top = top + 3 + 'px';&#xd;
 dr.style.left = left0 + 3 + 'px';&#xd;
 ifr.style.width = w + 3 + 'px';&#xd;
 ifr.style.height = h + 3 + 'px';&#xd;
 obj.style.visibility = 'visible';&#xd;
&#xd;
}&#xd;
&#xd;
function findPosition( oElement ) &#xd;
{&#xd;
  var x2 = 0;&#xd;
  var y2 = 0;&#xd;
  var width = oElement.offsetWidth;&#xd;
  var height = oElement.offsetHeight;&#xd;
  if( typeof( oElement.offsetParent ) != 'undefined' ) &#xd;
  {&#xd;
    for( var posX = 0, posY = 0; oElement; oElement = oElement.offsetParent ) &#xd;
    {&#xd;
      posX += oElement.offsetLeft;&#xd;
      posY += oElement.offsetTop;      &#xd;
    }&#xd;
    x2 = posX + width;&#xd;
    y2 = posY + height;&#xd;
    return [ posX, posY ,x2, y2];&#xd;
    &#xd;
    } else{&#xd;
      x2 = oElement.x + width;&#xd;
      y2 = oElement.y + height;&#xd;
      return [ oElement.x, oElement.y, x2, y2];&#xd;
  }&#xd;
}&#xd;
		function getStateList(countryId){&#xd;
			var ajax = new Ajax();&#xd;
			ajax.add('countryId', countryId);&#xd;
			ajax.add('uuid', XSRF_UUID_PARAMETER_KEY);			&#xd;
			ajax.get('/vbills/mbills/stateInfo.go?action=getStateTypesByCountry&amp;forgotType=null' + '&amp;action=getStateTypesByCountry', stateTypeByCountryCallback, '');&#xd;
		}&#xd;
		function stateTypeByCountryCallback(responseText){&#xd;
			var datalist = responseText.parseJSON();&#xd;
			document.getElementById('address.state').innerHTML= datalist.stateLabel;&#xd;
			document.getElementById('address.stateLabel').value= datalist.stateLabel;&#xd;
			document.getElementById('address.zipCode').innerHTML= datalist.zipLabel;&#xd;
			document.getElementById('address.zipLabel').value=datalist.zipLabelKey;&#xd;
			if(datalist.stateList.length>0){&#xd;
				showStateSelect();&#xd;
				document.getElementById('state').innerHTML=&quot;&quot;;&#xd;
				for(var i=0;i&lt;datalist.stateList.length;i++){&#xd;
					var option = document.createElement(&quot;option&quot;);&#xd;
					var rs =  datalist.stateList[i];&#xd;
					option.value = rs.id;&#xd;
                    option.innerHTML = rs.value;&#xd;
                    document.getElementById('state').appendChild(option);           &#xd;
				}&#xd;
			}else{&#xd;
				hideStateSelect();&#xd;
			}&#xd;
		}&#xd;
        &#xd;
       &#xd;
        function changeCountry(val){&#xd;
        	if(val != 840){&#xd;
        		hideZipCodeSplit();&#xd;
        		&#xd;
        	}else{&#xd;
        		showZipCodeSplit();&#xd;
        	}&#xd;
			var paymentMethodType = document.getElementById('selectedPaymentMethod').value;&#xd;
        	if(65 > 1){        		&#xd;
		 		showStateSelect();&#xd;
		 	}else{		 		&#xd;
		 		hideStateSelect();&#xd;
		 	}&#xd;
&#xd;
			if(paymentMethodType == '1' || paymentMethodType == '5'){&#xd;
				document.getElementById('stateRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
				document.getElementById('cityRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
			} &#xd;
			if(paymentMethodType > '1' &amp;&amp; paymentMethodType != '5'){&#xd;
				if(val == 840){&#xd;
        			document.getElementById('stateRequired').innerHTML=&quot;*&quot;;&#xd;
        			document.getElementById('cityRequired').innerHTML=&quot;*&quot;;&#xd;
        		}else{&#xd;
					document.getElementById('stateRequired').innerHTML=&quot;*&quot;;&#xd;
					document.getElementById('cityRequired').innerHTML=&quot;*&quot;;&#xd;
				}&#xd;
			}	&#xd;
        }&#xd;
        function showStateSelect(){&#xd;
        	document.getElementById('state').style.display=&quot;&quot;;&#xd;
       		document.getElementById('state').setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.state&quot;);&#xd;
       		document.getElementById('input_state').style.display=&quot;none&quot;;&#xd;
       		document.getElementById('input_state').setAttribute(&quot;name&quot;, &quot;&quot;);&#xd;
        }&#xd;
        function hideStateSelect(){&#xd;
        	document.getElementById('state').style.display=&quot;none&quot;;&#xd;
       		document.getElementById('state').setAttribute(&quot;name&quot;, &quot;&quot;);&#xd;
       		document.getElementById('input_state').style.display=&quot;&quot;;&#xd;
       		document.getElementById('input_state').setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.stateCode&quot;);&#xd;
        }&#xd;
        function cleanInput(val){&#xd;
			var paymentMethodType = document.getElementById('selectedPaymentMethod').value;&#xd;
&#xd;
			if(paymentMethodType == '1' || paymentMethodType == '5'){&#xd;
				if(840 == val){&#xd;
					document.getElementById('billingAddressForm.city').value = &quot;&quot;;&#xd;
					document.getElementById('billingAddressForm.zipCode').value = &quot;&quot;;&#xd;
					document.getElementById('billingAddressForm.zipCodeExt').value = &quot;&quot;;&#xd;
					document.getElementById('stateRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
					document.getElementById('cityRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
				}else{&#xd;
					document.getElementById('billingAddressForm.city').value = &quot;&quot;;&#xd;
					document.getElementById('billingAddressForm.zipCode').value = &quot;&quot;;&#xd;
					document.getElementById('billingAddressForm.zipCodeExt').value = &quot;&quot;;&#xd;
					document.getElementById('input_state').value = &quot;&quot;;&#xd;
					document.getElementById('stateRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
					document.getElementById('cityRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
				}&#xd;
			}&#xd;
			if(paymentMethodType > '1' &amp;&amp; paymentMethodType != '5'){&#xd;
				if(840 == val){&#xd;
					document.getElementById('billingAddressForm.city').value = &quot;&quot;;&#xd;
					document.getElementById('billingAddressForm.zipCode').value = &quot;&quot;;&#xd;
					document.getElementById('billingAddressForm.zipCodeExt').value = &quot;&quot;;&#xd;
					document.getElementById('stateRequired').innerHTML=&quot;*&quot;;&#xd;
					document.getElementById('cityRequired').innerHTML=&quot;*&quot;;&#xd;
				}else{&#xd;
					document.getElementById('billingAddressForm.city').value = &quot;&quot;;&#xd;
					document.getElementById('billingAddressForm.zipCode').value = &quot;&quot;;&#xd;
					document.getElementById('billingAddressForm.zipCodeExt').value = &quot;&quot;;&#xd;
					document.getElementById('input_state').value = &quot;&quot;;&#xd;
					document.getElementById('stateRequired').innerHTML=&quot;*&quot;;&#xd;
					document.getElementById('cityRequired').innerHTML=&quot;*&quot;;&#xd;
				}&#xd;
					&#xd;
			}	&#xd;
        }&#xd;
        &#xd;
        function showZipCodeSplit(){&#xd;
        	document.getElementById('billingAddressForm.zipCode').style.display=&quot;&quot;;&#xd;
       		document.getElementById('billingAddressForm.zipCode').setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.zipCode&quot;);&#xd;
        	document.getElementById('billingAddressForm.zipCodeExt').style.display=&quot;&quot;;&#xd;
        	document.getElementById('zipSplit').style.display=&quot;&quot;;&#xd;
       		document.getElementById('billingAddressForm.zipCode_input').style.display=&quot;none&quot;;&#xd;
       		document.getElementById('billingAddressForm.zipCode_input').setAttribute(&quot;name&quot;, &quot;&quot;);&#xd;
        }&#xd;
        function hideZipCodeSplit(){&#xd;
        	document.getElementById('billingAddressForm.zipCode').style.display=&quot;none&quot;;&#xd;
       		document.getElementById('billingAddressForm.zipCode').setAttribute(&quot;name&quot;, &quot;&quot;);&#xd;
        	document.getElementById('billingAddressForm.zipCodeExt').style.display=&quot;none&quot;;&#xd;
        	document.getElementById('zipSplit').style.display=&quot;none&quot;;&#xd;
       		document.getElementById('billingAddressForm.zipCode_input').style.display=&quot;&quot;;&#xd;
       		document.getElementById('billingAddressForm.zipCode_input').setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.zipCode&quot;);&#xd;
        }&#xd;
        &#xd;
        function linkageStateAndCountry(val){&#xd;
        	if(val != 840){&#xd;
        		hideZipCodeSplit();&#xd;
        		&#xd;
        	}else{&#xd;
        		showZipCodeSplit();&#xd;
        	}&#xd;
	        cleanInput(val);&#xd;
	        getStateList(val);&#xd;
        }&#xd;
        function is_valid_zip(zip) {&#xd;
			var re = /^\d{5}(\d{4})?$/;&#xd;
			return re.test(zip);&#xd;
		}&#xd;
        function alertErrMsg(){&#xd;
				//document.getElementById('errors').innerHTML=&quot;&lt;ul>&lt;li>ZIP_Code is not valid.&lt;/li>&lt;/ul>&quot;;&#xd;
        		//document.getElementById('errors').style.display=&quot;block&quot;;        	&#xd;
        }&#xd;
        function zipCodeValidate(){&#xd;
        	var countryId = document.getElementById('countryId').value;&#xd;
        	&#xd;
        		&#xd;
            	var current = document.getElementById('billingAddressForm.zipCode').value; // + document.getElementById('billingAddressForm.zipCodeExt').value;&#xd;
            	if( !is_valid_zip(current)){&#xd;
            		//alert errors.&#xd;
            		alertErrMsg();&#xd;
            	}else{&#xd;
            		document.getElementById('errors').style.display=&quot;none&quot;;&#xd;
            		var ajax = new Ajax();&#xd;
        			ajax.add(&quot;zipCode&quot; , current);&#xd;
        			ajax.add(&quot;countryId&quot;,countryId);&#xd;
        	        ajax.add('uuid', XSRF_UUID_PARAMETER_KEY);&#xd;
        			ajax.post('/vbills/mbills/validateZipCode.go?action=getValidateZipCode&amp;forgotType=null' + '&amp;action=getStateTypesByCountry',zipCodeValidateCallback, '');&#xd;
            	}&#xd;
        	&#xd;
		}&#xd;
		function zipCodeValidateCallback(responseText){&#xd;
			var data = responseText.parseJSON();&#xd;
			if(data!=null &amp;&amp; data !=&quot;&quot;){&#xd;
				document.getElementById('errors').style.display=&quot;none&quot;;&#xd;
				document.getElementById('billingAddressForm.city').value=data.city;&#xd;
				if(document.getElementById('state').style.display=&quot;block&quot;){&#xd;
					document.getElementById('state').value=data.state.id;&#xd;
				}else{&#xd;
					document.getElementById('input_state').value = data.state.value;&#xd;
				}&#xd;
			}else{&#xd;
				alertErrMsg();&#xd;
			}&#xd;
		}&#xd;
		function setCityAndStateRequired (val){&#xd;
			if(val == '1' || val == '5'){&#xd;
				document.getElementById('stateRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
				document.getElementById('cityRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;&#xd;
			} &#xd;
			if(val > '1' &amp;&amp; val != '5'){&#xd;
				if(document.getElementById('countryId').value == 840){&#xd;
        			document.getElementById('stateRequired').innerHTML=&quot;*&quot;;&#xd;
        			document.getElementById('cityRequired').innerHTML=&quot;*&quot;;&#xd;
        		}else{&#xd;
					document.getElementById('stateRequired').innerHTML=&quot;*&quot;;&#xd;
					document.getElementById('cityRequired').innerHTML=&quot;*&quot;;&#xd;
				}&#xd;
			}&#xd;
		}&#xd;
&#xd;
		function rtnValidate(){&#xd;
&#xd;
			var rtnString = document.getElementById('routingNumber').value;&#xd;
			var ajax = new Ajax();&#xd;
			ajax.add(&quot;rtnStr&quot; , rtnString);&#xd;
			ajax.add('uuid', XSRF_UUID_PARAMETER_KEY);&#xd;
			ajax.post('/vbills/mbills/RTNValidate.go?action=rtnValidation&amp;forgotType=null' + '&amp;action=AchRTNValidate',rtnValidateCallback, '');&#xd;
&#xd;
		}&#xd;
		function rtnValidateCallback(responseText){&#xd;
			var data = responseText.parseJSON();&#xd;
			if(data!=null &amp;&amp; data !=&quot;&quot;){&#xd;
				if(data.message !=null &amp;&amp; data.message){&#xd;
					document.getElementById('routingError').innerHTML= data.message;&#xd;
				}else{&#xd;
					document.getElementById('routingError').innerHTML= &quot;Invalid Routing Number&quot;;&#xd;
				}&#xd;
			}&#xd;
		}&#xd;
		&#xd;
		function debitCardNumberValidate(cardNumber){&#xd;
					document.getElementById('errors').style.display=&quot;none&quot;;&#xd;
            		var ajax = new Ajax();&#xd;
            	    ajax.add('cn', cardNumber);&#xd;
            	    ajax.get(PAYMENT_METHOD_INFO_URL_PREFIX + '&amp;action=debitCardNumberValidate', debitCardNumberValidateCallback, '');  &#xd;
		}&#xd;
		function debitCardNumberValidateCallback(responseText){&#xd;
			var data = responseText.parseJSON();&#xd;
			if(data!=null &amp;&amp; data !=&quot;&quot;){&#xd;
				document.getElementById('errors').style.display=&quot;none&quot;;&#xd;
				var isDebit = data.isDebit;&#xd;
&#xd;
				if(isDebit == 'true'){&#xd;
					document.getElementById('pay_via_debit_credit').innerHTML='&lt;table width=&quot;100%&quot; border=&quot;0&quot; cellspacing=&quot;0&quot; cellpadding=&quot;0&quot;>'+&#xd;
		                ' &lt;tr>&lt;td class=&quot;strong&quot; width=&quot;40%&quot;>&lt;span >Process As Debit Credit:&lt;/span>&lt;/td>'+&#xd;
		                  ' &lt;td width=&quot;60%&quot;>&lt;input type=&quot;radio&quot; name=&quot;payViaDebitCredit&quot; value=&quot;true&quot; />&amp;nbsp;Yes&amp;nbsp;&amp;nbsp;' +&#xd;
		                  ' &lt;input type=&quot;radio&quot; name=&quot;payViaDebitCredit&quot; value=&quot;false&quot; checked />No' +&#xd;
	                      '&lt;/td>'+&#xd;
	                 ' &lt;/tr>' +&#xd;
	             ' &lt;/table>';&#xd;
				}else{&#xd;
					document.getElementById('pay_via_debit_credit').innerHTML=&quot;&quot;;&#xd;
				}&#xd;
			}else{&#xd;
				alertErrMsg();&#xd;
			}&#xd;
		}&#xd;
		function openNewWindow(clientAccountNumber,lookupValue1,lookupValue2,lookupValue3){&#xd;
			/*alert(clientAccountNumber.value);&#xd;
			alert(lookupValue1.value);&#xd;
			alert(lookupValue2.value);&#xd;
			alert(lookupValue3.value);*/&#xd;
			&#xd;
			var url = 'https://aws.amazon.com';&#xd;
			window.open(url, '', 'width=800,height=600');&#xd;
		}&#xd;
		$(&quot;#addressForm&quot;).show();&#xd;
    		var isHideBillingAddress = false;&#xd;
    		console.log(&quot;cc.getHideBillingAddress() - &quot; + isHideBillingAddress);&#xd;
&#xd;
&#xd;
&#xd;
&lt;!--&#xd;
&#xd;
var currentDay = new Date(); var thisYear =  currentDay.getFullYear(); var nextYear = currentDay.getFullYear() + 1; var dateRange=[thisYear,nextYear];function customInit() {var foo=1;}function dateStatusHandler(date, y, m, d) {    var today = new Date();    var myYesterday=new Date();myYesterday.setDate(today.getDate() - 1);if (date &lt;= myYesterday) {return &quot;special&quot;;} else {return false;}} function customCheckBox(obj, checkboxArray, udfscope) { var foo=1; } function customOnChangeUdf1(obj) { var foo=1; } function customOnChangeUdf2(obj) { var foo=1; } function customOnChangeUdf3(obj) { var foo=1; } function customOnChangeUdf4(obj) { var foo=1; } function customOnChangeUdf5(obj) { var foo=1; } function customOnChangeUdf6(obj) { var foo=1; } function customOnChangeUdf7(obj) { var foo=1; } function customOnChangeUdf8(obj) { var foo=1; } function customOnChangeUdf9(obj) { var foo=1; } function customOnChangeUdf10(obj) { var foo=1; }&#xd;
addOnloadHandler(customInit);&#xd;
//-->&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
    &#xd;
&#xd;
    Available Bill Label&#xd;
    * Indicates required field &#xd;
	&#xd;
	Step 1: Pay Your Bill Label(s) By Checking One or More Checkboxes in the &quot;Check to Pay&quot; Column Below.  &#xd;
	&#xd;
&#xd;
    &#xd;
	&#xd;
	&#xd;
		 One bill found.&#xd;
				 &#xd;
			&#xd;
	    	&#xd;
	    		Display102550 results&#xd;
	    		&#xd;
				&#xd;
					&#xd;
			&#xd;
		&#xd;
	&#xd;
	&#xd;
	&#xd;
	&#xd;
    &#xd;
	&#xd;
    &#xd;
 		   &#xd;
        Select All /&#xd;
        Unselect All |  &#xd;
        Show All /&#xd;
        Hide All &#xd;
     &#xd;
    &#xd;
        &#xd;
            Check to Pay&#xd;
            Bill Label&#xd;
	   		             &#xd;
             &#xd;
	            Due Date &#xd;
	         &#xd;
&#xd;
            Pay Date&#xd;
&#xd;
         &#xd;
	            Amount Due &#xd;
	     &#xd;
&#xd;
            Amount to Pay&#xd;
            &#xd;
            &#xd;
           &#xd;
        &#xd;
&#xd;
        &#xd;
&#xd;
	&#xd;
    &#xd;
    &#xd;
                &#xd;
	&#xd;
&#xd;
&#xd;
&#xd;
               &#xd;
                &#xd;
                    &#xd;
                        &#xd;
                    &#xd;
                   &#xd;
                  &#xd;
 485bills&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
	&#xd;
	    04/01/2026&#xd;
	    &#xd;
	&#xd;
 &#xd;
    &#xd;
&#xd;
               	&#xd;
&#xd;
       		 &#xd;
        		 &#xd;
       		 &#xd;
       &#xd;
&#xd;
         &#xd;
    &#xd;
&#xd;
	&#xd;
	$40.00&#xd;
&#xd;
	&#xd;
	&#xd;
	&#xd;
$&#xd;
&#xd;
&#xd;
&lt;!--&#xd;
if(document.getElementById(&quot;payCheckbox1&quot;) != null){&#xd;
	if(document.getElementById(&quot;payCheckbox1&quot;).checked){&#xd;
	    document.getElementById(&quot;payAmount1&quot;).disabled=false;&#xd;
	}else{&#xd;
	 	document.getElementById(&quot;payAmount1&quot;).disabled=true;&#xd;
	}&#xd;
}&#xd;
//-->&#xd;
&#xd;
                &#xd;
                &#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
    &#xd;
        &#xd;
            &#xd;
                                              &#xd;
                    485UDF3:&#xd;
                &#xd;
                &#xd;
	                &#xd;
	                	udf3 data&#xd;
	                &#xd;
                &#xd;
            &#xd;
        &#xd;
            &#xd;
                                              &#xd;
                     :&#xd;
                &#xd;
                &#xd;
					&#xd;
	                    Select One					&#xd;
								&#xd;
										Orange&#xd;
					&#xd;
				&#xd;
            &#xd;
        &#xd;
        &#xd;
    &#xd;
        &#xd;
    &#xd;
&#xd;
&#xd;
                    &#xd;
            &#xd;
            &#xd;
            &#xd;
            	1 bills selected for payment, totaling &#xd;
            &#xd;
            $&#xd;
                40.00&#xd;
            &#xd;
        &#xd;
    &#xd;
    &#xd;
    checkedNum = 0&#xd;
    &#xd;
    &#xd;
    &#xd;
    &#xd;
    	&#xd;
       Step 2: Enter a Payment Method&#xd;
       &#xd;
        &#xd;
            &#xd;
                &#xd;
                &#xd;
                Payment Type: *&#xd;
                    Select One&#xd;
		              Credit Card&#xd;
Personal Checking&#xd;
Personal Savings&#xd;
Business Checking&#xd;
Check&#xd;
                    &#xd;
                &#xd;
            &#xd;
            &#xd;
                &#xd;
                 &#xd;
                    &#xd;
                    &#xd;
                    &#xd;
                        &#xd;
                            Credit Card Information&#xd;
                            Debit Card Information&#xd;
                            &#xd;
                            Please enter the following information about your credit card.&#xd;
                            &#xd;
                            &#xd;
                                &#xd;
                                    Name Appearing on Card: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                       &#xd;
                                &#xd;
                                    Cards Accepted:&#xd;
                                    &#xd;
                                        &#xd;
													&#xd;
										&#xd;
										           	&#xd;
										&#xd;
																				&#xd;
										&#xd;
                                    &#xd;
                                                          &#xd;
                                &#xd;
                                    Card Number: *&#xd;
                                    &#xd;
                                       &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                        CVV: *&#xd;
                                        &#xd;
                                            &#xd;
                                            &#xd;
                                            &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    Expiration Date: *&#xd;
                                     &#xd;
                                        Month...&#xd;
                                            01&#xd;
                                            02&#xd;
                                            03&#xd;
                                            04&#xd;
                                            05&#xd;
                                            06&#xd;
                                            07&#xd;
                                            08&#xd;
                                            09&#xd;
                                            10&#xd;
                                            11&#xd;
                                            12&#xd;
                                        Year...&#xd;
                                            2024&#xd;
2025&#xd;
2026&#xd;
2027&#xd;
2028&#xd;
2029&#xd;
2030&#xd;
2031&#xd;
2032&#xd;
2033&#xd;
2034&#xd;
2035&#xd;
2036&#xd;
2037&#xd;
2038&#xd;
                                    &#xd;
                                &#xd;
                            &#xd;
                              &#xd;
                        &#xd;
                        &#xd;
                        &#xd;
                            Bank Account Information&#xd;
                            &#xd;
                                &#xd;
                                    Company Name: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    Business Tax ID:&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    Routing Number: *&#xd;
                                    &#xd;
                                        &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    Account Number: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                 &#xd;
                                 &#xd;
                                    Confirm Account Number: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                &#xd;
                            &#xd;
                        &#xd;
                        &#xd;
                        &#xd;
                            &#xd;
                                &#xd;
                                    Billing Address:  &#xd;
                                     &#xd;
                                &#xd;
                                &#xd;
                                    Address Line 1: *&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                 &#xd;
		                            Address Line 2:   &#xd;
		                            &#xd;
		                                &#xd;
		                            &#xd;
		                        &#xd;
		                         &#xd;
		                        	Country: *&#xd;
										&#xd;
			                        		United States&#xd;
										&#xd;
		                        &#xd;
		                        &#xd;
                                    &#xd;
                                    	ZIP:&#xd;
                                    	*&#xd;
                                    	&#xd;
										&#xd;
                                    &#xd;
                                    &#xd;
                                        &#xd;
                                       	-&#xd;
                                        &#xd;
										                                   &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
										City:&#xd;
										*&#xd;
									&#xd;
                                    &#xd;
                                        &#xd;
                                    &#xd;
                                &#xd;
                                &#xd;
                                    &#xd;
                                    	State :&#xd;
                                    	&#xd;
                                    		*&#xd;
                                    	&#xd;
                                    	&#xd;
                                    &#xd;
                                        Select One&#xd;
                                            Armed Forces Canada                     &#xd;
Armed Forces Africa                     &#xd;
Armed Forces Middle East                &#xd;
Armed Forces Americas                   &#xd;
Armed Forces Europe                     &#xd;
Alaska                                  &#xd;
Alabama                                 &#xd;
Armed Forces Pacific                    &#xd;
Arkansas                                &#xd;
American Samoa                          &#xd;
Arizona                                 &#xd;
California                              &#xd;
Colorado                                &#xd;
Connecticut                             &#xd;
District of Columbia                    &#xd;
Delaware                                &#xd;
Florida                                 &#xd;
Federated States of Micronesia          &#xd;
Georgia                                 &#xd;
Guam                                    &#xd;
Hawaii                                  &#xd;
Iowa                                    &#xd;
Idaho                                   &#xd;
Illinois                                &#xd;
Indiana                                 &#xd;
Kansas                                  &#xd;
Kentucky                                &#xd;
Louisiana                               &#xd;
Massachusetts                           &#xd;
Maryland                                &#xd;
Maine                                   &#xd;
Marshall Island                         &#xd;
Michigan                                &#xd;
Minnesota                               &#xd;
Missouri                                &#xd;
Northern Mariana Islands                &#xd;
Mississippi                             &#xd;
Montana                                 &#xd;
North Carolina                          &#xd;
North Dakota                            &#xd;
Nebraska                                &#xd;
New Hampshire                           &#xd;
New Jersey                              &#xd;
New Mexico                              &#xd;
Nevada                                  &#xd;
New York                                &#xd;
Ohio                                    &#xd;
Oklahoma                                &#xd;
Oregon                                  &#xd;
Pennsylvania                            &#xd;
Puerto Rico                             &#xd;
Palau                                   &#xd;
Rhode Island                            &#xd;
South Carolina                          &#xd;
South Dakota                            &#xd;
Tennessee                               &#xd;
Texas                                   &#xd;
Utah                                    &#xd;
Virginia                                &#xd;
Virgin Islands                          &#xd;
Vermont                                 &#xd;
Washington                              &#xd;
Wisconsin                               &#xd;
West Virginia                           &#xd;
Wyoming                                 &#xd;
                                        	&#xd;
                                    &#xd;
                                &#xd;
                            &#xd;
                            &#xd;
                          &#xd;
                        &#xd;
                            &#xd;
                                &#xd;
                                    &#xd;
                                     &#xd;
                                     	Receipt Email Address:&#xd;
                                     &#xd;
                                     &#xd;
                                    &#xd;
                                &#xd;
							                                                                          &#xd;
                        &#xd;
                    &#xd;
                    &#xd;
                &#xd;
            &#xd;
        &#xd;
        &#xd;
                        &#xd;
                          &#xd;
	                               ACH Terms &amp;&#xd;
Conditions HTML: &#xd;
                             &#xd;
                           &#xd;
                        &#xd;
       &#xd;
       &#xd;
       CC Terms &amp;&#xd;
 Conditions HTML:&#xd;
        &#xd;
            &#xd;
                &#xd;
                     &#xd;
                    &#xd;
							&#xd;
                        &#xd;
&#xd;
                        &#xd;
                    &#xd;
                &#xd;
            &#xd;
                &#xd;
      &#xd;
   &#xd;
&#xd;
&#xd;
var isHideBillingAddress = false;&#xd;
var aID = 485;&#xd;
console.log(&quot;isHideBillingAddress = &quot;+isHideBillingAddress+&quot; aID = &quot;+aID);&#xd;
		changeCountry(document.getElementById('countryId').value);&#xd;
    	function PaymentCleanInput(val){&#xd;
    		if(val != 1 &amp;&amp; val != 2 &amp;&amp; val != 3 &amp;&amp; val != 4 &amp;&amp; val != 5){&#xd;
    			cleanInput(0);&#xd;
    		}&#xd;
    		setCityAndStateRequired(val)&#xd;
			document.getElementById('address.paymentMethodTypeKey').value=val;	&#xd;
    	}&#xd;
    	&#xd;
    	&#xd;
    	console.log(&quot;cc.isHideBillingAddress()   ------ &quot; + cc.getHideBillingAddress());&#xd;
    	console.log(&quot;applicationConfig.getGuestPaymentsMode().equals(guestPayments)   ------ &quot; + applicationConfig.getGuestPaymentsMode().equals(&quot;guestPayments&quot;));&#xd;
    	$(&quot;#tblBillingAddress&quot;).show();&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
&#xd;
                &#xd;
            &#xd;
            &#xd;
            &#xd;
                &#xd;
                 &#xd;
            &#xd;
            &#xd;
&#xd;
     &#xd;
&#xd;
&#xd;
if (document.getElementsByTagName) {&#xd;
	var formElements = document.getElementsByTagName(&quot;form&quot;);&#xd;
	for (i=0; formElements[i]; i++) {&#xd;
		formElements[i].setAttribute(&quot;autocomplete&quot;,&quot;off&quot;);&#xd;
	}		&#xd;
}&#xd;
&#xd;
&#xd;
        </value>
      <webElementGuid>f94936b4-aa56-4df4-b85c-67795d06cd6b</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]/div[@class=&quot;shell&quot;]</value>
      <webElementGuid>1539e633-19dd-4aaf-bddf-860a87f0ef12</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div</value>
      <webElementGuid>eb0a6138-420a-4f53-88c4-773e06246582</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = concat(&quot;
        	












var XSRF_UUID_PARAMETER_KEY = &quot; , &quot;'&quot; , &quot;f4214bec-9a6f-414d-9a9f-84cc386a9100&quot; , &quot;'&quot; , &quot;;
var WAITING_MESSAGE = &quot;Processing...&quot;;
function onchanged(value) {
 setLanguageSelectMessage();
 var ajax = new Ajax();
 ajax.get(&quot; , &quot;'&quot; , &quot;/vbills/mbills/languageSelect.go?action=languageSelect&amp;forgotType=null&amp;locale=&quot; , &quot;'&quot; , &quot;+value, windowReload, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
 }
function windowReload(){
  window.location.reload();
}
function setLanguageSelectMessage() {
    var waitingInfoDiv = getWaitingInfoDivControl();
    waitingInfoDiv.innerHTML = &quot;&lt;strong>&quot;+WAITING_MESSAGE+&quot;&lt;\/strong>&quot; ;
}
function getWaitingInfoDivControl() {
    return document.getElementById(&quot; , &quot;'&quot; , &quot;waitingInfoDiv&quot; , &quot;'&quot; , &quot;);
}














            


     


            

 





  
  
   
   


   


   


function toURL(url){
	var obj = document.getElementById(&quot;toURLForm&quot;);
	obj.action = url;
	obj.submit();
}




            
                
                    
                     
                    
                    









&lt;!--
td.totalMessage{font-size:110%;}
th.obvious{background:#b2b2b2;}
.dis{color:gray;}

.bulb a:link {
    color: #f4f3f3;
    text-decoration: none;
    background-color: #f4f3f3;
}
.bulb a:active {
    color: #f4f3f3;
    text-decoration: none;
    background-color: #f4f3f3;
}
.bulb a:hover {
    color: #f4f3f3;
    text-decoration: none;
    background-color: #f4f3f3;
}
.bulb a:visited {
    color: #f4f3f3;
    text-decoration: none;
    background-color: #f4f3f3;
}
h2{
    color: #000000;
    font-size: 11px;
    font-weight: bold;
    margin: 10px 0;
    padding: 5px 0 0 5px;
    width: 100%;
}
-->


    











&lt;!--
var INITIAL_INDEX = 1;
 var checkedNum = 0;
function getElementsByPrefix(prefix) {
	var element = null;
	var i = INITIAL_INDEX;
	var array = new Array();
	while ((element = document.getElementById(prefix + i)) != null) {
		array[i] = element;
		i = i + 1;
	}
	return array;
}

function getElementsByPrefixByCount(prefix, count) {
	var element = null;
	var array = new Array();
	for (var i = INITIAL_INDEX; i &lt; count; i++) {
		element = document.getElementById(prefix + i)
		array[i] = element;
	}
	return array;
}

function showHideElements(spanArray, targetArray, distargetArray, checkboxArray, showFlag) {
	var i = INITIAL_INDEX;
	/* if(spanArray.length != targetArray.length) {
		return;
	} */
    for(var j=INITIAL_INDEX;j&lt;=targetArray.length;j++){
    	 if (targetArray[j] != null) {
		        if (showFlag) {
		        	targetArray[j].style.display = &quot; , &quot;'&quot; , &quot;block&quot; , &quot;'&quot; , &quot;;
		        	if(spanArray[j] != null){
		        		spanArray[j].innerHTML = contractsymbol;
		        	}
		        } else {
		        	targetArray[j].style.display = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;;
		        	if(spanArray[j] != null){
		        		spanArray[j].innerHTML = expandsymbol;
		        	}
		        }
		    }
    }
}

function checkUncheckBoxes(array, checkFlag) {
	var alltags=document.all? document.all : document.getElementsByTagName(&quot;*&quot;);
	var statecollects=getElementbyClass(alltags, &quot;showstate&quot;);
	var i = INITIAL_INDEX;
	while (array[i] != null) {
	    if (array[i]) {
	    	var formNum = i-1;
	        if (checkFlag) {
	            if(array[i].checked == false){
	        		array[i].checked = true;
	        		setPayAmountFromAmountDue(amountDueArray[i], payAmountArray[i], payAmountSpanArray[i]);
	        	}
	        	
	        	if(document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i) != null){
	        		document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;black&quot;;
				    document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i).style.display=&quot;block&quot;;
				}
	        	
	        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){
	        		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	        			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = false;
	   	    	 }else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }	    
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color = &quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = false;
	   	    	 }else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = false;
	   	    	}else{
		   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}    	    	
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = false;
	   	    	 }else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = false;
	   	    	 }else{
	   	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;black&quot;;
	   	    		}
	   	    	}
	   	    }	
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}	    	    	
	   	    }
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i) != null){
			    	document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;black&quot;;
			    }
			    if(document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i) != null){
				    document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i).disabled=false;
				}
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i) != null){
			    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i).disabled=false;
			    }
			    if(document.getElementById(&quot;c_payDate&quot; + i) != null){
			    	document.getElementById(&quot;c_payDate&quot; + i).style.display=&quot;block&quot;;
			    }
			    if(document.getElementById(&quot;disc_payDate&quot; + i) != null){
					document.getElementById(&quot;disc_payDate&quot; + i).style.display=&quot;none&quot;;
				}
				if(document.getElementById(&quot;time&quot; + i) != null){
					document.getElementById(&quot;time&quot; + i).style.display=&quot;block&quot;;
				}
				if(document.getElementById(&quot;distime&quot; + i) != null){
					document.getElementById(&quot;distime&quot; + i).style.display=&quot;none&quot;;
				}
				if(document.getElementById(&quot;arrow&quot; + i) != null){
					document.getElementById(&quot;arrow&quot; + i).src=&quot;/vbills/_assets/img/b.gif&quot;;
				}

				if(billDetailSpanArray[i] != null){
					billDetailSpanArray[i].innerHTML=&quot; , &quot;'&quot; , &quot;&lt;img src=&quot;/vbills/_assets/img/minus.gif&quot; align=&quot;absmiddle&quot; alt=&quot;Collapse bill details&quot;>&quot; , &quot;'&quot; , &quot;;
				}
	        } else {
	            if(array[i].checked){
		        	array[i].checked = false;
		        	setPayAmountToZero(payAmountArray[i],payAmountSpanArray[i]);
	        	}
	        	
		        if(document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i) != null){
			    	document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;gray&quot;;
			    }
		        if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){
					 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
						 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = true;
			    	 }else{
			        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
			        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = true;
			        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;gray&quot;;
				    	}
				    	}
				    }
				    
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;gray&quot;;
					        }
				        }
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}			    	
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = true;
				    	 }else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = true;
				    	 }else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){
				    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = true;
				    	 }else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
			    if(document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i) != null){
		        	document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;gray&quot;;
		        }
		        if(document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i) != null){
		   	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i).disabled=true;
		   	    }
		   	    if(document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i) != null){
		   	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i).disabled=true;
		   	    }
		   	    if(document.getElementById(&quot;c_payDate&quot; + i) != null){
		   	    	document.getElementById(&quot;c_payDate&quot; + i).style.display=&quot;none&quot;;
		   	    }
		   	    if(document.getElementById(&quot;disc_payDate&quot; + i) != null){
					document.getElementById(&quot;disc_payDate&quot; + i).style.display=&quot;block&quot;;
				}
				if(document.getElementById(&quot;time&quot; + i) != null){
					document.getElementById(&quot;time&quot; + i).style.display=&quot;none&quot;;
				}
				if(document.getElementById(&quot;distime&quot; + i) != null){
					document.getElementById(&quot;distime&quot; + i).style.display=&quot;block&quot;;	
				}
				if(document.getElementById(&quot;arrow&quot; + i) != null){
					document.getElementById(&quot;arrow&quot; + i).src=&quot;/vbills/_assets/img/a.gif&quot;;
				}
				
	        }
	    }
    	i = i + 1;
	}
	updateTotal();
}
//checkbox
function populatePayAmount(element, amountDueId, payAmountId, spanPayAmountId) {
	if (element.checked) {
		setPayAmountFromAmountDue(document.getElementById(amountDueId), document.getElementById(payAmountId), document.getElementById(spanPayAmountId));
	} else {
		setPayAmountToZero(document.getElementById(payAmountId), document.getElementById(spanPayAmountId));
	}
	updateTotal();
}
function populatePayAmount(element, amountDueId, payAmountId, spanPayAmountId, udfs, countValue) {
    var formNum = countValue - 1;
	var trId = &quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + countValue;
	var alltags=document.all? document.all : document.getElementsByTagName(&quot;*&quot;);
	var statecollects=getElementbyClass(alltags, &quot;showstate&quot;);
	var pictureObj = document.getElementById(&quot;arrow&quot; + countValue);
	if (pictureObj.src.indexOf(&quot; , &quot;'&quot; , &quot;/vbills/_assets/img/a.gif&quot; , &quot;'&quot; , &quot;) > -1) {	  
	    document.getElementById(&quot; , &quot;'&quot; , &quot;payCheckbox&quot; , &quot;'&quot; , &quot; + countValue).checked = true;
	    
	    if(document.getElementById(udfs) != null){
		    document.getElementById(udfs).style.display=&quot;block&quot;;
		    document.getElementById(udfs).style.color=&quot;black&quot;;
		}

	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }	    
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = false;
	    	}else{
	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color = &quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = false;
	    	 }else{
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = false;
	    	}else{
	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
	    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = false;
	    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;black&quot;;
	    		}
	    	}	    	    	
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = false;
	    	 }else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = false;
	    	 }else{
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }	
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}	    	    	
	    }
	    if(document.getElementById(trId) != null){
		    document.getElementById(trId).style.color=&quot;black&quot;;
        }
        if(document.getElementById(payAmountId) != null)	   {
           document.getElementById(payAmountId).disabled=false;
        }   
	    if( document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue) != null){
	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue).disabled=false;
	    }	   
	    	    
	 		
		if(document.getElementById(&quot;time&quot; + countValue) != null){		
			document.getElementById(&quot;time&quot; + countValue).style.display=&quot;block&quot;;
		}				
		if(document.getElementById(&quot;distime&quot; + countValue) != null){
			document.getElementById(&quot;distime&quot; + countValue).style.display=&quot;none&quot;;
		}		
		if(document.getElementById(&quot;arrow&quot; + countValue)!=null){
			document.getElementById(&quot;arrow&quot; + countValue).src=&quot;/vbills/_assets/img/b.gif&quot;;
		}
		setPayAmountFromAmountDue(document.getElementById(amountDueId), document.getElementById(payAmountId), document.getElementById(spanPayAmountId));	
	} else {
		document.getElementById(&quot; , &quot;'&quot; , &quot;payCheckbox&quot; , &quot;'&quot; , &quot; + countValue).checked = false;
		
		if(document.getElementById(udfs)){
		    document.getElementById(udfs).style.color=&quot;gray&quot;;
		}
		 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){
			 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = true;
	    	 }else{
	        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
	        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = true;
	        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;gray&quot;;
		    	}
		    }
		   }
		    
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = true;
		    	}else{
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = true;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;gray&quot;;
		    		}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = true;
		    	}else{
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = true;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;gray&quot;;
		       		}
		        }
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = true;
		    	}else{
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = true;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color=&quot;gray&quot;;
		    		}
		    	}		    	
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = true;
		    	 }else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = true;
		    	}else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = true;
		    	 }else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = true;
		    	}else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = true;
		    	 }else{
			    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = true;
		    	}else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
	    
		if(document.getElementById(trId)){
	        document.getElementById(trId).style.color=&quot;gray&quot;;
	    }
	    if(document.getElementById(payAmountId)){
   	    	document.getElementById(payAmountId).disabled=true;
   	    }
   	    if( document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue) != null){
   	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue).disabled=true;
   	    }
   	   
		if(document.getElementById(&quot;time&quot; + countValue) != null){
			document.getElementById(&quot;time&quot; + countValue).style.display=&quot;none&quot;;
		}
		if(document.getElementById(&quot;distime&quot; + countValue)!=null){
			document.getElementById(&quot;distime&quot; + countValue).style.display=&quot;block&quot;;
		}
		if(document.getElementById(&quot;arrow&quot; + countValue) != null){
			document.getElementById(&quot;arrow&quot; + countValue).src=&quot;/vbills/_assets/img/a.gif&quot;;
		}
		setPayAmountToZero(document.getElementById(payAmountId), document.getElementById(spanPayAmountId));
	}
	if(billDetailSpanArray[countValue] != null){
		billDetailSpanArray[countValue].innerHTML=&quot; , &quot;'&quot; , &quot;&lt;img src=&quot;/vbills/_assets/img/minus.gif&quot; align=&quot;absmiddle&quot; alt=&quot;Collapse bill details&quot;>&quot; , &quot;'&quot; , &quot;
	}
	updateTotal();

}
function setPayAmountFromAmountDue(amountDue, payAmount, spanPayAmount) {
	payAmount.value = amountDue.value;
	if (spanPayAmount != null) {
		spanPayAmount.innerHTML = payAmount.value;
	}
	checkedNum++;
}

function setPayAmountToZero(payAmount, spanPayAmount) {
	payAmount.value = &quot;0.00&quot;;
	if (spanPayAmount != null) {
		spanPayAmount.innerHTML = payAmount.value;
	}
	checkedNum--;
}

function formatMoney(money) {
	var index = money.indexOf(&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;);
	var len = money.length;
	if (index == -1) {
		return money + &quot;.00&quot;;
	} else if (len - index == 2) {
		return money + &quot;0&quot;;s
	}
	return money;
}

function truncateMoneyValue(moneyValue) {
	var moneyValue = moneyValue.replace(/,/g, &quot;&quot;);
	var index = moneyValue.indexOf(&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;);
	if (index > -1) {
		var len = moneyValue.length;
		if(index &lt; len - 3) {
			moneyValue = moneyValue.substring(0, index + 3);
		}
	}
	return moneyValue;
}

function resetCheckbox(inputField, payCheckboxId,zeroAccepted, amountDueId, consolidateBills) {          
	setTimeout(&quot;timeoutResetCheckbox(&quot; , &quot;'&quot; , &quot;&quot; + inputField.id + &quot;&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&quot; + payCheckboxId + &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; + zeroAccepted + &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; + amountDueId + &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; + consolidateBills + &quot;&quot; , &quot;'&quot; , &quot;);&quot;, 1);
}

function timeoutResetCheckbox(inputFieldId, payCheckboxId, zeroAccepted, amountDueId, consolidateBills) {
	var inputField = document.getElementById(inputFieldId);
	var moneyValue = truncateMoneyValue(inputField.value);
	var floatValue = parseFloat(moneyValue);
	var amountDue = document.getElementById(amountDueId);
	var amountDueValue = truncateMoneyValue(amountDue.value);
	var floatAmountDueValue = parseFloat(amountDueValue);
	
	if (isNaN(floatValue)) {
		inputField.value = &quot;0.00&quot;
		document.getElementById(payCheckboxId).checked = false;
		return;
	}
	inputField.value = formatMoney(floatValue.toString());
	updateTotal();
}

var TOTAL_TO_PAY = &quot; , &quot;'&quot; , &quot;totalToPay&quot; , &quot;'&quot; , &quot;;
var SPAN_TOTAL_TO_PAY = &quot; , &quot;'&quot; , &quot;spanTotalToPay&quot; , &quot;'&quot; , &quot;;
var SAVE_PAYMENT_CHECKBOX_TR = &quot; , &quot;'&quot; , &quot;savePaymentCheckboxTr&quot; , &quot;'&quot; , &quot;;
var STORE_PAYMENT_METHOD_CHKBOX_ID = &quot; , &quot;'&quot; , &quot;storePaymentMethod&quot; , &quot;'&quot; , &quot;;
var SAVE_NICKNAME_TR = &quot; , &quot;'&quot; , &quot;saveNickNameTr&quot; , &quot;'&quot; , &quot;;
var NUM_TOTAL_TO_PAY = &quot; , &quot;'&quot; , &quot;numTotalToPay&quot; , &quot;'&quot; , &quot;;

var checkboxArray = null;
var divArray = null;
var billDetailSpanArray = null;
var payAmountArray = null;
var payAmountSpanArray = null;
var amountDueArray = null;


function initVariables() {
	checkboxArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;payCheckbox&quot; , &quot;'&quot; , &quot;);
	divArray = getElementsByPrefixByCount(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot;, checkboxArray.length);
	disdivArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;disudf&quot; , &quot;'&quot; , &quot;);
	billDetailSpanArray = getElementsByPrefixByCount(&quot; , &quot;'&quot; , &quot;billDetailsSpan&quot; , &quot;'&quot; , &quot;, checkboxArray.length);
	payAmountArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot;);
	payAmountSpanArray = getElementsByPrefixByCount(&quot; , &quot;'&quot; , &quot;spanPayAmount&quot; , &quot;'&quot; , &quot;, payAmountArray.length);
	amountDueArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;amountDue&quot; , &quot;'&quot; , &quot;);	
}

var BILL_PAYMENT_DERIVED_URL_PREFIX = &quot; , &quot;'&quot; , &quot;/vbills/mbills/billPaymentDerivedField.go?&amp;forgotType=null&quot; , &quot;'&quot; , &quot;;

function outputComma(num) {
    num = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; + num;
    var number = num;
	var decimalPart = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
    if (num.indexOf(&quot;.&quot;)!=-1) {
	  number = num.substring(0,num.indexOf(&quot;.&quot;));
	  decimalPart = num.substring(num.indexOf(&quot;.&quot;) , num.length);
	}
    if (number.length > 3) {
        var mod = number.length%3;
        var output = (mod > 0 ? (number.substring(0,mod)) : &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
        for (i=0 ; i &lt; Math.floor(number.length/3) ; i++) {
            if ((mod ==0) &amp;&amp; (i ==0))
                output+= number.substring(mod+3*i,mod+3*i+3);
            else
                output+= &quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot; + number.substring(mod+3*i,mod+3*i+3);
        }
        return (output)+decimalPart;
    }
    else return number+decimalPart;
}

function updateTotal() {
	var amountArray = new Array();	
	var total=0;
	for (var i = INITIAL_INDEX; i &lt; payAmountArray.length; i++) {
	    if(payAmountArray[i].value == &quot;&quot;){
	    	payAmountArray[i].value = &quot;0.00&quot;;
	    }
		amountArray.push(payAmountArray[i].value);
		total += parseFloat(payAmountArray[i].value.replace(&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;));	

	} 
    document.getElementById(NUM_TOTAL_TO_PAY).innerHTML = checkedNum;
	document.getElementById(TOTAL_TO_PAY).value = outputComma(total.toFixed(2));
	document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = outputComma(total.toFixed(2));
	 
}

function getTotalAmountCalculatedCallback(responseText) {
	var total = handleAjaxResponse(responseText);
	document.getElementById(TOTAL_TO_PAY).value = total;
	document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = total;
}

function handleAjaxResponse(responseText) {
	enableDisableButtons(true);
    var responseArray = eval(responseText);
    if (responseArray[0] == true) {
       return responseArray[1];
    } else {
    	return responseArray[1];
    }   
}

function setCalculatingValueMessage(element) {
	enableDisableButtons(false);
	element.innerHTML = &quot; , &quot;'&quot; , &quot;Calculating ...&quot; , &quot;'&quot; , &quot;;
//    span.className = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
}

function enableDisableButtons(isEnable) {
	document.getElementById(&quot; , &quot;'&quot; , &quot;nextButton&quot; , &quot;'&quot; , &quot;).enabled = isEnable;
}

var LABEL_SUFFIX = &quot; , &quot;'&quot; , &quot; &lt;span class=&quot;requiredField&quot;>*&lt;\/span>&quot; , &quot;'&quot; , &quot;;

function setLabel(id, label, isRequred) {
    if(isRequred) {
            document.getElementById(id).innerHTML = label + LABEL_SUFFIX;
    } else {
            document.getElementById(id).innerHTML = label;
    }
}

PAYMENT_METHOD_SELECTBOX_ID = &quot; , &quot;'&quot; , &quot;selectedPaymentMethod&quot; , &quot;'&quot; , &quot;;
PAYMENT_METHOD_INFO_URL_PREFIX = &quot; , &quot;'&quot; , &quot;/vbills/mbills/paymentMethodInfo.go?&amp;forgotType=null&quot; , &quot;'&quot; , &quot;;
PAYMENT_METHOD_INFO_DIV_ID = &quot; , &quot;'&quot; , &quot;paymentMethodInfoDiv&quot; , &quot;'&quot; , &quot;;
PAYMENT_METHOD_TYPE_FORM_DIV_ID = &quot; , &quot;'&quot; , &quot;paymentMethodTypeFormDiv&quot; , &quot;'&quot; , &quot;;

function toggle() {
	if(area > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; area != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
		document.getElementById(&quot; , &quot;'&quot; , &quot;pay_via_debit_credit&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&quot;;
	}
    var area = safeGetInputValue(PAYMENT_METHOD_SELECTBOX_ID);
    if(area != null &amp;&amp; area != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
	    if(area.indexOf(&quot;_&quot;)  >0 ){
	    	hideShowElementFrfx(PAYMENT_METHOD_TYPE_FORM_DIV_ID, false);
	    	hideShowElementFrfx(SAVE_PAYMENT_CHECKBOX_TR, false);
	    	var str = area.split(&quot;_&quot;);
	    	var arean = &quot;name_&quot; + str[str.length-1];
	    	displayPaymentMethodInfo(arean);
	    } else {
	    	hideShowElementFrfx(PAYMENT_METHOD_INFO_DIV_ID, false);
	    	hideShowElementFrfx(PAYMENT_METHOD_TYPE_FORM_DIV_ID, true);
	    	hideShowElementFrfx(SAVE_PAYMENT_CHECKBOX_TR, true);
	    	if(area==&quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;check_accCondition&quot; , &quot;'&quot; , &quot;,false);
	    //	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;achTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;ccTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,true);
	    	}else{
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;check_accCondition&quot; , &quot;'&quot; , &quot;,false);
	    //	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;achTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;ccTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);
	    	}
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;area_creditCard&quot; , &quot;'&quot; , &quot;, (area == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;));
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;creditCardInfo&quot; , &quot;'&quot; , &quot;,area == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot;);
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;debitCardInfo&quot; , &quot;'&quot; , &quot;,area == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;);
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;area_achPayment&quot; , &quot;'&quot; , &quot;, (area > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; area != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;));
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;addressForm&quot; , &quot;'&quot; , &quot;, true);
		    if (area > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; area != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;) {
		    hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;check_accCondition&quot; , &quot;'&quot; , &quot;, true);
		//    hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;achTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,true);
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;ccTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;bankInfo1&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;4&quot; , &quot;'&quot; , &quot;);
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;bankInfo2&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;4&quot; , &quot;'&quot; , &quot;);
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;personalRoutingGif&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;2&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;3&quot; , &quot;'&quot; , &quot;);
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;businessRoutingGif&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;4&quot; , &quot;'&quot; , &quot;);                
		        setLabel(&quot; , &quot;'&quot; , &quot;bankInfo3&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&lt;span id=&quot;paymentMethod.firstName&quot;>First Name:&lt;/span>&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;2&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;3&quot; , &quot;'&quot; , &quot;);
		        setLabel(&quot; , &quot;'&quot; , &quot;bankInfo4&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&lt;span id=&quot;paymentMethod.lastName&quot;>Last Name:&lt;/span>&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;2&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;3&quot; , &quot;'&quot; , &quot;);
		    }
	    }
    }
}

function togglePaymentMethodType() {
  	toggle();
    if(document.getElementById(SPAN_TOTAL_TO_PAY) != null &amp;&amp; document.getElementById(TOTAL_TO_PAY) != null){
		document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = document.getElementById(TOTAL_TO_PAY).value;
    }
}

function toggleSaveNickNameTr() {
	hideShowElementFrfx(SAVE_NICKNAME_TR, document.getElementById(STORE_PAYMENT_METHOD_CHKBOX_ID).checked);
}

function schedulePayment(index) {
    document.getElementById(&quot; , &quot;'&quot; , &quot;schedulePaymentForBillIndex&quot; , &quot;'&quot; , &quot;).value = index;
    submitForm(&quot; , &quot;'&quot; , &quot;billListForm&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;/vbills/mbills/billList.go?action=schedulePayment&amp;forgotType=null&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;You have already submitted this form&quot; , &quot;'&quot; , &quot;);
}

//========= Saved Payment Information Ajax Call

function displayPaymentMethodInfo(selectedId) {
    if (selectedId == &quot;&quot;) {
        return;
    }
    disableElementById(PAYMENT_METHOD_SELECTBOX_ID);
    setWaitingMessageOnInfoDiv();
    var ajax = new Ajax();
    ajax.add(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;, selectedId);
    ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);
    ajax.post(PAYMENT_METHOD_INFO_URL_PREFIX + &quot; , &quot;'&quot; , &quot;&amp;action=getInfo&quot; , &quot;'&quot; , &quot;, paymentMethodInfoCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);  
}

function paymentMethodInfoCallback(responseText) {
    var pmiDiv = getPmiDivControl();
    pmiDiv.innerHTML = responseText;
	hideShowElementFrfx(PAYMENT_METHOD_INFO_DIV_ID, true);
    enableElementById(PAYMENT_METHOD_SELECTBOX_ID);
    if(document.getElementById(&quot;paymentMethodTypeId&quot;) != null){
	    var paymentMethodTypeIdValue = document.getElementById(&quot;paymentMethodTypeId&quot;).value;
	    if(paymentMethodTypeIdValue == &quot;1&quot; || paymentMethodTypeIdValue == &quot;5&quot; ){
	   		document.getElementById(&quot;check_accCondition&quot;).style.display=&quot;none&quot;;
	   	//	document.getElementById(&quot;achTermsAndConditionsMessage&quot;).style.display=&quot;none&quot;;
	   		document.getElementById(&quot;ccTermsAndConditionsMessage&quot;).style.display=&quot;block&quot;;
	    }else{
	    	document.getElementById(&quot;check_accCondition&quot;).style.display=&quot;block&quot;;
	  //  	document.getElementById(&quot;achTermsAndConditionsMessage&quot;).style.display=&quot;block&quot;;
	   		document.getElementById(&quot;ccTermsAndConditionsMessage&quot;).style.display=&quot;none&quot;;
	    }
    }
}

function setWaitingMessageOnInfoDiv() {
    var pmiDiv = getPmiDivControl();
    pmiDiv.innerHTML = &quot; , &quot;'&quot; , &quot;&lt;br/>&lt;strong>Retrieving Information ...&lt;/strong>&quot; , &quot;'&quot; , &quot;;
}

function getPmiDivControl() {
    return document.getElementById(PAYMENT_METHOD_INFO_DIV_ID);
}
 
addOnloadHandler(togglePaymentMethodType);
//addOnloadHandler(toggleSaveNickNameTr);
addOnloadHandler(initVariables);
setFieldsThatNeedToBeClearedBetweenPageFlow([&quot; , &quot;'&quot; , &quot;paymentMethodForm.cardAccountNumber&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;paymentMethodForm.bankAccountNumber&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;paymentMethodForm.cvv&quot; , &quot;'&quot; , &quot;]);
//-->

function PendingBillsSearch(){
	var pageResultNum = document.getElementById(&quot;pageSize&quot;).value;
	var url=&quot;/vbills/mbills/billList.go?action=navigateForGuestPay&amp;forgotType=null&amp;pageNumber=1&amp;pageSize=&quot;+pageResultNum;
	var obj = document.getElementById(&quot;pagingForm&quot;);
	obj.action = url;
	obj.submit();	
}

function wsug(e, str){ 
 var oThis = arguments.callee;
 if(!str) {
  oThis.sug.style.visibility = &quot; , &quot;'&quot; , &quot;hidden&quot; , &quot;'&quot; , &quot;;
  document.onmousemove = null;
  document.getElementById(&quot;helpIMG&quot;).src=&quot;/vbills/_assets/img/help3.gif&quot;;
  return;
 }  
 if(!oThis.sug){  
  var div = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;top:0; left:0; position:absolute; z-index:100; visibility:hidden&quot; , &quot;'&quot; , &quot;;
   div.style.cssText = css;
   div.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  var sug = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css= &quot; , &quot;'&quot; , &quot;font:normal 12px/16px; white-space:nowrap; color:#666; padding:3px; position:absolute; left:0; top:0; z-index:10; background:#f9fdfd; border:1px solid #0aa&quot; , &quot;'&quot; , &quot;;
   sug.style.cssText = css;
   sug.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  var dr = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;position:absolute; top:3px; left:3px; background:#333; filter:alpha(opacity=50); opacity:0.5; z-index:9&quot; , &quot;'&quot; , &quot;;
   dr.style.cssText = css;
   dr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  var ifr = document.createElement(&quot; , &quot;'&quot; , &quot;iframe&quot; , &quot;'&quot; , &quot;), css=&quot; , &quot;'&quot; , &quot;position:absolute; left:0; top:0; z-index:8; filter:alpha(opacity=0); opacity:0&quot; , &quot;'&quot; , &quot;;
   ifr.style.cssText = css;
   ifr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  div.appendChild(ifr);
  div.appendChild(dr);
  div.appendChild(sug);
  div.sug = sug;
  document.body.appendChild(div);
  oThis.sug = div;
  oThis.dr = dr;
  oThis.ifr = ifr;
  div = dr = ifr = sug = null;
 }
 document.getElementById(&quot;helpIMG&quot;).src=&quot;/vbills/_assets/img/help.gif&quot;;
 var e = e || window.event, obj = oThis.sug, dr = oThis.dr, ifr = oThis.ifr;
 obj.sug.innerHTML = str;
 
 var w = obj.sug.offsetWidth, h = obj.sug.offsetHeight, dw = document.documentElement.clientWidth||document.body.clientWidth; dh = document.documentElement.clientHeight || document.body.clientHeight;
 var st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;
 var left = e.clientX +sl +17 + w &lt; dw + sl  &amp;&amp;  e.clientX + sl + 15 || e.clientX +sl-8 - w, top = e.clientY + st +17 + h &lt; dh + st  &amp;&amp;  e.clientY + st + 17 || e.clientY + st - 5 - h;
 obj.style.left = left+ 10 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 obj.style.top = top + 10 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 dr.style.width = w + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 dr.style.height = h + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 ifr.style.width = w + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 ifr.style.height = h + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 obj.style.visibility = &quot; , &quot;'&quot; , &quot;visible&quot; , &quot;'&quot; , &quot;;
 document.onmousemove = function(e){
  var e = e || window.event, st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;
  var left = e.clientX +sl +17 + w &lt; dw + sl  &amp;&amp;  e.clientX + sl + 15 || e.clientX +sl-8 - w, top = e.clientY + st +17 + h &lt; dh + st  &amp;&amp;  e.clientY + st + 17 || e.clientY + st - 5 - h;
  obj.style.left = left + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
  obj.style.top = top + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 }
}
function instruction(e, str){ 
var oThis = arguments.callee;
 if(!str) {
  oThis.sug.style.visibility = &quot; , &quot;'&quot; , &quot;hidden&quot; , &quot;'&quot; , &quot;;
  return;
 }  

 if(!oThis.sug){  
  var div = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;position:fixed; z-index:100; visibility:visibiled; width:220px;&quot; , &quot;'&quot; , &quot;;
   div.style.cssText = css;
   div.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  var sug = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css= &quot; , &quot;'&quot; , &quot;font:normal 12px/16px; color:#666; padding:3px; position:fixed; z-index:10; background:#f9fdfd; border:1px solid #0aa; width:220px;&quot; , &quot;'&quot; , &quot;;
   sug.style.cssText = css;
   sug.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  var dr = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;position:fixed; background:#333; filter:alpha(opacity=50); opacity:0.5; z-index:9; width:220px;&quot; , &quot;'&quot; , &quot;;
   dr.style.cssText = css;
   dr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  var ifr = document.createElement(&quot; , &quot;'&quot; , &quot;iframe&quot; , &quot;'&quot; , &quot;), css=&quot; , &quot;'&quot; , &quot;position:fixed; z-index:8; filter:alpha(opacity=0); opacity:0; width:220px;&quot; , &quot;'&quot; , &quot;;
   ifr.style.cssText = css;
   ifr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  div.appendChild(ifr);
  div.appendChild(dr);
  div.appendChild(sug);
  div.sug = sug;
  document.body.appendChild(div);
  oThis.sug = div;
  oThis.dr = dr;
  oThis.ifr = ifr;
  div = dr = ifr = sug = null;
 }

 var e = e , obj = oThis.sug, dr = oThis.dr, ifr = oThis.ifr;
 var pos = findPosition(e);
 obj.sug.innerHTML = str;
 
 var w = obj.sug.offsetWidth, h = obj.sug.offsetHeight, dw = document.documentElement.clientWidth||document.body.clientWidth; dh = document.documentElement.clientHeight || document.body.clientHeight;
 var st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;
 var left = pos[0] +sl +17 + w &lt; dw + sl  &amp;&amp;  pos[0] + sl + 15 || pos[0] +sl-8 - w, top = pos[1] + st + h &lt; dh + st  &amp;&amp;  pos[1] + st || pos[1] + st - 5 - h; obj.style.left = left+ 10 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 obj.style.top = top + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 var left0 = left - w - 50;
 obj.style.left = left0 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 dr.style.width = w + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 dr.style.height = h + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 dr.style.top = top + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 dr.style.left = left0 + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 ifr.style.width = w + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 ifr.style.height = h + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 obj.style.visibility = &quot; , &quot;'&quot; , &quot;visible&quot; , &quot;'&quot; , &quot;;

}

function findPosition( oElement ) 
{
  var x2 = 0;
  var y2 = 0;
  var width = oElement.offsetWidth;
  var height = oElement.offsetHeight;
  if( typeof( oElement.offsetParent ) != &quot; , &quot;'&quot; , &quot;undefined&quot; , &quot;'&quot; , &quot; ) 
  {
    for( var posX = 0, posY = 0; oElement; oElement = oElement.offsetParent ) 
    {
      posX += oElement.offsetLeft;
      posY += oElement.offsetTop;      
    }
    x2 = posX + width;
    y2 = posY + height;
    return [ posX, posY ,x2, y2];
    
    } else{
      x2 = oElement.x + width;
      y2 = oElement.y + height;
      return [ oElement.x, oElement.y, x2, y2];
  }
}
		function getStateList(countryId){
			var ajax = new Ajax();
			ajax.add(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;, countryId);
			ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);			
			ajax.get(&quot; , &quot;'&quot; , &quot;/vbills/mbills/stateInfo.go?action=getStateTypesByCountry&amp;forgotType=null&quot; , &quot;'&quot; , &quot; + &quot; , &quot;'&quot; , &quot;&amp;action=getStateTypesByCountry&quot; , &quot;'&quot; , &quot;, stateTypeByCountryCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
		}
		function stateTypeByCountryCallback(responseText){
			var datalist = responseText.parseJSON();
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.state&quot; , &quot;'&quot; , &quot;).innerHTML= datalist.stateLabel;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.stateLabel&quot; , &quot;'&quot; , &quot;).value= datalist.stateLabel;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.zipCode&quot; , &quot;'&quot; , &quot;).innerHTML= datalist.zipLabel;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.zipLabel&quot; , &quot;'&quot; , &quot;).value=datalist.zipLabelKey;
			if(datalist.stateList.length>0){
				showStateSelect();
				document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&quot;;
				for(var i=0;i&lt;datalist.stateList.length;i++){
					var option = document.createElement(&quot;option&quot;);
					var rs =  datalist.stateList[i];
					option.value = rs.id;
                    option.innerHTML = rs.value;
                    document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).appendChild(option);           
				}
			}else{
				hideStateSelect();
			}
		}
        
       
        function changeCountry(val){
        	if(val != 840){
        		hideZipCodeSplit();
        		
        	}else{
        		showZipCodeSplit();
        	}
			var paymentMethodType = document.getElementById(&quot; , &quot;'&quot; , &quot;selectedPaymentMethod&quot; , &quot;'&quot; , &quot;).value;
        	if(65 > 1){        		
		 		showStateSelect();
		 	}else{		 		
		 		hideStateSelect();
		 	}

			if(paymentMethodType == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || paymentMethodType == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
				document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
				document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
			} 
			if(paymentMethodType > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; paymentMethodType != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
				if(val == 840){
        			document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
        			document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
        		}else{
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
				}
			}	
        }
        function showStateSelect(){
        	document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.state&quot;);
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);
        }
        function hideStateSelect(){
        	document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.stateCode&quot;);
        }
        function cleanInput(val){
			var paymentMethodType = document.getElementById(&quot; , &quot;'&quot; , &quot;selectedPaymentMethod&quot; , &quot;'&quot; , &quot;).value;

			if(paymentMethodType == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || paymentMethodType == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
				if(840 == val){
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
				}else{
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
				}
			}
			if(paymentMethodType > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; paymentMethodType != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
				if(840 == val){
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
				}else{
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
				}
					
			}	
        }
        
        function showZipCodeSplit(){
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.zipCode&quot;);
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;zipSplit&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);
        }
        function hideZipCodeSplit(){
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;zipSplit&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.zipCode&quot;);
        }
        
        function linkageStateAndCountry(val){
        	if(val != 840){
        		hideZipCodeSplit();
        		
        	}else{
        		showZipCodeSplit();
        	}
	        cleanInput(val);
	        getStateList(val);
        }
        function is_valid_zip(zip) {
			var re = /^\d{5}(\d{4})?$/;
			return re.test(zip);
		}
        function alertErrMsg(){
				//document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&lt;ul>&lt;li>ZIP_Code is not valid.&lt;/li>&lt;/ul>&quot;;
        		//document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;block&quot;;        	
        }
        function zipCodeValidate(){
        	var countryId = document.getElementById(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;).value;
        	
        		
            	var current = document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value; // + document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value;
            	if( !is_valid_zip(current)){
            		//alert errors.
            		alertErrMsg();
            	}else{
            		document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
            		var ajax = new Ajax();
        			ajax.add(&quot;zipCode&quot; , current);
        			ajax.add(&quot;countryId&quot;,countryId);
        	        ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);
        			ajax.post(&quot; , &quot;'&quot; , &quot;/vbills/mbills/validateZipCode.go?action=getValidateZipCode&amp;forgotType=null&quot; , &quot;'&quot; , &quot; + &quot; , &quot;'&quot; , &quot;&amp;action=getStateTypesByCountry&quot; , &quot;'&quot; , &quot;,zipCodeValidateCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
            	}
        	
		}
		function zipCodeValidateCallback(responseText){
			var data = responseText.parseJSON();
			if(data!=null &amp;&amp; data !=&quot;&quot;){
				document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
				document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value=data.city;
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).style.display=&quot;block&quot;){
					document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).value=data.state.id;
				}else{
					document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).value = data.state.value;
				}
			}else{
				alertErrMsg();
			}
		}
		function setCityAndStateRequired (val){
			if(val == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || val == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
				document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
				document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
			} 
			if(val > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; val != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;).value == 840){
        			document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
        			document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
        		}else{
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
				}
			}
		}

		function rtnValidate(){

			var rtnString = document.getElementById(&quot; , &quot;'&quot; , &quot;routingNumber&quot; , &quot;'&quot; , &quot;).value;
			var ajax = new Ajax();
			ajax.add(&quot;rtnStr&quot; , rtnString);
			ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);
			ajax.post(&quot; , &quot;'&quot; , &quot;/vbills/mbills/RTNValidate.go?action=rtnValidation&amp;forgotType=null&quot; , &quot;'&quot; , &quot; + &quot; , &quot;'&quot; , &quot;&amp;action=AchRTNValidate&quot; , &quot;'&quot; , &quot;,rtnValidateCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);

		}
		function rtnValidateCallback(responseText){
			var data = responseText.parseJSON();
			if(data!=null &amp;&amp; data !=&quot;&quot;){
				if(data.message !=null &amp;&amp; data.message){
					document.getElementById(&quot; , &quot;'&quot; , &quot;routingError&quot; , &quot;'&quot; , &quot;).innerHTML= data.message;
				}else{
					document.getElementById(&quot; , &quot;'&quot; , &quot;routingError&quot; , &quot;'&quot; , &quot;).innerHTML= &quot;Invalid Routing Number&quot;;
				}
			}
		}
		
		function debitCardNumberValidate(cardNumber){
					document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
            		var ajax = new Ajax();
            	    ajax.add(&quot; , &quot;'&quot; , &quot;cn&quot; , &quot;'&quot; , &quot;, cardNumber);
            	    ajax.get(PAYMENT_METHOD_INFO_URL_PREFIX + &quot; , &quot;'&quot; , &quot;&amp;action=debitCardNumberValidate&quot; , &quot;'&quot; , &quot;, debitCardNumberValidateCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);  
		}
		function debitCardNumberValidateCallback(responseText){
			var data = responseText.parseJSON();
			if(data!=null &amp;&amp; data !=&quot;&quot;){
				document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
				var isDebit = data.isDebit;

				if(isDebit == &quot; , &quot;'&quot; , &quot;true&quot; , &quot;'&quot; , &quot;){
					document.getElementById(&quot; , &quot;'&quot; , &quot;pay_via_debit_credit&quot; , &quot;'&quot; , &quot;).innerHTML=&quot; , &quot;'&quot; , &quot;&lt;table width=&quot;100%&quot; border=&quot;0&quot; cellspacing=&quot;0&quot; cellpadding=&quot;0&quot;>&quot; , &quot;'&quot; , &quot;+
		                &quot; , &quot;'&quot; , &quot; &lt;tr>&lt;td class=&quot;strong&quot; width=&quot;40%&quot;>&lt;span >Process As Debit Credit:&lt;/span>&lt;/td>&quot; , &quot;'&quot; , &quot;+
		                  &quot; , &quot;'&quot; , &quot; &lt;td width=&quot;60%&quot;>&lt;input type=&quot;radio&quot; name=&quot;payViaDebitCredit&quot; value=&quot;true&quot; />&amp;nbsp;Yes&amp;nbsp;&amp;nbsp;&quot; , &quot;'&quot; , &quot; +
		                  &quot; , &quot;'&quot; , &quot; &lt;input type=&quot;radio&quot; name=&quot;payViaDebitCredit&quot; value=&quot;false&quot; checked />No&quot; , &quot;'&quot; , &quot; +
	                      &quot; , &quot;'&quot; , &quot;&lt;/td>&quot; , &quot;'&quot; , &quot;+
	                 &quot; , &quot;'&quot; , &quot; &lt;/tr>&quot; , &quot;'&quot; , &quot; +
	             &quot; , &quot;'&quot; , &quot; &lt;/table>&quot; , &quot;'&quot; , &quot;;
				}else{
					document.getElementById(&quot; , &quot;'&quot; , &quot;pay_via_debit_credit&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&quot;;
				}
			}else{
				alertErrMsg();
			}
		}
		function openNewWindow(clientAccountNumber,lookupValue1,lookupValue2,lookupValue3){
			/*alert(clientAccountNumber.value);
			alert(lookupValue1.value);
			alert(lookupValue2.value);
			alert(lookupValue3.value);*/
			
			var url = &quot; , &quot;'&quot; , &quot;https://aws.amazon.com&quot; , &quot;'&quot; , &quot;;
			window.open(url, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;width=800,height=600&quot; , &quot;'&quot; , &quot;);
		}
		$(&quot;#addressForm&quot;).show();
    		var isHideBillingAddress = false;
    		console.log(&quot;cc.getHideBillingAddress() - &quot; + isHideBillingAddress);



&lt;!--

var currentDay = new Date(); var thisYear =  currentDay.getFullYear(); var nextYear = currentDay.getFullYear() + 1; var dateRange=[thisYear,nextYear];function customInit() {var foo=1;}function dateStatusHandler(date, y, m, d) {    var today = new Date();    var myYesterday=new Date();myYesterday.setDate(today.getDate() - 1);if (date &lt;= myYesterday) {return &quot;special&quot;;} else {return false;}} function customCheckBox(obj, checkboxArray, udfscope) { var foo=1; } function customOnChangeUdf1(obj) { var foo=1; } function customOnChangeUdf2(obj) { var foo=1; } function customOnChangeUdf3(obj) { var foo=1; } function customOnChangeUdf4(obj) { var foo=1; } function customOnChangeUdf5(obj) { var foo=1; } function customOnChangeUdf6(obj) { var foo=1; } function customOnChangeUdf7(obj) { var foo=1; } function customOnChangeUdf8(obj) { var foo=1; } function customOnChangeUdf9(obj) { var foo=1; } function customOnChangeUdf10(obj) { var foo=1; }
addOnloadHandler(customInit);
//-->





    

    Available Bill Label
    * Indicates required field 
	
	Step 1: Pay Your Bill Label(s) By Checking One or More Checkboxes in the &quot;Check to Pay&quot; Column Below.  
	

    
	
	
		 One bill found.
				 
			
	    	
	    		Display102550 results
	    		
				
					
			
		
	
	
	
	
    
	
    
 		   
        Select All /
        Unselect All |  
        Show All /
        Hide All 
     
    
        
            Check to Pay
            Bill Label
	   		             
             
	            Due Date 
	         

            Pay Date

         
	            Amount Due 
	     

            Amount to Pay
            
            
           
        

        

	
    
    
                
	



               
                
                    
                        
                    
                   
                  
 485bills




	
	    04/01/2026
	    
	
 
    

               	

       		 
        		 
       		 
       

         
    

	
	$40.00

	
	
	
$


&lt;!--
if(document.getElementById(&quot;payCheckbox1&quot;) != null){
	if(document.getElementById(&quot;payCheckbox1&quot;).checked){
	    document.getElementById(&quot;payAmount1&quot;).disabled=false;
	}else{
	 	document.getElementById(&quot;payAmount1&quot;).disabled=true;
	}
}
//-->

                
                






    
        
            
                                              
                    485UDF3:
                
                
	                
	                	udf3 data
	                
                
            
        
            
                                              
                     :
                
                
					
	                    Select One					
								
										Orange
					
				
            
        
        
    
        
    


                    
            
            
            
            	1 bills selected for payment, totaling 
            
            $
                40.00
            
        
    
    
    checkedNum = 0
    
    
    
    
    	
       Step 2: Enter a Payment Method
       
        
            
                
                
                Payment Type: *
                    Select One
		              Credit Card
Personal Checking
Personal Savings
Business Checking
Check
                    
                
            
            
                
                 
                    
                    
                    
                        
                            Credit Card Information
                            Debit Card Information
                            
                            Please enter the following information about your credit card.
                            
                            
                                
                                    Name Appearing on Card: *
                                    
                                        
                                    
                                       
                                
                                    Cards Accepted:
                                    
                                        
													
										
										           	
										
																				
										
                                    
                                                          
                                
                                    Card Number: *
                                    
                                       
                                        
                                    
                                
                                
                                    
                                        CVV: *
                                        
                                            
                                            
                                            
                                        
                                    
                                
                                
                                    Expiration Date: *
                                     
                                        Month...
                                            01
                                            02
                                            03
                                            04
                                            05
                                            06
                                            07
                                            08
                                            09
                                            10
                                            11
                                            12
                                        Year...
                                            2024
2025
2026
2027
2028
2029
2030
2031
2032
2033
2034
2035
2036
2037
2038
                                    
                                
                            
                              
                        
                        
                        
                            Bank Account Information
                            
                                
                                    Company Name: *
                                    
                                        
                                    
                                
                                
                                    
                                    
                                        
                                    
                                
                                
                                    
                                    
                                        
                                    
                                
                                
                                    Business Tax ID:
                                    
                                        
                                    
                                
                                
                                    
                                    
                                        
                                    
                                
                                
                                    
                                    
                                        
                                    
                                
                                
                                    Routing Number: *
                                    
                                        
                                        
                                    
                                
                                
                                    Account Number: *
                                    
                                        
                                    
                                 
                                 
                                    Confirm Account Number: *
                                    
                                        
                                    
                                
                                
                                    
                                
                            
                        
                        
                        
                            
                                
                                    Billing Address:  
                                     
                                
                                
                                    Address Line 1: *
                                    
                                        
                                    
                                
                                 
		                            Address Line 2:   
		                            
		                                
		                            
		                        
		                         
		                        	Country: *
										
			                        		United States
										
		                        
		                        
                                    
                                    	ZIP:
                                    	*
                                    	
										
                                    
                                    
                                        
                                       	-
                                        
										                                   
                                    
                                
                                
                                    
										City:
										*
									
                                    
                                        
                                    
                                
                                
                                    
                                    	State :
                                    	
                                    		*
                                    	
                                    	
                                    
                                        Select One
                                            Armed Forces Canada                     
Armed Forces Africa                     
Armed Forces Middle East                
Armed Forces Americas                   
Armed Forces Europe                     
Alaska                                  
Alabama                                 
Armed Forces Pacific                    
Arkansas                                
American Samoa                          
Arizona                                 
California                              
Colorado                                
Connecticut                             
District of Columbia                    
Delaware                                
Florida                                 
Federated States of Micronesia          
Georgia                                 
Guam                                    
Hawaii                                  
Iowa                                    
Idaho                                   
Illinois                                
Indiana                                 
Kansas                                  
Kentucky                                
Louisiana                               
Massachusetts                           
Maryland                                
Maine                                   
Marshall Island                         
Michigan                                
Minnesota                               
Missouri                                
Northern Mariana Islands                
Mississippi                             
Montana                                 
North Carolina                          
North Dakota                            
Nebraska                                
New Hampshire                           
New Jersey                              
New Mexico                              
Nevada                                  
New York                                
Ohio                                    
Oklahoma                                
Oregon                                  
Pennsylvania                            
Puerto Rico                             
Palau                                   
Rhode Island                            
South Carolina                          
South Dakota                            
Tennessee                               
Texas                                   
Utah                                    
Virginia                                
Virgin Islands                          
Vermont                                 
Washington                              
Wisconsin                               
West Virginia                           
Wyoming                                 
                                        	
                                    
                                
                            
                            
                          
                        
                            
                                
                                    
                                     
                                     	Receipt Email Address:
                                     
                                     
                                    
                                
							                                                                          
                        
                    
                    
                
            
        
        
                        
                          
	                               ACH Terms &amp;
Conditions HTML: 
                             
                           
                        
       
       
       CC Terms &amp;
 Conditions HTML:
        
            
                
                     
                    
							
                        

                        
                    
                
            
                
      
   


var isHideBillingAddress = false;
var aID = 485;
console.log(&quot;isHideBillingAddress = &quot;+isHideBillingAddress+&quot; aID = &quot;+aID);
		changeCountry(document.getElementById(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;).value);
    	function PaymentCleanInput(val){
    		if(val != 1 &amp;&amp; val != 2 &amp;&amp; val != 3 &amp;&amp; val != 4 &amp;&amp; val != 5){
    			cleanInput(0);
    		}
    		setCityAndStateRequired(val)
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.paymentMethodTypeKey&quot; , &quot;'&quot; , &quot;).value=val;	
    	}
    	
    	
    	console.log(&quot;cc.isHideBillingAddress()   ------ &quot; + cc.getHideBillingAddress());
    	console.log(&quot;applicationConfig.getGuestPaymentsMode().equals(guestPayments)   ------ &quot; + applicationConfig.getGuestPaymentsMode().equals(&quot;guestPayments&quot;));
    	$(&quot;#tblBillingAddress&quot;).show();





                
            
            
            
                
                 
            
            

     


if (document.getElementsByTagName) {
	var formElements = document.getElementsByTagName(&quot;form&quot;);
	for (i=0; formElements[i]; i++) {
		formElements[i].setAttribute(&quot;autocomplete&quot;,&quot;off&quot;);
	}		
}


        &quot;) or . = concat(&quot;
        	












var XSRF_UUID_PARAMETER_KEY = &quot; , &quot;'&quot; , &quot;f4214bec-9a6f-414d-9a9f-84cc386a9100&quot; , &quot;'&quot; , &quot;;
var WAITING_MESSAGE = &quot;Processing...&quot;;
function onchanged(value) {
 setLanguageSelectMessage();
 var ajax = new Ajax();
 ajax.get(&quot; , &quot;'&quot; , &quot;/vbills/mbills/languageSelect.go?action=languageSelect&amp;forgotType=null&amp;locale=&quot; , &quot;'&quot; , &quot;+value, windowReload, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
 }
function windowReload(){
  window.location.reload();
}
function setLanguageSelectMessage() {
    var waitingInfoDiv = getWaitingInfoDivControl();
    waitingInfoDiv.innerHTML = &quot;&lt;strong>&quot;+WAITING_MESSAGE+&quot;&lt;\/strong>&quot; ;
}
function getWaitingInfoDivControl() {
    return document.getElementById(&quot; , &quot;'&quot; , &quot;waitingInfoDiv&quot; , &quot;'&quot; , &quot;);
}














            


     


            

 





  
  
   
   


   


   


function toURL(url){
	var obj = document.getElementById(&quot;toURLForm&quot;);
	obj.action = url;
	obj.submit();
}




            
                
                    
                     
                    
                    









&lt;!--
td.totalMessage{font-size:110%;}
th.obvious{background:#b2b2b2;}
.dis{color:gray;}

.bulb a:link {
    color: #f4f3f3;
    text-decoration: none;
    background-color: #f4f3f3;
}
.bulb a:active {
    color: #f4f3f3;
    text-decoration: none;
    background-color: #f4f3f3;
}
.bulb a:hover {
    color: #f4f3f3;
    text-decoration: none;
    background-color: #f4f3f3;
}
.bulb a:visited {
    color: #f4f3f3;
    text-decoration: none;
    background-color: #f4f3f3;
}
h2{
    color: #000000;
    font-size: 11px;
    font-weight: bold;
    margin: 10px 0;
    padding: 5px 0 0 5px;
    width: 100%;
}
-->


    











&lt;!--
var INITIAL_INDEX = 1;
 var checkedNum = 0;
function getElementsByPrefix(prefix) {
	var element = null;
	var i = INITIAL_INDEX;
	var array = new Array();
	while ((element = document.getElementById(prefix + i)) != null) {
		array[i] = element;
		i = i + 1;
	}
	return array;
}

function getElementsByPrefixByCount(prefix, count) {
	var element = null;
	var array = new Array();
	for (var i = INITIAL_INDEX; i &lt; count; i++) {
		element = document.getElementById(prefix + i)
		array[i] = element;
	}
	return array;
}

function showHideElements(spanArray, targetArray, distargetArray, checkboxArray, showFlag) {
	var i = INITIAL_INDEX;
	/* if(spanArray.length != targetArray.length) {
		return;
	} */
    for(var j=INITIAL_INDEX;j&lt;=targetArray.length;j++){
    	 if (targetArray[j] != null) {
		        if (showFlag) {
		        	targetArray[j].style.display = &quot; , &quot;'&quot; , &quot;block&quot; , &quot;'&quot; , &quot;;
		        	if(spanArray[j] != null){
		        		spanArray[j].innerHTML = contractsymbol;
		        	}
		        } else {
		        	targetArray[j].style.display = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;;
		        	if(spanArray[j] != null){
		        		spanArray[j].innerHTML = expandsymbol;
		        	}
		        }
		    }
    }
}

function checkUncheckBoxes(array, checkFlag) {
	var alltags=document.all? document.all : document.getElementsByTagName(&quot;*&quot;);
	var statecollects=getElementbyClass(alltags, &quot;showstate&quot;);
	var i = INITIAL_INDEX;
	while (array[i] != null) {
	    if (array[i]) {
	    	var formNum = i-1;
	        if (checkFlag) {
	            if(array[i].checked == false){
	        		array[i].checked = true;
	        		setPayAmountFromAmountDue(amountDueArray[i], payAmountArray[i], payAmountSpanArray[i]);
	        	}
	        	
	        	if(document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i) != null){
	        		document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;black&quot;;
				    document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i).style.display=&quot;block&quot;;
				}
	        	
	        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){
	        		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	        			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = false;
	   	    	 }else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }	    
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color = &quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = false;
	   	    	 }else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = false;
	   	    	}else{
		   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}    	    	
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = false;
	   	    	 }else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = false;
	   	    	 }else{
	   	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;black&quot;;
	   	    		}
	   	    	}
	   	    }	
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}	    	    	
	   	    }
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i) != null){
			    	document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;black&quot;;
			    }
			    if(document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i) != null){
				    document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i).disabled=false;
				}
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i) != null){
			    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i).disabled=false;
			    }
			    if(document.getElementById(&quot;c_payDate&quot; + i) != null){
			    	document.getElementById(&quot;c_payDate&quot; + i).style.display=&quot;block&quot;;
			    }
			    if(document.getElementById(&quot;disc_payDate&quot; + i) != null){
					document.getElementById(&quot;disc_payDate&quot; + i).style.display=&quot;none&quot;;
				}
				if(document.getElementById(&quot;time&quot; + i) != null){
					document.getElementById(&quot;time&quot; + i).style.display=&quot;block&quot;;
				}
				if(document.getElementById(&quot;distime&quot; + i) != null){
					document.getElementById(&quot;distime&quot; + i).style.display=&quot;none&quot;;
				}
				if(document.getElementById(&quot;arrow&quot; + i) != null){
					document.getElementById(&quot;arrow&quot; + i).src=&quot;/vbills/_assets/img/b.gif&quot;;
				}

				if(billDetailSpanArray[i] != null){
					billDetailSpanArray[i].innerHTML=&quot; , &quot;'&quot; , &quot;&lt;img src=&quot;/vbills/_assets/img/minus.gif&quot; align=&quot;absmiddle&quot; alt=&quot;Collapse bill details&quot;>&quot; , &quot;'&quot; , &quot;;
				}
	        } else {
	            if(array[i].checked){
		        	array[i].checked = false;
		        	setPayAmountToZero(payAmountArray[i],payAmountSpanArray[i]);
	        	}
	        	
		        if(document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i) != null){
			    	document.getElementById(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;gray&quot;;
			    }
		        if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){
					 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
						 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = true;
			    	 }else{
			        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
			        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = true;
			        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;gray&quot;;
				    	}
				    	}
				    }
				    
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;gray&quot;;
					        }
				        }
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}			    	
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = true;
				    	 }else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = true;
				    	 }else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){
				    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = true;
				    	 }else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
			    if(document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i) != null){
		        	document.getElementById(&quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + i).style.color=&quot;gray&quot;;
		        }
		        if(document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i) != null){
		   	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot; + i).disabled=true;
		   	    }
		   	    if(document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i) != null){
		   	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + i).disabled=true;
		   	    }
		   	    if(document.getElementById(&quot;c_payDate&quot; + i) != null){
		   	    	document.getElementById(&quot;c_payDate&quot; + i).style.display=&quot;none&quot;;
		   	    }
		   	    if(document.getElementById(&quot;disc_payDate&quot; + i) != null){
					document.getElementById(&quot;disc_payDate&quot; + i).style.display=&quot;block&quot;;
				}
				if(document.getElementById(&quot;time&quot; + i) != null){
					document.getElementById(&quot;time&quot; + i).style.display=&quot;none&quot;;
				}
				if(document.getElementById(&quot;distime&quot; + i) != null){
					document.getElementById(&quot;distime&quot; + i).style.display=&quot;block&quot;;	
				}
				if(document.getElementById(&quot;arrow&quot; + i) != null){
					document.getElementById(&quot;arrow&quot; + i).src=&quot;/vbills/_assets/img/a.gif&quot;;
				}
				
	        }
	    }
    	i = i + 1;
	}
	updateTotal();
}
//checkbox
function populatePayAmount(element, amountDueId, payAmountId, spanPayAmountId) {
	if (element.checked) {
		setPayAmountFromAmountDue(document.getElementById(amountDueId), document.getElementById(payAmountId), document.getElementById(spanPayAmountId));
	} else {
		setPayAmountToZero(document.getElementById(payAmountId), document.getElementById(spanPayAmountId));
	}
	updateTotal();
}
function populatePayAmount(element, amountDueId, payAmountId, spanPayAmountId, udfs, countValue) {
    var formNum = countValue - 1;
	var trId = &quot; , &quot;'&quot; , &quot;tr&quot; , &quot;'&quot; , &quot; + countValue;
	var alltags=document.all? document.all : document.getElementsByTagName(&quot;*&quot;);
	var statecollects=getElementbyClass(alltags, &quot;showstate&quot;);
	var pictureObj = document.getElementById(&quot;arrow&quot; + countValue);
	if (pictureObj.src.indexOf(&quot; , &quot;'&quot; , &quot;/vbills/_assets/img/a.gif&quot; , &quot;'&quot; , &quot;) > -1) {	  
	    document.getElementById(&quot; , &quot;'&quot; , &quot;payCheckbox&quot; , &quot;'&quot; , &quot; + countValue).checked = true;
	    
	    if(document.getElementById(udfs) != null){
		    document.getElementById(udfs).style.display=&quot;block&quot;;
		    document.getElementById(udfs).style.color=&quot;black&quot;;
		}

	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }	    
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = false;
	    	}else{
	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color = &quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = false;
	    	 }else{
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = false;
	    	}else{
	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
	    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = false;
	    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;black&quot;;
	    		}
	    	}	    	    	
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = false;
	    	 }else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = false;
	    	 }else{
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }	
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}	    	    	
	    }
	    if(document.getElementById(trId) != null){
		    document.getElementById(trId).style.color=&quot;black&quot;;
        }
        if(document.getElementById(payAmountId) != null)	   {
           document.getElementById(payAmountId).disabled=false;
        }   
	    if( document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue) != null){
	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue).disabled=false;
	    }	   
	    	    
	 		
		if(document.getElementById(&quot;time&quot; + countValue) != null){		
			document.getElementById(&quot;time&quot; + countValue).style.display=&quot;block&quot;;
		}				
		if(document.getElementById(&quot;distime&quot; + countValue) != null){
			document.getElementById(&quot;distime&quot; + countValue).style.display=&quot;none&quot;;
		}		
		if(document.getElementById(&quot;arrow&quot; + countValue)!=null){
			document.getElementById(&quot;arrow&quot; + countValue).src=&quot;/vbills/_assets/img/b.gif&quot;;
		}
		setPayAmountFromAmountDue(document.getElementById(amountDueId), document.getElementById(payAmountId), document.getElementById(spanPayAmountId));	
	} else {
		document.getElementById(&quot; , &quot;'&quot; , &quot;payCheckbox&quot; , &quot;'&quot; , &quot; + countValue).checked = false;
		
		if(document.getElementById(udfs)){
		    document.getElementById(udfs).style.color=&quot;gray&quot;;
		}
		 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){
			 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
				 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = true;
	    	 }else{
	        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
	        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = true;
	        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;gray&quot;;
		    	}
		    }
		   }
		    
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = true;
		    	}else{
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = true;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;gray&quot;;
		    		}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = true;
		    	}else{
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = true;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;gray&quot;;
		       		}
		        }
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = true;
		    	}else{
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = true;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color=&quot;gray&quot;;
		    		}
		    	}		    	
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = true;
		    	 }else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = true;
		    	}else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = true;
		    	 }else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = true;
		    	}else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = true;
		    	 }else{
			    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;select-one&quot; , &quot;'&quot; , &quot;){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = true;
		    	}else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == &quot; , &quot;'&quot; , &quot;text&quot; , &quot;'&quot; , &quot;){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
	    
		if(document.getElementById(trId)){
	        document.getElementById(trId).style.color=&quot;gray&quot;;
	    }
	    if(document.getElementById(payAmountId)){
   	    	document.getElementById(payAmountId).disabled=true;
   	    }
   	    if( document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue) != null){
   	    	document.getElementById(&quot; , &quot;'&quot; , &quot;payDate&quot; , &quot;'&quot; , &quot; + countValue).disabled=true;
   	    }
   	   
		if(document.getElementById(&quot;time&quot; + countValue) != null){
			document.getElementById(&quot;time&quot; + countValue).style.display=&quot;none&quot;;
		}
		if(document.getElementById(&quot;distime&quot; + countValue)!=null){
			document.getElementById(&quot;distime&quot; + countValue).style.display=&quot;block&quot;;
		}
		if(document.getElementById(&quot;arrow&quot; + countValue) != null){
			document.getElementById(&quot;arrow&quot; + countValue).src=&quot;/vbills/_assets/img/a.gif&quot;;
		}
		setPayAmountToZero(document.getElementById(payAmountId), document.getElementById(spanPayAmountId));
	}
	if(billDetailSpanArray[countValue] != null){
		billDetailSpanArray[countValue].innerHTML=&quot; , &quot;'&quot; , &quot;&lt;img src=&quot;/vbills/_assets/img/minus.gif&quot; align=&quot;absmiddle&quot; alt=&quot;Collapse bill details&quot;>&quot; , &quot;'&quot; , &quot;
	}
	updateTotal();

}
function setPayAmountFromAmountDue(amountDue, payAmount, spanPayAmount) {
	payAmount.value = amountDue.value;
	if (spanPayAmount != null) {
		spanPayAmount.innerHTML = payAmount.value;
	}
	checkedNum++;
}

function setPayAmountToZero(payAmount, spanPayAmount) {
	payAmount.value = &quot;0.00&quot;;
	if (spanPayAmount != null) {
		spanPayAmount.innerHTML = payAmount.value;
	}
	checkedNum--;
}

function formatMoney(money) {
	var index = money.indexOf(&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;);
	var len = money.length;
	if (index == -1) {
		return money + &quot;.00&quot;;
	} else if (len - index == 2) {
		return money + &quot;0&quot;;s
	}
	return money;
}

function truncateMoneyValue(moneyValue) {
	var moneyValue = moneyValue.replace(/,/g, &quot;&quot;);
	var index = moneyValue.indexOf(&quot; , &quot;'&quot; , &quot;.&quot; , &quot;'&quot; , &quot;);
	if (index > -1) {
		var len = moneyValue.length;
		if(index &lt; len - 3) {
			moneyValue = moneyValue.substring(0, index + 3);
		}
	}
	return moneyValue;
}

function resetCheckbox(inputField, payCheckboxId,zeroAccepted, amountDueId, consolidateBills) {          
	setTimeout(&quot;timeoutResetCheckbox(&quot; , &quot;'&quot; , &quot;&quot; + inputField.id + &quot;&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&quot; + payCheckboxId + &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; + zeroAccepted + &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; + amountDueId + &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; + consolidateBills + &quot;&quot; , &quot;'&quot; , &quot;);&quot;, 1);
}

function timeoutResetCheckbox(inputFieldId, payCheckboxId, zeroAccepted, amountDueId, consolidateBills) {
	var inputField = document.getElementById(inputFieldId);
	var moneyValue = truncateMoneyValue(inputField.value);
	var floatValue = parseFloat(moneyValue);
	var amountDue = document.getElementById(amountDueId);
	var amountDueValue = truncateMoneyValue(amountDue.value);
	var floatAmountDueValue = parseFloat(amountDueValue);
	
	if (isNaN(floatValue)) {
		inputField.value = &quot;0.00&quot;
		document.getElementById(payCheckboxId).checked = false;
		return;
	}
	inputField.value = formatMoney(floatValue.toString());
	updateTotal();
}

var TOTAL_TO_PAY = &quot; , &quot;'&quot; , &quot;totalToPay&quot; , &quot;'&quot; , &quot;;
var SPAN_TOTAL_TO_PAY = &quot; , &quot;'&quot; , &quot;spanTotalToPay&quot; , &quot;'&quot; , &quot;;
var SAVE_PAYMENT_CHECKBOX_TR = &quot; , &quot;'&quot; , &quot;savePaymentCheckboxTr&quot; , &quot;'&quot; , &quot;;
var STORE_PAYMENT_METHOD_CHKBOX_ID = &quot; , &quot;'&quot; , &quot;storePaymentMethod&quot; , &quot;'&quot; , &quot;;
var SAVE_NICKNAME_TR = &quot; , &quot;'&quot; , &quot;saveNickNameTr&quot; , &quot;'&quot; , &quot;;
var NUM_TOTAL_TO_PAY = &quot; , &quot;'&quot; , &quot;numTotalToPay&quot; , &quot;'&quot; , &quot;;

var checkboxArray = null;
var divArray = null;
var billDetailSpanArray = null;
var payAmountArray = null;
var payAmountSpanArray = null;
var amountDueArray = null;


function initVariables() {
	checkboxArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;payCheckbox&quot; , &quot;'&quot; , &quot;);
	divArray = getElementsByPrefixByCount(&quot; , &quot;'&quot; , &quot;udf&quot; , &quot;'&quot; , &quot;, checkboxArray.length);
	disdivArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;disudf&quot; , &quot;'&quot; , &quot;);
	billDetailSpanArray = getElementsByPrefixByCount(&quot; , &quot;'&quot; , &quot;billDetailsSpan&quot; , &quot;'&quot; , &quot;, checkboxArray.length);
	payAmountArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;payAmount&quot; , &quot;'&quot; , &quot;);
	payAmountSpanArray = getElementsByPrefixByCount(&quot; , &quot;'&quot; , &quot;spanPayAmount&quot; , &quot;'&quot; , &quot;, payAmountArray.length);
	amountDueArray = getElementsByPrefix(&quot; , &quot;'&quot; , &quot;amountDue&quot; , &quot;'&quot; , &quot;);	
}

var BILL_PAYMENT_DERIVED_URL_PREFIX = &quot; , &quot;'&quot; , &quot;/vbills/mbills/billPaymentDerivedField.go?&amp;forgotType=null&quot; , &quot;'&quot; , &quot;;

function outputComma(num) {
    num = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; + num;
    var number = num;
	var decimalPart = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
    if (num.indexOf(&quot;.&quot;)!=-1) {
	  number = num.substring(0,num.indexOf(&quot;.&quot;));
	  decimalPart = num.substring(num.indexOf(&quot;.&quot;) , num.length);
	}
    if (number.length > 3) {
        var mod = number.length%3;
        var output = (mod > 0 ? (number.substring(0,mod)) : &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
        for (i=0 ; i &lt; Math.floor(number.length/3) ; i++) {
            if ((mod ==0) &amp;&amp; (i ==0))
                output+= number.substring(mod+3*i,mod+3*i+3);
            else
                output+= &quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot; + number.substring(mod+3*i,mod+3*i+3);
        }
        return (output)+decimalPart;
    }
    else return number+decimalPart;
}

function updateTotal() {
	var amountArray = new Array();	
	var total=0;
	for (var i = INITIAL_INDEX; i &lt; payAmountArray.length; i++) {
	    if(payAmountArray[i].value == &quot;&quot;){
	    	payAmountArray[i].value = &quot;0.00&quot;;
	    }
		amountArray.push(payAmountArray[i].value);
		total += parseFloat(payAmountArray[i].value.replace(&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;));	

	} 
    document.getElementById(NUM_TOTAL_TO_PAY).innerHTML = checkedNum;
	document.getElementById(TOTAL_TO_PAY).value = outputComma(total.toFixed(2));
	document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = outputComma(total.toFixed(2));
	 
}

function getTotalAmountCalculatedCallback(responseText) {
	var total = handleAjaxResponse(responseText);
	document.getElementById(TOTAL_TO_PAY).value = total;
	document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = total;
}

function handleAjaxResponse(responseText) {
	enableDisableButtons(true);
    var responseArray = eval(responseText);
    if (responseArray[0] == true) {
       return responseArray[1];
    } else {
    	return responseArray[1];
    }   
}

function setCalculatingValueMessage(element) {
	enableDisableButtons(false);
	element.innerHTML = &quot; , &quot;'&quot; , &quot;Calculating ...&quot; , &quot;'&quot; , &quot;;
//    span.className = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
}

function enableDisableButtons(isEnable) {
	document.getElementById(&quot; , &quot;'&quot; , &quot;nextButton&quot; , &quot;'&quot; , &quot;).enabled = isEnable;
}

var LABEL_SUFFIX = &quot; , &quot;'&quot; , &quot; &lt;span class=&quot;requiredField&quot;>*&lt;\/span>&quot; , &quot;'&quot; , &quot;;

function setLabel(id, label, isRequred) {
    if(isRequred) {
            document.getElementById(id).innerHTML = label + LABEL_SUFFIX;
    } else {
            document.getElementById(id).innerHTML = label;
    }
}

PAYMENT_METHOD_SELECTBOX_ID = &quot; , &quot;'&quot; , &quot;selectedPaymentMethod&quot; , &quot;'&quot; , &quot;;
PAYMENT_METHOD_INFO_URL_PREFIX = &quot; , &quot;'&quot; , &quot;/vbills/mbills/paymentMethodInfo.go?&amp;forgotType=null&quot; , &quot;'&quot; , &quot;;
PAYMENT_METHOD_INFO_DIV_ID = &quot; , &quot;'&quot; , &quot;paymentMethodInfoDiv&quot; , &quot;'&quot; , &quot;;
PAYMENT_METHOD_TYPE_FORM_DIV_ID = &quot; , &quot;'&quot; , &quot;paymentMethodTypeFormDiv&quot; , &quot;'&quot; , &quot;;

function toggle() {
	if(area > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; area != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
		document.getElementById(&quot; , &quot;'&quot; , &quot;pay_via_debit_credit&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&quot;;
	}
    var area = safeGetInputValue(PAYMENT_METHOD_SELECTBOX_ID);
    if(area != null &amp;&amp; area != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
	    if(area.indexOf(&quot;_&quot;)  >0 ){
	    	hideShowElementFrfx(PAYMENT_METHOD_TYPE_FORM_DIV_ID, false);
	    	hideShowElementFrfx(SAVE_PAYMENT_CHECKBOX_TR, false);
	    	var str = area.split(&quot;_&quot;);
	    	var arean = &quot;name_&quot; + str[str.length-1];
	    	displayPaymentMethodInfo(arean);
	    } else {
	    	hideShowElementFrfx(PAYMENT_METHOD_INFO_DIV_ID, false);
	    	hideShowElementFrfx(PAYMENT_METHOD_TYPE_FORM_DIV_ID, true);
	    	hideShowElementFrfx(SAVE_PAYMENT_CHECKBOX_TR, true);
	    	if(area==&quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;check_accCondition&quot; , &quot;'&quot; , &quot;,false);
	    //	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;achTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;ccTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,true);
	    	}else{
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;check_accCondition&quot; , &quot;'&quot; , &quot;,false);
	    //	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;achTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;ccTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);
	    	}
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;area_creditCard&quot; , &quot;'&quot; , &quot;, (area == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;));
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;creditCardInfo&quot; , &quot;'&quot; , &quot;,area == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot;);
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;debitCardInfo&quot; , &quot;'&quot; , &quot;,area == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;);
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;area_achPayment&quot; , &quot;'&quot; , &quot;, (area > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; area != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;));
			hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;addressForm&quot; , &quot;'&quot; , &quot;, true);
		    if (area > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; area != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;) {
		    hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;check_accCondition&quot; , &quot;'&quot; , &quot;, true);
		//    hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;achTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,true);
	    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;ccTermsAndConditionsMessage&quot; , &quot;'&quot; , &quot;,false);
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;bankInfo1&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;4&quot; , &quot;'&quot; , &quot;);
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;bankInfo2&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;4&quot; , &quot;'&quot; , &quot;);
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;personalRoutingGif&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;2&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;3&quot; , &quot;'&quot; , &quot;);
		    	hideShowElementFrfx(&quot; , &quot;'&quot; , &quot;businessRoutingGif&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;4&quot; , &quot;'&quot; , &quot;);                
		        setLabel(&quot; , &quot;'&quot; , &quot;bankInfo3&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&lt;span id=&quot;paymentMethod.firstName&quot;>First Name:&lt;/span>&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;2&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;3&quot; , &quot;'&quot; , &quot;);
		        setLabel(&quot; , &quot;'&quot; , &quot;bankInfo4&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&lt;span id=&quot;paymentMethod.lastName&quot;>Last Name:&lt;/span>&quot; , &quot;'&quot; , &quot;, area == &quot; , &quot;'&quot; , &quot;2&quot; , &quot;'&quot; , &quot; || area == &quot; , &quot;'&quot; , &quot;3&quot; , &quot;'&quot; , &quot;);
		    }
	    }
    }
}

function togglePaymentMethodType() {
  	toggle();
    if(document.getElementById(SPAN_TOTAL_TO_PAY) != null &amp;&amp; document.getElementById(TOTAL_TO_PAY) != null){
		document.getElementById(SPAN_TOTAL_TO_PAY).innerHTML = document.getElementById(TOTAL_TO_PAY).value;
    }
}

function toggleSaveNickNameTr() {
	hideShowElementFrfx(SAVE_NICKNAME_TR, document.getElementById(STORE_PAYMENT_METHOD_CHKBOX_ID).checked);
}

function schedulePayment(index) {
    document.getElementById(&quot; , &quot;'&quot; , &quot;schedulePaymentForBillIndex&quot; , &quot;'&quot; , &quot;).value = index;
    submitForm(&quot; , &quot;'&quot; , &quot;billListForm&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;/vbills/mbills/billList.go?action=schedulePayment&amp;forgotType=null&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;You have already submitted this form&quot; , &quot;'&quot; , &quot;);
}

//========= Saved Payment Information Ajax Call

function displayPaymentMethodInfo(selectedId) {
    if (selectedId == &quot;&quot;) {
        return;
    }
    disableElementById(PAYMENT_METHOD_SELECTBOX_ID);
    setWaitingMessageOnInfoDiv();
    var ajax = new Ajax();
    ajax.add(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;, selectedId);
    ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);
    ajax.post(PAYMENT_METHOD_INFO_URL_PREFIX + &quot; , &quot;'&quot; , &quot;&amp;action=getInfo&quot; , &quot;'&quot; , &quot;, paymentMethodInfoCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);  
}

function paymentMethodInfoCallback(responseText) {
    var pmiDiv = getPmiDivControl();
    pmiDiv.innerHTML = responseText;
	hideShowElementFrfx(PAYMENT_METHOD_INFO_DIV_ID, true);
    enableElementById(PAYMENT_METHOD_SELECTBOX_ID);
    if(document.getElementById(&quot;paymentMethodTypeId&quot;) != null){
	    var paymentMethodTypeIdValue = document.getElementById(&quot;paymentMethodTypeId&quot;).value;
	    if(paymentMethodTypeIdValue == &quot;1&quot; || paymentMethodTypeIdValue == &quot;5&quot; ){
	   		document.getElementById(&quot;check_accCondition&quot;).style.display=&quot;none&quot;;
	   	//	document.getElementById(&quot;achTermsAndConditionsMessage&quot;).style.display=&quot;none&quot;;
	   		document.getElementById(&quot;ccTermsAndConditionsMessage&quot;).style.display=&quot;block&quot;;
	    }else{
	    	document.getElementById(&quot;check_accCondition&quot;).style.display=&quot;block&quot;;
	  //  	document.getElementById(&quot;achTermsAndConditionsMessage&quot;).style.display=&quot;block&quot;;
	   		document.getElementById(&quot;ccTermsAndConditionsMessage&quot;).style.display=&quot;none&quot;;
	    }
    }
}

function setWaitingMessageOnInfoDiv() {
    var pmiDiv = getPmiDivControl();
    pmiDiv.innerHTML = &quot; , &quot;'&quot; , &quot;&lt;br/>&lt;strong>Retrieving Information ...&lt;/strong>&quot; , &quot;'&quot; , &quot;;
}

function getPmiDivControl() {
    return document.getElementById(PAYMENT_METHOD_INFO_DIV_ID);
}
 
addOnloadHandler(togglePaymentMethodType);
//addOnloadHandler(toggleSaveNickNameTr);
addOnloadHandler(initVariables);
setFieldsThatNeedToBeClearedBetweenPageFlow([&quot; , &quot;'&quot; , &quot;paymentMethodForm.cardAccountNumber&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;paymentMethodForm.bankAccountNumber&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;paymentMethodForm.cvv&quot; , &quot;'&quot; , &quot;]);
//-->

function PendingBillsSearch(){
	var pageResultNum = document.getElementById(&quot;pageSize&quot;).value;
	var url=&quot;/vbills/mbills/billList.go?action=navigateForGuestPay&amp;forgotType=null&amp;pageNumber=1&amp;pageSize=&quot;+pageResultNum;
	var obj = document.getElementById(&quot;pagingForm&quot;);
	obj.action = url;
	obj.submit();	
}

function wsug(e, str){ 
 var oThis = arguments.callee;
 if(!str) {
  oThis.sug.style.visibility = &quot; , &quot;'&quot; , &quot;hidden&quot; , &quot;'&quot; , &quot;;
  document.onmousemove = null;
  document.getElementById(&quot;helpIMG&quot;).src=&quot;/vbills/_assets/img/help3.gif&quot;;
  return;
 }  
 if(!oThis.sug){  
  var div = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;top:0; left:0; position:absolute; z-index:100; visibility:hidden&quot; , &quot;'&quot; , &quot;;
   div.style.cssText = css;
   div.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  var sug = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css= &quot; , &quot;'&quot; , &quot;font:normal 12px/16px; white-space:nowrap; color:#666; padding:3px; position:absolute; left:0; top:0; z-index:10; background:#f9fdfd; border:1px solid #0aa&quot; , &quot;'&quot; , &quot;;
   sug.style.cssText = css;
   sug.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  var dr = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;position:absolute; top:3px; left:3px; background:#333; filter:alpha(opacity=50); opacity:0.5; z-index:9&quot; , &quot;'&quot; , &quot;;
   dr.style.cssText = css;
   dr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  var ifr = document.createElement(&quot; , &quot;'&quot; , &quot;iframe&quot; , &quot;'&quot; , &quot;), css=&quot; , &quot;'&quot; , &quot;position:absolute; left:0; top:0; z-index:8; filter:alpha(opacity=0); opacity:0&quot; , &quot;'&quot; , &quot;;
   ifr.style.cssText = css;
   ifr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  div.appendChild(ifr);
  div.appendChild(dr);
  div.appendChild(sug);
  div.sug = sug;
  document.body.appendChild(div);
  oThis.sug = div;
  oThis.dr = dr;
  oThis.ifr = ifr;
  div = dr = ifr = sug = null;
 }
 document.getElementById(&quot;helpIMG&quot;).src=&quot;/vbills/_assets/img/help.gif&quot;;
 var e = e || window.event, obj = oThis.sug, dr = oThis.dr, ifr = oThis.ifr;
 obj.sug.innerHTML = str;
 
 var w = obj.sug.offsetWidth, h = obj.sug.offsetHeight, dw = document.documentElement.clientWidth||document.body.clientWidth; dh = document.documentElement.clientHeight || document.body.clientHeight;
 var st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;
 var left = e.clientX +sl +17 + w &lt; dw + sl  &amp;&amp;  e.clientX + sl + 15 || e.clientX +sl-8 - w, top = e.clientY + st +17 + h &lt; dh + st  &amp;&amp;  e.clientY + st + 17 || e.clientY + st - 5 - h;
 obj.style.left = left+ 10 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 obj.style.top = top + 10 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 dr.style.width = w + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 dr.style.height = h + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 ifr.style.width = w + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 ifr.style.height = h + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 obj.style.visibility = &quot; , &quot;'&quot; , &quot;visible&quot; , &quot;'&quot; , &quot;;
 document.onmousemove = function(e){
  var e = e || window.event, st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;
  var left = e.clientX +sl +17 + w &lt; dw + sl  &amp;&amp;  e.clientX + sl + 15 || e.clientX +sl-8 - w, top = e.clientY + st +17 + h &lt; dh + st  &amp;&amp;  e.clientY + st + 17 || e.clientY + st - 5 - h;
  obj.style.left = left + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
  obj.style.top = top + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 }
}
function instruction(e, str){ 
var oThis = arguments.callee;
 if(!str) {
  oThis.sug.style.visibility = &quot; , &quot;'&quot; , &quot;hidden&quot; , &quot;'&quot; , &quot;;
  return;
 }  

 if(!oThis.sug){  
  var div = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;position:fixed; z-index:100; visibility:visibiled; width:220px;&quot; , &quot;'&quot; , &quot;;
   div.style.cssText = css;
   div.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  var sug = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css= &quot; , &quot;'&quot; , &quot;font:normal 12px/16px; color:#666; padding:3px; position:fixed; z-index:10; background:#f9fdfd; border:1px solid #0aa; width:220px;&quot; , &quot;'&quot; , &quot;;
   sug.style.cssText = css;
   sug.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  var dr = document.createElement(&quot; , &quot;'&quot; , &quot;div&quot; , &quot;'&quot; , &quot;), css = &quot; , &quot;'&quot; , &quot;position:fixed; background:#333; filter:alpha(opacity=50); opacity:0.5; z-index:9; width:220px;&quot; , &quot;'&quot; , &quot;;
   dr.style.cssText = css;
   dr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  var ifr = document.createElement(&quot; , &quot;'&quot; , &quot;iframe&quot; , &quot;'&quot; , &quot;), css=&quot; , &quot;'&quot; , &quot;position:fixed; z-index:8; filter:alpha(opacity=0); opacity:0; width:220px;&quot; , &quot;'&quot; , &quot;;
   ifr.style.cssText = css;
   ifr.setAttribute(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;,css);
  div.appendChild(ifr);
  div.appendChild(dr);
  div.appendChild(sug);
  div.sug = sug;
  document.body.appendChild(div);
  oThis.sug = div;
  oThis.dr = dr;
  oThis.ifr = ifr;
  div = dr = ifr = sug = null;
 }

 var e = e , obj = oThis.sug, dr = oThis.dr, ifr = oThis.ifr;
 var pos = findPosition(e);
 obj.sug.innerHTML = str;
 
 var w = obj.sug.offsetWidth, h = obj.sug.offsetHeight, dw = document.documentElement.clientWidth||document.body.clientWidth; dh = document.documentElement.clientHeight || document.body.clientHeight;
 var st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;
 var left = pos[0] +sl +17 + w &lt; dw + sl  &amp;&amp;  pos[0] + sl + 15 || pos[0] +sl-8 - w, top = pos[1] + st + h &lt; dh + st  &amp;&amp;  pos[1] + st || pos[1] + st - 5 - h; obj.style.left = left+ 10 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 obj.style.top = top + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 var left0 = left - w - 50;
 obj.style.left = left0 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 dr.style.width = w + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 dr.style.height = h + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 dr.style.top = top + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 dr.style.left = left0 + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 ifr.style.width = w + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 ifr.style.height = h + 3 + &quot; , &quot;'&quot; , &quot;px&quot; , &quot;'&quot; , &quot;;
 obj.style.visibility = &quot; , &quot;'&quot; , &quot;visible&quot; , &quot;'&quot; , &quot;;

}

function findPosition( oElement ) 
{
  var x2 = 0;
  var y2 = 0;
  var width = oElement.offsetWidth;
  var height = oElement.offsetHeight;
  if( typeof( oElement.offsetParent ) != &quot; , &quot;'&quot; , &quot;undefined&quot; , &quot;'&quot; , &quot; ) 
  {
    for( var posX = 0, posY = 0; oElement; oElement = oElement.offsetParent ) 
    {
      posX += oElement.offsetLeft;
      posY += oElement.offsetTop;      
    }
    x2 = posX + width;
    y2 = posY + height;
    return [ posX, posY ,x2, y2];
    
    } else{
      x2 = oElement.x + width;
      y2 = oElement.y + height;
      return [ oElement.x, oElement.y, x2, y2];
  }
}
		function getStateList(countryId){
			var ajax = new Ajax();
			ajax.add(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;, countryId);
			ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);			
			ajax.get(&quot; , &quot;'&quot; , &quot;/vbills/mbills/stateInfo.go?action=getStateTypesByCountry&amp;forgotType=null&quot; , &quot;'&quot; , &quot; + &quot; , &quot;'&quot; , &quot;&amp;action=getStateTypesByCountry&quot; , &quot;'&quot; , &quot;, stateTypeByCountryCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
		}
		function stateTypeByCountryCallback(responseText){
			var datalist = responseText.parseJSON();
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.state&quot; , &quot;'&quot; , &quot;).innerHTML= datalist.stateLabel;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.stateLabel&quot; , &quot;'&quot; , &quot;).value= datalist.stateLabel;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.zipCode&quot; , &quot;'&quot; , &quot;).innerHTML= datalist.zipLabel;
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.zipLabel&quot; , &quot;'&quot; , &quot;).value=datalist.zipLabelKey;
			if(datalist.stateList.length>0){
				showStateSelect();
				document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&quot;;
				for(var i=0;i&lt;datalist.stateList.length;i++){
					var option = document.createElement(&quot;option&quot;);
					var rs =  datalist.stateList[i];
					option.value = rs.id;
                    option.innerHTML = rs.value;
                    document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).appendChild(option);           
				}
			}else{
				hideStateSelect();
			}
		}
        
       
        function changeCountry(val){
        	if(val != 840){
        		hideZipCodeSplit();
        		
        	}else{
        		showZipCodeSplit();
        	}
			var paymentMethodType = document.getElementById(&quot; , &quot;'&quot; , &quot;selectedPaymentMethod&quot; , &quot;'&quot; , &quot;).value;
        	if(65 > 1){        		
		 		showStateSelect();
		 	}else{		 		
		 		hideStateSelect();
		 	}

			if(paymentMethodType == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || paymentMethodType == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
				document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
				document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
			} 
			if(paymentMethodType > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; paymentMethodType != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
				if(val == 840){
        			document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
        			document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
        		}else{
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
				}
			}	
        }
        function showStateSelect(){
        	document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.state&quot;);
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);
        }
        function hideStateSelect(){
        	document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.stateCode&quot;);
        }
        function cleanInput(val){
			var paymentMethodType = document.getElementById(&quot; , &quot;'&quot; , &quot;selectedPaymentMethod&quot; , &quot;'&quot; , &quot;).value;

			if(paymentMethodType == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || paymentMethodType == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
				if(840 == val){
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
				}else{
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
				}
			}
			if(paymentMethodType > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; paymentMethodType != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
				if(840 == val){
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
				}else{
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).value = &quot;&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
				}
					
			}	
        }
        
        function showZipCodeSplit(){
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.zipCode&quot;);
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;zipSplit&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);
        }
        function hideZipCodeSplit(){
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;&quot;);
        	document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
        	document.getElementById(&quot; , &quot;'&quot; , &quot;zipSplit&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).style.display=&quot;&quot;;
       		document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode_input&quot; , &quot;'&quot; , &quot;).setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.zipCode&quot;);
        }
        
        function linkageStateAndCountry(val){
        	if(val != 840){
        		hideZipCodeSplit();
        		
        	}else{
        		showZipCodeSplit();
        	}
	        cleanInput(val);
	        getStateList(val);
        }
        function is_valid_zip(zip) {
			var re = /^\d{5}(\d{4})?$/;
			return re.test(zip);
		}
        function alertErrMsg(){
				//document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&lt;ul>&lt;li>ZIP_Code is not valid.&lt;/li>&lt;/ul>&quot;;
        		//document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;block&quot;;        	
        }
        function zipCodeValidate(){
        	var countryId = document.getElementById(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;).value;
        	
        		
            	var current = document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCode&quot; , &quot;'&quot; , &quot;).value; // + document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.zipCodeExt&quot; , &quot;'&quot; , &quot;).value;
            	if( !is_valid_zip(current)){
            		//alert errors.
            		alertErrMsg();
            	}else{
            		document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
            		var ajax = new Ajax();
        			ajax.add(&quot;zipCode&quot; , current);
        			ajax.add(&quot;countryId&quot;,countryId);
        	        ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);
        			ajax.post(&quot; , &quot;'&quot; , &quot;/vbills/mbills/validateZipCode.go?action=getValidateZipCode&amp;forgotType=null&quot; , &quot;'&quot; , &quot; + &quot; , &quot;'&quot; , &quot;&amp;action=getStateTypesByCountry&quot; , &quot;'&quot; , &quot;,zipCodeValidateCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
            	}
        	
		}
		function zipCodeValidateCallback(responseText){
			var data = responseText.parseJSON();
			if(data!=null &amp;&amp; data !=&quot;&quot;){
				document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
				document.getElementById(&quot; , &quot;'&quot; , &quot;billingAddressForm.city&quot; , &quot;'&quot; , &quot;).value=data.city;
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).style.display=&quot;block&quot;){
					document.getElementById(&quot; , &quot;'&quot; , &quot;state&quot; , &quot;'&quot; , &quot;).value=data.state.id;
				}else{
					document.getElementById(&quot; , &quot;'&quot; , &quot;input_state&quot; , &quot;'&quot; , &quot;).value = data.state.value;
				}
			}else{
				alertErrMsg();
			}
		}
		function setCityAndStateRequired (val){
			if(val == &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; || val == &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
				document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
				document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
			} 
			if(val > &quot; , &quot;'&quot; , &quot;1&quot; , &quot;'&quot; , &quot; &amp;&amp; val != &quot; , &quot;'&quot; , &quot;5&quot; , &quot;'&quot; , &quot;){
				if(document.getElementById(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;).value == 840){
        			document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
        			document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
        		}else{
					document.getElementById(&quot; , &quot;'&quot; , &quot;stateRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
					document.getElementById(&quot; , &quot;'&quot; , &quot;cityRequired&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;*&quot;;
				}
			}
		}

		function rtnValidate(){

			var rtnString = document.getElementById(&quot; , &quot;'&quot; , &quot;routingNumber&quot; , &quot;'&quot; , &quot;).value;
			var ajax = new Ajax();
			ajax.add(&quot;rtnStr&quot; , rtnString);
			ajax.add(&quot; , &quot;'&quot; , &quot;uuid&quot; , &quot;'&quot; , &quot;, XSRF_UUID_PARAMETER_KEY);
			ajax.post(&quot; , &quot;'&quot; , &quot;/vbills/mbills/RTNValidate.go?action=rtnValidation&amp;forgotType=null&quot; , &quot;'&quot; , &quot; + &quot; , &quot;'&quot; , &quot;&amp;action=AchRTNValidate&quot; , &quot;'&quot; , &quot;,rtnValidateCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);

		}
		function rtnValidateCallback(responseText){
			var data = responseText.parseJSON();
			if(data!=null &amp;&amp; data !=&quot;&quot;){
				if(data.message !=null &amp;&amp; data.message){
					document.getElementById(&quot; , &quot;'&quot; , &quot;routingError&quot; , &quot;'&quot; , &quot;).innerHTML= data.message;
				}else{
					document.getElementById(&quot; , &quot;'&quot; , &quot;routingError&quot; , &quot;'&quot; , &quot;).innerHTML= &quot;Invalid Routing Number&quot;;
				}
			}
		}
		
		function debitCardNumberValidate(cardNumber){
					document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
            		var ajax = new Ajax();
            	    ajax.add(&quot; , &quot;'&quot; , &quot;cn&quot; , &quot;'&quot; , &quot;, cardNumber);
            	    ajax.get(PAYMENT_METHOD_INFO_URL_PREFIX + &quot; , &quot;'&quot; , &quot;&amp;action=debitCardNumberValidate&quot; , &quot;'&quot; , &quot;, debitCardNumberValidateCallback, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);  
		}
		function debitCardNumberValidateCallback(responseText){
			var data = responseText.parseJSON();
			if(data!=null &amp;&amp; data !=&quot;&quot;){
				document.getElementById(&quot; , &quot;'&quot; , &quot;errors&quot; , &quot;'&quot; , &quot;).style.display=&quot;none&quot;;
				var isDebit = data.isDebit;

				if(isDebit == &quot; , &quot;'&quot; , &quot;true&quot; , &quot;'&quot; , &quot;){
					document.getElementById(&quot; , &quot;'&quot; , &quot;pay_via_debit_credit&quot; , &quot;'&quot; , &quot;).innerHTML=&quot; , &quot;'&quot; , &quot;&lt;table width=&quot;100%&quot; border=&quot;0&quot; cellspacing=&quot;0&quot; cellpadding=&quot;0&quot;>&quot; , &quot;'&quot; , &quot;+
		                &quot; , &quot;'&quot; , &quot; &lt;tr>&lt;td class=&quot;strong&quot; width=&quot;40%&quot;>&lt;span >Process As Debit Credit:&lt;/span>&lt;/td>&quot; , &quot;'&quot; , &quot;+
		                  &quot; , &quot;'&quot; , &quot; &lt;td width=&quot;60%&quot;>&lt;input type=&quot;radio&quot; name=&quot;payViaDebitCredit&quot; value=&quot;true&quot; />&amp;nbsp;Yes&amp;nbsp;&amp;nbsp;&quot; , &quot;'&quot; , &quot; +
		                  &quot; , &quot;'&quot; , &quot; &lt;input type=&quot;radio&quot; name=&quot;payViaDebitCredit&quot; value=&quot;false&quot; checked />No&quot; , &quot;'&quot; , &quot; +
	                      &quot; , &quot;'&quot; , &quot;&lt;/td>&quot; , &quot;'&quot; , &quot;+
	                 &quot; , &quot;'&quot; , &quot; &lt;/tr>&quot; , &quot;'&quot; , &quot; +
	             &quot; , &quot;'&quot; , &quot; &lt;/table>&quot; , &quot;'&quot; , &quot;;
				}else{
					document.getElementById(&quot; , &quot;'&quot; , &quot;pay_via_debit_credit&quot; , &quot;'&quot; , &quot;).innerHTML=&quot;&quot;;
				}
			}else{
				alertErrMsg();
			}
		}
		function openNewWindow(clientAccountNumber,lookupValue1,lookupValue2,lookupValue3){
			/*alert(clientAccountNumber.value);
			alert(lookupValue1.value);
			alert(lookupValue2.value);
			alert(lookupValue3.value);*/
			
			var url = &quot; , &quot;'&quot; , &quot;https://aws.amazon.com&quot; , &quot;'&quot; , &quot;;
			window.open(url, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;width=800,height=600&quot; , &quot;'&quot; , &quot;);
		}
		$(&quot;#addressForm&quot;).show();
    		var isHideBillingAddress = false;
    		console.log(&quot;cc.getHideBillingAddress() - &quot; + isHideBillingAddress);



&lt;!--

var currentDay = new Date(); var thisYear =  currentDay.getFullYear(); var nextYear = currentDay.getFullYear() + 1; var dateRange=[thisYear,nextYear];function customInit() {var foo=1;}function dateStatusHandler(date, y, m, d) {    var today = new Date();    var myYesterday=new Date();myYesterday.setDate(today.getDate() - 1);if (date &lt;= myYesterday) {return &quot;special&quot;;} else {return false;}} function customCheckBox(obj, checkboxArray, udfscope) { var foo=1; } function customOnChangeUdf1(obj) { var foo=1; } function customOnChangeUdf2(obj) { var foo=1; } function customOnChangeUdf3(obj) { var foo=1; } function customOnChangeUdf4(obj) { var foo=1; } function customOnChangeUdf5(obj) { var foo=1; } function customOnChangeUdf6(obj) { var foo=1; } function customOnChangeUdf7(obj) { var foo=1; } function customOnChangeUdf8(obj) { var foo=1; } function customOnChangeUdf9(obj) { var foo=1; } function customOnChangeUdf10(obj) { var foo=1; }
addOnloadHandler(customInit);
//-->





    

    Available Bill Label
    * Indicates required field 
	
	Step 1: Pay Your Bill Label(s) By Checking One or More Checkboxes in the &quot;Check to Pay&quot; Column Below.  
	

    
	
	
		 One bill found.
				 
			
	    	
	    		Display102550 results
	    		
				
					
			
		
	
	
	
	
    
	
    
 		   
        Select All /
        Unselect All |  
        Show All /
        Hide All 
     
    
        
            Check to Pay
            Bill Label
	   		             
             
	            Due Date 
	         

            Pay Date

         
	            Amount Due 
	     

            Amount to Pay
            
            
           
        

        

	
    
    
                
	



               
                
                    
                        
                    
                   
                  
 485bills




	
	    04/01/2026
	    
	
 
    

               	

       		 
        		 
       		 
       

         
    

	
	$40.00

	
	
	
$


&lt;!--
if(document.getElementById(&quot;payCheckbox1&quot;) != null){
	if(document.getElementById(&quot;payCheckbox1&quot;).checked){
	    document.getElementById(&quot;payAmount1&quot;).disabled=false;
	}else{
	 	document.getElementById(&quot;payAmount1&quot;).disabled=true;
	}
}
//-->

                
                






    
        
            
                                              
                    485UDF3:
                
                
	                
	                	udf3 data
	                
                
            
        
            
                                              
                     :
                
                
					
	                    Select One					
								
										Orange
					
				
            
        
        
    
        
    


                    
            
            
            
            	1 bills selected for payment, totaling 
            
            $
                40.00
            
        
    
    
    checkedNum = 0
    
    
    
    
    	
       Step 2: Enter a Payment Method
       
        
            
                
                
                Payment Type: *
                    Select One
		              Credit Card
Personal Checking
Personal Savings
Business Checking
Check
                    
                
            
            
                
                 
                    
                    
                    
                        
                            Credit Card Information
                            Debit Card Information
                            
                            Please enter the following information about your credit card.
                            
                            
                                
                                    Name Appearing on Card: *
                                    
                                        
                                    
                                       
                                
                                    Cards Accepted:
                                    
                                        
													
										
										           	
										
																				
										
                                    
                                                          
                                
                                    Card Number: *
                                    
                                       
                                        
                                    
                                
                                
                                    
                                        CVV: *
                                        
                                            
                                            
                                            
                                        
                                    
                                
                                
                                    Expiration Date: *
                                     
                                        Month...
                                            01
                                            02
                                            03
                                            04
                                            05
                                            06
                                            07
                                            08
                                            09
                                            10
                                            11
                                            12
                                        Year...
                                            2024
2025
2026
2027
2028
2029
2030
2031
2032
2033
2034
2035
2036
2037
2038
                                    
                                
                            
                              
                        
                        
                        
                            Bank Account Information
                            
                                
                                    Company Name: *
                                    
                                        
                                    
                                
                                
                                    
                                    
                                        
                                    
                                
                                
                                    
                                    
                                        
                                    
                                
                                
                                    Business Tax ID:
                                    
                                        
                                    
                                
                                
                                    
                                    
                                        
                                    
                                
                                
                                    
                                    
                                        
                                    
                                
                                
                                    Routing Number: *
                                    
                                        
                                        
                                    
                                
                                
                                    Account Number: *
                                    
                                        
                                    
                                 
                                 
                                    Confirm Account Number: *
                                    
                                        
                                    
                                
                                
                                    
                                
                            
                        
                        
                        
                            
                                
                                    Billing Address:  
                                     
                                
                                
                                    Address Line 1: *
                                    
                                        
                                    
                                
                                 
		                            Address Line 2:   
		                            
		                                
		                            
		                        
		                         
		                        	Country: *
										
			                        		United States
										
		                        
		                        
                                    
                                    	ZIP:
                                    	*
                                    	
										
                                    
                                    
                                        
                                       	-
                                        
										                                   
                                    
                                
                                
                                    
										City:
										*
									
                                    
                                        
                                    
                                
                                
                                    
                                    	State :
                                    	
                                    		*
                                    	
                                    	
                                    
                                        Select One
                                            Armed Forces Canada                     
Armed Forces Africa                     
Armed Forces Middle East                
Armed Forces Americas                   
Armed Forces Europe                     
Alaska                                  
Alabama                                 
Armed Forces Pacific                    
Arkansas                                
American Samoa                          
Arizona                                 
California                              
Colorado                                
Connecticut                             
District of Columbia                    
Delaware                                
Florida                                 
Federated States of Micronesia          
Georgia                                 
Guam                                    
Hawaii                                  
Iowa                                    
Idaho                                   
Illinois                                
Indiana                                 
Kansas                                  
Kentucky                                
Louisiana                               
Massachusetts                           
Maryland                                
Maine                                   
Marshall Island                         
Michigan                                
Minnesota                               
Missouri                                
Northern Mariana Islands                
Mississippi                             
Montana                                 
North Carolina                          
North Dakota                            
Nebraska                                
New Hampshire                           
New Jersey                              
New Mexico                              
Nevada                                  
New York                                
Ohio                                    
Oklahoma                                
Oregon                                  
Pennsylvania                            
Puerto Rico                             
Palau                                   
Rhode Island                            
South Carolina                          
South Dakota                            
Tennessee                               
Texas                                   
Utah                                    
Virginia                                
Virgin Islands                          
Vermont                                 
Washington                              
Wisconsin                               
West Virginia                           
Wyoming                                 
                                        	
                                    
                                
                            
                            
                          
                        
                            
                                
                                    
                                     
                                     	Receipt Email Address:
                                     
                                     
                                    
                                
							                                                                          
                        
                    
                    
                
            
        
        
                        
                          
	                               ACH Terms &amp;
Conditions HTML: 
                             
                           
                        
       
       
       CC Terms &amp;
 Conditions HTML:
        
            
                
                     
                    
							
                        

                        
                    
                
            
                
      
   


var isHideBillingAddress = false;
var aID = 485;
console.log(&quot;isHideBillingAddress = &quot;+isHideBillingAddress+&quot; aID = &quot;+aID);
		changeCountry(document.getElementById(&quot; , &quot;'&quot; , &quot;countryId&quot; , &quot;'&quot; , &quot;).value);
    	function PaymentCleanInput(val){
    		if(val != 1 &amp;&amp; val != 2 &amp;&amp; val != 3 &amp;&amp; val != 4 &amp;&amp; val != 5){
    			cleanInput(0);
    		}
    		setCityAndStateRequired(val)
			document.getElementById(&quot; , &quot;'&quot; , &quot;address.paymentMethodTypeKey&quot; , &quot;'&quot; , &quot;).value=val;	
    	}
    	
    	
    	console.log(&quot;cc.isHideBillingAddress()   ------ &quot; + cc.getHideBillingAddress());
    	console.log(&quot;applicationConfig.getGuestPaymentsMode().equals(guestPayments)   ------ &quot; + applicationConfig.getGuestPaymentsMode().equals(&quot;guestPayments&quot;));
    	$(&quot;#tblBillingAddress&quot;).show();





                
            
            
            
                
                 
            
            

     


if (document.getElementsByTagName) {
	var formElements = document.getElementsByTagName(&quot;form&quot;);
	for (i=0; formElements[i]; i++) {
		formElements[i].setAttribute(&quot;autocomplete&quot;,&quot;off&quot;);
	}		
}


        &quot;))]</value>
      <webElementGuid>0e56e945-f723-441a-b503-dc1355acc2c2</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
