package defpackage;

/* JADX INFO: renamed from: lٕؐٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15362l extends C1597l {
    /* JADX WARN: Illegal instructions before constructor call */
    public C15362l(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new C18455l(str, charArray), (Character) '=');
        AbstractC12442l.admob(charArray.length == 64);
    }

    @Override // defpackage.C1597l
    public final void crashlytics(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        AbstractC12442l.adcel(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            C18455l c18455l = this.yandex;
            char[] cArr = c18455l.loadAd;
            char[] cArr2 = c18455l.loadAd;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            loadAd(sb, bArr, i2, i - i2);
        }
    }
}
