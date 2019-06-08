# Карта цифрового образования России

Онлайн-платформа, отражающая актуальные сведения обо всем цифровом образовании России в виде карты с отмеченными на ней образовательными организациями.
> Проект разрабатывается силами сообщества [образовательного YouTube канала](https://www.youtube.com/channel/UCwMl9L2VNAR0upPrkhAo_Ig)  
> [Здесь](https://paradise152771.typeform.com/to/uYkrq6) немного подробнее о том, как появилась эта идея  
> Вся коммуникация по проекту в [slack](https://join.slack.com/t/doit-dt59172/shared_invite/enQtNjIwMjIxMDEyMDA1LTBiN2UyZjkyZDQyZmU3M2U1ZWJhODhkMmZhYWU2MGFjMDQ5NGU0NWI4ZGNjNzE0MWQ2ZTUyMWIzMjEzYjAxZTA)

### Инструкции по запуску

1. Создать persistence.properties в папке [resources](https://github.com/paradisensei/Digital-education-map/tree/master/src/main/resources) по [образцу](https://github.com/paradisensei/Digital-education-map/tree/master/src/main/resources/properties.origin/persistence.properties.origin)
2. Создать application.properties в папке [resources](https://github.com/paradisensei/Digital-education-map/tree/master/src/main/resources) по [образцу](https://github.com/paradisensei/Digital-education-map/tree/master/src/main/resources/properties.origin/application.properties.origin) ([Инструкция по получению API ключа](https://tech.yandex.ru/maps/doc/jsapi/2.1/quick-start/index-docpage/))
3. Создать liquibase.properties в папке [resources](https://github.com/paradisensei/Digital-education-map/tree/master/src/main/resources) по [образцу](https://github.com/paradisensei/Digital-education-map/tree/master/src/main/resources/properties.origin/liquibase.properties.origin)
4. Выполнить команду `mvn liquibase:update -P test-with-data` для развертывания БД с тестовыми данными, либо `mvn liquibase:update -P test-without-data` для развертывания только схемы
5. Развернуть собранный war файл в любимом веб-сервере

### Инструкции по запуску тестов

Запуск всех тестов: `mvn test -P test-with-data`

### Contributing

Прежде чем начать, пожалуйста, прочитайте гайд по разработке [CONTRIBUTING.md](https://github.com/paradisensei/Digital-education-map/blob/master/.github/CONTRIBUTING.md). Он далеко не окончательный, будем дорабатывать в процессе.

### License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/paradisensei/Digital-education-map/blob/master/LICENSE) file for details
