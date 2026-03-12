public class CircularQueue{
    static class Queue{
        static int arr [];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr =new int[n];
            size=n ;
            rear=-1;
            front=-1;

        } 
        // empty()
        public boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        // isFull()
        public boolean isFull(){
            return (rear+1)%size==front;
        }
        // add 
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return ;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }
        // remove
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result=arr[front];
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }
        // peek()
        public int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        for(int i=1;i<4;i++){
            q.add(i);
        }
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!(q.isEmpty())){
            System.out.println(q.peek());
            q.remove();
        }

        
    }
    
}