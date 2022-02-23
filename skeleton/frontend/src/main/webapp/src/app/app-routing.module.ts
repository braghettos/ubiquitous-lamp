import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {MainComponent} from './main/main.component';
import {ComuniComponent} from './features/comuni/comuni.component';
import {DocumentiComponent} from './features/documenti/documenti.component';
import {NovitaComponent} from './features/novita/novita.component';
import {ServiziComponent} from './features/servizi/servizi.component';

const routes: Routes = [
  {path: 'comuni', component: ComuniComponent},
  {path: 'servizi', component: ServiziComponent},
  {path: 'novita', component: NovitaComponent},
  {path: 'documenti', component: DocumentiComponent},
  {path: '**', component: MainComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
