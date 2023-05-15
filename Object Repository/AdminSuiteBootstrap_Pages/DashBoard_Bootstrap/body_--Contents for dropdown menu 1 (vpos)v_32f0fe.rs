<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_--Contents for dropdown menu 1 (vpos)v_32f0fe</name>
   <tag></tag>
   <elementGuidId>739a5450-b3b1-4e64-8a76-e2ad9dc33846</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>body.dashboard</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>dashboard</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>

&lt;!--
//Contents for dropdown menu 1 (vpos)
var menu1=new Array()

//Contents for dropdown menu 2 (vtps)
var menu2=new Array()


//Contents for dropdown menu 3 (vclerk)
var menu3=new Array()

-->












			







var popFlage = false;
var expiredFlage = false;
var lastTime = 1683926556567;
var index = 0;
var _ordertimer = null;

(function() {
    $.MsgBox = {
        Alert: function(title, msg) {
            GenerateHtml(&quot;alert&quot;, title, msg);
            btnNo();
        },
        Confirm: function(title, msg, callback) {
            GenerateHtml(&quot;confirm&quot;, title, msg);
            btnOk(callback);
            if(title == &quot;Password Expiration Notification&quot;){
            	btnLater();
            }else{
            	btnNo();
            }
        },
        Notify: function(title, msg, callback) {
        	GenerateHtml(&quot;notify&quot;, title, msg);
        	btnLater();
        	btnPrint();
        	btnDownload();
        }

    }
    //Html
    var GenerateHtml = function(type, title, msg) {
        var _html = &quot;&quot;;
        _html += '&lt;div id=&quot;mb_box&quot;>&lt;/div>&lt;div id=&quot;mb_con&quot;>&lt;span id=&quot;mb_tit&quot;>' + title + '&lt;/span>';
        if (type == &quot;alert&quot;) {
        	_html += '&lt;a id=&quot;mb_ico_alert&quot;>x&lt;/a>&lt;div id=&quot;mb_msg_alert&quot;>' + msg + '&lt;/div>&lt;div id=&quot;mb_btnbox&quot;>';
        	_html += '&lt;input id=&quot;mb_btn_no&quot; type=&quot;button&quot; value=&quot;Logout&quot; />';
        }
        if (type == &quot;confirm&quot;) {
        	if(title == &quot;Password Expiration Notification&quot;){
        		_html += '&lt;a id=&quot;mb_ico_later&quot;>x&lt;/a>&lt;div id=&quot;mb_msg&quot;>' + msg + '&lt;/div>&lt;div id=&quot;mb_btnbox&quot;>';
        	 	_html += '&lt;input id=&quot;mb_btn_ok&quot; type=&quot;button&quot; value=&quot;Change Password&quot; />';
	            _html += '&lt;input id=&quot;mb_btn_later&quot; type=&quot;button&quot; value=&quot;Later&quot; />';
        	}else{
        		_html += '&lt;a id=&quot;mb_ico&quot;>x&lt;/a>&lt;div id=&quot;mb_msg&quot;>' + msg + '&lt;/div>&lt;div id=&quot;mb_btnbox&quot;>';
	            _html += '&lt;input id=&quot;mb_btn_ok&quot; type=&quot;button&quot; value=&quot;Continue Working&quot; />';
	            _html += '&lt;input id=&quot;mb_btn_no&quot; type=&quot;button&quot; value=&quot;Logout&quot; />';
            }
        }
        
        if(type == &quot;notify&quot;) {
    		_html += '&lt;a id=&quot;mb_ico_close&quot;>x&lt;/a>&lt;div id=&quot;mb_msg&quot;>' + msg + '&lt;/div>&lt;div id=&quot;mb_btnbox&quot;>';
            _html += '&lt;input id=&quot;mb_btn_print&quot; type=&quot;button&quot; value=&quot;Print&quot; />';
            _html += '&lt;input id=&quot;mb_btn_download&quot; type=&quot;button&quot; value=&quot;Download&quot; />'; 
        }
        
        _html += '&lt;/div>&lt;/div>';
        //add _html into body firstlyï¼Œand then set Css style
        $(&quot;body&quot;).append(_html);
        // Css
        GenerateCss();
    }

    //Css
    var GenerateCss = function() {
        $(&quot;#mb_box&quot;).css({
            width: '100%',
            height: '100%',
            zIndex: '99999',
            position: 'fixed',
            filter: 'Alpha(opacity=60)',
            backgroundColor: 'black',
            top: '0',
            left: '0',
            opacity: '0.6'
        });
        $(&quot;#mb_con&quot;).css({
            zIndex: '999999',
            width: '400px',
            position: 'fixed',
            backgroundColor: 'White',
            borderRadius: '15px'
        });
        $(&quot;#mb_tit&quot;).css({
            display: 'block',
            fontSize: '14px',
            color: '#444',
            padding: '10px 15px',
            backgroundColor: '#FFF',
            borderRadius: '15px 15px 0 0',
            borderBottom: '3px solid #009BFE',
            fontWeight: 'bold'
        });
        $(&quot;#mb_msg&quot;).css({
            padding: '20px',
            lineHeight: '20px',
            borderBottom: '1px dashed #DDD',
            fontSize: '13px',
            backgroundColor: '#0095d9',
            color: '#fff'
        });
        $(&quot;#mb_msg_alert&quot;).css({
            padding: '20px',
            lineHeight: '20px',
            borderBottom: '1px dashed #DDD',
            fontSize: '13px',
            backgroundColor: 'red',
            color: '#fff'
        });
        $(&quot;#mb_ico,#mb_ico_later,#mb_ico_alert,#mb_ico_close&quot;).css({
            display: 'block',
            position: 'absolute',
            right: '10px',
            top: '9px',
            border: '1px solid Gray',
            width: '18px',
            height: '18px',
            textAlign: 'center',
            lineHeight: '16px',
            cursor: 'pointer',
            borderRadius: '12px',
        });
        $(&quot;#mb_btnbox&quot;).css({
            margin: '15px 0 10px 0',
            textAlign: 'center'
        });
        $(&quot;#mb_btn_ok,#mb_btn_no,#mb_btn_later,#mb_btn_print,#mb_btn_download&quot;).css({
            width: '185px',
            height: '30px',
            color: 'black',
            border: 'none'
        });
        $(&quot;#mb_btn_ok,#mb_btn_print&quot;).css({
            backgroundColor: '#168bbb'
        });
        $(&quot;#mb_btn_no,#mb_btn_download&quot;).css({
            backgroundColor: '#DDD',
            marginLeft: '20px'
        });
        $(&quot;#mb_btn_later&quot;).css({
            backgroundColor: '#DDD',
            marginLeft: '20px'
        });
        
        //close button hover style
        $(&quot;#mb_ico,#mb_ico_later,#mb_ico_alert,#mb_ico_close&quot;).hover(function() {
            $(this).css({
                backgroundColor: 'Red',
                color: 'White'
            });
        }, function() {
            $(this).css({
                backgroundColor: '#DDD',
                color: 'black'
            });
        });
        var _widht = document.documentElement.clientWidth; 
        var _height = document.documentElement.clientHeight; 
        var boxWidth = $(&quot;#mb_con&quot;).width();
        var boxHeight = $(&quot;#mb_con&quot;).height();
        //center
        $(&quot;#mb_con&quot;).css({
            top: (_height - boxHeight) / 2 + &quot;px&quot;,
            left: (_widht - boxWidth) / 2 + &quot;px&quot;
        });
    }
 
    var btnOk = function(callback) {
        $(&quot;#mb_btn_ok,#mb_ico&quot;).click(function() {
            $(&quot;#mb_box,#mb_con&quot;).remove();
            if (typeof(callback) == 'function') {
                callback();
            }
        });
    }
   
    var btnNo = function() {
        $(&quot;#mb_btn_no,#mb_ico_alert&quot;).click(function() {
            $(&quot;#mb_box,#mb_con&quot;).remove();
            window.location.href=&quot;/vsecurity/login.jsp&quot;;
            // window.location.href='/vsecurity/servlet/logout.do?referringURL=/admin/ipl';
        });
    }
    
    var btnLater = function(){
     $(&quot;#mb_btn_later,#mb_ico_later,#mb_ico_close&quot;).click(function() {
            $(&quot;#mb_box,#mb_con&quot;).remove();
        });
    }
    var btnPrint = function(){
        $(&quot;#mb_btn_print&quot;).click(function() {
        	printDetail($(&quot;#mb_tit&quot;).html(),$(&quot;#mb_msg&quot;).html());   
           });
       }
    var btnDownload = function(){
        $(&quot;#mb_btn_download&quot;).click(function() {
        	downloadDetail($(&quot;#mb_tit&quot;).html(), $(&quot;#mb_msg&quot;).html());     
           });
       }
})();


