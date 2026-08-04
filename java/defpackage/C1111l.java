package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lۣؒٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1111l {
    public static final /* synthetic */ int crashlytics = 0;
    public boolean loadAd;
    public final C3052l yandex = new C3052l();

    static {
        new C1111l(0);
    }

    public C1111l(int i) {
        yandex();
        yandex();
    }

    public static void loadAd(AbstractC10908l abstractC10908l, EnumC2564l enumC2564l, int i, Object obj) {
        if (enumC2564l == EnumC2564l.f5571l) {
            abstractC10908l.amazon(i, 3);
            ((AbstractC0288l) ((AbstractC12570l) obj)).billing(abstractC10908l);
            abstractC10908l.amazon(i, 4);
            return;
        }
        abstractC10908l.amazon(i, enumC2564l.f5573l);
        EnumC13744l enumC13744l = EnumC13744l.f26828l;
        switch (enumC2564l.ordinal()) {
            case 0:
                abstractC10908l.Signature(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                abstractC10908l.subscription(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                abstractC10908l.tapsense(((Long) obj).longValue());
                break;
            case 3:
                abstractC10908l.tapsense(((Long) obj).longValue());
                break;
            case 4:
                abstractC10908l.adcel(((Integer) obj).intValue());
                break;
            case 5:
                abstractC10908l.Signature(((Long) obj).longValue());
                break;
            case 6:
                abstractC10908l.subscription(((Integer) obj).intValue());
                break;
            case 7:
                abstractC10908l.startapp(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof AbstractC15619l)) {
                    abstractC10908l.license((String) obj);
                } else {
                    abstractC10908l.remoteconfig((AbstractC15619l) obj);
                }
                break;
            case 9:
                ((AbstractC0288l) ((AbstractC12570l) obj)).billing(abstractC10908l);
                break;
            case 10:
                abstractC10908l.metrica((AbstractC12570l) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC15619l)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC10908l.vip(bArr.length, bArr);
                } else {
                    abstractC10908l.remoteconfig((AbstractC15619l) obj);
                }
                break;
            case 12:
                abstractC10908l.ads(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC6759l)) {
                    abstractC10908l.adcel(((Integer) obj).intValue());
                } else {
                    abstractC10908l.adcel(((InterfaceC6759l) obj).zza());
                }
                break;
            case 14:
                abstractC10908l.subscription(((Integer) obj).intValue());
                break;
            case 15:
                abstractC10908l.Signature(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC10908l.ads((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                abstractC10908l.tapsense((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final Object clone() {
        C1111l c1111l = new C1111l();
        C3052l c3052l = this.yandex;
        if (c3052l.f6577l > 0) {
            c3052l.yandex(0).f19391l.getClass();
            C18725l.loadAd();
            return null;
        }
        Iterator it = c3052l.loadAd().iterator();
        if (!it.hasNext()) {
            return c1111l;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            C18725l.loadAd();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1111l) {
            return this.yandex.equals(((C1111l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final void yandex() {
        if (this.loadAd) {
            return;
        }
        C3052l c3052l = this.yandex;
        int i = c3052l.f6577l;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c3052l.yandex(i2).f19390l;
            if (obj instanceof AbstractC0288l) {
                AbstractC0288l abstractC0288l = (AbstractC0288l) obj;
                C8307l.crashlytics.yandex(abstractC0288l.getClass()).loadAd(abstractC0288l);
                abstractC0288l.admob();
            }
        }
        Iterator it = c3052l.loadAd().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof AbstractC0288l) {
                AbstractC0288l abstractC0288l2 = (AbstractC0288l) value;
                C8307l.crashlytics.yandex(abstractC0288l2.getClass()).loadAd(abstractC0288l2);
                abstractC0288l2.admob();
            }
        }
        if (!c3052l.f6580l) {
            if (c3052l.f6577l > 0) {
                c3052l.yandex(0).f19391l.getClass();
                C18725l.loadAd();
                return;
            } else {
                Iterator it2 = c3052l.loadAd().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    C18725l.loadAd();
                    return;
                }
            }
        }
        if (!c3052l.f6580l) {
            c3052l.f6576l = c3052l.f6576l.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(c3052l.f6576l);
            c3052l.f6581l = c3052l.f6581l.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(c3052l.f6581l);
            c3052l.f6580l = true;
        }
        this.loadAd = true;
    }

    public C1111l() {
    }
}
