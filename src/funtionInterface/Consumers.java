package funtionInterface;

import java.util.function.Consumer;

@FunctionalInterface
public interface Consumers <T> {

   void  consume(T t);
}
