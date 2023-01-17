package com.example.imagepro;

import android.content.Context;
import android.content.res.AssetManager;

import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.gpu.GpuDelegate;

public class facialExpressionRecognition {
        private Interpreter interpreter;
        private int INPUT_SIZE;
        private int height=0;
        private int width=0;
        private GpuDelegate gpuDelegate=null;

        private CascadeClassifier cascadeClassifier;

        facialExpressionRecognition(AssetManager assetManager, Context context, String modelPath, int inputsize){

        }
}
