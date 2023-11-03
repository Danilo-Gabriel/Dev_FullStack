import { CursosModule } from '../cursos/cursos.module';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CursosComponent } from 'src/cursos/cursos/cursos.component';

const routes: Routes = [


  { path: '', pathMatch: 'full', redirectTo: 'cursos'}
  ,
  {
    path: 'cursos',
    loadChildren: () => import('../cursos/cursos.module').then(m => m.CursosModule)
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
