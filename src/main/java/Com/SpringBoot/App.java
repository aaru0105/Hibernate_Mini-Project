package Com.SpringBoot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext ct=new ClassPathXmlApplicationContext("config.xml");
    	
    	impl_interf imp=ct.getBean("io",impl_interf.class);
    	 
    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	 
    	 boolean go = true;
    	 
    	 while(go) {
    		 System.out.println( "PRESS 1 FOR ADD WORKER" );
    		 System.out.println( "PRESS 2 FOR DISPLAY ALL WORKER" );
    		 System.out.println( "PRESS 3 FOR SINGLE DETAIL OF WORKER" );
    		 System.out.println( "PRESS 4 FOR DELETE WORKER" );
    		 System.out.println( "PRESS 5 FOR UPDATE WORKER" );
    		 System.out.println( "PRESS 6 FOR EXIT" );
    		 
    		 try {
    			 int input=Integer.parseInt(br.readLine());
    			 switch(input) {
    			 case 1:
    				 System.out.println( "Enter id" );
    				 int sid=Integer.parseInt(br.readLine());
    				 
    				 System.out.println( "Enter name" );
    				 String sname=br.readLine();
    				 
    				 System.out.println( "Enter Hours" );
    				 int  hrs=Integer.parseInt(br.readLine());
    				 
    				 System.out.println( "Enter Days" );
    				 int  days=Integer.parseInt(br.readLine());
    				 
    				
    				 //System.out.println( "Enter extra hours" );
    				 //int  e_hrs=Integer.parseInt(br.readLine());
    				 
    				 float amt;
    				 int e_hrs = 0;
    				 int rate;
    				 int ab_days1 = 0;
    				 
    				 if(hrs>12) {
    					 ab_days1=7-days;
    					 e_hrs=hrs-12;
    					 rate=30;
    					 amt =(12 * rate)+(e_hrs*rate*days);
    					 }
    				 else if(hrs<12) {
    					 rate=10;
    					 amt=hrs*rate;
    				 }
    				 
    				 else if(days<7) {
    					 ab_days1=7-days;
    					 rate=5;
    					 amt=hrs*rate;
    				 }
    				 else {
    					 rate=20;
    					 amt=hrs*rate;
    				 }
    				 
    				 basic_info bi=new basic_info();
    				 bi.setId(sid);
    				 bi.setName(sname);
    				 bi.setHrs(hrs);
    				 bi.setDays(days);
    				 bi.setAb_days1(ab_days1);
    				 bi.setRate(rate);
    				 bi.setE_hrs(e_hrs);
    				 bi.setAmt(amt);
    				 int res=imp.insert(bi);
    				 System.out.println(res+ "WORKER ADDED" );
    				 System.out.println("****************");
    				 System.out.println();
    				break;
    			    case 2://SELECT ALL DATA
    				  List<basic_info> allinfo=imp.getallinfo();
     				  for(basic_info p:allinfo) {
     					 System.out.println("ID:"+p.getId());
     					 System.out.println("Name:"+p.getName());
     					 System.out.println("Worker Hour:"+p.getHrs());
     					 System.out.println("Working Days:"+p.getDays());
     					 System.out.println("Workers Extra Time:"+p.getE_hrs());
     					 System.out.println("Daily Wage:"+p.getRate());
     					 System.out.println("Total Wages:"+p.getAmt());
     					 System.out.println("****************");
     					 System.out.println("DISPLAYED ALL RECORDS");
     				 }
     				 System.out.println("****************");
     				 break;
    			  case 3://SELECT SINGLE DATA
    				  System.out.println( "Enter id" );
     				 int Sid=Integer.parseInt(br.readLine());
     				 
     				basic_info a=imp.getworkerinfo(Sid);
     				
     				System.out.println("Name:"+a.getName());
					 System.out.println("Worker Hour:"+a.getHrs());
					 System.out.println("Working Days:"+a.getDays());
					 System.out.println("Workers Extra Time:"+a.getE_hrs());
					 System.out.println("Daily Wage:"+a.getRate());
					 System.out.println("Total Wages:"+a.getAmt());
					 System.out.println("****************");
					 System.out.println("DISPLAYED SINGLE RECORDS");
					 System.out.println("****************");
    			  break;
    	         case  4://Delete Data
    	        	 System.out.println( "Enter id" );
     				 int ID1=Integer.parseInt(br.readLine());
     				 
    	        	 imp.delete(ID1);
    	        	 System.out.println("Record Deleted");
    				 break;
    				 
    			     case 5://Update Data
    				 System.out.println( "Enter id" );
     				 int SId2=Integer.parseInt(br.readLine());
     				  
     				 basic_info  p2=imp.getworkerinfo(SId2);
     				 
     				 System.out.println("Name:"+p2.getName());
					 System.out.println("Worker Hour:"+p2.getHrs());
					 System.out.println("Working Days:"+p2.getDays());
					 System.out.println("Workers Extra Time:"+p2.getE_hrs());
					 System.out.println("Daily Wage:"+p2.getRate());
					 System.out.println("Total Wages:"+p2.getAmt());
					 

    				 System.out.println( "Enter name" );
    				 String Sname=br.readLine();
    				 
    				 System.out.println( "Enter Hours" );
    				 int  hrs1=Integer.parseInt(br.readLine());
    				 
    				 System.out.println( "Enter Days" );
    				 int  days1=Integer.parseInt(br.readLine());
    				 
    				 float amt2;
    				 int e_hrs1 = 0;
    				 int rate1;
    				 int ab_days2 = 0;
    				 
    				 if(hrs1>12) {
    					 ab_days2=7-days1;
    					 e_hrs1=hrs1-12;
    					 rate1=30;
    					 amt2 =(12 * rate1)+(e_hrs1*rate1);
    					 }
    				 else if(hrs1<12) {
    					 rate1=10;
    					 amt2=hrs1*rate1;
    				 }
    				 
    				 else if(days1<7) {
    					 ab_days2=7-days1;
    					 rate1=5;
    					 amt2=hrs1*rate1;
    				 }
    				 else {
    					 rate1=20;
    					 amt2=hrs1*rate1;
    				 }
    				 
    				 p2.setId(SId2);
    				 p2.setName(Sname);
    				 p2.setHrs(hrs1);
    				 p2.setE_hrs(e_hrs1);
    				 p2.setRate(rate1);
    				 p2.setDays(days1);
    				 p2.setAb_days1(ab_days2);
    				 p2.setAmt(amt2);
    				 
    				 imp.update(p2);
					 System.out.println("****************");
					 System.out.println("UPDATED RECORDS");
					 System.out.println("****************");
					 break;
    			 
    			     case 6:
    				 go=false;
    				 
    			 }
    	 }
    	 
    				catch(Exception e)
    				{
    			 System.out.println("INVALID RECORD");
    			 System.out.println(e.getMessage());
    				}
    		 
    				 }
    	 
        System.out.println( "THANK YOU FOR USING APP!!!!!!" );
    		 }
    }
    
        