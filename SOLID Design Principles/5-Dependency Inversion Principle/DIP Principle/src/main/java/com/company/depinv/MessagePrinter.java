package com.company.depinv;

import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	//Writes message to a file
	//We have two problems, we cant modify format and writer
	public void writeMessage(Message msg, /*String fileName,*/ Formatter formatter, PrintWriter writer ) throws IOException {
		
		//Formatter formatter = new JSONFormatter(); //removing concrete dependency
		//try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) { //removing concrete dependency
			writer.println(formatter.format(msg)); //formats and writes message
			writer.flush();
		//}
	}
}
