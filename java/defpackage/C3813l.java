package defpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: lٜؕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3813l extends AbstractC10115l {
    public final HashMap billing;
    public final /* synthetic */ int mopub;

    public C3813l(int i) {
        this.mopub = i;
        HashMap map = new HashMap();
        this.billing = map;
        map.put("BANDWIDTH", new C13728l(15));
        map.put("AVERAGE-BANDWIDTH", new C13728l(16));
        map.put("CODECS", new C7143l(this, 0));
        map.put("RESOLUTION", new C13728l(17));
        map.put("FRAME-RATE", new C13728l(18));
        map.put("VIDEO", new C7143l(this, 1));
        map.put("PROGRAM-ID", new C13728l(19));
    }

    @Override // defpackage.AbstractC16178l
    public final boolean crashlytics() {
        return true;
    }

    @Override // defpackage.AbstractC16178l
    public final String loadAd() {
        switch (this.mopub) {
            case 0:
                return "EXT-X-I-FRAME-STREAM-INF";
            default:
                return "EXT-X-STREAM-INF";
        }
    }

    @Override // defpackage.AbstractC10115l
    public final void purchase(C7972l c7972l, C15019l c15019l) throws IOException {
        int i = this.mopub;
        HashMap map = this.billing;
        switch (i) {
            case 0:
                Iterator it = c15019l.loadAd.iterator();
                while (it.hasNext()) {
                    amazon(c7972l, (C8205l) it.next(), map);
                }
                break;
            default:
                for (C4246l c4246l : c15019l.yandex) {
                    C12431l c12431l = c4246l.loadAd;
                    if (c12431l != null) {
                        amazon(c7972l, c12431l, map);
                        c7972l.m2221break(c4246l.yandex);
                    }
                }
                break;
        }
    }
}
