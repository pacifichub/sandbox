package com.sandbox.designpatterns.producerconsumer;

import java.util.LinkedList;

public class LoggingThreadWaitNotify extends Thread {

	private LinkedList<String> logList = new LinkedList<String>();
	private volatile boolean isTerminated = false;
	
	@Override
	public void run() {
		
		try{
			
			while(!isTerminated){
				
				synchronized (logList) {
					while(logList.isEmpty()){
						System.out.println("LoggingThreadWaitNotify.run() :: Waiting for next log");
						if(!isTerminated)
							logList.wait();
					}
					
					String lineToLog = logList.removeFirst();
					writeLog(lineToLog);
				}
				
				
			}
			
			
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void writeLog(String logMsg){
		System.out.println(logMsg);
	}
	
	public void log(String logMsg){
		synchronized (logList) {
			logList.add(logMsg);
			logList.notify();;
		}
	}
	
	public static void main(String[] args) {
		LoggingThreadWaitNotify lt = new LoggingThreadWaitNotify();
		lt.start();
		int count = 0;
		
		while(count <= 3){
			lt.log("Msg "+count);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		}
		
		
	}
}
