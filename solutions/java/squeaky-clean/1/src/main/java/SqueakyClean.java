class SqueakyClean {
    static String clean(String identifier) {
        
        // 创建用于拼接 char 类型的 StringBuilder 对象;
        StringBuilder builder = new StringBuilder();
        
        // 将待处理的字符串转换为字符类型数组
        char[] tempChars = identifier.toCharArray();
        
        // 遍历处理
        for (int i = 0; i < tempChars.length; i++) {
            // 先将当前字符做转换处理
            char tempc = getSwitchChar(tempChars[i]);

            // 检查是否为 '_'，是则拼接并跳过
            if (tempc == '_') {
                builder.append(tempc);
                continue;
            }

            // 检查是否为 '-'，是说明下一个字符若是字母，需要转换为大写并拼接
            if (tempc == '-') {
                // 检查下一个字符是否存在
                if (i + 1 < tempChars.length) {
                    // 下一个字符存在，检查是否为字母
                    char nextChar = tempChars[i + 1];
                    if (Character.isLetter(nextChar)) {
                        builder.append(Character.toUpperCase(nextChar));
                        i++; // 因为要跳过本次的 '-' 和已经转大写的字母
                        continue;
                    } else {
                        // - 下一个不是字母，则有可能是 '_' 或特殊符号，交给下个循环体处理
                        continue;
                    }
                } else {
                    // 下一个字符不存在，结束循环
                    break;
                }
            }

            // 既不是 '-' 也不是 '_'，则检查是否为字母，是则直接拼接
            if (Character.isLetter(tempc)) {
                builder.append(tempc);
            }
        }

        // 返回
        return builder.toString();
    }

    private static char getSwitchChar(char c) {
        // 检查是否为替换字符
        if (Character.isWhitespace(c)) return '_';
        if (c == '4') return 'a';
        if (c == '3') return 'e';
        if (c == '0') return 'o';
        if (c == '1') return 'l';
        if (c == '7') return 't';
        return c;
    }
}
