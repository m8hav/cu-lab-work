import React from "react";
import { useParams } from "react-router-dom";
import { useState } from "react";

export default function Home () {
    let []
    let { page } = useParams();
    return (
        <h1>{page ? page : "Home"} page text</h1>
    );
}