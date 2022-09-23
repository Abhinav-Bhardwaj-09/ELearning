import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'amazing-portfolio';
  notRouted = true;

  constructor(private router: Router) {}

  login() {
    this.notRouted = false;
    this.router.navigate(['/signin']);
  }

  register() {
    this.notRouted = false;
    this.router.navigate(['/register']);
  }
}
