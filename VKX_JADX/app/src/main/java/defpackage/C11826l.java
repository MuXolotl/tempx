package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: lِٓ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11826l implements InterfaceC10430l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f23654l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f23655l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC5802l f23656l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f23659l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f23660l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte[] f23658l = new byte[65536];

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte[] f23657l = new byte[4096];

    static {
        AbstractC17959l.yandex("media3.extractor");
    }

    public C11826l(InterfaceC5802l interfaceC5802l, long j, long j2) {
        this.f23656l = interfaceC5802l;
        this.f23659l = j;
        this.f23654l = j2;
    }

    public final int adcel(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f23656l.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        C8339l.vip();
        return 0;
    }

    @Override // defpackage.InterfaceC10430l
    public final void admob(int i) throws EOFException, InterruptedIOException {
        firebase(i, false);
    }

    public final void ads(int i) {
        int i2 = this.f23655l - i;
        this.f23655l = i2;
        this.f23660l = 0;
        byte[] bArr = this.f23658l;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f23658l = bArr2;
    }

    @Override // defpackage.InterfaceC10430l
    public final int amazon(int i, int i2, byte[] bArr) throws EOFException, InterruptedIOException {
        C11826l c11826l;
        int iMin;
        startapp(i2);
        int i3 = this.f23655l;
        int i4 = this.f23660l;
        int i5 = i3 - i4;
        if (i5 == 0) {
            c11826l = this;
            iMin = c11826l.adcel(this.f23658l, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c11826l.f23655l += iMin;
        } else {
            c11826l = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(c11826l.f23658l, c11826l.f23660l, bArr, i, iMin);
        c11826l.f23660l += iMin;
        return iMin;
    }

    @Override // defpackage.InterfaceC10430l
    public final boolean billing(byte[] bArr, int i, int i2, boolean z) {
        if (!firebase(i2, z)) {
            return false;
        }
        System.arraycopy(this.f23658l, this.f23660l - i2, bArr, i, i2);
        return true;
    }

    public final boolean firebase(int i, boolean z) throws EOFException, InterruptedIOException {
        startapp(i);
        int iAdcel = this.f23655l - this.f23660l;
        while (iAdcel < i) {
            C11826l c11826l = this;
            int i2 = i;
            boolean z2 = z;
            iAdcel = c11826l.adcel(this.f23658l, this.f23660l, i2, iAdcel, z2);
            if (iAdcel == -1) {
                return false;
            }
            c11826l.f23655l = c11826l.f23660l + iAdcel;
            this = c11826l;
            i = i2;
            z = z2;
        }
        this.f23660l += i;
        return true;
    }

    @Override // defpackage.InterfaceC10430l
    public final long getLength() {
        return this.f23654l;
    }

    @Override // defpackage.InterfaceC10430l
    public final long getPosition() {
        return this.f23659l;
    }

    @Override // defpackage.InterfaceC10430l
    public final boolean loadAd(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.f23655l;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f23658l, 0, bArr, i, iMin);
            ads(iMin);
        }
        int iAdcel = iMin;
        while (iAdcel < i2 && iAdcel != -1) {
            iAdcel = adcel(bArr, i, i2, iAdcel, z);
        }
        if (iAdcel != -1) {
            this.f23659l += (long) iAdcel;
        }
        return iAdcel != -1;
    }

    @Override // defpackage.InterfaceC10430l
    public final long mopub() {
        return this.f23659l + ((long) this.f23660l);
    }

    @Override // defpackage.InterfaceC10430l
    public final boolean purchase(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f23655l, i);
        ads(iMin);
        int iAdcel = iMin;
        while (iAdcel < i && iAdcel != -1) {
            byte[] bArr = this.f23657l;
            iAdcel = adcel(bArr, -iAdcel, Math.min(i, bArr.length + iAdcel), iAdcel, z);
        }
        if (iAdcel != -1) {
            this.f23659l += (long) iAdcel;
        }
        return iAdcel != -1;
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        C11826l c11826l;
        int i3 = this.f23655l;
        int iAdcel = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f23658l, 0, bArr, i, iMin);
            ads(iMin);
            iAdcel = iMin;
        }
        if (iAdcel == 0) {
            c11826l = this;
            iAdcel = c11826l.adcel(bArr, i, i2, 0, true);
        } else {
            c11826l = this;
        }
        if (iAdcel != -1) {
            c11826l.f23659l += (long) iAdcel;
        }
        return iAdcel;
    }

    @Override // defpackage.InterfaceC10430l
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        loadAd(bArr, i, i2, false);
    }

    @Override // defpackage.InterfaceC10430l
    public final void remoteconfig(int i) throws EOFException, InterruptedIOException {
        purchase(i, false);
    }

    @Override // defpackage.InterfaceC10430l
    public final void smaato() {
        this.f23660l = 0;
    }

    public final void startapp(int i) {
        int i2 = this.f23660l + i;
        byte[] bArr = this.f23658l;
        if (i2 > bArr.length) {
            this.f23658l = Arrays.copyOf(this.f23658l, AbstractC15323l.isPro(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // defpackage.InterfaceC10430l
    public final int subs(int i) throws EOFException, InterruptedIOException {
        C11826l c11826l;
        int iMin = Math.min(this.f23655l, i);
        ads(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f23657l;
            c11826l = this;
            iMin = c11826l.adcel(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            c11826l = this;
        }
        if (iMin != -1) {
            c11826l.f23659l += (long) iMin;
        }
        return iMin;
    }

    @Override // defpackage.InterfaceC10430l
    public final void yandex(int i, int i2, byte[] bArr) {
        billing(bArr, i, i2, false);
    }
}
