package strutsActionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.*;

public class LoginForm extends ActionForm{
	String nomUtilisateur;  
	String mdpUtilisateur;

	  public String getMdpUtilisateur() {
	    return mdpUtilisateur;
	  }

	  public void setMdpUtilisateur(String mdpUtilisateur) {
	    this.mdpUtilisateur = mdpUtilisateur;
	  }

	  public String getNomUtilisateur() {
	    return nomUtilisateur;
	  }

	  public void setNomUtilisateur(String nomUtilisateur) {
	    this.nomUtilisateur = nomUtilisateur;
	  }

	  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	    ActionErrors errors = new ActionErrors();
	    return errors;
	  }

	  public void reset(ActionMapping mapping, HttpServletRequest request) {
	    this.mdpUtilisateur = null;
	    this.nomUtilisateur = null;
	  }
}
