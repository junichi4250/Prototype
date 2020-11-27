package framework;

import java.util.HashMap;

/**
 * Productクラスを利用してインスタンスの生成を行うクラス
 * @author jun
 *
 */
public class Manager {
	/** インスタンスの名前とインスタンスの対応関係を表す */
	private HashMap showcase = new HashMap();
	
	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}

	public Product create(String protoname) {
		Product p = (Product)showcase.get(protoname);
		return p.createClone();
	}

}
