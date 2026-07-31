package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lّ۠۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12912l extends AbstractC2069l {
    public final /* synthetic */ AbstractC4957l firebase;
    public final /* synthetic */ ArrayList isPro;

    public C12912l(ArrayList arrayList, AbstractC4957l abstractC4957l) {
        this.isPro = arrayList;
        this.firebase = abstractC4957l;
    }

    @Override // defpackage.AbstractC2069l
    public final void loadAd(InterfaceC0207l interfaceC0207l, InterfaceC0207l interfaceC0207l2) {
        throw new IllegalStateException(("Conflict in scope of " + this.firebase.loadAd + ": " + interfaceC0207l + " vs " + interfaceC0207l2).toString());
    }

    @Override // defpackage.AbstractC2069l
    public final void yandex(InterfaceC0207l interfaceC0207l) {
        C14450l.ads(interfaceC0207l, null);
        this.isPro.add(interfaceC0207l);
    }
}
