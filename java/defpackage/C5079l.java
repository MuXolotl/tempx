package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: lّؗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5079l extends AbstractC7188l {
    public static final C13850l crashlytics = new C13850l(2);
    public final /* synthetic */ int loadAd;
    public final AbstractC7188l yandex;

    public C5079l(AbstractC7188l abstractC7188l, int i) {
        this.loadAd = i;
        this.yandex = abstractC7188l;
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        int i = this.loadAd;
        AbstractC7188l abstractC7188l = this.yandex;
        switch (i) {
            case 0:
                c3631l.billing();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    abstractC7188l.billing(c3631l, it.next());
                }
                c3631l.vip(1, 2, ']');
                break;
            default:
                c3631l.billing();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    abstractC7188l.billing(c3631l, it2.next());
                }
                c3631l.vip(1, 2, ']');
                break;
        }
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        int i = this.loadAd;
        AbstractC7188l abstractC7188l = this.yandex;
        switch (i) {
            case 0:
                Collection collectionMopub = mopub();
                c0396l.yandex();
                while (c0396l.m504package()) {
                    ((ArrayList) collectionMopub).add(abstractC7188l.loadAd(c0396l));
                }
                c0396l.adcel();
                return collectionMopub;
            default:
                Collection collectionMopub2 = mopub();
                c0396l.yandex();
                while (c0396l.m504package()) {
                    collectionMopub2.add(abstractC7188l.loadAd(c0396l));
                }
                c0396l.adcel();
                return collectionMopub2;
        }
    }

    public final Collection mopub() {
        switch (this.loadAd) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    public final String toString() {
        return this.yandex + ".collection()";
    }
}
