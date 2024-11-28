PostMan URL: http://localhost:8092/TestResult/addTestResult

 {
    "testName" : "COVID-19",
    "testResult": "positive",
    "units": "NA"
 }

 ===================================================================================


PostMan URL: http://localhost:8092/TestResult/updateTestResult/1

{
    "testName" : "Blood Test",
    "testResult": "O+ve",
    "units": "NA"
	}

Output:

{
    "id": 1,
    "testName": "Blood Test",
    "testResult": "O+ve",
    "units": "NA"
}

Hai