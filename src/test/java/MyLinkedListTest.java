import com.bz.linkedlist.INode;
import com.bz.linkedlist.MyLinkedList;
import com.bz.linkedlist.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhereLinkedListIsSearchedAndAddressIsMatchedForTheSearchedElement(){
        MyNode<Integer>  myFirstNode = new MyNode(56);
        MyNode<Integer> mySecondNode = new MyNode(30);
        MyNode<Integer>  myThirdNode = new MyNode(70);
        MyNode<Integer>  myForthNode = new MyNode(40);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
         myLinkedList.searchAndInsert(30,myForthNode);

        myLinkedList.printNodes();
        myLinkedList.delete(myForthNode);
        System.out.print("LinkedList after deleting element 40 is : ");
        myLinkedList.printNodes();
        System.out.print("Size of linkedList is: ");
        myLinkedList.size(myThirdNode);

        Boolean result =  myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
