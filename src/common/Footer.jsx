const Footer = () => {
  return (
    <footer className="footer">
      <div className="footer-content">
        <p>© 2025 TaskManager App. All rights reserved</p>
        <div className="footer-links">
          <a className="footer-link" href="/terms">Terms of Service</a>
          <span> | </span>
          <a className="footer-link" href="/privacy">Privacy Policy</a>
          <span> | </span>
          <a className="footer-link" href="/contact">Contact Us</a>
        </div>
      </div>
    </footer>
  );
};

export default Footer;