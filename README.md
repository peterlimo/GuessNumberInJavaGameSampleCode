# GuessNumberInJavaGameSampleCode
Project 3 will be an extension of project 2 and will include design and code. In project 2 you wrote
a design document for the random guess program. In project 3, you will update the design and
write code to implement your improved design. The changes include:
• the user may play the game multiple times
• the user will choose to play the easy or difficult version of the game (see below)
Specifically, your program will run a game for the user. At the end of running the game, the
program will ask the user if he or she would like to play again. If the user does want to run the
game again, the program will do so. If the user does not, the program will end.
Each game will do the following:
1. Ask the user for an upper bound on the random number. For instance, if the user inputs 73,
the random number will be chosen from 1 to 73 inclusive. Note that if the user inputs any
number smaller than 10, the range will be 1 to 10 inclusive.
2. Generate an int value in the appropriate range (see item 1 above).
3. Ask the user which difficulty of game to play, easy or difficult. (Description of difficulty is in
next section).
4. The program will ask the user for a guess and will tell the user that the guess was correct,
was too high, or was too low. If the guess was correct, the user will be told that he or she
won and will be told the number of guesses he or she made, at which point this game will
end. If the guess was incorrect, the user will be asked if he or she wants to guess again. On
a yes response, this guessing process will repeat. On a no response, the user will be told that
he or she lost, the random number the number of guesses made will be printed, and the game
will end. (Note that the program will ask the user if he or she wants to play again at the end
of every game).
Game Difficulty
The game difficulty will be determined by the number of guesses allowed.
For an easy game, the user will have an allowable number of guesses equal to half of the upper
bound on the range (rounded up). For example, if the upper bound is 14, the maximum number
of guesses will be 7. If the upper bound is 15, the maximum number of guesses will be 8.
For a difficult game, write code to do the following:
set maxGuesses to 0
set count to upper bound of range
while count > 0
add 1 to maxGuesses
set count to count / 2
maxGuesses is the allowable number of guesses for a difficult game.
Requirements
You will be writing a design similar to the one you wrote for project 2. Your design will include at
least two methods (main and some other method or methods). Furthermore, none of your methods
will have more than 40 executable statements. (You will probably need more than 2 methods to
keep each method small enough).
Data Table
Each method in your design will have a data table. Use the format given in the assignment for
project 1.
Algorithm
Each method in your design will have an algorithm. Use the format given in the assignment for
project 1. Note that each pseudocode statement will correspond to an executable statement in the
corresponding program. This was the case with the algorithm in project 1. Note the restriction on
the number of statements per method (40, as stated above).
Input
Design your solution to use a single Scanner object instantiated from the Scanner class to read
input from the keyboard as input by the user. Make the process of entering input easy for the user.
For example, have the user enter a number for the difficulty, such as 1 for easy and 2 for difficult.
Do not make the user type out the word ”easy” or ”difficult”.
Processing
There will be a loop whose purpose is to play multiple games. A good way to handle this is to have
a method in charge of playing one game, and to have that method called in this loop.
Note that there will also be a method to repeat making guesses. As long as the user was
incorrect and wants to guess again, this loop should repeat. It is a good idea to have a method to
handle one guess, and to call that method repeatedly in this loop.
