# 0-100 Guessing Game
A simple Java program to allow the user to guess the computer's number from 0 to 100 (inclusive). This program solves the problem listed below.

### Required Imports
<ul>
  <li>java.util.Random</li>
  <li>java.util.Scanner</li>
</ul>

### Error-Checking
This program has a several measures to account for user error.
<ul>
  <li>The Scanner Object used to take the user's input checks to make sure that the user input is an Integer.</li>
  <li>The Scanner Object used to take the user's input checks to make sure the Integer is between 0 and 100 (inclusive).</li>
  <li>Any guesses that break these rules (strings, numbers outside of the specified range, etc.) do NOT count against the user.</li>
</ul>

### Problem to Solve:
Create a guessing game that tells the user to guess a number between 1 and 100.

Every time the user enters a number, tell them whether it was too high or too low.

If they guess it correctly, tell them how many guesses it took.
