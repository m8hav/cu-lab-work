import { useParams } from "react-router-dom";
function Users(){
    var {userId} = useParams();

    return(
        <h1>Users{userId} is called</h1>
    )
}

export default Users;