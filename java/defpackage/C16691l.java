package defpackage;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٖۡؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16691l implements InterfaceC2449l, InterfaceC3187l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C13568l f32708l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C5268l f32709l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C0504l f32710l;

    public C16691l(C0504l c0504l) {
        this.f32710l = c0504l;
        Object objPurchase = c0504l.purchase("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objPurchase instanceof Bundle ? (Bundle) objPurchase : null;
        if (bundle != null && this.f32708l == null) {
            C13568l c13568l = new C13568l(new C17464l(this, new C5767l(2, this)));
            this.f32708l = c13568l;
            c13568l.startapp(bundle);
        }
        c0504l.billing("androidx.savedstate.SavedStateRegistry", new C5767l(0, this));
    }

    @Override // defpackage.InterfaceC2449l
    public final Map amazon() {
        return this.f32710l.amazon();
    }

    @Override // defpackage.InterfaceC2449l
    public final InterfaceC18327l billing(String str, Function0 function0) {
        return this.f32710l.billing(str, function0);
    }

    @Override // defpackage.InterfaceC2449l
    public final boolean crashlytics(Object obj) {
        return this.f32710l.crashlytics(obj);
    }

    @Override // defpackage.InterfaceC3177l
    public final AbstractC6475l loadAd() {
        C5268l c5268l = this.f32709l;
        if (c5268l != null) {
            return c5268l;
        }
        C5268l c5268l2 = new C5268l(this, false);
        this.f32709l = c5268l2;
        return c5268l2;
    }

    @Override // defpackage.InterfaceC3187l
    public final C18396l metrica() {
        C13568l c13568l = this.f32708l;
        if (c13568l == null) {
            C13568l c13568l2 = new C13568l(new C17464l(this, new C5767l(2, this)));
            this.f32708l = c13568l2;
            c13568l2.startapp(null);
            c13568l = c13568l2;
        }
        return (C18396l) c13568l.f26580l;
    }

    @Override // defpackage.InterfaceC2449l
    public final Object purchase(String str) {
        return this.f32710l.purchase(str);
    }
}
