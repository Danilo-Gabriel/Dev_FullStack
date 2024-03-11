import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { AppMaterialModule } from 'src/shared/app-material/app-material.module';
import { SharedModule } from 'src/shared/shared.module';

import { CursosRoutingModule } from './cursos-routing.module';
import { CursosComponent } from './cursos/cursos.component';
import { CursosListComponent } from './cursos-list/cursos-list.component';





@NgModule({
  declarations: [
    CursosComponent,
    CursosListComponent
  ],
  imports: [
    CommonModule,
    CursosRoutingModule,
    AppMaterialModule,
    SharedModule



  ]
})
export class CursosModule { }
