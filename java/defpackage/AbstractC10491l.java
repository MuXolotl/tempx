package defpackage;

/* JADX INFO: renamed from: lٌَۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10491l extends AbstractC6273l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f21362l;

    public AbstractC10491l(C6901l c6901l) {
        super(c6901l);
        this.f13233l.f14481l++;
    }

    /* JADX INFO: renamed from: lَؙ۠ */
    public abstract void mo1780l();

    /* JADX INFO: renamed from: lًٔۘ, reason: contains not printable characters */
    public final void m2926l() {
        if (this.f21362l) {
            C8339l.smaato("Can't initialize twice");
            return;
        }
        mo1780l();
        this.f13233l.f14461l++;
        this.f21362l = true;
    }

    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public final void m2927l() {
        if (this.f21362l) {
            return;
        }
        C8339l.smaato("Not initialized");
    }
}
