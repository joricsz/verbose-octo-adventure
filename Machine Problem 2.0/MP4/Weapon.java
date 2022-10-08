
public class Weapon extends Item{
	//instance variable
	private int damage;
	
	//constructor
	public Weapon(String name, double weight, int damage){
		super(name, weight);
		this.damage = damage;
	}
	
	//getters
	public int getDamage(){
		return damage;
	}
	
	//setters
	public void setDamage(int damage){
		this.damage = damage;
	}
	
	//other methods
	public boolean use(Object target){
		if(target instanceof Person){
			Person p = (Person) target;
			System.out.println("Attack " + p.getName() + " with " + getName() +	" for "	+ damage + " damage!");
			if(p.defends(damage)==true){
				System.out.println(p.getName() + " lives!");
				return true;
			}
			System.out.println(p.getName() + " is dead!");
			return false;
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "Name: " + super.getName() + "\nWeight: " + super.getWeight() + "\nDamage: " + damage + "\n";
	}
	
}