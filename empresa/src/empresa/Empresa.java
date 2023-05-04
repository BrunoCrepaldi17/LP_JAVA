
package empresa;
 class Empresa {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("João", 5000, 1, "TI");
        Desenvolvedor desenvolvedor = new Desenvolvedor("José", 4000, 2, "Java");
        Analista analista = new Analista("Maria", 3500, 3, "Financeiro");

        
        System.out.println("Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário anual: " + gerente.calcularSalarioAnual());
        System.out.println("Departamento: " + gerente.getDepartamento());
        System.out.println();

        System.out.println("Desenvolvedor:");
        System.out.println("Nome: " + desenvolvedor.getNome());
        System.out.println("Salário anual: " + desenvolvedor.calcularSalarioAnual());
        System.out.println("Linguagem: " + desenvolvedor.getLinguagem());
        System.out.println();

        System.out.println("Analista:");
        System.out.println("Nome: " + analista.getNome());
        System.out.println("Salário anual: " + analista.calcularSalarioAnual());
    }
    
}
