import requests
server = "https://qauto.forstudy.space/api"
endpoint_auth = "/auth/signin"
endpoint_users = "/users/current"

example_value = {
  "email": "test578@test.com",
  "password": "Qwerty12345",
  "remember": False
}

r = requests.post(server+endpoint_auth, json=example_value)
server_says = r.json()
if "status" in server_says:
    if server_says["status"] == "ok":
        print("all ok")
    else:
        print(server_says['message'])

r = requests.get(server+endpoint_users, json=example_value)
server_says = r.json()
if "status_code" in server_says:
    if server_says ["status_code"] == 200:
        print("all ok")
    else:
     print(server_says['message'])
