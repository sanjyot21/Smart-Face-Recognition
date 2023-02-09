from keras.layers import Dense,Activation
from keras.layers import LeakyReLU
from keras.models import Sequential
import numpy as np
import tensorflow as tf
from tensorflow import keras
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Activation, Dense, Flatten, BatchNormalization, Conv2D, MaxPool2D
from tensorflow.keras.optimizers import Adam
from tensorflow.keras.metrics import categorical_crossentropy
from tensorflow.keras.preprocessing.image import ImageDataGenerator
from sklearn.metrics import confusion_matrix
import itertools
import os
import shutil
import random 
import glob
import matplotlib.pyplot as plt
import warnings
import tensorflow as tf
import warnings

warnings.filterwarnings("ignore")

class DenseArchs:
    def __init__(self,classes):
        print('training initiated')
        self.model=Sequential()
        self.classes=classes
        
    def arch(self):
        # self.model.add(Dense(128,input_dim=256))
        # self.model.add(LeakyReLU(alpha=0.1))
        # self.model.add(Dense(64))
        # self.model.add(LeakyReLU(alpha=0.1))
        # self.model.add(Dense(32))
        # self.model.add(LeakyReLU(alpha=0.1))
        # self.model.add(Dense(16))
        # self.model.add(LeakyReLU(alpha=0.1))
        # self.model.add(Dense(self.classes))
        # self.model.add(Activation('softmax'))
        
        self.model = Sequential([
        Conv2D(filters=32, kernel_size=(3, 3), activation='relu', padding = 'same', input_shape=(224,224,1)),
        MaxPool2D(pool_size=(2, 2), strides=2),
        Conv2D(filters=64, kernel_size=(3, 3), activation='relu', padding = 'same'),
        MaxPool2D(pool_size=(2, 2), strides=2),
        Flatten()])
        
        self.model.add(Dense(units=self.classes, activation='softmax'))
        print(self.model.summary())

        return self.model
