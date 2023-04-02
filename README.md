
# Conference App

This is a sample conference management system built with Spring Boot and Hibernate.

## Installation
To install and run the application, follow these steps:

Clone the repository to your local machine.
Open the project in your preferred IDE.
Run the ConferenceDemoApplication class to start the application.
Access the application at http://localhost:5000.


## Usage
The application allows you to manage sessions and speakers for a conference. You can perform the following operations in the api usage:

## Sessions
View all sessions
View a single session by ID
Create a new session
Update an existing session
Delete a session by ID

## Speakers
View all speakers
View a single speaker by ID
Create a new speaker
Update an existing speaker
Delete a speaker by ID

## API Usage

```http
  GET /speakers
  Example: GET http://localhost:5000/speakers

```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | no |Returns all speakers |



```http
  GET /speakers/{id}
  Example: GET http://localhost:5000/speakers/3

```

| Parameter | Type     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` |Returns a single speaker with the specified ID |

  ```http
  POST /speakers
  Example: POST http://localhost:5000/speakers
```


| Parameter | Type     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| `id`      |`integer` |The ID of the speaker|
| `name`      | `string` |The name of the speaker |
| `topic`      | `string` |The topic of the speaker's session |
| `bio`      | `string` |A short bio of the speaker |

  ```http
  PUT /speakers/{id}
  Example: PUT http://localhost:5000/speakers/3
```

| Parameter | Type     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` |The ID of the speaker to be updated|
| `name`      | `string` |The updated name of the speaker|
| `topic`      | `string` |The updated topic of the speaker's session |
| `bio`      | `string` |The updated bio of the speaker |


  ```http
  DELETE /speakers/{id}
  Example: DELETE http://localhost:5000/speakers/3
```

| Parameter | Type     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` |The ID of the speaker to be deleted|


#### Sessions


```http
  GET /sessions
  Example: GET http://localhost:5000/sessions

```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` |Returns all sessions |


```http
  GET /sessions/{id}
  Example: GET http://localhost:5000/sessions/3

```

| Parameter | Type     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` |Returns a single session with the specified ID |



  ```http
  POST /sessions
  Example: POST http://localhost:5000/sessions
```

| Parameter | Type     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| `speaker_id`      | `integer` |The ID of the session speaker|
| `title`      | `string` |The title of the session|
| `abstract`      | `string` |A brief summary of the session |
| `start_time`      | `datetime` |The start time of the session in ISO 8601 format (e.g. 2023-04-02T10:00:00-05:00)|
| `end_time	`      | `datetime` |The end time of the session in ISO 8601 format|
  


  ```http
  PUT /sessions
  Example: POST http://localhost:5000/sessions
```

| Parameter | Type     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| `speaker_id`      | `integer` |The ID of the session speaker to be updated|
| `title`      | `string` |The title of the session to be updated|
| `abstract`      | `string` |A brief summary of the session to be updated|
| `start_time`      | `datetime` |The start time of the session in ISO 8601 format (e.g. 2023-04-02T10:00:00-05:00) to be updated|
| `end_time	`      | `datetime` |The end time of the session in ISO 8601 format to be updated|
  
  
  
  ```http
 DELETE /sessions/{id}
  Example: DELETE http://localhost:5000/sessions/3
```
   
| Parameter | Type     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` |Required. ID of the session to delete|


  
