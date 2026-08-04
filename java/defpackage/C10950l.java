package defpackage;

/* JADX INFO: renamed from: lََُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10950l implements InterfaceC12852l {
    public EnumC5421l yandex;

    @Override // defpackage.InterfaceC12852l
    public C2888l zza() {
        C1424l c1424l = new C1424l();
        EnumC14285l enumC14285l = AbstractC14693l.crashlytics() ? EnumC14285l.TYPE_THICK : EnumC14285l.TYPE_THIN;
        EnumC5421l enumC5421l = this.yandex;
        c1424l.f3601l = enumC14285l;
        C10950l c10950l = new C10950l();
        c10950l.yandex = enumC5421l;
        c1424l.f3604l = new C17080l(c10950l);
        return new C2888l(c1424l, 0);
    }
}
