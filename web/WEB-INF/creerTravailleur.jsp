<%-- 
    Document   : Travailleur
    Created on : 11 janv. 2018, 17:48:57
    Author     : L512
--%>


<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Création d'un travailleur</title>
        <link type="text/css" rel="stylesheet" href="inc/style.css" />
    </head>
    <body>
        <div>
            <form method="get" action="creationTravailleur">
                <fieldset>
                    <legend>Informations client</legend>

                    <label for="nom">nom <span class="requis">*</span></label>
                    <input type="text" id="nom" name="nom" value="" size="20" maxlength="20" />
                    <br />
                    
                    <label for="prenom">Prénom </label>
                    <input type="text" id="prenom" name="prenom" value="" size="20" maxlength="20" />
                    <br />
    
                    <label for="adresse">adresse <span class="requis">*</span></label>
                    <input type="text" id="adresse" name="adresse" value="" size="40" maxlength="60" />
                    <br />
                    
                    <label for="telephone">Numéro de téléphone <span class="requis">*</span></label>
                    <input type="text" id="telephonne" name="telephone" value="" size="20" maxlength="20" />
                    <br /> 
    
                    <label for="departement">departement <span class="requis">*</span></label>
                    <input type="text" id="departement" name="departement" value="" size="30" maxlength="30" />
                    <br />
                    
                    <label for="poste">poste<span class="requis">*</span></label>
                    <input type="text" id="poste" name="poste" value="" size="30" maxlength="30" />
                    <br />
                    
                    <label for="debutContrat">debut du contrat<span class="requis">*</span></label></label>
                    <input type="debutContratl" id="debutContrat" name="debutContrat" value="" size="20" maxlength="20" />
                    <br />
                   
                    <label for="finContrat">fin du contrat <span class="requis">*</span></label>
                    <input type="text" id="finContrat" name="finContrat" value="" size="20" maxlength="20" />
                    <br />
                    
                    <label for="salaire">salaire <span class="requis">*</span></label> </label>
                    <input type="text" id="salaire" name="salaire" value="" size="20" maxlength="20" />
                    <br />
    
                    <label for="primeRation">ration <span class="requis">*</span></label>
                    <input type="text" id="primeRation" name="adresse" value="" size="20" maxlength="20" />
                    <br />
                    
                    <label for="primeVoyage">prime de voyage<span class="requis">*</span></label>
                    <input type="text" id="primeVoyage" name="telephone" value="" size="20" maxlength="20" />
                    <br /> 
    
                    <label for="dateNaissance">date de naissance <span class="requis">*</span></label>
                    <input type="text" id="dateNaissance" name="dateNaissance" value="" size="30" maxlength="30" />
                    <br />
                    
                    <label for="marie">marie<span class="requis">*</span></label>
                    <input type="text" id="marie" name="marie" value="" size="5" maxlength="5" />
                    <br />
                    
                    <label for="veuf">veuf</label>
                    <input type="veuf" id="veuf" name="veuf" value="" size="5" maxlength="5" /> 
                    
                    
                    <label for="celibataire">celibataire <span class="requis">*</span></label>
                    <input type="text" id="celibataire" name="celibataire" value="" size="5" maxlength="5" />
                    <br />
                    
                    <label for="enfant">enfant<span class="requis">*</span></label>
                    <input type="text" id="enfant" name="enfant" value="" size="5" maxlength="5" />
                    <br />
                    
                    <label for="eMail">eMail</label>
                    <input type="eMail" id="eMail" name="eMail" value="" size="30" maxlength="60" /> 
                    
                       String message;
        
                        if ( nom.trim().isEmpty() || adresse.trim().isEmpty() || telephone.trim().isEmpty() ||  
                             departement.trim().isEmpty() || poste.trim().isEmpty() || debutContrat.trim().isEmpty() ||  
                             finContrat.trim().isEmpty()  || salaire.trim().isEmpty() || primeRation.trim().isEmpty() || 
                             primeVoyage.trim().isEmpty() || dateNaissance.trim().isEmpty() || marie.trim().isEmpty() ||    
                             celibataire.trim().isEmpty() || enfant.trim().isEmpty() ) {
                                             
                             message =" Vous n'avez pas rempli tous les champs obligatoires.";
                            <br> <a href=\"creerClient.jsp\">Cliquez ici</a>                        
                        } else {  
                        
                          message = "Client cree avec succes";                
                        }
                </fieldset>
                <input type="submit" toSave ="true" action ="creer" categorie ="Travailleur" value="Valider"  />
                <input type="reset" value="Remettre à zéro" /> <br />
            </form>
        </div>
    </body>
</html>

