/* 
 Sravani Malempati 
 700662742
 CS4150 , Spring 2017
 Homework 1: PcbDrillSize.java
*/



class PcbDrillSize
{
public static void main (String[] args)
{
double thickness; 
double aspect_ratio = 6;
int i;
thickness =0.031;
System.out.println(String.format(" PCB minimum drill size by thickness (inches) for aspect ratio = %.1f ",aspect_ratio));
for(i=0; i<5; i++)
{
System.out.println(String.format("Thickness: %.3f; Minimum drill: %.3f", thickness, thickness/aspect_ratio));
thickness= thickness+ 0.031;
}
}
}