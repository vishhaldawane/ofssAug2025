import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class LoggerTest {
	public static void main(String[] args) {
		//x. content
		PhoneLog log1 = new PhoneLog("Seema","Dialed",LocalDateTime.of(2025, 2, 28,10,30));
		PhoneLog log2 = new PhoneLog("Rakesh","Missed",LocalDateTime.of(2025, 3, 28,20,25));
		PhoneLog log3 = new PhoneLog("Sweta","Recieved",LocalDateTime.of(2025, 5, 11,14,40));
		PhoneLog log4 = new PhoneLog("Sharayu","Dialed",LocalDateTime.of(2025, 6, 13,13,35));
		PhoneLog log5 = new PhoneLog("Sonali","Missed",LocalDateTime.of(2025, 2, 12,20,30));
		
		//y. container
		PhoneLogger phLogger = new PhoneLogger();
		phLogger.saveLog(log1);
		phLogger.saveLog(log2);
		phLogger.saveLog(log3);
		phLogger.saveLog(log4);
		phLogger.saveLog(log5);
		
		//i. Algorithm 
		for (int i = 0; i < phLogger.logger.size(); i++) {
			PhoneLog phone = phLogger.logger.get(i);
			System.out.println("Phone Log : "+phone);
		}
	}
}
class PhoneLogger
{
	ArrayList<PhoneLog> logger = new ArrayList<PhoneLog>();
	
	void saveLog(PhoneLog phoneLog) {
		logger.add(phoneLog);
	}
	
}
/**
 * 
 */
class PhoneLog
{
	String logMessage;
	String logType;
	LocalDateTime phoneTiming;

	public PhoneLog(String logMessage, String logType, LocalDateTime phoneTiming) {
		super();
		this.logMessage = logMessage;
		this.logType = logType;
		this.phoneTiming = phoneTiming;
	}
	public String getLogMessage() {
		return logMessage;
	}
	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}
	public String getLogType() {
		return logType;
	}
	public void setLogType(String logType) {
		this.logType = logType;
	}
	public LocalDateTime getPhoneTiming() {
		return phoneTiming;
	}
	public void setPhoneTiming(LocalDateTime phoneTiming) {
		this.phoneTiming = phoneTiming;
	}
	@Override
	public String toString() {
		return "PhoneLog [logMessage=" + logMessage + ", logType=" + logType + ", phoneTiming=" + phoneTiming + "]";
	}

}