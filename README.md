# Для замены заголовков в заметках Obsidian

### Принимает на вход файл input.md. Перезаписывает исходный файл с новым заголовком.
Формат заголовка на выходе:
```text
### Tags:     
#Docker #Ubuntu #Bash #Console
___
### Parent item:    
[[Docker]]
___
### Description: 
Команды для управления докером из консоли [[Ubuntu]]
___
___
```

### Расчитан под 2 формата заголовка:

Старый:
```text
Tags: #SQL
___
Parent item: [[DCL]]
___
Description: Наделяет пользователя правами
___

```


Новый:
```text
##### <font color=90EE90>Tags:</font>   #SQL
___
##### <font color=90EE90>Parent item:</font>    [[DML]]
___
##### <font color=90EE90>Description:</font>   Создает записи
___
___

```

