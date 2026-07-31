package defpackage;

import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: lًؘؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5532l implements InterfaceC8979l {
    public static final C5978l billing;
    public static final C5978l mopub;
    public byte[] amazon;
    public C5978l crashlytics;
    public final C5978l loadAd;
    public int purchase;
    public final InterfaceC8979l yandex;

    static {
        C12984l c12984l = new C12984l();
        c12984l.vip = AbstractC3825l.vip("application/id3");
        billing = new C5978l(c12984l);
        C12984l c12984l2 = new C12984l();
        c12984l2.vip = AbstractC3825l.vip("application/x-emsg");
        mopub = new C5978l(c12984l2);
    }

    public C5532l(InterfaceC8979l interfaceC8979l, int i) {
        this.yandex = interfaceC8979l;
        if (i == 1) {
            this.loadAd = billing;
        } else {
            if (i != 3) {
                C8339l.metrica(AbstractC0653l.vip(i, "Unknown metadataType: "));
                throw null;
            }
            this.loadAd = mopub;
        }
        this.amazon = new byte[0];
        this.purchase = 0;
    }

    @Override // defpackage.InterfaceC8979l
    public final int billing(InterfaceC5802l interfaceC5802l, int i, boolean z) {
        return crashlytics(interfaceC5802l, i, z);
    }

    @Override // defpackage.InterfaceC8979l
    public final int crashlytics(InterfaceC5802l interfaceC5802l, int i, boolean z) throws EOFException {
        int i2 = this.purchase + i;
        byte[] bArr = this.amazon;
        if (bArr.length < i2) {
            this.amazon = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = interfaceC5802l.read(this.amazon, this.purchase, i);
        if (i3 != -1) {
            this.purchase += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        C8339l.vip();
        return 0;
    }

    @Override // defpackage.InterfaceC8979l
    public final void loadAd(C13143l c13143l, int i, int i2) {
        int i3 = this.purchase + i;
        byte[] bArr = this.amazon;
        if (bArr.length < i3) {
            this.amazon = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        c13143l.firebase(this.purchase, i, this.amazon);
        this.purchase += i;
    }

    @Override // defpackage.InterfaceC8979l
    public final void mopub(C5978l c5978l) {
        this.crashlytics = c5978l;
        this.yandex.mopub(this.loadAd);
    }

    @Override // defpackage.InterfaceC8979l
    public final void purchase(int i, C13143l c13143l) {
        loadAd(c13143l, i, 0);
    }

    @Override // defpackage.InterfaceC8979l
    public final void yandex(long j, int i, int i2, int i3, C0472l c0472l) {
        this.crashlytics.getClass();
        int i4 = this.purchase - i3;
        C13143l c13143l = new C13143l(Arrays.copyOfRange(this.amazon, i4 - i2, i4));
        byte[] bArr = this.amazon;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.purchase = i3;
        String str = this.crashlytics.metrica;
        C5978l c5978l = this.loadAd;
        String str2 = c5978l.metrica;
        String str3 = c5978l.metrica;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.crashlytics.metrica)) {
                AbstractC6427l.vip("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.crashlytics.metrica);
                return;
            }
            C0733l c0733lApplovin = C5674l.applovin(c13143l);
            C5978l c5978lYandex = c0733lApplovin.yandex();
            if (c5978lYandex == null || !Objects.equals(str3, c5978lYandex.metrica)) {
                AbstractC6427l.vip("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c0733lApplovin.yandex());
                return;
            }
            byte[] bArrCrashlytics = c0733lApplovin.crashlytics();
            bArrCrashlytics.getClass();
            c13143l = new C13143l(bArrCrashlytics);
        }
        int iYandex = c13143l.yandex();
        InterfaceC8979l interfaceC8979l = this.yandex;
        interfaceC8979l.purchase(iYandex, c13143l);
        interfaceC8979l.yandex(j, i, iYandex, 0, c0472l);
    }

    @Override // defpackage.InterfaceC8979l
    public final /* synthetic */ void amazon(long j) {
    }
}
