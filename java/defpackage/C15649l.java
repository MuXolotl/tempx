package defpackage;

import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.id3.framebody.FrameBodyTCON;
import ealvatag.tag.id3.framebody.FrameBodyUnsupported;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Comparator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lْٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15649l extends AbstractC3348l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C13975l f30589l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f30591l = false;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f30590l = false;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f30589l = new C13975l(4);
    }

    public C15649l(C0869l c0869l, C9037l c9037l, String str, boolean z) throws C2804l {
        this.f9508l = str;
        try {
            m4103new(c9037l.loadAd);
            m4101final(this.f30590l ? C0268l.yandex(c0869l) : c0869l, c9037l.crashlytics, z);
            C13975l c13975l = f30589l;
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            this.f7146l.keySet().size();
            c13975l.getClass();
            int i = C17500l.yandex;
        } catch (IOException e) {
            throw new C2804l("ID3v2_2.20 error reading tag", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static C4303l m4099static(String str) {
        String strYandex;
        C4303l c4303l = new C4303l();
        C13975l c13975l = C4303l.f8834l;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        c13975l.getClass();
        int i = C17500l.yandex;
        c4303l.f1216l = str;
        if (!AbstractC1163l.purchase(str) || ((String) AbstractC6443l.loadAd.get(str)) != null || str.equals("CRM")) {
            strYandex = str;
        } else if (str.equals("TYE") || str.equals("TIM")) {
            strYandex = "TDRC";
        } else if (AbstractC1163l.purchase(str)) {
            strYandex = str.length() < 3 ? null : AbstractC6443l.yandex(str.substring(0, 3));
        } else {
            strYandex = str;
        }
        try {
            c4303l.f5140l = (AbstractC16446l) Class.forName("ealvatag.tag.id3.framebody.FrameBody" + strYandex).newInstance();
        } catch (ClassNotFoundException unused) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            int i2 = C17500l.yandex;
            c4303l.f5140l = new FrameBodyUnsupported(str);
        } catch (IllegalAccessException e) {
            e = e;
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            int i3 = C17500l.yandex;
            C11467l.metrica(e);
            return null;
        } catch (InstantiationException e2) {
            e = e2;
            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
            int i4 = C17500l.yandex;
            C11467l.metrica(e);
            return null;
        }
        c4303l.f5140l.setHeader(c4303l);
        return c4303l;
    }

    @Override // defpackage.AbstractC4674l
    public final byte Signature() {
        return (byte) 2;
    }

    @Override // defpackage.AbstractC3348l
    public final String applovin() {
        return DataTypes.OBJ_IMAGE_FORMAT;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m4100default() {
        if (this.f7146l == null) {
            this.f7146l = new LinkedHashMap();
        }
        if (this.f7145l == null) {
            this.f7145l = new LinkedHashMap();
        }
        this.f7146l.clear();
        this.f7145l.clear();
    }

    @Override // defpackage.AbstractC3348l
    /* JADX INFO: renamed from: else */
    public final long mo1326else(File file, long j) throws Throwable {
        this.f9508l = file.getName();
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f30589l;
        c13975l.getClass();
        int i = C17500l.yandex;
        byte[] byteArray = m1324class().toByteArray();
        C6356l.amazon();
        this.f30590l = false;
        int iLicense = AbstractC3348l.license(byteArray.length + 10, (int) j);
        int length = iLicense - (byteArray.length + 10);
        c13975l.getClass();
        c13975l.getClass();
        c13975l.getClass();
        m1325continue(file, m4102goto(length, byteArray.length), byteArray, length, iLicense, j);
        return iLicense;
    }

    @Override // defpackage.AbstractC3348l, defpackage.AbstractC4674l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15649l)) {
            return false;
        }
        C15649l c15649l = (C15649l) obj;
        return this.f30591l == c15649l.f30591l && this.f30590l == c15649l.f30590l && super.equals(obj);
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void m4101final(C0869l c0869l, int i, boolean z) {
        m4100default();
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f30589l;
        c13975l.getClass();
        int i2 = C17500l.yandex;
        while (c0869l.f2526l > 0) {
            try {
                C4303l c4303l = new C4303l(c0869l, this.f9508l, z);
                if (AbstractC0231l.ad(c4303l.f1216l) && z) {
                    this.f9509l = true;
                } else {
                    mo1330native(c4303l.f1216l, c4303l);
                }
            } catch (IOException unused) {
                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i3 = C17500l.yandex;
            } catch (C5299l unused2) {
                EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i4 = C17500l.yandex;
            } catch (C9999l unused3) {
                EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i5 = C17500l.yandex;
                return;
            } catch (C6226l unused4) {
                EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i6 = C17500l.yandex;
                return;
            } catch (C15266l unused5) {
                EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i7 = C17500l.yandex;
            } catch (C11399l unused6) {
                EnumC8711l[] enumC8711lArr7 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i8 = C17500l.yandex;
                return;
            } catch (C17436l unused7) {
                EnumC8711l[] enumC8711lArr8 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i9 = C17500l.yandex;
            }
        }
    }

    @Override // defpackage.AbstractC3348l, defpackage.AbstractC18219l
    public final int getSize() {
        return super.getSize() + 10;
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final ByteBuffer m4102goto(int i, int i2) {
        this.f30591l = false;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(10);
        byteBufferAllocate.put(AbstractC3348l.f7141l);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.put((byte) 0);
        byte b = this.f30590l ? (byte) -128 : (byte) 0;
        if (this.f30591l) {
            b = (byte) (b | 64);
        }
        byteBufferAllocate.put(b);
        byteBufferAllocate.put(AbstractC17265l.admob(i + i2));
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    @Override // defpackage.AbstractC3348l
    /* JADX INFO: renamed from: native */
    public final void mo1330native(String str, AbstractC0231l abstractC0231l) {
        AbstractC16446l abstractC16446l = abstractC0231l.f5140l;
        if (abstractC16446l instanceof FrameBodyTCON) {
            ((FrameBodyTCON) abstractC16446l).setV23Format();
        }
        super.mo1330native(str, abstractC0231l);
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final void m4103new(byte b) {
        boolean z = (b & 128) != 0;
        this.f30590l = z;
        this.f30591l = (b & 64) != 0;
        C13975l c13975l = f30589l;
        if (z) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            c13975l.getClass();
            int i = C17500l.yandex;
        }
        if (this.f30591l) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
        }
        if ((b & 32) != 0) {
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i3 = C17500l.yandex;
        }
        if ((b & 16) != 0) {
            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i4 = C17500l.yandex;
        }
        if ((b & 8) != 0) {
            EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i5 = C17500l.yandex;
        }
        if ((b & 4) != 0) {
            EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i6 = C17500l.yandex;
        }
        if ((b & 2) != 0) {
            EnumC8711l[] enumC8711lArr7 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i7 = C17500l.yandex;
        }
        if ((b & 1) != 0) {
            EnumC8711l[] enumC8711lArr8 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i8 = C17500l.yandex;
        }
    }

    @Override // defpackage.AbstractC3348l
    /* JADX INFO: renamed from: package */
    public final C18449l mo1331package(EnumC17969l enumC17969l) {
        EnumC15675l enumC15675l = (EnumC15675l) C6647l.admob().isPro().get(enumC17969l);
        if (enumC15675l != null) {
            return new C18449l(enumC17969l, enumC15675l.f30802l, enumC15675l.f30801l, 3);
        }
        throw new C6451l(enumC17969l.name(), 18, (byte) 0);
    }

    @Override // defpackage.AbstractC3348l
    public final String premium(String str) {
        return (String) AbstractC5484l.loadAd.get(str);
    }

    @Override // defpackage.AbstractC3348l
    public final /* bridge */ /* synthetic */ AbstractC0231l pro(String str) {
        return m4099static(str);
    }

    @Override // defpackage.AbstractC3348l, defpackage.InterfaceC15476l
    public final AbstractC17238l purchase(EnumC17969l enumC17969l) {
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        if (enumC17969l != EnumC17969l.GENRE) {
            return super.purchase(enumC17969l);
        }
        AbstractC1186l abstractC1186lCrashlytics = crashlytics(enumC17969l);
        return (abstractC1186lCrashlytics == null || abstractC1186lCrashlytics.size() <= 0) ? C1972l.f4482l : AbstractC17238l.amazon(FrameBodyTCON.convertID3v22GenreToGeneric(((FrameBodyTCON) ((AbstractC0231l) abstractC1186lCrashlytics.get(0)).f5140l).getValues().get(0)));
    }

    @Override // defpackage.AbstractC18219l
    public final void read(ByteBuffer byteBuffer) throws C2804l {
        if (!m1323catch(byteBuffer)) {
            throw new C2804l("ID3v2.20 tag not found");
        }
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f30589l;
        c13975l.getClass();
        int i = C17500l.yandex;
        m4103new(byteBuffer.get());
        int iCrashlytics = AbstractC17265l.crashlytics(byteBuffer);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        if (this.f30590l) {
            byteBufferSlice = AbstractC11531l.yandex(byteBufferSlice);
        }
        m4100default();
        byteBufferSlice.position();
        c13975l.getClass();
        while (byteBufferSlice.position() < iCrashlytics) {
            try {
                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                byteBufferSlice.position();
                c13975l.getClass();
                int i2 = C17500l.yandex;
                C4303l c4303l = new C4303l(this.f9508l, byteBufferSlice);
                mo1330native(c4303l.f1216l, c4303l);
            } catch (C5299l unused) {
                EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                int i3 = C17500l.yandex;
            } catch (C9999l unused2) {
                EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                byteBufferSlice.position();
                int i4 = C17500l.yandex;
            } catch (C6226l unused3) {
                EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
                int i5 = C17500l.yandex;
            } catch (C15266l unused4) {
                EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
                int i6 = C17500l.yandex;
            } catch (C11399l unused5) {
                EnumC8711l[] enumC8711lArr7 = EnumC8711l.f17925l;
                int i7 = C17500l.yandex;
            }
        }
        EnumC8711l[] enumC8711lArr8 = EnumC8711l.f17925l;
        this.f7146l.keySet().size();
        c13975l.getClass();
        int i8 = C17500l.yandex;
    }

    @Override // defpackage.AbstractC3348l
    /* JADX INFO: renamed from: strictfp */
    public final Comparator mo1333strictfp() {
        if (C10753l.f21786l == null) {
            C10753l.f21786l = new C10753l();
        }
        return C10753l.f21786l;
    }

    @Override // defpackage.AbstractC3348l
    /* JADX INFO: renamed from: switch */
    public final void mo1334switch(WritableByteChannel writableByteChannel, int i) throws IOException {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f30589l;
        c13975l.getClass();
        int i2 = C17500l.yandex;
        byte[] byteArray = m1324class().toByteArray();
        int length = byteArray.length;
        c13975l.getClass();
        C6356l.amazon();
        this.f30590l = false;
        int iLicense = i > 0 ? AbstractC3348l.license(byteArray.length + 10, i) - (byteArray.length + 10) : 0;
        writableByteChannel.write(m4102goto(iLicense, byteArray.length));
        writableByteChannel.write(ByteBuffer.wrap(byteArray));
        if (iLicense > 0) {
            writableByteChannel.write(ByteBuffer.wrap(new byte[iLicense]));
        }
    }

    @Override // defpackage.AbstractC3348l
    /* JADX INFO: renamed from: synchronized */
    public final AbstractC5232l mo1335synchronized() {
        return C6647l.admob();
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC8481l vip() {
        return C6647l.admob().isPro().keySet();
    }

    @Override // defpackage.AbstractC3348l, defpackage.InterfaceC15476l
    public final InterfaceC4656l yandex(EnumC17969l enumC17969l, String... strArr) {
        AbstractC6745l.loadAd(enumC17969l, "generickey");
        if (enumC17969l != EnumC17969l.GENRE) {
            return super.yandex(enumC17969l, strArr);
        }
        String str = (String) AbstractC6745l.amazon(strArr, "values");
        C4303l c4303lM4099static = m4099static((String) mo1331package(enumC17969l).f36009l);
        FrameBodyTCON frameBodyTCON = (FrameBodyTCON) c4303lM4099static.f5140l;
        frameBodyTCON.setV23Format();
        frameBodyTCON.setText(FrameBodyTCON.convertGenericToID3v22Genre(str));
        return c4303lM4099static;
    }

    public C15649l() {
        m4100default();
    }
}
