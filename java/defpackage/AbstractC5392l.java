package defpackage;

/* JADX INFO: renamed from: lؘؒۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5392l extends AbstractC11340l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public C7504l f11551l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public float f11552l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public float f11553l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C0404l f11554l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C0404l f11556l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public long f11557l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public C7504l f11559l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public C5616l f11560l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public long f11561l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public float f11562l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C13765l f11555l = new C13765l(0.0f);

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C5228l f11558l = new C5228l();

    public AbstractC5392l(long j, long j2, C0404l c0404l, C0404l c0404l2, float f, float f2, float f3) {
        this.f11557l = j;
        this.f11561l = j2;
        this.f11556l = c0404l;
        this.f11554l = c0404l2;
        this.f11553l = f;
        this.f11552l = f2;
        this.f11562l = f3;
    }

    /* JADX INFO: renamed from: lًؑٝ */
    public abstract void mo1236l();

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        this.f11560l = null;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        m1772l();
    }

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public final void m1772l() {
        C7504l c7504l = this.f11559l;
        InterfaceC14029l interfaceC14029l = null;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        this.f11559l = null;
        if (this.f29462l) {
            if (C14467l.yandex(this.f11562l, 0.0f) <= 0 || C14467l.yandex(this.f11552l, 0.0f) <= 0) {
                this.f11555l.subs(0.0f);
                return;
            }
            int iRound = Math.round((this.f11552l / this.f11562l) * 1000.0f);
            if (iRound < 50) {
                iRound = 50;
            }
            this.f11559l = AbstractC10999l.mopub(m3914l(), null, 0, new C13017l(this, iRound, interfaceC14029l, 0), 3);
        }
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public final void m1773l(float f) {
        C5616l c5616lYandex = this.f11560l;
        if (c5616lYandex == null) {
            c5616lYandex = AbstractC6791l.yandex(f);
            this.f11560l = c5616lYandex;
        }
        if (!this.f29462l || ((Number) c5616lYandex.purchase.getValue()).floatValue() == f) {
            return;
        }
        C7504l c7504l = this.f11551l;
        if (c7504l == null || c7504l.mo2155l()) {
            this.f11551l = AbstractC10999l.mopub(m3914l(), null, 0, new C17872l(c5616lYandex, f, null, 0), 3);
        }
    }

    /* JADX INFO: renamed from: l٘ۦۢ */
    public abstract void mo1238l();
}
