package defpackage;

/* JADX INFO: renamed from: lْٖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14868l extends AbstractC1872l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ int f29098l = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f29099l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C11315l f29100l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f29101l;

    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public final void m3898l(boolean z) {
        this.f29099l = (z ? 4294967296L : 1L) + this.f29099l;
        if (z) {
            return;
        }
        this.f29101l = true;
    }

    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public final void m3899l(AbstractC6691l abstractC6691l) {
        C11315l c11315l = this.f29100l;
        if (c11315l == null) {
            c11315l = new C11315l();
            this.f29100l = c11315l;
        }
        c11315l.addLast(abstractC6691l);
    }

    /* JADX INFO: renamed from: lٍؘؘ */
    public abstract long mo3213l();

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public final void m3900l(boolean z) {
        long j = this.f29099l - (z ? 4294967296L : 1L);
        this.f29099l = j;
        if (j <= 0 && this.f29101l) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: lْٗٔ, reason: contains not printable characters */
    public final boolean m3901l() {
        C11315l c11315l = this.f29100l;
        if (c11315l == null) {
            return false;
        }
        AbstractC6691l abstractC6691l = (AbstractC6691l) (c11315l.isEmpty() ? null : c11315l.removeFirst());
        if (abstractC6691l == null) {
            return false;
        }
        abstractC6691l.run();
        return true;
    }

    public abstract void shutdown();

    @Override // defpackage.AbstractC1872l
    /* JADX INFO: renamed from: while */
    public final AbstractC1872l mo1066while(int i) {
        AbstractC7798l.loadAd(i);
        return this;
    }
}
