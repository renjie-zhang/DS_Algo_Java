package io.renjiezhang.SingleLinkedList;

/**
 * @author: renjie.zhang
 * @date:2019/11/26-22:14
 * @Description: 单链表接口
 */
public interface singlelinkedlistimpl<E> {
    /**
     * 初始化单链表
     */
    void initList();

    /**
     * 释放单链表
     */
    void destroyList();

    /**
     * 判断此链表是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 添加结点
     * @return
     */
    boolean add();

    /**
     * 删除结点
     * @return
     */
    boolean delete();

    /**
     * 单链表长度
     * @return
     */
    int length();

    /**
     * 输出单链表
     */
    void show();

    /**
     * 返回链表的第n个结点
     * @return 返回该结点
     */
    E getNthElement(E nth);

    /**
     * 返回链表的倒数第n个结点
     * @param inverseNth 倒数第n个结点
     * @return 返回该结点
     */
    E getInverseNthElement(E inverseNth);

    /**
     * 是否包含该结点
     * @param element  结点
     * @return
     */
    boolean isContain(E element);

    /**
     * 逆序输出链表
     */
    void showInverse();

    /**
     * 反向链表
     */
    void inverseList();

}
