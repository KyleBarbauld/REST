import java.net.*;
import java.io.*;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;

public class RestClient
{
	public static void main(String[] args)
	{
		try
		{
			// setup BaseURL - Make sure a path is this way, the main base is resources
			// and after that is you select you want
			String baseUrl = "http://simon.ist.rit.edu:8080/BeerService/resources/Services/";

			//String rectangleResoruce = "Beers/Costliest";

			String cheapestResource = "Beers/Cheapest";

			//String helloNameResource = "Beer/Bud";
         
			String costliestResource = "Beers/Costliest";

			String beersResource = "Beers";    
         
			String getResource = "Beer/Bud";
         String getResource6 = "Beer/Genesee";
         String getResource1 = "Beer/Corona";
         String getResource2 = "Beer/Labatt";
         String getResource3 = "Beer/Guinness%20Draught";
         String getResource4 = "Beer/Coors";
         String getResource5 = "Beer/Sam%20Adams";


			// Open URL - connect it
			// Circle Resource
			// URL url = new URL(baseUrl + circleResource);
         System.out.println("Welcome to Kyle Barbauld's Beer Store. ");
			// RectangleResource
			// URL url = new URL(baseUrl + rectangleResoruce);
///////////////////////////////////////////////////////////////////////////////////////
			// Hello Resrouce
			URL url = new URL(baseUrl + beersResource);


			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// Make sure requestMethod must be matched "GET"
			con.setRequestMethod("GET");


			// Once everything is done, declare the connection.
			con.connect();

			// InputStream, Read everything from URL
			InputStream in = con.getInputStream();

			// Process the input
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			System.out.println(br.readLine());

			// Clean up, close everything else.
			in.close();
			con.disconnect();
/////////////////////////////////////////////////////////////////////////////////////////
			// use Http client
			HttpClient client = new HttpClient();
			GetMethod method = new GetMethod(baseUrl + cheapestResource);
			// GetMethod method = new GetMethod(baseUrl + rectangleResoruce);

			// send get request
			int statusCode = client.executeMethod(method);
			if (statusCode != HttpStatus.SC_OK)
			{
				System.err.println("Method failed: " + method.getStatusLine());
			}

			InputStream rstream = null;
			rstream = method.getResponseBodyAsStream();

			// process the response
			br = new BufferedReader(new InputStreamReader(rstream));
			String line;

			while ((line = br.readLine()) != null)
			{
				System.out.println("The cheapest beer is "+line);
			}

			br.close();
         
/////////////////////////////////////////////////////////////////////////////

			 client = new HttpClient();
			 method = new GetMethod(baseUrl + costliestResource);
			// GetMethod method = new GetMethod(baseUrl + rectangleResoruce);

			// send get request
			 statusCode = client.executeMethod(method);
			if (statusCode != HttpStatus.SC_OK)
			{
				System.err.println("Method failed: " + method.getStatusLine());
			}

			 rstream = null;
			rstream = method.getResponseBodyAsStream();

			// process the response
			br = new BufferedReader(new InputStreamReader(rstream));
			line = "";

			while ((line = br.readLine()) != null)
			{
				System.out.println("The costliest beer is "+line);
			}

			br.close();
         
//////////////////////////////////////////////////////////////////////////////////
         
         client = new HttpClient();
			 method = new GetMethod(baseUrl + getResource);
			// GetMethod method = new GetMethod(baseUrl + rectangleResoruce);

			// send get request
			 statusCode = client.executeMethod(method);
			if (statusCode != HttpStatus.SC_OK)
			{
				System.err.println("Method failed: " + method.getStatusLine());
			}

			 rstream = null;
			rstream = method.getResponseBodyAsStream();

			// process the response
			br = new BufferedReader(new InputStreamReader(rstream));
			line = "";

			while ((line = br.readLine()) != null)
			{
				System.out.println(line);
			}

			br.close();
//////////////////////////////////////////////////////////////////////////////////
         
         client = new HttpClient();
			 method = new GetMethod(baseUrl + getResource1);
			// GetMethod method = new GetMethod(baseUrl + rectangleResoruce);

			// send get request
			 statusCode = client.executeMethod(method);
			if (statusCode != HttpStatus.SC_OK)
			{
				System.err.println("Method failed: " + method.getStatusLine());
			}

			 rstream = null;
			rstream = method.getResponseBodyAsStream();

			// process the response
			br = new BufferedReader(new InputStreamReader(rstream));
			line = "";

			while ((line = br.readLine()) != null)
			{
				System.out.println(line);
			}

			br.close();
//////////////////////////////////////////////////////////////////////////////////
         
         client = new HttpClient();
			 method = new GetMethod(baseUrl + getResource2);
			// GetMethod method = new GetMethod(baseUrl + rectangleResoruce);

			// send get request
			 statusCode = client.executeMethod(method);
			if (statusCode != HttpStatus.SC_OK)
			{
				System.err.println("Method failed: " + method.getStatusLine());
			}

			 rstream = null;
			rstream = method.getResponseBodyAsStream();

			// process the response
			br = new BufferedReader(new InputStreamReader(rstream));
			line = "";

			while ((line = br.readLine()) != null)
			{
				System.out.println(line);
			}

			br.close();
//////////////////////////////////////////////////////////////////////////////////
         
         client = new HttpClient();
			 method = new GetMethod(baseUrl + getResource3);
			// GetMethod method = new GetMethod(baseUrl + rectangleResoruce);

			// send get request
			 statusCode = client.executeMethod(method);
			if (statusCode != HttpStatus.SC_OK)
			{
				System.err.println("Method failed: " + method.getStatusLine());
			}

			 rstream = null;
			rstream = method.getResponseBodyAsStream();

			// process the response
			br = new BufferedReader(new InputStreamReader(rstream));
			line = "";

			while ((line = br.readLine()) != null)
			{
				System.out.println(line);
			}

			br.close();
//////////////////////////////////////////////////////////////////////////////////
         
         client = new HttpClient();
			 method = new GetMethod(baseUrl + getResource4);
			// GetMethod method = new GetMethod(baseUrl + rectangleResoruce);

			// send get request
			 statusCode = client.executeMethod(method);
			if (statusCode != HttpStatus.SC_OK)
			{
				System.err.println("Method failed: " + method.getStatusLine());
			}

			 rstream = null;
			rstream = method.getResponseBodyAsStream();

			// process the response
			br = new BufferedReader(new InputStreamReader(rstream));
			line = "";

			while ((line = br.readLine()) != null)
			{
				System.out.println(line);
			}

			br.close();
//////////////////////////////////////////////////////////////////////////////////
         
         client = new HttpClient();
			 method = new GetMethod(baseUrl + getResource5);
			// GetMethod method = new GetMethod(baseUrl + rectangleResoruce);

			// send get request
			 statusCode = client.executeMethod(method);
			if (statusCode != HttpStatus.SC_OK)
			{
				System.err.println("Method failed: " + method.getStatusLine());
			}

			 rstream = null;
			rstream = method.getResponseBodyAsStream();

			// process the response
			br = new BufferedReader(new InputStreamReader(rstream));
			line = "";

			while ((line = br.readLine()) != null)
			{
				System.out.println(line);
			}

			br.close();
         
         //////////////////////////////////////////////////////////////////////////////////
         
         client = new HttpClient();
			 method = new GetMethod(baseUrl + getResource6);
			// GetMethod method = new GetMethod(baseUrl + rectangleResoruce);

			// send get request
			 statusCode = client.executeMethod(method);
			if (statusCode != HttpStatus.SC_OK)
			{
				System.err.println("Method failed: " + method.getStatusLine());
			}

			 rstream = null;
			rstream = method.getResponseBodyAsStream();

			// process the response
			br = new BufferedReader(new InputStreamReader(rstream));
			line = "";

			while ((line = br.readLine()) != null)
			{
				System.out.println(line);
			}

			br.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}