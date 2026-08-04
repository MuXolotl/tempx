package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: lٗؒٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16847l extends AbstractC8233l {
    public static final C13975l crashlytics;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        crashlytics = new C13975l(4);
    }

    @Override // defpackage.AbstractC8233l
    public final void amazon(C2925l c2925l) throws C9511l {
        C13975l c13975l = crashlytics;
        File file = c2925l.yandex;
        C6356l.amazon();
        if (file.length() <= 100) {
            throw new C9511l("Cannot write to file %s because too small to be an audio file", file);
        }
        try {
            FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
            try {
                mopub(c2925l.crashlytics, channel, file.getAbsolutePath());
                if (channel != null) {
                    channel.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (FileNotFoundException e) {
            if (file.exists()) {
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                c13975l.getClass();
                int i = C17500l.yandex;
                throw new C9880l(e, "Cannot modify %s because do not have permissions to modify file", file);
            }
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
            throw new C9511l(e, "Cannot make changes to file %s because the file cannot be found", file);
        } catch (IOException e2) {
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i3 = C17500l.yandex;
            throw new C9511l(e2);
        }
    }

    public abstract void billing(FileChannel fileChannel, String str);

    @Override // defpackage.AbstractC8233l
    public final void loadAd(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        throw new UnsupportedOperationException("Old method not used in version 2");
    }

    public abstract void mopub(InterfaceC13280l interfaceC13280l, FileChannel fileChannel, String str);

    @Override // defpackage.AbstractC8233l
    public final void purchase(InterfaceC13280l interfaceC13280l, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        throw new UnsupportedOperationException("Old method not used in version 2");
    }

    @Override // defpackage.AbstractC8233l
    public final void yandex(C2925l c2925l) throws C9511l {
        File file = c2925l.yandex;
        C6356l.amazon();
        if (file.length() <= 100) {
            throw new C9511l("Cannot write to file %s because too small to be an audio file", file);
        }
        try {
            FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
            try {
                billing(channel, file.getAbsolutePath());
                if (channel != null) {
                    channel.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (IOException e) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            crashlytics.getClass();
            int i = C17500l.yandex;
            throw new C9511l(e, "Cannot delete file %s because not writable", file);
        }
    }
}
