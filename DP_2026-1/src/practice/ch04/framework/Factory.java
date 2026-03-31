package practice.ch04.framework;

public abstract class Factory {
    //템플릿 메소드
    public final Product create(String owner) {
        //예 : 실제로는 IDCard 객체가 생성되지만, 부모 타입으로 받을 수 있다.
        Product p = createProduct(owner); //제품 생성
        registerProduct(p);  // 생성된 제품 등록
        return p;
    }

    //구체적인 공장이 구현해야 하는 메소드
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
