import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { delay, first, tap } from 'rxjs';

import { Curso } from './../model/curso';




@Injectable({
  providedIn: 'root'
})
export class CursosService {


// private readonly API = '/assets/cursos.json';
//private readonly API = 'api/cursos';


  private readonly API = 'http://localhost:8080/api/cursos'

  constructor(public httpClient: HttpClient) {}



  list() {

    return this.httpClient.get<Curso[]>(this.API)
    .pipe(
      first(),
      delay(1000),
      tap(cursos => console.log(cursos))
    );


  }
}
