# BlackjackProject


 ![Blackjack Diagram](images/Blackjackpic.png)


## Description
make a working Blackjack game incorperating the fundamentals of OOP abstraction, encapsulation, inheritance, and polymorphism. 
Building classes in an Object-Oriented manner: APIE.
Building classes whose fields are Objects (has-a).
Writing methods.
Using collections to organize and manage data.
Using conditionals to create game logic.
Considering common data and behaviors, and refactoring into parent / child classes.
making a working Blackjack game incorperating the fundamentals of OOP abstraction, encapsulation, inheritance, and polymorphism. 
no splitting, doubling or betting. 
extra focus on Encapsulation.

## Technologies used
 - Java
 - Eclipse
 - Git/GitHub
 - Sublime Text Editor
 - zsh
 - Sublime
 - docs.oracle.com/en/javase/8/docs/api

## UML Diagram

![UML Diagram](images/UMLDiagram.png)

 ## Concepts Applied

    - Abstraction: are common package is setup for muti use without being specific to blackjack
    - Encapsulation: using cardInHand, and GetHandValue offer protection from distructive changes
    - Inheritance: BlackJackHand is inheriting methods from Hand as it Dealer from player
    - Polymorphism: I can override getHandValue to use it for both Dealer and Player.  
    - Composition: if a class "has a" object, you can inherit behavors. 
    - 

    - 
## Plan

### 1. Requirements & Planning
- [x] Define project objectives and features
  [x] - Story #1: Create class structure that models deck of cards. - done in class
  [x] - Story #2: Create functionality of shuffling and removing cards from players hands - done in class
  [x] - Story #3: Deal 2 hands of cards, 2 to each player. - Handled in the Dealer class. 
  [x] - Story #4: Create logic for Blackjack with first facecard down - complete
  [x] - Story #5: Determine the winnner - complete

### 2. Design & Architecture
- [x] Create UML diagrams or flowcharts
- [x] Plan your class hierarchy and component interactions 
[Link Text](BlackjackProject/BlackJackBreakdown)

### 4. Implement the Backbone
- [x] Write core classes
- [X] Build primary logic and workflows for a minimal viable version - added ace logic

### 8. Testing & Debugging
- [ ] some basic testing completed. seems to be working correctly under most circumstance. 


### Leasons Learned

- the diagrams help for finding what methods are in each class. 
- need to make a seperate image folder for the readme if you want add pics. 
- create methods in reachable class for functionality without getters. 
```
//in Player
public boolean isBust() {
        return hand.isBust();
    }

    public boolean isBlackjack() {
        return hand.isBlackjack();
    }
```
- follow the logic and try and put the action within the score of the object its related to. 
- i need to remember every instance that extends class will have its own instance specific to that class so im not trying to recreate what already exists. .

issue with the ace being 11.
```
4 of ♦ Dimonds
10 of ♠ Spades
8 of ♦ Dimonds
Player has: 22
Player busts with a total of 22
player bust dealer wins!
Player: 22 Dealer: 9
Player: 22 Dealer: 9

play another round?
```
FIXED: added a tally to the getHandValue method. 


