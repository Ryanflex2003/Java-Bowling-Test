# Bowling Game Kata
Bowling Game Kata using Java / JUnit

# How to Keep Score In Bowling
A game of bowling consists of 10 frames in which a player has two chances per frame to knock down all 10 pins.  If a player knocks down all 10 pins in the 10th frame, an extra throw is awarded (so you can have up to 3 throws in the 10th frame).

The basics of scorekeeping are quite easy - just add up the pins knocked down per frame.  For example, if on your first throw you knock down 6 pins, and then on the second throw you knock down 3, your total is 9 for the frame.  The exceptions to this are if you knock down all 10 pins on the first throw (a strike), or knock all 10 pins down in two throws (a spare).

## How spares are scored

Throwing a spare awards the player with 10 points plus the number of pins knocked down on the next throw.  For example, if you throw a spare in the first frame, and then an 8 and 1 in the second frame, your total for first frame would be 18.  If you throw a spare in the first frame, followed by a strike in the second frame, your score would be 20 for the first frame.

## How strikes are scored

Throwing a strike awards the player with 10 points plus the total of the next **two** throws.  For example, if you throw a strike in the first frame, and then an 8 and 1 in the second frame, your total for first frame would be 19.  If you throw a strike in the first frame, followed by a strike in the second and third frames, your score would be 30 for the first frame.

# The Goal
The goal of this kata is to use a test driven design (TDD) approach to successfully score a game of bowling.  Make sure all the tests pass:
* You are fee to create any methods in the Game or Frame classes.
* The Game class that has two methods
    * Bowl(Frame frame) for each frame of the game
    * GetScore() is called at the end of the game to give a total score.  This is the method you must alter to get the tests to pass.

# How to run
This is a gradle based java application.
* build: `./gradlew assemble`
* run tests: `./gradlew test` or use the IDE

# Example Score Sheet
<div align="center">
    <img src="assets/bowling-score-sheet.svg" height="100" />
</div>

# Resources
This kata was inspired by a similar one written by [Brain Franks](https://github.com/FranksBrain/BowlingKata/blob/master/README.md)
