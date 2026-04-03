import React from 'react';

function Resume() {
  return (
    <div className="container">
      <pre>
      Assignment 12:
      Rebuild any previous plain HTML lab assignment using React.
      </pre>

      <h1>Komal Ghodke</h1>
      <a href="https://www.linkedin.com/in/komalghodke99/" class="me-3">LinkedIn</a> |
      <a href="https://github.com/komalghodke">GitHub</a> |
      <a href="https://komalghodke.github.io/">Portfolio</a>

      <h2>About Me</h2>
      <p>
        I’m a full-stack developer with 3+ years of experience in enterprise software and freelance consulting.
        My work blends robust engineering with thoughtful design—delivering secure, scalable platforms for service-based businesses.
      </p>

      <h2>Professional Experience</h2>
      <ul>
        <li><strong>Freelance Developer:</strong> Built a wellness platform with ReactJS, Spring Boot, AWS, SEO optimization.</li>
        <li><strong>Persistent Systems:</strong> Delivered 50+ Java connectors, integrated AWS SDK & Microsoft Graph APIs.</li>
      </ul>

      <h2>Technical Highlights</h2>
      <ul>
        <li>Java, Spring Boot, Microservices, REST APIs, ReactJS, Redux</li>
        <li>AWS (EC2, S3, CloudWatch, IAM), OAuth2, JWT</li>
        <li>JUnit, Mockito, CI/CD, Git, Jenkins</li>
      </ul>

      <h2>Education</h2>
      <table border="1" cellPadding="5">
        <thead>
          <tr><th>Qualification</th><th>Institution</th><th>Year</th><th>Grade</th></tr>
        </thead>
        <tbody>
          <tr><td>Bachelor of Computer Engineering</td><td>SPPU</td><td>2021</td><td>9.34 CGPA</td></tr>
          <tr><td>Diploma</td><td>GPP Pune</td><td>2018</td><td>76.67%</td></tr>
        </tbody>
      </table>

      <h2>Hobbies</h2>
      <p>Singing, Music, Traveling, Photography, Playing Badminton</p>

      <h2>Project</h2>
      <p><strong>Title:</strong> Wellness Platform</p>
      <p><strong>Technologies:</strong> Java, AWS, Spring Boot, ReactJS, HTML, CSS, Microservices</p>
      <p><strong>Description:</strong> Delivered a multilingual wellness platform with secure backend and legal compliance integration.</p>
    </div>
  );
}

export default Resume;