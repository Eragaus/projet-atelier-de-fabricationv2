package INSA.TD.services;

import INSA.TD.models.Gamme;

public interface GammeService extends Service<Gamme> {
    double calculerCout(Gamme gamme);

    double calculerDuree(Gamme gamme);
}
