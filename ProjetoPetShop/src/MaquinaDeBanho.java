public class MaquinaDeBanho {

    private int nivelAgua;
    private int nivelShampoo;
    private boolean petNoBanho;
    private boolean maquinaSuja;

    public MaquinaDeBanho() {
        this.nivelAgua = 30;
        this.nivelShampoo = 10;
        this.petNoBanho = false;
        this.maquinaSuja = false;
    }

    public void darBanho() {
        if (petNoBanho && !maquinaSuja) {
            if (nivelAgua >= 10 && nivelShampoo >= 2) {
                nivelAgua -= 10;
                nivelShampoo -= 2;
                petNoBanho = false;
                maquinaSuja = true;
                System.out.println("Banho realizado com sucesso.");
            } else {
                System.out.println("Nível de água ou shampoo insuficiente.");
            }
        } else if (maquinaSuja) {
            System.out.println("A máquina está suja. Limpe a máquina antes de dar outro banho.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }

    public void abastecerAgua() {
        if (nivelAgua <= 28) {
            nivelAgua += 2;
            System.out.println("Abastecimento de água realizado com sucesso.");
        } else {
            System.out.println("Nível de água já está no máximo.");
        }
    }

    public void abastecerShampoo() {
        if (nivelShampoo <= 8) {
            nivelShampoo += 2;
            System.out.println("Abastecimento de shampoo realizado com sucesso.");
        } else {
            System.out.println("Nível de shampoo já está no máximo.");
        }
    }

    public void verificarNivelAgua() {
        System.out.println("Nível de água: " + nivelAgua + " litros.");
    }

    public void verificarNivelShampoo() {
        System.out.println("Nível de shampoo: " + nivelShampoo + " litros.");
    }

    public void verificarPetNoBanho() {
        if (petNoBanho) {
            System.out.println("Há um pet na máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }
    public void colocarPetNaMaquina() {
        if (!petNoBanho && !maquinaSuja) {
            petNoBanho = true;
            System.out.println("Pet colocado na máquina.");
        } else if (maquinaSuja) {
            System.out.println("A máquina está suja. Limpe a máquina antes de colocar outro pet.");
        } else {
            System.out.println("Já há um pet na máquina.");
        }
    }

    public void retirarPetDaMaquina() {
        if (petNoBanho) {
            petNoBanho = false;
            maquinaSuja = true;
            System.out.println("Pet retirado da máquina. A máquina precisa ser limpa.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }

    public void limparMaquina() {
        if (maquinaSuja) {
            if (nivelAgua >= 3 && nivelShampoo >= 1) {
                nivelAgua -= 3;
                nivelShampoo -= 1;
                maquinaSuja = false;
                System.out.println("Máquina limpa com sucesso.");
            } else {
                System.out.println("Nível de água ou shampoo insuficiente para limpar a máquina.");
            }
        } else {
            System.out.println("A máquina já está limpa.");
        }
    }
}
