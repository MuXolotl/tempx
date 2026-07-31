package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lؘۦۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6107l implements InterfaceC10952l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f12893l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f12894l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12895l;

    public AbstractC6107l() {
        this.f12895l = 1;
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }

    public static int Signature(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static void ad(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i ^ i4;
        int i6 = i3 ^ i5;
        int i7 = i2 ^ i6;
        int i8 = (i4 & i) ^ i7;
        iArr[3] = i8;
        int i9 = i ^ (i2 & i5);
        iArr[2] = (i3 | i9) ^ i7;
        int i10 = (i6 ^ i9) & i8;
        iArr[1] = (~i6) ^ i10;
        iArr[0] = (~i9) ^ i10;
    }

    public static void adcel(int[] iArr) {
        int iPro = (pro(iArr[2], 22) ^ iArr[3]) ^ (iArr[1] << 7);
        int iPro2 = pro(iArr[0], 5) ^ iArr[1];
        int i = iArr[3];
        int i2 = iPro2 ^ i;
        int iPro3 = pro(i, 7);
        int iPro4 = pro(iArr[1], 1);
        iArr[3] = (iPro3 ^ iPro) ^ (i2 << 3);
        iArr[1] = (iPro4 ^ i2) ^ iPro;
        iArr[2] = pro(iPro, 3);
        iArr[0] = pro(i2, 13);
    }

    public static void admob(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = ~i;
        int i6 = i2 ^ i;
        int i7 = (i5 | i6) ^ i4;
        int i8 = i3 ^ i7;
        int i9 = i6 ^ i8;
        iArr[2] = i9;
        int i10 = (i6 & i4) ^ i5;
        int i11 = (i9 & i10) ^ i7;
        iArr[1] = i11;
        int i12 = (i & i7) ^ (i11 | i8);
        iArr[3] = i12;
        iArr[0] = i12 ^ (i10 ^ i8);
    }

    public static void advert(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = (~i) ^ i2;
        int i6 = (i | i5) ^ i3;
        int i7 = i4 ^ i6;
        iArr[2] = i7;
        int i8 = i2 ^ (i4 | i5);
        int i9 = i7 ^ i5;
        int i10 = (i6 & i8) ^ i9;
        iArr[3] = i10;
        int i11 = i8 ^ i6;
        iArr[1] = i10 ^ i11;
        iArr[0] = i6 ^ (i11 & i9);
    }

    public static void applovin(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = ~i;
        int i6 = i ^ i2;
        int i7 = i ^ i4;
        int i8 = (i3 ^ i5) ^ (i6 | i7);
        iArr[0] = i8;
        int i9 = i4 & i8;
        int i10 = (i6 ^ i8) ^ i9;
        iArr[1] = i10;
        int i11 = i7 ^ (i8 | i5);
        iArr[2] = (i6 | i9) ^ i11;
        iArr[3] = (i11 & i10) ^ (i2 ^ i9);
    }

    public static void appmetrica(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = ~i;
        int i6 = i ^ i4;
        int i7 = i2 ^ i6;
        int i8 = i3 ^ (i5 | i6);
        int i9 = i2 ^ i8;
        iArr[1] = i9;
        int i10 = (i6 | i9) ^ i4;
        int i11 = (i8 & i10) ^ i7;
        iArr[2] = i11;
        int i12 = i10 ^ i8;
        iArr[0] = i11 ^ i12;
        iArr[3] = (i12 & i7) ^ (~i8);
    }

    public static void firebase(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i | i2;
        int i6 = i2 ^ i3;
        int i7 = i ^ (i2 & i6);
        int i8 = i3 ^ i7;
        int i9 = i4 | i7;
        int i10 = i6 ^ i9;
        iArr[0] = i10;
        int i11 = (i9 | i6) ^ i4;
        iArr[2] = i8 ^ i11;
        int i12 = i5 ^ i11;
        int i13 = i7 ^ (i10 & i12);
        iArr[3] = i13;
        iArr[1] = i13 ^ (i12 ^ i10);
    }

    public static void inmobi(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i2 ^ i3;
        int i6 = (i3 & i5) ^ i4;
        int i7 = i ^ i6;
        int i8 = i2 ^ ((i4 | i5) & i7);
        iArr[1] = i8;
        int i9 = (i & i7) ^ i5;
        iArr[3] = i9;
        int i10 = (i8 | i6) ^ i7;
        int i11 = i6 ^ (i9 & i10);
        iArr[2] = i11;
        iArr[0] = (i9 & i11) ^ (~i10);
    }

    public static void isPro(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i2 ^ i4;
        int i6 = ~i5;
        int i7 = i ^ i3;
        int i8 = i3 ^ i5;
        int i9 = (i2 & i8) ^ i7;
        iArr[0] = i9;
        int i10 = (((i | i6) ^ i4) | i7) ^ i5;
        iArr[3] = i10;
        int i11 = ~i8;
        int i12 = i10 | i9;
        iArr[1] = i11 ^ i12;
        iArr[2] = (i12 ^ i7) ^ (i4 & i11);
    }

    public static void isVip(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = ~i;
        int i6 = i2 ^ i4;
        int i7 = (i3 & i5) ^ i6;
        iArr[0] = i7;
        int i8 = i3 ^ i5;
        int i9 = i2 & (i3 ^ i7);
        int i10 = i8 ^ i9;
        iArr[3] = i10;
        int i11 = i ^ ((i9 | i4) & (i7 | i8));
        iArr[2] = i11;
        iArr[1] = (i11 ^ (i4 | i5)) ^ (i6 ^ i10);
    }

    public static void metrica(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = (i & i2) | i3;
        int i6 = (i | i2) & i4;
        int i7 = i5 ^ i6;
        iArr[3] = i7;
        int i8 = i2 ^ i6;
        int i9 = ((i7 ^ (~i4)) | i8) ^ i;
        iArr[1] = i9;
        int i10 = (i8 ^ i3) ^ (i4 | i9);
        iArr[0] = i10;
        iArr[2] = ((i & i7) ^ i10) ^ (i5 ^ i9);
    }

    public static void premium(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i ^ i4;
        int i6 = i3 ^ (i4 & i5);
        int i7 = i2 | i6;
        iArr[3] = i5 ^ i7;
        int i8 = ~i2;
        int i9 = (i5 | i8) ^ i6;
        iArr[0] = i9;
        int i10 = i8 ^ i5;
        int i11 = (i7 & i10) ^ (i9 & i);
        iArr[2] = i11;
        iArr[1] = (i ^ i6) ^ (i10 & i11);
    }

    public static int pro(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    public static void remoteconfig(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = ~i3;
        int i6 = (i2 & i5) ^ i4;
        int i7 = i & i6;
        int i8 = (i2 ^ i5) ^ i7;
        iArr[3] = i8;
        int i9 = i8 | i2;
        iArr[1] = i6 ^ (i & i9);
        int i10 = i4 | i;
        iArr[0] = (i5 ^ i9) ^ i10;
        iArr[2] = ((i ^ i3) | i7) ^ (i2 & i10);
    }

    public static void signatures(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i ^ i2;
        int i6 = i & i3;
        int i7 = i | i4;
        int i8 = i3 ^ i4;
        int i9 = i6 | (i5 & i7);
        int i10 = i8 ^ i9;
        iArr[2] = i10;
        int i11 = (i7 ^ i2) ^ i9;
        int i12 = i5 ^ (i8 & i11);
        iArr[0] = i12;
        int i13 = i12 & i10;
        iArr[1] = i11 ^ i13;
        iArr[3] = (i2 | i4) ^ (i8 ^ i13);
    }

    public static void smaato(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i2 ^ ((i3 | i4) & i);
        int i6 = i3 ^ (i & i5);
        int i7 = i4 ^ i6;
        iArr[1] = i7;
        int i8 = ~i;
        int i9 = (i6 & i7) ^ i5;
        iArr[3] = i9;
        int i10 = i4 ^ (i7 | i8);
        iArr[0] = i9 ^ i10;
        iArr[2] = (i8 ^ i7) ^ (i5 & i10);
    }

    public static void subs(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i4 ^ i2;
        int i6 = i ^ (i2 & i5);
        int i7 = i5 ^ i6;
        int i8 = i3 ^ i7;
        iArr[3] = i8;
        int i9 = i2 ^ (i5 & i6);
        int i10 = i6 ^ (i8 | i9);
        iArr[1] = i10;
        int i11 = ~i10;
        int i12 = i9 ^ i8;
        iArr[0] = i11 ^ i12;
        iArr[2] = (i11 | i12) ^ i7;
    }

    public static void vip(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = ~i;
        int i6 = i ^ i2;
        int i7 = i3 ^ i6;
        int i8 = (i3 | i5) ^ i4;
        iArr[1] = i7 ^ i8;
        int i9 = i6 ^ (i7 & i8);
        int i10 = i8 ^ (i2 | i9);
        iArr[3] = i10;
        int i11 = i2 | i10;
        iArr[0] = i9 ^ i11;
        iArr[2] = (i4 & i5) ^ (i11 ^ i7);
    }

    public static void yandex(int[] iArr) {
        int iSignature = Signature(iArr[0], 13);
        int iSignature2 = Signature(iArr[2], 3);
        int i = (iArr[1] ^ iSignature) ^ iSignature2;
        int i2 = (iArr[3] ^ iSignature2) ^ (iSignature << 3);
        iArr[1] = Signature(i, 1);
        int iSignature3 = Signature(i2, 7);
        iArr[3] = iSignature3;
        iArr[0] = Signature((iSignature ^ iArr[1]) ^ iSignature3, 5);
        iArr[2] = Signature((iArr[3] ^ iSignature2) ^ (iArr[1] << 7), 22);
    }

    public abstract int[] ads(byte[] bArr);

    public abstract Object amazon();

    public abstract void billing(int i, int i2, byte[] bArr, byte[] bArr2);

    public abstract void crashlytics(int i, int i2, byte[] bArr, byte[] bArr2);

    @Override // defpackage.InterfaceC10952l
    public String getAlgorithmName() {
        return "Serpent";
    }

    @Override // defpackage.InterfaceC10952l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        if (!(interfaceC9719l instanceof C13886l)) {
            C8936l.remoteconfig("invalid parameter passed to ", getAlgorithmName(), " init - ", interfaceC9719l.getClass().getName());
            return;
        }
        this.f12894l = z;
        this.f12893l = ads(((C13886l) interfaceC9719l).f27156l);
        if (interfaceC9719l instanceof EnumC2441l) {
            C8339l.metrica("params should not be CryptoServicePurpose");
        } else {
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
        }
    }

    @Override // defpackage.InterfaceC10952l
    public int license() {
        return 16;
    }

    public Integer loadAd(AbstractC6107l abstractC6107l) {
        C17963l c17963l = AbstractC16157l.yandex;
        if (this == abstractC6107l) {
            return 0;
        }
        C17963l c17963l2 = AbstractC16157l.yandex;
        Integer num = (Integer) c17963l2.get(this);
        Integer num2 = (Integer) c17963l2.get(abstractC6107l);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public String mopub() {
        return (String) this.f12893l;
    }

    public void purchase(InterfaceC3999l interfaceC3999l, LongPointerWrapper longPointerWrapper) {
        Object objAmazon;
        C12428l c12428l = (C12428l) this.f12893l;
        if (interfaceC3999l == null) {
            objAmazon = amazon();
        } else if (this.f12894l) {
            this.f12894l = false;
            objAmazon = startapp(interfaceC3999l);
        } else {
            if (longPointerWrapper == null) {
                C18073l.license("We should never receive change callbacks for non-null (deleted) entities without an actual change object");
                return;
            }
            objAmazon = mo1126throws(interfaceC3999l, longPointerWrapper);
        }
        if (objAmazon != null) {
            Object objAmazon2 = c12428l.f24537l.amazon(objAmazon);
            CancellationException cancellationException = ((objAmazon2 instanceof C14638l) || !(objAmazon2 instanceof C15230l)) ? null : new CancellationException("Cannot deliver object notifications. Increase dispatcher processing resources or buffer the flow with buffer(...)");
            if (cancellationException != null) {
                AbstractC11990l.billing(c12428l, cancellationException);
            }
        }
        if (interfaceC3999l == null) {
            c12428l.crashlytics(null);
        }
    }

    public abstract Object startapp(Object obj);

    @Override // defpackage.InterfaceC10952l
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (((int[]) this.f12893l) == null) {
            C8339l.smaato(getAlgorithmName().concat(" not initialised"));
            return 0;
        }
        if (i + 16 > bArr.length) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (i2 + 16 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        if (this.f12894l) {
            billing(i, i2, bArr, bArr2);
            return 16;
        }
        crashlytics(i, i2, bArr, bArr2);
        return 16;
    }

    /* JADX INFO: renamed from: throws */
    public abstract Object mo1126throws(Object obj, NativePointer nativePointer);

    public String toString() {
        switch (this.f12895l) {
            case 2:
                return mopub();
            default:
                return super.toString();
        }
    }

    public AbstractC6107l(String str, boolean z) {
        this.f12895l = 2;
        this.f12893l = str;
        this.f12894l = z;
    }

    @Override // defpackage.InterfaceC10952l
    public void reset() {
    }

    public AbstractC6107l subscription() {
        return this;
    }

    public AbstractC6107l(C12428l c12428l) {
        this.f12895l = 0;
        this.f12893l = c12428l;
        this.f12894l = true;
    }
}
