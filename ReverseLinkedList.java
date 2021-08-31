import java.util.*;

/**
 * @Author nathan
 * @Date 2021/8/8 7:28 下午
 * @Version 1.0
 * @Desc
 */
public class Main {
    static class Node{
        int v;
        Node next;
    }
    public static Node reverseLinkedList(Node head){
        Node  fakeNode=new Node();
        Node traverse=head;
        while (traverse!=null){
            // 取头节点
            Node tmp=traverse;
            traverse=traverse.next;
            // 头插法
            tmp.next=fakeNode.next;
            fakeNode.next=tmp;
        }
        return fakeNode.next;
    }
}
