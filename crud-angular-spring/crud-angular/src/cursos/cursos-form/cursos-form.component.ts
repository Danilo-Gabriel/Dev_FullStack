import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { CursosService } from '../services/cursos.service';
import {Location} from '@angular/common'

@Component({
  selector: 'app-cursos-form',
  templateUrl: './cursos-form.component.html',
  styleUrls: ['./cursos-form.component.scss']
})
export class CursosFormComponent implements OnInit {

  form : FormGroup;

  constructor(
    private formBuilder : FormBuilder,
    private service : CursosService,
    private location : Location  ){


      this.form = this.formBuilder.group({
        nome: [null],
        categoria : [null]
      })

    }


    onSubmit(){

      debugger
      console.log(this.form.value)
      this.service.save(this.form.value)
      .subscribe(result => this.onCancel(),
      error => {
        console.log(error); //{duretion:5000})
      })
    }
    onCancel(){
      this.location.back(); //mudei no import import {Location} from '@angular/common'
    }



  ngOnInit(): void {

  }

}
