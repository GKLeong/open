<script lang="ts" setup>
import WelcomeItem from './WelcomeItem.vue'
import DocumentationIcon from './icons/IconDocumentation.vue'
import ToolingIcon from './icons/IconTooling.vue'
import EcosystemIcon from './icons/IconEcosystem.vue'
import CommunityIcon from './icons/IconCommunity.vue'
import SupportIcon from './icons/IconSupport.vue'
</script>

<template>
  <WelcomeItem>
    <template #icon>
      <DocumentationIcon/>
    </template>
    <template #heading>文档(Document)</template>

    Vue’s
    <a href="https://vuejs.org/" rel="noopener" target="_blank">official documentation</a>
    provides you with all information you need to get started.
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <ToolingIcon/>
    </template>
    <template #heading>工具(Tools)</template>

    This project is served and bundled with
    <a href="https://vitejs.dev/guide/features.html" rel="noopener" target="_blank">Vite</a>. The
    recommended IDE setup is
    <a href="https://code.visualstudio.com/" rel="noopener" target="_blank">VSCode</a> +
    <a href="https://github.com/johnsoncodehk/volar" rel="noopener" target="_blank">Volar</a>. If
    you need to test your components and web pages, check out
    <a href="https://www.cypress.io/" rel="noopener" target="_blank">Cypress</a> and
    <a href="https://on.cypress.io/component" rel="noopener" target="_blank"
    >Cypress Component Testing</a
    >.

    <br/>

    More instructions are available in <code>README.md</code>.
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <EcosystemIcon/>
    </template>
    <template #heading>生态系统(Ecosystem)</template>

    Get official tools and libraries for your project:
    <a href="https://pinia.vuejs.org/" rel="noopener" target="_blank">Pinia</a>,
    <a href="https://router.vuejs.org/" rel="noopener" target="_blank">Vue Router</a>,
    <a href="https://test-utils.vuejs.org/" rel="noopener" target="_blank">Vue Test Utils</a>, and
    <a href="https://github.com/vuejs/devtools" rel="noopener" target="_blank">Vue Dev Tools</a>. If
    you need more resources, we suggest paying
    <a href="https://github.com/vuejs/awesome-vue" rel="noopener" target="_blank">Awesome Vue</a>
    a visit.
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <CommunityIcon/>
    </template>
    <template #heading>社区(Community)</template>

    Got stuck? Ask your question on
    <a href="https://chat.vuejs.org" rel="noopener" target="_blank">Vue Land</a>, our official
    Discord server, or
    <a href="https://stackoverflow.com/questions/tagged/vue.js" rel="noopener" target="_blank"
    >StackOverflow</a
    >. You should also subscribe to
    <a href="https://news.vuejs.org" rel="noopener" target="_blank">our mailing list</a> and follow
    the official
    <a href="https://twitter.com/vuejs" rel="noopener" target="_blank">@vuejs</a>
    twitter account for latest news in the Vue world.
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <SupportIcon/>
    </template>
    <template #heading>支持(Support Vue)</template>

    As an independent project, Vue relies on community backing for its sustainability. You can help
    us by
    <a href="https://vuejs.org/sponsor/" rel="noopener" target="_blank">becoming a sponsor</a>.
  </WelcomeItem>
</template>