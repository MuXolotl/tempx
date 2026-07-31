package defpackage;

import ealvatag.tag.id3.framebody.AbstractID3v2FrameBody;
import ealvatag.tag.id3.framebody.FrameBodyEncrypted;
import ealvatag.tag.id3.framebody.FrameBodyUnsupported;
import ealvatag.tag.id3.framebody.FrameIdentifierException;
import ealvatag.tag.id3.framebody.Id3FrameBodyFactories;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: lَؑۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0231l extends AbstractC2377l implements InterfaceC7988l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C13975l f1214l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public C4415l f1215l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public String f1216l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public String f1217l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f1218l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public AbstractC13107l f1219l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f1214l = new C13975l(4);
    }

    public AbstractC0231l(String str) {
        this.f1216l = "";
        this.f1217l = "";
        this.f1215l = null;
        this.f1219l = null;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f1214l;
        c13975l.getClass();
        int i = C17500l.yandex;
        this.f1216l = str;
        try {
            this.f5140l = (AbstractC16446l) Class.forName("ealvatag.tag.id3.framebody.FrameBody".concat(str)).newInstance();
        } catch (ClassNotFoundException unused) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
            this.f5140l = new FrameBodyUnsupported(str);
        } catch (IllegalAccessException e) {
            e = e;
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i3 = C17500l.yandex;
            C11467l.metrica(e);
            throw null;
        } catch (InstantiationException e2) {
            e = e2;
            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i4 = C17500l.yandex;
            C11467l.metrica(e);
            throw null;
        }
        this.f5140l.setHeader(this);
        if (this instanceof C11204l) {
            AbstractC16446l abstractC16446l = this.f5140l;
            C6356l.amazon();
            abstractC16446l.setTextEncoding((byte) 0);
        } else if (this instanceof C6364l) {
            AbstractC16446l abstractC16446l2 = this.f5140l;
            C6356l.amazon();
            abstractC16446l2.setTextEncoding((byte) 0);
        }
        c13975l.getClass();
    }

    public static C0869l Signature(C0869l c0869l, int i, int i2) throws EOFException {
        C0869l c0869l2 = new C0869l();
        c0869l.m732synchronized(c0869l2, i);
        C0869l c0869l3 = new C0869l();
        new C1503l(new C17237l(c0869l2, new Inflater())).mopub(c0869l3, i2);
        return c0869l3;
    }

    public static boolean ad(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals("PIC") || str.equals("APIC");
    }

    @Override // defpackage.InterfaceC7988l
    public final String admob() {
        return this.f5140l.getUserFriendlyValue();
    }

    public boolean advert(byte[] bArr) {
        return bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 0;
    }

    public final FrameBodyEncrypted applovin(String str, ByteBuffer byteBuffer, int i) throws C5299l {
        try {
            FrameBodyEncrypted frameBodyEncrypted = new FrameBodyEncrypted(str, byteBuffer, i);
            frameBodyEncrypted.setHeader(this);
            return frameBodyEncrypted;
        } catch (C17436l e) {
            throw new C5299l(e);
        }
    }

    public final String appmetrica(C0869l c0869l) throws C11399l {
        int iPro = pro();
        long j = iPro;
        if (j > c0869l.f2526l) {
            return "";
        }
        String strMo712l = c0869l.mo712l(j, Charset.defaultCharset());
        this.f1216l = strMo712l;
        if (strMo712l.isEmpty()) {
            throw new C9999l(AbstractC0653l.ads(new StringBuilder(), this.f1217l, ":only padding found"));
        }
        long jLicense = license() - iPro;
        long j2 = c0869l.f2526l;
        C13975l c13975l = f1214l;
        if (jLicense <= j2) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            c13975l.getClass();
            int i = C17500l.yandex;
            return this.f1216l;
        }
        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
        c13975l.getClass();
        int i2 = C17500l.yandex;
        throw new C11399l(AbstractC0653l.ads(new StringBuilder(), this.f1217l, ":No space to find another frame"));
    }

    @Override // defpackage.InterfaceC4656l
    public final byte[] billing() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        write(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.AbstractC2377l
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC0231l) {
            return super.equals((AbstractC0231l) obj);
        }
        return false;
    }

    @Override // defpackage.InterfaceC4656l
    public final String getId() {
        return this.f1216l;
    }

    public final String inmobi(ByteBuffer byteBuffer) throws C11399l {
        byte[] bArr = new byte[pro()];
        if (pro() <= byteBuffer.remaining()) {
            byteBuffer.get(bArr, 0, pro());
        }
        if (advert(bArr)) {
            throw new C9999l(AbstractC0653l.ads(new StringBuilder(), this.f1217l, ":only padding found"));
        }
        if (license() - pro() <= byteBuffer.remaining()) {
            String str = new String(bArr);
            this.f1216l = str;
            return str;
        }
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        f1214l.getClass();
        int i = C17500l.yandex;
        throw new C11399l(AbstractC0653l.ads(new StringBuilder(), this.f1217l, ":No space to find another frame"));
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean isEmpty() {
        return this.f5140l == null;
    }

    public final AbstractID3v2FrameBody isVip(String str, C0869l c0869l, int i) {
        AbstractID3v2FrameBody frameBodyUnsupported;
        try {
            frameBodyUnsupported = Id3FrameBodyFactories.instance().make(str, c0869l, i);
        } catch (FrameIdentifierException unused) {
            frameBodyUnsupported = new FrameBodyUnsupported(c0869l, i);
        }
        frameBodyUnsupported.setHeader(this);
        return frameBodyUnsupported;
    }

    public abstract int license();

    public final FrameBodyEncrypted premium(String str, C0869l c0869l, int i) throws C5299l {
        try {
            FrameBodyEncrypted frameBodyEncrypted = new FrameBodyEncrypted(str, c0869l, i);
            frameBodyEncrypted.setHeader(this);
            return frameBodyEncrypted;
        } catch (C17436l e) {
            throw new C5299l(e);
        }
    }

    public abstract int pro();

    public final AbstractID3v2FrameBody signatures(String str, ByteBuffer byteBuffer, int i) throws C11399l, C5299l {
        AbstractID3v2FrameBody frameBodyUnsupported;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f1214l;
        c13975l.getClass();
        int i2 = C17500l.yandex;
        try {
            frameBodyUnsupported = (AbstractID3v2FrameBody) Class.forName("ealvatag.tag.id3.framebody.FrameBody".concat(str)).getConstructor(Class.forName("java.nio.ByteBuffer"), Integer.TYPE).newInstance(byteBuffer, Integer.valueOf(i));
        } catch (ClassNotFoundException unused) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i3 = C17500l.yandex;
            try {
                frameBodyUnsupported = new FrameBodyUnsupported(byteBuffer, i);
            } catch (C11399l e) {
                throw e;
            } catch (C17436l e2) {
                throw new C11399l(e2.getMessage());
            }
        } catch (IllegalAccessException e3) {
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            e3.getMessage();
            c13975l.getClass();
            int i4 = C17500l.yandex;
            C18073l.license(e3.getMessage());
            return null;
        } catch (InstantiationException e4) {
            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
            e4.getMessage();
            c13975l.getClass();
            int i5 = C17500l.yandex;
            C18073l.license(e4.getMessage());
            return null;
        } catch (NoSuchMethodException e5) {
            EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
            e5.getMessage();
            c13975l.getClass();
            int i6 = C17500l.yandex;
            C18073l.license(e5.getMessage());
            return null;
        } catch (InvocationTargetException e6) {
            EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
            e6.getCause().getMessage();
            c13975l.getClass();
            int i7 = C17500l.yandex;
            if (e6.getCause() instanceof Error) {
                throw ((Error) e6.getCause());
            }
            if (e6.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e6.getCause());
            }
            if (e6.getCause() instanceof C11399l) {
                throw ((C11399l) e6.getCause());
            }
            if (e6.getCause() instanceof C5299l) {
                throw ((C5299l) e6.getCause());
            }
            throw new C11399l(e6.getCause().getMessage());
        }
        c13975l.getClass();
        frameBodyUnsupported.setHeader(this);
        return frameBodyUnsupported;
    }

    public abstract void write(ByteArrayOutputStream byteArrayOutputStream);

    public AbstractC0231l() {
        this.f1216l = "";
        this.f1217l = "";
        this.f1215l = null;
        this.f1219l = null;
    }
}
