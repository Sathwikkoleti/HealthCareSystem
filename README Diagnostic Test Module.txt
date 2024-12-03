                                              {1}-------------------@PostMapping("/addTest")---------------------------------{1}

Class End Point: /testController
Method End Point: /addTest

PostMan 
Method : POST
Url:http://localhost:8092/testController/addTest

INPUT: For adding Test Details
Body -> raw -> Json


    {
        "testAvailability": "Available",
        "testName": "Lipid profile",
        "sampleType": "blood",
        "sampleUnits": "10ml blood",
        "relevanceOrgan": "Heart",
        "testPrice": 680,
        "patientPreparation": "Overnight Fasting Required"
    },
    {
        "testAvailability": "Available",
        "testName": "Complete Blood Picture(CBP)",
        "sampleType": "Blood",
        "sampleUnits": "10ml blood",
        "relevanceOrgan": "Heart",
        "testPrice": 390,
        "patientPreparation": "No Specical preparation is required"
    },
    {
        "testAvailability": "Available",
        "testName": "GC-18 Liver Scan(Sulfur Colloid)",
        "sampleType": "Patient Body Scan",
        "sampleUnits": "single Body",
        "relevanceOrgan": "Liver",
        "testPrice": 4400,
        "patientPreparation": "4-5 Drops of Lugol (Iodine solution) solution 3 times for 3 days before the study, and stop specific Antihypertensive, antidepressant & sympathomimetic 
         group of drugs for 48 hrs. The patient should carry the old reports, if available."
    },
    {
        "testAvailability": "Available",
        "testName": "LIVER FUNCTION TEST (LFT-A)",
        "sampleType": "Patient Blood",
        "sampleUnits": "5ml",
        "relevanceOrgan": "Liver",
        "testPrice": 680,
        "patientPreparation": "No special preparation is required"
    },
    {
        "testAvailability": "Available",
        "testName": "ULTRASOUND-PREGNANCY TWIN",
        "sampleType": "Patient Fetuses Scan",
        "sampleUnits": "Single Pregnant Women",
        "relevanceOrgan": "Pregnancy(fetuses)",
        "testPrice": 1800,
        "patientPreparation": "No preparation is required. All old Reports & Aadhar card are mandatory"
    },
    {
        "testAvailability": "Available",
        "testName": "ULTRASOUND-ABDOMEN AND PELVIS",
        "sampleType": "Patient Abdomen/Pelvis Scan",
        "sampleUnits": "Single Body",
        "relevanceOrgan": "Abdomen/Pelvis",
        "testPrice": 1350,
        "patientPreparation": "Its recommended to have minimum 4 hours fasting. The patient should have full bladder"
    }


Result->Body->Pretty               Status Code 200 OK

[
    {
        "testId": 1,
        "testAvailability": "Available",
        "testName": "Lipid profile",
        "sampleType": "blood",
        "sampleUnits": "10ml blood",
        "relevanceOrgan": "Heart",
        "testPrice": 680,
        "patientPreparation": "Overnight Fasting Required"
    },
    {
        "testId": 2,
        "testAvailability": "Available",
        "testName": "Complete Blood Picture(CBP)",
        "sampleType": "Blood",
        "sampleUnits": "10ml blood",
        "relevanceOrgan": "Heart",
        "testPrice": 390,
        "patientPreparation": "No Specical preparation is required"
    },
    {
        "testId": 3,
        "testAvailability": "Available",
        "testName": "GC-18 Liver Scan(Sulfur Colloid)",
        "sampleType": "Patient Body Scan",
        "sampleUnits": "single Body",
        "relevanceOrgan": "Liver",
        "testPrice": 4400,
        "patientPreparation": "4-5 Drops of Lugol (Iodine solution) solution 3 times for 3 days before the study, and stop specific Antihypertensive, antidepressant & sympathomimetic 
         group of drugs for 48 hrs. The patient should carry the old reports, if available."
    },
    {
        "testId": 4,
        "testAvailability": "Available",
        "testName": "LIVER FUNCTION TEST (LFT-A)",
        "sampleType": "Patient Blood",
        "sampleUnits": "5ml",
        "relevanceOrgan": "Liver",
        "testPrice": 680,
        "patientPreparation": "No special preparation is required"
    },
    {
        "testId": 5,
        "testAvailability": "Available",
        "testName": "ULTRASOUND-PREGNANCY TWIN",
        "sampleType": "Patient Fetuses Scan",
        "sampleUnits": "Single Pregnant Women",
        "relevanceOrgan": "Pregnancy(fetuses)",
        "testPrice": 1800,
        "patientPreparation": "No preparation is required. All old Reports & Aadhar card are mandatory"
    },
    {
        "testId": 6,
        "testAvailability": "Available",
        "testName": "ULTRASOUND-ABDOMEN AND PELVIS",
        "sampleType": "Patient Abdomen/Pelvis Scan",
        "sampleUnits": "Single Body",
        "relevanceOrgan": "Abdomen/Pelvis",
        "testPrice": 1350,
        "patientPreparation": "Its recommended to have minimum 4 hours fasting. The patient should have full bladder"
    }
]



                                               {2}-------------------@PutMapping({"/updateTestDetails/{id}"})-----------------


                                                                               ####    Case:1    ####


Class End Point: /testController
Method End Point: /updateTestDetails/1

