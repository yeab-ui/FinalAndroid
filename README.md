# FinalAndroid
yeabkalandbetemaryam


BBMain Actitivty Folder is Assignment 2

Name                                    ID
Yeabkal Endale ……………….. DBUR/1346/10
Betemariyam Tadesse ……… DBUR/1145/10
Answers:
Assignment I

QUESTION 1
What changes are made when you add a second Activity to your app by choosing File > New > Activity and an Activity template? Choose one:

Answer C, The second Activity is added as a Java class, the XML layout file is created, and the AndroidManifest.xml file is changed to declare a second Activity.

QUESTION 2
What happens if you remove the android: parentActivityName and the <meta-data> elements from the second Activity declaration in the AndroidManifest.xml file?

Answer D, The Up button in the app bar no longer appears in the second Activity to send the user back to the parent Activity.

Question 3
Which constructor method do you use to create a new explicit Intent?
Answer B, new Intent (Context context, Class<?> class)

QUESTION 4
In the HelloToast app homework, how do you add the current value of the count to the Intent? Choose one:
Answer D, As an Intent extra

QUESTION 5
In the HelloToast app homework, how do you display the current count in the second "Hello" Activity?
Answer B, Get the current count value out of the Intent. And
             C, Update the TextView for the count.


------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Assignment II
QUESTION 1

If you run the homework app before implementing onSaveInstanceState(), what happens if you rotate the device?
Answer B, The counter is reset to 0, and the EditText no longer contains the text you entered.


QUESTION 2
What Activity lifecycle methods are called when a device-configuration change (such as rotation) occurs?

Answer C, Android shuts down your Activity by calling onPause(), onStop(), and onDestroy(), and then starts it over again, calling onCreate(), onStart(), and onResume().


QUESTION 3
When in the Activity lifecycle is onSaveInstanceState() called? Choose one:

Answer A, onSaveInstanceState() is called before the onStop() method.

QUESTION 4
Which Activity lifecycle methods are best to use for saving data before the Activity is finished or destroyed? Choose one:
Answer A,          onPause() or onStop()



