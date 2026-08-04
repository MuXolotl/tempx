package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lْؒ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C1363l implements InterfaceC5470l {
    public static final /* synthetic */ InterfaceC13922l[] purchase = {new C0544l(C1363l.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)};
    public final InterfaceC0808l amazon;
    public final C2278l crashlytics;
    public final InterfaceC5706l loadAd;
    public final C2312l yandex;

    public C1363l(C10038l c10038l, C8673l c8673l, C2312l c2312l) {
        C7757l c7757l = (C7757l) c10038l.f20463l;
        this.yandex = c2312l;
        this.loadAd = c8673l != null ? c7757l.isPro.startapp(c8673l) : InterfaceC5706l.f12087l;
        C16412l c16412l = c7757l.yandex;
        C0340l c0340l = new C0340l(c10038l, this, false, 25);
        c16412l.getClass();
        this.crashlytics = new C2278l(c16412l, c0340l);
        this.amazon = c8673l != null ? (InterfaceC0808l) AbstractC16901l.m4234private(c8673l.yandex()) : null;
    }

    @Override // defpackage.InterfaceC1910l
    public Map admob() {
        return C14054l.f27396l;
    }

    @Override // defpackage.InterfaceC1910l
    public final InterfaceC5706l billing() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC1910l
    public final C2312l mopub() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC1910l
    public final AbstractC18041l yandex() {
        InterfaceC13922l interfaceC13922l = purchase[0];
        return (AbstractC15211l) this.crashlytics.invoke();
    }
}
