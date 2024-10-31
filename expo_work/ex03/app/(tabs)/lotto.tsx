import { Link } from "expo-router";
import { View,Text } from "react-native";

export default function LottoScreen(){
  return(
    <View style={{marginTop:50}}>
      <Text style={{fontSize:50}}>로또</Text>
      <Link href={"/home"}>
      <Text style= "fontSize=50"></Text>Home</Link>
    </View>
  )
}