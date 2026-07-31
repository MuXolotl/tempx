package defpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: lًۥۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8397l extends AbstractC10115l {
    public final HashMap billing;

    public C8397l() {
        HashMap map = new HashMap();
        this.billing = map;
        map.put("TYPE", new C13728l(2));
        map.put("URI", new C13728l(this, 3));
        map.put("GROUP-ID", new C13728l(this, 4));
        map.put("LANGUAGE", new C13728l(this, 5));
        map.put("ASSOC-LANGUAGE", new C13728l(this, 6));
        map.put("NAME", new C13728l(this, 7));
        map.put("DEFAULT", new C13728l(8));
        map.put("AUTOSELECT", new C13728l(9));
        map.put("FORCED", new C13728l(10));
        map.put("INSTREAM-ID", new C13728l(this, 0));
        map.put("CHARACTERISTICS", new C13728l(this, 1));
    }

    @Override // defpackage.AbstractC16178l
    public final boolean crashlytics() {
        return true;
    }

    @Override // defpackage.AbstractC16178l
    public final String loadAd() {
        return "EXT-X-MEDIA";
    }

    @Override // defpackage.AbstractC10115l
    public final void purchase(C7972l c7972l, C15019l c15019l) throws IOException {
        if (c15019l.crashlytics.size() > 0) {
            Iterator it = c15019l.crashlytics.iterator();
            while (it.hasNext()) {
                amazon(c7972l, (C9221l) it.next(), this.billing);
            }
        }
    }
}
