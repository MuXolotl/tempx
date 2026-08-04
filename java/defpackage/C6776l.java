package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: renamed from: lؙؚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6776l extends AbstractC12990l {
    public static final C18589l admob;
    public static final Set billing;
    public static final C7502l mopub;
    public final Set amazon;
    public final Level crashlytics;
    public final String loadAd;
    public final C7502l purchase;

    static {
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(AbstractC13814l.yandex, InterfaceC6807l.yandex, AbstractC6297l.yandex)));
        billing = setUnmodifiableSet;
        C10038l c10038lAmazon = AbstractC11020l.amazon(setUnmodifiableSet);
        C7502l c7502l = new C7502l();
        HashMap map = new HashMap();
        c7502l.f15511l = map;
        HashMap map2 = new HashMap();
        c7502l.f15510l = map2;
        map.putAll((HashMap) c10038lAmazon.f20463l);
        map2.putAll((HashMap) c10038lAmazon.f20462l);
        c7502l.f15509l = (C12110l) c10038lAmazon.f20466l;
        c7502l.f15512l = (C6851l) c10038lAmazon.f20465l;
        mopub = c7502l;
        admob = new C18589l(Level.ALL, setUnmodifiableSet, c7502l);
    }

    public /* synthetic */ C6776l(String str, Level level, Set set, C7502l c7502l) {
        super(str);
        this.loadAd = AbstractC1896l.admob(str);
        this.crashlytics = level;
        this.amazon = set;
        this.purchase = c7502l;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019e  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:115:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:137:0x0231  */
    /* JADX WARN: Code duplicated, block: B:140:0x023c  */
    /* JADX WARN: Code duplicated, block: B:145:0x025a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0269  */
    /* JADX WARN: Code duplicated, block: B:154:0x0273  */
    /* JADX WARN: Code duplicated, block: B:156:0x0276  */
    /* JADX WARN: Code duplicated, block: B:162:0x0280  */
    /* JADX WARN: Code duplicated, block: B:167:0x028a  */
    /* JADX WARN: Code duplicated, block: B:169:0x028e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0296  */
    /* JADX WARN: Code duplicated, block: B:172:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:175:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:177:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:179:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:194:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:196:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:198:0x0302  */
    /* JADX WARN: Code duplicated, block: B:201:0x030f  */
    /* JADX WARN: Code duplicated, block: B:204:0x032e  */
    /* JADX WARN: Code duplicated, block: B:206:0x0332  */
    /* JADX WARN: Code duplicated, block: B:207:0x0336  */
    /* JADX WARN: Code duplicated, block: B:208:0x033c  */
    /* JADX WARN: Code duplicated, block: B:216:0x0365  */
    /* JADX WARN: Code duplicated, block: B:218:0x0370  */
    /* JADX WARN: Code duplicated, block: B:220:0x0378 A[LOOP:4: B:138:0x0233->B:220:0x0378, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:227:0x0390 A[LOOP:2: B:99:0x0198->B:227:0x0390, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:234:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:253:0x041c  */
    /* JADX WARN: Code duplicated, block: B:255:0x0422  */
    /* JADX WARN: Code duplicated, block: B:257:0x0428  */
    /* JADX WARN: Code duplicated, block: B:259:0x042f  */
    /* JADX WARN: Code duplicated, block: B:260:0x0431  */
    /* JADX WARN: Code duplicated, block: B:262:0x0434  */
    /* JADX WARN: Code duplicated, block: B:264:0x0438  */
    /* JADX WARN: Code duplicated, block: B:267:0x0455  */
    /* JADX WARN: Code duplicated, block: B:287:0x0498  */
    /* JADX WARN: Code duplicated, block: B:289:0x049c  */
    /* JADX WARN: Code duplicated, block: B:291:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:293:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x039e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x037d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x01eb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:69:0x011a A[LOOP:1: B:63:0x00f6->B:69:0x011a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133  */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:80:0x0141  */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x016f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0175  */
    /* JADX WARN: Code duplicated, block: B:97:0x0191  */
    public static void amazon(C4299l c4299l, String str, Level level, Set set, C7502l c7502l) {
        AbstractC11451l c12518l;
        StringBuilder sb;
        AbstractC6082l abstractC6082l;
        C5151l c5151l;
        AbstractC11451l abstractC11451l;
        Level level2;
        boolean z;
        Object[] objArr;
        C16979l c16979l;
        C2934l c2934l;
        boolean z2;
        String str2;
        Object[] objArr2;
        String str3;
        StringBuilder sb2;
        String str4;
        int iLoadAd;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Level level3;
        char cCharAt;
        int i9;
        char c;
        String str5;
        int i10;
        int i11;
        char cCharAt2;
        int i12;
        boolean z3;
        int i13;
        C17465l c17465l;
        int i14;
        int i15;
        char cCharAt3;
        String str6;
        AbstractC11451l abstractC11451l2;
        int i16;
        int i17;
        char cCharAt4;
        char c2;
        int i18;
        EnumC4433l enumC4433l;
        int i19;
        int i20;
        EnumC0142l enumC0142l;
        AbstractC15029l c11293l;
        int i21;
        Object[] objArr3;
        int i22;
        Object obj;
        int i23;
        int i24;
        boolean z4;
        int i25;
        int i26;
        String string;
        AbstractC1068l abstractC1068lAmazon = c4299l.amazon();
        Level level4 = c4299l.yandex;
        Boolean bool = (Boolean) abstractC1068lAmazon.isPro(AbstractC6297l.yandex);
        if (bool == null || !bool.booleanValue()) {
            ((C11673l) AbstractC4609l.yandex).getClass();
            AbstractC1068l abstractC1068lCrashlytics = C9712l.loadAd.crashlytics();
            AbstractC1068l abstractC1068lAmazon2 = c4299l.amazon();
            int iMopub = abstractC1068lAmazon2.mopub();
            if (iMopub == 0) {
                c12518l = AbstractC11451l.yandex;
            } else {
                c12518l = iMopub <= 28 ? new C12518l(abstractC1068lCrashlytics, abstractC1068lAmazon2) : new C0297l(abstractC1068lCrashlytics, abstractC1068lAmazon2);
            }
            int i27 = 0;
            boolean z5 = level4.intValue() < level.intValue();
            if (z5) {
                sb = new StringBuilder();
                abstractC6082l = c4299l.amazon;
                if (abstractC6082l != null) {
                    C8339l.smaato("cannot request log site information prior to postProcess()");
                    return;
                }
                if (AbstractC5573l.Signature(2, abstractC6082l, sb)) {
                    sb.append(" ");
                }
                if (z5) {
                    c5151l = c4299l.billing;
                    if (c5151l != null) {
                        if (c5151l != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        str2 = "cannot get arguments unless a template context exists";
                        if (!z2) {
                            C8339l.smaato("cannot get arguments unless a template context exists");
                            return;
                        }
                        objArr2 = c4299l.mopub;
                        str3 = "cannot get arguments before calling log()";
                        if (objArr2 == null) {
                            C8339l.smaato("cannot get arguments before calling log()");
                            return;
                        }
                        c2934l = new C2934l(c5151l, objArr2, sb);
                        sb2 = (StringBuilder) c2934l.f6385l;
                        C5151l c5151l2 = (C5151l) c2934l.f6388l;
                        C15113l c15113l = c5151l2.yandex;
                        str4 = c5151l2.loadAd;
                        c15113l.getClass();
                        iLoadAd = AbstractC6370l.loadAd(0, str4);
                        i = 0;
                        i2 = -1;
                        while (true) {
                            i3 = 3;
                            if (iLoadAd < 0) {
                                abstractC11451l = c12518l;
                                level2 = level4;
                                String str7 = str2;
                                String str8 = str3;
                                i4 = c2934l.f6386l;
                                if (((i4 + 1) & i4) == 0) {
                                }
                                throw new C6451l(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i4))), 21, (byte) 0);
                            }
                            i5 = iLoadAd + 1;
                            i6 = i27;
                            i7 = i5;
                            while (true) {
                                if (i7 >= str4.length()) {
                                    throw new C6451l(C6451l.amazon(iLoadAd, -1, "unterminated parameter", str4), 21, (byte) 0);
                                }
                                i8 = i7 + 1;
                                level3 = level4;
                                cCharAt = str4.charAt(i7);
                                i9 = i7;
                                c = (char) (cCharAt - '0');
                                str5 = str2;
                                if (c < '\n') {
                                    i26 = (i6 * 10) + c;
                                    if (i26 >= 1000000) {
                                        throw C6451l.loadAd(iLoadAd, i8, "index too large", str4);
                                    }
                                    i6 = i26;
                                    i7 = i8;
                                    level4 = level3;
                                    str2 = str5;
                                }
                            }
                            if (cCharAt != '$') {
                                i10 = -1;
                                if (cCharAt != '<') {
                                    i2 = i;
                                    i++;
                                } else {
                                    if (i2 == -1) {
                                        throw C6451l.loadAd(iLoadAd, i8, "invalid relative parameter", str4);
                                    }
                                    if (i8 == str4.length()) {
                                        throw new C6451l(C6451l.amazon(iLoadAd, -1, "unterminated parameter", str4), 21, (byte) 0);
                                    }
                                    str4.charAt(i8);
                                    i5 = i8;
                                    i8 = i9 + 2;
                                }
                            } else {
                                if (i9 - i5 == 0) {
                                    throw C6451l.loadAd(iLoadAd, i8, "missing index", str4);
                                }
                                if (str4.charAt(i5) == '0') {
                                    throw C6451l.loadAd(iLoadAd, i8, "index has leading zero", str4);
                                }
                                i25 = i6 - 1;
                                if (i8 == str4.length()) {
                                    throw new C6451l(C6451l.amazon(iLoadAd, -1, "unterminated parameter", str4), 21, (byte) 0);
                                }
                                str4.charAt(i8);
                                i5 = i8;
                                i2 = i25;
                                i8 = i9 + 2;
                                i10 = -1;
                            }
                            i11 = i8 + i10;
                            while (true) {
                                if (i11 >= str4.length()) {
                                    throw new C6451l(C6451l.amazon(iLoadAd, -1, "unterminated parameter", str4), 21, (byte) 0);
                                }
                                if (((char) ((str4.charAt(i11) & (-33)) - 65)) < 26) {
                                    break;
                                }
                                i11++;
                                str3 = str3;
                                i3 = 3;
                            }
                            cCharAt2 = str4.charAt(i11);
                            i12 = cCharAt2 & ' ';
                            if (i12 == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            C17465l c17465l2 = C17465l.purchase;
                            if (i5 == i11) {
                                if (true != z3) {
                                    i13 = 0;
                                } else {
                                    i13 = 128;
                                }
                                while (true) {
                                    if (i5 == i11) {
                                        c17465l = new C17465l(i13, -1, -1);
                                        abstractC11451l2 = c12518l;
                                        i15 = i12;
                                        str6 = str3;
                                        break;
                                    }
                                    i14 = i5 + 1;
                                    i15 = i12;
                                    cCharAt3 = str4.charAt(i5);
                                    str6 = str3;
                                    if (cCharAt3 >= ' ') {
                                    }
                                    abstractC11451l2 = c12518l;
                                    if (cCharAt3 > '9') {
                                        throw C6451l.crashlytics("invalid flag", i5, str4);
                                    }
                                    i16 = cCharAt3 - '0';
                                    while (true) {
                                        if (i14 == i11) {
                                            c17465l = new C17465l(i13, i16, -1);
                                            break;
                                        }
                                        i17 = i14 + 1;
                                        cCharAt4 = str4.charAt(i14);
                                        if (cCharAt4 == '.') {
                                            c17465l = new C17465l(i13, i16, C17465l.purchase(i17, i11, str4));
                                            break;
                                        }
                                        c2 = (char) (cCharAt4 - '0');
                                        if (c2 >= '\n') {
                                            throw C6451l.crashlytics("invalid width character", i14, str4);
                                        }
                                        i16 = (i16 * 10) + c2;
                                        if (i16 > 999999) {
                                            throw C6451l.loadAd(i5, i11, "width too large", str4);
                                        }
                                        i14 = i17;
                                        i3 = 3;
                                    }
                                    i13 |= i18;
                                    i5 = i14;
                                    c12518l = abstractC11451l2;
                                    i12 = i15;
                                    str3 = str6;
                                }
                            } else {
                                if (true != z3) {
                                    i13 = 0;
                                } else {
                                    i13 = 128;
                                }
                                while (true) {
                                    if (i5 == i11) {
                                        c17465l = new C17465l(i13, -1, -1);
                                        abstractC11451l2 = c12518l;
                                        i15 = i12;
                                        str6 = str3;
                                        break;
                                    }
                                    i14 = i5 + 1;
                                    i15 = i12;
                                    cCharAt3 = str4.charAt(i5);
                                    str6 = str3;
                                    if (cCharAt3 >= ' ') {
                                    }
                                    abstractC11451l2 = c12518l;
                                    if (cCharAt3 > '9') {
                                        throw C6451l.crashlytics("invalid flag", i5, str4);
                                    }
                                    i16 = cCharAt3 - '0';
                                    while (true) {
                                        if (i14 == i11) {
                                            c17465l = new C17465l(i13, i16, -1);
                                            break;
                                        }
                                        i17 = i14 + 1;
                                        cCharAt4 = str4.charAt(i14);
                                        if (cCharAt4 == '.') {
                                            c17465l = new C17465l(i13, i16, C17465l.purchase(i17, i11, str4));
                                            break;
                                        }
                                        c2 = (char) (cCharAt4 - '0');
                                        if (c2 >= '\n') {
                                            throw C6451l.crashlytics("invalid width character", i14, str4);
                                        }
                                        i16 = (i16 * 10) + c2;
                                        if (i16 > 999999) {
                                            throw C6451l.loadAd(i5, i11, "width too large", str4);
                                        }
                                        i14 = i17;
                                        i3 = 3;
                                    }
                                    i13 |= i18;
                                    i5 = i14;
                                    c12518l = abstractC11451l2;
                                    i12 = i15;
                                    str3 = str6;
                                }
                            }
                            enumC4433l = EnumC4433l.f9025l[(cCharAt2 | ' ') - 97];
                            if (i15 == 0) {
                                enumC4433l = null;
                            }
                            i19 = i11 + 1;
                            if (enumC4433l != null) {
                                c17465l.getClass();
                                i23 = enumC4433l.f9026l;
                                i24 = enumC4433l.f9027l;
                                if (i24 == 1) {
                                    z4 = true;
                                } else {
                                    if (i24 != 2) {
                                    }
                                    z4 = false;
                                }
                                if (c17465l.loadAd(i23, z4)) {
                                    throw C6451l.loadAd(iLoadAd, i19, "invalid format specifier", str4);
                                }
                                if (i2 < 10) {
                                    Map map = C17047l.f33206l;
                                    if (c17465l.yandex()) {
                                        AbstractC15029l[] abstractC15029lArr = (C17047l[]) C17047l.f33206l.get(enumC4433l);
                                        AbstractC13841l.billing(abstractC15029lArr, "default parameter");
                                        c11293l = abstractC15029lArr[i2];
                                    } else {
                                        c11293l = new C17047l(i2, enumC4433l, c17465l);
                                    }
                                } else {
                                    c11293l = new C17047l(i2, enumC4433l, c17465l);
                                }
                            } else if (cCharAt2 != 't') {
                                if (!c17465l.loadAd(160, false)) {
                                    throw C6451l.loadAd(iLoadAd, i19, "invalid format specification", str4);
                                }
                                i20 = i11 + 2;
                                if (i20 > str4.length()) {
                                    throw C6451l.crashlytics("truncated format specifier", iLoadAd, str4);
                                }
                                enumC0142l = (EnumC0142l) EnumC0142l.f1042l.get(Character.valueOf(str4.charAt(i19)));
                                if (enumC0142l == null) {
                                    throw C6451l.crashlytics("illegal date/time conversion", i19, str4);
                                }
                                c11293l = new C11293l(c17465l, i2, enumC0142l);
                                i19 = i20;
                            } else {
                                if (!c17465l.loadAd(160, false)) {
                                    throw C6451l.loadAd(iLoadAd, i19, "invalid format specification", str4);
                                }
                                i20 = i11 + 2;
                                if (i20 > str4.length()) {
                                    throw C6451l.crashlytics("truncated format specifier", iLoadAd, str4);
                                }
                                enumC0142l = (EnumC0142l) EnumC0142l.f1042l.get(Character.valueOf(str4.charAt(i19)));
                                if (enumC0142l == null) {
                                    throw C6451l.crashlytics("illegal date/time conversion", i19, str4);
                                }
                                c11293l = new C11293l(c17465l, i2, enumC0142l);
                                i19 = i20;
                            }
                            i21 = c11293l.f29555l;
                            if (i21 < 32) {
                                c2934l.f6386l |= 1 << i21;
                            }
                            c2934l.f6384l = Math.max(c2934l.f6384l, i21);
                            AbstractC6370l.yandex(c2934l.f6389l, iLoadAd, str4, sb2);
                            objArr3 = (Object[]) c2934l.f6390l;
                            i22 = c11293l.f29555l;
                            if (i22 < objArr3.length) {
                                obj = objArr3[i22];
                                if (obj != null) {
                                    c11293l.mo1994private(c2934l, obj);
                                } else {
                                    sb2.append("null");
                                }
                            } else {
                                sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                            }
                            c2934l.f6389l = i19;
                            iLoadAd = AbstractC6370l.loadAd(i19, str4);
                            c12518l = abstractC11451l2;
                            level4 = level3;
                            str2 = str5;
                            str3 = str6;
                            i27 = 0;
                        }
                    } else {
                        abstractC11451l = c12518l;
                        level2 = level4;
                        if (c5151l == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            C8339l.smaato("cannot get literal argument if a template context exists");
                            return;
                        }
                        objArr = c4299l.mopub;
                        if (objArr == null) {
                            C8339l.smaato("cannot get literal argument before calling log()");
                            return;
                        }
                        sb.append(AbstractC3559l.yandex(objArr[0]));
                    }
                    int i28 = AbstractC16708l.yandex;
                    c16979l = new C16979l(sb);
                    abstractC11451l.yandex(c7502l, c16979l);
                    if (c16979l.loadAd) {
                        sb.append(" ]");
                    }
                } else {
                    c5151l = c4299l.billing;
                    if (c5151l != null) {
                        if (c5151l != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        str2 = "cannot get arguments unless a template context exists";
                        if (!z2) {
                            C8339l.smaato("cannot get arguments unless a template context exists");
                            return;
                        }
                        objArr2 = c4299l.mopub;
                        str3 = "cannot get arguments before calling log()";
                        if (objArr2 == null) {
                            C8339l.smaato("cannot get arguments before calling log()");
                            return;
                        }
                        c2934l = new C2934l(c5151l, objArr2, sb);
                        sb2 = (StringBuilder) c2934l.f6385l;
                        C5151l c5151l3 = (C5151l) c2934l.f6388l;
                        C15113l c15113l2 = c5151l3.yandex;
                        str4 = c5151l3.loadAd;
                        c15113l2.getClass();
                        iLoadAd = AbstractC6370l.loadAd(0, str4);
                        i = 0;
                        i2 = -1;
                        while (true) {
                            i3 = 3;
                            if (iLoadAd < 0) {
                                abstractC11451l = c12518l;
                                level2 = level4;
                                String str9 = str2;
                                String str10 = str3;
                                i4 = c2934l.f6386l;
                                if (((i4 + 1) & i4) == 0) {
                                }
                                throw new C6451l(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i4))), 21, (byte) 0);
                            }
                            i5 = iLoadAd + 1;
                            i6 = i27;
                            i7 = i5;
                            while (true) {
                                if (i7 >= str4.length()) {
                                    throw new C6451l(C6451l.amazon(iLoadAd, -1, "unterminated parameter", str4), 21, (byte) 0);
                                }
                                i8 = i7 + 1;
                                level3 = level4;
                                cCharAt = str4.charAt(i7);
                                i9 = i7;
                                c = (char) (cCharAt - '0');
                                str5 = str2;
                                if (c < '\n') {
                                    i26 = (i6 * 10) + c;
                                    if (i26 >= 1000000) {
                                        throw C6451l.loadAd(iLoadAd, i8, "index too large", str4);
                                    }
                                    i6 = i26;
                                    i7 = i8;
                                    level4 = level3;
                                    str2 = str5;
                                }
                            }
                            if (cCharAt != '$') {
                                i10 = -1;
                                if (cCharAt != '<') {
                                    i2 = i;
                                    i++;
                                } else {
                                    if (i2 == -1) {
                                        throw C6451l.loadAd(iLoadAd, i8, "invalid relative parameter", str4);
                                    }
                                    if (i8 == str4.length()) {
                                        throw new C6451l(C6451l.amazon(iLoadAd, -1, "unterminated parameter", str4), 21, (byte) 0);
                                    }
                                    str4.charAt(i8);
                                    i5 = i8;
                                    i8 = i9 + 2;
                                }
                            } else {
                                if (i9 - i5 == 0) {
                                    throw C6451l.loadAd(iLoadAd, i8, "missing index", str4);
                                }
                                if (str4.charAt(i5) == '0') {
                                    throw C6451l.loadAd(iLoadAd, i8, "index has leading zero", str4);
                                }
                                i25 = i6 - 1;
                                if (i8 == str4.length()) {
                                    throw new C6451l(C6451l.amazon(iLoadAd, -1, "unterminated parameter", str4), 21, (byte) 0);
                                }
                                str4.charAt(i8);
                                i5 = i8;
                                i2 = i25;
                                i8 = i9 + 2;
                                i10 = -1;
                            }
                            i11 = i8 + i10;
                            while (true) {
                                if (i11 >= str4.length()) {
                                    throw new C6451l(C6451l.amazon(iLoadAd, -1, "unterminated parameter", str4), 21, (byte) 0);
                                }
                                if (((char) ((str4.charAt(i11) & (-33)) - 65)) < 26) {
                                    break;
                                }
                                i11++;
                                str3 = str3;
                                i3 = 3;
                            }
                            cCharAt2 = str4.charAt(i11);
                            i12 = cCharAt2 & ' ';
                            if (i12 == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            C17465l c17465l3 = C17465l.purchase;
                            if (i5 == i11) {
                                if (true != z3) {
                                    i13 = 0;
                                } else {
                                    i13 = 128;
                                }
                                while (true) {
                                    if (i5 == i11) {
                                        c17465l = new C17465l(i13, -1, -1);
                                        abstractC11451l2 = c12518l;
                                        i15 = i12;
                                        str6 = str3;
                                        break;
                                    }
                                    i14 = i5 + 1;
                                    i15 = i12;
                                    cCharAt3 = str4.charAt(i5);
                                    str6 = str3;
                                    if (cCharAt3 >= ' ') {
                                    }
                                    abstractC11451l2 = c12518l;
                                    if (cCharAt3 > '9') {
                                        throw C6451l.crashlytics("invalid flag", i5, str4);
                                    }
                                    i16 = cCharAt3 - '0';
                                    while (true) {
                                        if (i14 == i11) {
                                            c17465l = new C17465l(i13, i16, -1);
                                            break;
                                        }
                                        i17 = i14 + 1;
                                        cCharAt4 = str4.charAt(i14);
                                        if (cCharAt4 == '.') {
                                            c17465l = new C17465l(i13, i16, C17465l.purchase(i17, i11, str4));
                                            break;
                                        }
                                        c2 = (char) (cCharAt4 - '0');
                                        if (c2 >= '\n') {
                                            throw C6451l.crashlytics("invalid width character", i14, str4);
                                        }
                                        i16 = (i16 * 10) + c2;
                                        if (i16 > 999999) {
                                            throw C6451l.loadAd(i5, i11, "width too large", str4);
                                        }
                                        i14 = i17;
                                        i3 = 3;
                                    }
                                    i13 |= i18;
                                    i5 = i14;
                                    c12518l = abstractC11451l2;
                                    i12 = i15;
                                    str3 = str6;
                                }
                            } else {
                                if (true != z3) {
                                    i13 = 0;
                                } else {
                                    i13 = 128;
                                }
                                while (true) {
                                    if (i5 == i11) {
                                        c17465l = new C17465l(i13, -1, -1);
                                        abstractC11451l2 = c12518l;
                                        i15 = i12;
                                        str6 = str3;
                                        break;
                                    }
                                    i14 = i5 + 1;
                                    i15 = i12;
                                    cCharAt3 = str4.charAt(i5);
                                    str6 = str3;
                                    if (cCharAt3 >= ' ') {
                                    }
                                    abstractC11451l2 = c12518l;
                                    if (cCharAt3 > '9') {
                                        throw C6451l.crashlytics("invalid flag", i5, str4);
                                    }
                                    i16 = cCharAt3 - '0';
                                    while (true) {
                                        if (i14 == i11) {
                                            c17465l = new C17465l(i13, i16, -1);
                                            break;
                                        }
                                        i17 = i14 + 1;
                                        cCharAt4 = str4.charAt(i14);
                                        if (cCharAt4 == '.') {
                                            c17465l = new C17465l(i13, i16, C17465l.purchase(i17, i11, str4));
                                            break;
                                        }
                                        c2 = (char) (cCharAt4 - '0');
                                        if (c2 >= '\n') {
                                            throw C6451l.crashlytics("invalid width character", i14, str4);
                                        }
                                        i16 = (i16 * 10) + c2;
                                        if (i16 > 999999) {
                                            throw C6451l.loadAd(i5, i11, "width too large", str4);
                                        }
                                        i14 = i17;
                                        i3 = 3;
                                    }
                                    i13 |= i18;
                                    i5 = i14;
                                    c12518l = abstractC11451l2;
                                    i12 = i15;
                                    str3 = str6;
                                }
                            }
                            enumC4433l = EnumC4433l.f9025l[(cCharAt2 | ' ') - 97];
                            if (i15 == 0) {
                                enumC4433l = null;
                            }
                            i19 = i11 + 1;
                            if (enumC4433l != null) {
                                c17465l.getClass();
                                i23 = enumC4433l.f9026l;
                                i24 = enumC4433l.f9027l;
                                if (i24 == 1) {
                                    z4 = true;
                                } else {
                                    if (i24 != 2) {
                                    }
                                    z4 = false;
                                }
                                if (c17465l.loadAd(i23, z4)) {
                                    throw C6451l.loadAd(iLoadAd, i19, "invalid format specifier", str4);
                                }
                                if (i2 < 10) {
                                    Map map2 = C17047l.f33206l;
                                    if (c17465l.yandex()) {
                                        AbstractC15029l[] abstractC15029lArr2 = (C17047l[]) C17047l.f33206l.get(enumC4433l);
                                        AbstractC13841l.billing(abstractC15029lArr2, "default parameter");
                                        c11293l = abstractC15029lArr2[i2];
                                    } else {
                                        c11293l = new C17047l(i2, enumC4433l, c17465l);
                                    }
                                } else {
                                    c11293l = new C17047l(i2, enumC4433l, c17465l);
                                }
                            } else if (cCharAt2 != 't') {
                                if (!c17465l.loadAd(160, false)) {
                                    throw C6451l.loadAd(iLoadAd, i19, "invalid format specification", str4);
                                }
                                i20 = i11 + 2;
                                if (i20 > str4.length()) {
                                    throw C6451l.crashlytics("truncated format specifier", iLoadAd, str4);
                                }
                                enumC0142l = (EnumC0142l) EnumC0142l.f1042l.get(Character.valueOf(str4.charAt(i19)));
                                if (enumC0142l == null) {
                                    throw C6451l.crashlytics("illegal date/time conversion", i19, str4);
                                }
                                c11293l = new C11293l(c17465l, i2, enumC0142l);
                                i19 = i20;
                            } else {
                                if (!c17465l.loadAd(160, false)) {
                                    throw C6451l.loadAd(iLoadAd, i19, "invalid format specification", str4);
                                }
                                i20 = i11 + 2;
                                if (i20 > str4.length()) {
                                    throw C6451l.crashlytics("truncated format specifier", iLoadAd, str4);
                                }
                                enumC0142l = (EnumC0142l) EnumC0142l.f1042l.get(Character.valueOf(str4.charAt(i19)));
                                if (enumC0142l == null) {
                                    throw C6451l.crashlytics("illegal date/time conversion", i19, str4);
                                }
                                c11293l = new C11293l(c17465l, i2, enumC0142l);
                                i19 = i20;
                            }
                            i21 = c11293l.f29555l;
                            if (i21 < 32) {
                                c2934l.f6386l |= 1 << i21;
                            }
                            c2934l.f6384l = Math.max(c2934l.f6384l, i21);
                            AbstractC6370l.yandex(c2934l.f6389l, iLoadAd, str4, sb2);
                            objArr3 = (Object[]) c2934l.f6390l;
                            i22 = c11293l.f29555l;
                            if (i22 < objArr3.length) {
                                obj = objArr3[i22];
                                if (obj != null) {
                                    c11293l.mo1994private(c2934l, obj);
                                } else {
                                    sb2.append("null");
                                }
                            } else {
                                sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                            }
                            c2934l.f6389l = i19;
                            iLoadAd = AbstractC6370l.loadAd(i19, str4);
                            c12518l = abstractC11451l2;
                            level4 = level3;
                            str2 = str5;
                            str3 = str6;
                            i27 = 0;
                        }
                    } else {
                        abstractC11451l = c12518l;
                        level2 = level4;
                        if (c5151l == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            C8339l.smaato("cannot get literal argument if a template context exists");
                            return;
                        }
                        objArr = c4299l.mopub;
                        if (objArr == null) {
                            C8339l.smaato("cannot get literal argument before calling log()");
                            return;
                        }
                        sb.append(AbstractC3559l.yandex(objArr[0]));
                    }
                    int i29 = AbstractC16708l.yandex;
                    c16979l = new C16979l(sb);
                    abstractC11451l.yandex(c7502l, c16979l);
                    if (c16979l.loadAd) {
                        sb.append(" ]");
                    }
                }
                string = sb.toString();
            } else {
                int i30 = AbstractC16708l.yandex;
                if (c4299l.billing == null && c12518l.loadAd() <= set.size() && set.containsAll(c12518l.crashlytics())) {
                    if (!(c4299l.billing == null)) {
                        C8339l.smaato("cannot get literal argument if a template context exists");
                        return;
                    }
                    Object[] objArr4 = c4299l.mopub;
                    if (objArr4 == null) {
                        C8339l.smaato("cannot get literal argument before calling log()");
                        return;
                    } else {
                        string = AbstractC3559l.yandex(objArr4[0]);
                        level2 = level4;
                    }
                } else {
                    sb = new StringBuilder();
                    abstractC6082l = c4299l.amazon;
                    if (abstractC6082l != null) {
                        C8339l.smaato("cannot request log site information prior to postProcess()");
                        return;
                    }
                    if (AbstractC5573l.Signature(2, abstractC6082l, sb)) {
                        sb.append(" ");
                    }
                    if (z5 || c4299l.billing == null) {
                        c5151l = c4299l.billing;
                        if (c5151l != null) {
                            if (c5151l != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            str2 = "cannot get arguments unless a template context exists";
                            if (!z2) {
                                C8339l.smaato("cannot get arguments unless a template context exists");
                                return;
                            }
                            objArr2 = c4299l.mopub;
                            str3 = "cannot get arguments before calling log()";
                            if (objArr2 == null) {
                                C8339l.smaato("cannot get arguments before calling log()");
                                return;
                            }
                            c2934l = new C2934l(c5151l, objArr2, sb);
                            sb2 = (StringBuilder) c2934l.f6385l;
                            C5151l c5151l4 = (C5151l) c2934l.f6388l;
                            C15113l c15113l3 = c5151l4.yandex;
                            str4 = c5151l4.loadAd;
                            c15113l3.getClass();
                            iLoadAd = AbstractC6370l.loadAd(0, str4);
                            i = 0;
                            i2 = -1;
                            while (true) {
                                i3 = 3;
                                if (iLoadAd < 0) {
                                    abstractC11451l = c12518l;
                                    level2 = level4;
                                    String str11 = str2;
                                    String str12 = str3;
                                    i4 = c2934l.f6386l;
                                    if (((i4 + 1) & i4) == 0 || (c2934l.f6384l > 31 && i4 != -1)) {
                                        throw new C6451l(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i4))), 21, (byte) 0);
                                    }
                                    AbstractC6370l.yandex(c2934l.f6389l, str4.length(), str4, sb2);
                                    if (!(c4299l.billing != null)) {
                                        C8339l.smaato(str11);
                                        return;
                                    }
                                    Object[] objArr5 = c4299l.mopub;
                                    if (objArr5 == null) {
                                        C8339l.smaato(str12);
                                        return;
                                    } else {
                                        if (objArr5.length <= c2934l.f6384l + 1) {
                                            break;
                                        }
                                        sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                                        break;
                                    }
                                }
                                i5 = iLoadAd + 1;
                                i6 = i27;
                                i7 = i5;
                                while (true) {
                                    if (i7 >= str4.length()) {
                                        throw new C6451l(C6451l.amazon(iLoadAd, -1, "unterminated parameter", str4), 21, (byte) 0);
                                    }
                                    i8 = i7 + 1;
                                    level3 = level4;
                                    cCharAt = str4.charAt(i7);
                                    i9 = i7;
                                    c = (char) (cCharAt - '0');
                                    str5 = str2;
                                    if (c < '\n') {
                                        i26 = (i6 * 10) + c;
                                        if (i26 >= 1000000) {
                                            throw C6451l.loadAd(iLoadAd, i8, "index too large", str4);
                                        }
                                        i6 = i26;
                                        i7 = i8;
                                        level4 = level3;
                                        str2 = str5;
                                    }
                                }
                                if (cCharAt != '$') {
                                    i10 = -1;
                                    if (cCharAt != '<') {
                                        i2 = i;
                                        i++;
                                    } else {
                                        if (i2 == -1) {
                                            throw C6451l.loadAd(iLoadAd, i8, "invalid relative parameter", str4);
                                        }
                                        if (i8 == str4.length()) {
                                            throw new C6451l(C6451l.amazon(iLoadAd, -1, "unterminated parameter", str4), 21, (byte) 0);
                                        }
                                        str4.charAt(i8);
                                        i5 = i8;
                                        i8 = i9 + 2;
                                    }
                                } else {
                                    if (i9 - i5 == 0) {
                                        throw C6451l.loadAd(iLoadAd, i8, "missing index", str4);
                                    }
                                    if (str4.charAt(i5) == '0') {
                                        throw C6451l.loadAd(iLoadAd, i8, "index has leading zero", str4);
                                    }
                                    i25 = i6 - 1;
                                    if (i8 == str4.length()) {
                                        throw new C6451l(C6451l.amazon(iLoadAd, -1, "unterminated parameter", str4), 21, (byte) 0);
                                    }
                                    str4.charAt(i8);
                                    i5 = i8;
                                    i2 = i25;
                                    i8 = i9 + 2;
                                    i10 = -1;
                                }
                                i11 = i8 + i10;
                                while (true) {
                                    if (i11 >= str4.length()) {
                                        throw new C6451l(C6451l.amazon(iLoadAd, -1, "unterminated parameter", str4), 21, (byte) 0);
                                    }
                                    if (((char) ((str4.charAt(i11) & (-33)) - 65)) < 26) {
                                        break;
                                    }
                                    i11++;
                                    str3 = str3;
                                    i3 = 3;
                                }
                                cCharAt2 = str4.charAt(i11);
                                i12 = cCharAt2 & ' ';
                                if (i12 == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                C17465l c17465l4 = C17465l.purchase;
                                if (i5 == i11 || z3) {
                                    if (true != z3) {
                                        i13 = 0;
                                    } else {
                                        i13 = 128;
                                    }
                                    while (true) {
                                        if (i5 == i11) {
                                            c17465l = new C17465l(i13, -1, -1);
                                        } else {
                                            i14 = i5 + 1;
                                            i15 = i12;
                                            cCharAt3 = str4.charAt(i5);
                                            str6 = str3;
                                            if (cCharAt3 >= ' ' || cCharAt3 > '0') {
                                                abstractC11451l2 = c12518l;
                                                if (cCharAt3 > '9') {
                                                    throw C6451l.crashlytics("invalid flag", i5, str4);
                                                }
                                                i16 = cCharAt3 - '0';
                                                while (true) {
                                                    if (i14 == i11) {
                                                        c17465l = new C17465l(i13, i16, -1);
                                                        break;
                                                    }
                                                    i17 = i14 + 1;
                                                    cCharAt4 = str4.charAt(i14);
                                                    if (cCharAt4 == '.') {
                                                        c17465l = new C17465l(i13, i16, C17465l.purchase(i17, i11, str4));
                                                        break;
                                                    }
                                                    c2 = (char) (cCharAt4 - '0');
                                                    if (c2 >= '\n') {
                                                        throw C6451l.crashlytics("invalid width character", i14, str4);
                                                    }
                                                    i16 = (i16 * 10) + c2;
                                                    if (i16 > 999999) {
                                                        throw C6451l.loadAd(i5, i11, "width too large", str4);
                                                    }
                                                    i14 = i17;
                                                    i3 = 3;
                                                }
                                            } else {
                                                abstractC11451l2 = c12518l;
                                                int i31 = ((int) ((C17465l.amazon >>> ((cCharAt3 - ' ') * 3)) & 7)) - 1;
                                                if (i31 < 0) {
                                                    if (cCharAt3 != '.') {
                                                        throw C6451l.crashlytics("invalid flag", i5, str4);
                                                    }
                                                    c17465l = new C17465l(i13, -1, C17465l.purchase(i14, i11, str4));
                                                    break;
                                                }
                                                i18 = 1 << i31;
                                                if ((i13 & i18) != 0) {
                                                    throw C6451l.crashlytics("repeated flag", i5, str4);
                                                }
                                                i13 |= i18;
                                                i5 = i14;
                                                c12518l = abstractC11451l2;
                                                i12 = i15;
                                                str3 = str6;
                                            }
                                        }
                                    }
                                    enumC4433l = EnumC4433l.f9025l[(cCharAt2 | ' ') - 97];
                                    if (i15 == 0 && (enumC4433l == null || (enumC4433l.f9026l & 128) == 0)) {
                                        enumC4433l = null;
                                    }
                                    i19 = i11 + 1;
                                    if (enumC4433l != null) {
                                        c17465l.getClass();
                                        i23 = enumC4433l.f9026l;
                                        i24 = enumC4433l.f9027l;
                                        if (i24 == 1) {
                                            z4 = true;
                                        } else if (i24 != 2 || i24 == i3 || i24 == 4) {
                                            z4 = false;
                                        } else {
                                            if (i24 != 5) {
                                                throw null;
                                            }
                                            z4 = true;
                                        }
                                        if (c17465l.loadAd(i23, z4)) {
                                            throw C6451l.loadAd(iLoadAd, i19, "invalid format specifier", str4);
                                        }
                                        if (i2 < 10) {
                                            Map map3 = C17047l.f33206l;
                                            if (c17465l.yandex()) {
                                                AbstractC15029l[] abstractC15029lArr3 = (C17047l[]) C17047l.f33206l.get(enumC4433l);
                                                AbstractC13841l.billing(abstractC15029lArr3, "default parameter");
                                                c11293l = abstractC15029lArr3[i2];
                                            } else {
                                                c11293l = new C17047l(i2, enumC4433l, c17465l);
                                            }
                                        } else {
                                            c11293l = new C17047l(i2, enumC4433l, c17465l);
                                        }
                                    } else if (cCharAt2 != 't' || cCharAt2 == 'T') {
                                        if (!c17465l.loadAd(160, false)) {
                                            throw C6451l.loadAd(iLoadAd, i19, "invalid format specification", str4);
                                        }
                                        i20 = i11 + 2;
                                        if (i20 > str4.length()) {
                                            throw C6451l.crashlytics("truncated format specifier", iLoadAd, str4);
                                        }
                                        enumC0142l = (EnumC0142l) EnumC0142l.f1042l.get(Character.valueOf(str4.charAt(i19)));
                                        if (enumC0142l == null) {
                                            throw C6451l.crashlytics("illegal date/time conversion", i19, str4);
                                        }
                                        c11293l = new C11293l(c17465l, i2, enumC0142l);
                                        i19 = i20;
                                    } else {
                                        if (cCharAt2 != 'h' && cCharAt2 != 'H') {
                                            throw C6451l.loadAd(iLoadAd, i19, "invalid format specification", str4);
                                        }
                                        if (!c17465l.loadAd(160, false)) {
                                            throw C6451l.loadAd(iLoadAd, i19, "invalid format specification", str4);
                                        }
                                        c11293l = new C6247l(c17465l, i2);
                                    }
                                    i21 = c11293l.f29555l;
                                    if (i21 < 32) {
                                        c2934l.f6386l |= 1 << i21;
                                    }
                                    c2934l.f6384l = Math.max(c2934l.f6384l, i21);
                                    AbstractC6370l.yandex(c2934l.f6389l, iLoadAd, str4, sb2);
                                    objArr3 = (Object[]) c2934l.f6390l;
                                    i22 = c11293l.f29555l;
                                    if (i22 < objArr3.length) {
                                        obj = objArr3[i22];
                                        if (obj != null) {
                                            c11293l.mo1994private(c2934l, obj);
                                        } else {
                                            sb2.append("null");
                                        }
                                    } else {
                                        sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                                    }
                                    c2934l.f6389l = i19;
                                    iLoadAd = AbstractC6370l.loadAd(i19, str4);
                                    c12518l = abstractC11451l2;
                                    level4 = level3;
                                    str2 = str5;
                                    str3 = str6;
                                    i27 = 0;
                                } else {
                                    c17465l = C17465l.purchase;
                                }
                                abstractC11451l2 = c12518l;
                                i15 = i12;
                                str6 = str3;
                                enumC4433l = EnumC4433l.f9025l[(cCharAt2 | ' ') - 97];
                                if (i15 == 0) {
                                    enumC4433l = null;
                                }
                                i19 = i11 + 1;
                                if (enumC4433l != null) {
                                    c17465l.getClass();
                                    i23 = enumC4433l.f9026l;
                                    i24 = enumC4433l.f9027l;
                                    if (i24 == 1) {
                                        z4 = true;
                                    } else {
                                        if (i24 != 2) {
                                        }
                                        z4 = false;
                                    }
                                    if (c17465l.loadAd(i23, z4)) {
                                        throw C6451l.loadAd(iLoadAd, i19, "invalid format specifier", str4);
                                    }
                                    if (i2 < 10) {
                                        Map map4 = C17047l.f33206l;
                                        if (c17465l.yandex()) {
                                            AbstractC15029l[] abstractC15029lArr4 = (C17047l[]) C17047l.f33206l.get(enumC4433l);
                                            AbstractC13841l.billing(abstractC15029lArr4, "default parameter");
                                            c11293l = abstractC15029lArr4[i2];
                                        } else {
                                            c11293l = new C17047l(i2, enumC4433l, c17465l);
                                        }
                                    } else {
                                        c11293l = new C17047l(i2, enumC4433l, c17465l);
                                    }
                                } else if (cCharAt2 != 't') {
                                    if (!c17465l.loadAd(160, false)) {
                                        throw C6451l.loadAd(iLoadAd, i19, "invalid format specification", str4);
                                    }
                                    i20 = i11 + 2;
                                    if (i20 > str4.length()) {
                                        throw C6451l.crashlytics("truncated format specifier", iLoadAd, str4);
                                    }
                                    enumC0142l = (EnumC0142l) EnumC0142l.f1042l.get(Character.valueOf(str4.charAt(i19)));
                                    if (enumC0142l == null) {
                                        throw C6451l.crashlytics("illegal date/time conversion", i19, str4);
                                    }
                                    c11293l = new C11293l(c17465l, i2, enumC0142l);
                                    i19 = i20;
                                } else {
                                    if (!c17465l.loadAd(160, false)) {
                                        throw C6451l.loadAd(iLoadAd, i19, "invalid format specification", str4);
                                    }
                                    i20 = i11 + 2;
                                    if (i20 > str4.length()) {
                                        throw C6451l.crashlytics("truncated format specifier", iLoadAd, str4);
                                    }
                                    enumC0142l = (EnumC0142l) EnumC0142l.f1042l.get(Character.valueOf(str4.charAt(i19)));
                                    if (enumC0142l == null) {
                                        throw C6451l.crashlytics("illegal date/time conversion", i19, str4);
                                    }
                                    c11293l = new C11293l(c17465l, i2, enumC0142l);
                                    i19 = i20;
                                }
                                i21 = c11293l.f29555l;
                                if (i21 < 32) {
                                    c2934l.f6386l |= 1 << i21;
                                }
                                c2934l.f6384l = Math.max(c2934l.f6384l, i21);
                                AbstractC6370l.yandex(c2934l.f6389l, iLoadAd, str4, sb2);
                                objArr3 = (Object[]) c2934l.f6390l;
                                i22 = c11293l.f29555l;
                                if (i22 < objArr3.length) {
                                    obj = objArr3[i22];
                                    if (obj != null) {
                                        c11293l.mo1994private(c2934l, obj);
                                    } else {
                                        sb2.append("null");
                                    }
                                } else {
                                    sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                                }
                                c2934l.f6389l = i19;
                                iLoadAd = AbstractC6370l.loadAd(i19, str4);
                                c12518l = abstractC11451l2;
                                level4 = level3;
                                str2 = str5;
                                str3 = str6;
                                i27 = 0;
                            }
                        } else {
                            abstractC11451l = c12518l;
                            level2 = level4;
                            if (c5151l == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                C8339l.smaato("cannot get literal argument if a template context exists");
                                return;
                            }
                            objArr = c4299l.mopub;
                            if (objArr == null) {
                                C8339l.smaato("cannot get literal argument before calling log()");
                                return;
                            }
                            sb.append(AbstractC3559l.yandex(objArr[0]));
                        }
                        int i210 = AbstractC16708l.yandex;
                        c16979l = new C16979l(sb);
                        abstractC11451l.yandex(c7502l, c16979l);
                        if (c16979l.loadAd) {
                            sb.append(" ]");
                        }
                    } else {
                        sb.append("(REDACTED) ");
                        sb.append(c4299l.billing.loadAd);
                        level2 = level4;
                    }
                    string = sb.toString();
                }
            }
            Throwable th = (Throwable) c4299l.amazon().isPro(AbstractC13814l.yandex);
            int iSubs = AbstractC1896l.subs(level2);
            if (iSubs == 2) {
                Log.v(str, string, th);
                return;
            }
            if (iSubs == 3) {
                Log.d(str, string, th);
                return;
            }
            if (iSubs == 4) {
                Log.i(str, string, th);
            } else if (iSubs != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // defpackage.AbstractC12990l
    public final void loadAd(C4299l c4299l) {
        amazon(c4299l, this.loadAd, this.crashlytics, this.amazon, this.purchase);
    }

    @Override // defpackage.AbstractC12990l
    public final boolean yandex(Level level) {
        int iSubs = AbstractC1896l.subs(level);
        return Log.isLoggable(this.loadAd, iSubs) || Log.isLoggable("all", iSubs);
    }
}
