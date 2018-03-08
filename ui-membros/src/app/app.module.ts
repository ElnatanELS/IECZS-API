import { BrowserModule } from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { InputTextModule, InputMaskModule, CalendarModule, ButtonModule, KeyFilterModule, FileUploadModule } from "primeng/primeng";

import { AppComponent } from './app.component';
import { CadastroComponent } from './cadastro/cadastro.component';
import {  FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    CadastroComponent
  ],
  imports: [
    BrowserModule,
    InputTextModule,
    InputMaskModule,
    CalendarModule,
    ButtonModule,
    FormsModule,
    BrowserAnimationsModule,
    KeyFilterModule,
    FileUploadModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
