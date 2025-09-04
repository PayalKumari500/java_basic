//print the table of 19
// public class tableofninteen{
//     public static void main(String[]argss){ 
//         for(int i=19;i<=190;i++){
//             if(i%19==0)
//             System.out.println(i);
//         }

//     }
// }

//2nd method
public class tableofninteen{
    public static void main(String[]argss){
        for(int i=19;i<=190;i+=19){
            if(i%19==0)
            System.out.println(i);

        }
    }
}