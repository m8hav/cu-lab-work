import React from "react";
import { useParams } from "react-router-dom";
import { useState } from "react";
import Clock from "./Clock";

export default function Home () {
    const [ page_call_count, set_page_call_count ] = useState(0);
    let { page } = useParams();
    return (
        <div id="right-part">
            <Clock />
            <h1 >{page ? page : "Home"} page text</h1>
        </div>
    );
}