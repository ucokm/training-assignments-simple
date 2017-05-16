package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, NameFormat nameFormat, MessageFormat msgFormat, MailFont font) {
        // Format the email address
        String mId = nameFormat.getFirstName().charAt(0) + "." + nameFormat.getLastName().substring(0, 7) + "@"
            + nameFormat.getDivision().substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(font,
            msgFormat.getMessage1() + msgFormat.getMessage2() + msgFormat.getMessage3());
        // Send message
        m.send(mId, msgFormat.getSubject(), mMessage);
    }
    // end::buildAndSendMail[]

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    private class MailFont {

    }

    private class MailMessage {

    }

}