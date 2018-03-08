import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  adicionar(frm: FormControl) {
    console.log(frm.value);
    // this.itemService.adicionar(frm.value).subscribe(() => {
    //   frm.reset();
    //   this.consultar();
    // });
  }

}
