package defpackage;

import android.graphics.Path;

/* JADX INFO: renamed from: lؕٙۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3478l {
    public static final void crashlytics(String str) {
        throw new IllegalStateException(str);
    }

    public static final Path.Direction loadAd(int i) {
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return Path.Direction.CCW;
        }
        if (iInmobi == 1) {
            return Path.Direction.CW;
        }
        C18725l.billing();
        return null;
    }

    public static final C9902l yandex() {
        return new C9902l(new Path());
    }
}
