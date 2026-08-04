package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘۨۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6148l implements InterfaceC13490l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public AbstractC8939l f12936l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public float f12937l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public float f12939l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public EnumC9931l f12940l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public InterfaceC13490l f12941l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public long f12942l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f12943l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public AbstractC15342l f12944l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f12946l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C2068l f12947l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f12948l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public float f12949l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public InterfaceC6347l f12950l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public float f12951l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public float f12953l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public long f12954l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public float f12955l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public float f12956l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public long f12957l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public long f12958l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public int f12959l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public float f12945l = 1.0f;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public float f12938l = 1.0f;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public float f12952l = 1.0f;

    public C6148l() {
        long j = AbstractC4239l.yandex;
        this.f12942l = j;
        this.f12954l = j;
        this.f12937l = 8.0f;
        this.f12957l = C1723l.loadAd;
        this.f12950l = AbstractC16837l.yandex;
        this.f12948l = 0;
        this.f12958l = 9205357640488583168L;
        this.f12947l = C2068l.yandex;
        this.f12941l = AbstractC17463l.yandex();
        this.f12940l = EnumC9931l.f20223l;
        this.f12959l = 3;
    }

    public final void Signature(float f) {
        if (this.f12951l == f) {
            return;
        }
        this.f12946l |= 8;
        this.f12951l = f;
    }

    public final void adcel(long j) {
        if (C9735l.crashlytics(this.f12954l, j)) {
            return;
        }
        this.f12946l |= 128;
        this.f12954l = j;
    }

    public final void amazon(long j) {
        if (C9735l.crashlytics(this.f12942l, j)) {
            return;
        }
        this.f12946l |= 64;
        this.f12942l = j;
    }

    public final void billing(AbstractC8939l abstractC8939l) {
        if (AbstractC8576l.yandex(this.f12936l, abstractC8939l)) {
            return;
        }
        this.f12946l |= 262144;
        this.f12936l = abstractC8939l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return AbstractC2812l.purchase(this, mo867final(f));
    }

    public final void crashlytics(float f) {
        if (this.f12952l == f) {
            return;
        }
        this.f12946l |= 4;
        this.f12952l = f;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final */
    public final float mo867final(float f) {
        return f / this.f12941l.loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ float inmobi(long j) {
        return AbstractC2812l.amazon(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: instanceof */
    public final float mo868instanceof(float f) {
        return this.f12941l.loadAd() * f;
    }

    public final void isPro(float f) {
        if (this.f12956l == f) {
            return;
        }
        this.f12946l |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
        this.f12956l = f;
    }

    @Override // defpackage.InterfaceC13490l
    public final /* synthetic */ long license(long j) {
        return AbstractC9361l.loadAd(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f12941l.loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final /* synthetic */ long mo869l(long j) {
        return AbstractC9361l.amazon(j, this);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final /* synthetic */ int mo870l(float f) {
        return AbstractC9361l.yandex(this, f);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final /* synthetic */ float mo871l(long j) {
        return AbstractC9361l.crashlytics(j, this);
    }

    public final void metrica(float f) {
        if (this.f12939l == f) {
            return;
        }
        this.f12946l |= 32;
        this.f12939l = f;
    }

    public final void mopub(int i) {
        if (this.f12948l == i) {
            return;
        }
        this.f12946l |= 32768;
        this.f12948l = i;
    }

    public final void pro(float f) {
        if (this.f12955l == f) {
            return;
        }
        this.f12946l |= 16;
        this.f12955l = f;
    }

    public final void purchase(boolean z) {
        if (this.f12943l != z) {
            this.f12946l |= 16384;
            this.f12943l = z;
        }
    }

    public final void remoteconfig(float f) {
        if (this.f12945l == f) {
            return;
        }
        this.f12946l |= 1;
        this.f12945l = f;
    }

    public final void smaato(float f) {
        if (this.f12953l == f) {
            return;
        }
        this.f12946l |= 1024;
        this.f12953l = f;
    }

    public final void startapp(InterfaceC6347l interfaceC6347l) {
        if (AbstractC8576l.yandex(this.f12950l, interfaceC6347l)) {
            return;
        }
        this.f12946l |= 8192;
        this.f12950l = interfaceC6347l;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static */
    public final float mo872static(int i) {
        return i / this.f12941l.loadAd();
    }

    public final void subs(float f) {
        if (this.f12949l == f) {
            return;
        }
        this.f12946l |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        this.f12949l = f;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return this.f12941l.mo873super();
    }

    public final void tapsense(long j) {
        if (C1723l.yandex(this.f12957l, j)) {
            return;
        }
        this.f12946l |= 4096;
        this.f12957l = j;
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return Math.round(mo871l(j));
    }

    public final void vip(float f) {
        if (this.f12938l == f) {
            return;
        }
        this.f12946l |= 2;
        this.f12938l = f;
    }

    public final void yandex() {
        remoteconfig(1.0f);
        vip(1.0f);
        crashlytics(1.0f);
        Signature(0.0f);
        pro(0.0f);
        metrica(0.0f);
        long j = AbstractC4239l.yandex;
        amazon(j);
        adcel(j);
        subs(0.0f);
        isPro(0.0f);
        smaato(0.0f);
        if (this.f12937l != 8.0f) {
            this.f12946l |= 2048;
            this.f12937l = 8.0f;
        }
        tapsense(C1723l.loadAd);
        startapp(AbstractC16837l.yandex);
        purchase(false);
        billing(null);
        if (this.f12959l != 3) {
            this.f12946l |= 524288;
            this.f12959l = 3;
        }
        mopub(0);
        C2068l c2068l = C2068l.yandex;
        if (!AbstractC8576l.yandex(this.f12947l, c2068l)) {
            this.f12946l |= 1048576;
            this.f12947l = c2068l;
        }
        this.f12958l = 9205357640488583168L;
        this.f12944l = null;
        this.f12946l = 0;
    }
}
