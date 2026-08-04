package defpackage;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Locale;

/* JADX INFO: renamed from: lًُٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8014l extends C2925l {
    public static final C13975l mopub;
    public C11975l billing;
    public AbstractC3348l purchase;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        mopub = new C13975l(4);
    }

    public static AbstractC17238l purchase(C10111l c10111l) throws EOFException {
        C0869l c0869l = new C0869l();
        c10111l.applovin(0L, 10L, c0869l);
        byte[] bArr = AbstractC3348l.f7141l;
        c0869l.subscription(10L);
        int i = 0;
        while (true) {
            byte[] bArr2 = AbstractC3348l.f7141l;
            if (i >= 3) {
                byte b = c0869l.readByte();
                c0869l.readByte();
                byte b2 = c0869l.readByte();
                int iLoadAd = AbstractC17265l.loadAd(c0869l);
                C9037l c9037l = new C9037l();
                c9037l.yandex = b;
                c9037l.loadAd = b2;
                c9037l.crashlytics = iLoadAd;
                return new C13464l(c9037l);
            }
            if (c0869l.readByte() != bArr2[i]) {
                return C1972l.f4482l;
            }
            i++;
        }
    }

    public final C0153l amazon(C10111l c10111l, long j, C0153l c0153l, String str) throws Throwable {
        FileInputStream fileInputStream;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        AbstractC6419l.admob(j);
        AbstractC6419l.admob(c0153l.purchase);
        C13975l c13975l = mopub;
        c13975l.getClass();
        int i = C17500l.yandex;
        C0153l c0153l2 = new C0153l(c10111l, 0L, str);
        c13975l.getClass();
        long j2 = c0153l.purchase;
        long j3 = c0153l2.purchase;
        if (j2 == j3) {
            AbstractC6419l.admob(j3);
            c13975l.getClass();
            return c0153l;
        }
        AbstractC6419l.admob(j3);
        c13975l.getClass();
        long j4 = c0153l.admob;
        long j5 = c0153l2.admob;
        if (j4 == j5) {
            AbstractC6419l.admob(c0153l2.purchase);
            c13975l.getClass();
            return c0153l2;
        }
        int i2 = (int) j;
        int i3 = (int) c0153l.purchase;
        AbstractC6419l.mopub(i2);
        AbstractC6419l.mopub(i3);
        c13975l.getClass();
        FileChannel channel = null;
        try {
            fileInputStream = new FileInputStream(this.yandex);
            try {
                channel = fileInputStream.getChannel();
                channel.position(i2);
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i3 - i2);
                channel.read(byteBufferAllocateDirect);
                while (byteBufferAllocateDirect.hasRemaining()) {
                    if (byteBufferAllocateDirect.get() != 0) {
                        channel.close();
                        fileInputStream.close();
                        C0153l c0153l3 = new C0153l(c10111l, c0153l2.purchase + ((long) c0153l2.yandex.yandex()), str);
                        long j6 = c0153l3.purchase;
                        long j7 = c0153l.purchase;
                        if (j6 == j7) {
                            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                            AbstractC6419l.admob(j7);
                            c13975l.getClass();
                            int i4 = C17500l.yandex;
                            return c0153l;
                        }
                        if (c0153l3.admob == j5) {
                            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                            AbstractC6419l.admob(c0153l2.purchase);
                            c13975l.getClass();
                            int i5 = C17500l.yandex;
                            return c0153l2;
                        }
                        EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                        AbstractC6419l.admob(j7);
                        c13975l.getClass();
                        int i6 = C17500l.yandex;
                        return c0153l;
                    }
                }
                channel.close();
                fileInputStream.close();
                return c0153l;
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    channel.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public final void billing(C10111l c10111l, String str) throws IOException {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = mopub;
        c13975l.getClass();
        int i = C17500l.yandex;
        try {
            C10401l c10401l = new C10401l();
            c10401l.f21223l = (byte) 0;
            FileChannel fileChannel = (FileChannel) c10111l.f20589l;
            c10401l.f9508l = str;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(128);
            fileChannel.position(fileChannel.size() - 128);
            fileChannel.read(byteBufferAllocate);
            byteBufferAllocate.flip();
            c10401l.read(byteBufferAllocate);
            this.billing = c10401l;
        } catch (C2804l unused) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
        }
        try {
            if (this.billing == null) {
                this.billing = new C11975l(c10111l, str);
            }
        } catch (C2804l unused2) {
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i3 = C17500l.yandex;
        }
    }

    @Override // defpackage.C2925l
    public final InterfaceC13280l crashlytics(InterfaceC15476l interfaceC15476l) {
        this.crashlytics = (InterfaceC13280l) interfaceC15476l;
        if (interfaceC15476l instanceof C11975l) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            mopub.getClass();
            int i = C17500l.yandex;
            this.billing = (C11975l) interfaceC15476l;
        } else {
            this.purchase = (AbstractC3348l) interfaceC15476l;
        }
        return this.crashlytics;
    }

    @Override // defpackage.C2925l
    public final void loadAd() throws C9511l {
        try {
            mopub();
        } catch (C15776l e) {
            throw new C9880l(e);
        } catch (IOException | AbstractC4923l e2) {
            throw new C9511l(e2);
        }
    }

    public final void mopub() throws Throwable {
        File absoluteFile = this.yandex.getAbsoluteFile();
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = mopub;
        c13975l.getClass();
        int i = C17500l.yandex;
        if (!absoluteFile.exists()) {
            Locale.getDefault();
            C18262l.metrica(AbstractC15560l.Signature("Cannot make changes to file ", absoluteFile.getName(), " because the file cannot be found"));
            return;
        }
        C6356l.amazon();
        if (absoluteFile.length() <= 150) {
            absoluteFile.getName();
            Locale.getDefault();
            C18262l.metrica(AbstractC15560l.Signature("Cannot make changes to file ", absoluteFile.getName(), " because too small to be an audio file"));
            return;
        }
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                if (C6356l.amazon().smaato) {
                    if (this.purchase == null) {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(absoluteFile, "rw");
                        try {
                            new C11246l().ad(randomAccessFile2);
                            new C9553l().ad(randomAccessFile2);
                            new C15649l().ad(randomAccessFile2);
                            c13975l.getClass();
                            randomAccessFile2.close();
                        } catch (FileNotFoundException e) {
                            e = e;
                            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i2 = C17500l.yandex;
                            throw e;
                        } catch (IOException e2) {
                            e = e2;
                            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i3 = C17500l.yandex;
                            throw e;
                        } catch (RuntimeException e3) {
                            e = e3;
                            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i4 = C17500l.yandex;
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            randomAccessFile = randomAccessFile2;
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                            throw th;
                        }
                    } else {
                        c13975l.getClass();
                        C0153l c0153l = (C0153l) this.loadAd;
                        long j = c0153l.purchase;
                        long jMo1326else = this.purchase.mo1326else(absoluteFile, j);
                        if (j != jMo1326else) {
                            c13975l.getClass();
                            c0153l.purchase = jMo1326else;
                        }
                    }
                }
                RandomAccessFile randomAccessFile3 = new RandomAccessFile(absoluteFile, "rw");
                C6356l.amazon();
                if (C6356l.amazon().purchase) {
                    c13975l.getClass();
                    if (this.billing == null) {
                        c13975l.getClass();
                        new C11975l().license(randomAccessFile3);
                    } else {
                        c13975l.getClass();
                        this.billing.premium(randomAccessFile3);
                    }
                }
                randomAccessFile3.close();
            } catch (FileNotFoundException e4) {
                e = e4;
            } catch (IOException e5) {
                e = e5;
            } catch (RuntimeException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.C2925l
    public final InterfaceC15476l yandex() {
        return C6356l.crashlytics();
    }
}
