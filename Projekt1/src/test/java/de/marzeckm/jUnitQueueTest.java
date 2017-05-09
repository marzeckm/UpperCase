package de.marzeckm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class jUnitQueueTest {
	@Test
	public void QueueFunktioniert() {
		//Dimension festlegen: 3 
		final int dimension = 3;
		//Nummer 1-3 festlegen 
		final int num1 = 1,num2 = 2, num3 = 3, num4 = 4;
		//Queue erstellen und die drei Werte hinzufügen 
		final Queue Qu = new Queue(dimension);
		 Qu.enqueue(num1);Qu.enqueue(num2); Qu.enqueue(num3);
		 //Sollwert festlegen
		 final int sollWert = 1;
		 assertEquals(sollWert, Qu.dequeue());
	} 
}
