import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { UiModule } from './ui/ui.module';
import {SideBarComponent} from './side-bar/side-bar.component';
import { TableComponent } from './table/table.component';
import { PillComponent } from './pill/pill.component';
import { NavbarComponent } from './navbar/navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    SideBarComponent,
    TableComponent,
    PillComponent,
    NavbarComponent,
  ],
  imports: [
    BrowserModule,
    UiModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
