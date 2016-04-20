package Day2.Facebook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abarabash on 3/3/16.
 */
public class Actions {

    public static void makeFriends(Friend friend1, Friend friend2){ //when we want to make a friendship :)
        friend1.friends.add(friend2);   //adding one guy to another's guy list of friends
        friend2.friends.add(friend1);   //and same for second
    }

    public static void unFriend(Friend friend1, Friend friend2){ //when the friendship is over ;(

        friend1.friends.remove(friend2); //removing list member from list of friend
        friend2.friends.remove(friend1); //and same for second person
    }

    public static Boolean areFriends(Friend friend1, Friend friend2){ // did we met before?
        Boolean result1 = false;  //creating boolean one half of the result
        Boolean result2 = false;    //creating boolean second half of the result

        for(Friend each : friend1.friends){ //traversing through the list of all friend1's friends
            result1 = each == friend2; //if friend2 in that list, we have one half of the result = true
        }

        for (Friend each : friend2.friends){ //traversing through the list of all friend2's friends
            result2 = each == friend1; //if friend1 in that list, we have second half of the result = true
        }

        return result1&&result2; //overall result consist of 2 results: 1 and 2;
    }

    public static List<String> directFriends(Friend friend){ //direct friends
        List<String> result= new ArrayList<String>(); //result is list of friends

        for(Friend each:friend.friends){ //traversing throght list of friends,
            result.add(each.name);      //and adding names to result list
        }

        return result; //...
    }

    public static List<String> breathFirstSearch(Friend root){ //BFS algorithm for traversing through graph using queue

        List<String> result = new ArrayList<String>(); //result list of all names all connected friends

        Queue queue = new Queue(); //creating instanse of queue class
        root.visited = true; //parameter root is a friend, who's list we're looking for. he becomes visited
        queue.enqueue(root); //and putting him to queue

        while(queue.first != null){  //while nobody left in queue, do
            Friend c = (Friend) queue.dequeue(); //putting out next guy from queue, and storing him to c
            for(Friend each: c.friends){ //traversing through all his friends

                if(!each.visited){ // is one of those is already NOT visited
                    result.add(each.name); //adding him to result

                    each.visited = true; //and making him visited
                    queue.enqueue(each); //and putting him to the queue
                }

                //and then repeat all this actions again and again while nobody left in the queue
            }
        }

        return result; //...

    }

    public static List<String> inDirectFriends(Friend friend){ //“Tell me who your friends are and I’ll tell you who you are.”

        return breathFirstSearch(friend); //using implemented algorithm for finding all friends (direct, indirect)
    }
}
