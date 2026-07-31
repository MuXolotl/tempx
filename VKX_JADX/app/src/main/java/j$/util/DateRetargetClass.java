package j$.util;

import j$.time.Instant;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DateRetargetClass {
    public static Instant toInstant(Date date) {
        long time = date.getTime();
        Instant instant = Instant.c;
        return Instant.N(j$.com.android.tools.r8.a.W(time, 1000L), ((int) j$.com.android.tools.r8.a.V(time, 1000L)) * 1000000);
    }
}
