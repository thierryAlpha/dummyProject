<%-- 
    Document   : sortieTravailleur
    Created on : 14 janv. 2018, 01:43:05
    Author     : L512
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%-- Affichage de la chaine de message transmise par la servlet --%>
        
        <p class="info">${ message }</p>
        <p class="info">${ message }</p>
        
        travailleur.setNom(rs.getNString("nom"));
             travailleur.setPrenom(rs.getNString("prenom"));
             travailleur.setAdresse(rs.getNString("adresse"));
             travailleur.setDate(rs.getDate("date"));
             travailleur.setTelephonne(rs.getNString("telphonne"));
             travailleur.setDepartement(rs.getNString("departement"));        
             travailleur.setPoste(rs.getNString("poste"));        
             travailleur.setDebutContrat(rs.getDate("debutContrat"));        
             travailleur.setFinContrat(rs.getDate("finContrat")); 
             travailleur.setSalaire(rs.getDouble("salaire"));
             travailleur.setPrimeRation(rs.getDouble("primeRation"));
             travailleur.setPrimeVoyage(rs.getDouble("primeVoyage"));
             travailleur.setDateNaissance(rs.getDate("dateNaissance"));   
             travailleur.setMarie(rs.getBoolean("marie")); 
             travailleur.setCelibataire(rs.getBoolean("celibataire")); 
             travailleur.setEnfant(rs.getInt("enfant"));
             travailleur.setEmail(rs.getString("eMail"));
                
        <%-- Puis affichage des donnes transmises par la servlet --%>  
        <p>Nom               : ${ nom }</p>
        <p>Preom             : ${ prenom }</p>
        <p>Adresse           : ${ adresse }</p>
        <p>Date              : ${ date }</p>
        <p>Departement       : ${ departement }</p>
        <p>Debut du contrat  : ${ debutContrat }</p>
        <p>Fin du contrat    : ${ finContrat }</p>
        <p>Salaire           : ${ salaire }</p>
        <p>Prime ration      : ${ primeRaion }</p>
        <p>Prime de voyage   : ${ primeVoyage }</p>
        <p>Date de naissance : ${ dateNaissance }</p>
        <p>Marie             : ${ marie }</p>
        <p>Veuf              : ${ veuf }</p>
        <p>Celibataire       : ${ celibataire }</p>
        <p>Nombre d enfant   : ${ enfant }</p>
        <p>eMail             : ${ eMail }</p>
    </body>
</html>
