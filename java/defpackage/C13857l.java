package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: renamed from: lٓؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13857l implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C13857l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                ((C7504l) obj).ads(null);
                break;
            case 1:
                C16173l c16173l = (C16173l) obj;
                if (c16173l != null) {
                    C17812l c17812l = c16173l.amazon;
                    if (c17812l != null) {
                        c17812l.purchase(C12814l.loadAd);
                    }
                    C17812l c17812l2 = c16173l.amazon;
                    if (c17812l2 != null) {
                        c17812l2.billing(C12814l.loadAd);
                    }
                }
                break;
            default:
                C16328l c16328l = (C16328l) obj;
                C10178l c10178l = c16328l.yandex;
                InterfaceC13142l interfaceC13142l = c16328l.loadAd;
                c10178l.loadAd.yandex().premium();
                C2566l c2566l = c10178l.loadAd;
                c2566l.f5584l = null;
                c16328l.smaato(c2566l);
                C10178l.yandex(c10178l, interfaceC13142l, true, 1);
                c10178l.amazon(true);
                break;
        }
    }
}
