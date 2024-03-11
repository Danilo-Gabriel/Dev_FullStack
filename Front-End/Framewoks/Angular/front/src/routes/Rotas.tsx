import React from 'react';
import {Routes, Route} from 'react-router-dom';
import Login from '../pages/login/Login';
import Home from '../pages/dashbord/Home'; 


function AppRoutes () {
    return (

        <Routes>
        <Route path="/pages/home" element={<Home/>}/>
        <Route path="/pages/login" element={<Login/>}/>
      </Routes>
    );
}

export default AppRoutes;