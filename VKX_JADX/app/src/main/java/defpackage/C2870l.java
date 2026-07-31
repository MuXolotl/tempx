package defpackage;

import android.os.Bundle;

/* JADX INFO: renamed from: lًؔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2870l extends AbstractC10093l {
    public final /* synthetic */ AbstractC4620l mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2870l(AbstractC4620l abstractC4620l, int i, Bundle bundle) {
        super(abstractC4620l, i, bundle);
        this.mopub = abstractC4620l;
    }

    @Override // defpackage.AbstractC10093l
    public final void loadAd(C10602l c10602l) {
        AbstractC4620l abstractC4620l = this.mopub;
        abstractC4620l.getClass();
        abstractC4620l.firebase.crashlytics(c10602l);
        abstractC4620l.license(c10602l);
    }

    @Override // defpackage.AbstractC10093l
    public final boolean yandex() {
        this.mopub.firebase.crashlytics(C10602l.f21518l);
        return true;
    }
}
