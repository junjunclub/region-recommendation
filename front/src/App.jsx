import { useState } from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import LandingPage from "./components/LandingPage";
import LoginForm from "./components/LoginForm";
import RegisterForm from "./components/RegisterForm";
import Header from "./components/Header";
import Region from "./components/Region";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  // const [isRegistering, setIsRegistering] = useState(false);

  const toggleLoginStatus = () => setIsLoggedIn((prev) => !prev);
  // const handleRegister = () => setIsRegistering(prev => !prev);

  return (
    <>
      <Header onLoginClick={toggleLoginStatus} isLoggedIn={isLoggedIn} />

      <Router>
        <Routes>
          <Route exact path="/" element={<LandingPage isLoggedIn={isLoggedIn} />} />
          <Route path="/account/login" element={<LoginForm toggleLoginStatus={toggleLoginStatus} />} />
          <Route path="/account/signup" element={<RegisterForm />} />
          <Route path="/region" element={<Region />} />
        </Routes>
      </Router>
    </>
  );
}

export default App;
