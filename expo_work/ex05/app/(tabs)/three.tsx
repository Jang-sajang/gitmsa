import React from 'react';
import { Text, View } from 'react-native';
import tailwind from 'tailwind-rn';

const App = () => {
  return (
    <View style={tailwind('flex-1 items-center justify-center bg-blue-500')}>
      <Text style={tailwind('text-white text-lg font-bold')}>Hello, Tailwind-RN!</Text>
    </View>
  );
};

export default App;
