package defpackage;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَِؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3306l extends C11774l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C12923l f7044l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public Function1 f7045l;

    @Override // defpackage.AbstractC9067l, defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        View viewBilling = AbstractC1068l.billing(this);
        C12923l c12923l = this.f7044l;
        if (c12923l != null) {
            int i = c12923l.Signature - 1;
            c12923l.Signature = i;
            if (i == 0) {
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                AbstractC8558l.crashlytics(viewBilling, null);
                AbstractC15872l.startapp(viewBilling, null);
                viewBilling.removeOnAttachStateChangeListener(c12923l.license);
            }
        }
        super.mo535l();
    }

    @Override // defpackage.AbstractC9067l, defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        View viewBilling = AbstractC1068l.billing(this);
        WeakHashMap weakHashMap = C12923l.pro;
        C12923l c12923lVip = C6760l.vip(viewBilling);
        c12923lVip.yandex(viewBilling);
        InterfaceC10137l interfaceC10137l = (InterfaceC10137l) this.f7045l.invoke(c12923lVip);
        if (!AbstractC8576l.yandex(interfaceC10137l, this.f23568l)) {
            this.f23568l = interfaceC10137l;
            mo2588l();
        }
        this.f7044l = c12923lVip;
        super.mo511l();
    }
}
