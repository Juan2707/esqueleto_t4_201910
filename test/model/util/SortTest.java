package model.util;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import model.util.Sort;



public class SortTest {

	private Comparable[] datosPrueba;


	@Before
	public void escenarioPrincipal() {

		datosPrueba = new Comparable[10];

		for(int i=0;i<datosPrueba.length; i++){

			Random random = new Random();

			int randomNumber = random.nextInt(25);

			datosPrueba[i]= randomNumber;

			System.out.println(datosPrueba[i].toString());
		}
	}


	@SuppressWarnings("unchecked")
	@Test
	public void testShell() {
		
		escenarioPrincipal();		

		Sort.ordenarShellSort(datosPrueba);
		System.out.println("---------------------------------");
		
		for(int i=0;i<datosPrueba.length; i++){
			System.out.println(datosPrueba[i].toString());
		}

		for(int i=0,j=1;j<datosPrueba.length;i++,j++){
			assertTrue("No esta ordenado por shell", datosPrueba[i].compareTo(datosPrueba[j])<=0);
		}	
	}
	@SuppressWarnings("unchecked")
	@Test
	public void testMerge() {
		
		escenarioPrincipal();	

		Sort.ordenarMergeSort(datosPrueba);
		System.out.println("---------------------------------");
		for(int i=0;i<datosPrueba.length; i++){
			System.out.println(datosPrueba[i].toString());
		}

		for(int i=0,j=1;j<datosPrueba.length;i++,j++){
			assertTrue("No esta ordenado por merge", datosPrueba[i].compareTo(datosPrueba[j])<=0);
		}	

	}
	@SuppressWarnings("unchecked")
	@Test
	public void testQuick() {
		escenarioPrincipal();	

		Sort.ordenarQuickSort(datosPrueba);

		System.out.println("---------------------------------");
		for(int i=0;i<datosPrueba.length; i++){
			System.out.println(datosPrueba[i].toString());
		}

		for(int i=0,j=1;j<datosPrueba.length;i++,j++){
			assertTrue("No esta ordenado por quick", datosPrueba[i].compareTo(datosPrueba[j])<=0);
		}	
	}
}