import axios from "axios";
import React from "react";

const url ='http://localhost:8080'

export const sendSignIn = async(form:any) =>{
    return await axios.post(`${url}/v1/login`,{...form},{ withCredentials: true }
    )
  }

export const sendSignOut = async(form:any) =>{
    return await axios.post(`${url}/v1/logout`,{...form},{ withCredentials: true }
    )
  }

  export const sendSignUp = async(form:any) =>{
    return await axios.post(`${url}/v1/user`,{...form}
    )
  }