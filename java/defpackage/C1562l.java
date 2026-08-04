package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lؚؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1562l implements InterfaceC17020l, InterfaceC4656l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C13975l f3856l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f3857l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f3858l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f3859l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f3860l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f3861l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f3862l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f3863l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final byte[] f3864l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f3865l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f3856l = new C13975l(4);
    }

    public C1562l(C8662l c8662l, FileChannel fileChannel) throws IOException, C11399l {
        this.f3860l = "";
        int i = c8662l.loadAd;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        int i2 = fileChannel.read(byteBufferAllocate);
        if (i2 < i) {
            C18262l.metrica(AbstractC12589l.premium(i2, i, "Unable to read required number of databytes read:", ":required:"));
            throw null;
        }
        byteBufferAllocate.rewind();
        int i3 = byteBufferAllocate.getInt();
        this.f3861l = i3;
        if (i3 >= ((String[]) C10975l.premium().f22121l).length) {
            throw new C11399l("PictureType was:" + this.f3861l + "but the maximum allowed is " + (((String[]) C10975l.premium().f22121l).length - 1));
        }
        int i4 = byteBufferAllocate.getInt();
        String strName = AbstractC12379l.loadAd.name();
        byte[] bArr = new byte[i4];
        byteBufferAllocate.get(bArr);
        this.f3860l = new String(bArr, strName);
        int i5 = byteBufferAllocate.getInt();
        String strName2 = AbstractC12379l.crashlytics.name();
        byte[] bArr2 = new byte[i5];
        byteBufferAllocate.get(bArr2);
        this.f3857l = new String(bArr2, strName2);
        this.f3863l = byteBufferAllocate.getInt();
        this.f3862l = byteBufferAllocate.getInt();
        this.f3865l = byteBufferAllocate.getInt();
        this.f3858l = byteBufferAllocate.getInt();
        int i6 = byteBufferAllocate.getInt();
        this.f3859l = i6;
        byte[] bArr3 = new byte[i6];
        this.f3864l = bArr3;
        byteBufferAllocate.get(bArr3);
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        f3856l.getClass();
        int i7 = C17500l.yandex;
    }

    @Override // defpackage.InterfaceC4656l
    public final byte[] billing() {
        return loadAd().array();
    }

    @Override // defpackage.InterfaceC4656l
    public final String getId() {
        return "COVER_ART";
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.InterfaceC17020l
    public final ByteBuffer loadAd() {
        byte[] bArr = this.f3864l;
        String str = this.f3857l;
        String str2 = this.f3860l;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC14375l.purchase(this.f3861l));
            byteArrayOutputStream.write(AbstractC14375l.purchase(str2.length()));
            byteArrayOutputStream.write(str2.getBytes(AbstractC12379l.loadAd));
            byteArrayOutputStream.write(AbstractC14375l.purchase(str.length()));
            byteArrayOutputStream.write(str.getBytes(AbstractC12379l.crashlytics));
            byteArrayOutputStream.write(AbstractC14375l.purchase(this.f3863l));
            byteArrayOutputStream.write(AbstractC14375l.purchase(this.f3862l));
            byteArrayOutputStream.write(AbstractC14375l.purchase(this.f3865l));
            byteArrayOutputStream.write(AbstractC14375l.purchase(this.f3858l));
            byteArrayOutputStream.write(AbstractC14375l.purchase(bArr.length));
            byteArrayOutputStream.write(bArr);
            return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            C18073l.license(e.getMessage());
            return null;
        }
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean startapp() {
        return true;
    }

    @Override // defpackage.InterfaceC4656l
    public final String toString() {
        return C10975l.premium().getValue(this.f3861l) + ":" + this.f3860l + ":" + this.f3857l + ":width:" + this.f3863l + ":height:" + this.f3862l + ":colourdepth:" + this.f3865l + ":indexedColourCount:" + this.f3858l + ":image size in bytes:" + this.f3859l + "/" + this.f3864l.length;
    }

    public C1562l(byte[] bArr, int i, String str, int i2, int i3) {
        this.f3860l = "";
        this.f3861l = i;
        if (str != null) {
            this.f3860l = str;
        }
        this.f3857l = "";
        this.f3863l = i2;
        this.f3862l = i3;
        this.f3865l = 0;
        this.f3858l = 0;
        this.f3864l = bArr;
    }
}
