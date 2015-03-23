import javax.jms.*;  
import javax.naming.InitialContext;  
  
public class MyReceiver {  
    public static void main(String[] args) {  
        try{  
            
		// Create and start connection  
            
		InitialContext ctx = new InitialContext();  
            
		QueueConnectionFactory f = (QueueConnectionFactory)ctx.lookup("myQueueConnectionFactory");  
            
		QueueConnection con = f.createQueueConnection();  
            
		con.start();  
            
		
		// create Queue session  
            
		QueueSession ses = con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);  
            
		
		// get the Queue object  
            
		Queue t=(Queue)ctx.lookup("myQueue");  
            
		
		// create QueueReceiver  
            
		
		QueueReceiver receiver=ses.createReceiver(t);  
              
            
		// create listener object  
            
		MyListener listener=new MyListener();  
              
            
		// register the listener object with receiver  
            
		receiver.setMessageListener(listener);  
              
            
		System.out.println("Receiver1 is ready, waiting for messages...");  
            
		System.out.println("press Ctrl+c to shutdown...");  
            
		while(true){                  
                
			Thread.sleep(1000);  
            
		}  
        
	}catch(Exception e){System.out.println(e);}  
    }  
  
}  
