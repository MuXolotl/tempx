package defpackage;

/* JADX INFO: renamed from: lٖۥٍ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16760l extends AbstractC3740l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC13922l[] f32761l = {new C0544l(C16760l.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0), new C0544l(C16760l.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0)};

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final InterfaceC3841l f32762l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C1553l f32763l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C2278l f32764l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C10353l f32765l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C10038l f32766l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C11132l f32767l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C16760l(C10038l c10038l, C1553l c1553l) {
        C7757l c7757l = (C7757l) c10038l.f20463l;
        super(c7757l.metrica, c1553l.yandex);
        this.f32763l = c1553l;
        C10038l c10038lBilling = AbstractC14460l.billing(c10038l, this, null, 6);
        C7757l c7757l2 = (C7757l) c10038lBilling.f20463l;
        C16412l c16412l = c7757l2.yandex;
        this.f32766l = c10038lBilling;
        C0511l c0511l = c7757l.amazon.yandex;
        ((C17334l) (c0511l != null ? c0511l : null).crashlytics).getClass();
        C4995l c4995l = C4995l.mopub;
        C17622l c17622l = new C17622l(this, 0);
        c16412l.getClass();
        this.f32764l = new C2278l(c16412l, c17622l);
        this.f32767l = new C11132l(c10038lBilling, c1553l, this);
        C17622l c17622l2 = new C17622l(this, 1);
        c16412l.getClass();
        this.f32765l = new C10353l(c16412l, c17622l2);
        this.f32762l = c7757l2.license.f17793l ? C2782l.f6058l : AbstractC12081l.billing(c10038lBilling, c1553l);
        c16412l.yandex(new C17622l(this, 2));
    }

    @Override // defpackage.AbstractC3740l, defpackage.AbstractC1281l, defpackage.InterfaceC10233l
    public final InterfaceC5706l billing() {
        return new C7026l(11, this);
    }

    @Override // defpackage.Cgoto, defpackage.InterfaceC2853l
    public final InterfaceC3841l getAnnotations() {
        return this.f32762l;
    }

    @Override // defpackage.InterfaceC9921l
    /* JADX INFO: renamed from: public */
    public final InterfaceC7637l mo2432public() {
        return this.f32767l;
    }

    @Override // defpackage.AbstractC3740l, defpackage.AbstractC2775l, defpackage.Cgoto
    public final String toString() {
        return "Lazy Java package fragment: " + this.f7826l + " of module " + ((C7757l) this.f32766l.f20463l).metrica;
    }
}
