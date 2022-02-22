# Artemis_Financial_Security_Report

Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

  Artemis Financial is a financial consulting company that develops individualized financial plans for savings, retirement, investments, and insurance for their patrons. As an important step in Artemis Financial’s desire to modernize its operations and as a crucial part of the success of their custom software, they want to implement and apply the most current and effective software security. Artemis Financial has a public web interface and is seeking expertise in taking steps to protect their client data and financial information.

What did you do particularly well in identifying their software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

  The process of using the dependency check with the Maven plug in to find vulnerabilities imported into e project was great it helped in finding dependencies that can be attacked and how to fix them. This is what software security does it allows you to find weak points before the enemy does and in turn lets yout secure your software against them. This helps the company retain their data and in turn maintain the trust of the clients who use their products.

What about the process of working through the vulnerability assessment did you find challenging or helpful?

  The most helpful part of the vulnerability assessment was the static testing it presented issues with the dependencies of the project that normaly one would not know about. And the vulnerabilities found have solutions sometimes and can be fixed and all this information is in one html report which is convenienct.

How did you approach the need to increase layers of security? What techniques or strategies would you use in the future to assess vulnerabilities and determine mitigation techniques?

  To increase the security of Artemis's product I incorporated an algorithm cipher using AES 256 to secure the message of the product. In the future I would use other ciphers such as Tripler DES or Blowfish which both encrypt the data in different ways.

How did you ensure the code and software application were functional and secure? After refactoring code, how did you check to see whether you introduced new vulnerabilities?
What resources, tools, or coding practices did you employ that you might find helpful in future assignments or tasks?

  To ensure that the application was secure I made sure that the certificate and key were trusted by the local computer which in turn made it HTTPS instead of HTTP. When making a website publicly you would need to get a certificate that is not self signed so that it is trusted by all computers that access the sight. After making these changes I manually checked the code and ran a secondary static test to make sure that the changes did not introduce any new vulnerabilities. While creating the certificates and keys to incorporate with the code I used Mac terminal and Mac key manager which made the process much easier than I imagine it would have been in windows.

Employers sometimes ask for examples of work that you have successfully completed to demonstrate your skills, knowledge, and experience. What from this particular assignment might you want to showcase to a future employer?

I would showcase the cypher and the algorithm along with the creation of the certificate and the keys to show that I can make a website secure and encrypt the files that are transmitted.
