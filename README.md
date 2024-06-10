<u>Name</u>: Monde Asembo Mkhize

<u>Student Number</u>: ST10452222

1.  <u>Purpose</u>:

> The purpose of this weather application is that it should be able to
> manage weekly weather conditions by providing the average temperature
> for the week as well as allow users to view detailed information for
> each day.

2.  <u>App Explanation</u>:

> a\) <u>Intuitive Design</u>: The app has a clear separation between
> the screens and the navigation is facilitated by clearly labelled
> buttons that indicate the ranges of functions offered by the app.
> Overall, the focus on clear structure, user-friendly elements, and
> data validation contributes to an intuitive user experience.
>
> b\) <u>Content Prioritisation</u>: This application prioritises
> content based on user interaction and task completion. The splash
> screen displays the name of the app, the user’s name and student
> number, followed by the main screen where data input takes priority.
> Weekly weather and activity notes are the core content, allowing users
> to easily enter and track their daily temperature. Once data is
> entered, the detailed view screen prioritises presenting the
> information in a structured format, showcasing detailed information
> for each day’s temperature and the maximum and minimum temperatures as
> well as the weather conditions. This prioritisation ensures users can
> first input and track data, and then seamlessly access detailed
> information. A button that ensures users are able to navigate back to
> the main screen is also included.
>
> c\) <u>Legible Text Content</u>: A key component of the app’s design
> is its readable text content, which makes it easy for the user to
> interact with its abundance of information. To prioritise readability
> I have opted for a font size that is comfortably large, ensuring that
> text remains clear and easily distinguishable even on smaller screens.
> This deliberate choice ensures that users of all ages and visual
> abilities can access the content without eye strain or experiencing
> difficulty in comprehension.
>
> d\) <u>Clear Interface Element Visibility</u>: The app has a clean UI
> and great attention has been paid to ensure all the features are
> clearly visible and understandable to the users. Each piece is placed
> deliberately; the consideration is aimed at balancing between
> aesthetics and readability and avoiding overuse of over cluttering.
> The main idea of this is the ability to let users go round the
> application and differentiate each segment of the application without
> fail and interact with it and without fail, enhance user experience
> offering an efficient use of interface.
>
> e\) <u>Hand Position Controls</u>: The app employs hand position
> controls, a feature that ensures that buttons and controls are placed
> in areas that can easily be accessed for better control of the user’s
> involvement. Through this, the application is gentle to navigate as
> well as offers a smooth user experience since buttons are placed
> within the reach of the hand of the user. This conscious effort to
> create an interface makes it easy for the users to engage the various
> features within the app without strain.

3.  <u>Pseudocode</u>:

> // SplashActivity.kt

fun SplashScreen() {

displaySplashContent("Weather App", "Monde Mkhize", "ST10452222")

> //Button to navigate to main screen

buttonStart.setOnClickListener {

navigateToMainScreen()

}

> //Button to navigate to exit app

buttonExit.setOnClickListener {

exitApp()

}

}

// SplashScreen_MainActivity2.kt

val day = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
"Friday", "Saturday", "Sunday")

var min = arrayOf(12, 15, 18, 16, 13, 10, 10)

var max = arrayOf(25, 29, 30, 31, 32, 18, 16)

var weatherCondition = arrayOf( "Sunny", "Sunny", "Sunny", "Sunny",
"Sunny", "Raining", "Cold" )

fun MainScreen() {

for (i in days) {

min\[i\] = getMinInput(i)

max \[i\] = getMaxInput(i)

weatherCondition\[i\] = getWeatherConditionInput(i)

}

// Calculate and display average temperature for the week

> val averageTemperature = calculateAverageTemperature()
>
> displayAverageTemperature(averageTemperature)

buttonViewDetails.setOnClickListener {

navigateToDetailedViewScreen()

}

fun exitApp() {

println("Exiting the app")

}

buttonClearData.setOnClickListener {

clearAllInputs()

}

}

// DetailedViewActivity.kt

fun DetailedViewScreen() {

for (i in days) {

displayDayData(days\[i\], max\[i\], min\[i\], weatherConditions\[i\])

}

val averageScreenTime = calculateAverageScreenTime()

displayAverageScreenTime(averageScreenTime)

buttonBackToMain.setOnClickListener {

navigateToMainScreen()

}

}

4.  <u>User Interface</u>:

> <img src="media/image2.png" style="width:6.26772in;height:3.51389in" />
>
> <img src="media/image3.png" style="width:6.26772in;height:3.51389in" />
>
> <img src="media/image1.png" style="width:6.26772in;height:3.48611in" />

5.  **[<u>https://github.com/ST10452222/ST10452222MondeMkhize.git</u>](https://github.com/ST10452222/ST10452222MondeMkhize.git)**
