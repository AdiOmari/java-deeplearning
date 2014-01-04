package com.ccc.deeplearning.nn.matrix.jblas;

import java.io.Serializable;

import org.apache.commons.math3.random.RandomGenerator;
import org.jblas.DoubleMatrix;

public interface NeuralNetwork extends Serializable {

	public abstract int getnVisible();

	public abstract void setnVisible(int nVisible);

	public abstract int getnHidden();

	public abstract void setnHidden(int nHidden);

	public abstract DoubleMatrix getW();

	public abstract void setW(DoubleMatrix w);

	public abstract DoubleMatrix gethBias();

	public abstract void sethBias(DoubleMatrix hBias);

	public abstract DoubleMatrix getvBias();

	public abstract void setvBias(DoubleMatrix vBias);

	public abstract RandomGenerator getRng();

	public abstract void setRng(RandomGenerator rng);

	public abstract DoubleMatrix getInput();

	public abstract void setInput(DoubleMatrix input);
	
	public double getSparsity();
	public abstract void setSparsity(double sparsity);
	
	public double getL2();
	public void setL2(double l2);
	
	public double getMomentum();
	public void setMomentum(double momentum);
	
	public void trainTillConvergence(DoubleMatrix input,double lr,Object[] params);
	/**
	 * Performs a network merge in the form of
	 * a += b - a / n
	 * where a is a matrix here
	 * b is a matrix on the incoming network
	 * and n is the batch size
	 * @param network the network to merge with
	 * @param batchSize the batch size (number of training examples)
	 * to average by
	 */
	void merge(NeuralNetwork network,int batchSize);

}