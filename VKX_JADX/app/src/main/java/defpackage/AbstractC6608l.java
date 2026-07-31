package defpackage;

import android.os.Trace;

/* JADX INFO: renamed from: lؙٖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6608l {
    public static final C11879l yandex = AbstractC1805l.loadAd(0);

    public static final C4723l yandex(C3026l c3026l) {
        try {
            Trace.beginSection("CameraPipe");
            return new C4723l(new C5954l(new C10975l(5, c3026l), new C7221l(c3026l.loadAd)));
        } finally {
            Trace.endSection();
        }
    }
}
