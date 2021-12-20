
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class createaccount {
	static int f1=0;

	public static void main(String[] args) throws IOException {
		Scanner obj=new Scanner(System.in);
		String admin=new String("admin");
		String user =new String("user");
		String s;
		
		int ch;
		while(true)
		{
		System.out.println("1.for admin\n2.user\n3 login ");
		ch=obj.nextInt();
		switch(ch)
		{
			case 1:
			{
				System.out.println("the admin user name is by default " +"admin");
				FileOutputStream fout=new FileOutputStream("C:\\Users\\MANSA\\javafile\\admin.txt");
				BufferedOutputStream bout=new BufferedOutputStream(fout);
				Scanner obj1=new Scanner(System.in);
				System.out.println("enter the password");
				s=obj1.nextLine();
				byte b[]=s.getBytes();
				bout.write(b);
				bout.flush();
				bout.close();
				fout.close();
				System.out.println("success");
				break;
			}
			case 2:
			{
				System.out.println("the user name is by default " +"user");
				FileOutputStream fout=new FileOutputStream("C:\\Users\\MANSA\\javafile\\user.txt");
				BufferedOutputStream bout=new BufferedOutputStream(fout);
				Scanner obj2=new Scanner(System.in);
				System.out.println("enter the password");
				s=obj2.nextLine();
				byte b[]=s.getBytes();
				bout.write(b);
				bout.flush();
				bout.close();
				fout.close();
				System.out.println("Success");
				break;
			}
			case 3:
			{
				Scanner obj3=new Scanner(System.in); 
				int t;
				System.out.println("enter 1 if you are admin and 2 if you are user\n");
				t=obj3.nextInt();
				switch(t)
				{
						case 1:
						{
							Scanner obj4=new Scanner(System.in);
							System.out.println("Password: ");
							String obj1=new String(obj4.nextLine());
							BufferedReader m =new BufferedReader(new FileReader("C:\\Users\\MANSA\\javafile\\admin.txt"));
							String Line= new String();
							try {
								while((Line=m.readLine())!=null)
								{
									if(obj1.equals(Line))
									{	
										f1=0;
										break;
									}
									else
										f1=1;	
									
								}
								
							} catch (IOException e) {
								e.printStackTrace();
							}
							if(f1==0)
								System.out.println("Password is correct.");
							else
								System.out.println("Password incorrect.");
							break;
						}
						case 2:
						{
							Scanner obj5=new Scanner(System.in);
							System.out.println("Password: ");
							String obj1=new String(obj5.nextLine());
							BufferedReader m =new BufferedReader(new FileReader("C:\\Users\\MANSA\\javafile\\user.txt"));
							String Line= new String();
							try {
								while((Line=m.readLine())!=null)
								{
									if(obj1.equals(Line))
									{	
										f1=0;
										break;
									}
									else
										f1=1;	
									
								}
								
							} catch (IOException e) {
								e.printStackTrace();
							}
							if(f1==0)
								System.out.println("Password is correct.");
							else
								System.out.println("Password incorrect.");
							break;
						}		
				}
				
				
			}
			case 4:
				break;
				
		}
		
		}

	}

}