/*
 * Copyright (C) 2020 - Amir Hossein Aghajari
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */


package com.aghajari.emojiview.iosprovider;

import com.aghajari.emojiview.emoji.EmojiData;

import java.util.Collections;
import java.util.HashSet;

public class AXIOSEmojiData extends EmojiData {
    static final AXIOSEmojiData instance = new AXIOSEmojiData();

    public static final String[] emojiColored = {
            "🤲", "👐", "🙌", "👏", "👍", "👎", "👊", "✊", "🤛", "🤜", "🤞", "✌", "🤟", "🤘", "👌", "🤌", "🤏", "👈", "👉", "👆", "👇", "☝", "✋", "🤚", "🖐", "🖖", "👋", "🤙", "💪", "🖕", "✍", "🙏", "🦶", "🦵", "👂", "🦻", "👃", "👶", "👧", "🧒", "👦", "👩", "🧑", "👨", "👩‍🦱", "🧑‍🦱", "👨‍🦱", "👩‍🦰", "🧑‍🦰", "👨‍🦰", "👱‍♀", "👱", "👱‍♂", "👩‍🦳", "🧑‍🦳", "👨‍🦳", "👩‍🦲", "🧑‍🦲", "👨‍🦲", "🧔‍♀", "🧔", "🧔‍♂", "👵", "🧓", "👴", "👲", "👳‍♀", "👳", "👳‍♂", "🧕", "👮‍♀", "👮", "👮‍♂", "👷‍♀", "👷", "👷‍♂", "💂‍♀", "💂", "💂‍♂", "🕵‍♀", "🕵", "🕵‍♂", "👩‍⚕", "🧑‍⚕", "👨‍⚕", "👩‍🌾", "🧑‍🌾", "👨‍🌾", "👩‍🍳", "🧑‍🍳", "👨‍🍳", "👩‍🎓", "🧑‍🎓", "👨‍🎓", "👩‍🎤", "🧑‍🎤", "👨‍🎤", "👩‍🏫", "🧑‍🏫", "👨‍🏫", "👩‍🏭", "🧑‍🏭", "👨‍🏭", "👩‍💻", "🧑‍💻", "👨‍💻", "👩‍💼", "🧑‍💼", "👨‍💼", "👩‍🔧", "🧑‍🔧", "👨‍🔧", "👩‍🔬", "🧑‍🔬", "👨‍🔬", "👩‍🎨", "🧑‍🎨", "👨‍🎨", "👩‍🚒", "🧑‍🚒", "👨‍🚒", "👩‍✈", "🧑‍✈", "👨‍✈", "👩‍🚀", "🧑‍🚀", "👨‍🚀", "👩‍⚖", "🧑‍⚖", "👨‍⚖", "👰‍♀", "👰", "👰‍♂", "🤵‍♀", "🤵", "🤵‍♂", "👸", "🤴", "🥷", "🦸‍♀", "🦸", "🦸‍♂", "🦹‍♀", "🦹", "🦹‍♂", "🤶", "🧑‍🎄", "🎅", "🧙‍♀", "🧙", "🧙‍♂", "🧝‍♀", "🧝", "🧝‍♂", "🧛‍♀", "🧛", "🧛‍♂", "🧜‍♀", "🧜", "🧜‍♂", "🧚‍♀", "🧚", "🧚‍♂", "👼", "🤰", "🤱", "👩‍🍼", "🧑‍🍼", "👨‍🍼", "🙇‍♀", "🙇", "🙇‍♂", "💁‍♀", "💁", "💁‍♂", "🙅‍♀", "🙅", "🙅‍♂", "🙆‍♀", "🙆", "🙆‍♂", "🙋‍♀", "🙋", "🙋‍♂", "🧏‍♀", "🧏", "🧏‍♂", "🤦‍♀", "🤦", "🤦‍♂", "🤷‍♀", "🤷", "🤷‍♂", "🙎‍♀", "🙎", "🙎‍♂", "🙍‍♀", "🙍", "🙍‍♂", "💇‍♀", "💇", "💇‍♂", "💆‍♀", "💆", "💆‍♂", "🧖‍♀", "🧖", "🧖‍♂", "💅", "🤳", "💃", "🕺", "🕴", "👩‍🦽", "🧑‍🦽", "👨‍🦽", "👩‍🦼", "🧑‍🦼", "👨‍🦼", "🚶‍♀", "🚶", "🚶‍♂", "👩‍🦯", "🧑‍🦯", "👨‍🦯", "🧎‍♀", "🧎", "🧎‍♂", "🏃‍♀", "🏃", "🏃‍♂", "🧍‍♀", "🧍", "🧍‍♂", "🏋‍♀", "🏋", "🏋‍♂", "🤸‍♀", "🤸", "🤸‍♂", "⛹‍♀", "⛹", "⛹‍♂", "🤾‍♀", "🤾", "🤾‍♂", "🏌‍♀", "🏌", "🏌‍♂", "🏇", "🧘‍♀", "🧘", "🧘‍♂", "🏄‍♀", "🏄", "🏄‍♂", "🏊‍♀", "🏊", "🏊‍♂", "🤽‍♀", "🤽", "🤽‍♂", "🚣‍♀", "🚣", "🚣‍♂", "🧗‍♀", "🧗", "🧗‍♂", "🚵‍♀", "🚵", "🚵‍♂", "🚴‍♀", "🚴", "🚴‍♂", "🤹‍♀", "🤹", "🤹‍♂", "🛀"
    };

    public static final String[][] dataColored = {
            new String[]{
                    "😀", "😃", "😄", "😁", "😆", "😅", "😂", "🤣", "🥲", "☺", "😊", "😇", "🙂", "🙃", "😉", "😌", "😍", "🥰", "😘", "😗", "😙", "😚", "😋", "😛", "😝", "😜", "🤪", "🤨", "🧐", "🤓", "😎", "🥸", "🤩", "🥳", "😏", "😒", "😞", "😔", "😟", "😕", "🙁", "☹", "😣", "😖", "😫", "😩", "🥺", "😢", "😭", "😤", "😠", "😡", "🤬", "🤯", "😳", "🥵", "🥶", "😶‍🌫", "😱", "😨", "😰", "😥", "😓", "🤗", "🤔", "🤭", "🤫", "🤥", "😶", "😐", "😑", "😬", "🙄", "😯", "😦", "😧", "😮", "😲", "🥱", "😴", "🤤", "😪", "😮‍💨", "😵", "😵‍💫", "🤐", "🥴", "🤢", "🤮", "🤧", "😷", "🤒", "🤕", "🤑", "🤠", "😈", "👿", "👹", "👺", "🤡", "💩", "👻", "💀", "☠", "👽", "👾", "🤖", "🎃", "😺", "😸", "😹", "😻", "😼", "😽", "🙀", "😿", "😾",
                    "🤲", "👐", "🙌", "👏", "🤝", "👍", "👎", "👊", "✊", "🤛", "🤜", "🤞", "✌", "🤟", "🤘", "👌", "🤌", "🤏", "👈", "👉", "👆", "👇", "☝", "✋", "🤚", "🖐", "🖖", "👋", "🤙", "💪", "🦾", "🖕", "✍", "🙏", "🦶", "🦵", "🦿", "💄", "💋", "👄", "🦷", "👅", "👂", "🦻", "👃", "👣", "👁", "👀", "🫀", "🫁", "🧠", "🗣", "👤", "👥", "🫂",
                    "👶", "👧", "🧒", "👦", "👩", "🧑", "👨", "👩‍🦱", "🧑‍🦱", "👨‍🦱", "👩‍🦰", "🧑‍🦰", "👨‍🦰", "👱‍♀", "👱", "👱‍♂", "👩‍🦳", "🧑‍🦳", "👨‍🦳", "👩‍🦲", "🧑‍🦲", "👨‍🦲", "🧔‍♀", "🧔", "🧔‍♂", "👵", "🧓", "👴", "👲", "👳‍♀", "👳", "👳‍♂", "🧕", "👮‍♀", "👮", "👮‍♂", "👷‍♀", "👷", "👷‍♂", "💂‍♀", "💂", "💂‍♂", "🕵‍♀", "🕵", "🕵‍♂", "👩‍⚕", "🧑‍⚕", "👨‍⚕", "👩‍🌾", "🧑‍🌾", "👨‍🌾", "👩‍🍳", "🧑‍🍳", "👨‍🍳", "👩‍🎓", "🧑‍🎓", "👨‍🎓", "👩‍🎤", "🧑‍🎤", "👨‍🎤", "👩‍🏫", "🧑‍🏫", "👨‍🏫", "👩‍🏭", "🧑‍🏭", "👨‍🏭", "👩‍💻", "🧑‍💻", "👨‍💻", "👩‍💼", "🧑‍💼", "👨‍💼", "👩‍🔧", "🧑‍🔧", "👨‍🔧", "👩‍🔬", "🧑‍🔬", "👨‍🔬", "👩‍🎨", "🧑‍🎨", "👨‍🎨", "👩‍🚒", "🧑‍🚒", "👨‍🚒", "👩‍✈", "🧑‍✈", "👨‍✈", "👩‍🚀", "🧑‍🚀", "👨‍🚀", "👩‍⚖", "🧑‍⚖", "👨‍⚖", "👰‍♀", "👰", "👰‍♂", "🤵‍♀", "🤵", "🤵‍♂", "👸", "🤴", "🥷", "🦸‍♀", "🦸", "🦸‍♂", "🦹‍♀", "🦹", "🦹‍♂", "🤶", "🧑‍🎄", "🎅", "🧙‍♀", "🧙", "🧙‍♂", "🧝‍♀", "🧝", "🧝‍♂", "🧛‍♀", "🧛", "🧛‍♂", "🧟‍♀", "🧟", "🧟‍♂", "🧞‍♀", "🧞", "🧞‍♂", "🧜‍♀", "🧜", "🧜‍♂", "🧚‍♀", "🧚", "🧚‍♂", "👼", "🤰", "🤱", "👩‍🍼", "🧑‍🍼", "👨‍🍼", "🙇‍♀", "🙇", "🙇‍♂", "💁‍♀", "💁", "💁‍♂", "🙅‍♀", "🙅", "🙅‍♂", "🙆‍♀", "🙆", "🙆‍♂", "🙋‍♀", "🙋", "🙋‍♂", "🧏‍♀", "🧏", "🧏‍♂", "🤦‍♀", "🤦", "🤦‍♂", "🤷‍♀", "🤷", "🤷‍♂", "🙎‍♀", "🙎", "🙎‍♂", "🙍‍♀", "🙍", "🙍‍♂", "💇‍♀", "💇", "💇‍♂", "💆‍♀", "💆", "💆‍♂", "🧖‍♀", "🧖", "🧖‍♂", "💅", "🤳", "💃", "🕺", "👯‍♀", "👯", "👯‍♂", "🕴", "👩‍🦽", "🧑‍🦽", "👨‍🦽", "👩‍🦼", "🧑‍🦼", "👨‍🦼", "🚶‍♀", "🚶", "🚶‍♂", "👩‍🦯", "🧑‍🦯", "👨‍🦯", "🧎‍♀", "🧎", "🧎‍♂", "🏃‍♀", "🏃", "🏃‍♂", "🧍‍♀", "🧍", "🧍‍♂", "👫", "👭", "👬", "👩‍❤‍👨", "👩‍❤‍👩", "💑", "👨‍❤‍👨", "👩‍❤‍💋‍👨", "👩‍❤‍💋‍👩", "💏", "👨‍❤‍💋‍👨",
                    "👨‍👩‍👦", "👨‍👩‍👧", "👨‍👩‍👧‍👦", "👨‍👩‍👦‍👦", "👨‍👩‍👧‍👧", "👩‍👩‍👦", "👩‍👩‍👧", "👩‍👩‍👧‍👦", "👩‍👩‍👦‍👦", "👩‍👩‍👧‍👧", "👨‍👨‍👦", "👨‍👨‍👧", "👨‍👨‍👧‍👦", "👨‍👨‍👦‍👦", "👨‍👨‍👧‍👧", "👩‍👦", "👩‍👧", "👩‍👧‍👦", "👩‍👦‍👦", "👩‍👧‍👧", "👨‍👦", "👨‍👧", "👨‍👧‍👦", "👨‍👦‍👦", "👨‍👧‍👧", "🪢", "🧶", "🧵", "🪡", "🧥", "🥼", "🦺", "👚", "👕", "👖", "🩲", "🩳", "👔", "👗", "👙", "🩱", "👘", "🥻", "🩴", "🥿", "👠", "👡", "👢", "👞", "👟", "🥾", "🧦", "🧤", "🧣", "🎩", "🧢", "👒", "🎓", "⛑", "🪖", "👑", "💍", "👝", "👛", "👜", "💼", "🎒", "🧳", "👓", "🕶", "🥽", "🌂"
            },
            null,
            null,
            new String[]{
                    "⚽", "🏀", "🏈", "⚾", "🥎", "🎾", "🏐", "🏉", "🥏", "🎱", "🪀", "🏓", "🏸", "🏒", "🏑", "🥍", "🏏", "🪃", "🥅", "⛳", "🪁", "🏹", "🎣", "🤿", "🥊", "🥋", "🎽", "🛹", "🛼", "🛷", "⛸", "🥌", "🎿", "⛷", "🏂", "🪂", "🏋‍♀", "🏋", "🏋‍♂",
                    "🤼‍♀", "🤼", "🤼‍♂", "🤸‍♀", "🤸", "🤸‍♂", "⛹‍♀", "⛹", "⛹‍♂", "🤺", "🤾‍♀", "🤾", "🤾‍♂", "🏌‍♀", "🏌", "🏌‍♂", "🏇", "🧘‍♀", "🧘", "🧘‍♂", "🏄‍♀", "🏄", "🏄‍♂", "🏊‍♀", "🏊", "🏊‍♂", "🤽‍♀", "🤽", "🤽‍♂", "🚣‍♀", "🚣", "🚣‍♂", "🧗‍♀", "🧗", "🧗‍♂", "🚵‍♀", "🚵", "🚵‍♂", "🚴‍♀", "🚴", "🚴‍♂", "🏆", "🥇", "🥈", "🥉", "🏅", "🎖", "🏵", "🎗", "🎫", "🎟", "🎪", "🤹‍♀", "🤹", "🤹‍♂",
                    "🎭", "🩰", "🎨", "🎬", "🎤", "🎧", "🎼", "🎹", "🥁", "🪘", "🎷", "🎺", "🪗", "🎸", "🪕", "🎻", "🎲", "♟", "🎯", "🎳", "🎮", "🎰", "🧩"
            },
            null,
            new String[]{
                    "⌚", "📱", "📲", "💻", "⌨", "🖥", "🖨", "🖱", "🖲", "🕹", "🗜", "💽", "💾", "💿", "📀", "📼", "📷", "📸", "📹", "🎥", "📽", "🎞", "📞", "☎", "📟", "📠", "📺", "📻", "🎙", "🎚", "🎛", "🧭", "⏱", "⏲", "⏰", "🕰", "⌛", "⏳", "📡", "🔋", "🔌", "💡", "🔦", "🕯", "🪔", "🧯", "🛢", "💸", "💵", "💴", "💶", "💷", "🪙", "💰", "💳", "💎", "⚖", "🪜", "🧰", "🪛", "🔧", "🔨", "⚒", "🛠", "⛏", "🪚", "🔩", "⚙", "🪤", "🧱", "⛓", "🧲", "🔫", "💣", "🧨", "🪓", "🔪", "🗡", "⚔", "🛡", "🚬", "⚰", "🪦", "⚱", "🏺", "🔮", "📿", "🧿", "💈", "⚗", "🔭", "🔬", "🕳", "🩹", "🩺", "💊", "💉", "🩸", "🧬", "🦠", "🧫", "🧪", "🌡", "🧹", "🪠", "🧺", "🧻", "🚽", "🚰", "🚿", "🛁", "🛀",
                    "🧼", "🪥", "🪒", "🧽", "🪣", "🧴", "🛎", "🔑", "🗝", "🚪", "🪑", "🛋", "🛏", "🛌", "🧸", "🪆", "🖼", "🪞", "🪟", "🛍", "🛒", "🎁", "🎈", "🎏", "🎀", "🪄", "🪅", "🎊", "🎉", "🎎", "🏮", "🎐", "🧧", "✉", "📩", "📨", "📧", "💌", "📥", "📤", "📦", "🏷", "🪧", "📪", "📫", "📬", "📭", "📮", "📯", "📜", "📃", "📄", "📑", "🧾", "📊", "📈", "📉", "🗒", "🗓", "📆", "📅", "🗑", "📇", "🗃", "🗳", "🗄", "📋", "📁", "📂", "🗂", "🗞", "📰", "📓", "📔", "📒", "📕", "📗", "📘", "📙", "📚", "📖", "🔖", "🧷", "🔗", "📎", "🖇", "📐", "📏", "🧮", "📌", "📍", "✂", "🖊", "🖋", "✒", "🖌", "🖍", "📝", "✏", "🔍", "🔎", "🔏", "🔐", "🔒", "🔓"
            },
            null,
            null
    };

