import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs/Observable";
import { map, tap } from "rxjs/operators";
import { Book } from "../common/book";

@Injectable()
export class BookService {
  private baseUrl: string = "http://localhost:8080/api/v1/books";

  constructor(private httpClient: HttpClient) {}

  getBooks(): Observable<Book[]> {
    return this.httpClient.get<GetResponseBooks>(this.baseUrl).pipe(
      tap(data => console.log(data)),
      map(res => res._embedded.books)
    );
  }
}

interface GetResponseBooks {
  _embedded: {
    books: Book[];
  };
}
