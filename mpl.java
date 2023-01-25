/*class mpl 
{
	public static void main(String[] args) 
	{
		String s1="chandra";

		System.out.println(s1);
		StringBuffer s2=new StringBuffer("vinay");
		System.out.println(s2);
		String s3=new String("sekhar");
		System.out.println(s3);

	}
}

class mpl   //mutable or immutable
{
	public static void main(String[] args) 
	{
		String s1="chandra";
		s1.append("sekhar");

		System.out.println(s1);
		StringBuffer s2=new StringBuffer("vinay");
		s2.append("kumar");
		System.out.println(s2);
		String s3=new String("sekhar");
		System.out.println(s3);

	}
}

class mpl     //toString method

{
	int eid;
	String ename;
	mpl(int eid,String ename)

	{
		this.eid=eid;
		this.ename=ename;
	}
	public String toString()
	{
		return "eid="+eid; + "ename="+ename;
	}
	public static void main(String[] args)
	{
		mpl m=new mpl(111,"chandra");
		
		System.out.println(m);
	}


}

class mpl

{
	int eid;
	String ename;
	mpl(int eid,String ename)

	{
		this.eid=eid;
		this.ename=ename;
		System.out.println("eid="+eid);
		System.out.println("ename="+ename);
	}
	
	public static void main(String[] args)
	{
		mpl m=new mpl(111,"chandra");
		
		
		
	}


}

class mpl    // equlas checking 
{
	mpl(String s)
	{}
	public static void main(String[] args)
	{
		mpl m1=new mpl("chadra");
		mpl m2=new mpl("chandra");
		System.out.println(m1.equals (m2));
		String s1=new String("sekhar");
		String s2=new String("sekhar");
		System.out.println(s1.equals(s2));
		StringBuffer sb1=new StringBuffer("virat");

		StringBuffer sb2=new StringBuffer("virat");
		System.out.println(sb1.equals(sb2));

	}
	

}

class mpl       //conversion
{
	public static void main(String[] args)
	{
		String s="chandra";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		System.out.println(sb.reverse());
		StringBuffer sb1=new StringBuffer("sekhar");
		String s1=sb1.toString();
		System.out.println(s1);

	}


}
*/
class mpl
{
	public static void main(String[] args)
	{
	    String s1=new String("sekhar");
		String s2=new String("sekhar");
		String s3=new String("chandra");

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("chandra".equalsIgnoreCase("sekhar"));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
	}






}