package apresentacao;

import patos.Duck;
import patos.MallardDuck;
import patos.ModelDuck;
import voos.FlyRocketPowered;

public class MiniPatinhoNaLagoa {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        System.out.println("Pato-real");
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();

        System.out.println();

        Duck model = new ModelDuck();

        System.out.println("Pato de modelo antes da mudança");
        model.display();
        model.performQuack();
        model.performFly();

        System.out.println();

        System.out.println("Alterando o comportamento em tempo de execução");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
