import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SigninComponent } from './signin/signin.component';
import { RegisterComponent } from './register/register.component';

@NgModule({
  declarations: [AppComponent, SigninComponent, RegisterComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot([
      { path: 'signin', component: SigninComponent },
      { path: 'register', component: RegisterComponent },
      { path: '', pathMatch: 'full', component: AppComponent },
    ]),
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
