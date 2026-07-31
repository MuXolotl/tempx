package defpackage;

import android.net.Uri;

/* JADX INFO: renamed from: lؙؕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3579l {
    public static final C15615l yandex;

    static {
        C15615l c15615l;
        Uri uri = AbstractC4586l.yandex;
        synchronized (AbstractC12155l.class) {
            try {
                if (AbstractC12155l.yandex == null) {
                    AbstractC12155l.billing(new C15615l(6));
                }
                c15615l = AbstractC12155l.yandex;
            } catch (Throwable th) {
                throw th;
            }
        }
        yandex = c15615l;
    }
}
