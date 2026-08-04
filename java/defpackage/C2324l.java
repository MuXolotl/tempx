package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* JADX INFO: renamed from: lٜؔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2324l extends AbstractC1132l implements InterfaceC7760l {
    public final boolean amazon;
    public final String crashlytics;
    public final Annotation[] loadAd;
    public final AbstractC11072l yandex;

    public C2324l(AbstractC11072l abstractC11072l, Annotation[] annotationArr, String str, boolean z) {
        this.yandex = abstractC11072l;
        this.loadAd = annotationArr;
        this.crashlytics = str;
        this.amazon = z;
    }

    @Override // defpackage.InterfaceC7760l
    public final Collection getAnnotations() {
        return AbstractC14312l.admob(this.loadAd);
    }

    @Override // defpackage.InterfaceC7760l
    public final C8673l loadAd(C2312l c2312l) {
        return AbstractC14312l.mopub(this.loadAd, c2312l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C2324l.class.getName());
        sb.append(": ");
        sb.append(this.amazon ? "vararg " : "");
        String str = this.crashlytics;
        sb.append(str != null ? C3498l.amazon(str) : null);
        sb.append(": ");
        sb.append(this.yandex);
        return sb.toString();
    }
}
