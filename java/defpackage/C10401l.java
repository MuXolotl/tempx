package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lَٚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10401l extends C11975l {

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C13975l f21222l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public byte f21223l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f21222l = new C13975l(4);
    }

    @Override // defpackage.C11975l
    public final String ad(EnumC17969l enumC17969l) {
        int iOrdinal = enumC17969l.ordinal();
        if (iOrdinal == 2) {
            return this.f23860l;
        }
        if (iOrdinal == 11) {
            return this.f23859l;
        }
        if (iOrdinal == 22) {
            return this.f23856l;
        }
        if (iOrdinal == 43) {
            return C18595l.ads().getValue(this.f23857l & 255);
        }
        if (iOrdinal == 133) {
            return this.f23858l;
        }
        if (iOrdinal != 137) {
            return iOrdinal != 148 ? "" : this.f23861l;
        }
        return String.valueOf(this.f21223l & 255);
    }

    @Override // defpackage.C11975l
    public final String advert() {
        return this.f23856l;
    }

    @Override // defpackage.C11975l, defpackage.InterfaceC15476l
    public final int amazon() {
        return 7;
    }

    @Override // defpackage.C11975l, defpackage.InterfaceC15476l
    public final AbstractC1186l crashlytics(EnumC17969l enumC17969l) {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.C11975l, defpackage.AbstractC4674l
    public final boolean equals(Object obj) {
        return (obj instanceof C10401l) && this.f21223l == ((C10401l) obj).f21223l && super.equals(obj);
    }

    @Override // defpackage.C11975l, defpackage.InterfaceC15476l
    public final boolean isEmpty() {
        return this.f21223l <= 0 && super.isEmpty();
    }

    @Override // defpackage.C11975l
    public final boolean isVip(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr, 0, 3);
        if (Arrays.equals(bArr, AbstractC9060l.f18647l)) {
            byteBuffer.position(125);
            if (byteBuffer.get() == 0 && byteBuffer.get() != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.C11975l
    public final void premium(RandomAccessFile randomAccessFile) throws IOException {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f21222l;
        c13975l.getClass();
        int i = C17500l.yandex;
        byte[] bArr = new byte[128];
        license(randomAccessFile);
        randomAccessFile.seek(randomAccessFile.length());
        byte[] bArr2 = AbstractC9060l.f18647l;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        if (C6356l.amazon().isPro) {
            String strSubs = AbstractC1163l.subs(30, this.f23858l);
            for (int i2 = 0; i2 < strSubs.length(); i2++) {
                bArr[i2 + 3] = (byte) strSubs.charAt(i2);
            }
        }
        if (C6356l.amazon().mopub) {
            String strSubs2 = AbstractC1163l.subs(30, this.f23859l);
            for (int i3 = 0; i3 < strSubs2.length(); i3++) {
                bArr[i3 + 33] = (byte) strSubs2.charAt(i3);
            }
        }
        if (C6356l.amazon().billing) {
            String strSubs3 = AbstractC1163l.subs(30, this.f23860l);
            for (int i4 = 0; i4 < strSubs3.length(); i4++) {
                bArr[i4 + 63] = (byte) strSubs3.charAt(i4);
            }
        }
        if (C6356l.amazon().firebase) {
            String strSubs4 = AbstractC1163l.subs(4, this.f23861l);
            for (int i5 = 0; i5 < strSubs4.length(); i5++) {
                bArr[i5 + 93] = (byte) strSubs4.charAt(i5);
            }
        }
        if (C6356l.amazon().admob) {
            String strSubs5 = AbstractC1163l.subs(28, this.f23856l);
            for (int i6 = 0; i6 < strSubs5.length(); i6++) {
                bArr[i6 + 97] = (byte) strSubs5.charAt(i6);
            }
        }
        bArr[126] = this.f21223l;
        if (C6356l.amazon().subs) {
            bArr[127] = this.f23857l;
        }
        randomAccessFile.write(bArr);
        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
        c13975l.getClass();
        int i7 = C17500l.yandex;
    }

    @Override // defpackage.C11975l
    public final AbstractC13675l pro() {
        return C11975l.f23853l;
    }

    @Override // defpackage.C11975l, defpackage.AbstractC18219l
    public final void read(ByteBuffer byteBuffer) {
        if (!isVip(byteBuffer)) {
            throw new C2804l("ID3v1 tag not found");
        }
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        f21222l.getClass();
        int i = C17500l.yandex;
        byte[] bArr = new byte[128];
        byteBuffer.position(0);
        byteBuffer.get(bArr, 0, 128);
        Charset charset = AbstractC12379l.loadAd;
        String strTrim = new String(bArr, 3, 30, charset).trim();
        this.f23858l = strTrim;
        Pattern pattern = AbstractC9060l.f18648l;
        Matcher matcher = pattern.matcher(strTrim);
        if (matcher.find()) {
            this.f23858l = this.f23858l.substring(0, matcher.start());
        }
        String strTrim2 = new String(bArr, 33, 30, charset).trim();
        this.f23859l = strTrim2;
        Matcher matcher2 = pattern.matcher(strTrim2);
        if (matcher2.find()) {
            this.f23859l = this.f23859l.substring(0, matcher2.start());
        }
        String strTrim3 = new String(bArr, 63, 30, charset).trim();
        this.f23860l = strTrim3;
        Matcher matcher3 = pattern.matcher(strTrim3);
        if (matcher3.find()) {
            this.f23860l = this.f23860l.substring(0, matcher3.start());
        }
        String strTrim4 = new String(bArr, 93, 4, charset).trim();
        this.f23861l = strTrim4;
        Matcher matcher4 = pattern.matcher(strTrim4);
        if (matcher4.find()) {
            this.f23861l = this.f23861l.substring(0, matcher4.start());
        }
        String strTrim5 = new String(bArr, 97, 28, charset).trim();
        this.f23856l = strTrim5;
        Matcher matcher5 = pattern.matcher(strTrim5);
        if (matcher5.find()) {
            this.f23856l = this.f23856l.substring(0, matcher5.start());
        }
        this.f21223l = bArr[126];
        this.f23857l = bArr[127];
    }

    @Override // defpackage.C11975l, defpackage.InterfaceC13280l
    public final void remoteconfig(InterfaceC4656l interfaceC4656l) {
        int i;
        if (EnumC17969l.valueOf(interfaceC4656l.getId()) != EnumC17969l.TRACK) {
            super.remoteconfig(interfaceC4656l);
            return;
        }
        String string = interfaceC4656l.toString();
        try {
            i = Integer.parseInt(string);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i > 255 || i < 1) {
            this.f21223l = (byte) 0;
        } else {
            this.f21223l = (byte) Integer.parseInt(string);
        }
    }

    @Override // defpackage.C11975l
    public final void signatures(String str) {
        AbstractC6745l.yandex(str);
        this.f23856l = AbstractC1163l.subs(28, str);
    }

    @Override // defpackage.C11975l, defpackage.InterfaceC15476l
    public final AbstractC8481l vip() {
        return C11975l.f23853l.keySet();
    }
}
