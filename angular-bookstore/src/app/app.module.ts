import { HttpClientModule } from "@angular/common/http";
import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { BookListComponent } from "./components/book-list/book-list.component";
import { BookService } from "./services/book.service";

@NgModule({
  imports: [BrowserModule, HttpClientModule],
  declarations: [AppComponent, BookListComponent],
  providers: [BookService],
  bootstrap: [AppComponent]
})
export class AppModule {}
