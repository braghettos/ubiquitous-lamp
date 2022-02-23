import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {HeaderComponent} from './header/header.component';
import {FooterComponent} from './footer/footer.component';
import {FontAwesomeModule} from '@fortawesome/angular-fontawesome';
import {MainComponent} from './main/main.component';
import {ComuniComponent} from './features/comuni/comuni.component';
import {ServiziComponent} from './features/servizi/servizi.component';
import {NovitaComponent} from './features/novita/novita.component';
import {DocumentiComponent} from './features/documenti/documenti.component';
import {EvidenzaComponent} from './features/commons/evidenza/evidenza.component';
import {FiltriComponent} from './features/commons/filtri/filtri.component';
import {ArgomentiComponent} from './features/commons/argomenti/argomenti.component';
import {NavbarComponent} from './header/navbar/navbar.component';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    MainComponent,
    ComuniComponent,
    ServiziComponent,
    NovitaComponent,
    DocumentiComponent,
    EvidenzaComponent,
    FiltriComponent,
    ArgomentiComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    NgbModule,
    FontAwesomeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
