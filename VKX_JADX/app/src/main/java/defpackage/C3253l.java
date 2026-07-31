package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: lؚؕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3253l implements InterfaceC10430l, InterfaceC2053l, InterfaceC10377l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f6947l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f6948l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6949l;

    public C3253l(InterfaceC10430l interfaceC10430l, long j) {
        this.f6949l = 4;
        this.f6947l = interfaceC10430l;
        AbstractC12442l.admob(interfaceC10430l.getPosition() >= j);
        this.f6948l = j;
    }

    public static long pro(C3253l c3253l, long j, float f) {
        long jSubs = C1187l.subs(c3253l.f6948l, j);
        c3253l.f6948l = jSubs;
        if ((((EnumC7283l) c3253l.f6947l) == null ? C1187l.crashlytics(jSubs) : Math.abs(c3253l.advert(jSubs))) < f) {
            return 9205357640488583168L;
        }
        EnumC7283l enumC7283l = (EnumC7283l) c3253l.f6947l;
        long j2 = c3253l.f6948l;
        if (enumC7283l == null) {
            float fCrashlytics = C1187l.crashlytics(j2);
            return C1187l.admob(c3253l.f6948l, C1187l.isPro(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / fCrashlytics)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / fCrashlytics)) & 4294967295L)));
        }
        float fAdvert = c3253l.advert(j2) - (Math.signum(c3253l.advert(c3253l.f6948l)) * f);
        long j3 = c3253l.f6948l;
        EnumC7283l enumC7283l2 = (EnumC7283l) c3253l.f6947l;
        EnumC7283l enumC7283l3 = EnumC7283l.f15125l;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (enumC7283l2 == enumC7283l3 ? j3 & 4294967295L : j3 >> 32));
        if (((EnumC7283l) c3253l.f6947l) == enumC7283l3) {
            return (((long) Float.floatToRawIntBits(fAdvert)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fAdvert)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    public void Signature() {
        if (((C3253l) this.f6947l) == null) {
            this.f6947l = new C3253l(1);
        }
    }

    public void ad(int i, boolean z) {
        if (i >= 64) {
            Signature();
            ((C3253l) this.f6947l).ad(i - 64, z);
            return;
        }
        long j = this.f6948l;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f6948l = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            applovin(i);
        } else {
            ads(i);
        }
        if (z2 || ((C3253l) this.f6947l) != null) {
            Signature();
            ((C3253l) this.f6947l).ad(0, z2);
        }
    }

    @Override // defpackage.InterfaceC10377l
    public void adcel(Exception exc) {
        switch (this.f6949l) {
            case 7:
                int i = exc instanceof C3890l ? ((C3890l) exc).f8033l.f584l : 13;
                long j = this.f6948l;
                Iterator it = ((C17186l) ((C4816l) this.f6947l).f9862l).crashlytics.amazon.iterator();
                while (it.hasNext()) {
                    ((C3723l) it.next()).amazon(j, i, null);
                }
                break;
            case 8:
                ((AtomicLong) ((C12418l) this.f6947l).f24521l).set(this.f6948l);
                break;
            default:
                ((AtomicLong) ((C5633l) this.f6947l).f11985l).set(this.f6948l);
                break;
        }
    }

    @Override // defpackage.InterfaceC10430l
    public void admob(int i) {
        ((InterfaceC10430l) this.f6947l).admob(i);
    }

    public void ads(int i) {
        if (i < 64) {
            this.f6948l &= ~(1 << i);
            return;
        }
        C3253l c3253l = (C3253l) this.f6947l;
        if (c3253l != null) {
            c3253l.ads(i - 64);
        }
    }

    public float advert(long j) {
        return Float.intBitsToFloat(((EnumC7283l) this.f6947l) == EnumC7283l.f15125l ? (int) (j >> 32) : (int) (j & 4294967295L));
    }

    @Override // defpackage.InterfaceC10430l
    public int amazon(int i, int i2, byte[] bArr) {
        return ((InterfaceC10430l) this.f6947l).amazon(i, i2, bArr);
    }

    public void applovin(int i) {
        if (i < 64) {
            this.f6948l |= 1 << i;
        } else {
            Signature();
            ((C3253l) this.f6947l).applovin(i - 64);
        }
    }

    @Override // defpackage.InterfaceC10430l
    public boolean billing(byte[] bArr, int i, int i2, boolean z) {
        return ((InterfaceC10430l) this.f6947l).billing(bArr, i, i2, z);
    }

    @Override // defpackage.InterfaceC2053l
    public void firebase() {
        ((InterfaceC2053l) this.f6947l).firebase();
    }

    @Override // defpackage.InterfaceC10430l
    public long getLength() {
        return ((InterfaceC10430l) this.f6947l).getLength() - this.f6948l;
    }

    @Override // defpackage.InterfaceC10430l
    public long getPosition() {
        return ((InterfaceC10430l) this.f6947l).getPosition() - this.f6948l;
    }

    public C8309l isVip() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String strMo724new = ((InterfaceC9473l) this.f6947l).mo724new(this.f6948l);
            this.f6948l -= (long) strMo724new.length();
            if (strMo724new.length() == 0) {
                return new C8309l((String[]) arrayList.toArray(new String[0]));
            }
            int iM3321extends = AbstractC12024l.m3321extends(strMo724new, ':', 1, 4);
            if (iM3321extends != -1) {
                String strSubstring = strMo724new.substring(0, iM3321extends);
                String strSubstring2 = strMo724new.substring(iM3321extends + 1);
                arrayList.add(strSubstring);
                arrayList.add(AbstractC12024l.m3330l(strSubstring2).toString());
            } else if (strMo724new.charAt(0) == ':') {
                String strSubstring3 = strMo724new.substring(1);
                arrayList.add("");
                arrayList.add(AbstractC12024l.m3330l(strSubstring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(AbstractC12024l.m3330l(strMo724new).toString());
            }
        }
    }

    public boolean license(int i) {
        if (i < 64) {
            return ((1 << i) & this.f6948l) != 0;
        }
        Signature();
        return ((C3253l) this.f6947l).license(i - 64);
    }

    @Override // defpackage.InterfaceC10430l
    public boolean loadAd(byte[] bArr, int i, int i2, boolean z) {
        return ((InterfaceC10430l) this.f6947l).loadAd(bArr, 0, i2, z);
    }

    @Override // defpackage.InterfaceC10430l
    public long mopub() {
        return ((InterfaceC10430l) this.f6947l).mopub() - this.f6948l;
    }

    public void premium() {
        this.f6948l = 0L;
        C3253l c3253l = (C3253l) this.f6947l;
        if (c3253l != null) {
            c3253l.premium();
        }
    }

    @Override // defpackage.InterfaceC10430l
    public boolean purchase(int i, boolean z) {
        return ((InterfaceC10430l) this.f6947l).purchase(i, true);
    }

    @Override // defpackage.InterfaceC5802l
    public int read(byte[] bArr, int i, int i2) {
        return ((InterfaceC10430l) this.f6947l).read(bArr, i, i2);
    }

    @Override // defpackage.InterfaceC10430l
    public void readFully(byte[] bArr, int i, int i2) {
        ((InterfaceC10430l) this.f6947l).readFully(bArr, i, i2);
    }

    @Override // defpackage.InterfaceC10430l
    public void remoteconfig(int i) {
        ((InterfaceC10430l) this.f6947l).remoteconfig(i);
    }

    public boolean signatures(int i) {
        if (i >= 64) {
            Signature();
            return ((C3253l) this.f6947l).signatures(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f6948l;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f6948l = j3;
        long j4 = j - 1;
        this.f6948l = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C3253l c3253l = (C3253l) this.f6947l;
        if (c3253l != null) {
            if (c3253l.license(0)) {
                applovin(63);
            }
            ((C3253l) this.f6947l).signatures(0);
        }
        return z;
    }

    @Override // defpackage.InterfaceC10430l
    public void smaato() {
        ((InterfaceC10430l) this.f6947l).smaato();
    }

    @Override // defpackage.InterfaceC2053l
    public InterfaceC8979l startapp(int i, int i2) {
        return ((InterfaceC2053l) this.f6947l).startapp(i, i2);
    }

    @Override // defpackage.InterfaceC10430l
    public int subs(int i) {
        return ((InterfaceC10430l) this.f6947l).subs(i);
    }

    public int subscription(int i) {
        C3253l c3253l = (C3253l) this.f6947l;
        if (c3253l == null) {
            long j = this.f6948l;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.f6948l);
        }
        return Long.bitCount(this.f6948l) + c3253l.subscription(i - 64);
    }

    @Override // defpackage.InterfaceC2053l
    public void tapsense(InterfaceC12703l interfaceC12703l) {
        ((InterfaceC2053l) this.f6947l).tapsense(new C12658l(this, interfaceC12703l, interfaceC12703l));
    }

    public String toString() {
        switch (this.f6949l) {
            case 1:
                if (((C3253l) this.f6947l) == null) {
                    return Long.toBinaryString(this.f6948l);
                }
                return ((C3253l) this.f6947l).toString() + "xx" + Long.toBinaryString(this.f6948l);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC10430l
    public void yandex(int i, int i2, byte[] bArr) {
        ((InterfaceC10430l) this.f6947l).yandex(i, i2, bArr);
    }

    public /* synthetic */ C3253l(Object obj, long j, int i) {
        this.f6949l = i;
        this.f6947l = obj;
        this.f6948l = j;
    }

    public C3253l(C18450l c18450l) {
        this.f6949l = 9;
        AbstractC1051l.subs(c18450l);
        this.f6947l = c18450l;
    }

    public C3253l(InterfaceC9473l interfaceC9473l) {
        this.f6949l = 2;
        this.f6947l = interfaceC9473l;
        this.f6948l = 262144L;
    }

    public /* synthetic */ C3253l(long j, Object obj, int i) {
        this.f6949l = i;
        this.f6948l = j;
        this.f6947l = obj;
    }

    public C3253l(int i) {
        this.f6949l = i;
        switch (i) {
            case 1:
                this.f6948l = 0L;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3253l(EnumC7283l enumC7283l, int i) {
        this((i & 1) != 0 ? null : enumC7283l, 0L, 6);
        this.f6949l = 6;
    }
}
