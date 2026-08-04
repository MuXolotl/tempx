package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: renamed from: lٔۦۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15318l {
    public final C12100l amazon;
    public final BinderC3285l crashlytics;
    public final String loadAd;
    public final BinderC2728l purchase;
    public final Context yandex;

    public C15318l(Context context, C12100l c12100l, BinderC2728l binderC2728l) {
        String strLoadAd;
        boolean zIsEmpty = DesugarCollections.unmodifiableList(c12100l.f24035l).isEmpty();
        String str = c12100l.f24036l;
        if (zIsEmpty) {
            strLoadAd = AbstractC0555l.amazon(str);
        } else {
            List listUnmodifiableList = DesugarCollections.unmodifiableList(c12100l.f24035l);
            if (str == null) {
                C8339l.metrica("applicationId cannot be null");
                throw null;
            }
            if (listUnmodifiableList == null) {
                C8339l.metrica("namespaces cannot be null");
                throw null;
            }
            strLoadAd = new C7847l(str, listUnmodifiableList).loadAd();
        }
        this.crashlytics = new BinderC3285l(this);
        this.yandex = context.getApplicationContext();
        AbstractC1051l.billing(strLoadAd);
        this.loadAd = strLoadAd;
        this.amazon = c12100l;
        this.purchase = binderC2728l;
    }
}
