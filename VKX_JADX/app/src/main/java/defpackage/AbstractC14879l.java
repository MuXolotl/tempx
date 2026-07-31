package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٔٓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14879l {
    public static final int[] yandex = {-1, -1, -2, -1, -1, -1};
    public static final int[] loadAd = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    public static final int[] crashlytics = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void admob(int[] iArr, int i) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = (4294967295L & ((long) iArr[2])) + j2 + j4;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || AbstractC4952l.tapsense(6, 3, iArr) == 0) && !(iArr[5] == -1 && AbstractC0079l.vip(iArr, yandex))) {
            return;
        }
        yandex(iArr);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0082  */
    public static long amazon(int i, String str) {
        int iLoadAd = loadAd(0, i, str, false);
        Matcher matcher = C17335l.vip.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iM3324for = -1;
        int i5 = -1;
        int i6 = -1;
        while (iLoadAd < i) {
            int iLoadAd2 = loadAd(iLoadAd + 1, i, str, true);
            matcher.region(iLoadAd, iLoadAd2);
            if (i3 == -1 && matcher.usePattern(C17335l.vip).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i5 = Integer.parseInt(matcher.group(2));
                i6 = Integer.parseInt(matcher.group(3));
            } else if (i4 == -1 && matcher.usePattern(C17335l.remoteconfig).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else if (iM3324for == -1) {
                Pattern pattern = C17335l.smaato;
                if (matcher.usePattern(pattern).matches()) {
                    iM3324for = AbstractC12024l.m3324for(pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                } else if (i2 != -1 && matcher.usePattern(C17335l.firebase).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            } else if (i2 != -1) {
            }
            iLoadAd = loadAd(iLoadAd2 + 1, i, str, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            C8339l.metrica("Failed requirement.");
            return 0L;
        }
        if (iM3324for == -1) {
            C8339l.metrica("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            C8339l.metrica("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            C8339l.metrica("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            C8339l.metrica("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            C8339l.metrica("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC11432l.yandex);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iM3324for - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final C14337l billing(InterfaceC0684l interfaceC0684l, String str, boolean z) {
        InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iLoadAd = AbstractC8513l.loadAd(interfaceC14742lMo668l, "seqno");
            int iLoadAd2 = AbstractC8513l.loadAd(interfaceC14742lMo668l, "cid");
            int iLoadAd3 = AbstractC8513l.loadAd(interfaceC14742lMo668l, "name");
            int iLoadAd4 = AbstractC8513l.loadAd(interfaceC14742lMo668l, "desc");
            if (iLoadAd != -1 && iLoadAd2 != -1 && iLoadAd3 != -1 && iLoadAd4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (interfaceC14742lMo668l.mo827l()) {
                    if (((int) interfaceC14742lMo668l.getLong(iLoadAd2)) >= 0) {
                        int i = (int) interfaceC14742lMo668l.getLong(iLoadAd);
                        String strMo826implements = interfaceC14742lMo668l.mo826implements(iLoadAd3);
                        String str2 = interfaceC14742lMo668l.getLong(iLoadAd4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strMo826implements);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listM4243this = AbstractC16901l.m4243this(linkedHashMap.entrySet(), new C15696l(14));
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listM4243this, 10));
                Iterator it = listM4243this.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listM4213const = AbstractC16901l.m4213const(arrayList);
                List listM4243this2 = AbstractC16901l.m4243this(linkedHashMap2.entrySet(), new C15696l(15));
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(listM4243this2, 10));
                Iterator it2 = listM4243this2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                C14337l c14337l = new C14337l(str, z, listM4213const, AbstractC16901l.m4213const(arrayList2));
                AbstractC1214l.yandex(interfaceC14742lMo668l, null);
                return c14337l;
            }
            AbstractC1214l.yandex(interfaceC14742lMo668l, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1214l.yandex(interfaceC14742lMo668l, th);
                throw th2;
            }
        }
    }

    public static void crashlytics(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        AbstractC0079l.ads(iArr, iArr2, iArr4);
        mopub(iArr4, iArr3);
    }

    public static void firebase(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC0079l.Signature(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = ((4294967295L & ((long) iArr3[2])) - 1) + j2;
            iArr3[2] = (int) j4;
            if ((j4 >> 32) != 0) {
                AbstractC4952l.isPro(6, 3, iArr3);
            }
        }
    }

    public static void isPro(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        AbstractC0079l.tapsense(iArr, iArr3);
        while (true) {
            mopub(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC0079l.tapsense(iArr2, iArr3);
            }
        }
    }

    public static int loadAd(int i, int i2, String str, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static void mopub(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = ((long) iArr[7]) & 4294967295L;
        long j3 = ((long) iArr[8]) & 4294967295L;
        long j4 = ((long) iArr[9]) & 4294967295L;
        long j5 = (((long) iArr[10]) & 4294967295L) + j;
        long j6 = (((long) iArr[11]) & 4294967295L) + j2;
        long j7 = (((long) iArr[0]) & 4294967295L) + j5;
        int i = (int) j7;
        long j8 = (((long) iArr[1]) & 4294967295L) + j6 + (j7 >> 32);
        int i2 = (int) j8;
        iArr2[1] = i2;
        long j9 = j5 + j3;
        long j10 = j6 + j4;
        long j11 = (((long) iArr[2]) & 4294967295L) + j9 + (j8 >> 32);
        long j12 = j11 & 4294967295L;
        long j13 = (((long) iArr[3]) & 4294967295L) + j10 + (j11 >> 32);
        iArr2[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (j9 - j) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (j10 - j2) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = j15 >> 32;
        long j17 = j12 + j16;
        long j18 = j16 + (((long) i) & 4294967295L);
        iArr2[0] = (int) j18;
        long j19 = j18 >> 32;
        if (j19 != 0) {
            long j20 = j19 + (((long) i2) & 4294967295L);
            iArr2[1] = (int) j20;
            j17 += j20 >> 32;
        }
        iArr2[2] = (int) j17;
        if (((j17 >> 32) == 0 || AbstractC4952l.tapsense(6, 3, iArr2) == 0) && !(iArr2[5] == -1 && AbstractC0079l.vip(iArr2, yandex))) {
            return;
        }
        yandex(iArr2);
    }

    public static final List purchase(InterfaceC14742l interfaceC14742l) {
        int iLoadAd = AbstractC8513l.loadAd(interfaceC14742l, "id");
        int iLoadAd2 = AbstractC8513l.loadAd(interfaceC14742l, "seq");
        int iLoadAd3 = AbstractC8513l.loadAd(interfaceC14742l, "from");
        int iLoadAd4 = AbstractC8513l.loadAd(interfaceC14742l, "to");
        C10227l c10227lAdmob = AbstractC14055l.admob();
        while (interfaceC14742l.mo827l()) {
            c10227lAdmob.add(new C18580l((int) interfaceC14742l.getLong(iLoadAd), (int) interfaceC14742l.getLong(iLoadAd2), interfaceC14742l.mo826implements(iLoadAd3), interfaceC14742l.mo826implements(iLoadAd4)));
        }
        return AbstractC16901l.m4219finally(AbstractC14055l.purchase(c10227lAdmob));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: SQLiteException -> 0x00b7, LOOP:0: B:29:0x0080->B:32:0x008a, LOOP_END, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1
  0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    public static void remoteconfig(C8118l c8118l, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        Throwable th;
        Cursor cursorQuery;
        HashSet hashSet;
        Cursor cursorRawQuery;
        int i;
        int i2;
        if (c8118l == null) {
            C8339l.metrica("Monitor must not be null");
            return;
        }
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabase2 = sQLiteDatabase;
                try {
                    cursorQuery = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                    try {
                        try {
                            boolean zMoveToFirst = cursorQuery.moveToFirst();
                            cursorQuery.close();
                            if (!zMoveToFirst) {
                                sQLiteDatabase2.execSQL(str2);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        c8118l.f16910l.crashlytics(str, e, "Error querying for table");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    cursorQuery = null;
                    c8118l.f16910l.crashlytics(str, e, "Error querying for table");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    sQLiteDatabase2.execSQL(str2);
                    hashSet = new HashSet();
                    StringBuilder sb = new StringBuilder(str.length() + 22);
                    sb.append("SELECT * FROM ");
                    sb.append(str);
                    sb.append(" LIMIT 0");
                    cursorRawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
                    try {
                        Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                        cursorRawQuery.close();
                        for (String str4 : str3.split(",")) {
                            if (hashSet.remove(str4)) {
                                StringBuilder sb2 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                sb2.append("Table ");
                                sb2.append(str);
                                sb2.append(" is missing required column: ");
                                sb2.append(str4);
                                throw new SQLiteException(sb2.toString());
                            }
                        }
                        if (strArr != null) {
                            for (i = 0; i < strArr.length; i += 2) {
                                if (!hashSet.remove(strArr[i])) {
                                    sQLiteDatabase2.execSQL(strArr[i + 1]);
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                        }
                        c8118l.f16910l.crashlytics(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                sQLiteDatabase2 = sQLiteDatabase;
            }
            try {
                hashSet = new HashSet();
                StringBuilder sb3 = new StringBuilder(str.length() + 22);
                sb3.append("SELECT * FROM ");
                sb3.append(str);
                sb3.append(" LIMIT 0");
                cursorRawQuery = sQLiteDatabase2.rawQuery(sb3.toString(), null);
                Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                cursorRawQuery.close();
                while (i2 < r0) {
                    if (hashSet.remove(str4)) {
                        StringBuilder sb4 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                        sb4.append("Table ");
                        sb4.append(str);
                        sb4.append(" is missing required column: ");
                        sb4.append(str4);
                        throw new SQLiteException(sb4.toString());
                    }
                }
                if (strArr != null) {
                    while (i < strArr.length) {
                        if (!hashSet.remove(strArr[i])) {
                            sQLiteDatabase2.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    c8118l.f16910l.crashlytics(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                }
            } catch (SQLiteException e4) {
                c8118l.f16908l.loadAd(str, "Failed to verify columns on table that was just created");
                throw e4;
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    public static final int smaato(C1644l c1644l) {
        List list = c1644l.firebase;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C15237l) list.get(i2)).startapp;
        }
        return (i / list.size()) + c1644l.adcel;
    }

    public static void subs(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        AbstractC0079l.tapsense(iArr, iArr3);
        mopub(iArr3, iArr2);
    }

    public static void vip(C8118l c8118l, SQLiteDatabase sQLiteDatabase) {
        if (c8118l == null) {
            C8339l.metrica("Monitor must not be null");
            return;
        }
        C14906l c14906l = c8118l.f16910l;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            c14906l.yandex("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c14906l.yandex("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c14906l.yandex("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c14906l.yandex("Failed to turn on database write permission for owner");
    }

    public static void yandex(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = (4294967295L & ((long) iArr[2])) + 1 + j2;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            AbstractC4952l.tapsense(6, 3, iArr);
        }
    }
}
