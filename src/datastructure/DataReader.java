package datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		//String textFile ="C:\\Users\\khadi\\Desktop\\Day10\\MidtermNovember2018\\src\\data\\self-driving-car.txt";
		FileReader fr = null;
		BufferedReader br = null;
		String line = "";
		String store = "";
		try {
			fr = new FileReader(textFile);
		}catch(Exception ex){
			System.out.println("file is not found");}
		try {
			br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch(Exception ex){
			System.out.println("file is not readable");
			String[] storeArray = store.split(" ");
			List<String> storeNum = new LinkedList<String>();
			Stack<String> storeStack = new Stack<String>();

			for (String element: storeArray) {
				storeNum.add(element);
				storeStack.push(element);
			}
			Iterator<String> itr = storeNum.iterator();
			while (itr.hasNext()){
				System.out.print(itr.next()+" ");
			}
			while (!storeStack.isEmpty())
			{
				System.out.print(storeStack.pop() + " ");
			}



		}

	}
}