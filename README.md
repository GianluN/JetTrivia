# JetTriviaApp

`JetTriviaApp` è un'applicazione Android sviluppata con Jetpack Compose che offre un gioco di trivia interattivo. Le domande e le risposte, compresa quella esatta, vengono caricate da un file JSON, rendendo facile aggiornare e modificare il set di domande. Durante il gioco, gli utenti possono visualizzare il numero di risposte esatte ottenute.

## Funzionalità

- **Caricamento dinamico delle domande**: Le domande e le risposte vengono caricate da un file JSON.
- **Feedback immediato**: Dopo ogni risposta, l'app mostra se la risposta selezionata è corretta o meno.
- **Conteggio delle risposte corrette**: L'app tiene traccia del numero di risposte corrette durante una sessione di gioco.
- **Interfaccia utente intuitiva**: Realizzata con Jetpack Compose, l'interfaccia è moderna e fluida.

## Tecnologie Utilizzate

- **Kotlin**: Linguaggio di programmazione.
- **Jetpack Compose**: Toolkit moderno per la costruzione di interfacce utente.
- **JSON**: Formato utilizzato per la gestione delle domande e delle risposte.

## Struttura del File JSON

Il file json contiene un array di oggetti, ciascuno rappresentante una domanda con le relative risposte e l'indicazione della risposta esatta. Ecco un esempio di come potrebbe essere strutturato:

```json
[
  {
    "question": "Qual è la capitale dell'Italia?",
    "options": ["Milano", "Roma", "Napoli", "Torino"],
    "correctAnswer": "Roma"
  },
  {
    "question": "Chi ha scritto 'Il Piccolo Principe'?",
    "options": ["J.K. Rowling", "Mark Twain", "Antoine de Saint-Exupéry", "Ernest Hemingway"],
    "correctAnswer": "Antoine de Saint-Exupéry"
  }
]
```

## Contribuire
Sei interessato a migliorare JetTriviaApp? Le tue contribuzioni sono benvenute! Ecco come puoi farlo:

- Forka il progetto.
- Crea il tuo Branch (git checkout -b feature/AmazingFeature).
- Effettua le tue modifiche e commitale (git commit -m 'Add some AmazingFeature').
- Pusha il Branch (git push origin feature/AmazingFeature).
- Apri una Pull Request.
