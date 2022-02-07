# FunctionalJava

Learn functionals method introduced after java 8.

See course here https://www.youtube.com/watch?v=rPSL1alFIjI&feature=youtu.be

In java 8 was introduced new interfaces:
 - Consumer 
 - Supplier
 - Predicate
 - Functions

## Consumer

A consumer is a functional interface that accept a single input and return no output.
It has two methods:
 -  accept(T t)
 -  default Consumer<T> andThen(Consumer<? super T> after);

```
@Test
public void whenNamesPresentUseBothConsumer(){
    List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");

    Consumer<List<String>> upperCaseConsumer = list -> {
        for(int i=0; i< list.size(); i++){
            list.set(i, list.get(i).toUpperCase());
        }
    };
    Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);

    upperCaseConsumer.andThen(printConsumer).accept(cities);
}
```

## Supplier
A Supplier is a simple interface which indicates that this implementation is a supplier of results.
It has a simple method get()

```
@Test
public void supplier(){
    Supplier<Double> doubleSupplier1 = () -> Math.random();
    DoubleSupplier doubleSupplier2 = Math::random;

    System.out.println(doubleSupplier1.get());
    System.out.println(doubleSupplier2.getAsDouble());
}
```

## Predicate

A Predicate interface represents a boolean-valued-function of an argument.
A predicate has a test() method which accepts an argument and returns a boolean value.

Predicate also provides a few default and static method for composition and other purposes:
```
default Predicate<T> and(Predicate<? super T> other);
default Predicate<T> or(Predicate<? super T> other);
static <T> Predicate<T> isEquals(Object targetRef);
default Predicate<T> negate();
```
## Functions

It's a interface that accept one parameter and produce a result.

