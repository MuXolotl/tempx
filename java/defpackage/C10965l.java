package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lُُؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10965l extends AbstractC0036l {
    public final HashMap firebase;
    public C4273l smaato;

    public C10965l() {
        HashMap map = new HashMap();
        this.firebase = map;
        map.put("METHOD", new C13728l(22));
        map.put("URI", new C13728l(this, 23));
        map.put("IV", new C13728l(24));
        map.put("KEYFORMAT", new C13728l(this, 25));
        map.put("KEYFORMATVERSIONS", new C13728l(this, 26));
    }

    @Override // defpackage.AbstractC16178l
    public final boolean crashlytics() {
        return true;
    }

    @Override // defpackage.AbstractC16178l
    public final String loadAd() {
        return "EXT-X-KEY";
    }

    @Override // defpackage.AbstractC0036l
    public final void purchase(C7972l c7972l, C9173l c9173l) {
        amazon(c7972l, this.smaato, this.firebase);
    }
}
