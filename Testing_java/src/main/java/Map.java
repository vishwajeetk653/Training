
public class Map {
	private int sizeOfArray=2;
	public int size=0;
	public int realSize=0;
	public int[] key= new int[sizeOfArray];
	public int[] value= new int[sizeOfArray];
	
	public int getSizeOfArray() {
		return sizeOfArray;
	}
	
	
	public int getSize() {
		return realSize;
	}
	
	public void enhanceSize() {
		sizeOfArray= sizeOfArray + 25;	
		int[] newKey= new int[sizeOfArray];
		int[] newValue= new int[sizeOfArray];
		for(int j=0;j<sizeOfArray-25;j++) {
			newKey[j]= key[j];
			newValue[j]= value[j];
		}
		key= newKey;
		value= newValue;
	}
	
	
	public void put(int a, int b) {
		if(size== getSizeOfArray()-1)
			{
				enhanceSize();
				this.key[size]=a;
				this.value[size++]=b;
				realSize++;
			}
		else {	
		this.key[size]=a;
		this.value[size++]=b;
		realSize++;
		}
	}
	
	
	public int get(int a) throws NullPointerException {
		int index=0;
		
		for(int i=0;i<size;i++)
		{ 
			if(key[i]==a) {
				index=i;
				return value[i];
			}
		}
		
				throw new NullPointerException();
	
	}
	
	public void remove(int a)  {
		int index=0;
		for(int i=0;i<size;i++)
		{ 
			if(key[i]==a) {
				index=i;
				
			}
		}
		
		key[index]=key[index-1];
		realSize--;
		
	}
	
}
