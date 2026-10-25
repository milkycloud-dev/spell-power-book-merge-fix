<p align="center"><img src="assets/icon.png" width="128" height="128" alt="Spell Power Book Merge Fix icon"></p>

<h1 align="center">Spell Power Book Merge Fix</h1>

<p align="center">NeoForge 1.21.1 mod that lets two Spell Power school enchantment books be combined in an anvil.</p>

<p align="center">
  <a href="https://github.com/milkycloud-dev/spell-power-book-merge-fix/actions/workflows/build.yml"><img src="https://github.com/milkycloud-dev/spell-power-book-merge-fix/actions/workflows/build.yml/badge.svg" alt="Build"></a>
  <a href="https://github.com/milkycloud-dev/spell-power-book-merge-fix/releases/latest"><img src="https://img.shields.io/github/v/release/milkycloud-dev/spell-power-book-merge-fix" alt="Release"></a>
  <a href="LICENSE"><img src="https://img.shields.io/badge/license-proprietary-lightgrey" alt="License: proprietary"></a>
</p>

<p align="center"><a href="#english">English</a> | <a href="#русский">Русский</a></p>

<a id="english"></a>

## English

### Overview

[Spell Power Attributes](https://modrinth.com/mod/spell-power) has the option `enchantments_require_matching_attribute` in `config/spell_power/attributes.json`. When it is on, the school enchantments Soulfrost, Sunfire and Energize may only be applied to an item that already grants an attribute of the same school, for example frost or soul for Soulfrost.

On NeoForge the anvil asks the same question when two enchanted books are combined. A book has no attributes, so the check fails and the anvil shows no result: two Soulfrost III books never make Soulfrost IV, at any level. Players in creative mode are not affected, which makes the bug easy to miss.

The mod makes the check pass for enchanted books only:

- two books with the same school enchantment combine as usual, up to the maximum level;
- applying a book to an item still requires the matching attribute;
- exclusive enchantments (Soulfrost and Sunfire on one item) stay incompatible;
- all other enchantments are untouched.

### Requirements

- Minecraft 1.21.1
- NeoForge 21.1 or newer, or a NeoForge-based hybrid core
- Spell Power Attributes 1.6 or newer for 1.21.1
- Java 21

### Installation

Download `spell-power-book-merge-fix-<version>.jar` from [Releases](https://github.com/milkycloud-dev/spell-power-book-merge-fix/releases) and put it into `mods/` on the server. The anvil result is computed by the server, so players do not need the mod. It also works in single player. On start the log shows `Spell Power book merge fix loaded`.

There is no configuration. Without Spell Power installed the mod does nothing.

### Releases

Every tag `v*` is built by GitHub Actions from this source and published in [Releases](../../releases). The build log of each release is public, so every jar can be traced to its commit.

### Known limitations

- The fix targets `SpellPowerEnchanting.isAllowed` in Spell Power 1.6.x. If a later version renames that method, the mixin is skipped without an error and the old behaviour returns.
- A client without the mod predicts an empty anvil result for a moment until the server sends the real one.

### License

Proprietary, all rights reserved. Official release binaries may be run unmodified on servers you operate. Copying, modifying or redistributing the code or the binaries requires written permission. Full terms: [LICENSE](LICENSE).

<a id="русский"></a>

## Русский

### Обзор

У [Spell Power Attributes](https://modrinth.com/mod/spell-power) есть настройка `enchantments_require_matching_attribute` в `config/spell_power/attributes.json`. Когда она включена, школьные зачарования Ледяная душа, Солнечный огонь и Энергия можно наложить только на предмет, у которого уже есть атрибут той же школы, например мороз или душа для Ледяной души.

На NeoForge наковальня задаёт этот же вопрос, когда объединяются две зачарованные книги. У книги атрибутов нет, проверка не проходит, и наковальня не показывает результат: две книги Ледяная душа III никогда не дают IV, на любом уровне. Игроков в творческом режиме это не касается, поэтому баг легко пропустить.

Мод пропускает проверку только для зачарованных книг:

- две книги с одним школьным зачарованием объединяются как обычно, до максимального уровня;
- чтобы наложить книгу на предмет, по-прежнему нужен атрибут той же школы;
- несовместимые зачарования (Ледяная душа и Солнечный огонь на одном предмете) остаются несовместимыми;
- остальные зачарования не затрагиваются.

### Требования

- Minecraft 1.21.1
- NeoForge 21.1 и новее или гибридное ядро на NeoForge
- Spell Power Attributes 1.6 и новее для 1.21.1
- Java 21

### Установка

Скачать `spell-power-book-merge-fix-<версия>.jar` из [Releases](https://github.com/milkycloud-dev/spell-power-book-merge-fix/releases) и положить в `mods/` на сервере. Результат наковальни считает сервер, так что игрокам мод не нужен. В одиночной игре он тоже работает. При запуске в логе появится `Spell Power book merge fix loaded`.

Настроек нет. Без Spell Power мод ничего не делает.

### Релизы

Каждый тег `v*` собирается из этих исходников в GitHub Actions и публикуется в [Releases](../../releases). Лог сборки каждого релиза открыт, так что любой jar можно сверить с его коммитом.

### Известные ограничения

- Исправление нацелено на `SpellPowerEnchanting.isAllowed` в Spell Power 1.6.x. Если в новой версии метод переименуют, миксин тихо пропустится и старое поведение вернётся.
- Клиент без мода на мгновение предсказывает пустой результат наковальни, пока сервер не пришлёт настоящий.

### Лицензия

Проприетарная, все права защищены. Официальные сборки из релизов можно запускать без изменений на своих серверах. Копировать, изменять и распространять код или сборки можно только с письменного разрешения. Полный текст: [LICENSE](LICENSE).
