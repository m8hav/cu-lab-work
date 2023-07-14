import { useParams } from "react-router-dom";
function UserDetails(){
 var {userId} = useParams();
    return(
        <h1>User {userId}  Details displayed</h1>
    )
}

export default UserDetails;