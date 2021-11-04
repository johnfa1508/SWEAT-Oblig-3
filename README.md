# Obligatorisk oppgave 3
Denne obligen er lagd av John Ferdie Abueg og Hanna Elisabeth Berg Johansen

Det vi har gjort for å gjennomføre oppgaven er:

Vi la først ut reposetoryet på github, siden vi brukte intellij, så er det å trykke på VCS og trykke på git og logge inn 
på github og ta det derifra.

Så la vi inn

testLogging {
events "passed", "skipped", "failed", "standardOut", "standardError"
}

Inn i build.gradle, siden vi bruker gradle for å lage dette programmet. testLogging er lagt inn i en test{}.

Deretter så gikk vi inn på Actions i github og la til en workflow. Og vi brukte Java with gradle for å gjennomføre slik 
at vi får til å kjøre alle testene i github og samtidig oppdatere testene.

Det som er endret i github-action-test.yml filen er under jobs så har vi puttet inn:

Name: Running tests

run: ./gradew test

Vi skrev inn dette på grunn av at vi ville bare vise testene.
