const userGreeting = document.getElementById("user-greeting");
const BACKEND_URL = "http://localhost:4567";

function getCurrentUserId() {
  return localStorage.getItem("coopflixuser");
}

fetch(`${BACKEND_URL}/me`, {
  headers: {
    coopflixuser: getCurrentUserId()
  }
})
  .then(response => {
    if (!response.ok) {
      throw new Error("not logged in");
    } else {
      return response.json();
    }
  })
  .then(json => {
    userGreeting.innerHTML = `Hello ${json.name}. <a onclick="logout()" href="index.html">Logout</>`;
    loadFeed();
  })
  .catch(err => {
    userGreeting.innerHTML = '<a href="login.html">Click here to login.</a>';
  });

function loadFeed() {
  let feed = document.getElementById("feed");
  let userId = getCurrentUserId();

  fetch(`${BACKEND_URL}/user/${userId}/feed`, {
    headers: {
      coopflixuser: getCurrentUserId()
    }
  })
    .then(response => {
      if (!response.ok) {
        throw new Error("not logged in");
      } else {
        return response.json();
      }
    })
    .then(json => {
      let shelves = json.shelves;
      let shelvesHtml = shelves
        .map(shelf => {
          return `<div><span>${shelf.title}</span></div>`;
        })
        .reduce((s1, s2) => s1 + s2);

      feed.innerHTML = `<div>${shelvesHtml}</div>`;
    })
    .catch(err => {
      feed.innerHTML = "Error loading feed. Try refreshing the page.";
    });
}

function logout() {
  fetch(`${BACKEND_URL}/logout`, {
    method: "POST",
    headers: {
      coopflixuser: getCurrentUserId()
    }
  });
  return false;
}
