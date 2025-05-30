package INSA.TD.views.entity;

import INSA.TD.controllers.OperateurController;
import INSA.TD.controllers.implementation.OperateurControllerImpl;
import INSA.TD.models.Operateur;
import INSA.TD.views.entity.form.AbstractForm;
import INSA.TD.views.entity.form.OperateurForm;
import INSA.TD.views.entity.tableview.OperateurTableView;
import INSA.TD.views.label.TitleBox;
import javafx.scene.Node;
import javafx.scene.control.TableView;

public class OperateurView extends AbstractEntityView<Operateur> {

    public OperateurView() {
        setTop(new TitleBox("Opérateurs"));
    }

    @Override
    protected OperateurController getController() {
        return OperateurControllerImpl.getInstance();
    }

    @Override
    protected TableView<Operateur> createTableView() {
        return new OperateurTableView(getData());
    }

    @Override
    protected AbstractForm<Operateur> createAddForm() {
        return new OperateurForm(this::addValue);
    }

    @Override
    protected Node createSpecificNode() {
        return null;
    }
}
