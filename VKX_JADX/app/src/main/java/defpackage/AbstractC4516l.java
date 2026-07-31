package defpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: renamed from: lؖۦْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4516l {
    public static final SimpleDateFormat yandex = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

    public static Date yandex(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1904, 0, 1, 0, 0, 0);
        int i = (int) (j / 3600);
        calendar.add(11, i);
        calendar.add(13, (int) (j - (((long) i) * 3600)));
        return calendar.getTime();
    }
}
