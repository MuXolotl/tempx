package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؚؗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4732l {
    public static final C16367l yandex = new C16367l(7);

    /* JADX WARN: Code duplicated, block: B:108:0x01a4 A[Catch: all -> 0x01ba, TRY_LEAVE, TryCatch #18 {all -> 0x01ba, blocks: (B:106:0x0197, B:108:0x01a4, B:119:0x01bd, B:120:0x01c2), top: B:293:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01bd A[Catch: all -> 0x01ba, TRY_ENTER, TryCatch #18 {all -> 0x01ba, blocks: (B:106:0x0197, B:108:0x01a4, B:119:0x01bd, B:120:0x01c2), top: B:293:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ce A[Catch: IllegalStateException -> 0x01b3, IOException -> 0x01b6, FileNotFoundException -> 0x01b8, TRY_LEAVE, TryCatch #38 {FileNotFoundException -> 0x01b8, IOException -> 0x01b6, IllegalStateException -> 0x01b3, blocks: (B:104:0x018f, B:109:0x01ae, B:127:0x01ce, B:125:0x01cb, B:124:0x01c8), top: B:321:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:134:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:144:0x020e A[Catch: all -> 0x021d, TRY_LEAVE, TryCatch #39 {all -> 0x021d, blocks: (B:142:0x0202, B:144:0x020e, B:153:0x0220), top: B:317:0x0202, outer: #37 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0220 A[Catch: all -> 0x021d, TRY_ENTER, TRY_LEAVE, TryCatch #39 {all -> 0x021d, blocks: (B:142:0x0202, B:144:0x020e, B:153:0x0220), top: B:317:0x0202, outer: #37 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x023f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0249  */
    /* JADX WARN: Code duplicated, block: B:169:0x024d  */
    /* JADX WARN: Code duplicated, block: B:179:0x026f A[Catch: all -> 0x02b0, TryCatch #16 {all -> 0x02b0, blocks: (B:177:0x0269, B:179:0x026f, B:180:0x0273, B:182:0x0279), top: B:289:0x0269 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x0279 A[Catch: all -> 0x02b0, TRY_LEAVE, TryCatch #16 {all -> 0x02b0, blocks: (B:177:0x0269, B:179:0x026f, B:180:0x0273, B:182:0x0279), top: B:289:0x0269 }] */
    /* JADX WARN: Code duplicated, block: B:251:0x0306  */
    /* JADX WARN: Code duplicated, block: B:256:0x0311  */
    /* JADX WARN: Code duplicated, block: B:264:0x0322  */
    /* JADX WARN: Code duplicated, block: B:285:0x0251 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0269 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:320:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0104  */
    /* JADX WARN: Code duplicated, block: B:66:0x013a A[Catch: all -> 0x014f, IllegalStateException -> 0x0152, IOException -> 0x0154, TRY_LEAVE, TryCatch #39 {IOException -> 0x0154, IllegalStateException -> 0x0152, blocks: (B:64:0x0130, B:66:0x013a, B:77:0x0156, B:78:0x015b), top: B:320:0x0130, outer: #33 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0156 A[Catch: all -> 0x014f, IllegalStateException -> 0x0152, IOException -> 0x0154, TRY_ENTER, TryCatch #39 {IOException -> 0x0154, IllegalStateException -> 0x0152, blocks: (B:64:0x0130, B:66:0x013a, B:77:0x0156, B:78:0x015b), top: B:320:0x0130, outer: #33 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v6 */
    public static void loadAd(Context context, Executor executor, InterfaceC8170l interfaceC8170l, boolean z) throws Throwable {
        byte[] bArr;
        boolean z2;
        FileInputStream fileInputStreamAmazon;
        byte[] bArr2;
        C10713l[] c10713lArrRemoteconfig;
        C10713l[] c10713lArr;
        InterfaceC8170l interfaceC8170l2;
        C10713l[] c10713lArr2;
        byte[] bArr3;
        byte[] bArr4;
        Object obj;
        ?? r14;
        int i;
        ?? r15;
        boolean z3;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr5;
        int i2;
        ?? r16;
        boolean z4;
        ByteArrayOutputStream byteArrayOutputStream;
        int i3;
        C7403l c7403l;
        FileInputStream fileInputStreamAmazon2;
        ?? r17;
        ?? r7;
        boolean z5;
        boolean z6;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z6 = j == packageInfo.lastUpdateTime;
                            if (z6) {
                                interfaceC8170l.tapsense(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                if (z6) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    AbstractC15350l.crashlytics(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C7403l c7403l2 = new C7403l();
            c7403l2.f15339l = false;
            c7403l2.f15342l = executor;
            c7403l2.f15341l = interfaceC8170l;
            c7403l2.f15337l = name;
            c7403l2.f15343l = file2;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 24) {
                bArr = null;
            } else if (i4 < 31) {
                switch (i4) {
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        bArr = AbstractC13766l.purchase;
                        break;
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        bArr = AbstractC13766l.amazon;
                        break;
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        bArr = AbstractC13766l.crashlytics;
                        break;
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    case 30:
                        bArr = AbstractC13766l.loadAd;
                        break;
                    default:
                        bArr = null;
                        break;
                }
            } else {
                bArr = AbstractC13766l.yandex;
            }
            c7403l2.f15340l = bArr;
            byte[] bArr6 = (byte[]) c7403l2.f15340l;
            if (bArr6 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            c7403l2.f15339l = true;
                            fileInputStreamAmazon = c7403l2.amazon(assets, "dexopt/baseline.prof");
                            ?? r18 = "Invalid magic";
                            bArr2 = AbstractC1019l.yandex;
                            if (fileInputStreamAmazon != null) {
                                if (Arrays.equals(bArr2, AbstractC17834l.amazon(fileInputStreamAmazon, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c10713lArrRemoteconfig = AbstractC1019l.remoteconfig(fileInputStreamAmazon, AbstractC17834l.amazon(fileInputStreamAmazon, 4), (String) c7403l2.f15337l);
                                fileInputStreamAmazon.close();
                                c7403l2.f15338l = c10713lArrRemoteconfig;
                            }
                            c10713lArr = (C10713l[]) c7403l2.f15338l;
                            if (c10713lArr != null) {
                                fileInputStreamAmazon2 = c7403l2.amazon(assets, "dexopt/baseline.profm");
                                if (fileInputStreamAmazon2 == null) {
                                    if (fileInputStreamAmazon2 != null) {
                                        fileInputStreamAmazon2.close();
                                    }
                                    c7403l = null;
                                } else {
                                    if (Arrays.equals(AbstractC1019l.loadAd, AbstractC17834l.amazon(fileInputStreamAmazon2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c7403l2.f15338l = AbstractC1019l.isPro(fileInputStreamAmazon2, AbstractC17834l.amazon(fileInputStreamAmazon2, 4), bArr6, c10713lArr);
                                    fileInputStreamAmazon2.close();
                                    c7403l = c7403l2;
                                }
                                if (c7403l != null) {
                                    c7403l2 = c7403l;
                                }
                            }
                            interfaceC8170l2 = (InterfaceC8170l) c7403l2.f15341l;
                            c10713lArr2 = (C10713l[]) c7403l2.f15338l;
                            bArr3 = (byte[]) c7403l2.f15340l;
                            if (c10713lArr2 != null) {
                                if (c7403l2.f15339l) {
                                    C8339l.smaato("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr2);
                                byteArrayOutputStream.write(bArr3);
                                if (AbstractC1019l.startapp(byteArrayOutputStream, bArr3, c10713lArr2)) {
                                    c7403l2.f15336l = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    c7403l2.f15338l = null;
                                } else {
                                    interfaceC8170l2.tapsense(5, null);
                                    c7403l2.f15338l = null;
                                    byteArrayOutputStream.close();
                                }
                            }
                            bArr4 = (byte[]) c7403l2.f15336l;
                            if (bArr4 != null) {
                                if (c7403l2.f15339l) {
                                    C8339l.smaato("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr4);
                                fileOutputStream = new FileOutputStream((File) c7403l2.f15343l);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr5 = new byte[AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE];
                                        while (true) {
                                            i2 = byteArrayInputStream.read(bArr5);
                                            if (i2 > 0) {
                                                fileOutputStream.write(bArr5, 0, i2);
                                            } else {
                                                r16 = 1;
                                                c7403l2.purchase(1, null);
                                                fileLockTryLock.close();
                                                channel.close();
                                                fileOutputStream.close();
                                                byteArrayInputStream.close();
                                                c7403l2.f15336l = null;
                                                c7403l2.f15338l = null;
                                                z3 = true;
                                            }
                                        }
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z3 = false;
                            r16 = 1;
                            if (z3) {
                                yandex(packageInfo, filesDir);
                            }
                            z4 = z3;
                            r17 = r16;
                        } else {
                            try {
                                c7403l2.purchase(4, null);
                            } catch (IOException unused2) {
                                z2 = true;
                                c7403l2.purchase(4, null);
                                z5 = z2;
                            }
                        }
                    } catch (IOException unused3) {
                        z2 = true;
                    }
                } else if (file2.canWrite()) {
                    c7403l2.f15339l = true;
                    try {
                        fileInputStreamAmazon = c7403l2.amazon(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        interfaceC8170l.tapsense(6, e);
                        fileInputStreamAmazon = null;
                    } catch (IOException e2) {
                        interfaceC8170l.tapsense(7, e2);
                        fileInputStreamAmazon = null;
                    }
                    ?? r19 = "Invalid magic";
                    bArr2 = AbstractC1019l.yandex;
                    try {
                        if (fileInputStreamAmazon != null) {
                            try {
                                if (Arrays.equals(bArr2, AbstractC17834l.amazon(fileInputStreamAmazon, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c10713lArrRemoteconfig = AbstractC1019l.remoteconfig(fileInputStreamAmazon, AbstractC17834l.amazon(fileInputStreamAmazon, 4), (String) c7403l2.f15337l);
                                try {
                                    fileInputStreamAmazon.close();
                                } catch (IOException e3) {
                                    interfaceC8170l.tapsense(7, e3);
                                }
                                c7403l2.f15338l = c10713lArrRemoteconfig;
                            } catch (IOException e4) {
                                interfaceC8170l.tapsense(7, e4);
                                try {
                                    fileInputStreamAmazon.close();
                                } catch (IOException e5) {
                                    interfaceC8170l.tapsense(7, e5);
                                }
                                c10713lArrRemoteconfig = null;
                            } catch (IllegalStateException e6) {
                                interfaceC8170l.tapsense(8, e6);
                                fileInputStreamAmazon.close();
                                c10713lArrRemoteconfig = null;
                            }
                        }
                        c10713lArr = (C10713l[]) c7403l2.f15338l;
                        if (c10713lArr != null && (i3 = Build.VERSION.SDK_INT) >= 24 && (i3 >= 31 || i3 == 24 || i3 == 25)) {
                            try {
                                fileInputStreamAmazon2 = c7403l2.amazon(assets, "dexopt/baseline.profm");
                                if (fileInputStreamAmazon2 == null) {
                                    try {
                                        if (Arrays.equals(AbstractC1019l.loadAd, AbstractC17834l.amazon(fileInputStreamAmazon2, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        c7403l2.f15338l = AbstractC1019l.isPro(fileInputStreamAmazon2, AbstractC17834l.amazon(fileInputStreamAmazon2, 4), bArr6, c10713lArr);
                                        fileInputStreamAmazon2.close();
                                        c7403l = c7403l2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamAmazon2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamAmazon2 != null) {
                                        fileInputStreamAmazon2.close();
                                    }
                                    c7403l = null;
                                }
                            } catch (FileNotFoundException e7) {
                                interfaceC8170l.tapsense(9, e7);
                            } catch (IOException e8) {
                                interfaceC8170l.tapsense(7, e8);
                            } catch (IllegalStateException e9) {
                                c7403l2.f15338l = null;
                                interfaceC8170l.tapsense(8, e9);
                            }
                            if (c7403l != null) {
                                c7403l2 = c7403l;
                            }
                        }
                        interfaceC8170l2 = (InterfaceC8170l) c7403l2.f15341l;
                        c10713lArr2 = (C10713l[]) c7403l2.f15338l;
                        bArr3 = (byte[]) c7403l2.f15340l;
                        if (c10713lArr2 != null && bArr3 != null) {
                            if (c7403l2.f15339l) {
                                C8339l.smaato("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr3);
                                    if (AbstractC1019l.startapp(byteArrayOutputStream, bArr3, c10713lArr2)) {
                                        interfaceC8170l2.tapsense(5, null);
                                        c7403l2.f15338l = null;
                                        byteArrayOutputStream.close();
                                    } else {
                                        c7403l2.f15336l = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        c7403l2.f15338l = null;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e10) {
                                interfaceC8170l2.tapsense(7, e10);
                            } catch (IllegalStateException e11) {
                                interfaceC8170l2.tapsense(8, e11);
                            }
                        }
                        bArr4 = (byte[]) c7403l2.f15336l;
                        if (bArr4 != null) {
                            z3 = false;
                            r16 = 1;
                        } else {
                            if (c7403l2.f15339l) {
                                C8339l.smaato("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                byteArrayInputStream = new ByteArrayInputStream(bArr4);
                                                try {
                                                    try {
                                                        fileOutputStream = new FileOutputStream((File) c7403l2.f15343l);
                                                        try {
                                                            try {
                                                                channel = fileOutputStream.getChannel();
                                                                try {
                                                                    fileLockTryLock = channel.tryLock();
                                                                    try {
                                                                        try {
                                                                            if (fileLockTryLock != null) {
                                                                                try {
                                                                                    if (fileLockTryLock.isValid()) {
                                                                                        bArr5 = new byte[AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE];
                                                                                        while (true) {
                                                                                            i2 = byteArrayInputStream.read(bArr5);
                                                                                            if (i2 > 0) {
                                                                                                fileOutputStream.write(bArr5, 0, i2);
                                                                                            } else {
                                                                                                r16 = 1;
                                                                                                c7403l2.purchase(1, null);
                                                                                                fileLockTryLock.close();
                                                                                                channel.close();
                                                                                                fileOutputStream.close();
                                                                                                byteArrayInputStream.close();
                                                                                                c7403l2.f15336l = null;
                                                                                                c7403l2.f15338l = null;
                                                                                                z3 = true;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th9) {
                                                                                    th = th9;
                                                                                    Throwable th10 = th;
                                                                                    if (fileLockTryLock == null) {
                                                                                        throw th10;
                                                                                    }
                                                                                    try {
                                                                                        fileLockTryLock.close();
                                                                                        throw th10;
                                                                                    } catch (Throwable th11) {
                                                                                        th10.addSuppressed(th11);
                                                                                        throw th10;
                                                                                    }
                                                                                }
                                                                            }
                                                                            throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                        } catch (Throwable th12) {
                                                                            th = th12;
                                                                        }
                                                                    } catch (Throwable th13) {
                                                                        th = th13;
                                                                        Throwable th14 = th;
                                                                        if (channel == null) {
                                                                            throw th14;
                                                                        }
                                                                        try {
                                                                            channel.close();
                                                                            throw th14;
                                                                        } catch (Throwable th15) {
                                                                            th14.addSuppressed(th15);
                                                                            throw th14;
                                                                        }
                                                                    }
                                                                } catch (Throwable th16) {
                                                                    th = th16;
                                                                }
                                                            } catch (Throwable th17) {
                                                                th = th17;
                                                                th2 = th;
                                                                try {
                                                                    fileOutputStream.close();
                                                                    throw th2;
                                                                } catch (Throwable th18) {
                                                                    th2.addSuppressed(th18);
                                                                    throw th2;
                                                                }
                                                            }
                                                        } catch (Throwable th19) {
                                                            th = th19;
                                                            th2 = th;
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        }
                                                    } catch (Throwable th20) {
                                                        th = th20;
                                                        th = th;
                                                        try {
                                                            byteArrayInputStream.close();
                                                            throw th;
                                                        } catch (Throwable th21) {
                                                            th.addSuppressed(th21);
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th22) {
                                                    th = th22;
                                                    th = th;
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException e12) {
                                                e = e12;
                                                i = 6;
                                                obj = null;
                                                r14 = r19;
                                                try {
                                                    c7403l2.purchase(i, e);
                                                    r15 = r14;
                                                    c7403l2.f15336l = obj;
                                                    c7403l2.f15338l = obj;
                                                    z3 = false;
                                                    r16 = r15;
                                                } catch (Throwable th23) {
                                                    th = th23;
                                                    c7403l2.f15336l = obj;
                                                    c7403l2.f15338l = obj;
                                                    throw th;
                                                }
                                            } catch (IOException e13) {
                                                e = e13;
                                                c7403l2.purchase(7, e);
                                                obj = null;
                                                r15 = r19;
                                                c7403l2.f15336l = obj;
                                                c7403l2.f15338l = obj;
                                                z3 = false;
                                                r16 = r15;
                                            }
                                        } catch (FileNotFoundException e14) {
                                            e = e14;
                                            r19 = 1;
                                            i = 6;
                                            obj = null;
                                            r14 = r19;
                                            c7403l2.purchase(i, e);
                                            r15 = r14;
                                            c7403l2.f15336l = obj;
                                            c7403l2.f15338l = obj;
                                            z3 = false;
                                            r16 = r15;
                                        }
                                    } catch (Throwable th24) {
                                        th = th24;
                                        obj = null;
                                        c7403l2.f15336l = obj;
                                        c7403l2.f15338l = obj;
                                        throw th;
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    obj = null;
                                    r14 = 1;
                                    i = 6;
                                }
                            } catch (IOException e16) {
                                e = e16;
                                r19 = 1;
                            }
                        }
                        if (z3) {
                            yandex(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r17 = r16;
                    } catch (Throwable th25) {
                        try {
                            fileInputStreamAmazon.close();
                            throw th25;
                        } catch (IOException e17) {
                            interfaceC8170l.tapsense(7, e17);
                            throw th25;
                        }
                    }
                } else {
                    c7403l2.purchase(4, null);
                }
                if (z4 || !z) {
                    r7 = 0;
                } else {
                    r7 = r17;
                }
                AbstractC15350l.crashlytics(context, r7);
            }
            c7403l2.purchase(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z5 = true;
            z4 = false;
            r17 = z5;
            if (z4) {
                r7 = 0;
            } else {
                r7 = 0;
            }
            AbstractC15350l.crashlytics(context, r7);
        } catch (PackageManager.NameNotFoundException e18) {
            interfaceC8170l.tapsense(7, e18);
            AbstractC15350l.crashlytics(context, false);
        }
    }

    public static void yandex(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }
}
