# this just imports the package needed for the code to work
import requests

#this is the url of the flask page *NOTE- it might be different when you run it off of a different machine, run hack-flask.py first to find the url
BASE = "http://127.0.0.1:5000/"

#this is what is interacting with Flask and the API
response = requests.post(BASE + "GTIN/10850020317117")

#This just prints what the Flask/REST API sends back
print(response.json())
