import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private http: HttpClient) {}

  trame: any = {
    action: "",
    numchambre: "",
    cod_resid: "",
    nom_resid: "",
    date_arrive: "",
    date_depart: "",
    code_user: "",
    nom_user: "",
    type: "",
    AsiCard: "",
    serv: "",
    Path: "",
  };
  sendTrame() {
    this.http.post('http://localhost:8080/envoyer_trame', this.trame)
      .subscribe(response => {
        console.log('Trame envoyée avec succès', response);
      }, error => {
        console.error('Erreur lors de l\'envoi de la trame', error);
      });
  }
}
