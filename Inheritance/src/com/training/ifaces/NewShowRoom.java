package com.training.ifaces;
import com.training.ifaces.Automobile;

public class NewShowRoom extends ShowRoom {

	@Override
	public Automobile getModel(final int key) {
		// TODO Auto-generated method stub
		
		if(key==3)
		{
			return new Bike();
		}
		else
		{
			
		return super.getModel(key);
		}
	}

	
}
