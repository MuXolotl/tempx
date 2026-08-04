package defpackage;

/* JADX INFO: renamed from: lٖؒۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1091l implements InterfaceC3184l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C18527l f3009l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f3010l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f3012l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C5019l f3014l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C5978l[] f3015l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f3016l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f3017l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C17614l f3018l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public long f3019l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public InterfaceC11759l f3020l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C17849l f3021l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public long f3022l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f3023l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C16717l f3024l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f3013l = new Object();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10023l f3008l = new C10023l();

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public long f3007l = Long.MIN_VALUE;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public AbstractC10759l f3011l = AbstractC10759l.yandex;

    public AbstractC1091l(int i) {
        this.f3012l = i;
    }

    public abstract void ad(long j, long j2);

    public final void advert(C5978l[] c5978lArr, InterfaceC11759l interfaceC11759l, long j, long j2, C5019l c5019l) {
        AbstractC12442l.subscription(!this.f3023l);
        this.f3020l = interfaceC11759l;
        this.f3014l = c5019l;
        if (this.f3007l == Long.MIN_VALUE) {
            this.f3007l = j;
        }
        this.f3015l = c5978lArr;
        this.f3022l = j2;
        Signature(c5978lArr, j, j2, c5019l);
    }

    public int applovin() {
        return 0;
    }

    public boolean appmetrica(long j) {
        return false;
    }

    public final C17361l crashlytics(Exception exc, C5978l c5978l, boolean z, int i) {
        int iPremium;
        if (c5978l == null || this.f3016l) {
            iPremium = 4;
        } else {
            this.f3016l = true;
            try {
                iPremium = premium(c5978l) & 7;
                this.f3016l = false;
            } catch (C17361l unused) {
                this.f3016l = false;
                iPremium = 4;
            } catch (Throwable th) {
                this.f3016l = false;
                throw th;
            }
        }
        return new C17361l(1, exc, i, isPro(), this.f3017l, c5978l, c5978l == null ? 4 : iPremium, this.f3014l, z);
    }

    public final boolean firebase() {
        return this.f3007l == Long.MIN_VALUE;
    }

    public abstract String isPro();

    public final void isVip(long j, boolean z, boolean z2) {
        this.f3023l = false;
        this.f3019l = j;
        this.f3007l = j;
        if (!z2) {
            InterfaceC11759l interfaceC11759l = this.f3020l;
            interfaceC11759l.getClass();
            z2 = interfaceC11759l.smaato(j - this.f3022l) != 0;
        }
        startapp(j, z, z2);
    }

    public abstract int premium(C5978l c5978l);

    public final int pro(C10023l c10023l, C4136l c4136l, int i) {
        InterfaceC11759l interfaceC11759l = this.f3020l;
        interfaceC11759l.getClass();
        int iAdcel = interfaceC11759l.adcel(c10023l, c4136l, i);
        if (iAdcel == -4) {
            if (c4136l.crashlytics(4)) {
                this.f3007l = Long.MIN_VALUE;
                return this.f3023l ? -4 : -3;
            }
            long j = c4136l.f8496l + this.f3022l;
            c4136l.f8496l = j;
            this.f3007l = Math.max(this.f3007l, j);
            return iAdcel;
        }
        if (iAdcel == -5) {
            C5978l c5978l = (C5978l) c10023l.f20418l;
            c5978l.getClass();
            long j2 = c5978l.tapsense;
            if (j2 != Long.MAX_VALUE) {
                C12984l c12984lYandex = c5978l.yandex();
                c12984lYandex.subscription = j2 + this.f3022l;
                c10023l.f20418l = new C5978l(c12984lYandex);
            }
        }
        return iAdcel;
    }

    public long purchase(long j, long j2) {
        if (this.f3010l == 1) {
            return (remoteconfig() || smaato()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public abstract boolean remoteconfig();

    public boolean smaato() {
        return firebase();
    }

    public abstract void startapp(long j, boolean z, boolean z2);

    public InterfaceC10666l subs() {
        return null;
    }

    public abstract void vip();

    public void adcel() {
    }

    public void ads() {
    }

    public void amazon() {
    }

    public void license() {
    }

    public void subscription() {
    }

    public void tapsense() {
    }

    public void metrica(boolean z, boolean z2) {
    }

    public void signatures(float f, float f2) {
    }

    @Override // defpackage.InterfaceC3184l
    public void yandex(int i, Object obj) {
    }

    public void Signature(C5978l[] c5978lArr, long j, long j2, C5019l c5019l) {
    }
}
