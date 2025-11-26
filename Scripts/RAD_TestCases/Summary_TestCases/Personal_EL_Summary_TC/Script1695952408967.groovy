import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.configuration.RunConfiguration as RC
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/RADTestData/Summary.xlsx"
String nameSheet = "Personal_EL"
String dataFile = "RADTestData/Summary_Personal_EL"


String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
String orPath_TaxTypeFilingYear = "Object Repository/RAD_Pages/TaxTypeFilingYear_Page"
String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
String orPath_AddressContact = "Object Repository/RAD_Pages/AddressAndContactInfo_Page"
String orPath_Summary = "Object Repository/RAD_Pages/Summary_Page"
String orPath_PaymentConfirmation = "Object Repository/RAD_Pages/PaymentConfirmation_Page"
String orPath_ServiceFeesAccept = "Object Repository/RAD_Pages/ServiceFeeAccept_Page"
String orPath_PaymentEntry = "Object Repository/RAD_Pages/PaymentEntry_Page"

def ExecuteTC, TaxType, PaymentType, FilingYear, PeriodEndingMonth

def executionProfile = RC.getExecutionProfile()


def numOfRows = findTestData(dataFile).getRowNumbers()

	println("Number of Records: " + numOfRows)


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			TaxType = findTestData(dataFile).getValue('TaxType', row)
			PaymentType = findTestData(dataFile).getValue('PaymentType', row)
			
			
			
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					KeywordUtil.logInfo('Payment Type: ' + PaymentType)
					KeywordUtil.logInfo('Tax Type: ' + TaxType)
					
					WebUI.openBrowser('')
					WebUI.maximizeWindow()
					WebUI.navigateToUrl(GlobalVariable.RADurl)
					
					
// Select Payment Type from the Main Index Page
					WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), PaymentType, false)
			
					
// Select Tax Type Tax from the Tax Type dropwown
					WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_TaxType_ExistingLiability'),TaxType,false)
					
					
					

				
						
// Set Name under Taxpayer
						CustomKeywords.'rad.getSetDataRAD.setDataRADNameOnly'()
						
						
// Set Data Address and Contact Information
						CustomKeywords.'rad.getSetDataRAD.setDataRADAddress'()
						
						

						
						
						
// Populate Decedent SSN and Retype Decedent SSN for Estate Tax
						if (TaxType.equalsIgnoreCase("Estate Tax"))
							{
								CustomKeywords.'rad.getSetDataRAD.setDataRADDecedentSSN'()
							}
						else
							{
								CustomKeywords.'rad.getSetDataRAD.setDataRADELSSN'()
							}
						
						
// Set Data Notice Number
						CustomKeywords.'rad.getSetDataRAD.setDataRADNoticeInvoiceThirteen'()
						
						
						
// Populate Amount
						
						WebUI.setText(findTestObject(orPath_Amount + '/input__paymentAmount'),"100.00")
						
						
						WebUI.setText(findTestObject(orPath_AddressContact + '/input_streetAddress2'),"")
			
			
// Select Continue Button
						WebUI.scrollToElement(findTestObject(orPath_Landing + '/button_Continue'), 3)
						WebUI.waitForElementClickable(findTestObject(orPath_Landing + '/button_Continue'),5)
						WebUI.click(findTestObject(orPath_Landing + '/button_Continue'))
			
			
