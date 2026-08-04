package defpackage;

import android.os.Parcel;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: lِؐؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11534l implements InterfaceC8396l, InterfaceC11545l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C11534l f23190l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C11534l f23191l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C11534l f23192l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C11534l f23193l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C11534l f23194l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C11534l f23195l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C11534l f23196l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C11534l f23197l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C11534l f23198l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C11534l f23199l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f23200l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23201l;

    static {
        int i = 0;
        f23190l = new C11534l("SHA1", i);
        f23195l = new C11534l("SHA224", i);
        f23194l = new C11534l("SHA256", i);
        f23198l = new C11534l("SHA384", i);
        f23191l = new C11534l("SHA512", i);
        int i2 = 1;
        f23192l = new C11534l("TINK", i2);
        f23197l = new C11534l("NO_PREFIX", i2);
        int i3 = 2;
        f23193l = new C11534l("TINK", i3);
        f23199l = new C11534l("CRUNCHY", i3);
        f23196l = new C11534l("NO_PREFIX", i3);
    }

    public C11534l(int i) {
        this.f23201l = i;
        switch (i) {
            case 4:
                break;
            default:
                this.f23200l = "";
                break;
        }
    }

    public static C11534l loadAd(C0869l c0869l, byte[] bArr) {
        Charset charset = AbstractC12379l.loadAd;
        C13975l c13975l = AbstractC14375l.yandex;
        if (bArr.length < 9) {
            bArr = new byte[9];
        } else {
            if (9 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(AbstractC14814l.remoteconfig(bArr.length, " length:9", new StringBuilder("a:")));
            }
            for (int i = 0; i < 9; i++) {
                bArr[i] = 0;
            }
        }
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = c0869l.ads(i2);
        }
        String str = new String(bArr, 0, 9, charset);
        if (!str.startsWith("LAME")) {
            return null;
        }
        C11534l c11534l = new C11534l(4);
        c11534l.f23200l = str;
        return c11534l;
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        int i = C1539l.firebase;
        BinderC15695l binderC15695l = new BinderC15695l((C2350l) obj2);
        C18414l c18414l = (C18414l) ((C8900l) obj).metrica();
        String str = this.f23200l;
        Parcel parcelM743l = c18414l.m743l();
        AbstractC15425l.crashlytics(parcelM743l, binderC15695l);
        parcelM743l.writeString(str);
        c18414l.m741l(parcelM743l, 5);
    }

    public void amazon(String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        if (4 >= AbstractC5020l.inmobi(C12320l.amazon)) {
            C13801l c13801l = C13801l.crashlytics;
            String strFirebase = AbstractC12900l.firebase(this.f23200l, str);
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
            Iterator it = C12320l.loadAd.iterator();
            while (it.hasNext()) {
                ((C15045l) it.next()).yandex(c13801l, 5, strFirebase, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            }
        }
    }

    public void crashlytics(String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        if (1 >= AbstractC5020l.inmobi(C12320l.amazon)) {
            C13801l c13801l = C13801l.crashlytics;
            String strFirebase = AbstractC12900l.firebase(this.f23200l, str);
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
            Iterator it = C12320l.loadAd.iterator();
            while (it.hasNext()) {
                ((C15045l) it.next()).yandex(c13801l, 2, strFirebase, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            }
        }
    }

    public String toString() {
        switch (this.f23201l) {
            case 0:
                return this.f23200l;
            case 1:
                return this.f23200l;
            case 2:
                return this.f23200l;
            case 3:
            case 4:
            default:
                return super.toString();
            case 5:
                return AbstractC2812l.tapsense(new StringBuilder("\""), this.f23200l, '\"');
        }
    }

    public void yandex(String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        if (3 >= AbstractC5020l.inmobi(C12320l.amazon)) {
            C13801l c13801l = C13801l.crashlytics;
            String strFirebase = AbstractC12900l.firebase(this.f23200l, str);
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
            Iterator it = C12320l.loadAd.iterator();
            while (it.hasNext()) {
                ((C15045l) it.next()).yandex(c13801l, 4, strFirebase, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            }
        }
    }

    public /* synthetic */ C11534l(String str, int i) {
        this.f23201l = i;
        this.f23200l = str;
    }
}
