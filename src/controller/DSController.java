package controller;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

import model.Things;

public class DSController
{

	private Queue<Things> thingQueue;
	private Stack<Things> thingStack;
	private ArrayList<Things> thingList;
	
	public DSController()
	{
//		thingQueue = new Queue<Things>();
		thingStack = new Stack<Things>();
		thingList = new ArrayList<Things>();
	}
	
	private void useStack()
	{
		Things test = new Things();
		thingStack.push(test);
	}
}