// Verify Summary on Confirmation page
						
						
						WebUI.delay(2)
						
						def isRequiredTextPresent = false
					
						
						
	// Verify static text on RAD  Summary page
							
						
						if(WebUI.verifyTextPresent('Summary', true))
							{
								isRequiredTextPresent = true
							}
						else
							{
								isRequiredTextPresent = false
							}
					
								
						
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('Review the information below and make any necessary corrections by clicking the', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
						
						
						
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('When you are confident that all the information is correct, click the', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
						
						
						
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('Payment Type/Filing Year', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
												
										
											
												
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('Payment Type:', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
							
						
							
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent(PaymentType, true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
							
							
							
						
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('Payer Information', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
										
										
							
										
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('Taxpayer Name:', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
							
							
							
							
												
												
						switch (executionProfile)
						{
							case "QA2Profile":
											if(isRequiredTextPresent)
												{
														if(WebUI.verifyTextPresent('Jimmy Anderson', true))
															{
																isRequiredTextPresent = true
															}
														else
															{
																isRequiredTextPresent = false
															}
												}
							
							
							
									
									if (TaxType.equalsIgnoreCase("Estate Tax"))
										{
											if(isRequiredTextPresent)
												{
														if(WebUI.verifyTextPresent('xxxxx1234', true))
															{
																isRequiredTextPresent = true
															}
														else
															{
																isRequiredTextPresent = false
															}
												}
											
										}
									else
										{
											if(isRequiredTextPresent)
												{
														if(WebUI.verifyTextPresent('XXXXX1234', true))
															{
																isRequiredTextPresent = true
															}
														else
															{
																isRequiredTextPresent = false
															}
												}
											
										}
									
									
							break
							
							
							case "QAProfile":
											if(isRequiredTextPresent)
														{
																if(WebUI.verifyTextPresent('Jimmy Anderson', true))
																	{
																		isRequiredTextPresent = true
																	}
																else
																	{
																		isRequiredTextPresent = false
																	}
														}
									
									
									
											
											if (TaxType.equalsIgnoreCase("Estate Tax"))
												{
													if(isRequiredTextPresent)
														{
																if(WebUI.verifyTextPresent('xxxxx1234', true))
																	{
																		isRequiredTextPresent = true
																	}
																else
																	{
																		isRequiredTextPresent = false
																	}
														}
													
												}
											else
												{
													if(isRequiredTextPresent)
														{
																if(WebUI.verifyTextPresent('XXXXX1234', true))
																	{
																		isRequiredTextPresent = true
																	}
																else
																	{
																		isRequiredTextPresent = false
																	}
														}
													
												}
									
							break
							
							
							case "DemoProfile":
											if(isRequiredTextPresent)
												{
														if(WebUI.verifyTextPresent('Jimmy btes', true))
															{
																isRequiredTextPresent = true
															}
														else
															{
																isRequiredTextPresent = false
															}
												}
							
							
											
											if (TaxType.equalsIgnoreCase("Estate Tax"))
												{
													if(isRequiredTextPresent)
														{
																if(WebUI.verifyTextPresent('xxxxx6724', true))
																	{
																		isRequiredTextPresent = true
																	}
																else
																	{
																		isRequiredTextPresent = false
																	}
														}
													
												}
											else
												{
													if(isRequiredTextPresent)
														{
																if(WebUI.verifyTextPresent('XXXXX6724', true))
																	{
																		isRequiredTextPresent = true
																	}
																else
																	{
																		isRequiredTextPresent = false
																	}
														}
													
												}
									
							break
						}
						
						
						
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('Taxpayer Address:', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
									
									
									
									
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('2508 Mandan Terrace Gambrills Maryland 21054', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
							
							
							
							
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('Email:', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
								
								
									
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('iahmed@govolution.com', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
							
							
						
					
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('Phone:', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
									
									
								
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('(703) 894-5000', false))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
						
						
						
						
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('Tax Information', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
							
							
							
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('Notice Or Invoice Number:', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
							
							
							
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('1234567890123', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
						
						
						
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('Tax Type:', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
						
						
// Verify the Payment Amount
							if(isRequiredTextPresent)
								{
										if(WebUI.verifyTextPresent('Payment Amount:', true))
											{
												isRequiredTextPresent = true
											}
										else
											{
												isRequiredTextPresent = false
											}
								}
							
							
							
								
							if(isRequiredTextPresent)
								{
										if(WebUI.verifyTextPresent('100.00', true))
											{
												isRequiredTextPresent = true
											}
										else
											{
												isRequiredTextPresent = false
											}
								}
						
						
					
								
							if(isRequiredTextPresent)
								{
										if(WebUI.verifyTextNotPresent('Federal EIN:', true))
											{
												isRequiredTextPresent = true
											}
										else
											{
												isRequiredTextPresent = false
											}
								}
									
										
										
							if(isRequiredTextPresent)
								{
										if(WebUI.verifyTextNotPresent('FEIN/SSN:', true))
											{
												isRequiredTextPresent = true
											}
										else
											{
												isRequiredTextPresent = false
											}
								}
								
								
								
						
						
						
						
						if (TaxType.equalsIgnoreCase("Estate Tax"))
							{
								
								if(isRequiredTextPresent)
									{
											if(WebUI.verifyTextPresent('Decedent SSN:', true))
												{
													isRequiredTextPresent = true
												}
											else
												{
													isRequiredTextPresent = false
												}
									}
									
									
									
								if(isRequiredTextPresent)
									{
											if(WebUI.verifyTextPresent('Estate Tax', true))
												{
													isRequiredTextPresent = true
												}
											else
												{
													isRequiredTextPresent = false
												}
									}
								
								
							}
						else
							{
								
								if(isRequiredTextPresent)
									{
											if(WebUI.verifyTextPresent('Social Security Number:', true))
												{
													isRequiredTextPresent = true
												}
											else
												{
													isRequiredTextPresent = false
												}
									}
									
									
									
								if(isRequiredTextPresent)
									{
											if(WebUI.verifyTextPresent('Personal Income Tax', true))
												{
													isRequiredTextPresent = true
												}
											else
												{
													isRequiredTextPresent = false
												}
									}
								
								
							}
							
							
						
// Verify the Proceed to Payment button
							if(isRequiredTextPresent)
								{
										if(WebUI.verifyElementVisible(findTestObject(orPath_Summary + '/button_Proceed to Payment')))
											{
												isRequiredTextPresent = true
											}
										else
											{
												isRequiredTextPresent = false
											}
								}
								
								
								
// Select Proceed to Payment button
			WebUI.click(findTestObject(orPath_Summary + '/button_Proceed to Payment'))
			
						
			if(isRequiredTextPresent)
				{
						//if(WebUI.verifyElementPresent(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input__billingName'), 30))
						if(WebUI.verifyElementPresent(findTestObject('Object Repository/RAD_Pages/SelectPaymentMethod/PayByCreditCard'), 30))
							{
								isRequiredTextPresent = true
							}
						else
							{
								isRequiredTextPresent = false
							}
				}
		
						
				
				
				if (isRequiredTextPresent)
					{
						println "All the static text is present"
						KeywordUtil.markPassed("All the static text is present")
						resText = "Pass"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
	
					}
				else
					{
						println "One or more static text is missing for Tax Type " + TaxType
						KeywordUtil.markFailed("One or more static text is missing for Tax Type " + TaxType)
						resText = "Fail"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
					}
						
						
						
		
					}
				
				
			}
			
						
						
