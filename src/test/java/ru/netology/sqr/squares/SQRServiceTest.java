package ru.netology.sqr.squares;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.squares.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

 @org.junit.jupiter.api.Test
 void CalculateSqrMiddle() {
  SQRService service = new SQRService();
  int expected = 3;
  int actual = service.calcSqrt(200, 300);
  Assertions.assertEquals(expected, actual);
 }

 @org.junit.jupiter.api.Test
 void CalculateSqrNot() {
  SQRService service = new SQRService();
  int expected = 0;
  int actual = service.calcSqrt(0, 99);
  Assertions.assertEquals(expected, actual);
 }

 @org.junit.jupiter.api.Test
 void CalculateSqrAll() {
  SQRService service = new SQRService();
  int expected = 89;
  int actual = service.calcSqrt(100, 9_801);
  Assertions.assertEquals(expected, actual);
 }

 @org.junit.jupiter.api.Test
 void CalculateSqrLast() {
  SQRService service = new SQRService();
  int expected = 0;
  int actual = service.calcSqrt(9_802, 10_000);
  Assertions.assertEquals(expected, actual);
 }
}
