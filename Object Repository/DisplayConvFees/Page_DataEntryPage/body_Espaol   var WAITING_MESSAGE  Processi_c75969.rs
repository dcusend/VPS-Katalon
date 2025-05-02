<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Espaol   var WAITING_MESSAGE  Processi_c75969</name>
   <tag></tag>
   <elementGuidId>35253e4f-540b-4f58-9c24-4e02c1a514d5</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//*/text()[normalize-space(.)='']/parent::*</value>
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
         <value>internal:text=&quot;Español ✔ DisplayCalculatedFeeRegSCF - Pay By Personal Check Payment Information&quot;i</value>
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
      <webElementGuid>129935ab-39a5-405d-8b95-e590caf1bae7</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>bgcolor</name>
      <type>Main</type>
      <value>#ffffff</value>
      <webElementGuid>77baaf2b-6a19-4b95-95af-fcbe89737972</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value> Español 
	  



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




✔ DisplayCalculatedFeeRegSCF - Pay By Personal Check
    
    
    

       
    
    
    
    
    
    
    
    
	.vrelay-required {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;font-style: normal;font-weight: bold;font-variant: normal;text-align: left;}.vrelay-header {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 13px;font-style: normal;font-weight: normal;font-variant: normal;text-align: left;}.vrelay-error {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;font-style: normal;font-weight: bold;font-variant: normal;color: #FF0000;text-align: left;}.payor_opt {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 13px;font-style: normal;font-weight: normal;font-variant: normal;text-align: left;}input {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 13px;}select {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;}option {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 13px;}h1 {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 16px;}h2 {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 14px;text-align: left;}.instruction {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;text-align: left;}.shade { background-color: #E3E3E3; }body {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;font-style: normal;list-style-position: outside;list-style-type: square;}td {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;}.style2 {font-color: #FF0000;font-family: Arial, Helvetica, sans-serif;color: #FF0000;}
	
	
	
	
	
	
	
	
	  
	
	

	.required {
		color: #ff0000;
	}
	
	.modal.show {
		opacity: 1 !important;
	}
	select {
		appearance: auto !important;
		}
		/* Popover */
  .popover {
    border: 2px;
    font-size: 14px;
    font-weight: bold;
  }
	

 //&lt;!--
 		/**
		* Get ajax object
		*/
		function createXHR() {
		    if (typeof XMLHttpRequest != 'undefined') {
		        return new XMLHttpRequest();
		    } else if (typeof ActiveXObject != 'undefined')    {
		        if (typeof arguments.callee.activeXString != 'string') {
		            var version = [&quot;MSXML2.XMLHTTP.6.0&quot;, &quot;MSXML2.XMLHttp.3.0&quot;, &quot;MSXML2.XMLHTTP&quot;, &quot;Microsoft.XMLHTTP&quot;];
		            for (var i = 0, len = version.length; i &lt; len; ++i) {
		                try {
		                    var xhr = new ActiveXObject(versions[i]);
		                    arguments.callee.activeXString = versions[i];
		                    return xhr;
		                }
		                catch (ex){

		                }
		            }
		        }
		        return new ActiveXObject(arguments.callee.activeXString);
		    } else {
		        throw new Error(&quot;No XHR object available.&quot;);
		    }
		}
		
		/**
		 * Send ajax request
		 * url--url
		 * methodtype(post/get)
		 * con (true(asynchronous)|false(synchronous))
		 * parameter
		 */
		function ajaxrequest(url,methodtype,con,parameter){
			var json_data = null;
			var request = createXHR();
			request.open(methodtype,url+&quot;?&quot;+parameter,con);
			//request.setRequestHeader(&quot;Content-Type&quot;,&quot;application/json&quot;);
			request.setRequestHeader(&quot;Content-Type&quot;,&quot;application/x-www-form-urlencoded&quot;);
			request.onreadystatechange=function(){
				//if(request.readyState === 4 &amp;&amp; request.status === 200 ){//HTTP response has fully receiving to call
				if(request.readyState === 4 &amp;&amp; (request.status >= 200 &amp;&amp; request.status &lt; 300 || request.status === 304 || request.status === 1223 || request.status === 0)){
					var type = request.getResponseHeader(&quot;Content-Type&quot;);
					if(type.indexOf(&quot;application/json&quot;) !== -1){
						json_data = JSON.parse(request.responseText);
					}
				}
			};
			request.send(parameter);
			return json_data;
		}
		
		//parameter
		function createParam(){
			var form = document.process;
	
			var form = document.process;
			var param=&quot;billingCountry=&quot; + form.billingCountry.value + &quot;&amp;billingZip=&quot; + form.billingZip.value;
	
			return param;
		}
 
		function popitup3(txt){
			var html = txt;
			newwindow3=window.open('','name','height=250,width=450 screenX=750, screenY=200, left=650, scrollbars = yes');
			var tmp3 = newwindow3.document;
			tmp3.write(html);
			tmp3.write('&lt;p align = &quot;center&quot;>&lt;span class = &quot;close&quot;>&lt;a href=&quot;javascript:self.close()&quot;>'+ 'close'+'&lt;/a>&lt;/span>&lt;/p>');
			tmp3.write('&lt;/body>&lt;/html>');
			tmp3.close();
		}
		function setNull() {
			document.getElementById(&quot;selectLanguageAction&quot;).value='';
		}
		function disableButtons() {
			document.process.achSubmit.disabled = true;
			document.process.achSubmit.value = 'please wait...';
			if(document.process.changePaymentMethodButton != null){
				document.process.changePaymentMethodButton.disabled = true;
			}
			if(document.process.paymentPlanHistoryButton != null){
				document.process.paymentPlanHistoryButton.disabled = true;
			}
			if(document.process.existButton != null){
				document.process.existButton.disabled = true;
			}
			
		}
		function changePaymentMethod(){
			document.process.changePaymentMethodButton.disabled = true;
			document.process.changePaymentMethodButton.value = 'please wait...';
			document.process.achSubmit.disabled = true;
			document.changePaymentMethodForm.submit();
		}
		
		var empty_enable = false;
		function changeStateError(value){
			try {
				var stateInput = document.getElementById('billingState-input');
				var stateSelect = document.getElementById('billingState-select');
				var lable = document.getElementById('lable_check_state_fn_mr');
				var lable_zip = document.getElementById('lable_check_zip_fn_mr');
				var cityInput = document.getElementById('billing-city-input');
				var zipInput = document.getElementById('billing-zip-input');
				var check_state_default_fn_mr = 'State';
				var check_zip_default_fn_mr = 'ZIP Code';
				
				var state_select_value = stateSelect.value; 
				
				document.getElementById('billing-zip-input-err').innerHTML = '';
				stateSelect.options.length = 0;
				stateSelect.options.add(new Option('--Select One--',''));
				if(empty_enable){
					stateInput.value = '';
					cityInput.value = '';
					zipInput.value = '';	
					document.getElementById('billing-zip-input-err-from-formbean').innerHTML = '';
				}
				empty_enable = true;
				if(value == null || value == ''){
					stateInput.name = 'billingState_invalid';
					stateInput.style.display=&quot;none&quot;;
					lable.innerHTML = check_state_default_fn_mr;
					stateInput.alt = check_state_default_fn_mr;
					stateSelect.name = &quot;billingState&quot;;
					stateSelect.style.display=&quot;&quot;;
					lable_zip.innerHTML = check_zip_default_fn_mr;
					zipInput.alt = check_zip_default_fn_mr;
					return;
				}
				
				var json_data = ajaxrequest('/vrelay/getStates4AJAX.do','post',false,createParam());
				if(json_data != null){
					lable.innerHTML = json_data.country.countryDivisionTypeName;
					stateInput.alt = json_data.country.countryDivisionTypeName;
					stateSelect.alt = json_data.country.countryDivisionTypeName;
					lable_zip.innerHTML = json_data.country.zipTypeName;
					zipInput.alt = json_data.country.zipTypeName;
					var states = json_data.states;
					if(states == null || states == ''){
						stateSelect.name = &quot;billingState_invalid&quot;
						stateSelect.style.display = &quot;none&quot;;
						stateInput.name = &quot;billingState&quot;;
						stateInput.style.display = &quot;&quot;;
					}else{			
						for(var index in states){
							if(state_select_value == states[index].stateAbbr){							
								var option = new Option(states[index].stateName,states[index].stateAbbr);
								option.selected = true;
								stateSelect.options.add(option);
							}else{
								stateSelect.options.add(new Option(states[index].stateName,states[index].stateAbbr));
							}
						} 	
						stateInput.name = &quot;billingState_invalid&quot;;
						stateInput.style.display=&quot;none&quot;;
						stateSelect.name = &quot;billingState&quot;;
						stateSelect.style.display=&quot;&quot;;
					}
				}
			} catch (e) {
				//alert(e.name + &quot;: &quot; + e.message);
			}
		}
		function changeState(obj){
			try {
				var stateInput = document.getElementById('billingState-input');
				var stateSelect = document.getElementById('billingState-select');
				var lable = document.getElementById('lable_check_state_fn_mr');
				var lable_zip = document.getElementById('lable_check_zip_fn_mr');
				var cityInput = document.getElementById('billing-city-input');
				var zipInput = document.getElementById('billing-zip-input');
				var check_state_default_fn_mr = 'State';
				var check_zip_default_fn_mr = 'ZIP Code';
				
				var state_select_value = stateSelect.value; 
				
				document.getElementById('billing-zip-input-err').innerHTML = '';
				stateSelect.options.length = 0;
				stateSelect.options.add(new Option('--Select One--',''));
				if(empty_enable){
					stateInput.value = '';
					cityInput.value = '';
					zipInput.value = '';	
					document.getElementById('billing-zip-input-err-from-formbean').innerHTML = '';
				}
				empty_enable = true;
				if(obj.value == null || obj.value == ''){
					stateInput.name = 'billingState_invalid';
					stateInput.style.display=&quot;none&quot;;
					lable.innerHTML = check_state_default_fn_mr;
					stateInput.alt = check_state_default_fn_mr;
					stateSelect.name = &quot;billingState&quot;;
					stateSelect.style.display=&quot;&quot;;
					lable_zip.innerHTML = check_zip_default_fn_mr;
					zipInput.alt = check_zip_default_fn_mr;
					return;
				}
				
				var json_data = ajaxrequest('/vrelay/getStates4AJAX.do','post',false,createParam());
				
				if(json_data != null){
					lable.innerHTML = json_data.country.countryDivisionTypeName;
					stateInput.alt = json_data.country.countryDivisionTypeName;
					stateSelect.alt = json_data.country.countryDivisionTypeName;
					lable_zip.innerHTML = json_data.country.zipTypeName;
					zipInput.alt = json_data.country.zipTypeName;
					var states = json_data.states;
					if(states == null || states == ''){
						stateSelect.name = &quot;billingState_invalid&quot;
						stateSelect.style.display = &quot;none&quot;;
						stateInput.name = &quot;billingState&quot;;
						stateInput.style.display = &quot;&quot;;
					}else{
						for(var index in states){
							if(state_select_value == states[index].stateAbbr){
								var option = new Option(states[index].stateName,states[index].stateAbbr);
								option.selected = true;
								stateSelect.options.add(option);
							}else{
								stateSelect.options.add(new Option(states[index].stateName,states[index].stateAbbr));
							}
						} 	
						stateInput.name = &quot;billingState_invalid&quot;;
						stateInput.style.display=&quot;none&quot;;
						stateSelect.name = &quot;billingState&quot;;
						stateSelect.style.display=&quot;&quot;;
					}
				}
			} catch (e) {
				//alert(e.name + &quot;: &quot; + e.message);
			}
		}
		
		function changeListener4ZipCode(obj){
			try {
				var country_input = document.getElementById('billing-country-input');
				if(country_input.value == null || country_input.value == ''){
					return;
				}
				
				document.getElementById('billing-zip-input-err-from-formbean').innerHTML = '';
				var err = document.getElementById('billing-zip-input-err');
				err.innerHTML = '';
				//if(country_input.value.toLowerCase() == 'US'.toLowerCase()){
					if (obj.value == null || obj.value == '') {//show err
						err.innerHTML = '&lt;img src=&quot;/_vrelay/images/halt_sm.gif&quot; width=&quot;16&quot; height=&quot;16&quot; border=&quot;0&quot; alt=&quot;Error&quot; />' + '{0} is required'.replace('{0}', document.getElementById('lable_check_zip_fn_mr').innerHTML);
						return;
					}
				//}
				
				var json_data = ajaxrequest('/vrelay/getInternationalAddressByCountryIdAndZipCode4AJAX.do','post', false, createParam());

				if (json_data != null) {
					var zipCode = json_data.zipCode;
					if (zipCode != null &amp;&amp; zipCode != '') {
						var city_input = document.getElementById('billing-city-input');
						city_input.value = json_data.city;
						var state_select = document.getElementById('billingState-select');
						state_select.options.length = 0;
						state_select.options.add(new Option('--Select One--', ''));
						var state_input = document.getElementById('billingState-input');
						state_input.value = '';
						var states = json_data.states;
						for ( var index in states) {
						if (json_data.stateAbbr == states[index].stateAbbr) {
							var option = new Option(states[index].stateName, states[index].stateAbbr);
							option.selected = true;
							state_select.options.add(option);
						} else {
							state_select.options.add(new Option(states[index].stateName, states[index].stateAbbr));
						}
					}
				} else {//show no match

				}
			}
		} catch (e) {
			//alert(e.name + &quot;: &quot; + e.message);
		}
	}
	
	
	function changeZipCode(){
			try {
				var country_input = document.getElementById('billing-country-input');
				if(country_input.value == null || country_input.value == ''){
					return;
				}
				
				document.getElementById('billing-zip-input-err-from-formbean').innerHTML = '';
				var err = document.getElementById('billing-zip-input-err');
				err.innerHTML = '';
				var json_data = ajaxrequest('/vrelay/getInternationalAddressByCountryIdAndZipCode4AJAX.do','post', false, createParam());
				if (json_data != null) {
					var zipCode = json_data.zipCode;
					if (zipCode != null &amp;&amp; zipCode != '') {
						var city_input = document.getElementById('billing-city-input');
						city_input.value = json_data.city;
						var state_select = document.getElementById('billingState-select');
						state_select.options.length = 0;
						state_select.options.add(new Option('--Select One--', ''));
						var state_input = document.getElementById('billingState-input');
						state_input.value = '';
						var states = json_data.states;
						for ( var index in states) {
						if (json_data.stateAbbr == states[index].stateAbbr) {
							var option = new Option(states[index].stateName, states[index].stateAbbr);
							option.selected = true;
							state_select.options.add(option);
						} else {
							state_select.options.add(new Option(states[index].stateName, states[index].stateAbbr));
						}
					}
				} else {//show no match

				}
			}
		} catch (e) {
			//alert(e.name + &quot;: &quot; + e.message);
		}
	}

	function validateRTN(obj) {
		var routingName = document.getElementById('routingName');
		routingName.innerHTML = '';	
		
		if (obj.value == null || obj.value == '') {
			return;
		}
		document.getElementById('billing-routingNumber-input-err-from-formbean').innerHTML = '';
		var err = document.getElementById('billing-routingNumber-input-err');
		err.innerHTML = '';
		
		var json_data = ajaxrequest('/vrelay/validateRTN.do','post', false, &quot;routingNumber=&quot;+obj.value);
		if (json_data != null) {
			if (json_data.routingName != null &amp;&amp; json_data.routingName != '') {
				routingName.innerHTML = json_data.routingName;
			}else{
				err.innerHTML = '{0}Routing number is invalid'.replace('{0}','&lt;img src=&quot;/_vrelay/images/halt_sm.gif&quot; width=&quot;16&quot; height=&quot;16&quot; border=&quot;0&quot; alt=&quot;Error&quot; />');
			}
		}
	}
	function phoneNumberFormat(value){
		var phoneNum = value;  

	    if (!/^[\d|-]*$/.test(phoneNum) || phoneNum.length > 12) {  
	    	document.getElementById(&quot;smsNumber&quot;).value = phoneNum.substring(0, phoneNum.length - 1);  
	    }  

	    var checkPhoneNum = /^[0-9]\d+$/;
	    if (checkPhoneNum.test(phoneNum) &amp;&amp; phoneNum.length == 4) {  
	    	document.getElementById(&quot;smsNumber&quot;).value = phoneNum.substring(0, 3) + &quot;-&quot; +phoneNum.substring(3, phoneNum.length);  
	        return ;  
	    }
	    checkPhoneNum = /^[0-9]{3}-[0-9]\d+$/;
	    if (checkPhoneNum.test(phoneNum) &amp;&amp; phoneNum.length == 8) {  
	    	document.getElementById(&quot;smsNumber&quot;).value = phoneNum.substring(0, 7) + &quot;-&quot; +phoneNum.substring(7, phoneNum.length);  
	        return ;  
	    }
	    correctingPhoneNumber(phoneNum);
	}
	
	function correctingPhoneNumber(phoneNumber) {
		if ((phoneNumber.match(/\d/g) || []).length === 10) {
			var smsNumber = ('' + phoneNumber).replace(/\D/g, '');
			  var match = smsNumber.match(/^(\d{3})(\d{3})(\d{4})$/);
			  if (match) {
				  document.getElementById(&quot;smsNumber&quot;).value = match[1] + '-' + match[2] + '-' + match[3];
			  }
		} else {
		  return;	
		}
	}
	
    function changeDeferredDate(_date){
		var date = new Date(_date);
		var today = new Date();
		
		if(document.getElementById(&quot;emailAddressNORequired&quot;) != null){
			if (today.getTime() &lt; date.getTime()) {
				document.getElementById(&quot;emailAddressRequired&quot;).style.display = &quot;block&quot;;
				document.getElementById(&quot;emailAddressNORequired&quot;).style.display = &quot;none&quot;;
			}else{
				document.getElementById(&quot;emailAddressRequired&quot;).style.display = &quot;none&quot;;
				document.getElementById(&quot;emailAddressNORequired&quot;).style.display = &quot;block&quot;;
			}
		}
		if(document.getElementById(&quot;achSavePaymentMethodCheckbox&quot;) != null &amp;&amp; document.getElementById(&quot;achSavePaymentMethodMessage&quot;) !=null){
			if (today.getTime() &lt; date.getTime()) {
				document.getElementById(&quot;achSavePaymentMethodMessage&quot;).style.display = &quot;block&quot;;
				document.getElementById(&quot;achSavePaymentMethodCheckbox&quot;).style.display = &quot;none&quot;;
			}else{
				document.getElementById(&quot;achSavePaymentMethodMessage&quot;).style.display = &quot;none&quot;;
				document.getElementById(&quot;achSavePaymentMethodCheckbox&quot;).style.display = &quot;block&quot;;
			}
		}
	}
// -->
var tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle=&quot;tooltip&quot;]'))
var tooltipList = tooltipTriggerList.map(function (tooltipTriggerEl) {
  return new bootstrap.Tooltip(tooltipTriggerEl)
})





	 
		 
	
	 
		 			
			
			
			
			
			
			
			
			
			  
		       
			      
				      
				      	Payment Information
				      	      
			      

			
			   
				      
						
						
			   
				
				      
				      	
							First Name on Check* 
								

							
							
							
						
					   
					   
							
								Last Name on Check* 
									

								
								
								
							
					   
			   	
			
				
				      
				      	
							Routing Transit Number* 
								

							
							
		 						
							
							
							
							
						
					   
					   
						
							Type of Account* 
								

							
					   			
							
								
								
									Checking
								  
								
									Saving 
								
								
							
								
								 
					   
			   		
			   			
				
				      
				      	
							Account Number* 
								

							
							
														
							
								
											
					   
					   
							
								Confirm Account Number* 
									

								
								
															
								
								 					 
							
					   
			   				
			
						
			


				
				      
				      
						Address Line 1* 
							

						
						
																		
										
							
						
									
									 
						 
					   
					   
						
							Address Line 2 
								

							
							

											
										
							 	 						
																			
										
						
					   
			   
		
			
				 
				 	
						Country* 
							

						
						
									
						
										
						United States

										
											
									
						
				
						
					
				
						
					
						ZIP Code* 
						

						
				
						
						
							
						
				

							
							
													
						
				
			   
			  
			
				 
				 
					City* 
						

					
				
						
							
						
				
												
					
				
								
					
						State* 
							

						
								
										
										
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
										--Select One--Armed Forces Americas                   Armed Forces Europe                     Armed Forces Canada                     Armed Forces Africa                     Armed Forces Middle East                Armed Forces Pacific                    Alabama                                 Alaska                                  American Samoa                          Arizona                                 Arkansas                                California                              Colorado                                Connecticut                             Delaware                                District of Columbia                    Federated States of Micronesia          Florida                                 Georgia                                 Guam                                    Hawaii                                  Idaho                                   Illinois                                Indiana                                 Iowa                                    Kansas                                  Kentucky                                Louisiana                               Maine                                   Maryland                                Massachusetts                           Michigan                                Minnesota                               Mississippi                             Missouri                                Montana                                 Nebraska                                Nevada                                  New Hampshire                           New Jersey                              New Mexico                              New York                                North Carolina                          North Dakota                            Northern Mariana Islands                Ohio                                    Oklahoma                                Oregon                                  Palau                                   Pennsylvania                            Puerto Rico                             Rhode Island                            South Carolina                          South Dakota                            Tennessee                               Texas                                   Utah                                    Vermont                                 Virgin Islands                          Virginia                                Washington                              West Virginia                           Wisconsin                               Wyoming                                 Marshall Island                          
										
									
								 
																
					
				
				
	
	
				
					
			
			
		
			
				 
				 	
					
					    
							Email Address* 

							Email Address 
				
						
					
						
						
						
						
					
				
			
					
		
			
					
				      						
						
							  
						
					   
				
				 
              	
				      						
						
							  
						
					   
				
              
			
             
			  
			   
				
				      
				      	
					      	
					      		Bill/Invoice Information
					      	
					      	
				      	      
			    	
					  
				
			
			 
					Amount 
						
					
					
	
					

							
							       $
							       
							 
					 
		 					 
							 
							 
							 
							
				
			 
	        
	
 				
				      
				      	
				      		
							Bill/Invoice Details
						
				           
			     	
				
				      
				      	
				      	 
								

				      		
				      			
				      				
							      	
							      		UDF1* 
							      		
							      		

							      	 
						      		
									
									
										
									
									
									 
				      		     
			    			 
																		
											
													      	
													      		
													      				
																      	
																      		UDF2
																      		
																      		

																      	 
															      		
																		
																			
																		
																		
																		 
													      		     
												    	  
									 
																		
											
													      	
													      		
													      				
																      	
																      		UDF3
																      		
																      		

																      	 
												
																 
																
																	
																	
																				
																
																 
													      	       
												    		
									 				
																		
											
													      	
													      		
													      				
																      	
																      		UDF4
																      		
																      		

																      	 
									 
																	
																		
																	
									  
									 						
													      	     
												    	
													
																		
									
											
									
											
													      	
													      		
													      				
																      	
																      		UDF5
																      		
																      		

																      	 
									 
																	
																		
																	 
									   
									 						
													      	     
												    				
									
											
											
																
									
									
											
													      	
													      		
													      				
																      	
																      		UDF6
																      		
																      		

																      	 
									 
																	
																		
																	 
									   
									  				
													      	      
												    				 
									
											
																		
									
											
											
													      	
													      		
													      				
																      	
																      		UDF7
																      		
																      		

																      	 
																 
																	
																		
																	 
									 		 
									  				
													      	     
												    	
													
											
																		
									
											
													      	
													      		
													      				
																      	
																      		UDF8
																      		
																      		 

																      	 
									 
																	
																		
																	  
									   
									  				
													      		     
												    		 
									
											
																		
																
											
													      	
													      		
													      				
																      	
																      		UDF9
																      		
																      		

																      	 
									 
																
																	
																 
									  
									  				
													      		     
												    		
											
									
									
											
																		
																
									
											
													      	
													      		
													      				
																      	
																      		UDF10
																      		
																      		

																      	 
									 
																	
																		
																	
									  
									  				
													      	     
												    	
									
											
												
															
				      	 
				      	
				      
							  
			   
			 

				
				 
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
					
				 
				
				
				
				 
				 
				
				 
				
				
				
				
				
					
					
								
					
					 
						 
						
						 		
								 
								
								
						
				
				
										
					
						
						
							
						
						
												
						
							
						
						
					
						
							
						
						
				
				
				
			
				
		 
	
	
	
$('.form_date').datetimepicker({
    language:  'en',
    weekStart: 0,
    todayBtn:  1,
	autoclose: 1,
	todayHighlight: 1,
	startView: 2,
	minView: 2,
	forceParse: 0,
	startDate:new Date()
});
$(function() {  
	$('#udfcontent').on('show.bs.collapse', function () {
		$('#udfcontentImg').attr('src', '/vrelay/bootstrap/images/minus.gif');
	});
	$('#udfcontent').on('hide.bs.collapse', function () {
		$('#udfcontentImg').attr('src', '/vrelay/bootstrap/images/plus.gif');
	});

});

	 
		  
	
	



	
			
				
				
				
				
				
				
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
					
				 
				
				
				
				
				 
				 
				
				 
				 
				
				
				
				
				
				
				
				
			
	
	

	



