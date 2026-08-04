package defpackage;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: lًْۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7973l {
    public static final TimeZone yandex = DesugarTimeZone.getTimeZone("GMT");
    public static final int[] loadAd = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
    public static final int[] crashlytics = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};

    public static final C8485l loadAd(Long l) {
        int i;
        int i2;
        long jLongValue = l != null ? l.longValue() : System.currentTimeMillis();
        long j = jLongValue / 1000;
        if (jLongValue - (1000 * j) != 0 && (((1000 ^ jLongValue) >> 63) | 1) < 0) {
            j--;
        }
        long j2 = j % 86400;
        if (j2 == 0) {
            j2 = 0;
        } else if ((((j ^ 86400) >> 63) | 1) <= 0) {
            j2 += 86400;
        }
        int i3 = (int) (j2 % 60);
        int i4 = (int) ((j2 / 60) % 60);
        int i5 = (int) (j2 / 3600);
        long j3 = j / 86400;
        if (j - (86400 * j3) != 0 && (((j ^ 86400) >> 63) | 1) < 0) {
            j3--;
        }
        int i6 = (int) j3;
        EnumC14872l enumC14872l = (EnumC14872l) EnumC14872l.f29104l.get(((i6 % 7) + 10) % 7);
        int i7 = 719468 + i6;
        if (i7 >= 0) {
            i = i7 / 146097;
            i2 = i7 % 146097;
        } else {
            i = (i6 + 573372) / 146097;
            i2 = i7 - (146097 * i);
        }
        int i8 = (((i2 / 36524) + (i2 - (i2 / 1460))) - (i2 / 146096)) / 365;
        int i9 = (i * 400) + i8;
        int i10 = i2 - (((i8 / 4) + (i8 * 365)) - (i8 / 100));
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = (i10 - (((i11 * 153) + 2) / 5)) + 1;
        int i13 = i11 < 10 ? i11 + 2 : i11 - 10;
        if (i13 <= 1) {
            i9++;
        }
        int i14 = i9;
        return new C8485l(i3, i4, i5, enumC14872l, i12, ((i14 % 4 != 0 || (i14 % 100 == 0 && i14 % 400 != 0)) ? loadAd : crashlytics)[i13] + i12, (EnumC7557l) EnumC7557l.f15554l.get(i13), i14, jLongValue);
    }

    public static final C8485l yandex(int i, int i2, int i3, int i4, EnumC7557l enumC7557l, int i5) {
        Calendar calendar = Calendar.getInstance(yandex, Locale.ROOT);
        calendar.set(1, i5);
        calendar.set(2, enumC7557l.ordinal());
        calendar.set(5, i4);
        calendar.set(11, i3);
        calendar.set(12, i2);
        calendar.set(13, i);
        calendar.set(14, 0);
        int i6 = calendar.get(16) + calendar.get(15);
        return new C8485l(calendar.get(13), calendar.get(12), calendar.get(11), (EnumC14872l) EnumC14872l.f29104l.get((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), (EnumC7557l) EnumC7557l.f15554l.get(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + ((long) i6));
    }
}
