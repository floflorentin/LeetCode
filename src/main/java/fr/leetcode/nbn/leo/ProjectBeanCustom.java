package fr.leetcode.nbn.leo;

import lombok.Getter;
import lombok.Setter;
import org.json.JSONException;
import org.json.JSONObject;

import java.nio.file.AccessDeniedException;
import java.util.Date;


@Getter
@Setter
public class ProjectBeanCustom extends ProjectBean {

    private String etat;

    public ProjectBeanCustom(String titre, int numero, Date dateDebut, Date dateFin, String etat) {
        super(titre, numero, dateDebut, dateFin);
        this.etat = etat;
    }

    public ProjectBeanCustom(String titre, int numero, Date dateDebut, Date dateFin) {
        super(titre, numero, dateDebut, dateFin);
    }
}