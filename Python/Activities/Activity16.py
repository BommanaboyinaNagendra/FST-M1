class car :

    def __init__(self,manufacturer, model, make, transmission, color) :
        print(manufacturer, model, make, transmission, color)
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission = transmission
        self.color = color

    def accelerate(self) :
        print(self.manufacturer+' '+ self.model+' is moving')

    def stop(selfs):
        print(selfs.manufacturer+' '+selfs.model+' is stopped')

car1 = car("Toyota", "Corolla", "2015", "Manual", "White")
car1.accelerate()
car1.stop()
car2 = car("Toyota", "Corolla", "2015", "Manual", "White")
car3 = car("Toyota", "Corolla", "2015", "Manual", "White")

