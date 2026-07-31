package defpackage;

import android.content.Context;
import android.view.View;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّٔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14858l extends C17223l {
    public final /* synthetic */ C0791l remoteconfig;
    public final /* synthetic */ int smaato = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14858l(C0791l c0791l, Context context, SubMenuC3166l subMenuC3166l, View view) {
        super(context, subMenuC3166l, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.remoteconfig = c0791l;
        if ((subMenuC3166l.f6800l.f34802l & 32) != 32) {
            View view2 = c0791l.f2401l;
            this.purchase = view2 == null ? (View) c0791l.f2390l : view2;
        }
        C1770l c1770l = c0791l.f2406l;
        this.admob = c1770l;
        AbstractC2080l abstractC2080l = this.subs;
        if (abstractC2080l != null) {
            abstractC2080l.billing(c1770l);
        }
    }

    @Override // defpackage.C17223l
    public final void crashlytics() {
        int i = this.smaato;
        C0791l c0791l = this.remoteconfig;
        switch (i) {
            case 0:
                c0791l.f2389l = null;
                super.crashlytics();
                break;
            default:
                MenuC4984l menuC4984l = c0791l.f2386l;
                if (menuC4984l != null) {
                    menuC4984l.crashlytics(true);
                }
                c0791l.f2394l = null;
                super.crashlytics();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14858l(C0791l c0791l, Context context, MenuC4984l menuC4984l, View view) {
        super(context, menuC4984l, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.remoteconfig = c0791l;
        this.billing = 8388613;
        C1770l c1770l = c0791l.f2406l;
        this.admob = c1770l;
        AbstractC2080l abstractC2080l = this.subs;
        if (abstractC2080l != null) {
            abstractC2080l.billing(c1770l);
        }
    }
}
