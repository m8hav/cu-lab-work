import './App.css';
import {Home} from './pages/Home';
import {About} from './pages/About';
import { BookList } from './pages/BookList';
import { Book } from './pages/Book';
import { NewBook } from './pages/NewBook';
import { BooksLayout } from './BooksLayout';
import {Link,Route, Routes} from 'react-router-dom';


function App() {

      return (
        <>
            <nav>
                <ul>
                    <li>
                        <Link to='/'>HOME</Link>
                    </li>
                    <li>
                        <Link to='/about'>ABOUT</Link>
                    </li>
                    <li>
                        <Link to='/books'>BOOKLIST</Link>
                    </li>


                </ul>
            </nav>

            <Routes>
                <Route path = '/'   element={<Home/>}/>
                <Route path = '/about'   element={<About/>}/>
                <Route path='/books' element={<BooksLayout/>}>
                    <Route index  element={<BookList/>}/>
                    <Route path=':id' element={<Book/>}/>
                    <Route path= 'new' element={<NewBook/>}/>
                </Route>
            </Routes>
         </>
     )
}

export default App;
