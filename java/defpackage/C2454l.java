package defpackage;

import android.os.Bundle;

/* JADX INFO: renamed from: lؙؔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2454l extends AbstractRunnableC17845l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f5242l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f5243l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C9471l f5244l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2454l(C9471l c9471l, Exception exc) {
        super(c9471l, false);
        this.f5243l = 3;
        this.f5242l = exc;
        this.f5244l = c9471l;
    }

    @Override // defpackage.AbstractRunnableC17845l
    public final void yandex() {
        switch (this.f5243l) {
            case 0:
                InterfaceC0591l interfaceC0591l = this.f5244l.billing;
                AbstractC1051l.subs(interfaceC0591l);
                interfaceC0591l.setUserProperty("fcm", "_ln", new BinderC14844l(this.f5242l), true, this.f34775l);
                break;
            case 1:
                InterfaceC0591l interfaceC0591l2 = this.f5244l.billing;
                AbstractC1051l.subs(interfaceC0591l2);
                interfaceC0591l2.setConditionalUserProperty((Bundle) this.f5242l, this.f34775l);
                break;
            case 2:
                InterfaceC0591l interfaceC0591l3 = this.f5244l.billing;
                AbstractC1051l.subs(interfaceC0591l3);
                interfaceC0591l3.retrieveAndUploadBatches(new BinderC5326l(this, (RunnableC16301l) this.f5242l));
                break;
            case 3:
                InterfaceC0591l interfaceC0591l4 = this.f5244l.billing;
                AbstractC1051l.subs(interfaceC0591l4);
                interfaceC0591l4.logHealthData(5, "Error with data collection. Data lost.", new BinderC14844l((Exception) this.f5242l), new BinderC14844l(null), new BinderC14844l(null));
                break;
            default:
                InterfaceC0591l interfaceC0591l5 = this.f5244l.billing;
                AbstractC1051l.subs(interfaceC0591l5);
                interfaceC0591l5.registerOnMeasurementEventListener((BinderC18697l) this.f5242l);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2454l(C9471l c9471l, Object obj, int i) {
        super(c9471l, true);
        this.f5243l = i;
        this.f5242l = obj;
        this.f5244l = c9471l;
    }
}
