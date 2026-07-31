package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: lْؕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3718l extends AbstractC0775l {
    public int admob;
    public final String amazon;
    public final C11315l billing;
    public final C7026l crashlytics;
    public final C11315l mopub;
    public final C13975l purchase;

    public C3718l(C7026l c7026l, String str, C13975l c13975l) {
        this.crashlytics = c7026l;
        this.amazon = str;
        this.purchase = c13975l;
        C11315l c11315l = new C11315l();
        c11315l.addLast(str);
        this.billing = c11315l;
        C11315l c11315l2 = new C11315l();
        c11315l2.addLast(0);
        this.mopub = c11315l2;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final int Signature(InterfaceC18035l interfaceC18035l) {
        Integer numSignature = this.crashlytics.Signature(m1412private());
        if (numSignature != null) {
            return numSignature.intValue();
        }
        AbstractC3739l.yandex();
        throw null;
    }

    @Override // defpackage.InterfaceC14988l
    public final int admob(InterfaceC18035l interfaceC18035l) {
        int iM1411native;
        int iIntValue;
        String str;
        C7026l c7026l;
        C11315l c11315l = this.billing;
        int i = c11315l.f22809l;
        int i2 = this.admob;
        C11315l c11315l2 = this.mopub;
        if (i > i2) {
            c11315l.removeLast();
            c11315l2.removeLast();
        }
        AbstractC2021l abstractC2021lBilling = interfaceC18035l.billing();
        if (AbstractC8576l.yandex(abstractC2021lBilling, C9164l.amazon)) {
            iM1411native = m1411native();
        } else {
            iM1411native = AbstractC8576l.yandex(abstractC2021lBilling, C2861l.amazon) ? m1411native() * 2 : interfaceC18035l.mopub();
        }
        do {
            iIntValue = ((Number) c11315l2.removeLast()).intValue();
            c11315l2.addLast(Integer.valueOf(iIntValue + 1));
            if (iIntValue < iM1411native) {
                str = m1412private() + '.' + interfaceC18035l.admob(iIntValue);
                if (!interfaceC18035l.firebase(iIntValue)) {
                    break;
                }
                c7026l = this.crashlytics;
                if (((SharedPreferences) c7026l.f14720l).contains(str)) {
                    break;
                }
            } else {
                return -1;
            }
        } while (!AbstractC8576l.yandex(c7026l.subscription(str.concat("?")), Boolean.TRUE));
        c11315l.addLast(interfaceC18035l.admob(iIntValue));
        c11315l2.addLast(0);
        return iIntValue;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final short applovin() {
        Integer numSignature = this.crashlytics.Signature(m1412private());
        if (numSignature != null) {
            return (short) numSignature.intValue();
        }
        AbstractC3739l.yandex();
        throw null;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final float appmetrica() {
        String strM1412private = m1412private();
        SharedPreferences sharedPreferences = (SharedPreferences) this.crashlytics.f14720l;
        Float fValueOf = sharedPreferences.contains(strM1412private) ? Float.valueOf(sharedPreferences.getFloat(strM1412private, 0.0f)) : null;
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        AbstractC3739l.yandex();
        throw null;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final char billing() {
        Integer numSignature = this.crashlytics.Signature(m1412private());
        if (numSignature != null) {
            return (char) numSignature.intValue();
        }
        AbstractC3739l.yandex();
        throw null;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final InterfaceC14988l crashlytics(InterfaceC18035l interfaceC18035l) {
        this.admob++;
        return this;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final long license() {
        String strM1412private = m1412private();
        SharedPreferences sharedPreferences = (SharedPreferences) this.crashlytics.f14720l;
        Long lValueOf = sharedPreferences.contains(strM1412private) ? Long.valueOf(sharedPreferences.getLong(strM1412private, 0L)) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        AbstractC3739l.yandex();
        throw null;
    }

    @Override // defpackage.InterfaceC14988l
    public final C13975l loadAd() {
        return this.purchase;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final int m1411native() {
        Integer numSignature = this.crashlytics.Signature(m1412private().concat(".size"));
        if (numSignature != null) {
            return numSignature.intValue();
        }
        AbstractC3739l.yandex();
        throw null;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final String m1412private() {
        return AbstractC16901l.m4210case(this.billing, ".", null, null, null, 62);
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final boolean pro() {
        Boolean boolSubscription = this.crashlytics.subscription(m1412private().concat("?"));
        if (boolSubscription != null) {
            return boolSubscription.booleanValue();
        }
        AbstractC3739l.yandex();
        throw null;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final boolean purchase() {
        Boolean boolSubscription = this.crashlytics.subscription(m1412private());
        if (boolSubscription != null) {
            return boolSubscription.booleanValue();
        }
        AbstractC3739l.yandex();
        throw null;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final byte signatures() {
        Integer numSignature = this.crashlytics.Signature(m1412private());
        if (numSignature != null) {
            return (byte) numSignature.intValue();
        }
        AbstractC3739l.yandex();
        throw null;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final String tapsense() {
        String strM1412private = m1412private();
        SharedPreferences sharedPreferences = (SharedPreferences) this.crashlytics.f14720l;
        String string = sharedPreferences.contains(strM1412private) ? sharedPreferences.getString(strM1412private, "") : null;
        if (string != null) {
            return string;
        }
        AbstractC3739l.yandex();
        throw null;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    /* JADX INFO: renamed from: throws */
    public final double mo677throws() {
        String strM1412private = m1412private();
        SharedPreferences sharedPreferences = (SharedPreferences) this.crashlytics.f14720l;
        Double dValueOf = sharedPreferences.contains(strM1412private) ? Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(strM1412private, Double.doubleToRawLongBits(0.0d)))) : null;
        if (dValueOf != null) {
            return dValueOf.doubleValue();
        }
        AbstractC3739l.yandex();
        throw null;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final int vip() {
        Integer numSignature = this.crashlytics.Signature(m1412private());
        if (numSignature != null) {
            return numSignature.intValue();
        }
        AbstractC3739l.yandex();
        throw null;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC14988l
    public final void yandex(InterfaceC18035l interfaceC18035l) {
        this.admob--;
        C11315l c11315l = this.billing;
        c11315l.removeLast();
        C11315l c11315l2 = this.mopub;
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
