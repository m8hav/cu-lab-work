import { Link,Outlet } from "react-router-dom";

export function BooksLayout(){

    return(

      <>
      
      <Link to="/books/1">BOOK 1</Link>
      <br/>
      <Link to="/books/2">BOOK 2</Link>
      <br/>
      <Link to="/books/3">BOOK 3</Link> 
      <br/>
      <Link to="/books/new">New Book</Link>
      <Outlet/>
      
      
      
      
      
      
      </>



    )
}