public class  小球自由落体 {
    public static void main(String[] args) {
            double sum=100,height=100;
            
            for(int i=1;i<=9;i++)
            {
            height=height/2;
            sum=sum+height*2;
            }
            height=height/2;
            System.out.println("第十次落地时的高度是："+height+"\n小球共经过："+sum+"米");
            } 
           
    }

