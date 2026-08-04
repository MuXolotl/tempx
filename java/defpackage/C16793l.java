package defpackage;

/* JADX INFO: renamed from: lٖۧۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16793l implements InterfaceC17842l {
    public final InterfaceC9573l amazon;
    public final C6921l crashlytics;
    public final C10023l loadAd;
    public final C4917l purchase;
    public final InterfaceC12356l yandex;

    public C16793l(InterfaceC12356l interfaceC12356l, C10023l c10023l, C6921l c6921l, InterfaceC9573l interfaceC9573l) {
        this.yandex = interfaceC12356l;
        this.loadAd = c10023l == null ? new C10023l((C7695l) null) : c10023l;
        if (c6921l == null) {
            c6921l = new C6921l(4);
            if (interfaceC12356l.yandex() == EnumC2771l.f6019l) {
                c6921l.admob();
            } else {
                interfaceC12356l.mopub(new C8633l(3, c6921l));
            }
        }
        this.crashlytics = c6921l;
        this.amazon = interfaceC9573l == null ? new C3464l() : interfaceC9573l;
        this.purchase = C4917l.f10026l;
    }

    @Override // defpackage.InterfaceC17842l
    public final C10023l amazon() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC17842l
    public final C4917l billing() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC17842l
    public final C6921l crashlytics() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC12356l loadAd() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC9573l purchase() {
        return this.amazon;
    }
}
