package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lِْ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13310l extends AbstractC0036l {
    public final LinkedHashMap firebase;
    public C1790l smaato;

    public C13310l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.firebase = linkedHashMap;
        linkedHashMap.put("URI", new C13728l(this, 27));
        linkedHashMap.put("BYTERANGE", new C13728l(this, 28));
    }

    @Override // defpackage.AbstractC16178l
    public final boolean crashlytics() {
        return true;
    }

    @Override // defpackage.AbstractC16178l
    public final String loadAd() {
        return "EXT-X-MAP";
    }

    @Override // defpackage.AbstractC0036l
    public final void purchase(C7972l c7972l, C9173l c9173l) {
        amazon(c7972l, this.smaato, this.firebase);
    }
}
