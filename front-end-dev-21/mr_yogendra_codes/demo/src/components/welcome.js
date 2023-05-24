import React from 'react';

class Welcome extends React.Component { 
    constructor(){
        super();
        this.state={
            name:"Amit"
        }     
    }

     clicked=()=>{
        this.setState({name:"Anil"});
    }

    updateH1 = event=>{
        this.setState({name:event.target.value})
    }

    render(){
        return(
            <div>   
                <input 
                    type="text"
                    value={this.state.name}
                    onChange={this.updateH1}
                />           
                <h1>{this.state.name} How are you?</h1>
                <button onClick={this.clicked}>Click me</button>
            </div>
        )
    }

}

export default Welcome;