    public static final String[][] data = {
            new String[]{
                    "😀", "😃", "😄", "😁", "😆", "😅", "😂", "🤣", "🥲", "☺", "😊", "😇", "🙂", "🙃", "😉", "😌", "😍", "🥰", "😘", "😗", "😙", "😚", "😋", "😛", "😝", "😜", "🤪", "🤨", "🧐", "🤓", "😎", "🥸", "🤩", "🥳", "😏", "😒", "😞", "😔", "😟", "😕", "🙁", "☹", "😣", "😖", "😫", "😩", "🥺", "😢", "😭", "😤", "😠", "😡", "🤬", "🤯", "😳", "🥵", "🥶", "😶‍🌫", "😱", "😨", "😰", "😥", "😓", "🤗", "🤔", "🤭", "🤫", "🤥", "😶", "😐", "😑", "😬", "🙄", "😯", "😦", "😧", "😮", "😲", "🥱", "😴", "🤤", "😪", "😮‍💨", "😵", "😵‍💫", "🤐", "🥴", "🤢", "🤮", "🤧", "😷", "🤒", "🤕", "🤑", "🤠", "😈", "👿", "👹", "👺", "🤡", "💩", "👻", "💀", "☠", "👽", "👾", "🤖", "🎃", "😺", "😸", "😹", "😻", "😼", "😽", "🙀", "😿", "😾", "🤲", "🤲🏻", "🤲🏼", "🤲🏽", "🤲🏾", "🤲🏿", "👐", "👐🏻", "👐🏼", "👐🏽", "👐🏾", "👐🏿", "🙌", "🙌🏻", "🙌🏼", "🙌🏽", "🙌🏾", "🙌🏿", "👏", "👏🏻", "👏🏼", "👏🏽", "👏🏾", "👏🏿", "🤝", "👍", "👍🏻", "👍🏼", "👍🏽", "👍🏾", "👍🏿", "👎", "👎🏻", "👎🏼", "👎🏽", "👎🏾", "👎🏿", "👊", "👊🏻", "👊🏼", "👊🏽", "👊🏾", "👊🏿", "✊", "✊🏻", "✊🏼", "✊🏽", "✊🏾", "✊🏿", "🤛", "🤛🏻", "🤛🏼", "🤛🏽", "🤛🏾", "🤛🏿", "🤜", "🤜🏻", "🤜🏼", "🤜🏽", "🤜🏾", "🤜🏿", "🤞", "🤞🏻", "🤞🏼", "🤞🏽", "🤞🏾", "🤞🏿", "✌", "✌🏻", "✌🏼", "✌🏽", "✌🏾", "✌🏿", "🤟", "🤟🏻", "🤟🏼", "🤟🏽", "🤟🏾", "🤟🏿", "🤘", "🤘🏻", "🤘🏼", "🤘🏽", "🤘🏾", "🤘🏿", "👌", "👌🏻", "👌🏼", "👌🏽", "👌🏾", "👌🏿", "🤌", "🤌🏻", "🤌🏼", "🤌🏽", "🤌🏾", "🤌🏿", "🤏", "🤏🏻", "🤏🏼", "🤏🏽", "🤏🏾", "🤏🏿", "👈", "👈🏻", "👈🏼", "👈🏽", "👈🏾", "👈🏿", "👉", "👉🏻", "👉🏼", "👉🏽", "👉🏾", "👉🏿", "👆", "👆🏻", "👆🏼", "👆🏽", "👆🏾", "👆🏿", "👇", "👇🏻", "👇🏼", "👇🏽", "👇🏾", "👇🏿", "☝", "☝🏻", "☝🏼", "☝🏽", "☝🏾", "☝🏿", "✋", "✋🏻", "✋🏼", "✋🏽", "✋🏾", "✋🏿", "🤚", "🤚🏻", "🤚🏼", "🤚🏽", "🤚🏾", "🤚🏿", "🖐", "🖐🏻", "🖐🏼", "🖐🏽", "🖐🏾", "🖐🏿", "🖖", "🖖🏻", "🖖🏼", "🖖🏽", "🖖🏾", "🖖🏿", "👋", "👋🏻", "👋🏼", "👋🏽", "👋🏾", "👋🏿", "🤙", "🤙🏻", "🤙🏼", "🤙🏽", "🤙🏾", "🤙🏿", "💪", "💪🏻", "💪🏼", "💪🏽", "💪🏾", "💪🏿", "🦾", "🖕", "🖕🏻", "🖕🏼", "🖕🏽", "🖕🏾", "🖕🏿", "✍", "✍🏻", "✍🏼", "✍🏽", "✍🏾", "✍🏿", "🙏", "🙏🏻", "🙏🏼", "🙏🏽", "🙏🏾", "🙏🏿", "🦶", "🦶🏻", "🦶🏼", "🦶🏽", "🦶🏾", "🦶🏿", "🦵", "🦵🏻", "🦵🏼", "🦵🏽", "🦵🏾", "🦵🏿", "🦿", "💄", "💋", "👄", "🦷", "👅", "👂", "👂🏻", "👂🏼", "👂🏽", "👂🏾", "👂🏿", "🦻", "🦻🏻", "🦻🏼", "🦻🏽", "🦻🏾", "🦻🏿", "👃", "👃🏻", "👃🏼", "👃🏽", "👃🏾", "👃🏿", "👣", "👁", "👀", "🫀", "🫁", "🧠", "🗣", "👤", "👥", "🫂", "👶", "👶🏻", "👶🏼", "👶🏽", "👶🏾", "👶🏿", "👧", "👧🏻", "👧🏼", "👧🏽", "👧🏾", "👧🏿", "🧒", "🧒🏻", "🧒🏼", "🧒🏽", "🧒🏾", "🧒🏿", "👦", "👦🏻", "👦🏼", "👦🏽", "👦🏾", "👦🏿", "👩", "👩🏻", "👩🏼", "👩🏽", "👩🏾", "👩🏿", "🧑", "🧑🏻", "🧑🏼", "🧑🏽", "🧑🏾", "🧑🏿", "👨", "👨🏻", "👨🏼", "👨🏽", "👨🏾", "👨🏿", "👩‍🦱", "👩🏻‍🦱", "👩🏼‍🦱", "👩🏽‍🦱", "👩🏾‍🦱", "👩🏿‍🦱", "🧑‍🦱", "🧑🏻‍🦱", "🧑🏼‍🦱", "🧑🏽‍🦱", "🧑🏾‍🦱", "🧑🏿‍🦱", "👨‍🦱", "👨🏻‍🦱", "👨🏼‍🦱", "👨🏽‍🦱", "👨🏾‍🦱", "👨🏿‍🦱", "👩‍🦰", "👩🏻‍🦰", "👩🏼‍🦰", "👩🏽‍🦰", "👩🏾‍🦰", "👩🏿‍🦰", "🧑‍🦰", "🧑🏻‍🦰", "🧑🏼‍🦰", "🧑🏽‍🦰", "🧑🏾‍🦰", "🧑🏿‍🦰", "👨‍🦰", "👨🏻‍🦰", "👨🏼‍🦰", "👨🏽‍🦰", "👨🏾‍🦰", "👨🏿‍🦰", "👱‍♀", "👱🏻‍♀", "👱🏼‍♀", "👱🏽‍♀", "👱🏾‍♀", "👱🏿‍♀", "👱", "👱🏻", "👱🏼", "👱🏽", "👱🏾", "👱🏿", "👱‍♂", "👱🏻‍♂", "👱🏼‍♂", "👱🏽‍♂", "👱🏾‍♂", "👱🏿‍♂", "👩‍🦳", "👩🏻‍🦳", "👩🏼‍🦳", "👩🏽‍🦳", "👩🏾‍🦳", "👩🏿‍🦳", "🧑‍🦳", "🧑🏻‍🦳", "🧑🏼‍🦳", "🧑🏽‍🦳", "🧑🏾‍🦳", "🧑🏿‍🦳", "👨‍🦳", "👨🏻‍🦳", "👨🏼‍🦳", "👨🏽‍🦳", "👨🏾‍🦳", "👨🏿‍🦳", "👩‍🦲", "👩🏻‍🦲", "👩🏼‍🦲", "👩🏽‍🦲", "👩🏾‍🦲", "👩🏿‍🦲", "🧑‍🦲", "🧑🏻‍🦲", "🧑🏼‍🦲", "🧑🏽‍🦲", "🧑🏾‍🦲", "🧑🏿‍🦲", "👨‍🦲", "👨🏻‍🦲", "👨🏼‍🦲", "👨🏽‍🦲", "👨🏾‍🦲", "👨🏿‍🦲", "🧔‍♀", "🧔🏻‍♀", "🧔🏼‍♀", "🧔🏽‍♀", "🧔🏾‍♀", "🧔🏿‍♀", "🧔", "🧔🏻", "🧔🏼", "🧔🏽", "🧔🏾", "🧔🏿", "🧔‍♂", "🧔🏻‍♂", "🧔🏼‍♂", "🧔🏽‍♂", "🧔🏾‍♂", "🧔🏿‍♂", "👵", "👵🏻", "👵🏼", "👵🏽", "👵🏾", "👵🏿", "🧓", "🧓🏻", "🧓🏼", "🧓🏽", "🧓🏾", "🧓🏿", "👴", "👴🏻", "👴🏼", "👴🏽", "👴🏾", "👴🏿", "👲", "👲🏻", "👲🏼", "👲🏽", "👲🏾", "👲🏿", "👳‍♀", "👳🏻‍♀", "👳🏼‍♀", "👳🏽‍♀", "👳🏾‍♀", "👳🏿‍♀", "👳", "👳🏻", "👳🏼", "👳🏽", "👳🏾", "👳🏿", "👳‍♂", "👳🏻‍♂", "👳🏼‍♂", "👳🏽‍♂", "👳🏾‍♂", "👳🏿‍♂", "🧕", "🧕🏻", "🧕🏼", "🧕🏽", "🧕🏾", "🧕🏿", "👮‍♀", "👮🏻‍♀", "👮🏼‍♀", "👮🏽‍♀", "👮🏾‍♀", "👮🏿‍♀", "👮", "👮🏻", "👮🏼", "👮🏽", "👮🏾", "👮🏿", "👮‍♂", "👮🏻‍♂", "👮🏼‍♂", "👮🏽‍♂", "👮🏾‍♂", "👮🏿‍♂", "👷‍♀", "👷🏻‍♀", "👷🏼‍♀", "👷🏽‍♀", "👷🏾‍♀", "👷🏿‍♀", "👷", "👷🏻", "👷🏼", "👷🏽", "👷🏾", "👷🏿", "👷‍♂", "👷🏻‍♂", "👷🏼‍♂", "👷🏽‍♂", "👷🏾‍♂", "👷🏿‍♂", "💂‍♀", "💂🏻‍♀", "💂🏼‍♀", "💂🏽‍♀", "💂🏾‍♀", "💂🏿‍♀", "💂", "💂🏻", "💂🏼", "💂🏽", "💂🏾", "💂🏿", "💂‍♂", "💂🏻‍♂", "💂🏼‍♂", "💂🏽‍♂", "💂🏾‍♂", "💂🏿‍♂", "🕵‍♀", "🕵🏻‍♀", "🕵🏼‍♀", "🕵🏽‍♀", "🕵🏾‍♀", "🕵🏿‍♀", "🕵", "🕵🏻", "🕵🏼", "🕵🏽", "🕵🏾", "🕵🏿", "🕵‍♂", "🕵🏻‍♂", "🕵🏼‍♂", "🕵🏽‍♂", "🕵🏾‍♂", "🕵🏿‍♂", "👩‍⚕", "👩🏻‍⚕", "👩🏼‍⚕", "👩🏽‍⚕", "👩🏾‍⚕", "👩🏿‍⚕", "🧑‍⚕", "🧑🏻‍⚕", "🧑🏼‍⚕", "🧑🏽‍⚕", "🧑🏾‍⚕", "🧑🏿‍⚕", "👨‍⚕", "👨🏻‍⚕", "👨🏼‍⚕", "👨🏽‍⚕", "👨🏾‍⚕", "👨🏿‍⚕", "👩‍🌾", "👩🏻‍🌾", "👩🏼‍🌾", "👩🏽‍🌾", "👩🏾‍🌾", "👩🏿‍🌾", "🧑‍🌾", "🧑🏻‍🌾", "🧑🏼‍🌾", "🧑🏽‍🌾", "🧑🏾‍🌾", "🧑🏿‍🌾", "👨‍🌾", "👨🏻‍🌾", "👨🏼‍🌾", "👨🏽‍🌾", "👨🏾‍🌾", "👨🏿‍🌾", "👩‍🍳", "👩🏻‍🍳", "👩🏼‍🍳", "👩🏽‍🍳", "👩🏾‍🍳", "👩🏿‍🍳", "🧑‍🍳", "🧑🏻‍🍳", "🧑🏼‍🍳", "🧑🏽‍🍳", "🧑🏾‍🍳", "🧑🏿‍🍳", "👨‍🍳", "👨🏻‍🍳", "👨🏼‍🍳", "👨🏽‍🍳", "👨🏾‍🍳", "👨🏿‍🍳", "👩‍🎓", "👩🏻‍🎓", "👩🏼‍🎓", "👩🏽‍🎓", "👩🏾‍🎓", "👩🏿‍🎓", "🧑‍🎓", "🧑🏻‍🎓", "🧑🏼‍🎓", "🧑🏽‍🎓", "🧑🏾‍🎓", "🧑🏿‍🎓", "👨‍🎓", "👨🏻‍🎓", "👨🏼‍🎓", "👨🏽‍🎓", "👨🏾‍🎓", "👨🏿‍🎓", "👩‍🎤", "👩🏻‍🎤", "👩🏼‍🎤", "👩🏽‍🎤", "👩🏾‍🎤", "👩🏿‍🎤", "🧑‍🎤", "🧑🏻‍🎤", "🧑🏼‍🎤", "🧑🏽‍🎤", "🧑🏾‍🎤", "🧑🏿‍🎤", "👨‍🎤", "👨🏻‍🎤", "👨🏼‍🎤", "👨🏽‍🎤", "👨🏾‍🎤", "👨🏿‍🎤", "👩‍🏫", "👩🏻‍🏫", "👩🏼‍🏫", "👩🏽‍🏫", "👩🏾‍🏫", "👩🏿‍🏫", "🧑‍🏫", "🧑🏻‍🏫", "🧑🏼‍🏫", "🧑🏽‍🏫", "🧑🏾‍🏫", "🧑🏿‍🏫", "👨‍🏫", "👨🏻‍🏫", "👨🏼‍🏫", "👨🏽‍🏫", "👨🏾‍🏫", "👨🏿‍🏫", "👩‍🏭", "👩🏻‍🏭", "👩🏼‍🏭", "👩🏽‍🏭", "👩🏾‍🏭", "👩🏿‍🏭", "🧑‍🏭", "🧑🏻‍🏭", "🧑🏼‍🏭", "🧑🏽‍🏭", "🧑🏾‍🏭", "🧑🏿‍🏭", "👨‍🏭", "👨🏻‍🏭", "👨🏼‍🏭", "👨🏽‍🏭", "👨🏾‍🏭", "👨🏿‍🏭", "👩‍💻", "👩🏻‍💻", "👩🏼‍💻", "👩🏽‍💻", "👩🏾‍💻", "👩🏿‍💻", "🧑‍💻", "🧑🏻‍💻", "🧑🏼‍💻", "🧑🏽‍💻", "🧑🏾‍💻", "🧑🏿‍💻", "👨‍💻", "👨🏻‍💻", "👨🏼‍💻", "👨🏽‍💻", "👨🏾‍💻", "👨🏿‍💻", "👩‍💼", "👩🏻‍💼", "👩🏼‍💼", "👩🏽‍💼", "👩🏾‍💼", "👩🏿‍💼", "🧑‍💼", "🧑🏻‍💼", "🧑🏼‍💼", "🧑🏽‍💼", "🧑🏾‍💼", "🧑🏿‍💼", "👨‍💼", "👨🏻‍💼", "👨🏼‍💼", "👨🏽‍💼", "👨🏾‍💼", "👨🏿‍💼", "👩‍🔧", "👩🏻‍🔧", "👩🏼‍🔧", "👩🏽‍🔧", "👩🏾‍🔧", "👩🏿‍🔧", "🧑‍🔧", "🧑🏻‍🔧", "🧑🏼‍🔧", "🧑🏽‍🔧", "🧑🏾‍🔧", "🧑🏿‍🔧", "👨‍🔧", "👨🏻‍🔧", "👨🏼‍🔧", "👨🏽‍🔧", "👨🏾‍🔧", "👨🏿‍🔧", "👩‍🔬", "👩🏻‍🔬", "👩🏼‍🔬", "👩🏽‍🔬", "👩🏾‍🔬", "👩🏿‍🔬", "🧑‍🔬", "🧑🏻‍🔬", "🧑🏼‍🔬", "🧑🏽‍🔬", "🧑🏾‍🔬", "🧑🏿‍🔬", "👨‍🔬", "👨🏻‍🔬", "👨🏼‍🔬", "👨🏽‍🔬", "👨🏾‍🔬", "👨🏿‍🔬", "👩‍🎨", "👩🏻‍🎨", "👩🏼‍🎨", "👩🏽‍🎨", "👩🏾‍🎨", "👩🏿‍🎨", "🧑‍🎨", "🧑🏻‍🎨", "🧑🏼‍🎨", "🧑🏽‍🎨", "🧑🏾‍🎨", "🧑🏿‍🎨", "👨‍🎨", "👨🏻‍🎨", "👨🏼‍🎨", "👨🏽‍🎨", "👨🏾‍🎨", "👨🏿‍🎨", "👩‍🚒", "👩🏻‍🚒", "👩🏼‍🚒", "👩🏽‍🚒", "👩🏾‍🚒", "👩🏿‍🚒", "🧑‍🚒", "🧑🏻‍🚒", "🧑🏼‍🚒", "🧑🏽‍🚒", "🧑🏾‍🚒", "🧑🏿‍🚒", "👨‍🚒", "👨🏻‍🚒", "👨🏼‍🚒", "👨🏽‍🚒", "👨🏾‍🚒", "👨🏿‍🚒", "👩‍✈", "👩🏻‍✈", "👩🏼‍✈", "👩🏽‍✈", "👩🏾‍✈", "👩🏿‍✈", "🧑‍✈", "🧑🏻‍✈", "🧑🏼‍✈", "🧑🏽‍✈", "🧑🏾‍✈", "🧑🏿‍✈", "👨‍✈", "👨🏻‍✈", "👨🏼‍✈", "👨🏽‍✈", "👨🏾‍✈", "👨🏿‍✈", "👩‍🚀", "👩🏻‍🚀", "👩🏼‍🚀", "👩🏽‍🚀", "👩🏾‍🚀", "👩🏿‍🚀", "🧑‍🚀", "🧑🏻‍🚀", "🧑🏼‍🚀", "🧑🏽‍🚀", "🧑🏾‍🚀", "🧑🏿‍🚀", "👨‍🚀", "👨🏻‍🚀", "👨🏼‍🚀", "👨🏽‍🚀", "👨🏾‍🚀", "👨🏿‍🚀", "👩‍⚖", "👩🏻‍⚖", "👩🏼‍⚖", "👩🏽‍⚖", "👩🏾‍⚖", "👩🏿‍⚖", "🧑‍⚖", "🧑🏻‍⚖", "🧑🏼‍⚖", "🧑🏽‍⚖", "🧑🏾‍⚖", "🧑🏿‍⚖", "👨‍⚖", "👨🏻‍⚖", "👨🏼‍⚖", "👨🏽‍⚖", "👨🏾‍⚖", "👨🏿‍⚖", "👰‍♀", "👰🏻‍♀", "👰🏼‍♀", "👰🏽‍♀", "👰🏾‍♀", "👰🏿‍♀", "👰", "👰🏻", "👰🏼", "👰🏽", "👰🏾", "👰🏿", "👰‍♂", "👰🏻‍♂", "👰🏼‍♂", "👰🏽‍♂", "👰🏾‍♂", "👰🏿‍♂", "🤵‍♀", "🤵🏻‍♀", "🤵🏼‍♀", "🤵🏽‍♀", "🤵🏾‍♀", "🤵🏿‍♀", "🤵", "🤵🏻", "🤵🏼", "🤵🏽", "🤵🏾", "🤵🏿", "🤵‍♂", "🤵🏻‍♂", "🤵🏼‍♂", "🤵🏽‍♂", "🤵🏾‍♂", "🤵🏿‍♂", "👸", "👸🏻", "👸🏼", "👸🏽", "👸🏾", "👸🏿", "🤴", "🤴🏻", "🤴🏼", "🤴🏽", "🤴🏾", "🤴🏿", "🥷", "🥷🏻", "🥷🏼", "🥷🏽", "🥷🏾", "🥷🏿", "🦸‍♀", "🦸🏻‍♀", "🦸🏼‍♀", "🦸🏽‍♀", "🦸🏾‍♀", "🦸🏿‍♀", "🦸", "🦸🏻", "🦸🏼", "🦸🏽", "🦸🏾", "🦸🏿", "🦸‍♂", "🦸🏻‍♂", "🦸🏼‍♂", "🦸🏽‍♂", "🦸🏾‍♂", "🦸🏿‍♂", "🦹‍♀", "🦹🏻‍♀", "🦹🏼‍♀", "🦹🏽‍♀", "🦹🏾‍♀", "🦹🏿‍♀", "🦹", "🦹🏻", "🦹🏼", "🦹🏽", "🦹🏾", "🦹🏿", "🦹‍♂", "🦹🏻‍♂", "🦹🏼‍♂", "🦹🏽‍♂", "🦹🏾‍♂", "🦹🏿‍♂", "🤶", "🤶🏻", "🤶🏼", "🤶🏽", "🤶🏾", "🤶🏿", "🧑‍🎄", "🧑🏻‍🎄", "🧑🏼‍🎄", "🧑🏽‍🎄", "🧑🏾‍🎄", "🧑🏿‍🎄", "🎅", "🎅🏻", "🎅🏼", "🎅🏽", "🎅🏾", "🎅🏿", "🧙‍♀", "🧙🏻‍♀", "🧙🏼‍♀", "🧙🏽‍♀", "🧙🏾‍♀", "🧙🏿‍♀", "🧙", "🧙🏻", "🧙🏼", "🧙🏽", "🧙🏾", "🧙🏿", "🧙‍♂", "🧙🏻‍♂", "🧙🏼‍♂", "🧙🏽‍♂", "🧙🏾‍♂", "🧙🏿‍♂", "🧝‍♀", "🧝🏻‍♀", "🧝🏼‍♀", "🧝🏽‍♀", "🧝🏾‍♀", "🧝🏿‍♀", "🧝", "🧝🏻", "🧝🏼", "🧝🏽", "🧝🏾", "🧝🏿", "🧝‍♂", "🧝🏻‍♂", "🧝🏼‍♂", "🧝🏽‍♂", "🧝🏾‍♂", "🧝🏿‍♂", "🧛‍♀", "🧛🏻‍♀", "🧛🏼‍♀", "🧛🏽‍♀", "🧛🏾‍♀", "🧛🏿‍♀", "🧛", "🧛🏻", "🧛🏼", "🧛🏽", "🧛🏾", "🧛🏿", "🧛‍♂", "🧛🏻‍♂", "🧛🏼‍♂", "🧛🏽‍♂", "🧛🏾‍♂", "🧛🏿‍♂", "🧟‍♀", "🧟", "🧟‍♂", "🧞‍♀", "🧞", "🧞‍♂", "🧜‍♀", "🧜🏻‍♀", "🧜🏼‍♀", "🧜🏽‍♀", "🧜🏾‍♀", "🧜🏿‍♀", "🧜", "🧜🏻", "🧜🏼", "🧜🏽", "🧜🏾", "🧜🏿", "🧜‍♂", "🧜🏻‍♂", "🧜🏼‍♂", "🧜🏽‍♂", "🧜🏾‍♂", "🧜🏿‍♂", "🧚‍♀", "🧚🏻‍♀", "🧚🏼‍♀", "🧚🏽‍♀", "🧚🏾‍♀", "🧚🏿‍♀", "🧚", "🧚🏻", "🧚🏼", "🧚🏽", "🧚🏾", "🧚🏿", "🧚‍♂", "🧚🏻‍♂", "🧚🏼‍♂", "🧚🏽‍♂", "🧚🏾‍♂", "🧚🏿‍♂", "👼", "👼🏻", "👼🏼", "👼🏽", "👼🏾", "👼🏿", "🤰", "🤰🏻", "🤰🏼", "🤰🏽", "🤰🏾", "🤰🏿", "🤱", "🤱🏻", "🤱🏼", "🤱🏽", "🤱🏾", "🤱🏿", "👩‍🍼", "👩🏻‍🍼", "👩🏼‍🍼", "👩🏽‍🍼", "👩🏾‍🍼", "👩🏿‍🍼", "🧑‍🍼", "🧑🏻‍🍼", "🧑🏼‍🍼", "🧑🏽‍🍼", "🧑🏾‍🍼", "🧑🏿‍🍼", "👨‍🍼", "👨🏻‍🍼", "👨🏼‍🍼", "👨🏽‍🍼", "👨🏾‍🍼", "👨🏿‍🍼", "🙇‍♀", "🙇🏻‍♀", "🙇🏼‍♀", "🙇🏽‍♀", "🙇🏾‍♀", "🙇🏿‍♀", "🙇", "🙇🏻", "🙇🏼", "🙇🏽", "🙇🏾", "🙇🏿", "🙇‍♂", "🙇🏻‍♂", "🙇🏼‍♂", "🙇🏽‍♂", "🙇🏾‍♂", "🙇🏿‍♂", "💁‍♀", "💁🏻‍♀", "💁🏼‍♀", "💁🏽‍♀", "💁🏾‍♀", "💁🏿‍♀", "💁", "💁🏻", "💁🏼", "💁🏽", "💁🏾", "💁🏿", "💁‍♂", "💁🏻‍♂", "💁🏼‍♂", "💁🏽‍♂", "💁🏾‍♂", "💁🏿‍♂", "🙅‍♀", "🙅🏻‍♀", "🙅🏼‍♀", "🙅🏽‍♀", "🙅🏾‍♀", "🙅🏿‍♀", "🙅", "🙅🏻", "🙅🏼", "🙅🏽", "🙅🏾", "🙅🏿", "🙅‍♂", "🙅🏻‍♂", "🙅🏼‍♂", "🙅🏽‍♂", "🙅🏾‍♂", "🙅🏿‍♂", "🙆‍♀", "🙆🏻‍♀", "🙆🏼‍♀", "🙆🏽‍♀", "🙆🏾‍♀", "🙆🏿‍♀", "🙆", "🙆🏻", "🙆🏼", "🙆🏽", "🙆🏾", "🙆🏿", "🙆‍♂", "🙆🏻‍♂", "🙆🏼‍♂", "🙆🏽‍♂", "🙆🏾‍♂", "🙆🏿‍♂", "🙋‍♀", "🙋🏻‍♀", "🙋🏼‍♀", "🙋🏽‍♀", "🙋🏾‍♀", "🙋🏿‍♀", "🙋", "🙋🏻", "🙋🏼", "🙋🏽", "🙋🏾", "🙋🏿", "🙋‍♂", "🙋🏻‍♂", "🙋🏼‍♂", "🙋🏽‍♂", "🙋🏾‍♂", "🙋🏿‍♂", "🧏‍♀", "🧏🏻‍♀", "🧏🏼‍♀", "🧏🏽‍♀", "🧏🏾‍♀", "🧏🏿‍♀", "🧏", "🧏🏻", "🧏🏼", "🧏🏽", "🧏🏾", "🧏🏿", "🧏‍♂", "🧏🏻‍♂", "🧏🏼‍♂", "🧏🏽‍♂", "🧏🏾‍♂", "🧏🏿‍♂", "🤦‍♀", "🤦🏻‍♀", "🤦🏼‍♀", "🤦🏽‍♀", "🤦🏾‍♀", "🤦🏿‍♀", "🤦", "🤦🏻", "🤦🏼", "🤦🏽", "🤦🏾", "🤦🏿", "🤦‍♂", "🤦🏻‍♂", "🤦🏼‍♂", "🤦🏽‍♂", "🤦🏾‍♂", "🤦🏿‍♂", "🤷‍♀", "🤷🏻‍♀", "🤷🏼‍♀", "🤷🏽‍♀", "🤷🏾‍♀", "🤷🏿‍♀", "🤷", "🤷🏻", "🤷🏼", "🤷🏽", "🤷🏾", "🤷🏿", "🤷‍♂", "🤷🏻‍♂", "🤷🏼‍♂", "🤷🏽‍♂", "🤷🏾‍♂", "🤷🏿‍♂", "🙎‍♀", "🙎🏻‍♀", "🙎🏼‍♀", "🙎🏽‍♀", "🙎🏾‍♀", "🙎🏿‍♀", "🙎", "🙎🏻", "🙎🏼", "🙎🏽", "🙎🏾", "🙎🏿", "🙎‍♂", "🙎🏻‍♂", "🙎🏼‍♂", "🙎🏽‍♂", "🙎🏾‍♂", "🙎🏿‍♂", "🙍‍♀", "🙍🏻‍♀", "🙍🏼‍♀", "🙍🏽‍♀", "🙍🏾‍♀", "🙍🏿‍♀", "🙍", "🙍🏻", "🙍🏼", "🙍🏽", "🙍🏾", "🙍🏿", "🙍‍♂", "🙍🏻‍♂", "🙍🏼‍♂", "🙍🏽‍♂", "🙍🏾‍♂", "🙍🏿‍♂", "💇‍♀", "💇🏻‍♀", "💇🏼‍♀", "💇🏽‍♀", "💇🏾‍♀", "💇🏿‍♀", "💇", "💇🏻", "💇🏼", "💇🏽", "💇🏾", "💇🏿", "💇‍♂", "💇🏻‍♂", "💇🏼‍♂", "💇🏽‍♂", "💇🏾‍♂", "💇🏿‍♂", "💆‍♀", "💆🏻‍♀", "💆🏼‍♀", "💆🏽‍♀", "💆🏾‍♀", "💆🏿‍♀", "💆", "💆🏻", "💆🏼", "💆🏽", "💆🏾", "💆🏿", "💆‍♂", "💆🏻‍♂", "💆🏼‍♂", "💆🏽‍♂", "💆🏾‍♂", "💆🏿‍♂", "🧖‍♀", "🧖🏻‍♀", "🧖🏼‍♀", "🧖🏽‍♀", "🧖🏾‍♀", "🧖🏿‍♀", "🧖", "🧖🏻", "🧖🏼", "🧖🏽", "🧖🏾", "🧖🏿", "🧖‍♂", "🧖🏻‍♂", "🧖🏼‍♂", "🧖🏽‍♂", "🧖🏾‍♂", "🧖🏿‍♂", "💅", "💅🏻", "💅🏼", "💅🏽", "💅🏾", "💅🏿", "🤳", "🤳🏻", "🤳🏼", "🤳🏽", "🤳🏾", "🤳🏿", "💃", "💃🏻", "💃🏼", "💃🏽", "💃🏾", "💃🏿", "🕺", "🕺🏻", "🕺🏼", "🕺🏽", "🕺🏾", "🕺🏿", "👯‍♀", "👯", "👯‍♂", "🕴", "🕴🏻", "🕴🏼", "🕴🏽", "🕴🏾", "🕴🏿", "👩‍🦽", "👩🏻‍🦽", "👩🏼‍🦽", "👩🏽‍🦽", "👩🏾‍🦽", "👩🏿‍🦽", "🧑‍🦽", "🧑🏻‍🦽", "🧑🏼‍🦽", "🧑🏽‍🦽", "🧑🏾‍🦽", "🧑🏿‍🦽", "👨‍🦽", "👨🏻‍🦽", "👨🏼‍🦽", "👨🏽‍🦽", "👨🏾‍🦽", "👨🏿‍🦽", "👩‍🦼", "👩🏻‍🦼", "👩🏼‍🦼", "👩🏽‍🦼", "👩🏾‍🦼", "👩🏿‍🦼", "🧑‍🦼", "🧑🏻‍🦼", "🧑🏼‍🦼", "🧑🏽‍🦼", "🧑🏾‍🦼", "🧑🏿‍🦼", "👨‍🦼", "👨🏻‍🦼", "👨🏼‍🦼", "👨🏽‍🦼", "👨🏾‍🦼", "👨🏿‍🦼", "🚶‍♀", "🚶🏻‍♀", "🚶🏼‍♀", "🚶🏽‍♀", "🚶🏾‍♀", "🚶🏿‍♀", "🚶", "🚶🏻", "🚶🏼", "🚶🏽", "🚶🏾", "🚶🏿", "🚶‍♂", "🚶🏻‍♂", "🚶🏼‍♂", "🚶🏽‍♂", "🚶🏾‍♂", "🚶🏿‍♂", "👩‍🦯", "👩🏻‍🦯", "👩🏼‍🦯", "👩🏽‍🦯", "👩🏾‍🦯", "👩🏿‍🦯", "🧑‍🦯", "🧑🏻‍🦯", "🧑🏼‍🦯", "🧑🏽‍🦯", "🧑🏾‍🦯", "🧑🏿‍🦯", "👨‍🦯", "👨🏻‍🦯", "👨🏼‍🦯", "👨🏽‍🦯", "👨🏾‍🦯", "👨🏿‍🦯", "🧎‍♀", "🧎🏻‍♀", "🧎🏼‍♀", "🧎🏽‍♀", "🧎🏾‍♀", "🧎🏿‍♀", "🧎", "🧎🏻", "🧎🏼", "🧎🏽", "🧎🏾", "🧎🏿", "🧎‍♂", "🧎🏻‍♂", "🧎🏼‍♂", "🧎🏽‍♂", "🧎🏾‍♂", "🧎🏿‍♂", "🏃‍♀", "🏃🏻‍♀", "🏃🏼‍♀", "🏃🏽‍♀", "🏃🏾‍♀", "🏃🏿‍♀", "🏃", "🏃🏻", "🏃🏼", "🏃🏽", "🏃🏾", "🏃🏿", "🏃‍♂", "🏃🏻‍♂", "🏃🏼‍♂", "🏃🏽‍♂", "🏃🏾‍♂", "🏃🏿‍♂", "🧍‍♀", "🧍🏻‍♀", "🧍🏼‍♀", "🧍🏽‍♀", "🧍🏾‍♀", "🧍🏿‍♀", "🧍", "🧍🏻", "🧍🏼", "🧍🏽", "🧍🏾", "🧍🏿", "🧍‍♂", "🧍🏻‍♂", "🧍🏼‍♂", "🧍🏽‍♂", "🧍🏾‍♂", "🧍🏿‍♂", "👫", "👫🏻", "👩🏻‍🤝‍👨🏼", "👩🏻‍🤝‍👨🏽", "👩🏻‍🤝‍👨🏾", "👩🏻‍🤝‍👨🏿", "👩🏼‍🤝‍👨🏻", "👫🏼", "👩🏼‍🤝‍👨🏽", "👩🏼‍🤝‍👨🏾", "👩🏼‍🤝‍👨🏿", "👩🏽‍🤝‍👨🏻", "👩🏽‍🤝‍👨🏼", "👫🏽", "👩🏽‍🤝‍👨🏾", "👩🏽‍🤝‍👨🏿", "👩🏾‍🤝‍👨🏻", "👩🏾‍🤝‍👨🏼", "👩🏾‍🤝‍👨🏽", "👫🏾", "👩🏾‍🤝‍👨🏿", "👩🏿‍🤝‍👨🏻", "👩🏿‍🤝‍👨🏼", "👩🏿‍🤝‍👨🏽", "👩🏿‍🤝‍👨🏾", "👫🏿", "👭", "👭🏻", "👩🏻‍🤝‍👩🏼", "👩🏻‍🤝‍👩🏽", "👩🏻‍🤝‍👩🏾", "👩🏻‍🤝‍👩🏿", "👩🏼‍🤝‍👩🏻", "👭🏼", "👩🏼‍🤝‍👩🏽", "👩🏼‍🤝‍👩🏾", "👩🏼‍🤝‍👩🏿", "👩🏽‍🤝‍👩🏻", "👩🏽‍🤝‍👩🏼", "👭🏽", "👩🏽‍🤝‍👩🏾", "👩🏽‍🤝‍👩🏿", "👩🏾‍🤝‍👩🏻", "👩🏾‍🤝‍👩🏼", "👩🏾‍🤝‍👩🏽", "👭🏾", "👩🏾‍🤝‍👩🏿", "👩🏿‍🤝‍👩🏻", "👩🏿‍🤝‍👩🏼", "👩🏿‍🤝‍👩🏽", "👩🏿‍🤝‍👩🏾", "👭🏿", "👬", "👬🏻", "👨🏻‍🤝‍👨🏼", "👨🏻‍🤝‍👨🏽", "👨🏻‍🤝‍👨🏾", "👨🏻‍🤝‍👨🏿", "👨🏼‍🤝‍👨🏻", "👬🏼", "👨🏼‍🤝‍👨🏽", "👨🏼‍🤝‍👨🏾", "👨🏼‍🤝‍👨🏿", "👨🏽‍🤝‍👨🏻", "👨🏽‍🤝‍👨🏼", "👬🏽", "👨🏽‍🤝‍👨🏾", "👨🏽‍🤝‍👨🏿", "👨🏾‍🤝‍👨🏻", "👨🏾‍🤝‍👨🏼", "👨🏾‍🤝‍👨🏽", "👬🏾", "👨🏾‍🤝‍👨🏿", "👨🏿‍🤝‍👨🏻", "👨🏿‍🤝‍👨🏼", "👨🏿‍🤝‍👨🏽", "👨🏿‍🤝‍👨🏾", "👬🏿", "👩‍❤‍👨", "👩🏻‍❤‍👨🏻", "👩🏻‍❤‍👨🏼", "👩🏻‍❤‍👨🏽", "👩🏻‍❤‍👨🏾", "👩🏻‍❤‍👨🏿", "👩🏼‍❤‍👨🏻", "👩🏼‍❤‍👨🏼", "👩🏼‍❤‍👨🏽", "👩🏼‍❤‍👨🏾", "👩🏼‍❤‍👨🏿", "👩🏽‍❤‍👨🏻", "👩🏽‍❤‍👨🏼", "👩🏽‍❤‍👨🏽", "👩🏽‍❤‍👨🏾", "👩🏽‍❤‍👨🏿", "👩🏾‍❤‍👨🏻", "👩🏾‍❤‍👨🏼", "👩🏾‍❤‍👨🏽", "👩🏾‍❤‍👨🏾", "👩🏾‍❤‍👨🏿", "👩🏿‍❤‍👨🏻", "👩🏿‍❤‍👨🏼", "👩🏿‍❤‍👨🏽", "👩🏿‍❤‍👨🏾", "👩🏿‍❤‍👨🏿", "👩‍❤‍👩", "👩🏻‍❤‍👩🏻", "👩🏻‍❤‍👩🏼", "👩🏻‍❤‍👩🏽", "👩🏻‍❤‍👩🏾", "👩🏻‍❤‍👩🏿", "👩🏼‍❤‍👩🏻", "👩🏼‍❤‍👩🏼", "👩🏼‍❤‍👩🏽", "👩🏼‍❤‍👩🏾", "👩🏼‍❤‍👩🏿", "👩🏽‍❤‍👩🏻", "👩🏽‍❤‍👩🏼", "👩🏽‍❤‍👩🏽", "👩🏽‍❤‍👩🏾", "👩🏽‍❤‍👩🏿", "👩🏾‍❤‍👩🏻", "👩🏾‍❤‍👩🏼", "👩🏾‍❤‍👩🏽", "👩🏾‍❤‍👩🏾", "👩🏾‍❤‍👩🏿", "👩🏿‍❤‍👩🏻", "👩🏿‍❤‍👩🏼", "👩🏿‍❤‍👩🏽", "👩🏿‍❤‍👩🏾", "👩🏿‍❤‍👩🏿", "💑", "🧑🏻‍❤‍🧑🏻", "🧑🏻‍❤‍🧑🏼", "🧑🏻‍❤‍🧑🏽", "🧑🏻‍❤‍🧑🏾", "🧑🏻‍❤‍🧑🏿", "🧑🏼‍❤‍🧑🏻", "🧑🏼‍❤‍🧑🏼", "🧑🏼‍❤‍🧑🏽", "🧑🏼‍❤‍🧑🏾", "🧑🏼‍❤‍🧑🏿", "🧑🏽‍❤‍🧑🏻", "🧑🏽‍❤‍🧑🏼", "🧑🏽‍❤‍🧑🏽", "🧑🏽‍❤‍🧑🏾", "🧑🏽‍❤‍🧑🏿", "🧑🏾‍❤‍🧑🏻", "🧑🏾‍❤‍🧑🏼", "🧑🏾‍❤‍🧑🏽", "🧑🏾‍❤‍🧑🏾", "🧑🏾‍❤‍🧑🏿", "🧑🏿‍❤‍🧑🏻", "🧑🏿‍❤‍🧑🏼", "🧑🏿‍❤‍🧑🏽", "🧑🏿‍❤‍🧑🏾", "🧑🏿‍❤‍🧑🏿", "👨‍❤‍👨", "👨🏻‍❤‍👨🏻", "👨🏻‍❤‍👨🏼", "👨🏻‍❤‍👨🏽", "👨🏻‍❤‍👨🏾", "👨🏻‍❤‍👨🏿", "👨🏼‍❤‍👨🏻", "👨🏼‍❤‍👨🏼", "👨🏼‍❤‍👨🏽", "👨🏼‍❤‍👨🏾", "👨🏼‍❤‍👨🏿", "👨🏽‍❤‍👨🏻", "👨🏽‍❤‍👨🏼", "👨🏽‍❤‍👨🏽", "👨🏽‍❤‍👨🏾", "👨🏽‍❤‍👨🏿", "👨🏾‍❤‍👨🏻", "👨🏾‍❤‍👨🏼", "👨🏾‍❤‍👨🏽", "👨🏾‍❤‍👨🏾", "👨🏾‍❤‍👨🏿", "👨🏿‍❤‍👨🏻", "👨🏿‍❤‍👨🏼", "👨🏿‍❤‍👨🏽", "👨🏿‍❤‍👨🏾", "👨🏿‍❤‍👨🏿", "👩‍❤‍💋‍👨", "👩🏻‍❤‍💋‍👨🏻", "👩🏻‍❤‍💋‍👨🏼", "👩🏻‍❤‍💋‍👨🏽", "👩🏻‍❤‍💋‍👨🏾", "👩🏻‍❤‍💋‍👨🏿", "👩🏼‍❤‍💋‍👨🏻", "👩🏼‍❤‍💋‍👨🏼", "👩🏼‍❤‍💋‍👨🏽", "👩🏼‍❤‍💋‍👨🏾", "👩🏼‍❤‍💋‍👨🏿", "👩🏽‍❤‍💋‍👨🏻", "👩🏽‍❤‍💋‍👨🏼", "👩🏽‍❤‍💋‍👨🏽", "👩🏽‍❤‍💋‍👨🏾", "👩🏽‍❤‍💋‍👨🏿", "👩🏾‍❤‍💋‍👨🏻", "👩🏾‍❤‍💋‍👨🏼", "👩🏾‍❤‍💋‍👨🏽", "👩🏾‍❤‍💋‍👨🏾", "👩🏾‍❤‍💋‍👨🏿", "👩🏿‍❤‍💋‍👨🏻", "👩🏿‍❤‍💋‍👨🏼", "👩🏿‍❤‍💋‍👨🏽", "👩🏿‍❤‍💋‍👨🏾", "👩🏿‍❤‍💋‍👨🏿", "👩‍❤‍💋‍👩", "👩🏻‍❤‍💋‍👩🏻", "👩🏻‍❤‍💋‍👩🏼", "👩🏻‍❤‍💋‍👩🏽", "👩🏻‍❤‍💋‍👩🏾", "👩🏻‍❤‍💋‍👩🏿", "👩🏼‍❤‍💋‍👩🏻", "👩🏼‍❤‍💋‍👩🏼", "👩🏼‍❤‍💋‍👩🏽", "👩🏼‍❤‍💋‍👩🏾", "👩🏼‍❤‍💋‍👩🏿", "👩🏽‍❤‍💋‍👩🏻", "👩🏽‍❤‍💋‍👩🏼", "👩🏽‍❤‍💋‍👩🏽", "👩🏽‍❤‍💋‍👩🏾", "👩🏽‍❤‍💋‍👩🏿", "👩🏾‍❤‍💋‍👩🏻", "👩🏾‍❤‍💋‍👩🏼", "👩🏾‍❤‍💋‍👩🏽", "👩🏾‍❤‍💋‍👩🏾", "👩🏾‍❤‍💋‍👩🏿", "👩🏿‍❤‍💋‍👩🏻", "👩🏿‍❤‍💋‍👩🏼", "👩🏿‍❤‍💋‍👩🏽", "👩🏿‍❤‍💋‍👩🏾", "👩🏿‍❤‍💋‍👩🏿", "💏", "🧑🏻‍❤‍💋‍🧑🏻", "🧑🏻‍❤‍💋‍🧑🏼", "🧑🏻‍❤‍💋‍🧑🏽", "🧑🏻‍❤‍💋‍🧑🏾", "🧑🏻‍❤‍💋‍🧑🏿", "🧑🏼‍❤‍💋‍🧑🏻", "🧑🏼‍❤‍💋‍🧑🏼", "🧑🏼‍❤‍💋‍🧑🏽", "🧑🏼‍❤‍💋‍🧑🏾", "🧑🏼‍❤‍💋‍🧑🏿", "🧑🏽‍❤‍💋‍🧑🏻", "🧑🏽‍❤‍💋‍🧑🏼", "🧑🏽‍❤‍💋‍🧑🏽", "🧑🏽‍❤‍💋‍🧑🏾", "🧑🏽‍❤‍💋‍🧑🏿", "🧑🏾‍❤‍💋‍🧑🏻", "🧑🏾‍❤‍💋‍🧑🏼", "🧑🏾‍❤‍💋‍🧑🏽", "🧑🏾‍❤‍💋‍🧑🏾", "🧑🏾‍❤‍💋‍🧑🏿", "🧑🏿‍❤‍💋‍🧑🏻", "🧑🏿‍❤‍💋‍🧑🏼", "🧑🏿‍❤‍💋‍🧑🏽", "🧑🏿‍❤‍💋‍🧑🏾", "🧑🏿‍❤‍💋‍🧑🏿", "👨‍❤‍💋‍👨", "👨🏻‍❤‍💋‍👨🏻", "👨🏻‍❤‍💋‍👨🏼", "👨🏻‍❤‍💋‍👨🏽", "👨🏻‍❤‍💋‍👨🏾", "👨🏻‍❤‍💋‍👨🏿", "👨🏼‍❤‍💋‍👨🏻", "👨🏼‍❤‍💋‍👨🏼", "👨🏼‍❤‍💋‍👨🏽", "👨🏼‍❤‍💋‍👨🏾", "👨🏼‍❤‍💋‍👨🏿", "👨🏽‍❤‍💋‍👨🏻", "👨🏽‍❤‍💋‍👨🏼", "👨🏽‍❤‍💋‍👨🏽", "👨🏽‍❤‍💋‍👨🏾", "👨🏽‍❤‍💋‍👨🏿", "👨🏾‍❤‍💋‍👨🏻", "👨🏾‍❤‍💋‍👨🏼", "👨🏾‍❤‍💋‍👨🏽", "👨🏾‍❤‍💋‍👨🏾", "👨🏾‍❤‍💋‍👨🏿", "👨🏿‍❤‍💋‍👨🏻", "👨🏿‍❤‍💋‍👨🏼", "👨🏿‍❤‍💋‍👨🏽", "👨🏿‍❤‍💋‍👨🏾", "👨🏿‍❤‍💋‍👨🏿", "👨‍👩‍👦", "👨‍👩‍👧", "👨‍👩‍👧‍👦", "👨‍👩‍👦‍👦", "👨‍👩‍👧‍👧", "👩‍👩‍👦", "👩‍👩‍👧", "👩‍👩‍👧‍👦", "👩‍👩‍👦‍👦", "👩‍👩‍👧‍👧", "👨‍👨‍👦", "👨‍👨‍👧", "👨‍👨‍👧‍👦", "👨‍👨‍👦‍👦", "👨‍👨‍👧‍👧", "👩‍👦", "👩‍👧", "👩‍👧‍👦", "👩‍👦‍👦", "👩‍👧‍👧", "👨‍👦", "👨‍👧", "👨‍👧‍👦", "👨‍👦‍👦", "👨‍👧‍👧", "🪢", "🧶", "🧵", "🪡", "🧥", "🥼", "🦺", "👚", "👕", "👖", "🩲", "🩳", "👔", "👗", "👙", "🩱", "👘", "🥻", "🩴", "🥿", "👠", "👡", "👢", "👞", "👟", "🥾", "🧦", "🧤", "🧣", "🎩", "🧢", "👒", "🎓", "⛑", "🪖", "👑", "💍", "👝", "👛", "👜", "💼", "🎒", "🧳", "👓", "🕶", "🥽", "🌂"
            },
            new String[]{
                    "🐶", "🐱", "🐭", "🐹", "🐰", "🦊", "🐻", "🐼", "🐻‍❄", "🐨", "🐯", "🦁", "🐮", "🐷", "🐽", "🐸", "🐵", "🙈", "🙉", "🙊", "🐒", "🐔", "🐧", "🐦", "🐤", "🐣", "🐥", "🦆", "🦅", "🦉", "🦇", "🐺", "🐗", "🐴", "🦄", "🐝", "🪱", "🐛", "🦋", "🐌", "🐞", "🐜", "🪰", "🪲", "🪳", "🦟", "🦗", "🕷", "🕸", "🦂", "🐢", "🐍", "🦎", "🦖", "🦕", "🐙", "🦑", "🦐", "🦞", "🦀", "🐡", "🐠", "🐟", "🐬", "🐳", "🐋", "🦈", "🦭", "🐊", "🐅", "🐆", "🦓", "🦍", "🦧", "🦣", "🐘", "🦛", "🦏", "🐪", "🐫", "🦒", "🦘", "🦬", "🐃", "🐂", "🐄", "🐎", "🐖", "🐏", "🐑", "🦙", "🐐", "🦌", "🐕", "🐩", "🦮", "🐕‍🦺", "🐈", "🐈‍⬛", "🪶", "🐓", "🦃", "🦤", "🦚", "🦜", "🦢", "🦩", "🕊", "🐇", "🦝", "🦨", "🦡", "🦫", "🦦", "🦥", "🐁", "🐀", "🐿", "🦔", "🐾", "🐉", "🐲", "🌵", "🎄", "🌲", "🌳", "🌴", "🪵", "🌱", "🌿", "☘", "🍀", "🎍", "🪴", "🎋", "🍃", "🍂", "🍁", "🍄", "🐚", "🪨", "🌾", "💐", "🌷", "🌹", "🥀", "🌺", "🌸", "🌼", "🌻", "🌞", "🌝", "🌛", "🌜", "🌚", "🌕", "🌖", "🌗", "🌘", "🌑", "🌒", "🌓", "🌔", "🌙", "🌎", "🌍", "🌏", "🪐", "💫", "⭐", "🌟", "✨", "⚡", "☄", "💥", "🔥", "🌪", "🌈", "☀", "🌤", "⛅", "🌥", "☁", "🌦", "🌧", "⛈", "🌩", "🌨", "❄", "☃", "⛄", "🌬", "💨", "💧", "💦", "☔", "☂", "🌊", "🌫"
            },
            new String[]{
                    "🍏", "🍎", "🍐", "🍊", "🍋", "🍌", "🍉", "🍇", "🍓", "🫐", "🍈", "🍒", "🍑", "🥭", "🍍", "🥥", "🥝", "🍅", "🍆", "🥑", "🥦", "🥬", "🥒", "🌶", "🫑", "🌽", "🥕", "🫒", "🧄", "🧅", "🥔", "🍠", "🥐", "🥯", "🍞", "🥖", "🥨", "🧀", "🥚", "🍳", "🧈", "🥞", "🧇", "🥓", "🥩", "🍗", "🍖", "🦴", "🌭", "🍔", "🍟", "🍕", "🫓", "🥪", "🥙", "🧆", "🌮", "🌯", "🫔", "🥗", "🥘", "🫕", "🥫", "🍝", "🍜", "🍲", "🍛", "🍣", "🍱", "🥟", "🦪", "🍤", "🍙", "🍚", "🍘", "🍥", "🥠", "🥮", "🍢", "🍡", "🍧", "🍨", "🍦", "🥧", "🧁", "🍰", "🎂", "🍮", "🍭", "🍬", "🍫", "🍿", "🍩", "🍪", "🌰", "🥜", "🍯", "🥛", "🍼", "🫖", "☕", "🍵", "🧃", "🥤", "🧋", "🍶", "🍺", "🍻", "🥂", "🍷", "🥃", "🍸", "🍹", "🧉", "🍾", "🧊", "🥄", "🍴", "🍽", "🥣", "🥡", "🥢", "🧂"
            },
            new String[]{
                    "⚽", "🏀", "🏈", "⚾", "🥎", "🎾", "🏐", "🏉", "🥏", "🎱", "🪀", "🏓", "🏸", "🏒", "🏑", "🥍", "🏏", "🪃", "🥅", "⛳", "🪁", "🏹", "🎣", "🤿", "🥊", "🥋", "🎽", "🛹", "🛼", "🛷", "⛸", "🥌", "🎿", "⛷", "🏂", "🪂", "🏋‍♀", "🏋🏻‍♀", "🏋🏼‍♀", "🏋🏽‍♀", "🏋🏾‍♀", "🏋🏿‍♀", "🏋", "🏋🏻", "🏋🏼", "🏋🏽", "🏋🏾", "🏋🏿", "🏋‍♂", "🏋🏻‍♂", "🏋🏼‍♂", "🏋🏽‍♂", "🏋🏾‍♂", "🏋🏿‍♂", "🤼‍♀", "🤼", "🤼‍♂", "🤸‍♀", "🤸🏻‍♀", "🤸🏼‍♀", "🤸🏽‍♀", "🤸🏾‍♀", "🤸🏿‍♀", "🤸", "🤸🏻", "🤸🏼", "🤸🏽", "🤸🏾", "🤸🏿", "🤸‍♂", "🤸🏻‍♂", "🤸🏼‍♂", "🤸🏽‍♂", "🤸🏾‍♂", "🤸🏿‍♂", "⛹‍♀", "⛹🏻‍♀", "⛹🏼‍♀", "⛹🏽‍♀", "⛹🏾‍♀", "⛹🏿‍♀", "⛹", "⛹🏻", "⛹🏼", "⛹🏽", "⛹🏾", "⛹🏿", "⛹‍♂", "⛹🏻‍♂", "⛹🏼‍♂", "⛹🏽‍♂", "⛹🏾‍♂", "⛹🏿‍♂", "🤺", "🤾‍♀", "🤾🏻‍♀", "🤾🏼‍♀", "🤾🏽‍♀", "🤾🏾‍♀", "🤾🏿‍♀", "🤾", "🤾🏻", "🤾🏼", "🤾🏽", "🤾🏾", "🤾🏿", "🤾‍♂", "🤾🏻‍♂", "🤾🏼‍♂", "🤾🏽‍♂", "🤾🏾‍♂", "🤾🏿‍♂", "🏌‍♀", "🏌🏻‍♀", "🏌🏼‍♀", "🏌🏽‍♀", "🏌🏾‍♀", "🏌🏿‍♀", "🏌", "🏌🏻", "🏌🏼", "🏌🏽", "🏌🏾", "🏌🏿", "🏌‍♂", "🏌🏻‍♂", "🏌🏼‍♂", "🏌🏽‍♂", "🏌🏾‍♂", "🏌🏿‍♂", "🏇", "🏇🏻", "🏇🏼", "🏇🏽", "🏇🏾", "🏇🏿", "🧘‍♀", "🧘🏻‍♀", "🧘🏼‍♀", "🧘🏽‍♀", "🧘🏾‍♀", "🧘🏿‍♀", "🧘", "🧘🏻", "🧘🏼", "🧘🏽", "🧘🏾", "🧘🏿", "🧘‍♂", "🧘🏻‍♂", "🧘🏼‍♂", "🧘🏽‍♂", "🧘🏾‍♂", "🧘🏿‍♂", "🏄‍♀", "🏄🏻‍♀", "🏄🏼‍♀", "🏄🏽‍♀", "🏄🏾‍♀", "🏄🏿‍♀", "🏄", "🏄🏻", "🏄🏼", "🏄🏽", "🏄🏾", "🏄🏿", "🏄‍♂", "🏄🏻‍♂", "🏄🏼‍♂", "🏄🏽‍♂", "🏄🏾‍♂", "🏄🏿‍♂", "🏊‍♀", "🏊🏻‍♀", "🏊🏼‍♀", "🏊🏽‍♀", "🏊🏾‍♀", "🏊🏿‍♀", "🏊", "🏊🏻", "🏊🏼", "🏊🏽", "🏊🏾", "🏊🏿", "🏊‍♂", "🏊🏻‍♂", "🏊🏼‍♂", "🏊🏽‍♂", "🏊🏾‍♂", "🏊🏿‍♂", "🤽‍♀", "🤽🏻‍♀", "🤽🏼‍♀", "🤽🏽‍♀", "🤽🏾‍♀", "🤽🏿‍♀", "🤽", "🤽🏻", "🤽🏼", "🤽🏽", "🤽🏾", "🤽🏿", "🤽‍♂", "🤽🏻‍♂", "🤽🏼‍♂", "🤽🏽‍♂", "🤽🏾‍♂", "🤽🏿‍♂", "🚣‍♀", "🚣🏻‍♀", "🚣🏼‍♀", "🚣🏽‍♀", "🚣🏾‍♀", "🚣🏿‍♀", "🚣", "🚣🏻", "🚣🏼", "🚣🏽", "🚣🏾", "🚣🏿", "🚣‍♂", "🚣🏻‍♂", "🚣🏼‍♂", "🚣🏽‍♂", "🚣🏾‍♂", "🚣🏿‍♂", "🧗‍♀", "🧗🏻‍♀", "🧗🏼‍♀", "🧗🏽‍♀", "🧗🏾‍♀", "🧗🏿‍♀", "🧗", "🧗🏻", "🧗🏼", "🧗🏽", "🧗🏾", "🧗🏿", "🧗‍♂", "🧗🏻‍♂", "🧗🏼‍♂", "🧗🏽‍♂", "🧗🏾‍♂", "🧗🏿‍♂", "🚵‍♀", "🚵🏻‍♀", "🚵🏼‍♀", "🚵🏽‍♀", "🚵🏾‍♀", "🚵🏿‍♀", "🚵", "🚵🏻", "🚵🏼", "🚵🏽", "🚵🏾", "🚵🏿", "🚵‍♂", "🚵🏻‍♂", "🚵🏼‍♂", "🚵🏽‍♂", "🚵🏾‍♂", "🚵🏿‍♂", "🚴‍♀", "🚴🏻‍♀", "🚴🏼‍♀", "🚴🏽‍♀", "🚴🏾‍♀", "🚴🏿‍♀", "🚴", "🚴🏻", "🚴🏼", "🚴🏽", "🚴🏾", "🚴🏿", "🚴‍♂", "🚴🏻‍♂", "🚴🏼‍♂", "🚴🏽‍♂", "🚴🏾‍♂", "🚴🏿‍♂", "🏆", "🥇", "🥈", "🥉", "🏅", "🎖", "🏵", "🎗", "🎫", "🎟", "🎪", "🤹‍♀", "🤹🏻‍♀", "🤹🏼‍♀", "🤹🏽‍♀", "🤹🏾‍♀", "🤹🏿‍♀", "🤹", "🤹🏻", "🤹🏼", "🤹🏽", "🤹🏾", "🤹🏿", "🤹‍♂", "🤹🏻‍♂", "🤹🏼‍♂", "🤹🏽‍♂", "🤹🏾‍♂", "🤹🏿‍♂", "🎭", "🩰", "🎨", "🎬", "🎤", "🎧", "🎼", "🎹", "🥁", "🪘", "🎷", "🎺", "🪗", "🎸", "🪕", "🎻", "🎲", "♟", "🎯", "🎳", "🎮", "🎰", "🧩"
            },
            new String[]{
                    "🚗", "🚕", "🚙", "🚌", "🚎", "🏎", "🚓", "🚑", "🚒", "🚐", "🛻", "🚚", "🚛", "🚜", "🦯", "🦽", "🦼", "🛴", "🚲", "🛵", "🏍", "🛺", "🚨", "🚔", "🚍", "🚘", "🚖", "🚡", "🚠", "🚟", "🚃", "🚋", "🚞", "🚝", "🚄", "🚅", "🚈", "🚂", "🚆", "🚇", "🚊", "🚉", "✈", "🛫", "🛬", "🛩", "💺", "🛰", "🚀", "🛸", "🚁", "🛶", "⛵", "🚤", "🛥", "🛳", "⛴", "🚢", "⚓", "🪝", "⛽", "🚧", "🚦", "🚥", "🚏", "🗺", "🗿", "🗽", "🗼", "🏰", "🏯", "🏟", "🎡", "🎢", "🎠", "⛲", "⛱", "🏖", "🏝", "🏜", "🌋", "⛰", "🏔", "🗻", "🏕", "⛺", "🛖", "🏠", "🏡", "🏘", "🏚", "🏗", "🏭", "🏢", "🏬", "🏣", "🏤", "🏥", "🏦", "🏨", "🏪", "🏫", "🏩", "💒", "🏛", "⛪", "🕌", "🕍", "🛕", "🕋", "⛩", "🛤", "🛣", "🗾", "🎑", "🏞", "🌅", "🌄", "🌠", "🎇", "🎆", "🌇", "🌆", "🏙", "🌃", "🌌", "🌉", "🌁"
            },
            new String[]{
                    "⌚", "📱", "📲", "💻", "⌨", "🖥", "🖨", "🖱", "🖲", "🕹", "🗜", "💽", "💾", "💿", "📀", "📼", "📷", "📸", "📹", "🎥", "📽", "🎞", "📞", "☎", "📟", "📠", "📺", "📻", "🎙", "🎚", "🎛", "🧭", "⏱", "⏲", "⏰", "🕰", "⌛", "⏳", "📡", "🔋", "🔌", "💡", "🔦", "🕯", "🪔", "🧯", "🛢", "💸", "💵", "💴", "💶", "💷", "🪙", "💰", "💳", "💎", "⚖", "🪜", "🧰", "🪛", "🔧", "🔨", "⚒", "🛠", "⛏", "🪚", "🔩", "⚙", "🪤", "🧱", "⛓", "🧲", "🔫", "💣", "🧨", "🪓", "🔪", "🗡", "⚔", "🛡", "🚬", "⚰", "🪦", "⚱", "🏺", "🔮", "📿", "🧿", "💈", "⚗", "🔭", "🔬", "🕳", "🩹", "🩺", "💊", "💉", "🩸", "🧬", "🦠", "🧫", "🧪", "🌡", "🧹", "🪠", "🧺", "🧻", "🚽", "🚰", "🚿", "🛁", "🛀", "🛀🏻", "🛀🏼", "🛀🏽", "🛀🏾", "🛀🏿", "🧼", "🪥", "🪒", "🧽", "🪣", "🧴", "🛎", "🔑", "🗝", "🚪", "🪑", "🛋", "🛏", "🛌", "🧸", "🪆", "🖼", "🪞", "🪟", "🛍", "🛒", "🎁", "🎈", "🎏", "🎀", "🪄", "🪅", "🎊", "🎉", "🎎", "🏮", "🎐", "🧧", "✉", "📩", "📨", "📧", "💌", "📥", "📤", "📦", "🏷", "🪧", "📪", "📫", "📬", "📭", "📮", "📯", "📜", "📃", "📄", "📑", "🧾", "📊", "📈", "📉", "🗒", "🗓", "📆", "📅", "🗑", "📇", "🗃", "🗳", "🗄", "📋", "📁", "📂", "🗂", "🗞", "📰", "📓", "📔", "📒", "📕", "📗", "📘", "📙", "📚", "📖", "🔖", "🧷", "🔗", "📎", "🖇", "📐", "📏", "🧮", "📌", "📍", "✂", "🖊", "🖋", "✒", "🖌", "🖍", "📝", "✏", "🔍", "🔎", "🔏", "🔐", "🔒", "🔓"
            },
            new String[]{
                    "❤", "🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎", "💔", "❤‍🔥", "❤‍🩹", "❣", "💕", "💞", "💓", "💗", "💖", "💘", "💝", "💟", "☮", "✝", "☪", "🕉", "☸", "✡", "🔯", "🕎", "☯", "☦", "🛐", "⛎", "♈", "♉", "♊", "♋", "♌", "♍", "♎", "♏", "♐", "♑", "♒", "♓", "🆔", "⚛", "🉑", "☢", "☣", "📴", "📳", "🈶", "🈚", "🈸", "🈺", "🈷", "✴", "🆚", "💮", "🉐", "㊙", "㊗", "🈴", "🈵", "🈹", "🈲", "🅰", "🅱", "🆎", "🆑", "🅾", "🆘", "❌", "⭕", "🛑", "⛔", "📛", "🚫", "💯", "💢", "♨", "🚷", "🚯", "🚳", "🚱", "🔞", "📵", "🚭", "❗", "❕", "❓", "❔", "‼", "⁉", "🔅", "🔆", "〽", "⚠", "🚸", "🔱", "⚜", "🔰", "♻", "✅", "🈯", "💹", "❇", "✳", "❎", "🌐", "💠", "Ⓜ", "🌀", "💤", "🏧", "🚾", "♿", "🅿", "🛗", "🈳", "🈂", "🛂", "🛃", "🛄", "🛅", "🚹", "🚺", "🚼", "⚧", "🚻", "🚮", "🎦", "📶", "🈁", "🔣", "ℹ", "🔤", "🔡", "🔠", "🆖", "🆗", "🆙", "🆒", "🆕", "🆓", "0⃣", "1⃣", "2⃣", "3⃣", "4⃣", "5⃣", "6⃣", "7⃣", "8⃣", "9⃣", "🔟", "🔢", "#⃣", "*⃣", "⏏", "▶", "⏸", "⏯", "⏹", "⏺", "⏭", "⏮", "⏩", "⏪", "⏫", "⏬", "◀", "🔼", "🔽", "➡", "⬅", "⬆", "⬇", "↗", "↘", "↙", "↖", "↕", "↔", "↪", "↩", "⤴", "⤵", "🔀", "🔁", "🔂", "🔄", "🔃", "🎵", "🎶", "➕", "➖", "➗", "✖", "♾", "💲", "💱", "™", "©", "®", "👁‍🗨", "🔚", "🔙", "🔛", "🔝", "🔜", "〰", "➰", "➿", "✔", "☑", "🔘", "🔴", "🟠", "🟡", "🟢", "🔵", "🟣", "⚫", "⚪", "🟤", "🔺", "🔻", "🔸", "🔹", "🔶", "🔷", "🔳", "🔲", "▪", "▫", "◾", "◽", "◼", "◻", "🟥", "🟧", "🟨", "🟩", "🟦", "🟪", "⬛", "⬜", "🟫", "🔈", "🔇", "🔉", "🔊", "🔔", "🔕", "📣", "📢", "💬", "💭", "🗯", "♠", "♣", "♥", "♦", "🃏", "🎴", "🀄", "🕐", "🕑", "🕒", "🕓", "🕔", "🕕", "🕖", "🕗", "🕘", "🕙", "🕚", "🕛", "🕜", "🕝", "🕞", "🕟", "🕠", "🕡", "🕢", "🕣", "🕤", "🕥", "🕦", "🕧"
            },
            new String[]{
                    "🏳", "🏴", "🏴‍☠", "🏁", "🚩", "🏳‍🌈", "🏳‍⚧", "🇺🇳", "🇦🇫", "🇦🇽", "🇦🇱", "🇩🇿", "🇦🇸", "🇦🇩", "🇦🇴", "🇦🇮", "🇦🇶", "🇦🇬", "🇦🇷", "🇦🇲", "🇦🇼", "🇦🇺", "🇦🇹", "🇦🇿", "🇧🇸", "🇧🇭", "🇧🇩", "🇧🇧", "🇧🇾", "🇧🇪", "🇧🇿", "🇧🇯", "🇧🇲", "🇧🇹", "🇧🇴", "🇧🇦", "🇧🇼", "🇧🇷", "🇻🇬", "🇧🇳", "🇧🇬", "🇧🇫", "🇧🇮", "🇰🇭", "🇨🇲", "🇨🇦", "🇮🇨", "🇨🇻", "🇧🇶", "🇰🇾", "🇨🇫", "🇹🇩", "🇮🇴", "🇨🇱", "🇨🇳", "🇨🇽", "🇨🇨", "🇨🇴", "🇰🇲", "🇨🇬", "🇨🇩", "🇨🇰", "🇨🇷", "🇨🇮", "🇭🇷", "🇨🇺", "🇨🇼", "🇨🇾", "🇨🇿", "🇩🇰", "🇩🇯", "🇩🇲", "🇩🇴", "🇪🇨", "🇪🇬", "🇸🇻", "🇬🇶", "🇪🇷", "🇪🇪", "🇸🇿", "🇪🇹", "🇪🇺", "🇫🇰", "🇫🇴", "🇫🇯", "🇫🇮", "🇫🇷", "🇬🇫", "🇵🇫", "🇹🇫", "🇬🇦", "🇬🇲", "🇬🇪", "🇩🇪", "🇬🇭", "🇬🇮", "🇬🇷", "🇬🇱", "🇬🇩", "🇬🇵", "🇬🇺", "🇬🇹", "🇬🇬", "🇬🇳", "🇬🇼", "🇬🇾", "🇭🇹", "🇭🇳", "🇭🇰", "🇭🇺", "🇮🇸", "🇮🇳", "🇮🇩", "🇮🇷", "🇮🇶", "🇮🇪", "🇮🇲", "🇮🇱", "🇮🇹", "🇯🇲", "🇯🇵", "🎌", "🇯🇪", "🇯🇴", "🇰🇿", "🇰🇪", "🇰🇮", "🇽🇰", "🇰🇼", "🇰🇬", "🇱🇦", "🇱🇻", "🇱🇧", "🇱🇸", "🇱🇷", "🇱🇾", "🇱🇮", "🇱🇹", "🇱🇺", "🇲🇴", "🇲🇬", "🇲🇼", "🇲🇾", "🇲🇻", "🇲🇱", "🇲🇹", "🇲🇭", "🇲🇶", "🇲🇷", "🇲🇺", "🇾🇹", "🇲🇽", "🇫🇲", "🇲🇩", "🇲🇨", "🇲🇳", "🇲🇪", "🇲🇸", "🇲🇦", "🇲🇿", "🇲🇲", "🇳🇦", "🇳🇷", "🇳🇵", "🇳🇱", "🇳🇨", "🇳🇿", "🇳🇮", "🇳🇪", "🇳🇬", "🇳🇺", "🇳🇫", "🇰🇵", "🇲🇰", "🇲🇵", "🇳🇴", "🇴🇲", "🇵🇰", "🇵🇼", "🇵🇸", "🇵🇦", "🇵🇬", "🇵🇾", "🇵🇪", "🇵🇭", "🇵🇳", "🇵🇱", "🇵🇹", "🇵🇷", "🇶🇦", "🇷🇪", "🇷🇴", "🇷🇺", "🇷🇼", "🇼🇸", "🇸🇲", "🇸🇹", "🇸🇦", "🇸🇳", "🇷🇸", "🇸🇨", "🇸🇱", "🇸🇬", "🇸🇽", "🇸🇰", "🇸🇮", "🇬🇸", "🇸🇧", "🇸🇴", "🇿🇦", "🇰🇷", "🇸🇸", "🇪🇸", "🇱🇰", "🇧🇱", "🇸🇭", "🇰🇳", "🇱🇨", "🇵🇲", "🇻🇨", "🇸🇩", "🇸🇷", "🇸🇪", "🇨🇭", "🇸🇾", "🇹🇼", "🇹🇯", "🇹🇿", "🇹🇭", "🇹🇱", "🇹🇬", "🇹🇰", "🇹🇴", "🇹🇹", "🇹🇳", "🇹🇷", "🇹🇲", "🇹🇨", "🇹🇻", "🇺🇬", "🇺🇦", "🇦🇪", "🇬🇧", "🏴󠁧󠁢󠁥󠁮󠁧󠁿", "🏴󠁧󠁢󠁳󠁣󠁴󠁿", "🏴󠁧󠁢󠁷󠁬󠁳󠁿", "🇺🇸", "🇺🇾", "🇻🇮", "🇺🇿", "🇻🇺", "🇻🇦", "🇻🇪", "🇻🇳", "🇼🇫", "🇪🇭", "🇾🇪", "🇿🇲", "🇿🇼"
            }
    };


    protected static final HashSet<String> emojiColoredMap = new HashSet<>(emojiColored.length);

    static {
        Collections.addAll(emojiColoredMap, emojiColored);
        for (int a = 0; a < dataColored.length; a++) {
            if (dataColored[a] == null) {
                dataColored[a] = data[a];
            }
        }
    }

    private AXIOSEmojiData(){}

    @Override
    public String[][] getData() {
        return data;
    }

    @Override
    public String[][] getDataColored() {
        return dataColored;
    }

    @Override
    public boolean isColoredEmoji(String code) {
        return emojiColoredMap.contains(getBaseEmoji(code));
    }

    @Override
    public int getEmojiCount(int category) {
        return data[category].length;
    }

    @Override
    public String getEmojiFolderNameInAssets() {
        return "ios_emoji";
    }
}