package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lِٜؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C11975l extends AbstractC9060l implements InterfaceC13280l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final AbstractC13675l f23853l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C15333l f23854l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C13975l f23855l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public String f23860l = "";

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public String f23859l = "";

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public String f23856l = "";

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public String f23858l = "";

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public String f23861l = "";

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public byte f23857l = -1;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f23855l = new C13975l(4);
        C13698l c13698lYandex = AbstractC13675l.yandex();
        c13698lYandex.mo3668catch(EnumC17969l.ARTIST, EnumC8962l.f18482l);
        c13698lYandex.mo3668catch(EnumC17969l.ALBUM, EnumC8962l.f18481l);
        c13698lYandex.mo3668catch(EnumC17969l.TITLE, EnumC8962l.f18484l);
        c13698lYandex.mo3668catch(EnumC17969l.YEAR, EnumC8962l.f18483l);
        c13698lYandex.mo3668catch(EnumC17969l.GENRE, EnumC8962l.f18478l);
        c13698lYandex.mo3668catch(EnumC17969l.COMMENT, EnumC8962l.f18479l);
        C15333l c15333lMetrica = c13698lYandex.metrica(true);
        f23854l = c15333lMetrica;
        C13698l c13698lYandex2 = AbstractC13675l.yandex();
        c13698lYandex2.mo3671else(c15333lMetrica.entrySet());
        c13698lYandex2.mo3668catch(EnumC17969l.TRACK, EnumC8962l.f18485l);
        f23853l = c13698lYandex2.vip();
    }

    public C11975l(C10111l c10111l, String str) throws C2804l, IOException {
        FileChannel fileChannel = (FileChannel) c10111l.f20589l;
        this.f9508l = str;
        fileChannel.position(fileChannel.size() - 128);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(128);
        fileChannel.read(byteBufferAllocate);
        byteBufferAllocate.flip();
        read(byteBufferAllocate);
    }

    public String ad(EnumC17969l enumC17969l) {
        if (vip().contains(enumC17969l)) {
            return (String) subs(enumC17969l).purchase("");
        }
        throw new C6451l(enumC17969l.f35133l, 18, (byte) 0);
    }

    public String advert() {
        return this.f23856l;
    }

    public int amazon() {
        return 6;
    }

    public AbstractC1186l crashlytics(EnumC17969l enumC17969l) {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.AbstractC4674l
    public boolean equals(Object obj) {
        if (!(obj instanceof C11975l)) {
            return false;
        }
        C11975l c11975l = (C11975l) obj;
        return this.f23860l.equals(c11975l.f23860l) && this.f23859l.equals(c11975l.f23859l) && this.f23856l.equals(c11975l.f23856l) && this.f23857l == c11975l.f23857l && this.f23858l.equals(c11975l.f23858l) && this.f23861l.equals(c11975l.f23861l) && super.equals(obj);
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC15476l firebase(EnumC17969l enumC17969l, String... strArr) {
        remoteconfig(yandex(enumC17969l, strArr));
        return this;
    }

    public boolean isEmpty() {
        return ad(EnumC17969l.TITLE).length() <= 0 && this.f23859l.length() <= 0 && this.f23860l.length() <= 0 && ad(EnumC17969l.GENRE).length() <= 0 && ad(EnumC17969l.YEAR).length() <= 0 && advert().length() <= 0;
    }

    @Override // defpackage.InterfaceC15476l
    public final Iterator isPro() {
        throw new UnsupportedOperationException("TODO:Not done yet");
    }

    public boolean isVip(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr, 0, 3);
        return Arrays.equals(bArr, AbstractC9060l.f18647l);
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC15476l metrica(AbstractC5859l abstractC5859l) {
        throw new C6451l("COVER_ART", 18, (byte) 0);
    }

    @Override // defpackage.InterfaceC15476l
    public final boolean mopub(EnumC17969l enumC17969l) {
        return ad(enumC17969l).length() > 0;
    }

    public void premium(RandomAccessFile randomAccessFile) throws IOException {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f23855l;
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
            String strSubs5 = AbstractC1163l.subs(30, this.f23856l);
            for (int i6 = 0; i6 < strSubs5.length(); i6++) {
                bArr[i6 + 97] = (byte) strSubs5.charAt(i6);
            }
        }
        if (C6356l.amazon().subs) {
            bArr[127] = this.f23857l;
        }
        randomAccessFile.write(bArr);
        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
        c13975l.getClass();
        int i7 = C17500l.yandex;
    }

    public AbstractC13675l pro() {
        return f23854l;
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC17238l purchase(EnumC17969l enumC17969l) {
        return subs(enumC17969l);
    }

    @Override // defpackage.AbstractC18219l
    public void read(ByteBuffer byteBuffer) throws C2804l {
        if (!isVip(byteBuffer)) {
            throw new C2804l(AbstractC0653l.ads(new StringBuilder(), this.f9508l, ":ID3v1 tag not found"));
        }
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f23855l;
        c13975l.getClass();
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
        c13975l.getClass();
        if (matcher3.find()) {
            this.f23860l = this.f23860l.substring(0, matcher3.start());
            c13975l.getClass();
        }
        String strTrim4 = new String(bArr, 93, 4, charset).trim();
        this.f23861l = strTrim4;
        Matcher matcher4 = pattern.matcher(strTrim4);
        if (matcher4.find()) {
            this.f23861l = this.f23861l.substring(0, matcher4.start());
        }
        String strTrim5 = new String(bArr, 97, 30, charset).trim();
        this.f23856l = strTrim5;
        Matcher matcher5 = pattern.matcher(strTrim5);
        c13975l.getClass();
        if (matcher5.find()) {
            this.f23856l = this.f23856l.substring(0, matcher5.start());
            c13975l.getClass();
        }
        this.f23857l = bArr[127];
    }

    public void remoteconfig(InterfaceC4656l interfaceC4656l) {
        int iOrdinal = EnumC17969l.valueOf(interfaceC4656l.getId()).ordinal();
        if (iOrdinal == 2) {
            String string = interfaceC4656l.toString();
            AbstractC6745l.yandex(string);
            this.f23860l = AbstractC1163l.subs(30, string);
            return;
        }
        if (iOrdinal == 11) {
            String string2 = interfaceC4656l.toString();
            AbstractC6745l.yandex(string2);
            this.f23859l = AbstractC1163l.subs(30, string2);
            return;
        }
        if (iOrdinal == 22) {
            signatures(interfaceC4656l.toString());
            return;
        }
        if (iOrdinal == 43) {
            String string3 = interfaceC4656l.toString();
            AbstractC6745l.yandex(string3);
            Integer numAdcel = C18595l.ads().adcel(string3);
            if (numAdcel != null) {
                this.f23857l = numAdcel.byteValue();
                return;
            } else {
                this.f23857l = (byte) -1;
                return;
            }
        }
        if (iOrdinal != 133) {
            if (iOrdinal != 148) {
                return;
            }
            this.f23861l = AbstractC1163l.subs(4, interfaceC4656l.toString());
        } else {
            String string4 = interfaceC4656l.toString();
            AbstractC6745l.yandex(string4);
            this.f23858l = AbstractC1163l.subs(30, string4);
        }
    }

    public void signatures(String str) {
        AbstractC6745l.yandex(str);
        this.f23856l = AbstractC1163l.subs(30, str);
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l smaato(AbstractC5859l abstractC5859l) {
        throw new C6451l("COVER_ART", 18, (byte) 0);
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC17238l subs(EnumC17969l enumC17969l) {
        int iOrdinal = enumC17969l.ordinal();
        if (iOrdinal == 2) {
            return AbstractC17238l.amazon(this.f23860l);
        }
        if (iOrdinal == 11) {
            return AbstractC17238l.amazon(this.f23859l);
        }
        if (iOrdinal == 22) {
            return AbstractC17238l.amazon(advert());
        }
        if (iOrdinal == 43) {
            C18595l c18595lAds = C18595l.ads();
            int i = this.f23857l & 255;
            if (c18595lAds.mo1044goto(i)) {
                return AbstractC17238l.yandex(((String[]) c18595lAds.f36317l)[i]);
            }
        } else {
            if (iOrdinal == 133) {
                return AbstractC17238l.amazon(this.f23858l);
            }
            if (iOrdinal == 148) {
                return AbstractC17238l.amazon(this.f23861l);
            }
        }
        return C1972l.f4482l;
    }

    public AbstractC8481l vip() {
        return f23854l.keySet();
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l yandex(EnumC17969l enumC17969l, String... strArr) {
        AbstractC13675l abstractC13675lPro = pro();
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        EnumC8962l enumC8962l = (EnumC8962l) abstractC13675lPro.get(enumC17969l);
        if (enumC8962l != null) {
            return new C2143l(enumC8962l.name(), 0, (String) AbstractC6745l.crashlytics(strArr));
        }
        throw new C6451l(enumC17969l.name(), 18, (byte) 0);
    }

    public C11975l() {
    }
}
