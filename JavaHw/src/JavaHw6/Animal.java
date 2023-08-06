package JavaHw6;

public abstract class Animal {
    public abstract void move();
}

// 1.Animal 클래스에는 모든 동물들에게 공통적인 move() 메서드를 제공합니다.
// 동물에 맞는 소리를 제공하기 위해서 makeSound() 메서드를 제공합니다.

// Dog, Cat, Cow와 같은 하위 클래스들은 makeSound() 메서드를 오버라이딩하여 각각의 동물에 맞는 소리를 제공하지만,
// move() 메서드는 Animal 클래스로부터 상속받습니다.

// 3.하위 클래스들의 인스턴스를 생성하고 makeSound()와 move() 메서드를 호출하면, 다음과 같은 출력이 나타납니다

// - 출력결과-
// 개가 짖습니다: 왈! 왈!
// 동물이 움직입니다.
// 고양이가 야옹합니다: 야옹! 야옹!
// 동물이 움직입니다.
// 소가 음메를 합니다: 음메! 음메!
// 동물이 움직입니다.