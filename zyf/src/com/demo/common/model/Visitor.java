package com.demo.common.model;

import com.demo.common.model.base.BaseVisitor;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Visitor extends BaseVisitor<Visitor> {
	public static final Visitor dao = new Visitor().dao();
}
