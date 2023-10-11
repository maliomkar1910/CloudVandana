
        function submitForm() {
            // Get form values
            document.getElementById("surveyForm").onsubmit=function(event){
            const firstName = document.getElementById("firstName").value;
            // if (!nameField.checkValidity()) {
            //     alert("Please enter your name.");
            //     event.preventDefault();
            // }
            const lastName = document.getElementById("lastName").value;
            const dob = document.getElementById("dob").value;
            const country = document.getElementById("country").value;
            const genderElements = document.getElementsByName("gender");
            const gender = [];
            genderElements.forEach((element) => {
                if (element.checked) {
                    gender.push(element.value);
                }
            });
            const profession = document.getElementById("profession").value;
            const email = document.getElementById("email").value;
            const mobile = document.getElementById("mobile").value;

            // Validation (you can add more validation logic here)

            // Display values in a popup
            const popupMessage = `First Name: ${firstName}\nLast Name: ${lastName}\nDate of Birth: ${dob}\nCountry: ${country}\nGender: ${gender.join(", ")}\nProfession: ${profession}\nEmail: ${email}\nMobile Number: ${mobile}`;

            alert(popupMessage);

            // Reset the form
            document.getElementById("surveyForm").reset();
        }
