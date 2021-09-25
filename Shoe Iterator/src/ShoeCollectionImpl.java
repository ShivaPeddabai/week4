
public class ShoeCollectionImpl implements ShoeCollection{
private String shoe[]= {"Shoe Types: Boat shoe, Climbing Shoe, Derby Shoe, Fashion Boot, High-heeled footwear,Monk shoe, Mojari, Sandal, Slipper etc... ",
		                "Mens Shoes: Sneakers, Monk shoes, Moccasins etc..",
		                "Women Shoes: Pumps, Stilettos, Kitten Heels etc..",
		                "Shoe Size varies from 20.8c.m to 31.8c.m"
					   };
	@Override
	public Iterator getIterator() {
		return new ShoeIteratorImpl();
	}
	
	private class ShoeIteratorImpl implements Iterator
	{
		int i=0;
		@Override
		public boolean hasNext() {
			if(i<shoe.length)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			if(hasNext())
				return shoe[i++];
			else
				return null;
		}
	}
}
