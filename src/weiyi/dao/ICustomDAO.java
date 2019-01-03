package weiyi.dao;

import weiyi.dao.vo.Custom;

/**
 * 针对Custom对象，新增DAO操作的功能
 * @author 广辉
 *
 */
public interface ICustomDAO extends IDAO<Custom, Integer> {
	/**
	 * 根据登录名（loginName）查询指定客户对象
	 * @param name 要查询对象的登录名
	 * @return Custom对象
	 * @throws Exception
	 */
	public Custom findByName(String name)throws Exception;
}
