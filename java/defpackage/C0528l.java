package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؑۗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0528l extends AbstractC13844l {
    public final C11675l loadAd;
    public final C17417l yandex;

    public C0528l(C17417l c17417l) {
        AbstractC1051l.subs(c17417l);
        this.yandex = c17417l;
        C11675l c11675l = c17417l.f33927l;
        C17417l.mopub(c11675l);
        this.loadAd = c11675l;
    }

    @Override // defpackage.InterfaceC15438l
    public final String Signature() {
        return (String) this.loadAd.f23410l.get();
    }

    @Override // defpackage.InterfaceC15438l
    public final void adcel(String str) {
        C17417l c17417l = this.yandex;
        C1185l c1185l = c17417l.f33952l;
        C17417l.purchase(c1185l);
        c17417l.f33951l.getClass();
        c1185l.m849l(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.InterfaceC15438l
    public final String admob() {
        C3148l c3148l = ((C17417l) this.loadAd.f833l).f33948l;
        C17417l.mopub(c3148l);
        C6373l c6373l = c3148l.f6768l;
        if (c6373l != null) {
            return c6373l.yandex;
        }
        return null;
    }

    @Override // defpackage.InterfaceC15438l
    public final void ads(String str, String str2, Bundle bundle) {
        C11675l c11675l = this.yandex.f33927l;
        C17417l.mopub(c11675l);
        c11675l.m3201l(str, str2, bundle);
    }

    @Override // defpackage.InterfaceC15438l
    public final String license() {
        return this.loadAd.m3190l();
    }

    @Override // defpackage.InterfaceC15438l
    public final void metrica(Bundle bundle) {
        C11675l c11675l = this.loadAd;
        ((C17417l) c11675l.f833l).f33951l.getClass();
        c11675l.m3200l(bundle, System.currentTimeMillis());
    }

    @Override // defpackage.InterfaceC15438l
    public final Map pro(String str, String str2, boolean z) {
        C11675l c11675l = this.loadAd;
        C17417l c17417l = (C17417l) c11675l.f833l;
        C17923l c17923l = c17417l.f33929l;
        C8118l c8118l = c17417l.f33950l;
        C17417l.admob(c17923l);
        if (c17923l.m4444l()) {
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (C6162l.tapsense()) {
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        C17923l c17923l2 = c17417l.f33929l;
        C17417l.admob(c17923l2);
        c17923l2.m4445l(atomicReference, 5000L, "get user properties", new RunnableC10887l(c11675l, atomicReference, str, str2, z));
        List<C6899l> list = (List) atomicReference.get();
        if (list == null) {
            C17417l.admob(c8118l);
            c8118l.f16908l.loadAd(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        C11154l c11154l = new C11154l(list.size());
        for (C6899l c6899l : list) {
            Object objBilling = c6899l.billing();
            if (objBilling != null) {
                c11154l.put(c6899l.f14441l, objBilling);
            }
        }
        return c11154l;
    }

    @Override // defpackage.InterfaceC15438l
    public final long remoteconfig() {
        C17410l c17410l = this.yandex.f33949l;
        C17417l.billing(c17410l);
        return c17410l.m4378l();
    }

    @Override // defpackage.InterfaceC15438l
    public final void startapp(String str) {
        C17417l c17417l = this.yandex;
        C1185l c1185l = c17417l.f33952l;
        C17417l.purchase(c1185l);
        c17417l.f33951l.getClass();
        c1185l.m848l(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.InterfaceC15438l
    public final void subs(String str, String str2, Bundle bundle) {
        this.loadAd.m3189l(str, str2, bundle);
    }

    @Override // defpackage.InterfaceC15438l
    public final List subscription(String str, String str2) {
        C11675l c11675l = this.loadAd;
        C17417l c17417l = (C17417l) c11675l.f833l;
        C17923l c17923l = c17417l.f33929l;
        C8118l c8118l = c17417l.f33950l;
        C17417l.admob(c17923l);
        if (c17923l.m4444l()) {
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C6162l.tapsense()) {
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C17923l c17923l2 = c17417l.f33929l;
        C17417l.admob(c17923l2);
        c17923l2.m4445l(atomicReference, 5000L, "get conditional user properties", new RunnableC16843l(c11675l, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C17410l.m4332l(list);
        }
        C17417l.admob(c8118l);
        c8118l.f16908l.loadAd(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // defpackage.InterfaceC15438l
    public final int tapsense(String str) {
        C11675l c11675l = this.loadAd;
        c11675l.getClass();
        AbstractC1051l.billing(str);
        ((C17417l) c11675l.f833l).getClass();
        return 25;
    }

    @Override // defpackage.InterfaceC15438l
    public final String vip() {
        C3148l c3148l = ((C17417l) this.loadAd.f833l).f33948l;
        C17417l.mopub(c3148l);
        C6373l c6373l = c3148l.f6768l;
        if (c6373l != null) {
            return c6373l.loadAd;
        }
        return null;
    }
}
