package eu.sig.training.ch05.buildandsendmail;

public class MessageFormat {
	private String subject;
	private String message1;
	private String message2;
	private String message3;

	public MessageFormat(String subject, String message1, String message2,
			String message3) {
		this.subject = subject;
		this.message1 = message1;
		this.message2 = message2;
		this.message3 = message3;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public String getMessage3() {
		return message3;
	}

	public void setMessage3(String message3) {
		this.message3 = message3;
	}
}