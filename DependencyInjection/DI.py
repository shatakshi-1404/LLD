# dependency injection in python (FastAPI)
class NotificationService:
    def __init__(self, sender):
        self.sender = sender

    def notify_user(self, message: str):
        self.sender.send(message)