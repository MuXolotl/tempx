package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* JADX INFO: renamed from: lّٟ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17878l extends AbstractC0775l {
    public final C11315l admob;
    public final String amazon;
    public final ArrayList billing = new ArrayList();
    public final C7026l crashlytics;
    public final C11315l mopub;
    public final C13975l purchase;
    public int subs;

    public C17878l(C7026l c7026l, String str, C13975l c13975l) {
        this.crashlytics = c7026l;
        this.amazon = str;
        this.purchase = c13975l;
        C11315l c11315l = new C11315l();
        c11315l.addLast(str);
        this.mopub = c11315l;
        C11315l c11315l2 = new C11315l();
        c11315l2.addLast(0);
        this.admob = c11315l2;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final int Signature(InterfaceC18035l interfaceC18035l) {
        this.billing.add(m4437private());
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    @Override // defpackage.InterfaceC14988l
    public final int admob(InterfaceC18035l interfaceC18035l) {
        int iM4436native;
        int iIntValue;
        boolean z;
        C11315l c11315l = this.mopub;
        int i = c11315l.f22809l;
        int i2 = this.subs;
        C11315l c11315l2 = this.admob;
        if (i > i2) {
            c11315l.removeLast();
            c11315l2.removeLast();
        }
        AbstractC2021l abstractC2021lBilling = interfaceC18035l.billing();
        if (AbstractC8576l.yandex(abstractC2021lBilling, C9164l.amazon)) {
            iM4436native = m4436native();
        } else {
            iM4436native = AbstractC8576l.yandex(abstractC2021lBilling, C2861l.amazon) ? m4436native() * 2 : interfaceC18035l.mopub();
        }
        do {
            iIntValue = ((Number) c11315l2.removeLast()).intValue();
            c11315l2.addLast(Integer.valueOf(iIntValue + 1));
            if (iIntValue >= iM4436native) {
                return -1;
            }
            String str = m4437private() + '.' + interfaceC18035l.admob(iIntValue);
            if (interfaceC18035l.firebase(iIntValue)) {
                C7026l c7026l = this.crashlytics;
                if (((SharedPreferences) c7026l.f14720l).contains(str) || AbstractC8576l.yandex(c7026l.subscription(str.concat("?")), Boolean.TRUE)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            ArrayList arrayList = this.billing;
            arrayList.add(str);
            arrayList.add(str.concat("?"));
        } while (z);
        c11315l.addLast(interfaceC18035l.admob(iIntValue));
        c11315l2.addLast(0);
        return iIntValue;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final short applovin() {
        this.billing.add(m4437private());
        return (short) 0;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final float appmetrica() {
        this.billing.add(m4437private());
        return 0.0f;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final char billing() {
        this.billing.add(m4437private());
        return '0';
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final InterfaceC14988l crashlytics(InterfaceC18035l interfaceC18035l) {
        this.subs++;
        return this;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final long license() {
        this.billing.add(m4437private());
        return 0L;
    }

    @Override // defpackage.InterfaceC14988l
    public final C13975l loadAd() {
        return this.purchase;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final int m4436native() {
        int i = ((SharedPreferences) this.crashlytics.f14720l).getInt(m4437private().concat(".size"), 0);
        this.billing.add(m4437private().concat(".size"));
        return i;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final String m4437private() {
        return AbstractC16901l.m4210case(this.mopub, ".", null, null, null, 62);
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final boolean pro() {
        boolean z = ((SharedPreferences) this.crashlytics.f14720l).getBoolean(m4437private().concat("?"), false);
        this.billing.add(m4437private().concat("?"));
        return z;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final boolean purchase() {
        this.billing.add(m4437private());
        return false;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final byte signatures() {
        this.billing.add(m4437private());
        return (byte) 0;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final String tapsense() {
        this.billing.add(m4437private());
        return "";
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    /* JADX INFO: renamed from: throws */
    public final double mo677throws() {
        this.billing.add(m4437private());
        return 0.0d;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final int vip() {
        this.billing.add(m4437private());
        return 0;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC14988l
    public final void yandex(InterfaceC18035l interfaceC18035l) {
        this.subs--;
        C11315l c11315l = this.mopub;
        c11315l.removeLast();
        C11315l c11315l2 = this.admob;
        c11315l2.removeLast();
        if (c11315l.isEmpty()) {
            c11315l.addLast(this.amazon);
            c11315l2.addLast(0);
        }
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final void startapp() {
    }
}
