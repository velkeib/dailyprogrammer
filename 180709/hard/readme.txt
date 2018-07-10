Description
Have you ever seen one of those puzzles where you have to try and fit a collection of various shapes into a certain area?

The Pentomino was first devised by American professor Solomon Golomb in 1953. A Pentomino is a single polygon made up of 5 congruent squares. A full set of Pentominos consists of all 12 of the possible combinations of the 5 squares (excluding reflections and rotations).

Pentominos have the special property of being able to be packed into many different shapes. For example, with a full set of 12 Pentominos, you could create a rectangle of size 6x10, 5x12, 4x15, and 3x20. Other smaller shapes can be made, but with less Pentominos. Additionally, you can also fill an 8x8 square with 4 holes in it (although certain positions of the holes can make it impossible).

The challenge is to output one solution for the given rectangle.

Challenge Input
The input is a single line with two numbers. The first number is the width of the rectangle, and the second number is the height.

10 6
12 5
15 4
20 3
5 5
7 5
5 4
10 5
Challenge Output
The output should be a representation of the board. This can be anything from an ASCII representation to a graphical view. If you go for the ASCII representation, choose one of the nomenclatures here. For example, the ASCII representation could look like this:

Input:

10 6
Output:

????????????????????
????????????????????
????????????????????
????????????????????
????????????????????
????????????????????