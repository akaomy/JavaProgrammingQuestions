package Day2.Facebook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abarabash on 3/3/16.
 */
public class Friend {

    //fields of the class
    String name; //each friend has a name
    Friend next; //this field made for queue implementation, in every queue somebody "next" is exist
    boolean visited; //flag for traversing algorithm which in false when node is not visited

    List<Friend> friends = new ArrayList<>(); //this is friend's friends, nothing but a list of same class objects

    Friend(String friendName){
        name = friendName;
    } // default constructor

    Friend(String friendName, List<Friend> friendsList){ //additional constructor with added list of friends
        name = friendName;
        friends = friendsList;
    }





}
