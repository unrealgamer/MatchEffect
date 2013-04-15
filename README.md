MatchEffect
===========

MatchEffect Team 3 Period 5

Introduction
===========
Match Effect™ is our groups take on the traditional card matching game. How this game will be played is, that the game will start with a large board area. On this area there will be a select amount of cards that will be face down and once clicked they will flip themselves. This will reveal an image which will need to be matched with another card of the same image and type. Once all cards are matched the game will be over and the players score will be calculated using our scoring system. 
Special Cards
===========
To make our game unique we are going to add specials cards which will be an important and luck driven part of the game. These special cards will have effects that will positively and/or negatively affect the player’s overall points and gameplay experience making it unique for the traditional matching card game. 
There will be four cards that will affect the game in a negative way; they are the Match Defect Card, Reeper of Time Card, Jamaican Me Crazy Card, and the You’ve Got to be Kitten Me Card.  Their effects range from taking away points from the player all the way to simply flipping all cards upside down again. To counteract these negative effects there are three other cards that positively affect the game. They are the Match Time Relay Card, the Fired Up Card, and the Double Points Card. Each will have a different positive effect on the player, such as adding time or revealing cards. 
Difficulties and Scoring System
===========
There will be three levels of difficulty for the player to experience.  The first level of difficulty will be simple and less stressful; every second 50 points will be subtracted from the player’s overall score. The second level of difficulty will add more of a challenge; with subtracting 150 points every second from the player’s overall score. The third level of difficulty will be extremely challenging; this level will subtract 200 point’s every second from the player’s overall score.
You will automatically start out with 1000 points. And for every match that you get you will receive an additional 200 points which adds to how long you can continue to play the game and try to beat it. As mentioned earlier, the player’s score will also be influenced by the many of the special cards found throughout the game. The game will end once the player’s score reaches 0 or they match all of the cards on the board; and at this time their score will be computed based on the difficulty they selected.
Code Design Aspects (see UML diagram below)
===========
All cards will extend from a Card interface. Each one of them will possess a doAction() method that will vary depending on the specific card and class. Each special card will then inherit from the SpecialCard abstract class.  A special card’s doAction() method will be will be abstract because it will be independent from each other special card. For example, the Match Defect Card is a special card that inherits from the SpecialCard abstract class. Therefore, it’s doAction() method will need to be different and independent from the Reeper Of Time Card’s doAction() method. Along with the special card there will be a NormalCard class that will have the same methods, but different properties, such as appearance and point value, that will be determined at runtime.
Gameboard is class that represents what an actual game board in real life would do. It will be responsible for maintaining and containing all the cards and the current game state. In order to accomplish this it will use method such as startGame(), getMyCards(), addScore(), and more. It is the most vital part of the game and preforms and responds to all of the actions made by or done to the player.
