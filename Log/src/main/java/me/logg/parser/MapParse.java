/*
 * Copyright 2016-2018 RockyQu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.logg.parser;

import me.logg.config.LoggConstant;
import me.logg.util.Utils;

import java.util.Map;
import java.util.Set;

/**
 * Map
 */
public class MapParse implements Parser<Map> {

    @Override
    public Class<Map> parseClassType() {
        return Map.class;
    }

    @Override
    public String parseString(Map map) {
        StringBuilder msg = new StringBuilder()
                .append(LoggConstant.SPACE).append(LoggConstant.BR).append(map.getClass().getName())
                .append(LoggConstant.SPACE).append(LoggConstant.BR).append("[").append(LoggConstant.BR);

        Set keys = map.keySet();
        for (Object key : keys) {
            String itemString = "%s -> %s" + LoggConstant.BR;
            Object value = map.get(key);
            if (value != null) {
                if (value instanceof String) {
                    value = "\"" + value + "\"";
                } else if (value instanceof Character) {
                    value = "\'" + value + "\'";
                }
            }
            msg.append(LoggConstant.SPACE).append(LoggConstant.SPACE).append(LoggConstant.SPACE).append(LoggConstant.SPACE)
                    .append(String.format(itemString, Utils.objectToString(key),
                    Utils.objectToString(value)));
        }
        return msg.append("]").toString();
    }
}
