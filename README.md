## Problems with Shivam's OOP solution.
There were two classes, but both were not truly following the object-oriented principles, 
however, two were complementary. The Point class was only acting as ***a data container*** 
while the DistanceAndDirectionCalculator class was only acting as a ***method (or behaviors) container***.

## How to fix it.
***Merge*** the DistanceAndDirectionCalculator class into the Point class. Now the Point class has
***both data(coordinates) and behaviors(distance and direction methods)***. Since ***now data and methods 
are encapsulated into the Point class*** we can remove the DistanceAndDirectionCalculator class and getters 
and setters of the Point class as they are of no use. In addition to that, adding getXdistance, and getYdistance 
method to the Point class can help reduce code redundancy as x distance and y distance were calculated in both 
distance and direction method.
