package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: lؓ۟ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2143l implements InterfaceC7988l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f4780l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f4781l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4782l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f4783l;

    public C2143l(String str, int i, String str2) {
        this.f4782l = i;
        switch (i) {
            case 1:
                this.f4783l = str.toUpperCase();
                this.f4780l = str2;
                yandex();
                break;
            default:
                String upperCase = str.toUpperCase();
                this.f4783l = upperCase;
                this.f4780l = str2;
                this.f4781l = upperCase.equals("TITLE") || upperCase.equals("ALBUM") || upperCase.equals("ARTIST") || upperCase.equals("GENRE") || upperCase.equals("YEAR") || upperCase.equals("COMMENT") || upperCase.equals("TRACK");
                break;
        }
    }

    @Override // defpackage.InterfaceC7988l
    public final String admob() {
        switch (this.f4782l) {
            case 0:
                break;
        }
        return this.f4780l;
    }

    @Override // defpackage.InterfaceC4656l
    public final byte[] billing() {
        switch (this.f4782l) {
            case 0:
                String str = this.f4783l;
                Charset charset = AbstractC12379l.loadAd;
                byte[] bytes = str.getBytes(charset);
                byte[] bytes2 = this.f4780l.getBytes(charset);
                byte[] bArr = new byte[bytes.length + 5 + bytes2.length];
                int length = bytes.length + 1 + bytes2.length;
                System.arraycopy(new byte[]{(byte) (length & 255), (byte) ((65280 & length) >> 8), (byte) ((16711680 & length) >> 16), (byte) (((-16777216) & length) >> 24)}, 0, bArr, 0, 4);
                System.arraycopy(bytes, 0, bArr, 4, bytes.length);
                int length2 = bytes.length;
                bArr[4 + length2] = 61;
                System.arraycopy(bytes2, 0, bArr, length2 + 5, bytes2.length);
                return bArr;
            default:
                byte[] bytes3 = this.f4783l.getBytes(AbstractC12379l.loadAd);
                byte[] bytes4 = this.f4780l.getBytes(AbstractC12379l.crashlytics);
                byte[] bArr2 = new byte[bytes3.length + 5 + bytes4.length];
                int length3 = bytes3.length + 1 + bytes4.length;
                System.arraycopy(new byte[]{(byte) (length3 & 255), (byte) ((65280 & length3) >> 8), (byte) ((16711680 & length3) >> 16), (byte) (((-16777216) & length3) >> 24)}, 0, bArr2, 0, 4);
                System.arraycopy(bytes3, 0, bArr2, 4, bytes3.length);
                int length4 = bytes3.length;
                bArr2[4 + length4] = 61;
                System.arraycopy(bytes4, 0, bArr2, length4 + 5, bytes4.length);
                return bArr2;
        }
    }

    @Override // defpackage.InterfaceC4656l
    public final String getId() {
        switch (this.f4782l) {
            case 0:
                break;
        }
        return this.f4783l;
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean isEmpty() {
        switch (this.f4782l) {
            case 0:
                return "".equals(this.f4780l);
            default:
                return this.f4780l.equals("");
        }
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean startapp() {
        switch (this.f4782l) {
            case 0:
                break;
        }
        return this.f4781l;
    }

    @Override // defpackage.InterfaceC4656l
    public final String toString() {
        switch (this.f4782l) {
            case 0:
                break;
        }
        return this.f4780l;
    }

    public void yandex() {
        String str = this.f4783l;
        this.f4781l = str.equals(EnumC14884l.f29196l.f29270l) || str.equals(EnumC14884l.f29207l.f29270l) || str.equals(EnumC14884l.f29128l.f29270l) || str.equals(EnumC14884l.f29149l.f29270l) || str.equals(EnumC14884l.f29121l.f29270l) || str.equals(EnumC14884l.f29126l.f29270l) || str.equals(EnumC14884l.f29150l.f29270l) || str.equals(EnumC14884l.f29193l.f29270l);
    }
}
