import boto3
import json 

s3 = boto3.client("s3")

def lambda_handler(event, context):
  bucket = "my-new-web-bucket"
  key = "pythoholic/sample01.txt"

  try:
    data = s3.get_object(Bucket=bucket, key-key)
    json_data = data["Body"].ready()
    data = json.load(json_data)
    return {
    "response_code" : 200
    "data": str(json_data)
    }
  except Exception as e:
    print(e)
    raise e
