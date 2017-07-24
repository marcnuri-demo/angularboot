import { Component } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app works!';
  result = '';

  constructor(private http: Http){
  }

  private sayHello(): void {
    this.result = 'loading...';
    this.http.get(`/api/hello-world`).subscribe(response => this.result = response.text());
  }

}
