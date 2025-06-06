package INSA.TD.views.entity;

import INSA.TD.controllers.ProduitController;
import INSA.TD.controllers.implementation.ProduitControllerImpl;
import INSA.TD.models.Produit;
import INSA.TD.views.entity.form.AbstractForm;
import INSA.TD.views.entity.form.ProduitForm;
import INSA.TD.views.entity.tableview.ProduitTableView;
import INSA.TD.views.label.TitleBox;
import javafx.scene.Node;
import javafx.scene.control.TableView;

public class ProduitView extends AbstractEntityView<Produit> {

    public ProduitView() {
        setTop(new TitleBox("Produits"));
    }

    @Override
    protected ProduitController getController() {
        return ProduitControllerImpl.getInstance();
    }

    @Override
    protected TableView<Produit> createTableView() {
        return new ProduitTableView(getData());
    }

    @Override
    protected AbstractForm<Produit> createAddForm() {
        return new ProduitForm(this::addValue);
    }

    @Override
    protected Node createSpecificNode() {
        return null;
    }
}
