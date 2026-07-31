package defpackage;

import android.util.Log;
import java.util.logging.Level;

/* JADX INFO: renamed from: lّۦٌ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12990l {
    public final String yandex;

    public AbstractC12990l(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        sb.append(z ? "DESC" : "ASC");
        this(sb.toString());
    }

    public void crashlytics(RuntimeException runtimeException, C4299l c4299l) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public abstract void loadAd(C4299l c4299l);

    public abstract boolean yandex(Level level);

    public /* synthetic */ AbstractC12990l(String str) {
        this.yandex = str;
    }
}
