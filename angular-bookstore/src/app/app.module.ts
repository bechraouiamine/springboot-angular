import { HttpClientModule } from "@angular/common/http";
import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { RouterModule, Routes } from "@angular/router";
import { AppComponent } from "./app.component";
import { PageNotFoundComponent } from "./componenets/page-not-found/page-not-found.component";
import { BookListComponent } from "./components/book-list/book-list.component";
import { BookService } from "./services/book.service";

const routes: Routes = [
  { path: "books", component: BookListComponent },
  { path: "category/:id", component: BookListComponent },
  { path: "", redirectTo: "/books", pathMatch: "full" },
  { path: "**", component: PageNotFoundComponent }
];

@NgModule({
  imports: [BrowserModule, HttpClientModule, RouterModule.forRoot(routes)],
  declarations: [AppComponent, BookListComponent, PageNotFoundComponent],
  providers: [BookService],
  bootstrap: [AppComponent]
})
export class AppModule {}
