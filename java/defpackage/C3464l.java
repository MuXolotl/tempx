package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؕٙؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3464l implements InterfaceC9573l {
    public boolean amazon;
    public Set crashlytics;
    public C10023l loadAd;
    public final C15079l purchase;
    public Set yandex;

    public C3464l() {
        C5746l c5746l = C5746l.f12138l;
        this.yandex = c5746l;
        this.crashlytics = c5746l;
        this.purchase = new C15079l(9, this);
    }

    public final boolean amazon() {
        C8108l c8108lBilling;
        C10023l c10023l = this.loadAd;
        if (c10023l == null || (c8108lBilling = (C8108l) c10023l.f20418l) == null) {
            c8108lBilling = AbstractC0555l.billing(this.yandex);
        }
        this.loadAd = null;
        if (c8108lBilling != null) {
            c8108lBilling.mopub.invoke();
        }
        return c8108lBilling != null;
    }

    public final void billing() {
        boolean zPurchase = purchase();
        if (this.amazon != zPurchase) {
            this.amazon = zPurchase;
            Iterator it = this.crashlytics.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(Boolean.valueOf(zPurchase));
            }
        }
    }

    @Override // defpackage.InterfaceC9573l
    public final void crashlytics(C8108l c8108l) {
        if (!this.yandex.contains(c8108l)) {
            C8339l.smaato("Callback is not registered");
            return;
        }
        this.yandex = AbstractC9905l.amazon(this.yandex, c8108l);
        c8108l.loadAd = AbstractC9905l.amazon(c8108l.loadAd, this.purchase);
        C10023l c10023l = this.loadAd;
        if (c8108l == (c10023l != null ? (C8108l) c10023l.f20418l : null)) {
            if (c10023l != null) {
                c10023l.f20418l = null;
            }
            Function0 function0 = c8108l.billing;
            if (function0 != null) {
                function0.invoke();
            }
        }
        billing();
    }

    @Override // defpackage.InterfaceC9573l
    public final boolean loadAd(C8108l c8108l) {
        return this.yandex.contains(c8108l);
    }

    public final void mopub(C15830l c15830l) {
        Function1 function1;
        C10023l c10023l = this.loadAd;
        if (c10023l == null) {
            return;
        }
        if (((C8108l) c10023l.f20418l) == null) {
            C8108l c8108lBilling = AbstractC0555l.billing(this.yandex);
            c10023l.f20418l = c8108lBilling;
            if (c8108lBilling != null) {
                C15830l c15830l2 = (C15830l) c10023l.f20419l;
                Function1 function2 = c8108lBilling.amazon;
                if (function2 != null) {
                    function2.invoke(c15830l2);
                }
            }
        }
        C8108l c8108l = (C8108l) c10023l.f20418l;
        if (c8108l == null || (function1 = c8108l.purchase) == null) {
            return;
        }
        function1.invoke(c15830l);
    }

    public final boolean purchase() {
        Set set = this.yandex;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C17838l c17838l = ((C8108l) it.next()).crashlytics;
                InterfaceC13922l interfaceC13922l = C8108l.admob[0];
                if (((Boolean) c17838l.yandex).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC9573l
    public final void yandex(C8108l c8108l) {
        if (this.yandex.contains(c8108l)) {
            C8339l.smaato("Callback is already registered");
            return;
        }
        this.yandex = AbstractC9905l.admob(this.yandex, c8108l);
        c8108l.loadAd = AbstractC9905l.admob(c8108l.loadAd, this.purchase);
        billing();
    }
}
