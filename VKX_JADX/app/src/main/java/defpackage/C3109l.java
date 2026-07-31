package defpackage;

import android.app.Activity;

/* JADX INFO: renamed from: lؕؐۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3109l extends AbstractRunnableC17845l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C14692l f6650l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f6651l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Activity f6652l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3109l(C14692l c14692l, Activity activity, int i) {
        super((C9471l) c14692l.f28756l, true);
        this.f6651l = i;
        switch (i) {
            case 1:
                this.f6652l = activity;
                this.f6650l = c14692l;
                super((C9471l) c14692l.f28756l, true);
                break;
            case 2:
                this.f6652l = activity;
                this.f6650l = c14692l;
                super((C9471l) c14692l.f28756l, true);
                break;
            case 3:
                this.f6652l = activity;
                this.f6650l = c14692l;
                super((C9471l) c14692l.f28756l, true);
                break;
            case 4:
                this.f6652l = activity;
                this.f6650l = c14692l;
                super((C9471l) c14692l.f28756l, true);
                break;
            default:
                this.f6652l = activity;
                this.f6650l = c14692l;
                break;
        }
    }

    @Override // defpackage.AbstractRunnableC17845l
    public final void yandex() {
        switch (this.f6651l) {
            case 0:
                InterfaceC0591l interfaceC0591l = ((C9471l) this.f6650l.f28756l).billing;
                AbstractC1051l.subs(interfaceC0591l);
                interfaceC0591l.onActivityStartedByScionActivityInfo(C8066l.billing(this.f6652l), this.f34774l);
                break;
            case 1:
                InterfaceC0591l interfaceC0591l2 = ((C9471l) this.f6650l.f28756l).billing;
                AbstractC1051l.subs(interfaceC0591l2);
                interfaceC0591l2.onActivityResumedByScionActivityInfo(C8066l.billing(this.f6652l), this.f34774l);
                break;
            case 2:
                InterfaceC0591l interfaceC0591l3 = ((C9471l) this.f6650l.f28756l).billing;
                AbstractC1051l.subs(interfaceC0591l3);
                interfaceC0591l3.onActivityPausedByScionActivityInfo(C8066l.billing(this.f6652l), this.f34774l);
                break;
            case 3:
                InterfaceC0591l interfaceC0591l4 = ((C9471l) this.f6650l.f28756l).billing;
                AbstractC1051l.subs(interfaceC0591l4);
                interfaceC0591l4.onActivityStoppedByScionActivityInfo(C8066l.billing(this.f6652l), this.f34774l);
                break;
            default:
                InterfaceC0591l interfaceC0591l5 = ((C9471l) this.f6650l.f28756l).billing;
                AbstractC1051l.subs(interfaceC0591l5);
                interfaceC0591l5.onActivityDestroyedByScionActivityInfo(C8066l.billing(this.f6652l), this.f34774l);
                break;
        }
    }
}
