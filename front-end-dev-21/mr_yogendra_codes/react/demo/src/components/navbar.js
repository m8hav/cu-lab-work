import {NavLink} from 'react-router-dom';
function Navbar(){
    return(
        <nav>
        <NavLink to='/users'>Users</NavLink>
        <NavLink to='/page1'>Page1</NavLink>
        <NavLink to='/page2'>Page2</NavLink>
        </nav>
    )
}

export default Navbar;