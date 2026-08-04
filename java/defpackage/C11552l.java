package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: lِؑۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11552l implements InterfaceC13945l {
    public final Bundle amazon;
    public final C1021l crashlytics;
    public final CastDevice loadAd;
    public final String purchase = UUID.randomUUID().toString();

    public /* synthetic */ C11552l(C10111l c10111l) {
        this.loadAd = (CastDevice) c10111l.f20587l;
        this.crashlytics = (C1021l) c10111l.f20586l;
        this.amazon = (Bundle) c10111l.f20589l;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[RETURN] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11552l)) {
            return false;
        }
        C11552l c11552l = (C11552l) obj;
        if (AbstractC7236l.amazon(this.loadAd, c11552l.loadAd)) {
            Bundle bundle = c11552l.amazon;
            Bundle bundle2 = this.amazon;
            if (bundle2 == null || bundle == null) {
                if (bundle2 == bundle) {
                    if (AbstractC7236l.amazon(this.purchase, c11552l.purchase)) {
                        return true;
                    }
                }
            } else if (bundle2.size() == bundle.size()) {
                Set<String> setKeySet = bundle2.keySet();
                if (setKeySet.containsAll(bundle.keySet())) {
                    for (String str : setKeySet) {
                        if (!AbstractC7236l.amazon(bundle2.get(str), bundle.get(str))) {
                        }
                    }
                    if (AbstractC7236l.amazon(this.purchase, c11552l.purchase)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.loadAd, this.amazon, 0, this.purchase});
    }
}
