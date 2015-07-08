package Exception;

public final class FallingRobotException extends Exception {
  private static final long serialVersionUID = -6538065343211849432L;

  public FallingRobotException() {
    super("ロボットが転倒しました");
  }
}
