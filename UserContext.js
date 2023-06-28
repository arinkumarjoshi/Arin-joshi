import React, { createContext, useState, useEffect } from 'react';
const UserContext = createContext();
export const UserProvider = ({children}) => {
    const [users,setUsers] = useState(()=> {
        try {
            const storedUsers = localStorage.getItem('users');
            return storedUsers ? JSON.parse(storedUsers) : [];
          } catch (error) {
            console.error('Error parsing users data from local storage:', error);
            return [];
          }
    });
    const [isLoggedIn, setIsLoggedIn] = useState(false);
    const [loggedUser,setUser] = useState(null);
    
    useEffect(() => {
        localStorage.setItem('users', JSON.stringify(users));
      }, [users]);
    const registerUser = (username,password) => {
        if(users[username])
        {
            alert("Username already exists!.");
            console.log(users);
            return;
        }
        setUsers((prevUsers)=>({
            ...prevUsers,
            [username]: {password},
        }));
        console.log(users);
        alert("Registration Successful!");
    };
    const loginUser = (username, password) => {
        if(users[username] && users[username].password === password) {
            setIsLoggedIn(true);
            setUser(username);
            alert('Login successful');
            return true;
        }
        else
        {
            setIsLoggedIn(false);
            setUser(null);
            console.log(users);
            alert('Invalid Username or password');
            return false;
        }
    };
    const logoutUser = ()=> {
        setIsLoggedIn(false);
        setUser(null);
        alert('Signed Out');
    }
    const value={users,isLoggedIn,loggedUser,registerUser,loginUser,logoutUser};
    return (
        <UserContext.Provider value={value}>
            {children}
        </UserContext.Provider>
    );

};
export default UserContext;