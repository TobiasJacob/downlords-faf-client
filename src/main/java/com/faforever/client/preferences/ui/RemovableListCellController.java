package com.faforever.client.preferences.ui;

import com.faforever.client.fx.Controller;
import com.faforever.client.fx.NodeListCell;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class RemovableListCellController implements Controller<Pane> {

  public Pane removableCellRoot;
  public Label label;

  public void onRemoveButtonClicked() {
    Parent parent = removableCellRoot.getParent();
    NodeListCell<?> cell = (NodeListCell<?>) parent;
    ListView<?> listView = cell.getListView();
    listView.getItems().remove(cell.getItem());
  }

  @Override
  public Pane getRoot() {
    return removableCellRoot;
  }

  public void setChannel(String channel) {
    label.setText(channel);
  }
}
