## PROJECT SPECIFICATION
   4.Musical Structure App

# App Design

Suitability:

The app’s structure is suitable for a music player app. A similarly structured app which focuses on audiobooks, podcasts, or other audio media is also acceptable.

Clarity:

The purpose of each activity is easy for a user to understand through the UI design and feature labeling.

Number of Activities:

The app contains 2 to 6 activities

# Layout

Structure:

The app contains multiple activities, each labelled, which together make a cohesive music app.

Labelling:

Features in the app are clearly defined either by labelling or images. For example, a button to play music could use a universally recognized triangular "Play" symbol or could have the text label "Play".

Buttons:

Each activity contains button(s) which link it to other activities a user should be able to reach from that activity. For instance, a ‘Library’ activity might contain a button to move to the ‘Now Playing’ activity.

Layout Best Practices:

The code adheres to all of the following best practices:

* Text sizes are defined in sp
* Lengths are defined in dp
* Padding and margin is used appropriately, such that the views are not crammed up against each other.

# Functionality

Runtime Errors:

The code runs without errors

OnClickListeners:

Each button’s behavior is determined by an OnClickListener in the Java code rather than by the android:onClick attribute in the XML Layout.

Intents:

Each button properly opens the intended activity using an explicit Intent.

Custom Adapter:

App uses a custom adapter to populate the layout with views based on instances of the custom class.

Data Storage and Retrieval:

Information about instances of the custom class are stored in an appropriate data structure (e.g. ArrayList, Array).

When the information needs to be displayed, it is efficiently retrieved (e.g. Looping).

Custom Class:

Data about each song (or equivalent audio media such as podcast episode) should be stored in a custom class that contains at least 2 states (e.g. Song Name, Artist Name)

If images are included (e.g. Album Art), they are stored as drawables. All drawables are stored at multiple densities. Images are not required.

# Code Quality

Code Formatting:

The code is properly formatted:

* No unnecessary blank lines
* No unused variables or methods
* No commented out code

The code also has proper indentation when defining variables and methods.

Readability:

Code is easily readable so that a fellow programmer can understand the purpose of the app.

Naming Conventions:

All variables, methods, and resource IDs are descriptively named so that another developer reading the code can easily understand their function.

![screenshot_20181015-133659](https://user-images.githubusercontent.com/34723009/46946270-dfdc9780-d07f-11e8-8a3c-02dc25b3b22b.png)

![screenshot_20181015-133709](https://user-images.githubusercontent.com/34723009/46946277-e2d78800-d07f-11e8-8c51-81b2436308f7.png)

![screenshot_20181015-133714](https://user-images.githubusercontent.com/34723009/46946287-e703a580-d07f-11e8-8b21-1577601dfbd9.png)

![screenshot_20181015-133720](https://user-images.githubusercontent.com/34723009/46946311-f4b92b00-d07f-11e8-9806-4157e17511ff.png)






