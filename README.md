## `Calculator-java`
Simple calculator program using java language.
class is created by the name 'Calci'.

## `Java Classes/Objects`

Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

## `ActionListener`
ActionListener interface is used.
- Here, the crucial and integral part is an object that can implement the Action Listener interface. This object must be identified by the program as an action listener on the button that is nothing but the event source.

- Thus, utilizing the addActionListener method, when the user clicks the button it fires an action event. This invokes the action listener’s actionPerformed method. Please note that it is the only method in the ActionListener interface. A single argument to the method is an ActionEvent object, which provides information on event and its source.
## `button.addActionListener(this)`

It means the component button will be included in the components which are being tracked for an action event. It is mandatory to add a component to an action listener in order for you to add codes when the user clicks that particular component. Components that are not added with an action listener will fail to be monitored.