PostMan 
Method : PUT
Url:http://localhost:8092/testController/updateTestDetails/1

INPUT: For adding Test Details
Body -> raw -> Json


    {
        "testId": 1,
        "testAvailability": "Available",
        "testName": "Lipid profile",
        "sampleType": "blood",
        "sampleUnits": "10ml blood",
        "relevanceOrgan": "Heart",
        "testPrice": 699,
        "patientPreparation": "Overnight Fasting Required"
    }


Result->Body->Pretty                  Status Code - 200 OK

 [{
        "testId": 1,
        "testAvailability": "Available",
        "testName": "Lipid profile",
        "sampleType": "blood",
        "sampleUnits": "10ml blood",
        "relevanceOrgan": "Heart",
        "testPrice": 699,
        "patientPreparation": "Overnight Fasting Required"
    }]


                                                                        ####    Case:2    ####



Class End Point: /testController
Method End Point: /updateTestDetails/10

PostMan 
Method : PUT
Url:http://localhost:8092/testController/updateTestDetails/10

INPUT: For adding Test Details
Body -> raw -> Json


    {
        "testId": 10,
        "testAvailability": "Available",
        "testName": "POST LUNCH GLUCOSE",
        "sampleType": "blood",
        "sampleUnits": "10ml blood",
        "relevanceOrgan": "Heart",
        "testPrice": 100,
        "patientPreparation": "Sample to be given after 2 Hrs. from the start of consumption of lunch"
    }



Result->Body->Pretty                  Status Code - 502 Bad Gateway

custom exception: For Updating Testdetails not found by TestId: 10



                                               {3}-------------------@GetMapping("/viewTest/{id}")----------------------------{3}


                                                                        ####    Case:1    ####


Class End Point: /testController
Method End Point: /viewTest/2

PostMan 
Method : GET
Url:http://localhost:8092/testController/viewTest/2

Result->Body->Pretty                  Status Code - 200 OK

 [{
        "testId": 2,
        "testAvailability": "Available",
        "testName": "Complete Blood Picture(CBP)",
        "sampleType": "Blood",
        "sampleUnits": "10ml blood",
        "relevanceOrgan": "Heart",
        "testPrice": 390,
        "patientPreparation": "No Specical preparation is required"
    }]

                                                                           ####    Case:2    ####

Class End Point: /testController
Method End Point: /viewTest/9

PostMan 
Method : GET
Url:http://localhost:8092/testController/viewTest/9



Result->Body->Pretty                  Status Code - 502 Bad Gateway

custom exception: Test Details not found by TestId: 9





                                                {4}-------------------@GetMapping("/viewAllTestsDetails")----------------------{4}

Class End Point: /testController
Method End Point: viewAllTestsDetails

PostMan 
Method : GET
Url:http://localhost:8092/testController/viewAllTestsDetails

Result->Body->Pretty                  Status Code 200 OK
[
    {
        "testId": 1,
        "testAvailability": "Available",
        "testName": "Lipid profile",
        "sampleType": "blood",
        "sampleUnits": "10ml blood",
        "relevanceOrgan": "Heart",
        "testPrice": 680,
        "patientPreparation": "Overnight Fasting Required"
    },
    {
        "testId": 2,
        "testAvailability": "Available",
        "testName": "Complete Blood Picture(CBP)",
        "sampleType": "Blood",
        "sampleUnits": "10ml blood",
        "relevanceOrgan": "Heart",
        "testPrice": 390,
        "patientPreparation": "No Specical preparation is required"
    },
    {
        "testId": 3,
        "testAvailability": "Available",
        "testName": "GC-18 Liver Scan(Sulfur Colloid)",
        "sampleType": "Patient Body Scan",
        "sampleUnits": "single Body",
        "relevanceOrgan": "Liver",
        "testPrice": 4400,
        "patientPreparation": "4-5 Drops of Lugol (Iodine solution) solution 3 times for 3 days before the study, and stop specific Antihypertensive, antidepressant & sympathomimetic 
         group of drugs for 48 hrs. The patient should carry the old reports, if available."
    },
    {
        "testId": 4,
        "testAvailability": "Available",
        "testName": "LIVER FUNCTION TEST (LFT-A)",
        "sampleType": "Patient Blood",
        "sampleUnits": "5ml",
        "relevanceOrgan": "Liver",
        "testPrice": 680,
        "patientPreparation": "No special preparation is required"
    },
    {
        "testId": 5,
        "testAvailability": "Available",
        "testName": "ULTRASOUND-PREGNANCY TWIN",
        "sampleType": "Patient Fetuses Scan",
        "sampleUnits": "Single Pregnant Women",
        "relevanceOrgan": "Pregnancy(fetuses)",
        "testPrice": 1800,
        "patientPreparation": "No preparation is required. All old Reports & Aadhar card are mandatory"
    },
    {
        "testId": 6,
        "testAvailability": "Available",
        "testName": "ULTRASOUND-ABDOMEN AND PELVIS",
        "sampleType": "Patient Abdomen/Pelvis Scan",
        "sampleUnits": "Single Body",
        "relevanceOrgan": "Abdomen/Pelvis",
        "testPrice": 1350,
        "patientPreparation": "Its recommended to have minimum 4 hours fasting. The patient should have full bladder"
    }
]