function checkPasswordExpire(){
  var passwordExpirationMsg = '';
  
  if(passwordExpirationMsg != null &amp;&amp; passwordExpirationMsg != ''){
        $.MsgBox.Confirm(&quot;Password Expiration Notification&quot;, passwordExpirationMsg, restPassword);
  }            
}
function restPassword(){
		window.location.href='/admin/ipl/password/change.do';
}
checkPasswordExpire();

function checkSession1(){
     $.ajax({    
        type: &quot;post&quot;,
        dataType: &quot;json&quot;,
        url: &quot;/admin/servlet/checkSessionTimeOut.do&quot;,
        data:{&quot;lastAccessTime&quot;:lastTime,&quot;isTagOperation&quot;:&quot;nocheck&quot;},   
        success: function(data){
              if(data != null &amp;&amp; data != '' &amp;&amp; data.message != null &amp;&amp; data.message != '' &amp;&amp; data.message != undefined){
            	  
            	  if(!popFlage){
            		  if(data.message == &quot;Your session has expired.&quot;){
            				$(&quot;#mb_box,#mb_con&quot;).remove();
            				 $.MsgBox.Alert(&quot;Session Inactivity Notification&quot;, data.message);
            				expiredFlage = true;
            			}else{
		            	 	 $.MsgBox.Confirm(&quot;Session Inactivity Notification&quot;, data.message, reset);
		            	  	 popFlage = true;
		            	  	 window.clearInterval(int);
		            	  	 int = null;
		            	  	 _ordertimer = setInterval(function(){leftTimer()}, 1000);
            			}
              		}else{
              			if(!expiredFlage){
	              			if(data.message == &quot;Your session has expired.&quot;){
	              				$(&quot;#mb_box,#mb_con&quot;).remove();
	              				 $.MsgBox.Alert(&quot;Session Inactivity Notification&quot;, data.message);
	              				expiredFlage = true;
	              			}
              			}
              		}
            	  
              }
            },    
         error: function(XMLResponse) {
        // alert(XMLResponse.responseText)
         }    
            });    
              
}  
function reset() {
	 window.clearInterval(_ordertimer);
	 _ordertimer = null;
	 index = 0;
	 $.ajax({    
	        type: &quot;post&quot;,
	        dataType: &quot;json&quot;,
	        url: &quot;/admin/servlet/checkSessionTimeOut.do&quot;,
	        data:{&quot;lastAccessTime&quot;:lastTime,&quot;reset&quot;:&quot;true&quot;,&quot;isTagOperation&quot;:&quot;nocheck&quot;},    
	        success: function(data){
	        	popFlage = false;
	        	lastTime = data.lastAccessTime;
	        	int=self.setInterval(&quot;checkSession1()&quot;,60000);
	            },    
	         error: function(XMLResponse) {
	         //alert(XMLResponse.responseText)
	         }    
	            });  
}
function leftTimer() {
	  //console.log(&quot;leftTimer......&quot;);
	  var leftTime = 240000 - index*1000;
	  var minutes = parseInt(leftTime / 1000 / 60 % 60, 10);
	  var seconds = parseInt(leftTime / 1000 % 60, 10);
	  minutes = checkTime(minutes);
	  seconds = checkTime(seconds);
	  index++;
	  if (minutes >= 0 || seconds >= 0) document.getElementById(&quot;mb_msg&quot;).innerHTML = &quot;Your session is set to expire in &quot; + minutes + &quot; minutes, &quot; + seconds + &quot; seconds&quot;;
	  if (minutes &lt;= 0 &amp;&amp; seconds &lt;= 0) {
		  window.clearInterval(_ordertimer);
		  _ordertimer = null;
		  $(&quot;#mb_box,#mb_con&quot;).remove();
		  $.MsgBox.Alert(&quot;Session Inactivity Notification&quot;, &quot;Your session has expired.&quot;);
			expiredFlage = true;
	  }
}
function checkTime(i) {
	  if (i &lt; 10) {
	  i = &quot;0&quot; + i;
	  }
	  return i;
}



		
			

			
			
			 
			 
		            
                		ACB
                	
                		AFC Imt
                	
                		Ahmed Test Customer
                	
                		Anushka
                	
                		Artifacts
                	
                		BCCI
                	
                		ClearTrust Test Customer
                	
                		CSRTest
                	
                		CustomerSAML1
                	
                		CustomerSAML2
                	
                		CustomerVericle
                	
                		Data Migration Cust
                	
                		deep
                	
                		FirstViewCustomer
                	
                		Govolution
                	
                		ICC
                	
                		imtiaz
                	
                		IPL
                	
                		khancustomer
                	
                		MultiApp Customer
                	
                		NFC Imt
                	
                		NFL Imt
                	
                		NonResidentialFEElectricService 
                	
                		QA Tendulkar Club
                	
                		QA Test Customer3
                	
                		QA Test Customer4
                	
                		Residential FE Electric Service*
                	
                		Service work FE Non residential
                	
                		Service work FE Residential*
                	
                		shah
                	
                		Shahbeta
                	
                		SrifirstEnergy
                	
                		State of MD RAD
                	
                		Test Bug 2313
                	
                		Test Combinations
                	
                		Test Customer
                	
                		Test VBillsEnrolled
                	
                		testincontact
                	
                		TestVgateway Cust
                	
                		Vericle
                	
		        IPL
		
         	
         	
     
        #customer-select-form {
			position: relative;
			margin: 0;
			padding: 0;
			position: absolute;
			right: 163px;
			bottom: 20px;
		}
		
		#customer-select-form input {
			padding: 0 0 0 4px !important;
		}
		
		.select2-container--default .select2-results__option--highlighted[aria-selected] {
			background-color: #6C9BC5;
			color: white;
		}
		
		li.select2-results__option {
			background-position-y: 1em;
		}
     
     
        $(document).ready(function() {
			$('#customer-select').select2({
			    placeholder: 'Enter Search here.'
			}).on(&quot;change&quot;, function(e) {
				window.location.href = $(this).val();
			}).on(&quot;select2:open&quot;, function(e) {
				$('.select2-results__options').css('text-align', 'left').css('margin-left', '6px');
			});
		});
      

			
				My Account
				Logout
			
		
	
	Imtiaz Ahmed [iahmed]
	
	
	
		
	
		Dashboard
		
	
	
				
			
		
			User Management
			
	
	
		
	
		
	
	
	
	
	
		
	
	
	
			
	
			
	
	 
	 











v+AdministratorAdd/modify/delete users • Add/modify/delete roles • Grant/revoke permissions • Manage AVS/CVV policiesAccess User Management









	


					


					




					

					

  


  







 

	Velocity Payment System Version 2023-1 - Copyright © 2023 Govolution, LLC.

 









	






	function downloadDetail(title, content, id) {
		var t = title+'.pdf';
		var doc = new jsPDF();
		var specialElementHandlers = {
				id: function (element, renderer) {
			        return true;
			    }
		};
		 doc.fromHTML('&lt;div id=&quot;content&quot;>&lt;h3>'+title+'&lt;/h3>&lt;p>'+content+'&lt;/p>&lt;/div>', 15, 15, {
	        'width': 170,
	            'elementHandlers': specialElementHandlers
	    });
	    doc.save(t);
	    doc.close();
	}

/* 	function printDetail(title, content) {
		var mywindow = window.open();
		mywindow.document.write('&lt;html>');
		mywindow.document.write('&lt;body>&lt;h5 class=&quot;modal-title&quot;>'+title+'&lt;/h5>&lt;br>&lt;hr>');
		mywindow.document.write('&lt;div class=&quot;modal-body&quot;>'+content+'&lt;/div>');
		mywindow.document.write('&lt;/body>&lt;/html>');
		mywindow.document.close(); // necessary for IE >= 10
	    mywindow.focus(); // necessary for IE >= 10*/
	   /* mywindow.print();
	    mywindow.close();
	    return true;
	} */
 	function printDetail(title, content) {
		var detail = '&lt;div id=&quot;outputContent&quot;>&lt;h5 class=&quot;modal-title&quot;>'+title+'&lt;/h5>&lt;br>&lt;hr>&lt;div class=&quot;modal-body&quot;>'+content+'&lt;/div>';
		$(document.body).append(detail); 
    	$(&quot;div#outputContent&quot;).printArea();
	}
	function viewDetail(id){
		console.log(&quot;notification id: &quot; + id);
		$.ajax({
        	url: 'https://'+document.domain+'/admin/servlet/notificationContent.do',
        	type: &quot;GET&quot;,
        	data:  {
        		notificationId: id
        	},
        	success: function(data){

        		console.log(&quot;Show notification message. &quot; + data.NOTIFICATION_TITLE);
        		$.MsgBox.Notify(data.NOTIFICATION_TITLE, data.NOTIFICATION_CONTENT, reset);

        	},
        	error: function(e) {
        		console.log(&quot;error&quot;+e);
        	} 	        
        });
		
	}


/html[1]/body[@class=&quot;dashboard&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[@class=&quot;dashboard&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;

&lt;!--
//Contents for dropdown menu 1 (vpos)
var menu1=new Array()

//Contents for dropdown menu 2 (vtps)
var menu2=new Array()


//Contents for dropdown menu 3 (vclerk)
var menu3=new Array()

-->












			







var popFlage = false;
var expiredFlage = false;
var lastTime = 1683926556567;
var index = 0;
var _ordertimer = null;

(function() {
    $.MsgBox = {
        Alert: function(title, msg) {
            GenerateHtml(&quot;alert&quot;, title, msg);
            btnNo();
        },
        Confirm: function(title, msg, callback) {
            GenerateHtml(&quot;confirm&quot;, title, msg);
            btnOk(callback);
            if(title == &quot;Password Expiration Notification&quot;){
            	btnLater();
            }else{
            	btnNo();
            }
        },
        Notify: function(title, msg, callback) {
        	GenerateHtml(&quot;notify&quot;, title, msg);
        	btnLater();
        	btnPrint();
        	btnDownload();
        }

    }
    //Html
    var GenerateHtml = function(type, title, msg) {
        var _html = &quot;&quot;;
        _html += &quot; , &quot;'&quot; , &quot;&lt;div id=&quot;mb_box&quot;>&lt;/div>&lt;div id=&quot;mb_con&quot;>&lt;span id=&quot;mb_tit&quot;>&quot; , &quot;'&quot; , &quot; + title + &quot; , &quot;'&quot; , &quot;&lt;/span>&quot; , &quot;'&quot; , &quot;;
        if (type == &quot;alert&quot;) {
        	_html += &quot; , &quot;'&quot; , &quot;&lt;a id=&quot;mb_ico_alert&quot;>x&lt;/a>&lt;div id=&quot;mb_msg_alert&quot;>&quot; , &quot;'&quot; , &quot; + msg + &quot; , &quot;'&quot; , &quot;&lt;/div>&lt;div id=&quot;mb_btnbox&quot;>&quot; , &quot;'&quot; , &quot;;
        	_html += &quot; , &quot;'&quot; , &quot;&lt;input id=&quot;mb_btn_no&quot; type=&quot;button&quot; value=&quot;Logout&quot; />&quot; , &quot;'&quot; , &quot;;
        }
        if (type == &quot;confirm&quot;) {
        	if(title == &quot;Password Expiration Notification&quot;){
        		_html += &quot; , &quot;'&quot; , &quot;&lt;a id=&quot;mb_ico_later&quot;>x&lt;/a>&lt;div id=&quot;mb_msg&quot;>&quot; , &quot;'&quot; , &quot; + msg + &quot; , &quot;'&quot; , &quot;&lt;/div>&lt;div id=&quot;mb_btnbox&quot;>&quot; , &quot;'&quot; , &quot;;
        	 	_html += &quot; , &quot;'&quot; , &quot;&lt;input id=&quot;mb_btn_ok&quot; type=&quot;button&quot; value=&quot;Change Password&quot; />&quot; , &quot;'&quot; , &quot;;
	            _html += &quot; , &quot;'&quot; , &quot;&lt;input id=&quot;mb_btn_later&quot; type=&quot;button&quot; value=&quot;Later&quot; />&quot; , &quot;'&quot; , &quot;;
        	}else{
        		_html += &quot; , &quot;'&quot; , &quot;&lt;a id=&quot;mb_ico&quot;>x&lt;/a>&lt;div id=&quot;mb_msg&quot;>&quot; , &quot;'&quot; , &quot; + msg + &quot; , &quot;'&quot; , &quot;&lt;/div>&lt;div id=&quot;mb_btnbox&quot;>&quot; , &quot;'&quot; , &quot;;
	            _html += &quot; , &quot;'&quot; , &quot;&lt;input id=&quot;mb_btn_ok&quot; type=&quot;button&quot; value=&quot;Continue Working&quot; />&quot; , &quot;'&quot; , &quot;;
	            _html += &quot; , &quot;'&quot; , &quot;&lt;input id=&quot;mb_btn_no&quot; type=&quot;button&quot; value=&quot;Logout&quot; />&quot; , &quot;'&quot; , &quot;;
            }
        }
        
        if(type == &quot;notify&quot;) {
    		_html += &quot; , &quot;'&quot; , &quot;&lt;a id=&quot;mb_ico_close&quot;>x&lt;/a>&lt;div id=&quot;mb_msg&quot;>&quot; , &quot;'&quot; , &quot; + msg + &quot; , &quot;'&quot; , &quot;&lt;/div>&lt;div id=&quot;mb_btnbox&quot;>&quot; , &quot;'&quot; , &quot;;
            _html += &quot; , &quot;'&quot; , &quot;&lt;input id=&quot;mb_btn_print&quot; type=&quot;button&quot; value=&quot;Print&quot; />&quot; , &quot;'&quot; , &quot;;
            _html += &quot; , &quot;'&quot; , &quot;&lt;input id=&quot;mb_btn_download&quot; type=&quot;button&quot; value=&quot;Download&quot; />&quot; , &quot;'&quot; , &quot;; 
        }
        
        _html += &quot; , &quot;'&quot; , &quot;&lt;/div>&lt;/div>&quot; , &quot;'&quot; , &quot;;
        //add _html into body firstlyï¼Œand then set Css style
        $(&quot;body&quot;).append(_html);
        // Css
        GenerateCss();
    }

    //Css
    var GenerateCss = function() {
        $(&quot;#mb_box&quot;).css({
            width: &quot; , &quot;'&quot; , &quot;100%&quot; , &quot;'&quot; , &quot;,
            height: &quot; , &quot;'&quot; , &quot;100%&quot; , &quot;'&quot; , &quot;,
            zIndex: &quot; , &quot;'&quot; , &quot;99999&quot; , &quot;'&quot; , &quot;,
            position: &quot; , &quot;'&quot; , &quot;fixed&quot; , &quot;'&quot; , &quot;,
            filter: &quot; , &quot;'&quot; , &quot;Alpha(opacity=60)&quot; , &quot;'&quot; , &quot;,
            backgroundColor: &quot; , &quot;'&quot; , &quot;black&quot; , &quot;'&quot; , &quot;,
            top: &quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;,
            left: &quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;,
            opacity: &quot; , &quot;'&quot; , &quot;0.6&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_con&quot;).css({
            zIndex: &quot; , &quot;'&quot; , &quot;999999&quot; , &quot;'&quot; , &quot;,
            width: &quot; , &quot;'&quot; , &quot;400px&quot; , &quot;'&quot; , &quot;,
            position: &quot; , &quot;'&quot; , &quot;fixed&quot; , &quot;'&quot; , &quot;,
            backgroundColor: &quot; , &quot;'&quot; , &quot;White&quot; , &quot;'&quot; , &quot;,
            borderRadius: &quot; , &quot;'&quot; , &quot;15px&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_tit&quot;).css({
            display: &quot; , &quot;'&quot; , &quot;block&quot; , &quot;'&quot; , &quot;,
            fontSize: &quot; , &quot;'&quot; , &quot;14px&quot; , &quot;'&quot; , &quot;,
            color: &quot; , &quot;'&quot; , &quot;#444&quot; , &quot;'&quot; , &quot;,
            padding: &quot; , &quot;'&quot; , &quot;10px 15px&quot; , &quot;'&quot; , &quot;,
            backgroundColor: &quot; , &quot;'&quot; , &quot;#FFF&quot; , &quot;'&quot; , &quot;,
            borderRadius: &quot; , &quot;'&quot; , &quot;15px 15px 0 0&quot; , &quot;'&quot; , &quot;,
            borderBottom: &quot; , &quot;'&quot; , &quot;3px solid #009BFE&quot; , &quot;'&quot; , &quot;,
            fontWeight: &quot; , &quot;'&quot; , &quot;bold&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_msg&quot;).css({
            padding: &quot; , &quot;'&quot; , &quot;20px&quot; , &quot;'&quot; , &quot;,
            lineHeight: &quot; , &quot;'&quot; , &quot;20px&quot; , &quot;'&quot; , &quot;,
            borderBottom: &quot; , &quot;'&quot; , &quot;1px dashed #DDD&quot; , &quot;'&quot; , &quot;,
            fontSize: &quot; , &quot;'&quot; , &quot;13px&quot; , &quot;'&quot; , &quot;,
            backgroundColor: &quot; , &quot;'&quot; , &quot;#0095d9&quot; , &quot;'&quot; , &quot;,
            color: &quot; , &quot;'&quot; , &quot;#fff&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_msg_alert&quot;).css({
            padding: &quot; , &quot;'&quot; , &quot;20px&quot; , &quot;'&quot; , &quot;,
            lineHeight: &quot; , &quot;'&quot; , &quot;20px&quot; , &quot;'&quot; , &quot;,
            borderBottom: &quot; , &quot;'&quot; , &quot;1px dashed #DDD&quot; , &quot;'&quot; , &quot;,
            fontSize: &quot; , &quot;'&quot; , &quot;13px&quot; , &quot;'&quot; , &quot;,
            backgroundColor: &quot; , &quot;'&quot; , &quot;red&quot; , &quot;'&quot; , &quot;,
            color: &quot; , &quot;'&quot; , &quot;#fff&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_ico,#mb_ico_later,#mb_ico_alert,#mb_ico_close&quot;).css({
            display: &quot; , &quot;'&quot; , &quot;block&quot; , &quot;'&quot; , &quot;,
            position: &quot; , &quot;'&quot; , &quot;absolute&quot; , &quot;'&quot; , &quot;,
            right: &quot; , &quot;'&quot; , &quot;10px&quot; , &quot;'&quot; , &quot;,
            top: &quot; , &quot;'&quot; , &quot;9px&quot; , &quot;'&quot; , &quot;,
            border: &quot; , &quot;'&quot; , &quot;1px solid Gray&quot; , &quot;'&quot; , &quot;,
            width: &quot; , &quot;'&quot; , &quot;18px&quot; , &quot;'&quot; , &quot;,
            height: &quot; , &quot;'&quot; , &quot;18px&quot; , &quot;'&quot; , &quot;,
            textAlign: &quot; , &quot;'&quot; , &quot;center&quot; , &quot;'&quot; , &quot;,
            lineHeight: &quot; , &quot;'&quot; , &quot;16px&quot; , &quot;'&quot; , &quot;,
            cursor: &quot; , &quot;'&quot; , &quot;pointer&quot; , &quot;'&quot; , &quot;,
            borderRadius: &quot; , &quot;'&quot; , &quot;12px&quot; , &quot;'&quot; , &quot;,
        });
        $(&quot;#mb_btnbox&quot;).css({
            margin: &quot; , &quot;'&quot; , &quot;15px 0 10px 0&quot; , &quot;'&quot; , &quot;,
            textAlign: &quot; , &quot;'&quot; , &quot;center&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_btn_ok,#mb_btn_no,#mb_btn_later,#mb_btn_print,#mb_btn_download&quot;).css({
            width: &quot; , &quot;'&quot; , &quot;185px&quot; , &quot;'&quot; , &quot;,
            height: &quot; , &quot;'&quot; , &quot;30px&quot; , &quot;'&quot; , &quot;,
            color: &quot; , &quot;'&quot; , &quot;black&quot; , &quot;'&quot; , &quot;,
            border: &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_btn_ok,#mb_btn_print&quot;).css({
            backgroundColor: &quot; , &quot;'&quot; , &quot;#168bbb&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_btn_no,#mb_btn_download&quot;).css({
            backgroundColor: &quot; , &quot;'&quot; , &quot;#DDD&quot; , &quot;'&quot; , &quot;,
            marginLeft: &quot; , &quot;'&quot; , &quot;20px&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_btn_later&quot;).css({
            backgroundColor: &quot; , &quot;'&quot; , &quot;#DDD&quot; , &quot;'&quot; , &quot;,
            marginLeft: &quot; , &quot;'&quot; , &quot;20px&quot; , &quot;'&quot; , &quot;
        });
        
        //close button hover style
        $(&quot;#mb_ico,#mb_ico_later,#mb_ico_alert,#mb_ico_close&quot;).hover(function() {
            $(this).css({
                backgroundColor: &quot; , &quot;'&quot; , &quot;Red&quot; , &quot;'&quot; , &quot;,
                color: &quot; , &quot;'&quot; , &quot;White&quot; , &quot;'&quot; , &quot;
            });
        }, function() {
            $(this).css({
                backgroundColor: &quot; , &quot;'&quot; , &quot;#DDD&quot; , &quot;'&quot; , &quot;,
                color: &quot; , &quot;'&quot; , &quot;black&quot; , &quot;'&quot; , &quot;
            });
        });
        var _widht = document.documentElement.clientWidth; 
        var _height = document.documentElement.clientHeight; 
        var boxWidth = $(&quot;#mb_con&quot;).width();
        var boxHeight = $(&quot;#mb_con&quot;).height();
        //center
        $(&quot;#mb_con&quot;).css({
            top: (_height - boxHeight) / 2 + &quot;px&quot;,
            left: (_widht - boxWidth) / 2 + &quot;px&quot;
        });
    }
 
    var btnOk = function(callback) {
        $(&quot;#mb_btn_ok,#mb_ico&quot;).click(function() {
            $(&quot;#mb_box,#mb_con&quot;).remove();
            if (typeof(callback) == &quot; , &quot;'&quot; , &quot;function&quot; , &quot;'&quot; , &quot;) {
                callback();
            }
        });
    }
   
    var btnNo = function() {
        $(&quot;#mb_btn_no,#mb_ico_alert&quot;).click(function() {
            $(&quot;#mb_box,#mb_con&quot;).remove();
            window.location.href=&quot;/vsecurity/login.jsp&quot;;
            // window.location.href=&quot; , &quot;'&quot; , &quot;/vsecurity/servlet/logout.do?referringURL=/admin/ipl&quot; , &quot;'&quot; , &quot;;
        });
    }
    
    var btnLater = function(){
     $(&quot;#mb_btn_later,#mb_ico_later,#mb_ico_close&quot;).click(function() {
            $(&quot;#mb_box,#mb_con&quot;).remove();
        });
    }
    var btnPrint = function(){
        $(&quot;#mb_btn_print&quot;).click(function() {
        	printDetail($(&quot;#mb_tit&quot;).html(),$(&quot;#mb_msg&quot;).html());   
           });
       }
    var btnDownload = function(){
        $(&quot;#mb_btn_download&quot;).click(function() {
        	downloadDetail($(&quot;#mb_tit&quot;).html(), $(&quot;#mb_msg&quot;).html());     
           });
       }
})();


function checkPasswordExpire(){
  var passwordExpirationMsg = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
  
  if(passwordExpirationMsg != null &amp;&amp; passwordExpirationMsg != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
        $.MsgBox.Confirm(&quot;Password Expiration Notification&quot;, passwordExpirationMsg, restPassword);
  }            
}
function restPassword(){
		window.location.href=&quot; , &quot;'&quot; , &quot;/admin/ipl/password/change.do&quot; , &quot;'&quot; , &quot;;
}
checkPasswordExpire();

function checkSession1(){
     $.ajax({    
        type: &quot;post&quot;,
        dataType: &quot;json&quot;,
        url: &quot;/admin/servlet/checkSessionTimeOut.do&quot;,
        data:{&quot;lastAccessTime&quot;:lastTime,&quot;isTagOperation&quot;:&quot;nocheck&quot;},   
        success: function(data){
              if(data != null &amp;&amp; data != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; &amp;&amp; data.message != null &amp;&amp; data.message != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; &amp;&amp; data.message != undefined){
            	  
            	  if(!popFlage){
            		  if(data.message == &quot;Your session has expired.&quot;){
            				$(&quot;#mb_box,#mb_con&quot;).remove();
            				 $.MsgBox.Alert(&quot;Session Inactivity Notification&quot;, data.message);
            				expiredFlage = true;
            			}else{
		            	 	 $.MsgBox.Confirm(&quot;Session Inactivity Notification&quot;, data.message, reset);
		            	  	 popFlage = true;
		            	  	 window.clearInterval(int);
		            	  	 int = null;
		            	  	 _ordertimer = setInterval(function(){leftTimer()}, 1000);
            			}
              		}else{
              			if(!expiredFlage){
	              			if(data.message == &quot;Your session has expired.&quot;){
	              				$(&quot;#mb_box,#mb_con&quot;).remove();
	              				 $.MsgBox.Alert(&quot;Session Inactivity Notification&quot;, data.message);
	              				expiredFlage = true;
	              			}
              			}
              		}
            	  
              }
            },    
         error: function(XMLResponse) {
        // alert(XMLResponse.responseText)
         }    
            });    
              
}  
function reset() {
	 window.clearInterval(_ordertimer);
	 _ordertimer = null;
	 index = 0;
	 $.ajax({    
	        type: &quot;post&quot;,
	        dataType: &quot;json&quot;,
	        url: &quot;/admin/servlet/checkSessionTimeOut.do&quot;,
	        data:{&quot;lastAccessTime&quot;:lastTime,&quot;reset&quot;:&quot;true&quot;,&quot;isTagOperation&quot;:&quot;nocheck&quot;},    
	        success: function(data){
	        	popFlage = false;
	        	lastTime = data.lastAccessTime;
	        	int=self.setInterval(&quot;checkSession1()&quot;,60000);
	            },    
	         error: function(XMLResponse) {
	         //alert(XMLResponse.responseText)
	         }    
	            });  
}
function leftTimer() {
	  //console.log(&quot;leftTimer......&quot;);
	  var leftTime = 240000 - index*1000;
	  var minutes = parseInt(leftTime / 1000 / 60 % 60, 10);
	  var seconds = parseInt(leftTime / 1000 % 60, 10);
	  minutes = checkTime(minutes);
	  seconds = checkTime(seconds);
	  index++;
	  if (minutes >= 0 || seconds >= 0) document.getElementById(&quot;mb_msg&quot;).innerHTML = &quot;Your session is set to expire in &quot; + minutes + &quot; minutes, &quot; + seconds + &quot; seconds&quot;;
	  if (minutes &lt;= 0 &amp;&amp; seconds &lt;= 0) {
		  window.clearInterval(_ordertimer);
		  _ordertimer = null;
		  $(&quot;#mb_box,#mb_con&quot;).remove();
		  $.MsgBox.Alert(&quot;Session Inactivity Notification&quot;, &quot;Your session has expired.&quot;);
			expiredFlage = true;
	  }
}
function checkTime(i) {
	  if (i &lt; 10) {
	  i = &quot;0&quot; + i;
	  }
	  return i;
}



		
			

			
			
			 
			 
		            
                		ACB
                	
                		AFC Imt
                	
                		Ahmed Test Customer
                	
                		Anushka
                	
                		Artifacts
                	
                		BCCI
                	
                		ClearTrust Test Customer
                	
                		CSRTest
                	
                		CustomerSAML1
                	
                		CustomerSAML2
                	
                		CustomerVericle
                	
                		Data Migration Cust
                	
                		deep
                	
                		FirstViewCustomer
                	
                		Govolution
                	
                		ICC
                	
                		imtiaz
                	
                		IPL
                	
                		khancustomer
                	
                		MultiApp Customer
                	
                		NFC Imt
                	
                		NFL Imt
                	
                		NonResidentialFEElectricService 
                	
                		QA Tendulkar Club
                	
                		QA Test Customer3
                	
                		QA Test Customer4
                	
                		Residential FE Electric Service*
                	
                		Service work FE Non residential
                	
                		Service work FE Residential*
                	
                		shah
                	
                		Shahbeta
                	
                		SrifirstEnergy
                	
                		State of MD RAD
                	
                		Test Bug 2313
                	
                		Test Combinations
                	
                		Test Customer
                	
                		Test VBillsEnrolled
                	
                		testincontact
                	
                		TestVgateway Cust
                	
                		Vericle
                	
		        IPL
		
         	
         	
     
        #customer-select-form {
			position: relative;
			margin: 0;
			padding: 0;
			position: absolute;
			right: 163px;
			bottom: 20px;
		}
		
		#customer-select-form input {
			padding: 0 0 0 4px !important;
		}
		
		.select2-container--default .select2-results__option--highlighted[aria-selected] {
			background-color: #6C9BC5;
			color: white;
		}
		
		li.select2-results__option {
			background-position-y: 1em;
		}
     
     
        $(document).ready(function() {
			$(&quot; , &quot;'&quot; , &quot;#customer-select&quot; , &quot;'&quot; , &quot;).select2({
			    placeholder: &quot; , &quot;'&quot; , &quot;Enter Search here.&quot; , &quot;'&quot; , &quot;
			}).on(&quot;change&quot;, function(e) {
				window.location.href = $(this).val();
			}).on(&quot;select2:open&quot;, function(e) {
				$(&quot; , &quot;'&quot; , &quot;.select2-results__options&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;text-align&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;left&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;margin-left&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;6px&quot; , &quot;'&quot; , &quot;);
			});
		});
      

			
				My Account
				Logout
			
		
	
	Imtiaz Ahmed [iahmed]
	
	
	
		
	
		Dashboard
		
	
	
				
			
		
			User Management
			
	
	
		
	
		
	
	
	
	
	
		
	
	
	
			
	
			
	
	 
	 











v+AdministratorAdd/modify/delete users • Add/modify/delete roles • Grant/revoke permissions • Manage AVS/CVV policiesAccess User Management









	


					


					




					

					

  


  







 

	Velocity Payment System Version 2023-1 - Copyright © 2023 Govolution, LLC.

 









	






	function downloadDetail(title, content, id) {
		var t = title+&quot; , &quot;'&quot; , &quot;.pdf&quot; , &quot;'&quot; , &quot;;
		var doc = new jsPDF();
		var specialElementHandlers = {
				id: function (element, renderer) {
			        return true;
			    }
		};
		 doc.fromHTML(&quot; , &quot;'&quot; , &quot;&lt;div id=&quot;content&quot;>&lt;h3>&quot; , &quot;'&quot; , &quot;+title+&quot; , &quot;'&quot; , &quot;&lt;/h3>&lt;p>&quot; , &quot;'&quot; , &quot;+content+&quot; , &quot;'&quot; , &quot;&lt;/p>&lt;/div>&quot; , &quot;'&quot; , &quot;, 15, 15, {
	        &quot; , &quot;'&quot; , &quot;width&quot; , &quot;'&quot; , &quot;: 170,
	            &quot; , &quot;'&quot; , &quot;elementHandlers&quot; , &quot;'&quot; , &quot;: specialElementHandlers
	    });
	    doc.save(t);
	    doc.close();
	}

/* 	function printDetail(title, content) {
		var mywindow = window.open();
		mywindow.document.write(&quot; , &quot;'&quot; , &quot;&lt;html>&quot; , &quot;'&quot; , &quot;);
		mywindow.document.write(&quot; , &quot;'&quot; , &quot;&lt;body>&lt;h5 class=&quot;modal-title&quot;>&quot; , &quot;'&quot; , &quot;+title+&quot; , &quot;'&quot; , &quot;&lt;/h5>&lt;br>&lt;hr>&quot; , &quot;'&quot; , &quot;);
		mywindow.document.write(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;modal-body&quot;>&quot; , &quot;'&quot; , &quot;+content+&quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
		mywindow.document.write(&quot; , &quot;'&quot; , &quot;&lt;/body>&lt;/html>&quot; , &quot;'&quot; , &quot;);
		mywindow.document.close(); // necessary for IE >= 10
	    mywindow.focus(); // necessary for IE >= 10*/
	   /* mywindow.print();
	    mywindow.close();
	    return true;
	} */
 	function printDetail(title, content) {
		var detail = &quot; , &quot;'&quot; , &quot;&lt;div id=&quot;outputContent&quot;>&lt;h5 class=&quot;modal-title&quot;>&quot; , &quot;'&quot; , &quot;+title+&quot; , &quot;'&quot; , &quot;&lt;/h5>&lt;br>&lt;hr>&lt;div class=&quot;modal-body&quot;>&quot; , &quot;'&quot; , &quot;+content+&quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;;
		$(document.body).append(detail); 
    	$(&quot;div#outputContent&quot;).printArea();
	}
	function viewDetail(id){
		console.log(&quot;notification id: &quot; + id);
		$.ajax({
        	url: &quot; , &quot;'&quot; , &quot;https://&quot; , &quot;'&quot; , &quot;+document.domain+&quot; , &quot;'&quot; , &quot;/admin/servlet/notificationContent.do&quot; , &quot;'&quot; , &quot;,
        	type: &quot;GET&quot;,
        	data:  {
        		notificationId: id
        	},
        	success: function(data){

        		console.log(&quot;Show notification message. &quot; + data.NOTIFICATION_TITLE);
        		$.MsgBox.Notify(data.NOTIFICATION_TITLE, data.NOTIFICATION_CONTENT, reset);

        	},
        	error: function(e) {
        		console.log(&quot;error&quot;+e);
        	} 	        
        });
		
	}


/html[1]/body[@class=&quot;dashboard&quot;]&quot;) or . = concat(&quot;

&lt;!--
//Contents for dropdown menu 1 (vpos)
var menu1=new Array()

//Contents for dropdown menu 2 (vtps)
var menu2=new Array()


//Contents for dropdown menu 3 (vclerk)
var menu3=new Array()

-->












			







var popFlage = false;
var expiredFlage = false;
var lastTime = 1683926556567;
var index = 0;
var _ordertimer = null;

(function() {
    $.MsgBox = {
        Alert: function(title, msg) {
            GenerateHtml(&quot;alert&quot;, title, msg);
            btnNo();
        },
        Confirm: function(title, msg, callback) {
            GenerateHtml(&quot;confirm&quot;, title, msg);
            btnOk(callback);
            if(title == &quot;Password Expiration Notification&quot;){
            	btnLater();
            }else{
            	btnNo();
            }
        },
        Notify: function(title, msg, callback) {
        	GenerateHtml(&quot;notify&quot;, title, msg);
        	btnLater();
        	btnPrint();
        	btnDownload();
        }

    }
    //Html
    var GenerateHtml = function(type, title, msg) {
        var _html = &quot;&quot;;
        _html += &quot; , &quot;'&quot; , &quot;&lt;div id=&quot;mb_box&quot;>&lt;/div>&lt;div id=&quot;mb_con&quot;>&lt;span id=&quot;mb_tit&quot;>&quot; , &quot;'&quot; , &quot; + title + &quot; , &quot;'&quot; , &quot;&lt;/span>&quot; , &quot;'&quot; , &quot;;
        if (type == &quot;alert&quot;) {
        	_html += &quot; , &quot;'&quot; , &quot;&lt;a id=&quot;mb_ico_alert&quot;>x&lt;/a>&lt;div id=&quot;mb_msg_alert&quot;>&quot; , &quot;'&quot; , &quot; + msg + &quot; , &quot;'&quot; , &quot;&lt;/div>&lt;div id=&quot;mb_btnbox&quot;>&quot; , &quot;'&quot; , &quot;;
        	_html += &quot; , &quot;'&quot; , &quot;&lt;input id=&quot;mb_btn_no&quot; type=&quot;button&quot; value=&quot;Logout&quot; />&quot; , &quot;'&quot; , &quot;;
        }
        if (type == &quot;confirm&quot;) {
        	if(title == &quot;Password Expiration Notification&quot;){
        		_html += &quot; , &quot;'&quot; , &quot;&lt;a id=&quot;mb_ico_later&quot;>x&lt;/a>&lt;div id=&quot;mb_msg&quot;>&quot; , &quot;'&quot; , &quot; + msg + &quot; , &quot;'&quot; , &quot;&lt;/div>&lt;div id=&quot;mb_btnbox&quot;>&quot; , &quot;'&quot; , &quot;;
        	 	_html += &quot; , &quot;'&quot; , &quot;&lt;input id=&quot;mb_btn_ok&quot; type=&quot;button&quot; value=&quot;Change Password&quot; />&quot; , &quot;'&quot; , &quot;;
	            _html += &quot; , &quot;'&quot; , &quot;&lt;input id=&quot;mb_btn_later&quot; type=&quot;button&quot; value=&quot;Later&quot; />&quot; , &quot;'&quot; , &quot;;
        	}else{
        		_html += &quot; , &quot;'&quot; , &quot;&lt;a id=&quot;mb_ico&quot;>x&lt;/a>&lt;div id=&quot;mb_msg&quot;>&quot; , &quot;'&quot; , &quot; + msg + &quot; , &quot;'&quot; , &quot;&lt;/div>&lt;div id=&quot;mb_btnbox&quot;>&quot; , &quot;'&quot; , &quot;;
	            _html += &quot; , &quot;'&quot; , &quot;&lt;input id=&quot;mb_btn_ok&quot; type=&quot;button&quot; value=&quot;Continue Working&quot; />&quot; , &quot;'&quot; , &quot;;
	            _html += &quot; , &quot;'&quot; , &quot;&lt;input id=&quot;mb_btn_no&quot; type=&quot;button&quot; value=&quot;Logout&quot; />&quot; , &quot;'&quot; , &quot;;
            }
        }
        
        if(type == &quot;notify&quot;) {
    		_html += &quot; , &quot;'&quot; , &quot;&lt;a id=&quot;mb_ico_close&quot;>x&lt;/a>&lt;div id=&quot;mb_msg&quot;>&quot; , &quot;'&quot; , &quot; + msg + &quot; , &quot;'&quot; , &quot;&lt;/div>&lt;div id=&quot;mb_btnbox&quot;>&quot; , &quot;'&quot; , &quot;;
            _html += &quot; , &quot;'&quot; , &quot;&lt;input id=&quot;mb_btn_print&quot; type=&quot;button&quot; value=&quot;Print&quot; />&quot; , &quot;'&quot; , &quot;;
            _html += &quot; , &quot;'&quot; , &quot;&lt;input id=&quot;mb_btn_download&quot; type=&quot;button&quot; value=&quot;Download&quot; />&quot; , &quot;'&quot; , &quot;; 
        }
        
        _html += &quot; , &quot;'&quot; , &quot;&lt;/div>&lt;/div>&quot; , &quot;'&quot; , &quot;;
        //add _html into body firstlyï¼Œand then set Css style
        $(&quot;body&quot;).append(_html);
        // Css
        GenerateCss();
    }

    //Css
    var GenerateCss = function() {
        $(&quot;#mb_box&quot;).css({
            width: &quot; , &quot;'&quot; , &quot;100%&quot; , &quot;'&quot; , &quot;,
            height: &quot; , &quot;'&quot; , &quot;100%&quot; , &quot;'&quot; , &quot;,
            zIndex: &quot; , &quot;'&quot; , &quot;99999&quot; , &quot;'&quot; , &quot;,
            position: &quot; , &quot;'&quot; , &quot;fixed&quot; , &quot;'&quot; , &quot;,
            filter: &quot; , &quot;'&quot; , &quot;Alpha(opacity=60)&quot; , &quot;'&quot; , &quot;,
            backgroundColor: &quot; , &quot;'&quot; , &quot;black&quot; , &quot;'&quot; , &quot;,
            top: &quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;,
            left: &quot; , &quot;'&quot; , &quot;0&quot; , &quot;'&quot; , &quot;,
            opacity: &quot; , &quot;'&quot; , &quot;0.6&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_con&quot;).css({
            zIndex: &quot; , &quot;'&quot; , &quot;999999&quot; , &quot;'&quot; , &quot;,
            width: &quot; , &quot;'&quot; , &quot;400px&quot; , &quot;'&quot; , &quot;,
            position: &quot; , &quot;'&quot; , &quot;fixed&quot; , &quot;'&quot; , &quot;,
            backgroundColor: &quot; , &quot;'&quot; , &quot;White&quot; , &quot;'&quot; , &quot;,
            borderRadius: &quot; , &quot;'&quot; , &quot;15px&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_tit&quot;).css({
            display: &quot; , &quot;'&quot; , &quot;block&quot; , &quot;'&quot; , &quot;,
            fontSize: &quot; , &quot;'&quot; , &quot;14px&quot; , &quot;'&quot; , &quot;,
            color: &quot; , &quot;'&quot; , &quot;#444&quot; , &quot;'&quot; , &quot;,
            padding: &quot; , &quot;'&quot; , &quot;10px 15px&quot; , &quot;'&quot; , &quot;,
            backgroundColor: &quot; , &quot;'&quot; , &quot;#FFF&quot; , &quot;'&quot; , &quot;,
            borderRadius: &quot; , &quot;'&quot; , &quot;15px 15px 0 0&quot; , &quot;'&quot; , &quot;,
            borderBottom: &quot; , &quot;'&quot; , &quot;3px solid #009BFE&quot; , &quot;'&quot; , &quot;,
            fontWeight: &quot; , &quot;'&quot; , &quot;bold&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_msg&quot;).css({
            padding: &quot; , &quot;'&quot; , &quot;20px&quot; , &quot;'&quot; , &quot;,
            lineHeight: &quot; , &quot;'&quot; , &quot;20px&quot; , &quot;'&quot; , &quot;,
            borderBottom: &quot; , &quot;'&quot; , &quot;1px dashed #DDD&quot; , &quot;'&quot; , &quot;,
            fontSize: &quot; , &quot;'&quot; , &quot;13px&quot; , &quot;'&quot; , &quot;,
            backgroundColor: &quot; , &quot;'&quot; , &quot;#0095d9&quot; , &quot;'&quot; , &quot;,
            color: &quot; , &quot;'&quot; , &quot;#fff&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_msg_alert&quot;).css({
            padding: &quot; , &quot;'&quot; , &quot;20px&quot; , &quot;'&quot; , &quot;,
            lineHeight: &quot; , &quot;'&quot; , &quot;20px&quot; , &quot;'&quot; , &quot;,
            borderBottom: &quot; , &quot;'&quot; , &quot;1px dashed #DDD&quot; , &quot;'&quot; , &quot;,
            fontSize: &quot; , &quot;'&quot; , &quot;13px&quot; , &quot;'&quot; , &quot;,
            backgroundColor: &quot; , &quot;'&quot; , &quot;red&quot; , &quot;'&quot; , &quot;,
            color: &quot; , &quot;'&quot; , &quot;#fff&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_ico,#mb_ico_later,#mb_ico_alert,#mb_ico_close&quot;).css({
            display: &quot; , &quot;'&quot; , &quot;block&quot; , &quot;'&quot; , &quot;,
            position: &quot; , &quot;'&quot; , &quot;absolute&quot; , &quot;'&quot; , &quot;,
            right: &quot; , &quot;'&quot; , &quot;10px&quot; , &quot;'&quot; , &quot;,
            top: &quot; , &quot;'&quot; , &quot;9px&quot; , &quot;'&quot; , &quot;,
            border: &quot; , &quot;'&quot; , &quot;1px solid Gray&quot; , &quot;'&quot; , &quot;,
            width: &quot; , &quot;'&quot; , &quot;18px&quot; , &quot;'&quot; , &quot;,
            height: &quot; , &quot;'&quot; , &quot;18px&quot; , &quot;'&quot; , &quot;,
            textAlign: &quot; , &quot;'&quot; , &quot;center&quot; , &quot;'&quot; , &quot;,
            lineHeight: &quot; , &quot;'&quot; , &quot;16px&quot; , &quot;'&quot; , &quot;,
            cursor: &quot; , &quot;'&quot; , &quot;pointer&quot; , &quot;'&quot; , &quot;,
            borderRadius: &quot; , &quot;'&quot; , &quot;12px&quot; , &quot;'&quot; , &quot;,
        });
        $(&quot;#mb_btnbox&quot;).css({
            margin: &quot; , &quot;'&quot; , &quot;15px 0 10px 0&quot; , &quot;'&quot; , &quot;,
            textAlign: &quot; , &quot;'&quot; , &quot;center&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_btn_ok,#mb_btn_no,#mb_btn_later,#mb_btn_print,#mb_btn_download&quot;).css({
            width: &quot; , &quot;'&quot; , &quot;185px&quot; , &quot;'&quot; , &quot;,
            height: &quot; , &quot;'&quot; , &quot;30px&quot; , &quot;'&quot; , &quot;,
            color: &quot; , &quot;'&quot; , &quot;black&quot; , &quot;'&quot; , &quot;,
            border: &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_btn_ok,#mb_btn_print&quot;).css({
            backgroundColor: &quot; , &quot;'&quot; , &quot;#168bbb&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_btn_no,#mb_btn_download&quot;).css({
            backgroundColor: &quot; , &quot;'&quot; , &quot;#DDD&quot; , &quot;'&quot; , &quot;,
            marginLeft: &quot; , &quot;'&quot; , &quot;20px&quot; , &quot;'&quot; , &quot;
        });
        $(&quot;#mb_btn_later&quot;).css({
            backgroundColor: &quot; , &quot;'&quot; , &quot;#DDD&quot; , &quot;'&quot; , &quot;,
            marginLeft: &quot; , &quot;'&quot; , &quot;20px&quot; , &quot;'&quot; , &quot;
        });
        
        //close button hover style
        $(&quot;#mb_ico,#mb_ico_later,#mb_ico_alert,#mb_ico_close&quot;).hover(function() {
            $(this).css({
                backgroundColor: &quot; , &quot;'&quot; , &quot;Red&quot; , &quot;'&quot; , &quot;,
                color: &quot; , &quot;'&quot; , &quot;White&quot; , &quot;'&quot; , &quot;
            });
        }, function() {
            $(this).css({
                backgroundColor: &quot; , &quot;'&quot; , &quot;#DDD&quot; , &quot;'&quot; , &quot;,
                color: &quot; , &quot;'&quot; , &quot;black&quot; , &quot;'&quot; , &quot;
            });
        });
        var _widht = document.documentElement.clientWidth; 
        var _height = document.documentElement.clientHeight; 
        var boxWidth = $(&quot;#mb_con&quot;).width();
        var boxHeight = $(&quot;#mb_con&quot;).height();
        //center
        $(&quot;#mb_con&quot;).css({
            top: (_height - boxHeight) / 2 + &quot;px&quot;,
            left: (_widht - boxWidth) / 2 + &quot;px&quot;
        });
    }
 
    var btnOk = function(callback) {
        $(&quot;#mb_btn_ok,#mb_ico&quot;).click(function() {
            $(&quot;#mb_box,#mb_con&quot;).remove();
            if (typeof(callback) == &quot; , &quot;'&quot; , &quot;function&quot; , &quot;'&quot; , &quot;) {
                callback();
            }
        });
    }
   
    var btnNo = function() {
        $(&quot;#mb_btn_no,#mb_ico_alert&quot;).click(function() {
            $(&quot;#mb_box,#mb_con&quot;).remove();
            window.location.href=&quot;/vsecurity/login.jsp&quot;;
            // window.location.href=&quot; , &quot;'&quot; , &quot;/vsecurity/servlet/logout.do?referringURL=/admin/ipl&quot; , &quot;'&quot; , &quot;;
        });
    }
    
    var btnLater = function(){
     $(&quot;#mb_btn_later,#mb_ico_later,#mb_ico_close&quot;).click(function() {
            $(&quot;#mb_box,#mb_con&quot;).remove();
        });
    }
    var btnPrint = function(){
        $(&quot;#mb_btn_print&quot;).click(function() {
        	printDetail($(&quot;#mb_tit&quot;).html(),$(&quot;#mb_msg&quot;).html());   
           });
       }
    var btnDownload = function(){
        $(&quot;#mb_btn_download&quot;).click(function() {
        	downloadDetail($(&quot;#mb_tit&quot;).html(), $(&quot;#mb_msg&quot;).html());     
           });
       }
})();


function checkPasswordExpire(){
  var passwordExpirationMsg = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
  
  if(passwordExpirationMsg != null &amp;&amp; passwordExpirationMsg != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;){
        $.MsgBox.Confirm(&quot;Password Expiration Notification&quot;, passwordExpirationMsg, restPassword);
  }            
}
function restPassword(){
		window.location.href=&quot; , &quot;'&quot; , &quot;/admin/ipl/password/change.do&quot; , &quot;'&quot; , &quot;;
}
checkPasswordExpire();

function checkSession1(){
     $.ajax({    
        type: &quot;post&quot;,
        dataType: &quot;json&quot;,
        url: &quot;/admin/servlet/checkSessionTimeOut.do&quot;,
        data:{&quot;lastAccessTime&quot;:lastTime,&quot;isTagOperation&quot;:&quot;nocheck&quot;},   
        success: function(data){
              if(data != null &amp;&amp; data != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; &amp;&amp; data.message != null &amp;&amp; data.message != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; &amp;&amp; data.message != undefined){
            	  
            	  if(!popFlage){
            		  if(data.message == &quot;Your session has expired.&quot;){
            				$(&quot;#mb_box,#mb_con&quot;).remove();
            				 $.MsgBox.Alert(&quot;Session Inactivity Notification&quot;, data.message);
            				expiredFlage = true;
            			}else{
		            	 	 $.MsgBox.Confirm(&quot;Session Inactivity Notification&quot;, data.message, reset);
		            	  	 popFlage = true;
		            	  	 window.clearInterval(int);
		            	  	 int = null;
		            	  	 _ordertimer = setInterval(function(){leftTimer()}, 1000);
            			}
              		}else{
              			if(!expiredFlage){
	              			if(data.message == &quot;Your session has expired.&quot;){
	              				$(&quot;#mb_box,#mb_con&quot;).remove();
	              				 $.MsgBox.Alert(&quot;Session Inactivity Notification&quot;, data.message);
	              				expiredFlage = true;
	              			}
              			}
              		}
            	  
              }
            },    
         error: function(XMLResponse) {
        // alert(XMLResponse.responseText)
         }    
            });    
              
}  
function reset() {
	 window.clearInterval(_ordertimer);
	 _ordertimer = null;
	 index = 0;
	 $.ajax({    
	        type: &quot;post&quot;,
	        dataType: &quot;json&quot;,
	        url: &quot;/admin/servlet/checkSessionTimeOut.do&quot;,
	        data:{&quot;lastAccessTime&quot;:lastTime,&quot;reset&quot;:&quot;true&quot;,&quot;isTagOperation&quot;:&quot;nocheck&quot;},    
	        success: function(data){
	        	popFlage = false;
	        	lastTime = data.lastAccessTime;
	        	int=self.setInterval(&quot;checkSession1()&quot;,60000);
	            },    
	         error: function(XMLResponse) {
	         //alert(XMLResponse.responseText)
	         }    
	            });  
}
function leftTimer() {
	  //console.log(&quot;leftTimer......&quot;);
	  var leftTime = 240000 - index*1000;
	  var minutes = parseInt(leftTime / 1000 / 60 % 60, 10);
	  var seconds = parseInt(leftTime / 1000 % 60, 10);
	  minutes = checkTime(minutes);
	  seconds = checkTime(seconds);
	  index++;
	  if (minutes >= 0 || seconds >= 0) document.getElementById(&quot;mb_msg&quot;).innerHTML = &quot;Your session is set to expire in &quot; + minutes + &quot; minutes, &quot; + seconds + &quot; seconds&quot;;
	  if (minutes &lt;= 0 &amp;&amp; seconds &lt;= 0) {
		  window.clearInterval(_ordertimer);
		  _ordertimer = null;
		  $(&quot;#mb_box,#mb_con&quot;).remove();
		  $.MsgBox.Alert(&quot;Session Inactivity Notification&quot;, &quot;Your session has expired.&quot;);
			expiredFlage = true;
	  }
}
function checkTime(i) {
	  if (i &lt; 10) {
	  i = &quot;0&quot; + i;
	  }
	  return i;
}



		
			

			
			
			 
			 
		            
                		ACB
                	
                		AFC Imt
                	
                		Ahmed Test Customer
                	
                		Anushka
                	
                		Artifacts
                	
                		BCCI
                	
                		ClearTrust Test Customer
                	
                		CSRTest
                	
                		CustomerSAML1
                	
                		CustomerSAML2
                	
                		CustomerVericle
                	
                		Data Migration Cust
                	
                		deep
                	
                		FirstViewCustomer
                	
                		Govolution
                	
                		ICC
                	
                		imtiaz
                	
                		IPL
                	
                		khancustomer
                	
                		MultiApp Customer
                	
                		NFC Imt
                	
                		NFL Imt
                	
                		NonResidentialFEElectricService 
                	
                		QA Tendulkar Club
                	
                		QA Test Customer3
                	
                		QA Test Customer4
                	
                		Residential FE Electric Service*
                	
                		Service work FE Non residential
                	
                		Service work FE Residential*
                	
                		shah
                	
                		Shahbeta
                	
                		SrifirstEnergy
                	
                		State of MD RAD
                	
                		Test Bug 2313
                	
                		Test Combinations
                	
                		Test Customer
                	
                		Test VBillsEnrolled
                	
                		testincontact
                	
                		TestVgateway Cust
                	
                		Vericle
                	
		        IPL
		
         	
         	
     
        #customer-select-form {
			position: relative;
			margin: 0;
			padding: 0;
			position: absolute;
			right: 163px;
			bottom: 20px;
		}
		
		#customer-select-form input {
			padding: 0 0 0 4px !important;
		}
		
		.select2-container--default .select2-results__option--highlighted[aria-selected] {
			background-color: #6C9BC5;
			color: white;
		}
		
		li.select2-results__option {
			background-position-y: 1em;
		}
     
     
        $(document).ready(function() {
			$(&quot; , &quot;'&quot; , &quot;#customer-select&quot; , &quot;'&quot; , &quot;).select2({
			    placeholder: &quot; , &quot;'&quot; , &quot;Enter Search here.&quot; , &quot;'&quot; , &quot;
			}).on(&quot;change&quot;, function(e) {
				window.location.href = $(this).val();
			}).on(&quot;select2:open&quot;, function(e) {
				$(&quot; , &quot;'&quot; , &quot;.select2-results__options&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;text-align&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;left&quot; , &quot;'&quot; , &quot;).css(&quot; , &quot;'&quot; , &quot;margin-left&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;6px&quot; , &quot;'&quot; , &quot;);
			});
		});
      

			
				My Account
				Logout
			
		
	
	Imtiaz Ahmed [iahmed]
	
	
	
		
	
		Dashboard
		
	
	
				
			
		
			User Management
			
	
	
		
	
		
	
	
	
	
	
		
	
	
	
			
	
			
	
	 
	 











v+AdministratorAdd/modify/delete users • Add/modify/delete roles • Grant/revoke permissions • Manage AVS/CVV policiesAccess User Management









	


					


					




					

					

  


  







 

	Velocity Payment System Version 2023-1 - Copyright © 2023 Govolution, LLC.

 









	






	function downloadDetail(title, content, id) {
		var t = title+&quot; , &quot;'&quot; , &quot;.pdf&quot; , &quot;'&quot; , &quot;;
		var doc = new jsPDF();
		var specialElementHandlers = {
				id: function (element, renderer) {
			        return true;
			    }
		};
		 doc.fromHTML(&quot; , &quot;'&quot; , &quot;&lt;div id=&quot;content&quot;>&lt;h3>&quot; , &quot;'&quot; , &quot;+title+&quot; , &quot;'&quot; , &quot;&lt;/h3>&lt;p>&quot; , &quot;'&quot; , &quot;+content+&quot; , &quot;'&quot; , &quot;&lt;/p>&lt;/div>&quot; , &quot;'&quot; , &quot;, 15, 15, {
	        &quot; , &quot;'&quot; , &quot;width&quot; , &quot;'&quot; , &quot;: 170,
	            &quot; , &quot;'&quot; , &quot;elementHandlers&quot; , &quot;'&quot; , &quot;: specialElementHandlers
	    });
	    doc.save(t);
	    doc.close();
	}

/* 	function printDetail(title, content) {
		var mywindow = window.open();
		mywindow.document.write(&quot; , &quot;'&quot; , &quot;&lt;html>&quot; , &quot;'&quot; , &quot;);
		mywindow.document.write(&quot; , &quot;'&quot; , &quot;&lt;body>&lt;h5 class=&quot;modal-title&quot;>&quot; , &quot;'&quot; , &quot;+title+&quot; , &quot;'&quot; , &quot;&lt;/h5>&lt;br>&lt;hr>&quot; , &quot;'&quot; , &quot;);
		mywindow.document.write(&quot; , &quot;'&quot; , &quot;&lt;div class=&quot;modal-body&quot;>&quot; , &quot;'&quot; , &quot;+content+&quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;);
		mywindow.document.write(&quot; , &quot;'&quot; , &quot;&lt;/body>&lt;/html>&quot; , &quot;'&quot; , &quot;);
		mywindow.document.close(); // necessary for IE >= 10
	    mywindow.focus(); // necessary for IE >= 10*/
	   /* mywindow.print();
	    mywindow.close();
	    return true;
	} */
 	function printDetail(title, content) {
		var detail = &quot; , &quot;'&quot; , &quot;&lt;div id=&quot;outputContent&quot;>&lt;h5 class=&quot;modal-title&quot;>&quot; , &quot;'&quot; , &quot;+title+&quot; , &quot;'&quot; , &quot;&lt;/h5>&lt;br>&lt;hr>&lt;div class=&quot;modal-body&quot;>&quot; , &quot;'&quot; , &quot;+content+&quot; , &quot;'&quot; , &quot;&lt;/div>&quot; , &quot;'&quot; , &quot;;
		$(document.body).append(detail); 
    	$(&quot;div#outputContent&quot;).printArea();
	}
	function viewDetail(id){
		console.log(&quot;notification id: &quot; + id);
		$.ajax({
        	url: &quot; , &quot;'&quot; , &quot;https://&quot; , &quot;'&quot; , &quot;+document.domain+&quot; , &quot;'&quot; , &quot;/admin/servlet/notificationContent.do&quot; , &quot;'&quot; , &quot;,
        	type: &quot;GET&quot;,
        	data:  {
        		notificationId: id
        	},
        	success: function(data){

        		console.log(&quot;Show notification message. &quot; + data.NOTIFICATION_TITLE);
        		$.MsgBox.Notify(data.NOTIFICATION_TITLE, data.NOTIFICATION_CONTENT, reset);

        	},
        	error: function(e) {
        		console.log(&quot;error&quot;+e);
        	} 	        
        });
		
	}


/html[1]/body[@class=&quot;dashboard&quot;]&quot;))]</value>
   </webElementXpaths>
</WebElementEntity>
