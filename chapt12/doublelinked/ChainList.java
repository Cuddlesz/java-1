package cn.sdu.edu.sc.java.chapt12.doublelinked;
/**
 * һ��˫�����������
 * @author Dahogn
 * @version 1.01
 * @since 2008.12.19
 */

class Chain{
  Chain pre=null,next=null;
  int id;
  String name;
}

class List{
  private Chain header=new Chain();
  
  public Chain add(int id,String name){ //������β��ӽڵ�
      Chain current=new Chain(); //��������ͷ
      Chain temp=header;
  
      while(temp.next!=null) //ѭ��������β
          temp=temp.next;
      temp.next=current;
      current.pre=temp;    
      current.id=id;
      current.name=name;
      return current;
  }
  
  public Chain remove(int id){ //ɾ��ָ��id�Ľڵ�
      Chain temp=header;
      Chain current=null;
      while(temp.next!=null){
          temp=temp.next;
          if(temp.id==id){
              current=temp;
              break;
          }
      }
      if(current==null)
          return null;        
      
      current.pre.next=current.next;
      if(current.next!=null)
          current.next.pre=current.pre;
      return current;
  }
  
  public Chain remove(String name){ //ɾ��ָ��name�Ľڵ�
      Chain temp=header;
      Chain current=null;
      while(temp.next!=null){
          temp=temp.next;
          if(temp.name==name){
              current=temp;
              break;
          }
      }
      if(current==null)
          return null;
      
      current.pre.next=current.next;
      if(current.next!=null)
          current.next.pre=current.pre;
      return current;
  }    

  public Chain remove(){ //ɾ�����һ���ڵ�
      Chain temp=header;
      while(temp.next.next!=null){
          temp=temp.next;
      }
      temp.next=null;    
      return temp;
  }
  
  public void clear(){ //ɾ�����нڵ�
      header.next=null;
  }
  
  public Chain insert(int id,String name,int pos){ //��ָ��λ�ò���ڵ�
      Chain temp=header;
      Chain current=new Chain();
      int i=0;
      
      for(i=0;i<=pos;i++){
          if(temp.next!=null){
              temp=temp.next;
          }
          else{
              return null;
          }        
      }
      
      current.id=id;
      current.name=name;
      
      if(temp.next!=null){
          temp.next.pre=current;
          current.next=temp.next;
      }
      temp.next=current;
      current.pre=temp;
      return current;    
  }
  
  public void print_all(){
      Chain temp=header;
      
      System.out.println("--------------------------------------");
      while(temp.next!=null){
          temp=temp.next;
          System.out.println("ID: "+temp.id);
          System.out.println("Name: "+temp.name);
      }
      System.out.println("--------------------------------------");
  }
}

public class ChainList{
  public static void main(String[] args){
      List a=new List();
      
      a.add(1,"dahogn1") ;
      a.add(2,"dahogn2");
      a.add(3,"dahogn3");
      a.insert(12,"tom",1);
      a.remove(2);
      

      a.print_all();
  }
} 

