package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: lًْۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8233l {
    public static final C13975l loadAd;
    public InterfaceC9826l yandex = C3527l.yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        loadAd = new C13975l(4);
    }

    public static void crashlytics(File file, File file2, RandomAccessFile randomAccessFile, FileChannel fileChannel) throws C9511l {
        C13975l c13975l = loadAd;
        try {
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                long size = channel.size();
                long jTransferTo = 0;
                while (jTransferTo < size) {
                    FileChannel fileChannel2 = fileChannel;
                    jTransferTo += channel.transferTo(jTransferTo, 1048576L, fileChannel2);
                    fileChannel = fileChannel2;
                }
                randomAccessFile.setLength(size);
                channel.close();
                if (!file.exists() || file.delete()) {
                    return;
                }
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                c13975l.getClass();
                int i = C17500l.yandex;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (channel == null) {
                        throw th2;
                    }
                    try {
                        channel.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
            throw new C9511l(e, "New file %s does not exist", file);
        } catch (IOException e2) {
            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i3 = C17500l.yandex;
            throw new C9511l(e2, "Cannot make changes to file %s because unable to rename from temporary file %s", file2, file);
        }
    }

    public void amazon(C2925l c2925l) {
        File fileCreateTempFile;
        File file = c2925l.yandex;
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C13975l c13975l = loadAd;
        c13975l.getClass();
        int i = C17500l.yandex;
        AbstractC17238l abstractC17238lYandex = AbstractC17238l.yandex(c2925l.crashlytics);
        C13431l c13431l = C13431l.f26353l;
        InterfaceC15476l interfaceC15476l = (InterfaceC15476l) abstractC17238lYandex.purchase(c13431l);
        if (interfaceC15476l == c13431l) {
            throw new C9511l("Null tag");
        }
        if (interfaceC15476l.isEmpty()) {
            yandex(c2925l);
        } else {
            C6356l.amazon();
            if (file.length() <= 100) {
                c13975l.getClass();
                throw new C9511l("Cannot make changes to file %s because too small to be an audio file", file);
            }
        }
        if (c2925l instanceof C8014l) {
            c2925l.loadAd();
            return;
        }
        try {
            fileCreateTempFile = File.createTempFile(file.getName().replace('.', '_'), ".tmp", file.getParentFile());
        } catch (IOException e) {
            if (!e.getMessage().equals("File name too long") || file.getName().length() <= 50) {
                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i2 = C17500l.yandex;
                throw new C9511l("Cannot modify %s because do not have permissions to create files in the folder", file);
            }
            try {
                fileCreateTempFile = File.createTempFile(file.getName().substring(0, 50).replace('.', '_'), ".tmp", file.getParentFile());
            } catch (IOException unused) {
                EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i3 = C17500l.yandex;
                throw new C9511l("Cannot modify %s because do not have permissions to create files in the folder", file);
            }
        }
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(fileCreateTempFile, "rw");
            try {
                RandomAccessFile randomAccessFile3 = new RandomAccessFile(file, "rw");
                try {
                    try {
                        randomAccessFile3.seek(0L);
                        randomAccessFile2.seek(0L);
                        this.yandex.yandex(c2925l, false);
                        purchase(c2925l.crashlytics, randomAccessFile3, randomAccessFile2);
                        this.yandex.crashlytics(c2925l, fileCreateTempFile);
                        try {
                            randomAccessFile3.close();
                            randomAccessFile2.close();
                        } catch (IOException unused2) {
                            EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i4 = C17500l.yandex;
                        }
                        if (fileCreateTempFile.length() > 0) {
                            if (C6356l.amazon().ads) {
                                try {
                                    RandomAccessFile randomAccessFile4 = new RandomAccessFile(file, "rw");
                                    try {
                                        FileChannel channel = randomAccessFile4.getChannel();
                                        try {
                                            FileLock fileLockTryLock = channel.tryLock();
                                            try {
                                                if (fileLockTryLock == null) {
                                                    EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
                                                    c13975l.getClass();
                                                    int i5 = C17500l.yandex;
                                                    throw new C9511l("Cannot make changes to file %s because it is being used by another application", file);
                                                }
                                                crashlytics(fileCreateTempFile, file, randomAccessFile4, channel);
                                                fileLockTryLock.close();
                                                randomAccessFile4.close();
                                            } catch (Throwable th) {
                                                try {
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    if (fileLockTryLock != null) {
                                                        try {
                                                            fileLockTryLock.close();
                                                        } catch (Throwable th3) {
                                                            th.addSuppressed(th3);
                                                        }
                                                    }
                                                    throw th2;
                                                }
                                            }
                                        } catch (IOException e2) {
                                            EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
                                            c13975l.getClass();
                                            int i6 = C17500l.yandex;
                                            if (!"Operation not supported".equals(e2.getMessage())) {
                                                throw new C9511l(e2, "Cannot make changes to file %s because it is being used by another application", file);
                                            }
                                            crashlytics(fileCreateTempFile, file, randomAccessFile4, channel);
                                        } catch (Exception e3) {
                                            EnumC8711l[] enumC8711lArr7 = EnumC8711l.f17925l;
                                            c13975l.getClass();
                                            int i7 = C17500l.yandex;
                                            throw new C9511l(e3, "Cannot make changes to file %s because it is being used by another application", file);
                                        }
                                    } catch (Throwable th4) {
                                        try {
                                            throw th4;
                                        } catch (Throwable th5) {
                                            try {
                                                randomAccessFile4.close();
                                            } catch (Throwable th6) {
                                                th4.addSuppressed(th6);
                                            }
                                            throw th5;
                                        }
                                    }
                                } catch (FileNotFoundException e4) {
                                    EnumC8711l[] enumC8711lArr8 = EnumC8711l.f17925l;
                                    c13975l.getClass();
                                    int i8 = C17500l.yandex;
                                    throw new C9511l(e4, "Cannot make changes to file %s because the file cannot be found", file);
                                } catch (Exception e5) {
                                    EnumC8711l[] enumC8711lArr9 = EnumC8711l.f17925l;
                                    c13975l.getClass();
                                    int i9 = C17500l.yandex;
                                    throw new C9511l(e5, "Cannot make changes to file %s", file);
                                }
                            } else {
                                File file2 = new File(file.getAbsoluteFile().getParentFile().getPath(), AbstractC5578l.billing(file.getPath()).concat(".old"));
                                int i10 = 1;
                                while (file2.exists()) {
                                    file2 = new File(file.getAbsoluteFile().getParentFile().getPath(), AbstractC5578l.billing(file.getPath()) + ".old" + i10);
                                    i10++;
                                }
                                if (!AbstractC14375l.vip(file, file2)) {
                                    EnumC8711l[] enumC8711lArr10 = EnumC8711l.f17925l;
                                    c13975l.getClass();
                                    int i11 = C17500l.yandex;
                                    fileCreateTempFile.delete();
                                    throw new C9511l("Cannot make changes to file %s because unable to rename the original file to %s", file, file2);
                                }
                                if (!AbstractC14375l.vip(fileCreateTempFile, file)) {
                                    if (!fileCreateTempFile.exists()) {
                                        EnumC8711l[] enumC8711lArr11 = EnumC8711l.f17925l;
                                        c13975l.getClass();
                                        int i12 = C17500l.yandex;
                                    }
                                    if (!file2.renameTo(file)) {
                                        EnumC8711l[] enumC8711lArr12 = EnumC8711l.f17925l;
                                        c13975l.getClass();
                                        int i13 = C17500l.yandex;
                                    }
                                    EnumC8711l[] enumC8711lArr13 = EnumC8711l.f17925l;
                                    c13975l.getClass();
                                    int i14 = C17500l.yandex;
                                    throw new C9511l("Cannot make changes to file %s because unable to rename from temporary file %s", file, fileCreateTempFile);
                                }
                                if (!file2.delete()) {
                                    EnumC8711l[] enumC8711lArr14 = EnumC8711l.f17925l;
                                    c13975l.getClass();
                                    int i15 = C17500l.yandex;
                                }
                                if (fileCreateTempFile.exists() && !fileCreateTempFile.delete()) {
                                    EnumC8711l[] enumC8711lArr15 = EnumC8711l.f17925l;
                                    c13975l.getClass();
                                    int i16 = C17500l.yandex;
                                }
                            }
                        } else if (!fileCreateTempFile.delete()) {
                            EnumC8711l[] enumC8711lArr16 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i17 = C17500l.yandex;
                        }
                        this.yandex.loadAd(file);
                    } catch (Exception e6) {
                        EnumC8711l[] enumC8711lArr17 = EnumC8711l.f17925l;
                        c13975l.getClass();
                        int i18 = C17500l.yandex;
                        try {
                            randomAccessFile3.close();
                            randomAccessFile2.close();
                        } catch (IOException unused3) {
                            EnumC8711l[] enumC8711lArr18 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i19 = C17500l.yandex;
                        }
                        if (!fileCreateTempFile.delete()) {
                            c13975l.getClass();
                        }
                        throw new C9511l("Cannot make changes to file %s", file, e6);
                    }
                } catch (Throwable th7) {
                    try {
                        randomAccessFile3.close();
                        randomAccessFile2.close();
                    } catch (IOException unused4) {
                        EnumC8711l[] enumC8711lArr19 = EnumC8711l.f17925l;
                        c13975l.getClass();
                        int i20 = C17500l.yandex;
                    }
                    throw th7;
                }
            } catch (IOException unused5) {
                randomAccessFile = randomAccessFile2;
                EnumC8711l[] enumC8711lArr20 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i21 = C17500l.yandex;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused6) {
                        EnumC8711l[] enumC8711lArr21 = EnumC8711l.f17925l;
                        c13975l.getClass();
                        int i22 = C17500l.yandex;
                    }
                }
                if (!fileCreateTempFile.delete()) {
                    EnumC8711l[] enumC8711lArr22 = EnumC8711l.f17925l;
                    c13975l.getClass();
                    int i23 = C17500l.yandex;
                }
                throw new C9511l("Cannot modify %s because do not have permissions to modify file", file);
            }
        } catch (IOException unused7) {
        }
    }

    public abstract void loadAd(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2);

    public abstract void purchase(InterfaceC13280l interfaceC13280l, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2);

    /* JADX WARN: Code duplicated, block: B:102:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x011f A[Catch: Exception -> 0x0184, TryCatch #13 {Exception -> 0x0184, blocks: (B:62:0x011a, B:64:0x011f, B:65:0x0122, B:68:0x012c, B:70:0x0132, B:80:0x0150, B:81:0x0162, B:82:0x0163, B:83:0x0175, B:84:0x0176, B:86:0x017c), top: B:102:0x011a }] */
    /* JADX WARN: Code duplicated, block: B:67:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x0176 A[Catch: Exception -> 0x0184, TryCatch #13 {Exception -> 0x0184, blocks: (B:62:0x011a, B:64:0x011f, B:65:0x0122, B:68:0x012c, B:70:0x0132, B:80:0x0150, B:81:0x0162, B:82:0x0163, B:83:0x0175, B:84:0x0176, B:86:0x017c), top: B:102:0x011a }] */
    /* JADX WARN: Code duplicated, block: B:86:0x017c A[Catch: Exception -> 0x0184, TRY_LEAVE, TryCatch #13 {Exception -> 0x0184, blocks: (B:62:0x011a, B:64:0x011f, B:65:0x0122, B:68:0x012c, B:70:0x0132, B:80:0x0150, B:81:0x0162, B:82:0x0163, B:83:0x0175, B:84:0x0176, B:86:0x017c), top: B:102:0x011a }] */
    public void yandex(C2925l c2925l) throws Throwable {
        char c;
        File fileCreateTempFile;
        RandomAccessFile randomAccessFile;
        char c2;
        C13975l c13975l = loadAd;
        File file = c2925l.yandex;
        C6356l.amazon();
        if (file.length() <= 100) {
            throw new C9511l("Cannot write to file %s because too small to be an audio file", file);
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            c = 0;
            try {
                fileCreateTempFile = File.createTempFile(file.getName().replace('.', '_'), ".tmp", file.getParentFile());
                try {
                    randomAccessFile = new RandomAccessFile(fileCreateTempFile, "rw");
                    try {
                        RandomAccessFile randomAccessFile3 = new RandomAccessFile(file, "rw");
                        try {
                            randomAccessFile3.seek(0L);
                            randomAccessFile.seek(0L);
                            this.yandex.yandex(c2925l, true);
                            loadAd(randomAccessFile3, randomAccessFile);
                            this.yandex.crashlytics(c2925l, fileCreateTempFile);
                            try {
                                randomAccessFile3.close();
                                randomAccessFile.close();
                                if (fileCreateTempFile.length() > 0) {
                                    if (!file.delete()) {
                                        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                                        c13975l.getClass();
                                        int i = C17500l.yandex;
                                        throw new C9511l("Cannot make changes to file %s because unable to delete the original file ready for updating from temporary file %s", file, fileCreateTempFile);
                                    }
                                    if (!fileCreateTempFile.renameTo(file)) {
                                        EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                                        c13975l.getClass();
                                        int i2 = C17500l.yandex;
                                        throw new C9511l("Cannot make changes to file %s because unable to rename from temporary file %s", file, fileCreateTempFile);
                                    }
                                    try {
                                        if (fileCreateTempFile.exists() && !fileCreateTempFile.delete()) {
                                            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                                            c13975l.getClass();
                                            int i3 = C17500l.yandex;
                                        }
                                        file = fileCreateTempFile;
                                    } catch (Exception unused) {
                                        file = fileCreateTempFile;
                                        EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                                        c13975l.getClass();
                                        int i4 = C17500l.yandex;
                                    }
                                } else if (!fileCreateTempFile.delete()) {
                                    EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
                                    c13975l.getClass();
                                    int i5 = C17500l.yandex;
                                }
                            } catch (Exception unused2) {
                            }
                            this.yandex.loadAd(file);
                        } catch (Exception e) {
                            e = e;
                            randomAccessFile2 = randomAccessFile3;
                            try {
                                throw new C9511l("\"" + file.getAbsolutePath() + "\" :" + e, e);
                            } catch (Throwable th) {
                                th = th;
                                c2 = 1;
                                if (randomAccessFile2 != null) {
                                    try {
                                        randomAccessFile2.close();
                                        if (randomAccessFile != null) {
                                            randomAccessFile.close();
                                        }
                                        if (fileCreateTempFile.length() > 0 || c2 != 0) {
                                            if (!fileCreateTempFile.delete()) {
                                                EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
                                                c13975l.getClass();
                                                int i6 = C17500l.yandex;
                                            }
                                        } else {
                                            if (!file.delete()) {
                                                EnumC8711l[] enumC8711lArr7 = EnumC8711l.f17925l;
                                                c13975l.getClass();
                                                int i7 = C17500l.yandex;
                                                Object[] objArr = new Object[2];
                                                objArr[c] = file;
                                                objArr[1] = fileCreateTempFile;
                                                throw new C9511l("Cannot make changes to file %s because unable to delete the original file ready for updating from temporary file %s", objArr);
                                            }
                                            if (!fileCreateTempFile.renameTo(file)) {
                                                EnumC8711l[] enumC8711lArr8 = EnumC8711l.f17925l;
                                                c13975l.getClass();
                                                int i8 = C17500l.yandex;
                                                Object[] objArr2 = new Object[2];
                                                objArr2[c] = file;
                                                objArr2[1] = fileCreateTempFile;
                                                throw new C9511l("Cannot make changes to file %s because unable to rename from temporary file %s", objArr2);
                                            }
                                            try {
                                                if (fileCreateTempFile.exists() && !fileCreateTempFile.delete()) {
                                                    EnumC8711l[] enumC8711lArr9 = EnumC8711l.f17925l;
                                                    c13975l.getClass();
                                                    int i9 = C17500l.yandex;
                                                }
                                                file = fileCreateTempFile;
                                            } catch (Exception unused3) {
                                                file = fileCreateTempFile;
                                                EnumC8711l[] enumC8711lArr10 = EnumC8711l.f17925l;
                                                c13975l.getClass();
                                                int i10 = C17500l.yandex;
                                                this.yandex.loadAd(file);
                                                throw th;
                                            }
                                        }
                                    } catch (Exception unused4) {
                                        EnumC8711l[] enumC8711lArr11 = EnumC8711l.f17925l;
                                        c13975l.getClass();
                                        int i11 = C17500l.yandex;
                                        this.yandex.loadAd(file);
                                        throw th;
                                    }
                                } else {
                                    if (randomAccessFile != null) {
                                        randomAccessFile.close();
                                    }
                                    if (fileCreateTempFile.length() > 0) {
                                        if (!fileCreateTempFile.delete()) {
                                            EnumC8711l[] enumC8711lArr12 = EnumC8711l.f17925l;
                                            c13975l.getClass();
                                            int i12 = C17500l.yandex;
                                        }
                                    } else if (!fileCreateTempFile.delete()) {
                                        EnumC8711l[] enumC8711lArr13 = EnumC8711l.f17925l;
                                        c13975l.getClass();
                                        int i13 = C17500l.yandex;
                                    }
                                }
                                this.yandex.loadAd(file);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            randomAccessFile2 = randomAccessFile3;
                            c2 = c;
                            if (randomAccessFile2 != null) {
                                randomAccessFile2.close();
                                if (randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                                if (fileCreateTempFile.length() > 0) {
                                    if (!fileCreateTempFile.delete()) {
                                        EnumC8711l[] enumC8711lArr14 = EnumC8711l.f17925l;
                                        c13975l.getClass();
                                        int i14 = C17500l.yandex;
                                    }
                                } else if (!fileCreateTempFile.delete()) {
                                    EnumC8711l[] enumC8711lArr15 = EnumC8711l.f17925l;
                                    c13975l.getClass();
                                    int i15 = C17500l.yandex;
                                }
                            } else {
                                if (randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                                if (fileCreateTempFile.length() > 0) {
                                    if (!fileCreateTempFile.delete()) {
                                        EnumC8711l[] enumC8711lArr16 = EnumC8711l.f17925l;
                                        c13975l.getClass();
                                        int i16 = C17500l.yandex;
                                    }
                                } else if (!fileCreateTempFile.delete()) {
                                    EnumC8711l[] enumC8711lArr17 = EnumC8711l.f17925l;
                                    c13975l.getClass();
                                    int i17 = C17500l.yandex;
                                }
                            }
                            this.yandex.loadAd(file);
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e3) {
                    e = e3;
                    randomAccessFile = null;
                } catch (Throwable th4) {
                    th = th4;
                    randomAccessFile = null;
                }
            } catch (Exception e4) {
                e = e4;
                fileCreateTempFile = null;
                randomAccessFile = null;
                throw new C9511l("\"" + file.getAbsolutePath() + "\" :" + e, e);
            } catch (Throwable th5) {
                th = th5;
                fileCreateTempFile = null;
                randomAccessFile = null;
                c2 = c;
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    if (fileCreateTempFile.length() > 0) {
                        if (!fileCreateTempFile.delete()) {
                            EnumC8711l[] enumC8711lArr18 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i18 = C17500l.yandex;
                        }
                    } else if (!fileCreateTempFile.delete()) {
                        EnumC8711l[] enumC8711lArr19 = EnumC8711l.f17925l;
                        c13975l.getClass();
                        int i19 = C17500l.yandex;
                    }
                } else {
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    if (fileCreateTempFile.length() > 0) {
                        if (!fileCreateTempFile.delete()) {
                            EnumC8711l[] enumC8711lArr110 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i110 = C17500l.yandex;
                        }
                    } else if (!fileCreateTempFile.delete()) {
                        EnumC8711l[] enumC8711lArr111 = EnumC8711l.f17925l;
                        c13975l.getClass();
                        int i111 = C17500l.yandex;
                    }
                }
                this.yandex.loadAd(file);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            c = 0;
        } catch (Throwable th6) {
            th = th6;
            c = 0;
        }
    }
}
