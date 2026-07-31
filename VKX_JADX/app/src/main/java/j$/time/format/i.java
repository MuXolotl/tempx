package j$.time.format;

import androidx.car.app.hardware.info.EnergyProfile;
import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements e {
    public static final ConcurrentHashMap c = new ConcurrentHashMap(16, 0.75f, 2);
    public final FormatStyle a;
    public final FormatStyle b;

    public i(FormatStyle formatStyle, FormatStyle formatStyle2) {
        this.a = formatStyle;
        this.b = formatStyle2;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x023f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x0241  */
    /* JADX WARN: Code duplicated, block: B:147:0x0246 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x0248  */
    /* JADX WARN: Code duplicated, block: B:156:0x0266  */
    /* JADX WARN: Code duplicated, block: B:177:0x0297  */
    /* JADX WARN: Code duplicated, block: B:179:0x029b  */
    /* JADX WARN: Code duplicated, block: B:180:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:182:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:183:0x02ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:185:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:186:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:292:0x0461  */
    /* JADX WARN: Code duplicated, block: B:294:0x046b  */
    /* JADX WARN: Code duplicated, block: B:295:0x046f  */
    /* JADX WARN: Code duplicated, block: B:333:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x047a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final DateTimeFormatter a(Locale locale, j$.time.chrono.j jVar) {
        int i;
        String strSubstring;
        boolean z;
        int i2;
        String strI = jVar.i();
        String string = locale.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(strI);
        sb.append("|");
        sb.append(string);
        sb.append("|");
        FormatStyle formatStyle = this.a;
        sb.append(formatStyle);
        FormatStyle formatStyle2 = this.b;
        sb.append(formatStyle2);
        String string2 = sb.toString();
        ConcurrentHashMap concurrentHashMap = c;
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.get(string2);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        j$.time.f fVar = DateTimeFormatterBuilder.h;
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        if (!(dateTimeInstance instanceof SimpleDateFormat)) {
            throw new UnsupportedOperationException("Can't determine pattern from " + dateTimeInstance);
        }
        String pattern = ((SimpleDateFormat) dateTimeInstance).toPattern();
        char c2 = ' ';
        int i3 = -1;
        if (pattern == null) {
            pattern = null;
        } else {
            boolean z2 = pattern.indexOf(66) != -1;
            boolean z3 = pattern.indexOf(98) != -1;
            if (z2 || z3) {
                StringBuilder sb2 = new StringBuilder(pattern.length());
                char c3 = ' ';
                int i4 = 0;
                while (i4 < pattern.length()) {
                    char cCharAt = pattern.charAt(i4);
                    if (cCharAt != ' ') {
                        if (cCharAt != 'B' && cCharAt != 'b') {
                            sb2.append(cCharAt);
                        }
                    } else if (i4 == 0 || (c3 != 'B' && c3 != 'b')) {
                        sb2.append(cCharAt);
                    }
                    i4++;
                    c3 = cCharAt;
                }
                int length = sb2.length() - 1;
                if (length >= 0 && sb2.charAt(length) == ' ') {
                    sb2.deleteCharAt(length);
                }
                pattern = sb2.toString();
            }
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        Objects.a(pattern, "pattern");
        int i5 = 0;
        while (i5 < pattern.length()) {
            char cCharAt2 = pattern.charAt(i5);
            if ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < 'a' || cCharAt2 > 'z')) {
                i = i3;
                if (cCharAt2 == '\'') {
                    int i6 = i5 + 1;
                    int i7 = i6;
                    while (i7 < pattern.length()) {
                        if (pattern.charAt(i7) == '\'') {
                            int i8 = i7 + 1;
                            if (i8 < pattern.length() && pattern.charAt(i8) == '\'') {
                                i7 = i8;
                            } else {
                                if (i7 < pattern.length()) {
                                    j$.time.d.c("Pattern ends with an incomplete string literal: ".concat(pattern));
                                    return null;
                                }
                                strSubstring = pattern.substring(i6, i7);
                                if (strSubstring.isEmpty()) {
                                    dateTimeFormatterBuilder.appendLiteral('\'');
                                } else {
                                    dateTimeFormatterBuilder.d(strSubstring.replace("''", "'"));
                                }
                                i5 = i7;
                            }
                        }
                        i7++;
                    }
                    if (i7 < pattern.length()) {
                        j$.time.d.c("Pattern ends with an incomplete string literal: ".concat(pattern));
                        return null;
                    }
                    strSubstring = pattern.substring(i6, i7);
                    if (strSubstring.isEmpty()) {
                        dateTimeFormatterBuilder.appendLiteral('\'');
                    } else {
                        dateTimeFormatterBuilder.d(strSubstring.replace("''", "'"));
                    }
                    i5 = i7;
                } else if (cCharAt2 == '[') {
                    dateTimeFormatterBuilder.k();
                } else if (cCharAt2 == ']') {
                    if (dateTimeFormatterBuilder.a.b == null) {
                        j$.time.d.c("Pattern invalid as it contains ] without previous [");
                        return null;
                    }
                    dateTimeFormatterBuilder.j();
                } else {
                    if (cCharAt2 == '{' || cCharAt2 == '}' || cCharAt2 == '#') {
                        throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt2 + "'");
                    }
                    dateTimeFormatterBuilder.appendLiteral(cCharAt2);
                }
            } else {
                int i9 = i5 + 1;
                while (i9 < pattern.length() && pattern.charAt(i9) == cCharAt2) {
                    i9++;
                }
                int i10 = i9 - i5;
                if (cCharAt2 == 'p') {
                    if (i9 >= pattern.length() || (((cCharAt2 = pattern.charAt(i9)) < 'A' || cCharAt2 > 'Z') && (cCharAt2 < 'a' || cCharAt2 > 'z'))) {
                        i2 = i10;
                        i10 = 0;
                    } else {
                        int i11 = i9 + 1;
                        while (i11 < pattern.length() && pattern.charAt(i11) == cCharAt2) {
                            i11++;
                        }
                        int i12 = i11;
                        i2 = i11 - i9;
                        i9 = i12;
                    }
                    if (i10 == 0) {
                        j$.time.d.c("Pad letter 'p' must be followed by valid pad pattern: ".concat(pattern));
                        return null;
                    }
                    if (i10 < 1) {
                        j$.time.d.m("The pad width must be at least one but was ", i10);
                        return null;
                    }
                    DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder.a;
                    dateTimeFormatterBuilder2.e = i10;
                    dateTimeFormatterBuilder2.f = c2;
                    dateTimeFormatterBuilder2.g = i3;
                    i10 = i2;
                }
                TemporalField temporalField = (TemporalField) ((HashMap) DateTimeFormatterBuilder.i).get(Character.valueOf(cCharAt2));
                i = i3;
                if (temporalField != null) {
                    if (cCharAt2 == 'A') {
                        dateTimeFormatterBuilder.appendValue(temporalField, i10, 19, SignStyle.NOT_NEGATIVE);
                    } else if (cCharAt2 == 'Q') {
                        z = false;
                        if (i10 != 1 || i10 == 2) {
                            if (cCharAt2 == 'e') {
                                dateTimeFormatterBuilder.h(new s(cCharAt2, i10, i10, i10, 0));
                            } else if (cCharAt2 == 'E') {
                                dateTimeFormatterBuilder.g(temporalField, TextStyle.SHORT);
                            } else if (i10 == 1) {
                                dateTimeFormatterBuilder.i(temporalField);
                            } else {
                                dateTimeFormatterBuilder.appendValue(temporalField, 2);
                            }
                        } else if (i10 == 3) {
                            dateTimeFormatterBuilder.g(temporalField, z ? TextStyle.SHORT_STANDALONE : TextStyle.SHORT);
                        } else if (i10 == 4) {
                            dateTimeFormatterBuilder.g(temporalField, z ? TextStyle.FULL_STANDALONE : TextStyle.FULL);
                        } else {
                            if (i10 != 5) {
                                j$.time.d.l("Too many pattern letters: ", cCharAt2);
                                return null;
                            }
                            dateTimeFormatterBuilder.g(temporalField, z ? TextStyle.NARROW_STANDALONE : TextStyle.NARROW);
                        }
                    } else if (cCharAt2 == 'S') {
                        dateTimeFormatterBuilder.b(ChronoField.NANO_OF_SECOND, i10, i10, false);
                    } else if (cCharAt2 == 'a') {
                        if (i10 != 1) {
                            j$.time.d.l("Too many pattern letters: ", cCharAt2);
                            return null;
                        }
                        dateTimeFormatterBuilder.g(temporalField, TextStyle.SHORT);
                    } else if (cCharAt2 != 'k') {
                        if (cCharAt2 == 'q') {
                            z = true;
                        } else if (cCharAt2 == 's') {
                            if (i10 == 1) {
                                dateTimeFormatterBuilder.i(temporalField);
                            } else {
                                if (i10 == 2) {
                                    j$.time.d.l("Too many pattern letters: ", cCharAt2);
                                    return null;
                                }
                                dateTimeFormatterBuilder.appendValue(temporalField, i10);
                            }
                        } else if (cCharAt2 == 'u' || cCharAt2 == 'y') {
                            if (i10 == 2) {
                                LocalDate localDate = p.h;
                                Objects.a(localDate, "baseDate");
                                dateTimeFormatterBuilder.h(new p(temporalField, 2, 2, localDate, 0));
                            } else if (i10 < 4) {
                                dateTimeFormatterBuilder.appendValue(temporalField, i10, 19, SignStyle.NORMAL);
                            } else {
                                dateTimeFormatterBuilder.appendValue(temporalField, i10, 19, SignStyle.EXCEEDS_PAD);
                            }
                        } else if (cCharAt2 == 'g') {
                            dateTimeFormatterBuilder.appendValue(temporalField, i10, 19, SignStyle.NORMAL);
                        } else if (cCharAt2 == 'h' || cCharAt2 == 'm') {
                            if (i10 == 1) {
                                dateTimeFormatterBuilder.i(temporalField);
                            } else {
                                if (i10 == 2) {
                                    j$.time.d.l("Too many pattern letters: ", cCharAt2);
                                    return null;
                                }
                                dateTimeFormatterBuilder.appendValue(temporalField, i10);
                            }
                        } else if (cCharAt2 != 'n') {
                            switch (cCharAt2) {
                                case 'D':
                                    if (i10 == 1) {
                                        dateTimeFormatterBuilder.i(temporalField);
                                    } else {
                                        if (i10 != 2 && i10 != 3) {
                                            j$.time.d.l("Too many pattern letters: ", cCharAt2);
                                            return null;
                                        }
                                        dateTimeFormatterBuilder.appendValue(temporalField, i10, 3, SignStyle.NOT_NEGATIVE);
                                    }
                                    break;
                                case 'E':
                                    z = false;
                                    break;
                                case 'F':
                                    if (i10 != 1) {
                                        j$.time.d.l("Too many pattern letters: ", cCharAt2);
                                        return null;
                                    }
                                    dateTimeFormatterBuilder.i(temporalField);
                                    break;
                                    break;
                                case 'G':
                                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                                        dateTimeFormatterBuilder.g(temporalField, TextStyle.SHORT);
                                    } else if (i10 == 4) {
                                        dateTimeFormatterBuilder.g(temporalField, TextStyle.FULL);
                                    } else {
                                        if (i10 != 5) {
                                            j$.time.d.l("Too many pattern letters: ", cCharAt2);
                                            return null;
                                        }
                                        dateTimeFormatterBuilder.g(temporalField, TextStyle.NARROW);
                                    }
                                    break;
                                case 'H':
                                    if (i10 == 1) {
                                        dateTimeFormatterBuilder.i(temporalField);
                                    } else {
                                        if (i10 == 2) {
                                            j$.time.d.l("Too many pattern letters: ", cCharAt2);
                                            return null;
                                        }
                                        dateTimeFormatterBuilder.appendValue(temporalField, i10);
                                    }
                                    break;
                                default:
                                    switch (cCharAt2) {
                                        case 'K':
                                            if (i10 == 1) {
                                                dateTimeFormatterBuilder.i(temporalField);
                                            } else {
                                                if (i10 == 2) {
                                                    j$.time.d.l("Too many pattern letters: ", cCharAt2);
                                                    return null;
                                                }
                                                dateTimeFormatterBuilder.appendValue(temporalField, i10);
                                            }
                                            break;
                                        case 'L':
                                            z = true;
                                            break;
                                        case 'M':
                                            z = false;
                                            break;
                                        case 'N':
                                            dateTimeFormatterBuilder.appendValue(temporalField, i10, 19, SignStyle.NOT_NEGATIVE);
                                            break;
                                        default:
                                            switch (cCharAt2) {
                                                case 'c':
                                                    if (i10 == 1) {
                                                        dateTimeFormatterBuilder.h(new s(cCharAt2, i10, i10, i10, 0));
                                                    } else {
                                                        if (i10 == 2) {
                                                            j$.time.d.c("Invalid pattern \"cc\"");
                                                            return null;
                                                        }
                                                        z = true;
                                                    }
                                                    break;
                                                case 'd':
                                                    if (i10 == 1) {
                                                        dateTimeFormatterBuilder.i(temporalField);
                                                    } else {
                                                        if (i10 == 2) {
                                                            j$.time.d.l("Too many pattern letters: ", cCharAt2);
                                                            return null;
                                                        }
                                                        dateTimeFormatterBuilder.appendValue(temporalField, i10);
                                                    }
                                                    break;
                                                case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                                    z = false;
                                                    break;
                                                default:
                                                    if (i10 != 1) {
                                                        dateTimeFormatterBuilder.appendValue(temporalField, i10);
                                                    } else {
                                                        dateTimeFormatterBuilder.i(temporalField);
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            dateTimeFormatterBuilder.appendValue(temporalField, i10, 19, SignStyle.NOT_NEGATIVE);
                        }
                        if (i10 != 1) {
                            if (cCharAt2 == 'e') {
                                dateTimeFormatterBuilder.h(new s(cCharAt2, i10, i10, i10, 0));
                            } else if (cCharAt2 == 'E') {
                                dateTimeFormatterBuilder.g(temporalField, TextStyle.SHORT);
                            } else if (i10 == 1) {
                                dateTimeFormatterBuilder.i(temporalField);
                            } else {
                                dateTimeFormatterBuilder.appendValue(temporalField, 2);
                            }
                        } else if (cCharAt2 == 'e') {
                            dateTimeFormatterBuilder.h(new s(cCharAt2, i10, i10, i10, 0));
                        } else if (cCharAt2 == 'E') {
                            dateTimeFormatterBuilder.g(temporalField, TextStyle.SHORT);
                        } else if (i10 == 1) {
                            dateTimeFormatterBuilder.i(temporalField);
                        } else {
                            dateTimeFormatterBuilder.appendValue(temporalField, 2);
                        }
                    } else if (i10 == 1) {
                        dateTimeFormatterBuilder.i(temporalField);
                    } else {
                        if (i10 == 2) {
                            j$.time.d.l("Too many pattern letters: ", cCharAt2);
                            return null;
                        }
                        dateTimeFormatterBuilder.appendValue(temporalField, i10);
                    }
                } else if (cCharAt2 == 'z') {
                    if (i10 > 4) {
                        j$.time.d.l("Too many pattern letters: ", cCharAt2);
                        return null;
                    }
                    if (i10 == 4) {
                        dateTimeFormatterBuilder.c(new u(TextStyle.FULL, false));
                    } else {
                        dateTimeFormatterBuilder.c(new u(TextStyle.SHORT, false));
                    }
                } else if (cCharAt2 == 'V') {
                    if (i10 != 2) {
                        j$.time.d.l("Pattern letter count must be 2: ", cCharAt2);
                        return null;
                    }
                    dateTimeFormatterBuilder.c(new t(j$.time.temporal.p.a, "ZoneId()"));
                } else if (cCharAt2 != 'v') {
                    String str = "+0000";
                    if (cCharAt2 == 'Z') {
                        if (i10 < 4) {
                            dateTimeFormatterBuilder.appendOffset("+HHMM", "+0000");
                        } else if (i10 == 4) {
                            dateTimeFormatterBuilder.e(TextStyle.FULL);
                        } else {
                            if (i10 != 5) {
                                j$.time.d.l("Too many pattern letters: ", cCharAt2);
                                return null;
                            }
                            dateTimeFormatterBuilder.appendOffset("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt2 == 'O') {
                        if (i10 == 1) {
                            dateTimeFormatterBuilder.e(TextStyle.SHORT);
                        } else {
                            if (i10 != 4) {
                                j$.time.d.l("Pattern letter count must be 1 or 4: ", cCharAt2);
                                return null;
                            }
                            dateTimeFormatterBuilder.e(TextStyle.FULL);
                        }
                    } else if (cCharAt2 == 'X') {
                        if (i10 > 5) {
                            j$.time.d.l("Too many pattern letters: ", cCharAt2);
                            return null;
                        }
                        dateTimeFormatterBuilder.appendOffset(k.d[i10 + (i10 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt2 == 'x') {
                        if (i10 > 5) {
                            j$.time.d.l("Too many pattern letters: ", cCharAt2);
                            return null;
                        }
                        if (i10 == 1) {
                            str = "+00";
                        } else if (i10 % 2 != 0) {
                            str = "+00:00";
                        }
                        dateTimeFormatterBuilder.appendOffset(k.d[i10 + (i10 == 1 ? 0 : 1)], str);
                    } else if (cCharAt2 == 'W') {
                        if (i10 > 1) {
                            j$.time.d.l("Too many pattern letters: ", cCharAt2);
                            return null;
                        }
                        dateTimeFormatterBuilder.h(new s(cCharAt2, i10, i10, i10, 0));
                    } else if (cCharAt2 == 'w') {
                        if (i10 > 2) {
                            j$.time.d.l("Too many pattern letters: ", cCharAt2);
                            return null;
                        }
                        dateTimeFormatterBuilder.h(new s(cCharAt2, i10, i10, 2, 0));
                    } else {
                        if (cCharAt2 != 'Y') {
                            j$.time.d.l("Unknown pattern letter: ", cCharAt2);
                            return null;
                        }
                        if (i10 == 2) {
                            dateTimeFormatterBuilder.h(new s(cCharAt2, i10, i10, 2, 0));
                        } else {
                            int i13 = i10;
                            dateTimeFormatterBuilder.h(new s(cCharAt2, i13, i13, 19, 0));
                        }
                    }
                } else if (i10 == 1) {
                    dateTimeFormatterBuilder.c(new u(TextStyle.SHORT, true));
                } else {
                    if (i10 != 4) {
                        j$.time.d.l("Wrong number of  pattern letters: ", cCharAt2);
                        return null;
                    }
                    dateTimeFormatterBuilder.c(new u(TextStyle.FULL, true));
                }
                i5 = i9 - 1;
            }
            i5++;
            i3 = i;
            c2 = ' ';
        }
        DateTimeFormatter dateTimeFormatterM = dateTimeFormatterBuilder.m(locale, d0.SMART, null);
        DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentHashMap.putIfAbsent(string2, dateTimeFormatterM);
        return dateTimeFormatter2 != null ? dateTimeFormatter2 : dateTimeFormatterM;
    }

    @Override // j$.time.format.e
    public final boolean j(x xVar, StringBuilder sb) {
        a(xVar.b.b, j$.com.android.tools.r8.a.P(xVar.a)).b().j(xVar, sb);
        return true;
    }

    @Override // j$.time.format.e
    public final int k(v vVar, CharSequence charSequence, int i) {
        return a(vVar.a.b, vVar.d()).b().k(vVar, charSequence, i);
    }

    public final String toString() {
        return "Localized(" + this.a + "," + this.b + ")";
    }
}
