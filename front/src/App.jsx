import { useState } from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import LandingPage from "./components/LandingPage";
import LoginForm from "./components/LoginForm";
import RegisterForm from "./components/RegisterForm";
import Header from "./components/Header";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  // const [isRegistering, setIsRegistering] = useState(false);

  const handleLogin = () => setIsLoggedIn((prev) => !prev);
  // const handleRegister = () => setIsRegistering(prev => !prev);

  return (
    <>
      <Header onLoginClick={handleLogin} isLoggedIn={isLoggedIn} />
      <LandingPage isLoggedIn={isLoggedIn} />

      <Router>
        <Routes>
          <Route exact path="/" element={<LandingPage />} />
          <Route path="/login" element={<LoginForm />} />
          <Route path="/register" element={<RegisterForm />} />
        </Routes>
      </Router>
    </>
  );
}

export default App;
