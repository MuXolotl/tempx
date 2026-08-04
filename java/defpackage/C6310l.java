package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: renamed from: lؙؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6310l extends AbstractC12990l {
    public final C7502l amazon;
    public final Set crashlytics;
    public final Level loadAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6310l(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = C6776l.billing;
        this.loadAd = level;
        this.crashlytics = C6776l.billing;
        this.amazon = C6776l.mopub;
    }

    @Override // defpackage.AbstractC12990l
    public final void loadAd(C4299l c4299l) {
        String strYandex = (String) c4299l.amazon().isPro(InterfaceC6807l.yandex);
        if (strYandex == null) {
            strYandex = this.yandex;
        }
        if (strYandex == null) {
            AbstractC6082l abstractC6082l = c4299l.amazon;
            if (abstractC6082l == null) {
                C8339l.smaato("cannot request log site information prior to postProcess()");
                return;
            }
            strYandex = abstractC6082l.yandex();
            int iIndexOf = strYandex.indexOf(36, strYandex.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strYandex = strYandex.substring(0, iIndexOf);
            }
        }
        C6776l.amazon(c4299l, AbstractC1896l.admob(strYandex), this.loadAd, this.crashlytics, this.amazon);
    }

    @Override // defpackage.AbstractC12990l
    public final boolean yandex(Level level) {
        return true;
    }
}
