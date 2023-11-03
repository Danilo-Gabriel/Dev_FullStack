import { Component, OnInit } from '@angular/core';
import { catchError, Observable, of } from 'rxjs';

import { Curso } from '../model/curso';
import { CursosService } from '../services/cursos.service';
import { MatDialog } from '@angular/material/dialog';
import { ErrorDialogComponent } from 'src/shared/components/error-dialog/error-dialog.component';


@Component({
  selector: 'app-cursos',
  templateUrl: './cursos.component.html',
  styleUrls: ['./cursos.component.scss']
})
export class CursosComponent implements OnInit {


  cursos$:  Observable<Curso[]>;
  displayedColumns = ['nome', 'categoria'];




  constructor(private cursosService: CursosService, public dialog: MatDialog){


    this.cursos$= this.cursosService.list()
    .pipe(
      catchError(error => {
        this.onError('Error ao carregar')
        return of([])
      })
    );

  }



  onError(errorMsg: string)
   {
    this.dialog.open(ErrorDialogComponent, {
     data: errorMsg
    });
  }



  ngOnInit(): void {


  }
}
