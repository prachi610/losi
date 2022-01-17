<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>

<body>
    <div class="container">
        <div class="card">
            <div class="inner-box" id="card">
                <div class="card-front">
                    <h2>LOGIN</h2>
                    <form action="Login">
                        <input type="email" class="input-box" placeholder="Email" name="email" required>
                        <input type="password" class="input-box" placeholder="Password" name="password" required>
                        <button type="submit" class="submit-btn">Submit</button>
                    </form>
                    <button type="button" class="btn" onclick="openRegister()">I'm New Here</button>
                    <a href="">Forgot Password</a>
                </div>
                <div class="card-back">
                    <h2>REGISTER</h2>
                    <form action="Register">
                        <input type="email" class="input-box" placeholder="Email ID" name="email" required>
                        <input type="text" class="input-box" placeholder="Your Name" name="name" required>
                        <input type="password" class="input-box" placeholder="Password" name="password" required>
                        <button type="submit" class="submit-btn">Submit</button>
                    </form>
                    <button type="button" class="btn" onclick="openLogin()">I've an account</button>
                    <a href="">Forgot Password</a>

                </div>
            </div>
        </div>
    </div>
    <script src="script.js">
    </script>
</body>

</html>