package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lٌؘؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5550l implements InterfaceC4656l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C13975l f11832l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C8117l f11833l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f11834l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f11832l = new C13975l(4);
    }

    public AbstractC5550l(String str, ByteBuffer byteBuffer) {
        this(str);
        yandex(byteBuffer);
    }

    public byte[] amazon() {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        f11832l.getClass();
        int i = C17500l.yandex;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArrLoadAd = loadAd();
            byteArrayOutputStream.write(AbstractC14375l.purchase(bArrLoadAd.length + 16));
            byteArrayOutputStream.write("data".getBytes(AbstractC12379l.loadAd));
            byteArrayOutputStream.write(new byte[]{0});
            byteArrayOutputStream.write(new byte[]{0, 0, (byte) crashlytics().f23889l});
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream.write(bArrLoadAd);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            C11467l.metrica(e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC4656l
    public byte[] billing() {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        f11832l.getClass();
        int i = C17500l.yandex;
        try {
            byte[] bArrAmazon = amazon();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC14375l.purchase(bArrAmazon.length + 8));
            byteArrayOutputStream.write(this.f11834l.getBytes(AbstractC12379l.loadAd));
            byteArrayOutputStream.write(bArrAmazon);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            C11467l.metrica(e);
            return null;
        }
    }

    public abstract EnumC11981l crashlytics();

    @Override // defpackage.InterfaceC4656l
    public final String getId() {
        return this.f11834l;
    }

    public abstract byte[] loadAd();

    @Override // defpackage.InterfaceC4656l
    public final boolean startapp() {
        return this.f11834l.equals(EnumC16541l.ARTIST.f32477l) || this.f11834l.equals(EnumC16541l.ALBUM.f32477l) || this.f11834l.equals(EnumC16541l.TITLE.f32477l) || this.f11834l.equals(EnumC16541l.TRACK.f32477l) || this.f11834l.equals(EnumC16541l.DAY.f32477l) || this.f11834l.equals(EnumC16541l.COMMENT.f32477l) || this.f11834l.equals(EnumC16541l.GENRE.f32477l);
    }

    public abstract void yandex(ByteBuffer byteBuffer);

    public AbstractC5550l(String str) {
        this.f11834l = str;
    }
}
