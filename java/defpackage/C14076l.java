package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٌُٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14076l implements InterfaceC3327l {
    public final Object crashlytics;
    public final InterfaceC1388l loadAd;
    public final int yandex;

    public C14076l(int i, InterfaceC1388l interfaceC1388l, Object obj) {
        long jCharValue;
        this.yandex = i;
        this.loadAd = interfaceC1388l;
        if (AbstractC1818l.yandex[AbstractC5020l.inmobi(i)] == 1) {
            if (obj instanceof Number) {
                jCharValue = ((Number) obj).longValue();
            } else {
                if (!(obj instanceof Character)) {
                    C8339l.metrica("Unsupported numeric type. Only Long, Short, Int, Byte and Char are valid numeric types.");
                    throw null;
                }
                jCharValue = ((Character) obj).charValue();
            }
            obj = Long.valueOf(jCharValue);
        }
        this.crashlytics = obj;
    }

    public final InterfaceC11616l admob() {
        return (InterfaceC11616l) smaato(5);
    }

    public final double amazon() {
        return ((Double) smaato(7)).doubleValue();
    }

    public final long billing() {
        return ((Long) smaato(1)).longValue();
    }

    public final C15062l crashlytics() {
        return (C15062l) smaato(8);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14076l)) {
            return false;
        }
        C14076l c14076l = (C14076l) obj;
        Object obj2 = c14076l.crashlytics;
        if (c14076l.yandex != this.yandex) {
            return false;
        }
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(byte[].class);
        InterfaceC1388l interfaceC1388l = this.loadAd;
        boolean zYandex = AbstractC8576l.yandex(interfaceC1388l, interfaceC1388lLoadAd);
        Object obj3 = this.crashlytics;
        if (zYandex) {
            if (obj2 instanceof byte[]) {
                return Arrays.equals((byte[]) obj2, (byte[]) obj3);
            }
            return false;
        }
        if (!(obj3 instanceof InterfaceC7457l)) {
            return AbstractC8576l.yandex(obj3, obj2);
        }
        if (AbstractC8576l.yandex(c14076l.loadAd, interfaceC1388l)) {
            return AbstractC8576l.yandex(obj2, obj3);
        }
        return false;
    }

    public final String firebase() {
        return (String) smaato(3);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (AbstractC5020l.inmobi(this.yandex) * 31)) * 31);
    }

    public final InterfaceC15393l isPro() {
        return (InterfaceC15393l) smaato(10);
    }

    public final byte[] loadAd() {
        return (byte[]) smaato(4);
    }

    public final C17918l mopub() {
        return (C17918l) smaato(9);
    }

    public final float purchase() {
        return ((Float) smaato(6)).floatValue();
    }

    public final Object smaato(int i) {
        int i2 = this.yandex;
        if (i2 == i) {
            return this.crashlytics;
        }
        C8339l.smaato(AbstractC14814l.ads("RealmAny type mismatch, wanted a '", AbstractC4338l.m1538volatile(i), "' but the instance is a '", AbstractC4338l.m1538volatile(i2), "'."));
        return null;
    }

    public final InterfaceC9671l subs(InterfaceC1388l interfaceC1388l) {
        Object objSmaato = smaato(11);
        if (interfaceC1388l.mo886strictfp(objSmaato)) {
            return (InterfaceC9671l) objSmaato;
        }
        throw new ClassCastException("Value cannot be cast to " + interfaceC1388l.billing());
    }

    public final String toString() {
        String str;
        int i = this.yandex;
        Object objSmaato = smaato(i);
        StringBuilder sb = new StringBuilder("RealmAny{type=");
        switch (i) {
            case 1:
                str = "INT";
                break;
            case 2:
                str = "BOOL";
                break;
            case 3:
                str = "STRING";
                break;
            case 4:
                str = "BINARY";
                break;
            case 5:
                str = "TIMESTAMP";
                break;
            case 6:
                str = "FLOAT";
                break;
            case 7:
                str = "DOUBLE";
                break;
            case 8:
                str = "DECIMAL128";
                break;
            case 9:
                str = "OBJECT_ID";
                break;
            case 10:
                str = "UUID";
                break;
            case 11:
                str = "OBJECT";
                break;
            case 12:
                str = "LIST";
                break;
            case 13:
                str = "DICTIONARY";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", value=");
        sb.append(objSmaato);
        sb.append("}");
        return sb.toString();
    }

    public final boolean yandex() {
        return ((Boolean) smaato(2)).booleanValue();
    }
}
