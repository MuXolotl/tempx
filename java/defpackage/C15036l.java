package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٔٝؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15036l extends C1363l {
    public static final /* synthetic */ InterfaceC13922l[] mopub = {new C0544l(C15036l.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    public final C2278l billing;

    public C15036l(C8673l c8673l, C10038l c10038l) {
        super(c10038l, c8673l, AbstractC3333l.remoteconfig);
        C16412l c16412l = ((C7757l) c10038l.f20463l).yandex;
        C15152l c15152l = C15152l.f29732l;
        c16412l.getClass();
        this.billing = new C2278l(c16412l, c15152l);
    }

    @Override // defpackage.C1363l, defpackage.InterfaceC1910l
    public final Map admob() {
        InterfaceC13922l interfaceC13922l = mopub[0];
        return (Map) this.billing.invoke();
    }
}
