package defpackage;

/* JADX INFO: renamed from: lٜٗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16905l extends AbstractC14165l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C10023l f32966l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public float f32967l = 1.0f;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC6347l f32968l;

    public C16905l(InterfaceC6347l interfaceC6347l, AbstractC18072l abstractC18072l, C10023l c10023l) {
        this.f32968l = interfaceC6347l;
        this.f32966l = c10023l;
    }

    @Override // defpackage.AbstractC14165l
    public final boolean amazon(float f) {
        this.f32967l = f;
        return true;
    }

    @Override // defpackage.AbstractC14165l
    public final void isPro(InterfaceC13349l interfaceC13349l) {
        C10023l c10023l = this.f32966l;
        InterfaceC6347l interfaceC6347l = this.f32968l;
        long jAdmob = interfaceC13349l.admob();
        EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
        synchronized (c10023l) {
            C10025l c10025l = (C10025l) c10023l.f20418l;
            if (c10025l == null) {
                C10025l c10025l2 = new C10025l(AbstractC16837l.yandex, 0L, EnumC9931l.f20223l, 1.0f, null);
                c10023l.f20418l = c10025l2;
                c10025l = c10025l2;
            }
            c10025l.yandex = interfaceC6347l;
            c10025l.loadAd = jAdmob;
            c10025l.crashlytics = layoutDirection;
            c10025l.amazon = interfaceC13349l.loadAd();
            C13660l c13660l = (C13660l) c10023l.f20419l;
            if (c13660l == null) {
                c13660l = new C13660l();
                c10023l.f20419l = c13660l;
            }
            if (((C3450l) c13660l.mopub(c10025l)) == null) {
                interfaceC6347l.yandex(jAdmob, layoutDirection, interfaceC13349l);
                C3450l c3450l = new C3450l();
                int i = C9735l.smaato;
                AbstractC4311l.yandex();
                C13660l c13660l2 = (C13660l) c10023l.f20419l;
                if (c13660l2 == null) {
                    c13660l2 = new C13660l();
                    c10023l.f20419l = c13660l2;
                }
                c13660l2.vip(new C10025l(c10025l.yandex, c10025l.loadAd, c10025l.crashlytics, c10025l.amazon, null), c3450l);
            }
        }
        interfaceC13349l.admob();
        throw null;
    }

    @Override // defpackage.AbstractC14165l
    public final boolean purchase(AbstractC8939l abstractC8939l) {
        return true;
    }

    @Override // defpackage.AbstractC14165l
    public final long subs() {
        return 9205357640488583168L;
    }

    @Override // defpackage.AbstractC14165l
    public final void billing(EnumC9931l enumC9931l) {
    }
}
