package loggers;

public class DatabaseLogger implements ILogger{
	
	@Override
	public void log(String data) {
		System.out.println("Database logged with " + data);
		
	}

}
