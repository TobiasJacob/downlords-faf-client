package com.faforever.client.legacy.domain;

public class GameStatusMessage extends ClientMessage {

  public enum Status {
    ON("on"),
    OFF("off");
    private final String string;

    Status(String string) {
      this.string = string;
    }
  }

  private final String state;

  public GameStatusMessage(Status status) {
    setCommand("fa_state");
    state = status.string;
  }

  public String getState() {
    return state;
  }
}
