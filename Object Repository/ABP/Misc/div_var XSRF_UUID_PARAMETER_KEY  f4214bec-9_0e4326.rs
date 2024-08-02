<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_var XSRF_UUID_PARAMETER_KEY  f4214bec-9_0e4326</name>
   <tag></tag>
   <elementGuidId>72422ea1-5bc9-41a4-bc0c-d6e769cb38aa</elementGuidId>
   <selectorCollection>
      <entry>
         <key>BASIC</key>
         <value>//*[(text() = concat(&quot;
        	












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
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>6b6ac95a-b279-4fc6-accf-59618b16fd75</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>shell</value>
      <webElementGuid>d5d5a334-a964-4bd2-b0ef-6354ba112b1a</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        	












var XSRF_UUID_PARAMETER_KEY = 'f4214bec-9a6f-414d-9a9f-84cc386a9100';
var WAITING_MESSAGE = &quot;Processing...&quot;;
function onchanged(value) {
 setLanguageSelectMessage();
 var ajax = new Ajax();
 ajax.get('/vbills/mbills/languageSelect.go?action=languageSelect&amp;forgotType=null&amp;locale='+value, windowReload, '');
 }
function windowReload(){
  window.location.reload();
}
function setLanguageSelectMessage() {
    var waitingInfoDiv = getWaitingInfoDivControl();
    waitingInfoDiv.innerHTML = &quot;&lt;strong>&quot;+WAITING_MESSAGE+&quot;&lt;\/strong>&quot; ;
}
function getWaitingInfoDivControl() {
    return document.getElementById('waitingInfoDiv');
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
		        	targetArray[j].style.display = 'block';
		        	if(spanArray[j] != null){
		        		spanArray[j].innerHTML = contractsymbol;
		        	}
		        } else {
		        	targetArray[j].style.display = 'none';
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
	        	
	        	if(document.getElementById('udf' + i) != null){
	        		document.getElementById('udf' + i).style.color=&quot;black&quot;;
				    document.getElementById('udf' + i).style.display=&quot;block&quot;;
				}
	        	
	        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){
	        		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'select-one'){
	        			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = false;
	   	    	 }else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'text'){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }	    
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'select-one'){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'text'){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'select-one'){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'text'){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'select-one'){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'text'){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color = &quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'select-one'){
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = false;
	   	    	 }else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'text'){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'select-one'){
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = false;
	   	    	}else{
		   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'text'){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}    	    	
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'select-one'){
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = false;
	   	    	 }else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'text'){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'select-one'){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'text'){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}
	   	    }
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){
	   	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'select-one'){
	   	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = false;
	   	    	 }else{
	   	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'text'){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;black&quot;;
	   	    		}
	   	    	}
	   	    }	
	   	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){
	   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'select-one'){
	   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = false;
	   	    	}else{
		   	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'text'){
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = false;
		   	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;black&quot;;
		   	    	}
	   	    	}	    	    	
	   	    }
				if(document.getElementById('tr' + i) != null){
			    	document.getElementById('tr' + i).style.color=&quot;black&quot;;
			    }
			    if(document.getElementById('payAmount' + i) != null){
				    document.getElementById('payAmount' + i).disabled=false;
				}
				if(document.getElementById('payDate' + i) != null){
			    	document.getElementById('payDate' + i).disabled=false;
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
					billDetailSpanArray[i].innerHTML='&lt;img src=&quot;/vbills/_assets/img/minus.gif&quot; align=&quot;absmiddle&quot; alt=&quot;Collapse bill details&quot;>';
				}
	        } else {
	            if(array[i].checked){
		        	array[i].checked = false;
		        	setPayAmountToZero(payAmountArray[i],payAmountSpanArray[i]);
	        	}
	        	
		        if(document.getElementById('udf' + i) != null){
			    	document.getElementById('udf' + i).style.color=&quot;gray&quot;;
			    }
		        if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){
					 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'select-one'){
						 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = true;
			    	 }else{
			        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'text'){
			        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = true;
			        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;gray&quot;;
				    	}
				    	}
				    }
				    
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'select-one'){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'text'){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'select-one'){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'text'){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;gray&quot;;
					        }
				        }
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'select-one'){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'text'){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}			    	
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'select-one'){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = true;
				    	 }else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'text'){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'select-one'){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'text'){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'select-one'){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = true;
				    	 }else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'text'){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'select-one'){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'text'){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){
				    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'select-one'){
				    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = true;
				    	 }else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'text'){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
				    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){
				    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'select-one'){
				    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = true;
				    	}else{
					    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'text'){
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].readOnly = true;
					    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].style.color=&quot;gray&quot;;
					    	}
				    	}
				    }
			    if(document.getElementById('tr' + i) != null){
		        	document.getElementById('tr' + i).style.color=&quot;gray&quot;;
		        }
		        if(document.getElementById('payAmount' + i) != null){
		   	    	document.getElementById('payAmount' + i).disabled=true;
		   	    }
		   	    if(document.getElementById('payDate' + i) != null){
		   	    	document.getElementById('payDate' + i).disabled=true;
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
	var trId = 'tr' + countValue;
	var alltags=document.all? document.all : document.getElementsByTagName(&quot;*&quot;);
	var statecollects=getElementbyClass(alltags, &quot;showstate&quot;);
	var pictureObj = document.getElementById(&quot;arrow&quot; + countValue);
	if (pictureObj.src.indexOf('/vbills/_assets/img/a.gif') > -1) {	  
	    document.getElementById('payCheckbox' + countValue).checked = true;
	    
	    if(document.getElementById(udfs) != null){
		    document.getElementById(udfs).style.display=&quot;block&quot;;
		    document.getElementById(udfs).style.color=&quot;black&quot;;
		}

	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'select-one'){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'text'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }	    
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'select-one'){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'text'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'select-one'){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = false;
	    	}else{
	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'text'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'select-one'){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'text'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color = &quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'select-one'){
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = false;
	    	 }else{
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'text'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'select-one'){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = false;
	    	}else{
	    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'text'){
	    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = false;
	    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;black&quot;;
	    		}
	    	}	    	    	
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'select-one'){
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = false;
	    	 }else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'text'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'select-one'){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'text'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){
	    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'select-one'){
	    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = false;
	    	 }else{
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'text'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = false;
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;black&quot;;
		    	}
	    	}
	    }	
	    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){
	    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'select-one'){
	    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = false;
	    	}else{
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'text'){
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
	    if( document.getElementById('payDate' + countValue) != null){
	    	document.getElementById('payDate' + countValue).disabled=false;
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
		document.getElementById('payCheckbox' + countValue).checked = false;
		
		if(document.getElementById(udfs)){
		    document.getElementById(udfs).style.color=&quot;gray&quot;;
		}
		 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;).length > 0){
			 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'select-one'){
				 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].disabled = true;
	    	 }else{
	        	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].type == 'text'){
	        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].readOnly = true;
	        		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField1&quot;)[0].style.color=&quot;gray&quot;;
		    	}
		    }
		   }
		    
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'select-one'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].disabled = true;
		    	}else{
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].type == 'text'){
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].readOnly = true;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField2&quot;)[0].style.color=&quot;gray&quot;;
		    		}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'select-one'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].disabled = true;
		    	}else{
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].type == 'text'){
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].readOnly = true;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField3&quot;)[0].style.color=&quot;gray&quot;;
		       		}
		        }
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'select-one'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].disabled = true;
		    	}else{
		    		if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].type == 'text'){
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].readOnly = true;
		    			document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField4&quot;)[0].style.color=&quot;gray&quot;;
		    		}
		    	}		    	
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'select-one'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].disabled = true;
		    	 }else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].type == 'text'){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField5&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'select-one'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].disabled = true;
		    	}else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].type == 'text'){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField6&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'select-one'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].disabled = true;
		    	 }else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].type == 'text'){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField7&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'select-one'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].disabled = true;
		    	}else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].type == 'text'){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField8&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;).length > 0){
		    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'select-one'){
		    		 document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].disabled = true;
		    	 }else{
			    	 if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].type == 'text'){
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].readOnly = true;
			    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField9&quot;)[0].style.color=&quot;gray&quot;;
			    	}
		    	}
		    }
		    if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;) != null &amp;&amp; document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;).length > 0){
		    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'select-one'){
		    		document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].disabled = true;
		    	}else{
			    	if(document.getElementsByName(&quot;billDetailForms[&quot; + formNum + &quot;].billerDefinedField10&quot;)[0].type == 'text'){
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
   	    if( document.getElementById('payDate' + countValue) != null){
   	    	document.getElementById('payDate' + countValue).disabled=true;
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
		billDetailSpanArray[countValue].innerHTML='&lt;img src=&quot;/vbills/_assets/img/minus.gif&quot; align=&quot;absmiddle&quot; alt=&quot;Collapse bill details&quot;>'
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
	var index = money.indexOf('.');
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
	var index = moneyValue.indexOf('.');
	if (index > -1) {
		var len = moneyValue.length;
		if(index &lt; len - 3) {
			moneyValue = moneyValue.substring(0, index + 3);
		}
	}
	return moneyValue;
}

function resetCheckbox(inputField, payCheckboxId,zeroAccepted, amountDueId, consolidateBills) {          
	setTimeout(&quot;timeoutResetCheckbox('&quot; + inputField.id + &quot;', '&quot; + payCheckboxId + &quot;','&quot; + zeroAccepted + &quot;','&quot; + amountDueId + &quot;','&quot; + consolidateBills + &quot;');&quot;, 1);
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

var TOTAL_TO_PAY = 'totalToPay';
var SPAN_TOTAL_TO_PAY = 'spanTotalToPay';
var SAVE_PAYMENT_CHECKBOX_TR = 'savePaymentCheckboxTr';
var STORE_PAYMENT_METHOD_CHKBOX_ID = 'storePaymentMethod';
var SAVE_NICKNAME_TR = 'saveNickNameTr';
var NUM_TOTAL_TO_PAY = 'numTotalToPay';

var checkboxArray = null;
var divArray = null;
var billDetailSpanArray = null;
var payAmountArray = null;
var payAmountSpanArray = null;
var amountDueArray = null;


function initVariables() {
	checkboxArray = getElementsByPrefix('payCheckbox');
	divArray = getElementsByPrefixByCount('udf', checkboxArray.length);
	disdivArray = getElementsByPrefix('disudf');
	billDetailSpanArray = getElementsByPrefixByCount('billDetailsSpan', checkboxArray.length);
	payAmountArray = getElementsByPrefix('payAmount');
	payAmountSpanArray = getElementsByPrefixByCount('spanPayAmount', payAmountArray.length);
	amountDueArray = getElementsByPrefix('amountDue');	
}

var BILL_PAYMENT_DERIVED_URL_PREFIX = '/vbills/mbills/billPaymentDerivedField.go?&amp;forgotType=null';

function outputComma(num) {
    num = '' + num;
    var number = num;
	var decimalPart = '';
    if (num.indexOf(&quot;.&quot;)!=-1) {
	  number = num.substring(0,num.indexOf(&quot;.&quot;));
	  decimalPart = num.substring(num.indexOf(&quot;.&quot;) , num.length);
	}
    if (number.length > 3) {
        var mod = number.length%3;
        var output = (mod > 0 ? (number.substring(0,mod)) : '');
        for (i=0 ; i &lt; Math.floor(number.length/3) ; i++) {
            if ((mod ==0) &amp;&amp; (i ==0))
                output+= number.substring(mod+3*i,mod+3*i+3);
            else
                output+= ',' + number.substring(mod+3*i,mod+3*i+3);
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
		total += parseFloat(payAmountArray[i].value.replace(',',''));	

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
	element.innerHTML = 'Calculating ...';
//    span.className = '';
}

function enableDisableButtons(isEnable) {
	document.getElementById('nextButton').enabled = isEnable;
}

var LABEL_SUFFIX = ' &lt;span class=&quot;requiredField&quot;>*&lt;\/span>';

function setLabel(id, label, isRequred) {
    if(isRequred) {
            document.getElementById(id).innerHTML = label + LABEL_SUFFIX;
    } else {
            document.getElementById(id).innerHTML = label;
    }
}

PAYMENT_METHOD_SELECTBOX_ID = 'selectedPaymentMethod';
PAYMENT_METHOD_INFO_URL_PREFIX = '/vbills/mbills/paymentMethodInfo.go?&amp;forgotType=null';
PAYMENT_METHOD_INFO_DIV_ID = 'paymentMethodInfoDiv';
PAYMENT_METHOD_TYPE_FORM_DIV_ID = 'paymentMethodTypeFormDiv';

function toggle() {
	if(area > '1' &amp;&amp; area != '5'){
		document.getElementById('pay_via_debit_credit').innerHTML=&quot;&quot;;
	}
    var area = safeGetInputValue(PAYMENT_METHOD_SELECTBOX_ID);
    if(area != null &amp;&amp; area != ''){
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
	    	if(area=='1' || area == '5'){
	    	hideShowElementFrfx('check_accCondition',false);
	    //	hideShowElementFrfx('achTermsAndConditionsMessage',false);
	    	hideShowElementFrfx('ccTermsAndConditionsMessage',true);
	    	}else{
	    	hideShowElementFrfx('check_accCondition',false);
	    //	hideShowElementFrfx('achTermsAndConditionsMessage',false);
	    	hideShowElementFrfx('ccTermsAndConditionsMessage',false);
	    	}
			hideShowElementFrfx('area_creditCard', (area == '1' || area == '5'));
			hideShowElementFrfx('creditCardInfo',area == '1');
			hideShowElementFrfx('debitCardInfo',area == '5');
			hideShowElementFrfx('area_achPayment', (area > '1' &amp;&amp; area != '5'));
			hideShowElementFrfx('addressForm', true);
		    if (area > '1' &amp;&amp; area != '5') {
		    hideShowElementFrfx('check_accCondition', true);
		//    hideShowElementFrfx('achTermsAndConditionsMessage',true);
	    	hideShowElementFrfx('ccTermsAndConditionsMessage',false);
		    	hideShowElementFrfx('bankInfo1', area == '4');
		    	hideShowElementFrfx('bankInfo2', area == '4');
		    	hideShowElementFrfx('personalRoutingGif', area == '2' || area == '3');
		    	hideShowElementFrfx('businessRoutingGif', area == '4');                
		        setLabel('bankInfo3', '&lt;span id=&quot;paymentMethod.firstName&quot;>First Name:&lt;/span>', area == '2' || area == '3');
		        setLabel('bankInfo4', '&lt;span id=&quot;paymentMethod.lastName&quot;>Last Name:&lt;/span>', area == '2' || area == '3');
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
    document.getElementById('schedulePaymentForBillIndex').value = index;
    submitForm('billListForm', '/vbills/mbills/billList.go?action=schedulePayment&amp;forgotType=null','You have already submitted this form');
}

//========= Saved Payment Information Ajax Call

function displayPaymentMethodInfo(selectedId) {
    if (selectedId == &quot;&quot;) {
        return;
    }
    disableElementById(PAYMENT_METHOD_SELECTBOX_ID);
    setWaitingMessageOnInfoDiv();
    var ajax = new Ajax();
    ajax.add('id', selectedId);
    ajax.add('uuid', XSRF_UUID_PARAMETER_KEY);
    ajax.post(PAYMENT_METHOD_INFO_URL_PREFIX + '&amp;action=getInfo', paymentMethodInfoCallback, '');  
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
    pmiDiv.innerHTML = '&lt;br/>&lt;strong>Retrieving Information ...&lt;/strong>';
}

function getPmiDivControl() {
    return document.getElementById(PAYMENT_METHOD_INFO_DIV_ID);
}
 
addOnloadHandler(togglePaymentMethodType);
//addOnloadHandler(toggleSaveNickNameTr);
addOnloadHandler(initVariables);
setFieldsThatNeedToBeClearedBetweenPageFlow(['paymentMethodForm.cardAccountNumber', 'paymentMethodForm.bankAccountNumber', 'paymentMethodForm.cvv']);
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
  oThis.sug.style.visibility = 'hidden';
  document.onmousemove = null;
  document.getElementById(&quot;helpIMG&quot;).src=&quot;/vbills/_assets/img/help3.gif&quot;;
  return;
 }  
 if(!oThis.sug){  
  var div = document.createElement('div'), css = 'top:0; left:0; position:absolute; z-index:100; visibility:hidden';
   div.style.cssText = css;
   div.setAttribute('style',css);
  var sug = document.createElement('div'), css= 'font:normal 12px/16px; white-space:nowrap; color:#666; padding:3px; position:absolute; left:0; top:0; z-index:10; background:#f9fdfd; border:1px solid #0aa';
   sug.style.cssText = css;
   sug.setAttribute('style',css);
  var dr = document.createElement('div'), css = 'position:absolute; top:3px; left:3px; background:#333; filter:alpha(opacity=50); opacity:0.5; z-index:9';
   dr.style.cssText = css;
   dr.setAttribute('style',css);
  var ifr = document.createElement('iframe'), css='position:absolute; left:0; top:0; z-index:8; filter:alpha(opacity=0); opacity:0';
   ifr.style.cssText = css;
   ifr.setAttribute('style',css);
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
 obj.style.left = left+ 10 + 'px';
 obj.style.top = top + 10 + 'px';
 dr.style.width = w + 'px';
 dr.style.height = h + 'px';
 ifr.style.width = w + 3 + 'px';
 ifr.style.height = h + 3 + 'px';
 obj.style.visibility = 'visible';
 document.onmousemove = function(e){
  var e = e || window.event, st = document.documentElement.scrollTop || document.body.scrollTop, sl = document.documentElement.scrollLeft || document.body.scrollLeft;
  var left = e.clientX +sl +17 + w &lt; dw + sl  &amp;&amp;  e.clientX + sl + 15 || e.clientX +sl-8 - w, top = e.clientY + st +17 + h &lt; dh + st  &amp;&amp;  e.clientY + st + 17 || e.clientY + st - 5 - h;
  obj.style.left = left + 'px';
  obj.style.top = top + 'px';
 }
}
function instruction(e, str){ 
var oThis = arguments.callee;
 if(!str) {
  oThis.sug.style.visibility = 'hidden';
  return;
 }  

 if(!oThis.sug){  
  var div = document.createElement('div'), css = 'position:fixed; z-index:100; visibility:visibiled; width:220px;';
   div.style.cssText = css;
   div.setAttribute('style',css);
  var sug = document.createElement('div'), css= 'font:normal 12px/16px; color:#666; padding:3px; position:fixed; z-index:10; background:#f9fdfd; border:1px solid #0aa; width:220px;';
   sug.style.cssText = css;
   sug.setAttribute('style',css);
  var dr = document.createElement('div'), css = 'position:fixed; background:#333; filter:alpha(opacity=50); opacity:0.5; z-index:9; width:220px;';
   dr.style.cssText = css;
   dr.setAttribute('style',css);
  var ifr = document.createElement('iframe'), css='position:fixed; z-index:8; filter:alpha(opacity=0); opacity:0; width:220px;';
   ifr.style.cssText = css;
   ifr.setAttribute('style',css);
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
 var left = pos[0] +sl +17 + w &lt; dw + sl  &amp;&amp;  pos[0] + sl + 15 || pos[0] +sl-8 - w, top = pos[1] + st + h &lt; dh + st  &amp;&amp;  pos[1] + st || pos[1] + st - 5 - h; obj.style.left = left+ 10 + 'px';
 obj.style.top = top + 'px';
 var left0 = left - w - 50;
 obj.style.left = left0 + 'px';
 dr.style.width = w + 'px';
 dr.style.height = h + 'px';
 dr.style.top = top + 3 + 'px';
 dr.style.left = left0 + 3 + 'px';
 ifr.style.width = w + 3 + 'px';
 ifr.style.height = h + 3 + 'px';
 obj.style.visibility = 'visible';

}

function findPosition( oElement ) 
{
  var x2 = 0;
  var y2 = 0;
  var width = oElement.offsetWidth;
  var height = oElement.offsetHeight;
  if( typeof( oElement.offsetParent ) != 'undefined' ) 
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
			ajax.add('countryId', countryId);
			ajax.add('uuid', XSRF_UUID_PARAMETER_KEY);			
			ajax.get('/vbills/mbills/stateInfo.go?action=getStateTypesByCountry&amp;forgotType=null' + '&amp;action=getStateTypesByCountry', stateTypeByCountryCallback, '');
		}
		function stateTypeByCountryCallback(responseText){
			var datalist = responseText.parseJSON();
			document.getElementById('address.state').innerHTML= datalist.stateLabel;
			document.getElementById('address.stateLabel').value= datalist.stateLabel;
			document.getElementById('address.zipCode').innerHTML= datalist.zipLabel;
			document.getElementById('address.zipLabel').value=datalist.zipLabelKey;
			if(datalist.stateList.length>0){
				showStateSelect();
				document.getElementById('state').innerHTML=&quot;&quot;;
				for(var i=0;i&lt;datalist.stateList.length;i++){
					var option = document.createElement(&quot;option&quot;);
					var rs =  datalist.stateList[i];
					option.value = rs.id;
                    option.innerHTML = rs.value;
                    document.getElementById('state').appendChild(option);           
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
			var paymentMethodType = document.getElementById('selectedPaymentMethod').value;
        	if(65 > 1){        		
		 		showStateSelect();
		 	}else{		 		
		 		hideStateSelect();
		 	}

			if(paymentMethodType == '1' || paymentMethodType == '5'){
				document.getElementById('stateRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
				document.getElementById('cityRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
			} 
			if(paymentMethodType > '1' &amp;&amp; paymentMethodType != '5'){
				if(val == 840){
        			document.getElementById('stateRequired').innerHTML=&quot;*&quot;;
        			document.getElementById('cityRequired').innerHTML=&quot;*&quot;;
        		}else{
					document.getElementById('stateRequired').innerHTML=&quot;*&quot;;
					document.getElementById('cityRequired').innerHTML=&quot;*&quot;;
				}
			}	
        }
        function showStateSelect(){
        	document.getElementById('state').style.display=&quot;&quot;;
       		document.getElementById('state').setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.state&quot;);
       		document.getElementById('input_state').style.display=&quot;none&quot;;
       		document.getElementById('input_state').setAttribute(&quot;name&quot;, &quot;&quot;);
        }
        function hideStateSelect(){
        	document.getElementById('state').style.display=&quot;none&quot;;
       		document.getElementById('state').setAttribute(&quot;name&quot;, &quot;&quot;);
       		document.getElementById('input_state').style.display=&quot;&quot;;
       		document.getElementById('input_state').setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.stateCode&quot;);
        }
        function cleanInput(val){
			var paymentMethodType = document.getElementById('selectedPaymentMethod').value;

			if(paymentMethodType == '1' || paymentMethodType == '5'){
				if(840 == val){
					document.getElementById('billingAddressForm.city').value = &quot;&quot;;
					document.getElementById('billingAddressForm.zipCode').value = &quot;&quot;;
					document.getElementById('billingAddressForm.zipCodeExt').value = &quot;&quot;;
					document.getElementById('stateRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
					document.getElementById('cityRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
				}else{
					document.getElementById('billingAddressForm.city').value = &quot;&quot;;
					document.getElementById('billingAddressForm.zipCode').value = &quot;&quot;;
					document.getElementById('billingAddressForm.zipCodeExt').value = &quot;&quot;;
					document.getElementById('input_state').value = &quot;&quot;;
					document.getElementById('stateRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
					document.getElementById('cityRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
				}
			}
			if(paymentMethodType > '1' &amp;&amp; paymentMethodType != '5'){
				if(840 == val){
					document.getElementById('billingAddressForm.city').value = &quot;&quot;;
					document.getElementById('billingAddressForm.zipCode').value = &quot;&quot;;
					document.getElementById('billingAddressForm.zipCodeExt').value = &quot;&quot;;
					document.getElementById('stateRequired').innerHTML=&quot;*&quot;;
					document.getElementById('cityRequired').innerHTML=&quot;*&quot;;
				}else{
					document.getElementById('billingAddressForm.city').value = &quot;&quot;;
					document.getElementById('billingAddressForm.zipCode').value = &quot;&quot;;
					document.getElementById('billingAddressForm.zipCodeExt').value = &quot;&quot;;
					document.getElementById('input_state').value = &quot;&quot;;
					document.getElementById('stateRequired').innerHTML=&quot;*&quot;;
					document.getElementById('cityRequired').innerHTML=&quot;*&quot;;
				}
					
			}	
        }
        
        function showZipCodeSplit(){
        	document.getElementById('billingAddressForm.zipCode').style.display=&quot;&quot;;
       		document.getElementById('billingAddressForm.zipCode').setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.zipCode&quot;);
        	document.getElementById('billingAddressForm.zipCodeExt').style.display=&quot;&quot;;
        	document.getElementById('zipSplit').style.display=&quot;&quot;;
       		document.getElementById('billingAddressForm.zipCode_input').style.display=&quot;none&quot;;
       		document.getElementById('billingAddressForm.zipCode_input').setAttribute(&quot;name&quot;, &quot;&quot;);
        }
        function hideZipCodeSplit(){
        	document.getElementById('billingAddressForm.zipCode').style.display=&quot;none&quot;;
       		document.getElementById('billingAddressForm.zipCode').setAttribute(&quot;name&quot;, &quot;&quot;);
        	document.getElementById('billingAddressForm.zipCodeExt').style.display=&quot;none&quot;;
        	document.getElementById('zipSplit').style.display=&quot;none&quot;;
       		document.getElementById('billingAddressForm.zipCode_input').style.display=&quot;&quot;;
       		document.getElementById('billingAddressForm.zipCode_input').setAttribute(&quot;name&quot;, &quot;paymentMethodForm.billingAddressForm.zipCode&quot;);
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
				//document.getElementById('errors').innerHTML=&quot;&lt;ul>&lt;li>ZIP_Code is not valid.&lt;/li>&lt;/ul>&quot;;
        		//document.getElementById('errors').style.display=&quot;block&quot;;        	
        }
        function zipCodeValidate(){
        	var countryId = document.getElementById('countryId').value;
        	
        		
            	var current = document.getElementById('billingAddressForm.zipCode').value; // + document.getElementById('billingAddressForm.zipCodeExt').value;
            	if( !is_valid_zip(current)){
            		//alert errors.
            		alertErrMsg();
            	}else{
            		document.getElementById('errors').style.display=&quot;none&quot;;
            		var ajax = new Ajax();
        			ajax.add(&quot;zipCode&quot; , current);
        			ajax.add(&quot;countryId&quot;,countryId);
        	        ajax.add('uuid', XSRF_UUID_PARAMETER_KEY);
        			ajax.post('/vbills/mbills/validateZipCode.go?action=getValidateZipCode&amp;forgotType=null' + '&amp;action=getStateTypesByCountry',zipCodeValidateCallback, '');
            	}
        	
		}
		function zipCodeValidateCallback(responseText){
			var data = responseText.parseJSON();
			if(data!=null &amp;&amp; data !=&quot;&quot;){
				document.getElementById('errors').style.display=&quot;none&quot;;
				document.getElementById('billingAddressForm.city').value=data.city;
				if(document.getElementById('state').style.display=&quot;block&quot;){
					document.getElementById('state').value=data.state.id;
				}else{
					document.getElementById('input_state').value = data.state.value;
				}
			}else{
				alertErrMsg();
			}
		}
		function setCityAndStateRequired (val){
			if(val == '1' || val == '5'){
				document.getElementById('stateRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
				document.getElementById('cityRequired').innerHTML=&quot;&amp;nbsp;&amp;nbsp;&quot;;
			} 
			if(val > '1' &amp;&amp; val != '5'){
				if(document.getElementById('countryId').value == 840){
        			document.getElementById('stateRequired').innerHTML=&quot;*&quot;;
        			document.getElementById('cityRequired').innerHTML=&quot;*&quot;;
        		}else{
					document.getElementById('stateRequired').innerHTML=&quot;*&quot;;
					document.getElementById('cityRequired').innerHTML=&quot;*&quot;;
				}
			}
		}

		function rtnValidate(){

			var rtnString = document.getElementById('routingNumber').value;
			var ajax = new Ajax();
			ajax.add(&quot;rtnStr&quot; , rtnString);
			ajax.add('uuid', XSRF_UUID_PARAMETER_KEY);
			ajax.post('/vbills/mbills/RTNValidate.go?action=rtnValidation&amp;forgotType=null' + '&amp;action=AchRTNValidate',rtnValidateCallback, '');

		}
		function rtnValidateCallback(responseText){
			var data = responseText.parseJSON();
			if(data!=null &amp;&amp; data !=&quot;&quot;){
				if(data.message !=null &amp;&amp; data.message){
					document.getElementById('routingError').innerHTML= data.message;
				}else{
					document.getElementById('routingError').innerHTML= &quot;Invalid Routing Number&quot;;
				}
			}
		}
		
		function debitCardNumberValidate(cardNumber){
					document.getElementById('errors').style.display=&quot;none&quot;;
            		var ajax = new Ajax();
            	    ajax.add('cn', cardNumber);
            	    ajax.get(PAYMENT_METHOD_INFO_URL_PREFIX + '&amp;action=debitCardNumberValidate', debitCardNumberValidateCallback, '');  
		}
		function debitCardNumberValidateCallback(responseText){
			var data = responseText.parseJSON();
			if(data!=null &amp;&amp; data !=&quot;&quot;){
				document.getElementById('errors').style.display=&quot;none&quot;;
				var isDebit = data.isDebit;

				if(isDebit == 'true'){
					document.getElementById('pay_via_debit_credit').innerHTML='&lt;table width=&quot;100%&quot; border=&quot;0&quot; cellspacing=&quot;0&quot; cellpadding=&quot;0&quot;>'+
		                ' &lt;tr>&lt;td class=&quot;strong&quot; width=&quot;40%&quot;>&lt;span >Process As Debit Credit:&lt;/span>&lt;/td>'+
		                  ' &lt;td width=&quot;60%&quot;>&lt;input type=&quot;radio&quot; name=&quot;payViaDebitCredit&quot; value=&quot;true&quot; />&amp;nbsp;Yes&amp;nbsp;&amp;nbsp;' +
		                  ' &lt;input type=&quot;radio&quot; name=&quot;payViaDebitCredit&quot; value=&quot;false&quot; checked />No' +
	                      '&lt;/td>'+
	                 ' &lt;/tr>' +
	             ' &lt;/table>';
				}else{
					document.getElementById('pay_via_debit_credit').innerHTML=&quot;&quot;;
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
			
			var url = 'https://aws.amazon.com';
			window.open(url, '', 'width=800,height=600');
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
		changeCountry(document.getElementById('countryId').value);
    	function PaymentCleanInput(val){
    		if(val != 1 &amp;&amp; val != 2 &amp;&amp; val != 3 &amp;&amp; val != 4 &amp;&amp; val != 5){
    			cleanInput(0);
    		}
    		setCityAndStateRequired(val)
			document.getElementById('address.paymentMethodTypeKey').value=val;	
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


        </value>
      <webElementGuid>1b636231-c4d3-45fb-894a-d911dc2d6c90</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]/div[@class=&quot;shell&quot;]</value>
      <webElementGuid>4eb95c23-6ed2-4339-a4b9-826808066deb</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div</value>
      <webElementGuid>2db6168f-0690-49dd-858d-a02cb8cc168d</webElementGuid>
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
      <webElementGuid>1f63f033-db87-466f-9752-e2466b57a299</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
