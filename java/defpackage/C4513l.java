package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؖۦٌ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C4513l {
    public static final C8133l Companion = new C8133l();
    public static final InterfaceC1220l[] isPro = {null, null, AbstractC9968l.crashlytics(2, new C8810l(16)), null, null, null, null, null, null};
    public final Integer admob;
    public final String amazon;
    public final Double billing;
    public final List crashlytics;
    public final String loadAd;
    public final Double mopub;
    public final String purchase;
    public final String subs;
    public final int yandex;

    public /* synthetic */ C4513l(int i, int i2, String str, List list, String str2, String str3, Double d, Double d2, Integer num, String str4) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C14862l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = str;
        if ((i & 4) == 0) {
            this.crashlytics = C2580l.f5619l;
        } else {
            this.crashlytics = list;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = str2;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str3;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = d;
        }
        if ((i & 64) == 0) {
            this.mopub = null;
        } else {
            this.mopub = d2;
        }
        if ((i & 128) == 0) {
            this.admob = null;
        } else {
            this.admob = num;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.subs = null;
        } else {
            this.subs = str4;
        }
    }
}
