package Exception;

public final class LineNotFoundException extends Exception
{
    private static final long serialVersionUID = 3951697651372851906L;

    public LineNotFoundException()
    {
        super("Lineを検出することが出来ません");
    }
}
