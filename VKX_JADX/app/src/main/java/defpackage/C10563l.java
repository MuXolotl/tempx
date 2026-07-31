package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lَۛؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10563l extends AbstractC11739l implements InterfaceC2743l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f21474l = 0;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f21475l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC2743l f21476l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f21477l;

    public C10563l(C18210l c18210l) {
        this.f21475l = c18210l;
    }

    @Override // defpackage.InterfaceC2743l
    public final long firebase(int i) {
        InterfaceC2743l interfaceC2743l = this.f21476l;
        interfaceC2743l.getClass();
        return interfaceC2743l.firebase(i) + this.f21477l;
    }

    @Override // defpackage.InterfaceC2743l
    public final List metrica(long j) {
        InterfaceC2743l interfaceC2743l = this.f21476l;
        interfaceC2743l.getClass();
        return interfaceC2743l.metrica(j - this.f21477l);
    }

    @Override // defpackage.InterfaceC2743l
    public final int purchase(long j) {
        InterfaceC2743l interfaceC2743l = this.f21476l;
        interfaceC2743l.getClass();
        return interfaceC2743l.purchase(j - this.f21477l);
    }

    @Override // defpackage.AbstractC11739l
    public final void remoteconfig() {
        this.f16423l = 0;
        this.f23515l = 0L;
        this.f23516l = false;
        this.f21476l = null;
    }

    @Override // defpackage.InterfaceC2743l
    public final int subscription() {
        InterfaceC2743l interfaceC2743l = this.f21476l;
        interfaceC2743l.getClass();
        return interfaceC2743l.subscription();
    }

    @Override // defpackage.AbstractC11739l
    public final void vip() {
        switch (this.f21474l) {
            case 0:
                AbstractC5070l abstractC5070l = (AbstractC5070l) ((C2683l) this.f21475l).f5813l;
                remoteconfig();
                abstractC5070l.loadAd.add(this);
                break;
            default:
                ((C18210l) this.f21475l).vip(this);
                break;
        }
    }

    public /* synthetic */ C10563l() {
    }
}
