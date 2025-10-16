# UML Class Diagram

Here is a UML class diagram, specified using [Mermaid][mer].

```mermaid
classDiagram
    Customer <|-- Order : places
    Customer : +String name
    Customer : +String address
    Customer : +placeOrder()

    Order : +orderNumber
    Order : +datePlaced
    Order : +deliveryDate
    Order : +checkStock()
    Order : +takePayment()

    Order <|-- OrderItem : includes
    OrderItem : +String name
    OrderItem : +String description

```


[mer]: https://mermaid.js.org/
