package defpackage;

/* JADX INFO: renamed from: lًٌۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8316l implements InterfaceC17842l {
    public final AbstractC18082l crashlytics = AbstractC0509l.crashlytics(EnumC0756l.f2279l, EnumC0756l.f2281l, EnumC0756l.f2277l, EnumC0756l.f2278l);
    public final C3151l loadAd;
    public final /* synthetic */ C16793l yandex;

    public C8316l(C16793l c16793l, C3151l c3151l, C10832l c10832l) {
        this.yandex = c16793l;
        this.loadAd = c3151l;
    }

    @Override // defpackage.InterfaceC17842l
    public final C10023l amazon() {
        return this.yandex.loadAd;
    }

    @Override // defpackage.InterfaceC17842l
    public final C4917l billing() {
        return this.yandex.purchase;
    }

    @Override // defpackage.InterfaceC17842l
    public final C6921l crashlytics() {
        return this.yandex.crashlytics;
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC12356l loadAd() {
        return this.yandex.yandex;
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC9573l purchase() {
        return this.yandex.amazon;
    }
}
