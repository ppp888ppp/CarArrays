# Car (Part 2) - Using Arrays  
## Description  
 * This second version of Car project using array is very similar to the first Car project in the other repository.
 * Redesign the program such that ten cars can be controlled instead of just one. 
 * All the methods from before will remain the same, in terms of functionality. 
 * Additionally, we are still dealing with a 20x20 grid that has strict bounds.
 * All cars have the same attributes as the single car did in the first Car assignment. 
 * Also, the error checking from before should still be in place.  
 * In order to create ten cars that can be controlled by the user, we will need to use arrays. There will be an array for each attribute that a car should have. For instance: 
 
   *boolean[] ignitions = new boolean[10];* 
 
 * In essence, each car will have an associated index in every array. As an example, car 3 would correspond to the third element in every array. 
  If we needed to get its ignition we would write “ignitions[2]”. 
 
 
## Let's Play This!
1. The user is asked to choose the car number between 1 - 10
2. The program will present the user with a menu options
3. As for the movement option, the secondary menu should be generated within the main() method. Once the user makes a valid choice and enters a movement distance, one of the two methods may be called.  
4. The program should be able to handle invalid input at the main menu (e.g., the user inputs “zzz”) and print a message to let the user know that what they just entered cannot be accepted. Similar error checking should occur at the movement menu, when the user inputs either “H” or “V”. You may assume that the movement distance will always be an integer, but you cannot assume that the movement will not potentially move the car out of bounds.

 
 
 
 
 
 
## Example Output  
Which car would you like to use? (Choose from 1-10) 

Input: 3 
 
What would you like to do?

  1: Turn the ignition on/off
  
  2: Change the position of the car 
  
  Q: Quit this program 
  
  Input: 1 
  
  
  
  ![Capture](https://user-images.githubusercontent.com/51673576/64469118-e42bfc00-d0fa-11e9-9500-179ed39b7f6a.JPG)

