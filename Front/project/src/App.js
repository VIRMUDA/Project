import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Detail from 'routers/Detail'; // 파일 경로를 확인하세요

function App() {
  return (
    <Router>
      <div>
        <h1 className="text-red-800 font-[godob]">App</h1>
        <Routes>
          <Route path="/detail" element={<Detail />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
