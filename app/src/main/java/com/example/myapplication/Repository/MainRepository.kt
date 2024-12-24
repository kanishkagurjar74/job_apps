package com.example.myapplication.Repository

import com.example.myapplication.Model.JobModel

class MainRepository {
    //data in this class is a sample data, we can use api to change the data

    val location = listOf("LosAngles", "USA", "NewYork, USA")
    val category = listOf("All", "Accountant", "Programmer", "Writer")

    val exampleText:String= "We are searching for a talented and motivated person to join our growing team. " +
            "In this role you will be responsible for this job"

    val items = listOf(
        JobModel(
            title = "UI Designer",
            company = "ChabokSoft",
            picUrl = "logo1",
            time = "Full-Time",
            model = "Remote",
            level = "Internship",
            location = "NewYork, USA",
            salary = "\$38k - \$46k",
            category = "2",
            exampleText,
            exampleText
        ),

        JobModel(
            title = "Accountants",
            company = "KianSoft",
            picUrl = "logo2",
            time = "Part-Time",
            model = "Remote",
            level = "In Person",
            location = "LosAngles, USA",
            salary = "\$26k - \$36k",
            category = "1",
            exampleText,
            exampleText
        ),

        JobModel(
            title = "The author of the news",
            company = "MakanSoft",
            picUrl = "logo3",
            time = "Part-Time",
            model = "Remote",
            level = "Senior level",
            location = "NewYork, USA",
            salary = "\$20k - \$23k",
            category = "3",
            exampleText,
            exampleText
        ),

        JobModel(
            title = "Kotlin Programmer",
            company = "TestSoft",
            picUrl = "logo4",
            time = "Full-Time",
            model = "Remote",
            level = "Internship",
            location = "LosAngles, USA",
            salary = "\$38k - \$40k",
            category = "2",
            exampleText,
            exampleText
        )
    )
}