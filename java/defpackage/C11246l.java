package defpackage;

import ealvatag.tag.id3.framebody.FrameBodyTCON;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: renamed from: lُۖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11246l extends AbstractC3348l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public static final int f22639l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public static final int f22640l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public static final int f22641l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public static final C13975l f22642l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public static final int f22643l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public static final int f22644l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public static final int f22645l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public static final int f22646l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public byte f22647l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public int f22648l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public boolean f22649l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public boolean f22650l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public boolean f22651l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f22652l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public byte f22653l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public boolean f22654l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public byte f22655l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public byte f22656l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public byte f22657l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f22658l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f22659l;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        f22642l = new C13975l(4);
        f22645l = 6;
        f22639l = 1;
        f22646l = 6;
        f22641l = 2;
        f22643l = 5;
        f22644l = 1;
        f22640l = 1;
    }

    public C11246l(C0869l c0869l, C9037l c9037l, String str, boolean z) throws C17436l {
        C13975l c13975l;
        this.f22658l = false;
        this.f22652l = false;
        this.f22650l = false;
        this.f22649l = false;
        this.f22648l = 0;
        this.f22659l = false;
        this.f22651l = false;
        this.f22654l = false;
        this.f22656l = (byte) 0;
        this.f22647l = (byte) 0;
        this.f22653l = (byte) 0;
        this.f22655l = (byte) 0;
        this.f22657l = (byte) 0;
        m3055static();
        this.f9508l = str;
        m3053default(c9037l.loadAd);
        if (this.f22650l) {
            try {
                int i = c0869l.readInt();
                if (i <= f22645l) {
                    Locale.getDefault();
                    throw new C17436l(this.f9508l + " Invalid Extended Header Size of " + i + " is too smal to be valid");
                }
                c0869l.readByte();
                byte b = c0869l.readByte();
                boolean z2 = (b & 64) != 0;
                this.f22651l = z2;
                this.f22658l = (b & 32) != 0;
                this.f22654l = (b & 16) != 0;
                if (z2) {
                    c0869l.readByte();
                }
                if (this.f22658l) {
                    c0869l.readByte();
                    this.f22648l = 0;
                    for (int i2 = 0; i2 < f22643l; i2++) {
                        int i3 = this.f22648l << 8;
                        this.f22648l = i3;
                        this.f22648l = i3 + c0869l.readByte();
                    }
                }
                if (this.f22654l) {
                    c0869l.readByte();
                    byte b2 = c0869l.readByte();
                    this.f22653l = (byte) ((b2 & (-64)) >> 6);
                    this.f22655l = (byte) ((b2 & 32) >> 5);
                    this.f22657l = (byte) ((b2 & 24) >> 3);
                    this.f22656l = (byte) ((b2 & 4) >> 2);
                    this.f22647l = (byte) (b2 & 6);
                }
            } catch (EOFException e) {
                throw new C17436l(e);
            }
        }
        m3055static();
        while (true) {
            long j = c0869l.f2526l;
            c13975l = f22642l;
            if (j <= 0) {
                break;
            }
            try {
                C11204l c11204l = new C11204l(c0869l, this.f9508l, z);
                if (z && AbstractC0231l.ad(c11204l.f1216l)) {
                    this.f9509l = true;
                } else {
                    mo1330native(c11204l.f1216l, c11204l);
                }
            } catch (IOException unused) {
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                c13975l.getClass();
                int i4 = C17500l.yandex;
            } catch (C9999l unused2) {
                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i5 = C17500l.yandex;
            } catch (C6226l unused3) {
                EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i6 = C17500l.yandex;
            } catch (C15266l unused4) {
                EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i7 = C17500l.yandex;
            } catch (C11399l unused5) {
                EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i8 = C17500l.yandex;
            } catch (C17436l unused6) {
                EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i9 = C17500l.yandex;
            }
        }
        EnumC8711l[] enumC8711lArr7 = EnumC8711l.f17925l;
        this.f7146l.keySet().size();
        c13975l.getClass();
        int i10 = C17500l.yandex;
    }

    @Override // defpackage.AbstractC4674l
    public final byte Signature() {
        return (byte) 4;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m3053default(byte b) {
        this.f22649l = (b & 128) != 0;
        this.f22650l = (b & 64) != 0;
        this.f22652l = (b & 32) != 0;
        this.f22659l = (b & 16) != 0;
        int i = b & 8;
        C13975l c13975l = f22642l;
        if (i != 0) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
        }
        if ((b & 4) != 0) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i3 = C17500l.yandex;
        }
        if ((b & 2) != 0) {
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i4 = C17500l.yandex;
        }
        if ((b & 1) != 0) {
            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i5 = C17500l.yandex;
        }
        if (this.f22649l) {
            EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i6 = C17500l.yandex;
        }
        if (this.f22650l) {
            EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i7 = C17500l.yandex;
        }
        if (this.f22652l) {
            EnumC8711l[] enumC8711lArr7 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i8 = C17500l.yandex;
        }
        if (this.f22659l) {
            EnumC8711l[] enumC8711lArr8 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i9 = C17500l.yandex;
        }
    }

    @Override // defpackage.AbstractC3348l
    /* JADX INFO: renamed from: else */
    public final long mo1326else(File file, long j) throws Throwable {
        this.f9508l = file.getName();
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        f22642l.getClass();
        int i = C17500l.yandex;
        byte[] byteArray = m1324class().toByteArray();
        int iLicense = AbstractC3348l.license(byteArray.length + 10, (int) j);
        int length = iLicense - (byteArray.length + 10);
        m1325continue(file, m3054final(length, byteArray.length), byteArray, length, iLicense, j);
        return iLicense;
    }

    @Override // defpackage.AbstractC3348l, defpackage.AbstractC4674l
    public final boolean equals(Object obj) {
        if (!(obj instanceof C11246l)) {
            return false;
        }
        C11246l c11246l = (C11246l) obj;
        return this.f22659l == c11246l.f22659l && this.f22656l == c11246l.f22656l && this.f22647l == c11246l.f22647l && this.f22654l == c11246l.f22654l && this.f22653l == c11246l.f22653l && this.f22655l == c11246l.f22655l && this.f22657l == c11246l.f22657l && this.f22651l == c11246l.f22651l && super.equals(obj);
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final ByteBuffer m3054final(int i, int i2) {
        int i3;
        ByteBuffer byteBufferAllocate;
        this.f22649l = false;
        this.f22650l = false;
        this.f22652l = false;
        this.f22659l = false;
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(10);
        byteBufferAllocate2.put(AbstractC3348l.f7141l);
        byteBufferAllocate2.put((byte) 4);
        byteBufferAllocate2.put((byte) 0);
        byte b = this.f22649l ? (byte) -128 : (byte) 0;
        if (this.f22650l) {
            b = (byte) (b | 64);
        }
        if (this.f22652l) {
            b = (byte) (b | 32);
        }
        if (this.f22659l) {
            b = (byte) (b | 16);
        }
        byteBufferAllocate2.put(b);
        boolean z = this.f22650l;
        int i4 = f22641l;
        int i5 = f22646l;
        int i6 = f22639l;
        int i7 = f22645l;
        if (z) {
            i3 = this.f22651l ? i7 + i6 : i7;
            if (this.f22658l) {
                i3 += i5;
            }
            if (this.f22654l) {
                i3 += i4;
            }
        } else {
            i3 = 0;
        }
        byteBufferAllocate2.put(AbstractC17265l.admob(i + i2 + i3));
        if (this.f22650l) {
            if (this.f22651l) {
                i7 += i6;
            }
            if (this.f22658l) {
                i7 += i5;
            }
            if (this.f22654l) {
                i7 += i4;
            }
            byteBufferAllocate = ByteBuffer.allocate(i7);
            byteBufferAllocate.putInt(i7);
            byteBufferAllocate.put((byte) f22640l);
            byte b2 = this.f22651l ? (byte) 64 : (byte) 0;
            if (this.f22658l) {
                b2 = (byte) (b2 | 32);
            }
            if (this.f22654l) {
                b2 = (byte) (b2 | 16);
            }
            byteBufferAllocate.put(b2);
            if (this.f22651l) {
                byteBufferAllocate.put((byte) 0);
            }
            if (this.f22658l) {
                byteBufferAllocate.put((byte) f22643l);
                byteBufferAllocate.put((byte) 0);
                byteBufferAllocate.putInt(this.f22648l);
            }
            if (this.f22654l) {
                byteBufferAllocate.put((byte) f22644l);
                byteBufferAllocate.put((byte) 0);
            }
        } else {
            byteBufferAllocate = null;
        }
        if (byteBufferAllocate != null) {
            byteBufferAllocate.flip();
            byteBufferAllocate2.put(byteBufferAllocate);
        }
        byteBufferAllocate2.flip();
        return byteBufferAllocate2;
    }

    @Override // defpackage.AbstractC3348l, defpackage.AbstractC18219l
    public final int getSize() {
        int i = 10;
        if (this.f22650l) {
            int i2 = f22645l + 10;
            if (this.f22651l) {
                i2 += f22639l;
            }
            if (this.f22658l) {
                i2 += f22646l;
            }
            i = i2;
            if (this.f22654l) {
                i += f22641l;
            }
        }
        int size = i + super.getSize();
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        f22642l.getClass();
        int i3 = C17500l.yandex;
        return size;
    }

    @Override // defpackage.AbstractC3348l
    /* JADX INFO: renamed from: package */
    public final C18449l mo1331package(EnumC17969l enumC17969l) {
        EnumC4724l enumC4724l = (EnumC4724l) C6647l.subs().firebase().get(enumC17969l);
        if (enumC4724l != null) {
            return new C18449l(enumC17969l, enumC4724l.f9738l, enumC4724l.f9737l, 3);
        }
        throw new C6451l(enumC17969l.name(), 18, (byte) 0);
    }

    @Override // defpackage.AbstractC3348l
    public final AbstractC0231l pro(String str) {
        C11204l c11204l = new C11204l(str);
        c11204l.f1215l = new C4415l();
        c11204l.f1219l = new C10686l(c11204l);
        return c11204l;
    }

    @Override // defpackage.AbstractC3348l, defpackage.InterfaceC15476l
    public final AbstractC17238l purchase(EnumC17969l enumC17969l) {
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        if (enumC17969l != EnumC17969l.GENRE) {
            return super.purchase(enumC17969l);
        }
        AbstractC1186l abstractC1186lCrashlytics = crashlytics(enumC17969l);
        return (abstractC1186lCrashlytics == null || abstractC1186lCrashlytics.size() <= 0) ? C1972l.f4482l : AbstractC17238l.amazon(FrameBodyTCON.convertID3v24GenreToGeneric(((FrameBodyTCON) ((AbstractC0231l) abstractC1186lCrashlytics.get(0)).f5140l).getValues().get(0)));
    }

    @Override // defpackage.AbstractC18219l
    public final void read(ByteBuffer byteBuffer) throws C2804l, C17436l {
        if (!m1323catch(byteBuffer)) {
            throw new C2804l(AbstractC0653l.ads(new StringBuilder(), this.f9508l, ":ID3v2.40 tag not found"));
        }
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = f22642l;
        c13975l.getClass();
        int i = C17500l.yandex;
        m3053default(byteBuffer.get());
        int iCrashlytics = AbstractC17265l.crashlytics(byteBuffer);
        c13975l.getClass();
        if (this.f22650l) {
            int i2 = byteBuffer.getInt();
            if (i2 <= f22645l) {
                Locale.getDefault();
                throw new C17436l(this.f9508l + " Invalid Extended Header Size of " + i2 + " is too smal to be valid");
            }
            byteBuffer.get();
            byte b = byteBuffer.get();
            boolean z = (b & 64) != 0;
            this.f22651l = z;
            this.f22658l = (b & 32) != 0;
            this.f22654l = (b & 16) != 0;
            if (z) {
                byteBuffer.get();
            }
            if (this.f22658l) {
                byteBuffer.get();
                int i3 = f22643l;
                byte[] bArr = new byte[i3];
                byteBuffer.get(bArr, 0, i3);
                this.f22648l = 0;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = this.f22648l << 8;
                    this.f22648l = i5;
                    this.f22648l = i5 + bArr[i4];
                }
            }
            if (this.f22654l) {
                byteBuffer.get();
                byte[] bArr2 = new byte[1];
                byteBuffer.get(bArr2, 0, 1);
                byte b2 = bArr2[0];
                this.f22653l = (byte) ((b2 & (-64)) >> 6);
                this.f22655l = (byte) ((b2 & 32) >> 5);
                this.f22657l = (byte) ((b2 & 24) >> 3);
                this.f22656l = (byte) ((b2 & 4) >> 2);
                this.f22647l = (byte) (b2 & 6);
            }
        }
        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
        byteBuffer.position();
        c13975l.getClass();
        int i6 = C17500l.yandex;
        m3055static();
        byteBuffer.position();
        while (byteBuffer.position() <= iCrashlytics) {
            try {
                EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                byteBuffer.position();
                c13975l.getClass();
                int i7 = C17500l.yandex;
                C11204l c11204l = new C11204l(this.f9508l, byteBuffer);
                mo1330native(c11204l.f1216l, c11204l);
            } catch (C5299l e) {
                EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                e.getMessage();
                int i8 = C17500l.yandex;
            } catch (C9999l unused) {
                EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
                byteBuffer.position();
                int i9 = C17500l.yandex;
                return;
            } catch (C6226l unused2) {
                EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
                int i10 = C17500l.yandex;
                return;
            } catch (C15266l unused3) {
                EnumC8711l[] enumC8711lArr7 = EnumC8711l.f17925l;
                int i11 = C17500l.yandex;
            } catch (C11399l unused4) {
                EnumC8711l[] enumC8711lArr8 = EnumC8711l.f17925l;
                int i12 = C17500l.yandex;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final void m3055static() {
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
    /* JADX INFO: renamed from: strictfp */
    public final Comparator mo1333strictfp() {
        if (C6607l.f13847l == null) {
            C6607l.f13847l = new C6607l();
        }
        return C6607l.f13847l;
    }

    @Override // defpackage.AbstractC3348l
    /* JADX INFO: renamed from: switch */
    public final void mo1334switch(WritableByteChannel writableByteChannel, int i) throws IOException {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        f22642l.getClass();
        int i2 = C17500l.yandex;
        byte[] byteArray = m1324class().toByteArray();
        int iLicense = i > 0 ? AbstractC3348l.license(byteArray.length + 10, i) - (byteArray.length + 10) : 0;
        writableByteChannel.write(m3054final(iLicense, byteArray.length));
        writableByteChannel.write(ByteBuffer.wrap(byteArray));
        if (iLicense > 0) {
            writableByteChannel.write(ByteBuffer.wrap(new byte[iLicense]));
        }
    }

    @Override // defpackage.AbstractC3348l
    /* JADX INFO: renamed from: synchronized */
    public final AbstractC5232l mo1335synchronized() {
        return C6647l.subs();
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC8481l vip() {
        return C6647l.subs().firebase().keySet();
    }

    @Override // defpackage.AbstractC3348l, defpackage.InterfaceC15476l
    public final InterfaceC4656l yandex(EnumC17969l enumC17969l, String... strArr) {
        AbstractC6745l.loadAd(enumC17969l, "genericKey");
        if (enumC17969l != EnumC17969l.GENRE) {
            return super.yandex(enumC17969l, strArr);
        }
        String str = (String) AbstractC6745l.amazon(strArr, "value");
        C11204l c11204l = new C11204l((String) mo1331package(enumC17969l).f36009l);
        c11204l.f1215l = new C4415l();
        c11204l.f1219l = new C10686l(c11204l);
        FrameBodyTCON frameBodyTCON = (FrameBodyTCON) c11204l.f5140l;
        C6356l.amazon();
        frameBodyTCON.setText(FrameBodyTCON.convertGenericToID3v24Genre(str));
        return c11204l;
    }

    public C11246l(ByteBuffer byteBuffer) throws C2804l, C17436l {
        this.f22658l = false;
        this.f22652l = false;
        this.f22650l = false;
        this.f22649l = false;
        this.f22648l = 0;
        this.f22659l = false;
        this.f22651l = false;
        this.f22654l = false;
        this.f22656l = (byte) 0;
        this.f22647l = (byte) 0;
        this.f22653l = (byte) 0;
        this.f22655l = (byte) 0;
        this.f22657l = (byte) 0;
        m3055static();
        this.f9508l = "";
        read(byteBuffer);
    }

    public C11246l() {
        this.f22658l = false;
        this.f22652l = false;
        this.f22650l = false;
        this.f22649l = false;
        this.f22648l = 0;
        this.f22659l = false;
        this.f22651l = false;
        this.f22654l = false;
        this.f22656l = (byte) 0;
        this.f22647l = (byte) 0;
        this.f22653l = (byte) 0;
        this.f22655l = (byte) 0;
        this.f22657l = (byte) 0;
        m3055static();
    }
}
