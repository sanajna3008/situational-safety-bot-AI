function getResponse() {
  const input = document.getElementById("user-input").value.toLowerCase();
  const outputDiv = document.getElementById("output");
  let response = "";

  if (input.includes("fire")) {
    response = "🔥 Stay calm! Evacuate immediately and call 101 for help.";
  } 
  else if (input.includes("earthquake")) {
    response = "🌍 Drop, cover, and hold on! Stay away from windows and heavy objects.";
  } 
  else if (input.includes("stranger")) {
    response = "🚨 Stay alert! Avoid talking to strangers and move to a safe area.";
  } 
  else if (input.includes("online safety")) {
    response = "💻 Never share personal info online or click suspicious links.";
  } 
  else if (input.includes("help")) {
    response = "🆘 You can ask about safety during fire, earthquake, stranger danger, or online safety.";
  } 
  else {
    response = "❓ I'm not sure about that. Please ask about fire, earthquake, stranger, or online safety.";
  }

  // ✅ Display user's question
  const userMsg = `<div class="user-msg">You: ${input}</div>`;

  // ✅ Display bot's response
  const botMsg = `<div class="bot-msg">Bot: ${response}</div>`;

  // ✅ Append both to the chat box
  outputDiv.innerHTML += userMsg + botMsg;

  // ✅ Clear input box after sending
  document.getElementById("user-input").value = "";

  // ✅ Auto scroll to bottom
  outputDiv.scrollTop = outputDiv.scrollHeight;
}
