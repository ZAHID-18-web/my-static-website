// Fade in sections on page load
document.addEventListener('DOMContentLoaded', () => {
  const fadeEls = document.querySelectorAll('.fade-in');
  fadeEls.forEach(el => {
    el.style.opacity = 1;
  });
});
