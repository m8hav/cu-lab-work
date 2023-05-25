export function Login(){

     function handleSubmit(e){
        e.preventDefault();
        alert("form Submitted");
     }

     return (
                 <form onSubmit={handleSubmit} action='' method='get'>
                    Username: <input type='text' name='Username' />
                    Password: <input type='password' name='Password' />
                    <input type='submit' name='Submit'/>
                 </form>
    )
   
}