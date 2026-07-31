package defpackage;

import android.graphics.Paint;

/* JADX INFO: renamed from: lٖٕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16409l {
    public static final C16409l yandex = new C16409l();

    public final void crashlytics(Paint paint, long j) {
        paint.setColor(AbstractC9168l.remoteconfig(j));
    }

    public final void loadAd(Paint paint, int i) {
        paint.setBlendMode(AbstractC11880l.m3270case(i));
    }

    public final long yandex(Paint paint) {
        int i = C9735l.smaato;
        long colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        return j < 16 ? colorLong : (colorLong & (-64)) | (j + 1);
    }
}
