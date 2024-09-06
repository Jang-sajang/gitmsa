<template>
  <div>
    <TheNav></TheNav>
<RouterView></RouterView>
<TheCounter></TheCounter>
<TheCounter></TheCounter>
<TheCounter></TheCounter>
  </div>
</template>

<script>
import TheNav from './views/TheNav.vue';
import TheCounter from './views/TheCounter.vue';
import { RouterView } from 'vue-router';

export default {
  components: {
    TheCounter,
    RouterView,
    TheNav
  },
  setup() {

    return { TheCounter, RouterView,TheNav };
  }
}

</script>

<style lang="scss" scoped>

</style>