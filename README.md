# SauceDemo-auto-test-v1

Para ejecutar por consola, ubicarse en la carpeta del proyecto y lanzar este comando:

```
mvn test -Denvironment=local_chrome -Dcucumber.features='src/test/resources/features/' -Dcucumber.filter.tags='@Login' -Dcucumber.plugin="json:target/site/result.json" -Dcucumber.glue='demo'
```

Una vez que termine la prueba, lanzar el siguiente comando:
```
mvn serenity:aggregate
```
Y se creará una carpeta Target donde estará las evidencias, ir a la carpeta Site y abrir el archivo index.html donde se visualizarán las evidencias

En caso de ejecutar con Jenkins

Se puede hacer un Fork, luego, en el jenkins personal que se tenga, crear un pipeline, seleccionar que es una ejecución que debe parametrizarse, luego, apuntar a la rama main y al final al jenkinsfile