//&lt;!--

		
//changeState(document.getElementById('billing-country-input'));
		
	
	

	
validateRTN(document.getElementById('routingNumber'));
	



	changeZipCode();



//-->







		


/* $(function () { 
	$(&quot;[data-toggle='popover']&quot;).popover({
	    html: true, 
		content: function() {
	          return $('.popover-content').html();
	        }
	});
	
	$(&quot;[data-toggle='popover']&quot;).on('shown.bs.popover', function () {
		var objId = $(this).attr(&quot;id&quot;);	
		var allinfos = $(&quot;[data-toggle='popover']&quot;);
		for(var i=0;i&lt;allinfos.length;i++){
			if($(allinfos[i]).attr(&quot;id&quot;) != objId){
				$(allinfos[i]).popover('hide');
			}
		}
	})
}); */

$('input').on(&quot;keypress&quot;, function(e) {
    /* ENTER PRESSED*/
    if (e.keyCode == 13) {
        /* FOCUS ELEMENT */
        var inputs = $(this).parents(&quot;form&quot;).eq(0).find(&quot;:input&quot;);
        var idx = inputs.index(this);

        if (idx == inputs.length - 1) {
            inputs[0].select()
        } else {
            inputs[idx + 1].focus(); //  handles submit buttons
            inputs[idx + 1].select();
        }
        return false;
    }
});



var popoverTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle=&quot;popover&quot;]'))
var popoverList = popoverTriggerList.map(function (popoverTriggerEl) {
  return new bootstrap.Popover(popoverTriggerEl)
})

console.log(&quot;Popover called in ACHForm.jsp  -------------&quot;);

/html[1]/body[1]</value>
      <webElementGuid>28eb74b8-9285-4fa3-9766-11dd6f933525</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]</value>
      <webElementGuid>bc40bfb9-556f-416b-b62f-cae3c17c41bc</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>//*/text()[normalize-space(.)='']/parent::*</value>
      <webElementGuid>cafa595a-f695-403c-8ec0-5d5404b19535</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>1fd66bfd-c7de-4e8a-9f8d-b8a1277a2b97</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot; Español 
	  



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




✔ DisplayCalculatedFeeRegSCF - Pay By Personal Check
    
    
    

       
    
    
    
    
    
    
    
    
	.vrelay-required {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;font-style: normal;font-weight: bold;font-variant: normal;text-align: left;}.vrelay-header {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 13px;font-style: normal;font-weight: normal;font-variant: normal;text-align: left;}.vrelay-error {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;font-style: normal;font-weight: bold;font-variant: normal;color: #FF0000;text-align: left;}.payor_opt {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 13px;font-style: normal;font-weight: normal;font-variant: normal;text-align: left;}input {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 13px;}select {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;}option {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 13px;}h1 {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 16px;}h2 {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 14px;text-align: left;}.instruction {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;text-align: left;}.shade { background-color: #E3E3E3; }body {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;font-style: normal;list-style-position: outside;list-style-type: square;}td {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;}.style2 {font-color: #FF0000;font-family: Arial, Helvetica, sans-serif;color: #FF0000;}
	
	
	
	
	
	
	
	
	  
	
	

	.required {
		color: #ff0000;
	}
	
	.modal.show {
		opacity: 1 !important;
	}
	select {
		appearance: auto !important;
		}
		/* Popover */
  .popover {
    border: 2px;
    font-size: 14px;
    font-weight: bold;
  }
	

 //&lt;!--
 		/**
		* Get ajax object
		*/
		function createXHR() {
		    if (typeof XMLHttpRequest != &quot; , &quot;'&quot; , &quot;undefined&quot; , &quot;'&quot; , &quot;) {
		        return new XMLHttpRequest();
		    } else if (typeof ActiveXObject != &quot; , &quot;'&quot; , &quot;undefined&quot; , &quot;'&quot; , &quot;)    {
		        if (typeof arguments.callee.activeXString != &quot; , &quot;'&quot; , &quot;string&quot; , &quot;'&quot; , &quot;) {
		            var version = [&quot;MSXML2.XMLHTTP.6.0&quot;, &quot;MSXML2.XMLHttp.3.0&quot;, &quot;MSXML2.XMLHTTP&quot;, &quot;Microsoft.XMLHTTP&quot;];
		            for (var i = 0, len = version.length; i &lt; len; ++i) {
		                try {
		                    var xhr = new ActiveXObject(versions[i]);
		                    arguments.callee.activeXString = versions[i];
		                    return xhr;
		                }
		                catch (ex){

		                }
		            }
		        }
		        return new ActiveXObject(arguments.callee.activeXString);
		    } else {
		        throw new Error(&quot;No XHR object available.&quot;);
		    }
		}
		
		/**
		 * Send ajax request
		 * url--url
		 * methodtype(post/get)
		 * con (true(asynchronous)|false(synchronous))
		 * parameter
		 */
		function ajaxrequest(url,methodtype,con,parameter){
			var json_data = null;
			var request = createXHR();
			request.open(methodtype,url+&quot;?&quot;+parameter,con);
			//request.setRequestHeader(&quot;Content-Type&quot;,&quot;application/json&quot;);
			request.setRequestHeader(&quot;Content-Type&quot;,&quot;application/x-www-form-urlencoded&quot;);
			request.onreadystatechange=function(){
				//if(request.readyState === 4 &amp;&amp; request.status === 200 ){//HTTP response has fully receiving to call
				if(request.readyState === 4 &amp;&amp; (request.status >= 200 &amp;&amp; request.status &lt; 300 || request.status === 304 || request.status === 1223 || request.status === 0)){
					var type = request.getResponseHeader(&quot;Content-Type&quot;);
					if(type.indexOf(&quot;application/json&quot;) !== -1){
						json_data = JSON.parse(request.responseText);
					}
				}
			};
			request.send(parameter);
			return json_data;
		}
		
		//parameter
		function createParam(){
			var form = document.process;
	
			var form = document.process;
			var param=&quot;billingCountry=&quot; + form.billingCountry.value + &quot;&amp;billingZip=&quot; + form.billingZip.value;
	
			return param;
		}
 
		function popitup3(txt){
			var html = txt;
			newwindow3=window.open(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;name&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;height=250,width=450 screenX=750, screenY=200, left=650, scrollbars = yes&quot; , &quot;'&quot; , &quot;);
			var tmp3 = newwindow3.document;
			tmp3.write(html);
			tmp3.write(&quot; , &quot;'&quot; , &quot;&lt;p align = &quot;center&quot;>&lt;span class = &quot;close&quot;>&lt;a href=&quot;javascript:self.close()&quot;>&quot; , &quot;'&quot; , &quot;+ &quot; , &quot;'&quot; , &quot;close&quot; , &quot;'&quot; , &quot;+&quot; , &quot;'&quot; , &quot;&lt;/a>&lt;/span>&lt;/p>&quot; , &quot;'&quot; , &quot;);
			tmp3.write(&quot; , &quot;'&quot; , &quot;&lt;/body>&lt;/html>&quot; , &quot;'&quot; , &quot;);
			tmp3.close();
		}
		function setNull() {
			document.getElementById(&quot;selectLanguageAction&quot;).value=&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
		}
		function disableButtons() {
			document.process.achSubmit.disabled = true;
			document.process.achSubmit.value = &quot; , &quot;'&quot; , &quot;please wait...&quot; , &quot;'&quot; , &quot;;
			if(document.process.changePaymentMethodButton != null){
				document.process.changePaymentMethodButton.disabled = true;
			}
			if(document.process.paymentPlanHistoryButton != null){
				document.process.paymentPlanHistoryButton.disabled = true;
			}
			if(document.process.existButton != null){
				document.process.existButton.disabled = true;
			}
			
		}
		function changePaymentMethod(){
			document.process.changePaymentMethodButton.disabled = true;
			document.process.changePaymentMethodButton.value = &quot; , &quot;'&quot; , &quot;please wait...&quot; , &quot;'&quot; , &quot;;
			document.process.achSubmit.disabled = true;
			document.changePaymentMethodForm.submit();
		}
		
		var empty_enable = false;
		function changeStateError(value){
			try {
				var stateInput = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-input&quot; , &quot;'&quot; , &quot;);
				var stateSelect = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-select&quot; , &quot;'&quot; , &quot;);
				var lable = document.getElementById(&quot; , &quot;'&quot; , &quot;lable_check_state_fn_mr&quot; , &quot;'&quot; , &quot;);
				var lable_zip = document.getElementById(&quot; , &quot;'&quot; , &quot;lable_check_zip_fn_mr&quot; , &quot;'&quot; , &quot;);
				var cityInput = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-city-input&quot; , &quot;'&quot; , &quot;);
				var zipInput = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input&quot; , &quot;'&quot; , &quot;);
				var check_state_default_fn_mr = &quot; , &quot;'&quot; , &quot;State&quot; , &quot;'&quot; , &quot;;
				var check_zip_default_fn_mr = &quot; , &quot;'&quot; , &quot;ZIP Code&quot; , &quot;'&quot; , &quot;;
				
				var state_select_value = stateSelect.value; 
				
				document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				stateSelect.options.length = 0;
				stateSelect.options.add(new Option(&quot; , &quot;'&quot; , &quot;--Select One--&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;));
				if(empty_enable){
					stateInput.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
					cityInput.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
					zipInput.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;	
					document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err-from-formbean&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				}
				empty_enable = true;
				if(value == null || value == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
					stateInput.name = &quot; , &quot;'&quot; , &quot;billingState_invalid&quot; , &quot;'&quot; , &quot;;
					stateInput.style.display=&quot;none&quot;;
					lable.innerHTML = check_state_default_fn_mr;
					stateInput.alt = check_state_default_fn_mr;
					stateSelect.name = &quot;billingState&quot;;
					stateSelect.style.display=&quot;&quot;;
					lable_zip.innerHTML = check_zip_default_fn_mr;
					zipInput.alt = check_zip_default_fn_mr;
					return;
				}
				
				var json_data = ajaxrequest(&quot; , &quot;'&quot; , &quot;/vrelay/getStates4AJAX.do&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;post&quot; , &quot;'&quot; , &quot;,false,createParam());
				if(json_data != null){
					lable.innerHTML = json_data.country.countryDivisionTypeName;
					stateInput.alt = json_data.country.countryDivisionTypeName;
					stateSelect.alt = json_data.country.countryDivisionTypeName;
					lable_zip.innerHTML = json_data.country.zipTypeName;
					zipInput.alt = json_data.country.zipTypeName;
					var states = json_data.states;
					if(states == null || states == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
						stateSelect.name = &quot;billingState_invalid&quot;
						stateSelect.style.display = &quot;none&quot;;
						stateInput.name = &quot;billingState&quot;;
						stateInput.style.display = &quot;&quot;;
					}else{			
						for(var index in states){
							if(state_select_value == states[index].stateAbbr){							
								var option = new Option(states[index].stateName,states[index].stateAbbr);
								option.selected = true;
								stateSelect.options.add(option);
							}else{
								stateSelect.options.add(new Option(states[index].stateName,states[index].stateAbbr));
							}
						} 	
						stateInput.name = &quot;billingState_invalid&quot;;
						stateInput.style.display=&quot;none&quot;;
						stateSelect.name = &quot;billingState&quot;;
						stateSelect.style.display=&quot;&quot;;
					}
				}
			} catch (e) {
				//alert(e.name + &quot;: &quot; + e.message);
			}
		}
		function changeState(obj){
			try {
				var stateInput = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-input&quot; , &quot;'&quot; , &quot;);
				var stateSelect = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-select&quot; , &quot;'&quot; , &quot;);
				var lable = document.getElementById(&quot; , &quot;'&quot; , &quot;lable_check_state_fn_mr&quot; , &quot;'&quot; , &quot;);
				var lable_zip = document.getElementById(&quot; , &quot;'&quot; , &quot;lable_check_zip_fn_mr&quot; , &quot;'&quot; , &quot;);
				var cityInput = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-city-input&quot; , &quot;'&quot; , &quot;);
				var zipInput = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input&quot; , &quot;'&quot; , &quot;);
				var check_state_default_fn_mr = &quot; , &quot;'&quot; , &quot;State&quot; , &quot;'&quot; , &quot;;
				var check_zip_default_fn_mr = &quot; , &quot;'&quot; , &quot;ZIP Code&quot; , &quot;'&quot; , &quot;;
				
				var state_select_value = stateSelect.value; 
				
				document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				stateSelect.options.length = 0;
				stateSelect.options.add(new Option(&quot; , &quot;'&quot; , &quot;--Select One--&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;));
				if(empty_enable){
					stateInput.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
					cityInput.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
					zipInput.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;	
					document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err-from-formbean&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				}
				empty_enable = true;
				if(obj.value == null || obj.value == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
					stateInput.name = &quot; , &quot;'&quot; , &quot;billingState_invalid&quot; , &quot;'&quot; , &quot;;
					stateInput.style.display=&quot;none&quot;;
					lable.innerHTML = check_state_default_fn_mr;
					stateInput.alt = check_state_default_fn_mr;
					stateSelect.name = &quot;billingState&quot;;
					stateSelect.style.display=&quot;&quot;;
					lable_zip.innerHTML = check_zip_default_fn_mr;
					zipInput.alt = check_zip_default_fn_mr;
					return;
				}
				
				var json_data = ajaxrequest(&quot; , &quot;'&quot; , &quot;/vrelay/getStates4AJAX.do&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;post&quot; , &quot;'&quot; , &quot;,false,createParam());
				
				if(json_data != null){
					lable.innerHTML = json_data.country.countryDivisionTypeName;
					stateInput.alt = json_data.country.countryDivisionTypeName;
					stateSelect.alt = json_data.country.countryDivisionTypeName;
					lable_zip.innerHTML = json_data.country.zipTypeName;
					zipInput.alt = json_data.country.zipTypeName;
					var states = json_data.states;
					if(states == null || states == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
						stateSelect.name = &quot;billingState_invalid&quot;
						stateSelect.style.display = &quot;none&quot;;
						stateInput.name = &quot;billingState&quot;;
						stateInput.style.display = &quot;&quot;;
					}else{
						for(var index in states){
							if(state_select_value == states[index].stateAbbr){
								var option = new Option(states[index].stateName,states[index].stateAbbr);
								option.selected = true;
								stateSelect.options.add(option);
							}else{
								stateSelect.options.add(new Option(states[index].stateName,states[index].stateAbbr));
							}
						} 	
						stateInput.name = &quot;billingState_invalid&quot;;
						stateInput.style.display=&quot;none&quot;;
						stateSelect.name = &quot;billingState&quot;;
						stateSelect.style.display=&quot;&quot;;
					}
				}
			} catch (e) {
				//alert(e.name + &quot;: &quot; + e.message);
			}
		}
		
		function changeListener4ZipCode(obj){
			try {
				var country_input = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-country-input&quot; , &quot;'&quot; , &quot;);
				if(country_input.value == null || country_input.value == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
					return;
				}
				
				document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err-from-formbean&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				var err = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err&quot; , &quot;'&quot; , &quot;);
				err.innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				//if(country_input.value.toLowerCase() == &quot; , &quot;'&quot; , &quot;US&quot; , &quot;'&quot; , &quot;.toLowerCase()){
					if (obj.value == null || obj.value == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) {//show err
						err.innerHTML = &quot; , &quot;'&quot; , &quot;&lt;img src=&quot;/_vrelay/images/halt_sm.gif&quot; width=&quot;16&quot; height=&quot;16&quot; border=&quot;0&quot; alt=&quot;Error&quot; />&quot; , &quot;'&quot; , &quot; + &quot; , &quot;'&quot; , &quot;{0} is required&quot; , &quot;'&quot; , &quot;.replace(&quot; , &quot;'&quot; , &quot;{0}&quot; , &quot;'&quot; , &quot;, document.getElementById(&quot; , &quot;'&quot; , &quot;lable_check_zip_fn_mr&quot; , &quot;'&quot; , &quot;).innerHTML);
						return;
					}
				//}
				
				var json_data = ajaxrequest(&quot; , &quot;'&quot; , &quot;/vrelay/getInternationalAddressByCountryIdAndZipCode4AJAX.do&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;post&quot; , &quot;'&quot; , &quot;, false, createParam());

				if (json_data != null) {
					var zipCode = json_data.zipCode;
					if (zipCode != null &amp;&amp; zipCode != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) {
						var city_input = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-city-input&quot; , &quot;'&quot; , &quot;);
						city_input.value = json_data.city;
						var state_select = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-select&quot; , &quot;'&quot; , &quot;);
						state_select.options.length = 0;
						state_select.options.add(new Option(&quot; , &quot;'&quot; , &quot;--Select One--&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;));
						var state_input = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-input&quot; , &quot;'&quot; , &quot;);
						state_input.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
						var states = json_data.states;
						for ( var index in states) {
						if (json_data.stateAbbr == states[index].stateAbbr) {
							var option = new Option(states[index].stateName, states[index].stateAbbr);
							option.selected = true;
							state_select.options.add(option);
						} else {
							state_select.options.add(new Option(states[index].stateName, states[index].stateAbbr));
						}
					}
				} else {//show no match

				}
			}
		} catch (e) {
			//alert(e.name + &quot;: &quot; + e.message);
		}
	}
	
	
	function changeZipCode(){
			try {
				var country_input = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-country-input&quot; , &quot;'&quot; , &quot;);
				if(country_input.value == null || country_input.value == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
					return;
				}
				
				document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err-from-formbean&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				var err = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err&quot; , &quot;'&quot; , &quot;);
				err.innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				var json_data = ajaxrequest(&quot; , &quot;'&quot; , &quot;/vrelay/getInternationalAddressByCountryIdAndZipCode4AJAX.do&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;post&quot; , &quot;'&quot; , &quot;, false, createParam());
				if (json_data != null) {
					var zipCode = json_data.zipCode;
					if (zipCode != null &amp;&amp; zipCode != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) {
						var city_input = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-city-input&quot; , &quot;'&quot; , &quot;);
						city_input.value = json_data.city;
						var state_select = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-select&quot; , &quot;'&quot; , &quot;);
						state_select.options.length = 0;
						state_select.options.add(new Option(&quot; , &quot;'&quot; , &quot;--Select One--&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;));
						var state_input = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-input&quot; , &quot;'&quot; , &quot;);
						state_input.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
						var states = json_data.states;
						for ( var index in states) {
						if (json_data.stateAbbr == states[index].stateAbbr) {
							var option = new Option(states[index].stateName, states[index].stateAbbr);
							option.selected = true;
							state_select.options.add(option);
						} else {
							state_select.options.add(new Option(states[index].stateName, states[index].stateAbbr));
						}
					}
				} else {//show no match

				}
			}
		} catch (e) {
			//alert(e.name + &quot;: &quot; + e.message);
		}
	}

	function validateRTN(obj) {
		var routingName = document.getElementById(&quot; , &quot;'&quot; , &quot;routingName&quot; , &quot;'&quot; , &quot;);
		routingName.innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;	
		
		if (obj.value == null || obj.value == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) {
			return;
		}
		document.getElementById(&quot; , &quot;'&quot; , &quot;billing-routingNumber-input-err-from-formbean&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
		var err = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-routingNumber-input-err&quot; , &quot;'&quot; , &quot;);
		err.innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
		
		var json_data = ajaxrequest(&quot; , &quot;'&quot; , &quot;/vrelay/validateRTN.do&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;post&quot; , &quot;'&quot; , &quot;, false, &quot;routingNumber=&quot;+obj.value);
		if (json_data != null) {
			if (json_data.routingName != null &amp;&amp; json_data.routingName != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) {
				routingName.innerHTML = json_data.routingName;
			}else{
				err.innerHTML = &quot; , &quot;'&quot; , &quot;{0}Routing number is invalid&quot; , &quot;'&quot; , &quot;.replace(&quot; , &quot;'&quot; , &quot;{0}&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&lt;img src=&quot;/_vrelay/images/halt_sm.gif&quot; width=&quot;16&quot; height=&quot;16&quot; border=&quot;0&quot; alt=&quot;Error&quot; />&quot; , &quot;'&quot; , &quot;);
			}
		}
	}
	function phoneNumberFormat(value){
		var phoneNum = value;  

	    if (!/^[\d|-]*$/.test(phoneNum) || phoneNum.length > 12) {  
	    	document.getElementById(&quot;smsNumber&quot;).value = phoneNum.substring(0, phoneNum.length - 1);  
	    }  

	    var checkPhoneNum = /^[0-9]\d+$/;
	    if (checkPhoneNum.test(phoneNum) &amp;&amp; phoneNum.length == 4) {  
	    	document.getElementById(&quot;smsNumber&quot;).value = phoneNum.substring(0, 3) + &quot;-&quot; +phoneNum.substring(3, phoneNum.length);  
	        return ;  
	    }
	    checkPhoneNum = /^[0-9]{3}-[0-9]\d+$/;
	    if (checkPhoneNum.test(phoneNum) &amp;&amp; phoneNum.length == 8) {  
	    	document.getElementById(&quot;smsNumber&quot;).value = phoneNum.substring(0, 7) + &quot;-&quot; +phoneNum.substring(7, phoneNum.length);  
	        return ;  
	    }
	    correctingPhoneNumber(phoneNum);
	}
	
	function correctingPhoneNumber(phoneNumber) {
		if ((phoneNumber.match(/\d/g) || []).length === 10) {
			var smsNumber = (&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; + phoneNumber).replace(/\D/g, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
			  var match = smsNumber.match(/^(\d{3})(\d{3})(\d{4})$/);
			  if (match) {
				  document.getElementById(&quot;smsNumber&quot;).value = match[1] + &quot; , &quot;'&quot; , &quot;-&quot; , &quot;'&quot; , &quot; + match[2] + &quot; , &quot;'&quot; , &quot;-&quot; , &quot;'&quot; , &quot; + match[3];
			  }
		} else {
		  return;	
		}
	}
	
    function changeDeferredDate(_date){
		var date = new Date(_date);
		var today = new Date();
		
		if(document.getElementById(&quot;emailAddressNORequired&quot;) != null){
			if (today.getTime() &lt; date.getTime()) {
				document.getElementById(&quot;emailAddressRequired&quot;).style.display = &quot;block&quot;;
				document.getElementById(&quot;emailAddressNORequired&quot;).style.display = &quot;none&quot;;
			}else{
				document.getElementById(&quot;emailAddressRequired&quot;).style.display = &quot;none&quot;;
				document.getElementById(&quot;emailAddressNORequired&quot;).style.display = &quot;block&quot;;
			}
		}
		if(document.getElementById(&quot;achSavePaymentMethodCheckbox&quot;) != null &amp;&amp; document.getElementById(&quot;achSavePaymentMethodMessage&quot;) !=null){
			if (today.getTime() &lt; date.getTime()) {
				document.getElementById(&quot;achSavePaymentMethodMessage&quot;).style.display = &quot;block&quot;;
				document.getElementById(&quot;achSavePaymentMethodCheckbox&quot;).style.display = &quot;none&quot;;
			}else{
				document.getElementById(&quot;achSavePaymentMethodMessage&quot;).style.display = &quot;none&quot;;
				document.getElementById(&quot;achSavePaymentMethodCheckbox&quot;).style.display = &quot;block&quot;;
			}
		}
	}
// -->
var tooltipTriggerList = [].slice.call(document.querySelectorAll(&quot; , &quot;'&quot; , &quot;[data-bs-toggle=&quot;tooltip&quot;]&quot; , &quot;'&quot; , &quot;))
var tooltipList = tooltipTriggerList.map(function (tooltipTriggerEl) {
  return new bootstrap.Tooltip(tooltipTriggerEl)
})





	 
		 
	
	 
		 			
			
			
			
			
			
			
			
			
			  
		       
			      
				      
				      	Payment Information
				      	      
			      

			
			   
				      
						
						
			   
				
				      
				      	
							First Name on Check* 
								

							
							
							
						
					   
					   
							
								Last Name on Check* 
									

								
								
								
							
					   
			   	
			
				
				      
				      	
							Routing Transit Number* 
								

							
							
		 						
							
							
							
							
						
					   
					   
						
							Type of Account* 
								

							
					   			
							
								
								
									Checking
								  
								
									Saving 
								
								
							
								
								 
					   
			   		
			   			
				
				      
				      	
							Account Number* 
								

							
							
														
							
								
											
					   
					   
							
								Confirm Account Number* 
									

								
								
															
								
								 					 
							
					   
			   				
			
						
			


				
				      
				      
						Address Line 1* 
							

						
						
																		
										
							
						
									
									 
						 
					   
					   
						
							Address Line 2 
								

							
							

											
										
							 	 						
																			
										
						
					   
			   
		
			
				 
				 	
						Country* 
							

						
						
									
						
										
						United States

										
											
									
						
				
						
					
				
						
					
						ZIP Code* 
						

						
				
						
						
							
						
				

							
							
													
						
				
			   
			  
			
				 
				 
					City* 
						

					
				
						
							
						
				
												
					
				
								
					
						State* 
							

						
								
										
										
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
										--Select One--Armed Forces Americas                   Armed Forces Europe                     Armed Forces Canada                     Armed Forces Africa                     Armed Forces Middle East                Armed Forces Pacific                    Alabama                                 Alaska                                  American Samoa                          Arizona                                 Arkansas                                California                              Colorado                                Connecticut                             Delaware                                District of Columbia                    Federated States of Micronesia          Florida                                 Georgia                                 Guam                                    Hawaii                                  Idaho                                   Illinois                                Indiana                                 Iowa                                    Kansas                                  Kentucky                                Louisiana                               Maine                                   Maryland                                Massachusetts                           Michigan                                Minnesota                               Mississippi                             Missouri                                Montana                                 Nebraska                                Nevada                                  New Hampshire                           New Jersey                              New Mexico                              New York                                North Carolina                          North Dakota                            Northern Mariana Islands                Ohio                                    Oklahoma                                Oregon                                  Palau                                   Pennsylvania                            Puerto Rico                             Rhode Island                            South Carolina                          South Dakota                            Tennessee                               Texas                                   Utah                                    Vermont                                 Virgin Islands                          Virginia                                Washington                              West Virginia                           Wisconsin                               Wyoming                                 Marshall Island                          
										
									
								 
																
					
				
				
	
	
				
					
			
			
		
			
				 
				 	
					
					    
							Email Address* 

							Email Address 
				
						
					
						
						
						
						
					
				
			
					
		
			
					
				      						
						
							  
						
					   
				
				 
              	
				      						
						
							  
						
					   
				
              
			
             
			  
			   
				
				      
				      	
					      	
					      		Bill/Invoice Information
					      	
					      	
				      	      
			    	
					  
				
			
			 
					Amount 
						
					
					
	
					

							
							       $
							       
							 
					 
		 					 
							 
							 
							 
							
				
			 
	        
	
 				
				      
				      	
				      		
							Bill/Invoice Details
						
				           
			     	
				
				      
				      	
				      	 
								

				      		
				      			
				      				
							      	
							      		UDF1* 
							      		
							      		

							      	 
						      		
									
									
										
									
									
									 
				      		     
			    			 
																		
											
													      	
													      		
													      				
																      	
																      		UDF2
																      		
																      		

																      	 
															      		
																		
																			
																		
																		
																		 
													      		     
												    	  
									 
																		
											
													      	
													      		
													      				
																      	
																      		UDF3
																      		
																      		

																      	 
												
																 
																
																	
																	
																				
																
																 
													      	       
												    		
									 				
																		
											
													      	
													      		
													      				
																      	
																      		UDF4
																      		
																      		

																      	 
									 
																	
																		
																	
									  
									 						
													      	     
												    	
													
																		
									
											
									
											
													      	
													      		
													      				
																      	
																      		UDF5
																      		
																      		

																      	 
									 
																	
																		
																	 
									   
									 						
													      	     
												    				
									
											
											
																
									
									
											
													      	
													      		
													      				
																      	
																      		UDF6
																      		
																      		

																      	 
									 
																	
																		
																	 
									   
									  				
													      	      
												    				 
									
											
																		
									
											
											
													      	
													      		
													      				
																      	
																      		UDF7
																      		
																      		

																      	 
																 
																	
																		
																	 
									 		 
									  				
													      	     
												    	
													
											
																		
									
											
													      	
													      		
													      				
																      	
																      		UDF8
																      		
																      		 

																      	 
									 
																	
																		
																	  
									   
									  				
													      		     
												    		 
									
											
																		
																
											
													      	
													      		
													      				
																      	
																      		UDF9
																      		
																      		

																      	 
									 
																
																	
																 
									  
									  				
													      		     
												    		
											
									
									
											
																		
																
									
											
													      	
													      		
													      				
																      	
																      		UDF10
																      		
																      		

																      	 
									 
																	
																		
																	
									  
									  				
													      	     
												    	
									
											
												
															
				      	 
				      	
				      
							  
			   
			 

				
				 
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
					
				 
				
				
				
				 
				 
				
				 
				
				
				
				
				
					
					
								
					
					 
						 
						
						 		
								 
								
								
						
				
				
										
					
						
						
							
						
						
												
						
							
						
						
					
						
							
						
						
				
				
				
			
				
		 
	
	
	
$(&quot; , &quot;'&quot; , &quot;.form_date&quot; , &quot;'&quot; , &quot;).datetimepicker({
    language:  &quot; , &quot;'&quot; , &quot;en&quot; , &quot;'&quot; , &quot;,
    weekStart: 0,
    todayBtn:  1,
	autoclose: 1,
	todayHighlight: 1,
	startView: 2,
	minView: 2,
	forceParse: 0,
	startDate:new Date()
});
$(function() {  
	$(&quot; , &quot;'&quot; , &quot;#udfcontent&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;show.bs.collapse&quot; , &quot;'&quot; , &quot;, function () {
		$(&quot; , &quot;'&quot; , &quot;#udfcontentImg&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;src&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;/vrelay/bootstrap/images/minus.gif&quot; , &quot;'&quot; , &quot;);
	});
	$(&quot; , &quot;'&quot; , &quot;#udfcontent&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;hide.bs.collapse&quot; , &quot;'&quot; , &quot;, function () {
		$(&quot; , &quot;'&quot; , &quot;#udfcontentImg&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;src&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;/vrelay/bootstrap/images/plus.gif&quot; , &quot;'&quot; , &quot;);
	});

});

	 
		  
	
	



	
			
				
				
				
				
				
				
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
					
				 
				
				
				
				
				 
				 
				
				 
				 
				
				
				
				
				
				
				
				
			
	
	

	



//&lt;!--

		
//changeState(document.getElementById(&quot; , &quot;'&quot; , &quot;billing-country-input&quot; , &quot;'&quot; , &quot;));
		
	
	

	
validateRTN(document.getElementById(&quot; , &quot;'&quot; , &quot;routingNumber&quot; , &quot;'&quot; , &quot;));
	



	changeZipCode();



//-->







		


/* $(function () { 
	$(&quot;[data-toggle=&quot; , &quot;'&quot; , &quot;popover&quot; , &quot;'&quot; , &quot;]&quot;).popover({
	    html: true, 
		content: function() {
	          return $(&quot; , &quot;'&quot; , &quot;.popover-content&quot; , &quot;'&quot; , &quot;).html();
	        }
	});
	
	$(&quot;[data-toggle=&quot; , &quot;'&quot; , &quot;popover&quot; , &quot;'&quot; , &quot;]&quot;).on(&quot; , &quot;'&quot; , &quot;shown.bs.popover&quot; , &quot;'&quot; , &quot;, function () {
		var objId = $(this).attr(&quot;id&quot;);	
		var allinfos = $(&quot;[data-toggle=&quot; , &quot;'&quot; , &quot;popover&quot; , &quot;'&quot; , &quot;]&quot;);
		for(var i=0;i&lt;allinfos.length;i++){
			if($(allinfos[i]).attr(&quot;id&quot;) != objId){
				$(allinfos[i]).popover(&quot; , &quot;'&quot; , &quot;hide&quot; , &quot;'&quot; , &quot;);
			}
		}
	})
}); */

$(&quot; , &quot;'&quot; , &quot;input&quot; , &quot;'&quot; , &quot;).on(&quot;keypress&quot;, function(e) {
    /* ENTER PRESSED*/
    if (e.keyCode == 13) {
        /* FOCUS ELEMENT */
        var inputs = $(this).parents(&quot;form&quot;).eq(0).find(&quot;:input&quot;);
        var idx = inputs.index(this);

        if (idx == inputs.length - 1) {
            inputs[0].select()
        } else {
            inputs[idx + 1].focus(); //  handles submit buttons
            inputs[idx + 1].select();
        }
        return false;
    }
});



var popoverTriggerList = [].slice.call(document.querySelectorAll(&quot; , &quot;'&quot; , &quot;[data-bs-toggle=&quot;popover&quot;]&quot; , &quot;'&quot; , &quot;))
var popoverList = popoverTriggerList.map(function (popoverTriggerEl) {
  return new bootstrap.Popover(popoverTriggerEl)
})

console.log(&quot;Popover called in ACHForm.jsp  -------------&quot;);

/html[1]/body[1]&quot;) or . = concat(&quot; Español 
	  



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




✔ DisplayCalculatedFeeRegSCF - Pay By Personal Check
    
    
    

       
    
    
    
    
    
    
    
    
	.vrelay-required {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;font-style: normal;font-weight: bold;font-variant: normal;text-align: left;}.vrelay-header {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 13px;font-style: normal;font-weight: normal;font-variant: normal;text-align: left;}.vrelay-error {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;font-style: normal;font-weight: bold;font-variant: normal;color: #FF0000;text-align: left;}.payor_opt {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 13px;font-style: normal;font-weight: normal;font-variant: normal;text-align: left;}input {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 13px;}select {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;}option {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 13px;}h1 {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 16px;}h2 {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 14px;text-align: left;}.instruction {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;text-align: left;}.shade { background-color: #E3E3E3; }body {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;font-style: normal;list-style-position: outside;list-style-type: square;}td {font-family: Verdana, Arial, Helvetica, sans-serif;font-size: 12px;}.style2 {font-color: #FF0000;font-family: Arial, Helvetica, sans-serif;color: #FF0000;}
	
	
	
	
	
	
	
	
	  
	
	

	.required {
		color: #ff0000;
	}
	
	.modal.show {
		opacity: 1 !important;
	}
	select {
		appearance: auto !important;
		}
		/* Popover */
  .popover {
    border: 2px;
    font-size: 14px;
    font-weight: bold;
  }
	

 //&lt;!--
 		/**
		* Get ajax object
		*/
		function createXHR() {
		    if (typeof XMLHttpRequest != &quot; , &quot;'&quot; , &quot;undefined&quot; , &quot;'&quot; , &quot;) {
		        return new XMLHttpRequest();
		    } else if (typeof ActiveXObject != &quot; , &quot;'&quot; , &quot;undefined&quot; , &quot;'&quot; , &quot;)    {
		        if (typeof arguments.callee.activeXString != &quot; , &quot;'&quot; , &quot;string&quot; , &quot;'&quot; , &quot;) {
		            var version = [&quot;MSXML2.XMLHTTP.6.0&quot;, &quot;MSXML2.XMLHttp.3.0&quot;, &quot;MSXML2.XMLHTTP&quot;, &quot;Microsoft.XMLHTTP&quot;];
		            for (var i = 0, len = version.length; i &lt; len; ++i) {
		                try {
		                    var xhr = new ActiveXObject(versions[i]);
		                    arguments.callee.activeXString = versions[i];
		                    return xhr;
		                }
		                catch (ex){

		                }
		            }
		        }
		        return new ActiveXObject(arguments.callee.activeXString);
		    } else {
		        throw new Error(&quot;No XHR object available.&quot;);
		    }
		}
		
		/**
		 * Send ajax request
		 * url--url
		 * methodtype(post/get)
		 * con (true(asynchronous)|false(synchronous))
		 * parameter
		 */
		function ajaxrequest(url,methodtype,con,parameter){
			var json_data = null;
			var request = createXHR();
			request.open(methodtype,url+&quot;?&quot;+parameter,con);
			//request.setRequestHeader(&quot;Content-Type&quot;,&quot;application/json&quot;);
			request.setRequestHeader(&quot;Content-Type&quot;,&quot;application/x-www-form-urlencoded&quot;);
			request.onreadystatechange=function(){
				//if(request.readyState === 4 &amp;&amp; request.status === 200 ){//HTTP response has fully receiving to call
				if(request.readyState === 4 &amp;&amp; (request.status >= 200 &amp;&amp; request.status &lt; 300 || request.status === 304 || request.status === 1223 || request.status === 0)){
					var type = request.getResponseHeader(&quot;Content-Type&quot;);
					if(type.indexOf(&quot;application/json&quot;) !== -1){
						json_data = JSON.parse(request.responseText);
					}
				}
			};
			request.send(parameter);
			return json_data;
		}
		
		//parameter
		function createParam(){
			var form = document.process;
	
			var form = document.process;
			var param=&quot;billingCountry=&quot; + form.billingCountry.value + &quot;&amp;billingZip=&quot; + form.billingZip.value;
	
			return param;
		}
 
		function popitup3(txt){
			var html = txt;
			newwindow3=window.open(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;name&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;height=250,width=450 screenX=750, screenY=200, left=650, scrollbars = yes&quot; , &quot;'&quot; , &quot;);
			var tmp3 = newwindow3.document;
			tmp3.write(html);
			tmp3.write(&quot; , &quot;'&quot; , &quot;&lt;p align = &quot;center&quot;>&lt;span class = &quot;close&quot;>&lt;a href=&quot;javascript:self.close()&quot;>&quot; , &quot;'&quot; , &quot;+ &quot; , &quot;'&quot; , &quot;close&quot; , &quot;'&quot; , &quot;+&quot; , &quot;'&quot; , &quot;&lt;/a>&lt;/span>&lt;/p>&quot; , &quot;'&quot; , &quot;);
			tmp3.write(&quot; , &quot;'&quot; , &quot;&lt;/body>&lt;/html>&quot; , &quot;'&quot; , &quot;);
			tmp3.close();
		}
		function setNull() {
			document.getElementById(&quot;selectLanguageAction&quot;).value=&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
		}
		function disableButtons() {
			document.process.achSubmit.disabled = true;
			document.process.achSubmit.value = &quot; , &quot;'&quot; , &quot;please wait...&quot; , &quot;'&quot; , &quot;;
			if(document.process.changePaymentMethodButton != null){
				document.process.changePaymentMethodButton.disabled = true;
			}
			if(document.process.paymentPlanHistoryButton != null){
				document.process.paymentPlanHistoryButton.disabled = true;
			}
			if(document.process.existButton != null){
				document.process.existButton.disabled = true;
			}
			
		}
		function changePaymentMethod(){
			document.process.changePaymentMethodButton.disabled = true;
			document.process.changePaymentMethodButton.value = &quot; , &quot;'&quot; , &quot;please wait...&quot; , &quot;'&quot; , &quot;;
			document.process.achSubmit.disabled = true;
			document.changePaymentMethodForm.submit();
		}
		
		var empty_enable = false;
		function changeStateError(value){
			try {
				var stateInput = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-input&quot; , &quot;'&quot; , &quot;);
				var stateSelect = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-select&quot; , &quot;'&quot; , &quot;);
				var lable = document.getElementById(&quot; , &quot;'&quot; , &quot;lable_check_state_fn_mr&quot; , &quot;'&quot; , &quot;);
				var lable_zip = document.getElementById(&quot; , &quot;'&quot; , &quot;lable_check_zip_fn_mr&quot; , &quot;'&quot; , &quot;);
				var cityInput = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-city-input&quot; , &quot;'&quot; , &quot;);
				var zipInput = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input&quot; , &quot;'&quot; , &quot;);
				var check_state_default_fn_mr = &quot; , &quot;'&quot; , &quot;State&quot; , &quot;'&quot; , &quot;;
				var check_zip_default_fn_mr = &quot; , &quot;'&quot; , &quot;ZIP Code&quot; , &quot;'&quot; , &quot;;
				
				var state_select_value = stateSelect.value; 
				
				document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				stateSelect.options.length = 0;
				stateSelect.options.add(new Option(&quot; , &quot;'&quot; , &quot;--Select One--&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;));
				if(empty_enable){
					stateInput.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
					cityInput.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
					zipInput.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;	
					document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err-from-formbean&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				}
				empty_enable = true;
				if(value == null || value == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
					stateInput.name = &quot; , &quot;'&quot; , &quot;billingState_invalid&quot; , &quot;'&quot; , &quot;;
					stateInput.style.display=&quot;none&quot;;
					lable.innerHTML = check_state_default_fn_mr;
					stateInput.alt = check_state_default_fn_mr;
					stateSelect.name = &quot;billingState&quot;;
					stateSelect.style.display=&quot;&quot;;
					lable_zip.innerHTML = check_zip_default_fn_mr;
					zipInput.alt = check_zip_default_fn_mr;
					return;
				}
				
				var json_data = ajaxrequest(&quot; , &quot;'&quot; , &quot;/vrelay/getStates4AJAX.do&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;post&quot; , &quot;'&quot; , &quot;,false,createParam());
				if(json_data != null){
					lable.innerHTML = json_data.country.countryDivisionTypeName;
					stateInput.alt = json_data.country.countryDivisionTypeName;
					stateSelect.alt = json_data.country.countryDivisionTypeName;
					lable_zip.innerHTML = json_data.country.zipTypeName;
					zipInput.alt = json_data.country.zipTypeName;
					var states = json_data.states;
					if(states == null || states == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
						stateSelect.name = &quot;billingState_invalid&quot;
						stateSelect.style.display = &quot;none&quot;;
						stateInput.name = &quot;billingState&quot;;
						stateInput.style.display = &quot;&quot;;
					}else{			
						for(var index in states){
							if(state_select_value == states[index].stateAbbr){							
								var option = new Option(states[index].stateName,states[index].stateAbbr);
								option.selected = true;
								stateSelect.options.add(option);
							}else{
								stateSelect.options.add(new Option(states[index].stateName,states[index].stateAbbr));
							}
						} 	
						stateInput.name = &quot;billingState_invalid&quot;;
						stateInput.style.display=&quot;none&quot;;
						stateSelect.name = &quot;billingState&quot;;
						stateSelect.style.display=&quot;&quot;;
					}
				}
			} catch (e) {
				//alert(e.name + &quot;: &quot; + e.message);
			}
		}
		function changeState(obj){
			try {
				var stateInput = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-input&quot; , &quot;'&quot; , &quot;);
				var stateSelect = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-select&quot; , &quot;'&quot; , &quot;);
				var lable = document.getElementById(&quot; , &quot;'&quot; , &quot;lable_check_state_fn_mr&quot; , &quot;'&quot; , &quot;);
				var lable_zip = document.getElementById(&quot; , &quot;'&quot; , &quot;lable_check_zip_fn_mr&quot; , &quot;'&quot; , &quot;);
				var cityInput = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-city-input&quot; , &quot;'&quot; , &quot;);
				var zipInput = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input&quot; , &quot;'&quot; , &quot;);
				var check_state_default_fn_mr = &quot; , &quot;'&quot; , &quot;State&quot; , &quot;'&quot; , &quot;;
				var check_zip_default_fn_mr = &quot; , &quot;'&quot; , &quot;ZIP Code&quot; , &quot;'&quot; , &quot;;
				
				var state_select_value = stateSelect.value; 
				
				document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				stateSelect.options.length = 0;
				stateSelect.options.add(new Option(&quot; , &quot;'&quot; , &quot;--Select One--&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;));
				if(empty_enable){
					stateInput.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
					cityInput.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
					zipInput.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;	
					document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err-from-formbean&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				}
				empty_enable = true;
				if(obj.value == null || obj.value == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
					stateInput.name = &quot; , &quot;'&quot; , &quot;billingState_invalid&quot; , &quot;'&quot; , &quot;;
					stateInput.style.display=&quot;none&quot;;
					lable.innerHTML = check_state_default_fn_mr;
					stateInput.alt = check_state_default_fn_mr;
					stateSelect.name = &quot;billingState&quot;;
					stateSelect.style.display=&quot;&quot;;
					lable_zip.innerHTML = check_zip_default_fn_mr;
					zipInput.alt = check_zip_default_fn_mr;
					return;
				}
				
				var json_data = ajaxrequest(&quot; , &quot;'&quot; , &quot;/vrelay/getStates4AJAX.do&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;post&quot; , &quot;'&quot; , &quot;,false,createParam());
				
				if(json_data != null){
					lable.innerHTML = json_data.country.countryDivisionTypeName;
					stateInput.alt = json_data.country.countryDivisionTypeName;
					stateSelect.alt = json_data.country.countryDivisionTypeName;
					lable_zip.innerHTML = json_data.country.zipTypeName;
					zipInput.alt = json_data.country.zipTypeName;
					var states = json_data.states;
					if(states == null || states == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
						stateSelect.name = &quot;billingState_invalid&quot;
						stateSelect.style.display = &quot;none&quot;;
						stateInput.name = &quot;billingState&quot;;
						stateInput.style.display = &quot;&quot;;
					}else{
						for(var index in states){
							if(state_select_value == states[index].stateAbbr){
								var option = new Option(states[index].stateName,states[index].stateAbbr);
								option.selected = true;
								stateSelect.options.add(option);
							}else{
								stateSelect.options.add(new Option(states[index].stateName,states[index].stateAbbr));
							}
						} 	
						stateInput.name = &quot;billingState_invalid&quot;;
						stateInput.style.display=&quot;none&quot;;
						stateSelect.name = &quot;billingState&quot;;
						stateSelect.style.display=&quot;&quot;;
					}
				}
			} catch (e) {
				//alert(e.name + &quot;: &quot; + e.message);
			}
		}
		
		function changeListener4ZipCode(obj){
			try {
				var country_input = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-country-input&quot; , &quot;'&quot; , &quot;);
				if(country_input.value == null || country_input.value == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
					return;
				}
				
				document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err-from-formbean&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				var err = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err&quot; , &quot;'&quot; , &quot;);
				err.innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				//if(country_input.value.toLowerCase() == &quot; , &quot;'&quot; , &quot;US&quot; , &quot;'&quot; , &quot;.toLowerCase()){
					if (obj.value == null || obj.value == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) {//show err
						err.innerHTML = &quot; , &quot;'&quot; , &quot;&lt;img src=&quot;/_vrelay/images/halt_sm.gif&quot; width=&quot;16&quot; height=&quot;16&quot; border=&quot;0&quot; alt=&quot;Error&quot; />&quot; , &quot;'&quot; , &quot; + &quot; , &quot;'&quot; , &quot;{0} is required&quot; , &quot;'&quot; , &quot;.replace(&quot; , &quot;'&quot; , &quot;{0}&quot; , &quot;'&quot; , &quot;, document.getElementById(&quot; , &quot;'&quot; , &quot;lable_check_zip_fn_mr&quot; , &quot;'&quot; , &quot;).innerHTML);
						return;
					}
				//}
				
				var json_data = ajaxrequest(&quot; , &quot;'&quot; , &quot;/vrelay/getInternationalAddressByCountryIdAndZipCode4AJAX.do&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;post&quot; , &quot;'&quot; , &quot;, false, createParam());

				if (json_data != null) {
					var zipCode = json_data.zipCode;
					if (zipCode != null &amp;&amp; zipCode != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) {
						var city_input = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-city-input&quot; , &quot;'&quot; , &quot;);
						city_input.value = json_data.city;
						var state_select = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-select&quot; , &quot;'&quot; , &quot;);
						state_select.options.length = 0;
						state_select.options.add(new Option(&quot; , &quot;'&quot; , &quot;--Select One--&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;));
						var state_input = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-input&quot; , &quot;'&quot; , &quot;);
						state_input.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
						var states = json_data.states;
						for ( var index in states) {
						if (json_data.stateAbbr == states[index].stateAbbr) {
							var option = new Option(states[index].stateName, states[index].stateAbbr);
							option.selected = true;
							state_select.options.add(option);
						} else {
							state_select.options.add(new Option(states[index].stateName, states[index].stateAbbr));
						}
					}
				} else {//show no match

				}
			}
		} catch (e) {
			//alert(e.name + &quot;: &quot; + e.message);
		}
	}
	
	
	function changeZipCode(){
			try {
				var country_input = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-country-input&quot; , &quot;'&quot; , &quot;);
				if(country_input.value == null || country_input.value == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
					return;
				}
				
				document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err-from-formbean&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				var err = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-zip-input-err&quot; , &quot;'&quot; , &quot;);
				err.innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
				var json_data = ajaxrequest(&quot; , &quot;'&quot; , &quot;/vrelay/getInternationalAddressByCountryIdAndZipCode4AJAX.do&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;post&quot; , &quot;'&quot; , &quot;, false, createParam());
				if (json_data != null) {
					var zipCode = json_data.zipCode;
					if (zipCode != null &amp;&amp; zipCode != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) {
						var city_input = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-city-input&quot; , &quot;'&quot; , &quot;);
						city_input.value = json_data.city;
						var state_select = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-select&quot; , &quot;'&quot; , &quot;);
						state_select.options.length = 0;
						state_select.options.add(new Option(&quot; , &quot;'&quot; , &quot;--Select One--&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;));
						var state_input = document.getElementById(&quot; , &quot;'&quot; , &quot;billingState-input&quot; , &quot;'&quot; , &quot;);
						state_input.value = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
						var states = json_data.states;
						for ( var index in states) {
						if (json_data.stateAbbr == states[index].stateAbbr) {
							var option = new Option(states[index].stateName, states[index].stateAbbr);
							option.selected = true;
							state_select.options.add(option);
						} else {
							state_select.options.add(new Option(states[index].stateName, states[index].stateAbbr));
						}
					}
				} else {//show no match

				}
			}
		} catch (e) {
			//alert(e.name + &quot;: &quot; + e.message);
		}
	}

	function validateRTN(obj) {
		var routingName = document.getElementById(&quot; , &quot;'&quot; , &quot;routingName&quot; , &quot;'&quot; , &quot;);
		routingName.innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;	
		
		if (obj.value == null || obj.value == &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) {
			return;
		}
		document.getElementById(&quot; , &quot;'&quot; , &quot;billing-routingNumber-input-err-from-formbean&quot; , &quot;'&quot; , &quot;).innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
		var err = document.getElementById(&quot; , &quot;'&quot; , &quot;billing-routingNumber-input-err&quot; , &quot;'&quot; , &quot;);
		err.innerHTML = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
		
		var json_data = ajaxrequest(&quot; , &quot;'&quot; , &quot;/vrelay/validateRTN.do&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;post&quot; , &quot;'&quot; , &quot;, false, &quot;routingNumber=&quot;+obj.value);
		if (json_data != null) {
			if (json_data.routingName != null &amp;&amp; json_data.routingName != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) {
				routingName.innerHTML = json_data.routingName;
			}else{
				err.innerHTML = &quot; , &quot;'&quot; , &quot;{0}Routing number is invalid&quot; , &quot;'&quot; , &quot;.replace(&quot; , &quot;'&quot; , &quot;{0}&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;&lt;img src=&quot;/_vrelay/images/halt_sm.gif&quot; width=&quot;16&quot; height=&quot;16&quot; border=&quot;0&quot; alt=&quot;Error&quot; />&quot; , &quot;'&quot; , &quot;);
			}
		}
	}
	function phoneNumberFormat(value){
		var phoneNum = value;  

	    if (!/^[\d|-]*$/.test(phoneNum) || phoneNum.length > 12) {  
	    	document.getElementById(&quot;smsNumber&quot;).value = phoneNum.substring(0, phoneNum.length - 1);  
	    }  

	    var checkPhoneNum = /^[0-9]\d+$/;
	    if (checkPhoneNum.test(phoneNum) &amp;&amp; phoneNum.length == 4) {  
	    	document.getElementById(&quot;smsNumber&quot;).value = phoneNum.substring(0, 3) + &quot;-&quot; +phoneNum.substring(3, phoneNum.length);  
	        return ;  
	    }
	    checkPhoneNum = /^[0-9]{3}-[0-9]\d+$/;
	    if (checkPhoneNum.test(phoneNum) &amp;&amp; phoneNum.length == 8) {  
	    	document.getElementById(&quot;smsNumber&quot;).value = phoneNum.substring(0, 7) + &quot;-&quot; +phoneNum.substring(7, phoneNum.length);  
	        return ;  
	    }
	    correctingPhoneNumber(phoneNum);
	}
	
	function correctingPhoneNumber(phoneNumber) {
		if ((phoneNumber.match(/\d/g) || []).length === 10) {
			var smsNumber = (&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; + phoneNumber).replace(/\D/g, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
			  var match = smsNumber.match(/^(\d{3})(\d{3})(\d{4})$/);
			  if (match) {
				  document.getElementById(&quot;smsNumber&quot;).value = match[1] + &quot; , &quot;'&quot; , &quot;-&quot; , &quot;'&quot; , &quot; + match[2] + &quot; , &quot;'&quot; , &quot;-&quot; , &quot;'&quot; , &quot; + match[3];
			  }
		} else {
		  return;	
		}
	}
	
    function changeDeferredDate(_date){
		var date = new Date(_date);
		var today = new Date();
		
		if(document.getElementById(&quot;emailAddressNORequired&quot;) != null){
			if (today.getTime() &lt; date.getTime()) {
				document.getElementById(&quot;emailAddressRequired&quot;).style.display = &quot;block&quot;;
				document.getElementById(&quot;emailAddressNORequired&quot;).style.display = &quot;none&quot;;
			}else{
				document.getElementById(&quot;emailAddressRequired&quot;).style.display = &quot;none&quot;;
				document.getElementById(&quot;emailAddressNORequired&quot;).style.display = &quot;block&quot;;
			}
		}
		if(document.getElementById(&quot;achSavePaymentMethodCheckbox&quot;) != null &amp;&amp; document.getElementById(&quot;achSavePaymentMethodMessage&quot;) !=null){
			if (today.getTime() &lt; date.getTime()) {
				document.getElementById(&quot;achSavePaymentMethodMessage&quot;).style.display = &quot;block&quot;;
				document.getElementById(&quot;achSavePaymentMethodCheckbox&quot;).style.display = &quot;none&quot;;
			}else{
				document.getElementById(&quot;achSavePaymentMethodMessage&quot;).style.display = &quot;none&quot;;
				document.getElementById(&quot;achSavePaymentMethodCheckbox&quot;).style.display = &quot;block&quot;;
			}
		}
	}
// -->
var tooltipTriggerList = [].slice.call(document.querySelectorAll(&quot; , &quot;'&quot; , &quot;[data-bs-toggle=&quot;tooltip&quot;]&quot; , &quot;'&quot; , &quot;))
var tooltipList = tooltipTriggerList.map(function (tooltipTriggerEl) {
  return new bootstrap.Tooltip(tooltipTriggerEl)
})





	 
		 
	
	 
		 			
			
			
			
			
			
			
			
			
			  
		       
			      
				      
				      	Payment Information
				      	      
			      

			
			   
				      
						
						
			   
				
				      
				      	
							First Name on Check* 
								

							
							
							
						
					   
					   
							
								Last Name on Check* 
									

								
								
								
							
					   
			   	
			
				
				      
				      	
							Routing Transit Number* 
								

							
							
		 						
							
							
							
							
						
					   
					   
						
							Type of Account* 
								

							
					   			
							
								
								
									Checking
								  
								
									Saving 
								
								
							
								
								 
					   
			   		
			   			
				
				      
				      	
							Account Number* 
								

							
							
														
							
								
											
					   
					   
							
								Confirm Account Number* 
									

								
								
															
								
								 					 
							
					   
			   				
			
						
			


				
				      
				      
						Address Line 1* 
							

						
						
																		
										
							
						
									
									 
						 
					   
					   
						
							Address Line 2 
								

							
							

											
										
							 	 						
																			
										
						
					   
			   
		
			
				 
				 	
						Country* 
							

						
						
									
						
										
						United States

										
											
									
						
				
						
					
				
						
					
						ZIP Code* 
						

						
				
						
						
							
						
				

							
							
													
						
				
			   
			  
			
				 
				 
					City* 
						

					
				
						
							
						
				
												
					
				
								
					
						State* 
							

						
								
										
										
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
											
								
										--Select One--Armed Forces Americas                   Armed Forces Europe                     Armed Forces Canada                     Armed Forces Africa                     Armed Forces Middle East                Armed Forces Pacific                    Alabama                                 Alaska                                  American Samoa                          Arizona                                 Arkansas                                California                              Colorado                                Connecticut                             Delaware                                District of Columbia                    Federated States of Micronesia          Florida                                 Georgia                                 Guam                                    Hawaii                                  Idaho                                   Illinois                                Indiana                                 Iowa                                    Kansas                                  Kentucky                                Louisiana                               Maine                                   Maryland                                Massachusetts                           Michigan                                Minnesota                               Mississippi                             Missouri                                Montana                                 Nebraska                                Nevada                                  New Hampshire                           New Jersey                              New Mexico                              New York                                North Carolina                          North Dakota                            Northern Mariana Islands                Ohio                                    Oklahoma                                Oregon                                  Palau                                   Pennsylvania                            Puerto Rico                             Rhode Island                            South Carolina                          South Dakota                            Tennessee                               Texas                                   Utah                                    Vermont                                 Virgin Islands                          Virginia                                Washington                              West Virginia                           Wisconsin                               Wyoming                                 Marshall Island                          
										
									
								 
																
					
				
				
	
	
				
					
			
			
		
			
				 
				 	
					
					    
							Email Address* 

							Email Address 
				
						
					
						
						
						
						
					
				
			
					
		
			
					
				      						
						
							  
						
					   
				
				 
              	
				      						
						
							  
						
					   
				
              
			
             
			  
			   
				
				      
				      	
					      	
					      		Bill/Invoice Information
					      	
					      	
				      	      
			    	
					  
				
			
			 
					Amount 
						
					
					
	
					

							
							       $
							       
							 
					 
		 					 
							 
							 
							 
							
				
			 
	        
	
 				
				      
				      	
				      		
							Bill/Invoice Details
						
				           
			     	
				
				      
				      	
				      	 
								

				      		
				      			
				      				
							      	
							      		UDF1* 
							      		
							      		

							      	 
						      		
									
									
										
									
									
									 
				      		     
			    			 
																		
											
													      	
													      		
													      				
																      	
																      		UDF2
																      		
																      		

																      	 
															      		
																		
																			
																		
																		
																		 
													      		     
												    	  
									 
																		
											
													      	
													      		
													      				
																      	
																      		UDF3
																      		
																      		

																      	 
												
																 
																
																	
																	
																				
																
																 
													      	       
												    		
									 				
																		
											
													      	
													      		
													      				
																      	
																      		UDF4
																      		
																      		

																      	 
									 
																	
																		
																	
									  
									 						
													      	     
												    	
													
																		
									
											
									
											
													      	
													      		
													      				
																      	
																      		UDF5
																      		
																      		

																      	 
									 
																	
																		
																	 
									   
									 						
													      	     
												    				
									
											
											
																
									
									
											
													      	
													      		
													      				
																      	
																      		UDF6
																      		
																      		

																      	 
									 
																	
																		
																	 
									   
									  				
													      	      
												    				 
									
											
																		
									
											
											
													      	
													      		
													      				
																      	
																      		UDF7
																      		
																      		

																      	 
																 
																	
																		
																	 
									 		 
									  				
													      	     
												    	
													
											
																		
									
											
													      	
													      		
													      				
																      	
																      		UDF8
																      		
																      		 

																      	 
									 
																	
																		
																	  
									   
									  				
													      		     
												    		 
									
											
																		
																
											
													      	
													      		
													      				
																      	
																      		UDF9
																      		
																      		

																      	 
									 
																
																	
																 
									  
									  				
													      		     
												    		
											
									
									
											
																		
																
									
											
													      	
													      		
													      				
																      	
																      		UDF10
																      		
																      		

																      	 
									 
																	
																		
																	
									  
									  				
													      	     
												    	
									
											
												
															
				      	 
				      	
				      
							  
			   
			 

				
				 
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
					
				 
				
				
				
				 
				 
				
				 
				
				
				
				
				
					
					
								
					
					 
						 
						
						 		
								 
								
								
						
				
				
										
					
						
						
							
						
						
												
						
							
						
						
					
						
							
						
						
				
				
				
			
				
		 
	
	
	
$(&quot; , &quot;'&quot; , &quot;.form_date&quot; , &quot;'&quot; , &quot;).datetimepicker({
    language:  &quot; , &quot;'&quot; , &quot;en&quot; , &quot;'&quot; , &quot;,
    weekStart: 0,
    todayBtn:  1,
	autoclose: 1,
	todayHighlight: 1,
	startView: 2,
	minView: 2,
	forceParse: 0,
	startDate:new Date()
});
$(function() {  
	$(&quot; , &quot;'&quot; , &quot;#udfcontent&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;show.bs.collapse&quot; , &quot;'&quot; , &quot;, function () {
		$(&quot; , &quot;'&quot; , &quot;#udfcontentImg&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;src&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;/vrelay/bootstrap/images/minus.gif&quot; , &quot;'&quot; , &quot;);
	});
	$(&quot; , &quot;'&quot; , &quot;#udfcontent&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;hide.bs.collapse&quot; , &quot;'&quot; , &quot;, function () {
		$(&quot; , &quot;'&quot; , &quot;#udfcontentImg&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;src&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;/vrelay/bootstrap/images/plus.gif&quot; , &quot;'&quot; , &quot;);
	});

});

	 
		  
	
	



	
			
				
				
				
				
				
				
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
				
				
					
					
				 
				
				
				
				
				 
				 
				
				 
				 
				
				
				
				
				
				
				
				
			
	
	

	



//&lt;!--

		
//changeState(document.getElementById(&quot; , &quot;'&quot; , &quot;billing-country-input&quot; , &quot;'&quot; , &quot;));
		
	
	

	
validateRTN(document.getElementById(&quot; , &quot;'&quot; , &quot;routingNumber&quot; , &quot;'&quot; , &quot;));
	



	changeZipCode();



//-->







		


/* $(function () { 
	$(&quot;[data-toggle=&quot; , &quot;'&quot; , &quot;popover&quot; , &quot;'&quot; , &quot;]&quot;).popover({
	    html: true, 
		content: function() {
	          return $(&quot; , &quot;'&quot; , &quot;.popover-content&quot; , &quot;'&quot; , &quot;).html();
	        }
	});
	
	$(&quot;[data-toggle=&quot; , &quot;'&quot; , &quot;popover&quot; , &quot;'&quot; , &quot;]&quot;).on(&quot; , &quot;'&quot; , &quot;shown.bs.popover&quot; , &quot;'&quot; , &quot;, function () {
		var objId = $(this).attr(&quot;id&quot;);	
		var allinfos = $(&quot;[data-toggle=&quot; , &quot;'&quot; , &quot;popover&quot; , &quot;'&quot; , &quot;]&quot;);
		for(var i=0;i&lt;allinfos.length;i++){
			if($(allinfos[i]).attr(&quot;id&quot;) != objId){
				$(allinfos[i]).popover(&quot; , &quot;'&quot; , &quot;hide&quot; , &quot;'&quot; , &quot;);
			}
		}
	})
}); */

$(&quot; , &quot;'&quot; , &quot;input&quot; , &quot;'&quot; , &quot;).on(&quot;keypress&quot;, function(e) {
    /* ENTER PRESSED*/
    if (e.keyCode == 13) {
        /* FOCUS ELEMENT */
        var inputs = $(this).parents(&quot;form&quot;).eq(0).find(&quot;:input&quot;);
        var idx = inputs.index(this);

        if (idx == inputs.length - 1) {
            inputs[0].select()
        } else {
            inputs[idx + 1].focus(); //  handles submit buttons
            inputs[idx + 1].select();
        }
        return false;
    }
});



var popoverTriggerList = [].slice.call(document.querySelectorAll(&quot; , &quot;'&quot; , &quot;[data-bs-toggle=&quot;popover&quot;]&quot; , &quot;'&quot; , &quot;))
var popoverList = popoverTriggerList.map(function (popoverTriggerEl) {
  return new bootstrap.Popover(popoverTriggerEl)
})

console.log(&quot;Popover called in ACHForm.jsp  -------------&quot;);

/html[1]/body[1]&quot;))]</value>
      <webElementGuid>1e74d7da-85e0-4c13-9182-1d09e93e5bd4</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
