package MAAZPACKAGE;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/maazBye")
public class maazclass2 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("""
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Maaz Bye</title>

                    <style>
                        * {
                            margin: 0;
                            padding: 0;
                            box-sizing: border-box;
                        }

                        body {
                            min-height: 100vh;
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            font-family: Inter, Arial, sans-serif;
                            color: #ffffff;
                            overflow: hidden;

                            background:
                                radial-gradient(circle at 85% 20%, rgba(239, 68, 68, 0.25), transparent 30%),
                                radial-gradient(circle at 15% 80%, rgba(168, 85, 247, 0.25), transparent 30%),
                                linear-gradient(135deg, #050816, #0f172a 50%, #020617);
                        }

                        body::before {
                            content: "";
                            position: absolute;
                            width: 500px;
                            height: 500px;
                            border-radius: 50%;
                            background: rgba(239, 68, 68, 0.12);
                            filter: blur(100px);
                            top: -200px;
                            right: -150px;
                            animation: float 8s ease-in-out infinite;
                        }

                        body::after {
                            content: "";
                            position: absolute;
                            width: 450px;
                            height: 450px;
                            border-radius: 50%;
                            background: rgba(168, 85, 247, 0.12);
                            filter: blur(100px);
                            bottom: -200px;
                            left: -150px;
                            animation: float 10s ease-in-out infinite reverse;
                        }

                        .container {
                            position: relative;
                            z-index: 2;
                            width: min(90%, 650px);
                            padding: 55px 45px;
                            text-align: center;

                            background: rgba(255, 255, 255, 0.07);
                            border: 1px solid rgba(255, 255, 255, 0.15);
                            border-radius: 30px;

                            backdrop-filter: blur(25px);
                            -webkit-backdrop-filter: blur(25px);

                            box-shadow:
                                0 30px 80px rgba(0, 0, 0, 0.45),
                                inset 0 1px 0 rgba(255, 255, 255, 0.15);

                            animation: appear 0.8s ease-out;
                        }

                        .badge {
                            display: inline-block;
                            padding: 8px 16px;
                            margin-bottom: 25px;

                            font-size: 13px;
                            font-weight: 600;
                            letter-spacing: 1px;
                            text-transform: uppercase;

                            color: #fecaca;
                            background: rgba(239, 68, 68, 0.10);
                            border: 1px solid rgba(239, 68, 68, 0.30);
                            border-radius: 50px;

                            box-shadow: 0 0 25px rgba(239, 68, 68, 0.12);
                        }

                        h1 {
                            font-size: clamp(42px, 8vw, 72px);
                            font-weight: 800;
                            letter-spacing: -3px;
                            margin-bottom: 18px;

                            background: linear-gradient(
                                90deg,
                                #ffffff,
                                #fecaca,
                                #f87171,
                                #ffffff
                            );

                            background-size: 300% auto;
                            -webkit-background-clip: text;
                            -webkit-text-fill-color: transparent;

                            animation: gradient 5s linear infinite;
                        }

                        .divider {
                            width: 80px;
                            height: 4px;
                            margin: 0 auto 35px;

                            border-radius: 10px;

                            background: linear-gradient(
                                90deg,
                                #ef4444,
                                #f97316
                            );

                            box-shadow: 0 0 25px rgba(239, 68, 68, 0.6);
                        }

                        .subtitle {
                            max-width: 470px;
                            margin: 0 auto 35px;

                            color: #cbd5e1;
                            font-size: 17px;
                            line-height: 1.7;
                        }

                        .button {
                            position: relative;
                            display: inline-flex;
                            align-items: center;
                            justify-content: center;
                            gap: 12px;

                            padding: 16px 30px;

                            color: #ffffff;
                            text-decoration: none;
                            font-size: 16px;
                            font-weight: 700;

                            background: linear-gradient(
                                135deg,
                                #ef4444,
                                #f97316,
                                #e11d48
                            );

                            border: 1px solid rgba(255, 255, 255, 0.2);
                            border-radius: 14px;

                            box-shadow:
                                0 10px 30px rgba(239, 68, 68, 0.30),
                                inset 0 1px 0 rgba(255, 255, 255, 0.25);

                            overflow: hidden;

                            transition:
                                transform 0.3s ease,
                                box-shadow 0.3s ease;
                        }

                        .button::before {
                            content: "";
                            position: absolute;
                            top: 0;
                            left: -100%;
                            width: 100%;
                            height: 100%;

                            background: linear-gradient(
                                90deg,
                                transparent,
                                rgba(255, 255, 255, 0.35),
                                transparent
                            );

                            transition: left 0.6s ease;
                        }

                        .button:hover::before {
                            left: 100%;
                        }

                        .button:hover {
                            transform: translateY(-4px) scale(1.03);

                            box-shadow:
                                0 18px 45px rgba(239, 68, 68, 0.45),
                                0 0 30px rgba(249, 115, 22, 0.20);
                        }

                        .button:active {
                            transform: translateY(-1px) scale(0.98);
                        }

                        .arrow {
                            font-size: 20px;
                            transition: transform 0.3s ease;
                        }

                        .button:hover .arrow {
                            transform: translateX(-5px);
                        }

                        .footer {
                            margin-top: 35px;
                            color: #64748b;
                            font-size: 12px;
                            letter-spacing: 0.5px;
                        }

                        @keyframes appear {
                            from {
                                opacity: 0;
                                transform: translateY(30px) scale(0.96);
                            }

                            to {
                                opacity: 1;
                                transform: translateY(0) scale(1);
                            }
                        }

                        @keyframes gradient {
                            0% {
                                background-position: 0% center;
                            }

                            100% {
                                background-position: 300% center;
                            }
                        }

                        @keyframes float {
                            0%, 100% {
                                transform: translate(0, 0);
                            }

                            50% {
                                transform: translate(40px, 30px);
                            }
                        }

                        @media (max-width: 600px) {
                            .container {
                                padding: 40px 25px;
                                border-radius: 24px;
                            }

                            h1 {
                                letter-spacing: -2px;
                            }

                            .subtitle {
                                font-size: 15px;
                            }

                            .button {
                                width: 100%;
                            }
                        }
                    </style>
                </head>

                <body>

                    <div class="container">

                        <div class="badge">
                            Servlet • Java • Tomcat
                        </div>

                        <h1>Bye Dear!</h1>

                        <div class="divider"></div>

                        <p class="subtitle">
                            You have reached the second Servlet.
                            This page is dynamically generated using
                            Jakarta Servlet and Apache Tomcat.
                        </p>

                        <a class="button" href="/MAAZ_FIRST_JAVA_BACKEND/maazHello">
                            <span class="arrow">←</span>
                            Go Back
                        </a>

                        <div class="footer">
                            Powered by Java Servlet Technology
                        </div>

                    </div>

                </body>
                </html>
                """);
    }
}