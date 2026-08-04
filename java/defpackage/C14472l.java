package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import java.util.Stack;

/* JADX INFO: renamed from: lٓۡٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14472l extends AbstractC2338l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C9967l f28339l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public AbstractC11801l f28340l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final boolean f28341l;

    public C14472l(AbstractC11801l abstractC11801l, int i) {
        super(false, false);
        this.f28340l = abstractC11801l;
        this.f28341l = false;
    }

    @Override // defpackage.AbstractC2338l
    public final void ads() {
        super.ads();
        C9967l c9967l = this.f28339l;
        if (c9967l != null) {
            AbstractC15450l.crashlytics(c9967l, C11744l.f23522l);
        }
    }

    @Override // defpackage.AbstractC2338l
    public final void amazon(int i, int i2) {
        C9967l c9967l = this.f28339l;
        if (c9967l != null) {
            c9967l.crashlytics(i + i2);
        }
    }

    @Override // defpackage.AbstractC2338l
    public final View firebase(ViewGroup viewGroup) {
        C9967l c9967l = new C9967l(this.f5081l);
        this.f28339l = c9967l;
        return c9967l;
    }

    @Override // defpackage.AbstractC2338l
    public final int mopub() {
        return this.f28341l ? -1 : -2;
    }

    @Override // defpackage.AbstractC2338l
    public final void smaato() {
        super.smaato();
        C9967l c9967l = this.f28339l;
        if (c9967l != null) {
            AbstractC15450l.crashlytics(c9967l, C13162l.f25777l);
        }
        C9967l c9967l2 = this.f28339l;
        if (c9967l2 != null) {
            c9967l2.vip(new Stack(), false);
        }
        C9967l c9967l3 = this.f28339l;
        if (c9967l3 != null) {
            c9967l3.removeAllViews();
        }
        this.f28339l = null;
        this.f28340l = null;
    }

    @Override // defpackage.AbstractC2338l
    public final void startapp() {
        super.startapp();
        C9967l c9967l = this.f28339l;
        if (c9967l != null) {
            AbstractC15450l.crashlytics(c9967l, C11776l.f23569l);
        }
    }

    @Override // defpackage.AbstractC2338l
    public final void subscription(View view) {
        this.f28339l.remoteconfig(this.f28340l);
        this.f28339l.setBackgroundColor(AbstractC13209l.yandex(R.attr.windowBackground));
    }
}
