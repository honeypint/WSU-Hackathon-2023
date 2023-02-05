#these just import all the packages needed for the code to run
from flask import Flask, request
from flask_restful import Api, Resource

#Setting up the Flask
app = Flask(__name__)
api = Api(app)

#Dictionary that gives data given by the app (test.py)
app_input = {"data": "GTIN"}

#this sets up how the app interacts with the Flask webpage and REST API
class GTIN(Resource):
    def get(self, tin):
        return {"data": "GTIN"}

    def post(self, tin):
        app_input.update(request.form)
        print(app_input.items())
        return{"data": "msg recieved"}

#These are the things needed for the API
api.add_resource(GTIN, "/GTIN/<string:tin>")

#this turns on debug mode to help develope the code
if __name__ == "__main__":
    app.run(debug=True)
