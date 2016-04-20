package Day2.Facebook;

/**
 * Created by abarabash on 3/3/16.
 */
public class Queue {

    //one of the implementation of a queue

    Friend first, last; //field of the class, where we saying that members of this queue will be friends


    public void enqueue(Friend friend){ //mechanism of adding a friend to a queue

        if(first == null)  // when nobody in the queue
        {
            first = friend; //friend(parameter of this method) becomes first
            last = first; //and last as well
        }
        else    //when somebody already in the queue
            {
                last.next = friend; //he becomes next after last
                last = friend; //and last in the queue
            }
    }

    public Friend dequeue(){ //mechanism of removing a friend from a queue

        if(first == null) // when nobody in the queue
        {
            return null; //nothing to remove then
        }
        else // if somebody there
        {
            Friend temp = new Friend(first.name, first.friends); //storing first friend in temp object
            first = first.next;                                  //next friend of first becomes first
            return temp;                                      //and returning temp (which was first)
        }
    }
}
