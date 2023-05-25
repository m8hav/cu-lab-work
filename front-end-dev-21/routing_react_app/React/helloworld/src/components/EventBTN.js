import React from 'react';
import Btn from './Btn'

class EventBtn extends React.Component{
    click(){
        alert("Button click event");
    }

    render(){
           return  <Btn/>;
    }
}

export default EventBtn;