<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Espaol      (function()  (radio).click_2f185a</name>
   <tag></tag>
   <elementGuidId>859fc6b6-4618-4b73-820a-317e87c46047</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>internal:text=&quot;Español ✔ DisplayCalculatedFeeRegSCF- Choose Method of Payment Calculated Servic&quot;i</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>e0aa59a2-f7e2-47ac-a69f-71ea9423af87</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>bgcolor</name>
      <type>Main</type>
      <value>#ffffff</value>
      <webElementGuid>233aa519-9906-42bf-89ce-94ef158acc21</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value> Español 
    
	 $(function(){
	  $(&quot;:radio&quot;).click(function(){
		   var r_arr = document.getElementsByName('paymentMethodSelect');
		   for(var k=0;k&lt; r_arr.length;k++){
		    	if(r_arr[k].id != $(this).attr('id')){
			  		 r_arr[k].checked = false;
		    	}else{
		    		 $(&quot;#paymentMethod&quot;).val(r_arr[k].value);
		    	}
		   }

		  if($(this).attr('id') != undefined &amp;&amp; $(this).attr('id').indexOf(&quot;S_&quot;) == 0){
			   $(&quot;#storedPaymentMethodsSelect&quot;).val($(this).val().replace('S_', ''));
			   selectPaymentMethod($(this).val());
		   }else{
			   $(&quot;#storedPaymentMethodsSelect&quot;).val(&quot;&quot;);
		   }
 	  // alert($(this).val()); 
 	  
	   $(&quot;#payNowSubmit&quot;).removeClass(&quot;disabled&quot;);
	   
	 });
	  
	  $('#scheduledPaymentModal').on('show.bs.modal', function () {
		  if(!$('body').hasClass('modal-open')){
			 $.ajax({
				    &quot;url&quot;: &quot;/vrelay/bootstrap/deferredPaymentHistory.do?orderColumn=payment_plan_id&amp;orderColumnSequence=desc&amp;clientAccountNumber=&amp;applicationId=920&amp;messageVersion=2.3&amp;remittance_id=tyygu&amp;contentType=application/x-www-form-urlencoded&amp;localeKey=en_US&amp;locale=en_US&quot;,
					&quot;type&quot;: 'post',	
					&quot;dataType&quot;:&quot;html&quot;,
					&quot;cache&quot;:false,
					&quot;success&quot;: function (resp) {
						$(&quot;#selectTree&quot;).html(&quot;&lt;div>&quot; + resp + &quot;&lt;/div>&quot;);
						//console.log(resp);	
		
					},
					&quot;error&quot;: function (XMLHttpRequest, textStatus, errorThrown) {
						console.log(&quot;scheduledPaymentModal Failed to retrieve token.\n&quot; + XMLHttpRequest.status + ' '+ XMLHttpRequest.statusText);									
					}
				 });	
		  }
		});
	 });
	 function setNull(){
		 return true;
	 }
				
	
	
		
		.modal.show {
			opacity: 1 !important;
		}
	
	
	✔ DisplayCalculatedFeeRegSCF- Choose Method of Payment
	



var WAITING_MESSAGE = &quot;Processing...&quot;;
var languageValue = '';
function setLanguageSelectMessage() {
    var waitingInfoDiv = getWaitingInfoDivControl();
    waitingInfoDiv.innerHTML = &quot;&lt;strong>&quot;+WAITING_MESSAGE+&quot;&lt;/strong>&quot; ;
}
function onchanged_setValueAndSubmit(value) {
	changelocaleKey(value)
	//setLanguageSelectMessage();
	var contextPath = '/vrelay';
	var url = contextPath+'/languageSelect.do?vsid=160224&amp;locale='+value;
	console.log(url);
	var ajax = new Ajax();
	ajax.post(url, formSetValueAndSubmit, '');
}
function onchanged_submit(value) {
	changelocaleKey(value)
	//setLanguageSelectMessage();
	
	var contextPath = '/vrelay';
	var url = contextPath+'/languageSelect.do?locale='+value;
	var ajax = new Ajax();
	ajax.post(url, formSubmit, '');
}
function onchanged_reload(value) {
	changelocaleKey(value)
	//setLanguageSelectMessage();
	
	var contextPath = '/vrelay';
	var url = contextPath+'/languageSelect.do?locale='+value;
	var ajax = new Ajax();
	ajax.post(url, windowReload, '');
}
function changelocaleKey(value){
	 languageValue = value;
	 var localeKeys = document.getElementsByName(&quot;locale_key&quot;);
     if(localeKeys != null){
	     for(var i=0;i&lt;localeKeys.length;i++){
	    	 localeKeys[i].value=value;
	     }
	}
     var locales = document.getElementsByName(&quot;locale&quot;);
     if(locales != null){
	     for(var i=0;i&lt;locales.length;i++){
	    	 locales[i].value=value;
	     }
	}
}
function formSetValueAndSubmit(){
	  document.getElementById(&quot;selectLanguageAction&quot;).value='Yes';
	  if($(&quot;#pageName&quot;).val()==&quot;selectForm&quot;)
		  {
		  document.getElementById(&quot;selectForm&quot;).submit();
		  }
	  else
		  {
		  location.reload();
		  }
}
function formSubmit(){
      document.forms[1].submit();
}
function windowReload(){
	var url=window.location.href;  
	var loc = url.substring(0,url.lastIndexOf('&amp;')+1);   
	var newUrl = loc + &quot;locale_key=&quot; + languageValue;
	window.location.href = newUrl;
   //  window.location.reload();
}
function getWaitingInfoDivControl() {
    return document.getElementById('waitingInfoDiv');
}

function getXmlHttp() {
    try {
        return new XMLHttpRequest();
    } catch (exA) {
        try {
            return new ActiveXObject('Msxml2.XMLHTTP');
        } catch (exB) {
            try {
                return new ActiveXObject('Microsoft.XMLHTTP');
            } catch (exC) {
                return null;
            }
        }
    }
}

var Ajax = function () {
	this.parms = [];
	this.pipe = null;
	var GET = 'GET';
	var POST = 'POST';
	
	this.pipe = getXmlHttp();
	if (!this.pipe) {
		alert(&quot;cannot get a pipe&quot;);
	}
	
	this.get = function (url, callback, extraData) {
		url = this.prepareUrl(url);
		//alert(&quot;GET: &quot; + url + &quot; END&quot;);
		return this.send(GET, null, url, callback, extraData);
	};
	this.post = function (url, callback, extraData) {
		var query = this.prepareQuery();
		//alert(&quot;POST &quot; + query + &quot; END&quot;);
		return this.send(POST, query, url, callback, extraData);
	};
	this.send = function (method, query, url, callback, extraData) {
		if (callback) return this.sendAsync(method, query, url, callback, extraData);
			else if (url) return this.sendSync(method, query, url);
			else return null;  
		};
		this.sendSync = function (method, query, url) {
		this.pipe.open(method, url, false);
		this.submit(method, query);
		return this.pipe.responseText;
	};
	this.sendAsync = function (method, query, url, callback, extraData) {
		this.cb = callback;
		this.data = extraData;
		var self = this;
		this.pipe.open(method, url, true);
		this.pipe.onreadystatechange = function() {
			if (self.pipe.readyState == 4) {
				if (self.cb != null) self.cb(self.pipe.responseText, self.data, self.pipe);
			}
		};
		this.submit(method, query);
	};
	this.submit = function (method, query) {
		if (method == POST) this.pipe.setRequestHeader('Content-Type',  'application/x-www-form-urlencoded');
		this.pipe.send(query);
		this.reset();
	};
	this.prepareUrl = function (url) {
		url += (/\?/.test(url)) ? '&amp;' : '?';
		return url + this.prepareQuery();
	};
	this.prepareQuery = function () {
		var parms = this.parms;
		var len = parms.length;
		var query = '';
		for (var i = 0; i &lt; len; i++) query += (parms[i].k + '=' + parms[i].v + '&amp;'); 
		return query + 'Ajax=' + new Date().getTime();
	};
	this.add = function (key, value) {
		if (value == null) value = ''; 
		this.parms.push({k:key, v:value});
	};
	this.reset = function () {
		this.parms = [];
	};
};

function prependChild(parent, node) {
    parent.insertBefore(node, parent.firstChild);
}




window.onload = function() {
	var mybody=document.getElementsByTagName(&quot;body&quot;).item(0);
	var myhead=document.getElementsByTagName(&quot;head&quot;).item(0);
	var myDiv = document.createElement(&quot;div&quot;);
	var myForm = document.createElement(&quot;FORM&quot;);
	
		myDiv.className=&quot;container&quot;;
	
	myDiv.id=&quot;selectLanguageDiv&quot;;
	myDiv.style.position = 'relative';
    //myDiv.style.right = '0px';
    //myDiv.style.top = '0px';
	myDiv.align=&quot;right&quot;;
	
	myForm.method = &quot;POST&quot;;
	myForm.action=&quot;/vrelay/languageSelect.do&quot;;
	myForm.innerHTML=&quot; &lt;a href=\&quot;javascript:onchanged_setValueAndSubmit('es_ES')\&quot; >Español&lt;/a> &lt;input type='hidden' id='localeKey' name='localeKey' value='' />&quot;;

	prependChild(myDiv,myForm);
	prependChild(mybody,myDiv);
}

  




		 
			 
		

    
	
		
			Calculated Service Fees by Selected Payment Methods for the amount of $200
		
		

            
            

                
                    
                        
                            
                                American Express
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Discover
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                MasterCard
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                MasterCard Debit
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Visa
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Visa Debit
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Corporate Check
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Personal Check
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
            
        
    
    

	  
		
			Select Payment Method
		
		
		
 			Please Choose the Method of Payment
 			 
			   
			        
					    
						    
						      Pay by Credit or Debit Card						      
						    
					    
			        
			        
			        	
			        		 
									 
							 
					 				  
					 				 
							
									  
							
			       					       		
			        	
			        
   			  
   			  
   			  
   			  
			        
					    
					    
					      Pay by Personal Check					      
					    
					  
			        
			        
			        	
			       		
			       		
			        
   			 
   			 
   			 
   			 
			        
					    
					    
					      Pay by Corporate Check					      
					    
					   
			        
			        
			        	
			            
			            
			        
   			
   			
  	
  		
		
		
		
	
	   		
		        
		        	
		        	
		        
   			
	 
   			
		 
	  

	  
	
	




























































































	
	

	
	
	
	
	
	
	
	





























































































	
     
			
				 
			
		




	
		
			
				
					×
				
				
					View Scheduled Payments
				
			
			
				 
       			 
				
			
			
				Close
		
	


  
  

var popoverTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle=&quot;popover&quot;]'))
var popoverList = popoverTriggerList.map(function (popoverTriggerEl) {
  return new bootstrap.Popover(popoverTriggerEl)
})


/html[1]/body[1]</value>
      <webElementGuid>717cbc64-e235-4ada-8568-acf7a32a2ccc</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]</value>
      <webElementGuid>ad490e9c-58f4-4f75-b52a-c6c26d56ffbc</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>005c664e-8aab-4560-9ec0-146b62bc2758</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot; Español 
    
	 $(function(){
	  $(&quot;:radio&quot;).click(function(){
		   var r_arr = document.getElementsByName(&quot; , &quot;'&quot; , &quot;paymentMethodSelect&quot; , &quot;'&quot; , &quot;);
		   for(var k=0;k&lt; r_arr.length;k++){
		    	if(r_arr[k].id != $(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;)){
			  		 r_arr[k].checked = false;
		    	}else{
		    		 $(&quot;#paymentMethod&quot;).val(r_arr[k].value);
		    	}
		   }

		  if($(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;) != undefined &amp;&amp; $(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;).indexOf(&quot;S_&quot;) == 0){
			   $(&quot;#storedPaymentMethodsSelect&quot;).val($(this).val().replace(&quot; , &quot;'&quot; , &quot;S_&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;));
			   selectPaymentMethod($(this).val());
		   }else{
			   $(&quot;#storedPaymentMethodsSelect&quot;).val(&quot;&quot;);
		   }
 	  // alert($(this).val()); 
 	  
	   $(&quot;#payNowSubmit&quot;).removeClass(&quot;disabled&quot;);
	   
	 });
	  
	  $(&quot; , &quot;'&quot; , &quot;#scheduledPaymentModal&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;show.bs.modal&quot; , &quot;'&quot; , &quot;, function () {
		  if(!$(&quot; , &quot;'&quot; , &quot;body&quot; , &quot;'&quot; , &quot;).hasClass(&quot; , &quot;'&quot; , &quot;modal-open&quot; , &quot;'&quot; , &quot;)){
			 $.ajax({
				    &quot;url&quot;: &quot;/vrelay/bootstrap/deferredPaymentHistory.do?orderColumn=payment_plan_id&amp;orderColumnSequence=desc&amp;clientAccountNumber=&amp;applicationId=920&amp;messageVersion=2.3&amp;remittance_id=tyygu&amp;contentType=application/x-www-form-urlencoded&amp;localeKey=en_US&amp;locale=en_US&quot;,
					&quot;type&quot;: &quot; , &quot;'&quot; , &quot;post&quot; , &quot;'&quot; , &quot;,	
					&quot;dataType&quot;:&quot;html&quot;,
					&quot;cache&quot;:false,
					&quot;success&quot;: function (resp) {
						$(&quot;#selectTree&quot;).html(&quot;&lt;div>&quot; + resp + &quot;&lt;/div>&quot;);
						//console.log(resp);	
		
					},
					&quot;error&quot;: function (XMLHttpRequest, textStatus, errorThrown) {
						console.log(&quot;scheduledPaymentModal Failed to retrieve token.\n&quot; + XMLHttpRequest.status + &quot; , &quot;'&quot; , &quot; &quot; , &quot;'&quot; , &quot;+ XMLHttpRequest.statusText);									
					}
				 });	
		  }
		});
	 });
	 function setNull(){
		 return true;
	 }
				
	
	
		
		.modal.show {
			opacity: 1 !important;
		}
	
	
	✔ DisplayCalculatedFeeRegSCF- Choose Method of Payment
	



var WAITING_MESSAGE = &quot;Processing...&quot;;
var languageValue = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
function setLanguageSelectMessage() {
    var waitingInfoDiv = getWaitingInfoDivControl();
    waitingInfoDiv.innerHTML = &quot;&lt;strong>&quot;+WAITING_MESSAGE+&quot;&lt;/strong>&quot; ;
}
function onchanged_setValueAndSubmit(value) {
	changelocaleKey(value)
	//setLanguageSelectMessage();
	var contextPath = &quot; , &quot;'&quot; , &quot;/vrelay&quot; , &quot;'&quot; , &quot;;
	var url = contextPath+&quot; , &quot;'&quot; , &quot;/languageSelect.do?vsid=160224&amp;locale=&quot; , &quot;'&quot; , &quot;+value;
	console.log(url);
	var ajax = new Ajax();
	ajax.post(url, formSetValueAndSubmit, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
}
function onchanged_submit(value) {
	changelocaleKey(value)
	//setLanguageSelectMessage();
	
	var contextPath = &quot; , &quot;'&quot; , &quot;/vrelay&quot; , &quot;'&quot; , &quot;;
	var url = contextPath+&quot; , &quot;'&quot; , &quot;/languageSelect.do?locale=&quot; , &quot;'&quot; , &quot;+value;
	var ajax = new Ajax();
	ajax.post(url, formSubmit, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
}
function onchanged_reload(value) {
	changelocaleKey(value)
	//setLanguageSelectMessage();
	
	var contextPath = &quot; , &quot;'&quot; , &quot;/vrelay&quot; , &quot;'&quot; , &quot;;
	var url = contextPath+&quot; , &quot;'&quot; , &quot;/languageSelect.do?locale=&quot; , &quot;'&quot; , &quot;+value;
	var ajax = new Ajax();
	ajax.post(url, windowReload, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
}
function changelocaleKey(value){
	 languageValue = value;
	 var localeKeys = document.getElementsByName(&quot;locale_key&quot;);
     if(localeKeys != null){
	     for(var i=0;i&lt;localeKeys.length;i++){
	    	 localeKeys[i].value=value;
	     }
	}
     var locales = document.getElementsByName(&quot;locale&quot;);
     if(locales != null){
	     for(var i=0;i&lt;locales.length;i++){
	    	 locales[i].value=value;
	     }
	}
}
function formSetValueAndSubmit(){
	  document.getElementById(&quot;selectLanguageAction&quot;).value=&quot; , &quot;'&quot; , &quot;Yes&quot; , &quot;'&quot; , &quot;;
	  if($(&quot;#pageName&quot;).val()==&quot;selectForm&quot;)
		  {
		  document.getElementById(&quot;selectForm&quot;).submit();
		  }
	  else
		  {
		  location.reload();
		  }
}
function formSubmit(){
      document.forms[1].submit();
}
function windowReload(){
	var url=window.location.href;  
	var loc = url.substring(0,url.lastIndexOf(&quot; , &quot;'&quot; , &quot;&amp;&quot; , &quot;'&quot; , &quot;)+1);   
	var newUrl = loc + &quot;locale_key=&quot; + languageValue;
	window.location.href = newUrl;
   //  window.location.reload();
}
function getWaitingInfoDivControl() {
    return document.getElementById(&quot; , &quot;'&quot; , &quot;waitingInfoDiv&quot; , &quot;'&quot; , &quot;);
}

function getXmlHttp() {
    try {
        return new XMLHttpRequest();
    } catch (exA) {
        try {
            return new ActiveXObject(&quot; , &quot;'&quot; , &quot;Msxml2.XMLHTTP&quot; , &quot;'&quot; , &quot;);
        } catch (exB) {
            try {
                return new ActiveXObject(&quot; , &quot;'&quot; , &quot;Microsoft.XMLHTTP&quot; , &quot;'&quot; , &quot;);
            } catch (exC) {
                return null;
            }
        }
    }
}

var Ajax = function () {
	this.parms = [];
	this.pipe = null;
	var GET = &quot; , &quot;'&quot; , &quot;GET&quot; , &quot;'&quot; , &quot;;
	var POST = &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;;
	
	this.pipe = getXmlHttp();
	if (!this.pipe) {
		alert(&quot;cannot get a pipe&quot;);
	}
	
	this.get = function (url, callback, extraData) {
		url = this.prepareUrl(url);
		//alert(&quot;GET: &quot; + url + &quot; END&quot;);
		return this.send(GET, null, url, callback, extraData);
	};
	this.post = function (url, callback, extraData) {
		var query = this.prepareQuery();
		//alert(&quot;POST &quot; + query + &quot; END&quot;);
		return this.send(POST, query, url, callback, extraData);
	};
	this.send = function (method, query, url, callback, extraData) {
		if (callback) return this.sendAsync(method, query, url, callback, extraData);
			else if (url) return this.sendSync(method, query, url);
			else return null;  
		};
		this.sendSync = function (method, query, url) {
		this.pipe.open(method, url, false);
		this.submit(method, query);
		return this.pipe.responseText;
	};
	this.sendAsync = function (method, query, url, callback, extraData) {
		this.cb = callback;
		this.data = extraData;
		var self = this;
		this.pipe.open(method, url, true);
		this.pipe.onreadystatechange = function() {
			if (self.pipe.readyState == 4) {
				if (self.cb != null) self.cb(self.pipe.responseText, self.data, self.pipe);
			}
		};
		this.submit(method, query);
	};
	this.submit = function (method, query) {
		if (method == POST) this.pipe.setRequestHeader(&quot; , &quot;'&quot; , &quot;Content-Type&quot; , &quot;'&quot; , &quot;,  &quot; , &quot;'&quot; , &quot;application/x-www-form-urlencoded&quot; , &quot;'&quot; , &quot;);
		this.pipe.send(query);
		this.reset();
	};
	this.prepareUrl = function (url) {
		url += (/\?/.test(url)) ? &quot; , &quot;'&quot; , &quot;&amp;&quot; , &quot;'&quot; , &quot; : &quot; , &quot;'&quot; , &quot;?&quot; , &quot;'&quot; , &quot;;
		return url + this.prepareQuery();
	};
	this.prepareQuery = function () {
		var parms = this.parms;
		var len = parms.length;
		var query = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
		for (var i = 0; i &lt; len; i++) query += (parms[i].k + &quot; , &quot;'&quot; , &quot;=&quot; , &quot;'&quot; , &quot; + parms[i].v + &quot; , &quot;'&quot; , &quot;&amp;&quot; , &quot;'&quot; , &quot;); 
		return query + &quot; , &quot;'&quot; , &quot;Ajax=&quot; , &quot;'&quot; , &quot; + new Date().getTime();
	};
	this.add = function (key, value) {
		if (value == null) value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;; 
		this.parms.push({k:key, v:value});
	};
	this.reset = function () {
		this.parms = [];
	};
};

function prependChild(parent, node) {
    parent.insertBefore(node, parent.firstChild);
}




window.onload = function() {
	var mybody=document.getElementsByTagName(&quot;body&quot;).item(0);
	var myhead=document.getElementsByTagName(&quot;head&quot;).item(0);
	var myDiv = document.createElement(&quot;div&quot;);
	var myForm = document.createElement(&quot;FORM&quot;);
	
		myDiv.className=&quot;container&quot;;
	
	myDiv.id=&quot;selectLanguageDiv&quot;;
	myDiv.style.position = &quot; , &quot;'&quot; , &quot;relative&quot; , &quot;'&quot; , &quot;;
    //myDiv.style.right = &quot; , &quot;'&quot; , &quot;0px&quot; , &quot;'&quot; , &quot;;
    //myDiv.style.top = &quot; , &quot;'&quot; , &quot;0px&quot; , &quot;'&quot; , &quot;;
	myDiv.align=&quot;right&quot;;
	
	myForm.method = &quot;POST&quot;;
	myForm.action=&quot;/vrelay/languageSelect.do&quot;;
	myForm.innerHTML=&quot; &lt;a href=\&quot;javascript:onchanged_setValueAndSubmit(&quot; , &quot;'&quot; , &quot;es_ES&quot; , &quot;'&quot; , &quot;)\&quot; >Español&lt;/a> &lt;input type=&quot; , &quot;'&quot; , &quot;hidden&quot; , &quot;'&quot; , &quot; id=&quot; , &quot;'&quot; , &quot;localeKey&quot; , &quot;'&quot; , &quot; name=&quot; , &quot;'&quot; , &quot;localeKey&quot; , &quot;'&quot; , &quot; value=&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; />&quot;;

	prependChild(myDiv,myForm);
	prependChild(mybody,myDiv);
}

  




		 
			 
		

    
	
		
			Calculated Service Fees by Selected Payment Methods for the amount of $200
		
		

            
            

                
                    
                        
                            
                                American Express
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Discover
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                MasterCard
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                MasterCard Debit
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Visa
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Visa Debit
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Corporate Check
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Personal Check
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
            
        
    
    

	  
		
			Select Payment Method
		
		
		
 			Please Choose the Method of Payment
 			 
			   
			        
					    
						    
						      Pay by Credit or Debit Card						      
						    
					    
			        
			        
			        	
			        		 
									 
							 
					 				  
					 				 
							
									  
							
			       					       		
			        	
			        
   			  
   			  
   			  
   			  
			        
					    
					    
					      Pay by Personal Check					      
					    
					  
			        
			        
			        	
			       		
			       		
			        
   			 
   			 
   			 
   			 
			        
					    
					    
					      Pay by Corporate Check					      
					    
					   
			        
			        
			        	
			            
			            
			        
   			
   			
  	
  		
		
		
		
	
	   		
		        
		        	
		        	
		        
   			
	 
   			
		 
	  

	  
	
	




























































































	
	

	
	
	
	
	
	
	
	





























































































	
     
			
				 
			
		




	
		
			
				
					×
				
				
					View Scheduled Payments
				
			
			
				 
       			 
				
			
			
				Close
		
	


  
  

var popoverTriggerList = [].slice.call(document.querySelectorAll(&quot; , &quot;'&quot; , &quot;[data-bs-toggle=&quot;popover&quot;]&quot; , &quot;'&quot; , &quot;))
var popoverList = popoverTriggerList.map(function (popoverTriggerEl) {
  return new bootstrap.Popover(popoverTriggerEl)
})


/html[1]/body[1]&quot;) or . = concat(&quot; Español 
    
	 $(function(){
	  $(&quot;:radio&quot;).click(function(){
		   var r_arr = document.getElementsByName(&quot; , &quot;'&quot; , &quot;paymentMethodSelect&quot; , &quot;'&quot; , &quot;);
		   for(var k=0;k&lt; r_arr.length;k++){
		    	if(r_arr[k].id != $(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;)){
			  		 r_arr[k].checked = false;
		    	}else{
		    		 $(&quot;#paymentMethod&quot;).val(r_arr[k].value);
		    	}
		   }

		  if($(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;) != undefined &amp;&amp; $(this).attr(&quot; , &quot;'&quot; , &quot;id&quot; , &quot;'&quot; , &quot;).indexOf(&quot;S_&quot;) == 0){
			   $(&quot;#storedPaymentMethodsSelect&quot;).val($(this).val().replace(&quot; , &quot;'&quot; , &quot;S_&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;));
			   selectPaymentMethod($(this).val());
		   }else{
			   $(&quot;#storedPaymentMethodsSelect&quot;).val(&quot;&quot;);
		   }
 	  // alert($(this).val()); 
 	  
	   $(&quot;#payNowSubmit&quot;).removeClass(&quot;disabled&quot;);
	   
	 });
	  
	  $(&quot; , &quot;'&quot; , &quot;#scheduledPaymentModal&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;show.bs.modal&quot; , &quot;'&quot; , &quot;, function () {
		  if(!$(&quot; , &quot;'&quot; , &quot;body&quot; , &quot;'&quot; , &quot;).hasClass(&quot; , &quot;'&quot; , &quot;modal-open&quot; , &quot;'&quot; , &quot;)){
			 $.ajax({
				    &quot;url&quot;: &quot;/vrelay/bootstrap/deferredPaymentHistory.do?orderColumn=payment_plan_id&amp;orderColumnSequence=desc&amp;clientAccountNumber=&amp;applicationId=920&amp;messageVersion=2.3&amp;remittance_id=tyygu&amp;contentType=application/x-www-form-urlencoded&amp;localeKey=en_US&amp;locale=en_US&quot;,
					&quot;type&quot;: &quot; , &quot;'&quot; , &quot;post&quot; , &quot;'&quot; , &quot;,	
					&quot;dataType&quot;:&quot;html&quot;,
					&quot;cache&quot;:false,
					&quot;success&quot;: function (resp) {
						$(&quot;#selectTree&quot;).html(&quot;&lt;div>&quot; + resp + &quot;&lt;/div>&quot;);
						//console.log(resp);	
		
					},
					&quot;error&quot;: function (XMLHttpRequest, textStatus, errorThrown) {
						console.log(&quot;scheduledPaymentModal Failed to retrieve token.\n&quot; + XMLHttpRequest.status + &quot; , &quot;'&quot; , &quot; &quot; , &quot;'&quot; , &quot;+ XMLHttpRequest.statusText);									
					}
				 });	
		  }
		});
	 });
	 function setNull(){
		 return true;
	 }
				
	
	
		
		.modal.show {
			opacity: 1 !important;
		}
	
	
	✔ DisplayCalculatedFeeRegSCF- Choose Method of Payment
	



var WAITING_MESSAGE = &quot;Processing...&quot;;
var languageValue = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
function setLanguageSelectMessage() {
    var waitingInfoDiv = getWaitingInfoDivControl();
    waitingInfoDiv.innerHTML = &quot;&lt;strong>&quot;+WAITING_MESSAGE+&quot;&lt;/strong>&quot; ;
}
function onchanged_setValueAndSubmit(value) {
	changelocaleKey(value)
	//setLanguageSelectMessage();
	var contextPath = &quot; , &quot;'&quot; , &quot;/vrelay&quot; , &quot;'&quot; , &quot;;
	var url = contextPath+&quot; , &quot;'&quot; , &quot;/languageSelect.do?vsid=160224&amp;locale=&quot; , &quot;'&quot; , &quot;+value;
	console.log(url);
	var ajax = new Ajax();
	ajax.post(url, formSetValueAndSubmit, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
}
function onchanged_submit(value) {
	changelocaleKey(value)
	//setLanguageSelectMessage();
	
	var contextPath = &quot; , &quot;'&quot; , &quot;/vrelay&quot; , &quot;'&quot; , &quot;;
	var url = contextPath+&quot; , &quot;'&quot; , &quot;/languageSelect.do?locale=&quot; , &quot;'&quot; , &quot;+value;
	var ajax = new Ajax();
	ajax.post(url, formSubmit, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
}
function onchanged_reload(value) {
	changelocaleKey(value)
	//setLanguageSelectMessage();
	
	var contextPath = &quot; , &quot;'&quot; , &quot;/vrelay&quot; , &quot;'&quot; , &quot;;
	var url = contextPath+&quot; , &quot;'&quot; , &quot;/languageSelect.do?locale=&quot; , &quot;'&quot; , &quot;+value;
	var ajax = new Ajax();
	ajax.post(url, windowReload, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
}
function changelocaleKey(value){
	 languageValue = value;
	 var localeKeys = document.getElementsByName(&quot;locale_key&quot;);
     if(localeKeys != null){
	     for(var i=0;i&lt;localeKeys.length;i++){
	    	 localeKeys[i].value=value;
	     }
	}
     var locales = document.getElementsByName(&quot;locale&quot;);
     if(locales != null){
	     for(var i=0;i&lt;locales.length;i++){
	    	 locales[i].value=value;
	     }
	}
}
function formSetValueAndSubmit(){
	  document.getElementById(&quot;selectLanguageAction&quot;).value=&quot; , &quot;'&quot; , &quot;Yes&quot; , &quot;'&quot; , &quot;;
	  if($(&quot;#pageName&quot;).val()==&quot;selectForm&quot;)
		  {
		  document.getElementById(&quot;selectForm&quot;).submit();
		  }
	  else
		  {
		  location.reload();
		  }
}
function formSubmit(){
      document.forms[1].submit();
}
function windowReload(){
	var url=window.location.href;  
	var loc = url.substring(0,url.lastIndexOf(&quot; , &quot;'&quot; , &quot;&amp;&quot; , &quot;'&quot; , &quot;)+1);   
	var newUrl = loc + &quot;locale_key=&quot; + languageValue;
	window.location.href = newUrl;
   //  window.location.reload();
}
function getWaitingInfoDivControl() {
    return document.getElementById(&quot; , &quot;'&quot; , &quot;waitingInfoDiv&quot; , &quot;'&quot; , &quot;);
}

function getXmlHttp() {
    try {
        return new XMLHttpRequest();
    } catch (exA) {
        try {
            return new ActiveXObject(&quot; , &quot;'&quot; , &quot;Msxml2.XMLHTTP&quot; , &quot;'&quot; , &quot;);
        } catch (exB) {
            try {
                return new ActiveXObject(&quot; , &quot;'&quot; , &quot;Microsoft.XMLHTTP&quot; , &quot;'&quot; , &quot;);
            } catch (exC) {
                return null;
            }
        }
    }
}

var Ajax = function () {
	this.parms = [];
	this.pipe = null;
	var GET = &quot; , &quot;'&quot; , &quot;GET&quot; , &quot;'&quot; , &quot;;
	var POST = &quot; , &quot;'&quot; , &quot;POST&quot; , &quot;'&quot; , &quot;;
	
	this.pipe = getXmlHttp();
	if (!this.pipe) {
		alert(&quot;cannot get a pipe&quot;);
	}
	
	this.get = function (url, callback, extraData) {
		url = this.prepareUrl(url);
		//alert(&quot;GET: &quot; + url + &quot; END&quot;);
		return this.send(GET, null, url, callback, extraData);
	};
	this.post = function (url, callback, extraData) {
		var query = this.prepareQuery();
		//alert(&quot;POST &quot; + query + &quot; END&quot;);
		return this.send(POST, query, url, callback, extraData);
	};
	this.send = function (method, query, url, callback, extraData) {
		if (callback) return this.sendAsync(method, query, url, callback, extraData);
			else if (url) return this.sendSync(method, query, url);
			else return null;  
		};
		this.sendSync = function (method, query, url) {
		this.pipe.open(method, url, false);
		this.submit(method, query);
		return this.pipe.responseText;
	};
	this.sendAsync = function (method, query, url, callback, extraData) {
		this.cb = callback;
		this.data = extraData;
		var self = this;
		this.pipe.open(method, url, true);
		this.pipe.onreadystatechange = function() {
			if (self.pipe.readyState == 4) {
				if (self.cb != null) self.cb(self.pipe.responseText, self.data, self.pipe);
			}
		};
		this.submit(method, query);
	};
	this.submit = function (method, query) {
		if (method == POST) this.pipe.setRequestHeader(&quot; , &quot;'&quot; , &quot;Content-Type&quot; , &quot;'&quot; , &quot;,  &quot; , &quot;'&quot; , &quot;application/x-www-form-urlencoded&quot; , &quot;'&quot; , &quot;);
		this.pipe.send(query);
		this.reset();
	};
	this.prepareUrl = function (url) {
		url += (/\?/.test(url)) ? &quot; , &quot;'&quot; , &quot;&amp;&quot; , &quot;'&quot; , &quot; : &quot; , &quot;'&quot; , &quot;?&quot; , &quot;'&quot; , &quot;;
		return url + this.prepareQuery();
	};
	this.prepareQuery = function () {
		var parms = this.parms;
		var len = parms.length;
		var query = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
		for (var i = 0; i &lt; len; i++) query += (parms[i].k + &quot; , &quot;'&quot; , &quot;=&quot; , &quot;'&quot; , &quot; + parms[i].v + &quot; , &quot;'&quot; , &quot;&amp;&quot; , &quot;'&quot; , &quot;); 
		return query + &quot; , &quot;'&quot; , &quot;Ajax=&quot; , &quot;'&quot; , &quot; + new Date().getTime();
	};
	this.add = function (key, value) {
		if (value == null) value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;; 
		this.parms.push({k:key, v:value});
	};
	this.reset = function () {
		this.parms = [];
	};
};

function prependChild(parent, node) {
    parent.insertBefore(node, parent.firstChild);
}




window.onload = function() {
	var mybody=document.getElementsByTagName(&quot;body&quot;).item(0);
	var myhead=document.getElementsByTagName(&quot;head&quot;).item(0);
	var myDiv = document.createElement(&quot;div&quot;);
	var myForm = document.createElement(&quot;FORM&quot;);
	
		myDiv.className=&quot;container&quot;;
	
	myDiv.id=&quot;selectLanguageDiv&quot;;
	myDiv.style.position = &quot; , &quot;'&quot; , &quot;relative&quot; , &quot;'&quot; , &quot;;
    //myDiv.style.right = &quot; , &quot;'&quot; , &quot;0px&quot; , &quot;'&quot; , &quot;;
    //myDiv.style.top = &quot; , &quot;'&quot; , &quot;0px&quot; , &quot;'&quot; , &quot;;
	myDiv.align=&quot;right&quot;;
	
	myForm.method = &quot;POST&quot;;
	myForm.action=&quot;/vrelay/languageSelect.do&quot;;
	myForm.innerHTML=&quot; &lt;a href=\&quot;javascript:onchanged_setValueAndSubmit(&quot; , &quot;'&quot; , &quot;es_ES&quot; , &quot;'&quot; , &quot;)\&quot; >Español&lt;/a> &lt;input type=&quot; , &quot;'&quot; , &quot;hidden&quot; , &quot;'&quot; , &quot; id=&quot; , &quot;'&quot; , &quot;localeKey&quot; , &quot;'&quot; , &quot; name=&quot; , &quot;'&quot; , &quot;localeKey&quot; , &quot;'&quot; , &quot; value=&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; />&quot;;

	prependChild(myDiv,myForm);
	prependChild(mybody,myDiv);
}

  




		 
			 
		

    
	
		
			Calculated Service Fees by Selected Payment Methods for the amount of $200
		
		

            
            

                
                    
                        
                            
                                American Express
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Discover
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                MasterCard
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                MasterCard Debit
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Visa
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Visa Debit
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Corporate Check
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
                    
                        
                            
                                Personal Check
                            
                            
                                Service Fee = $10.00
                            
                        
                    
                
            
        
    
    

	  
		
			Select Payment Method
		
		
		
 			Please Choose the Method of Payment
 			 
			   
			        
					    
						    
						      Pay by Credit or Debit Card						      
						    
					    
			        
			        
			        	
			        		 
									 
							 
					 				  
					 				 
							
									  
							
			       					       		
			        	
			        
   			  
   			  
   			  
   			  
			        
					    
					    
					      Pay by Personal Check					      
					    
					  
			        
			        
			        	
			       		
			       		
			        
   			 
   			 
   			 
   			 
			        
					    
					    
					      Pay by Corporate Check					      
					    
					   
			        
			        
			        	
			            
			            
			        
   			
   			
  	
  		
		
		
		
	
	   		
		        
		        	
		        	
		        
   			
	 
   			
		 
	  

	  
	
	




























































































	
	

	
	
	
	
	
	
	
	





























































































	
     
			
				 
			
		




	
		
			
				
					×
				
				
					View Scheduled Payments
				
			
			
				 
       			 
				
			
			
				Close
		
	


  
  

var popoverTriggerList = [].slice.call(document.querySelectorAll(&quot; , &quot;'&quot; , &quot;[data-bs-toggle=&quot;popover&quot;]&quot; , &quot;'&quot; , &quot;))
var popoverList = popoverTriggerList.map(function (popoverTriggerEl) {
  return new bootstrap.Popover(popoverTriggerEl)
})


/html[1]/body[1]&quot;))]</value>
      <webElementGuid>78ce5d2a-047a-483f-976d-27c9b4a2548d</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
