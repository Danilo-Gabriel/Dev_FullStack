import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CursosComponent } from './cursos/cursos.component';
import { CursosFormComponent } from 'src/cursos/cursos-form/cursos-form.component';

const routes: Routes = [
  {path:'', component:CursosComponent},

  {path:'cursos/new', component:CursosFormComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CursosRoutingModule { }
