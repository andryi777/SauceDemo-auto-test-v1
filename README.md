# SauceDemo-auto-test-v1
Para ejecutar por consola, ubicarse en la carpeta del proyecto y lanzar este comando:

test -Denvironment=local_chrome -Dcucumber.features='src/test/resources/features/' -Dcucumber.filter.tags='@Login' -Dcucumber.plugin="json:target/site/result.json" -Dcucumber.glue='demo'