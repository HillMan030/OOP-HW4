package tiida;


public class NissanTiida 
{
	public int count=0;
	public void bigger()
	{
		int n,s;
		count++;
		for(n=0;n<count;n++,System.out.print('\n'))
			for(s=0;s<count;s++)
				System.out.print('*');
	}

}

