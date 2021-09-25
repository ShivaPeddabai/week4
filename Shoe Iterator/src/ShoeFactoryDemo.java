
public class ShoeFactoryDemo {

	public static void main(String[] args) {
		ShoeCollectionImpl shoeFactory = new ShoeCollectionImpl();
		Iterator itr = shoeFactory.getIterator();
		for( ; itr.hasNext(); )
		{
			Object object=itr.next();
			String message=(String)object;
			System.out.println(message);
		}

	}

}
