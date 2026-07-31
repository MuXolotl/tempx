package defpackage;

/* JADX INFO: renamed from: lٌ۠ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9100l implements InterfaceC11759l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15810l f18692l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f18693l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC11759l f18694l;

    public C9100l(C15810l c15810l, InterfaceC11759l interfaceC11759l) {
        this.f18692l = c15810l;
        this.f18694l = interfaceC11759l;
    }

    @Override // defpackage.InterfaceC11759l
    public final int adcel(C10023l c10023l, C4136l c4136l, int i) {
        C15810l c15810l = this.f18692l;
        if (c15810l.yandex()) {
            return -3;
        }
        if (this.f18693l) {
            c4136l.f16423l = 4;
            return -4;
        }
        long jAds = c15810l.ads();
        int iAdcel = this.f18694l.adcel(c10023l, c4136l, i);
        if (c15810l.f31048l != -9223372036854775807L && iAdcel != -3) {
            c15810l.f31048l = -9223372036854775807L;
        }
        if (iAdcel != -5) {
            long j = c15810l.f31044l;
            if (j == Long.MIN_VALUE || ((iAdcel != -4 || c4136l.f8496l < j) && !(iAdcel == -3 && jAds == Long.MIN_VALUE && !c4136l.f8501l))) {
                return iAdcel;
            }
            c4136l.remoteconfig();
            c4136l.f16423l = 4;
            this.f18693l = true;
            return -4;
        }
        long j2 = c15810l.f31050l;
        long j3 = c15810l.f31044l;
        C5978l c5978l = (C5978l) c10023l.f20418l;
        c5978l.getClass();
        int i2 = c5978l.f12618native;
        int i3 = c5978l.f12625volatile;
        if (i3 != 0 || i2 != 0) {
            if (j2 != 0) {
                i3 = 0;
            }
            if (j3 != Long.MIN_VALUE) {
                i2 = 0;
            }
            C12984l c12984lYandex = c5978l.yandex();
            c12984lYandex.f25444strictfp = i3;
            c12984lYandex.f25448volatile = i2;
            c10023l.f20418l = new C5978l(c12984lYandex);
        }
        return -5;
    }

    @Override // defpackage.InterfaceC11759l
    public final void firebase() {
        this.f18694l.firebase();
    }

    @Override // defpackage.InterfaceC11759l
    public final int smaato(long j) {
        if (this.f18692l.yandex()) {
            return -3;
        }
        return this.f18694l.smaato(j);
    }

    @Override // defpackage.InterfaceC11759l
    public final boolean yandex() {
        return !this.f18692l.yandex() && this.f18694l.yandex();
    }
}
