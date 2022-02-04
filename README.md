Deze opdracht is individueel gemaakt.

Dit program heeft 3 functies. Bij de eerste kan er gebruik gemaakt worden van een rekenmachine. 
De tweede kan controleren of een getal in de eerste 7 cijfers van pi zit. 
De derde kan controleren of een getal in de eerste 5 cijfers van de fibonnacci-code zit. 
Om gebruik te maken van de functies kunnen de instructies van de console worden gevolgd.

Strategy patterns:

Voor de pi-functie is een adapter pattern design toegepast. 
Hierbij zorgt de adapter ervoor dat de string die wordt ingevoerd door de gebruiker, wordt omgezet in een boolean.
De volgende files zijn hierbij betrokken: P_Adapter en piAdapter

Voor de rekenmachine is een strategy pattern design toegepast. 
Deze is te vinden in de calculator map. Het rekenmachine maakt 4 soorten berekeningen. 
Voor elke berekening is een concreteStrategy aangemaakt.

Voor de fibonacci-functie is een adapter pattern design toegepast. 
Hierbij zorgt de adapter ervoor dat de string die wordt ingevoerd door de gebruiker, wordt omgezet in een boolean. 
De volgende files zijn hierbij betrokken: F_Adapter en fibonacciAdapter

github-repo: https://github.com/huge0003/program_sde.git

