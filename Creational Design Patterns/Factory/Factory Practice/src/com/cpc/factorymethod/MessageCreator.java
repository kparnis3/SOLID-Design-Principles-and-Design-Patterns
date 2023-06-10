/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
import message.Message;

public abstract class MessageCreator {

	public Message getMessage(){
		Message msg = createMessage();

		msg.addDefaultHeaders(); //Do some additional operations
		msg.encrypt();

		return msg;
	}

	//Factory method
	public abstract Message createMessage();
}
