import React from 'react';

class CQ extends React.Component{

    render(){
        if(this.props.role === 'admin')
        {return(
                 <h1> Welcome admin {this.props.name} to First class component</h1>
        )}
        else if(this.props.role === 'Faculty')
        {return(
            <h1> Welcome Faculty {this.props.name} to First class component</h1>
        )}
        else
        {return(
            <h1> Welcome student {this.props.name} to First class component</h1>
        )}
        
   
    }
}

export default CQ;