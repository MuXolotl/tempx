package defpackage;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: lٖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3419l extends AbstractC0036l {
    public final HashMap firebase;

    public C3419l() {
        HashMap map = new HashMap();
        this.firebase = map;
        map.put("TIME-OFFSET", new C13728l(20));
        map.put("PRECISE", new C13728l(21));
    }

    @Override // defpackage.AbstractC16178l
    public final boolean crashlytics() {
        return true;
    }

    @Override // defpackage.AbstractC16178l
    public final String loadAd() {
        return "EXT-X-START";
    }

    @Override // defpackage.AbstractC0036l
    public final void purchase(C7972l c7972l, C9173l c9173l) throws IOException {
        C2421l c2421l = c9173l.admob;
        if (c2421l != null) {
            amazon(c7972l, c2421l, this.firebase);
        }
    }
}
