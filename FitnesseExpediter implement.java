public class FitnesseExpediter implements ResponseSender {

private Socket socket; private InputStream input; private OutputStream output; 
private Request request;

private Response response;

private FitNesseContext context;

protected long requestParsingTimeLimit;

private long requestProgress;

private long requestParsingDeadLine;

private boolean hasError;

...

}
