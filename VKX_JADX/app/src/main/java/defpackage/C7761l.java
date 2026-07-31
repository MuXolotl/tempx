package defpackage;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًؔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7761l implements InterfaceC4335l {
    public final C8688l admob;
    public final String amazon;
    public final String billing;
    public final C1274l crashlytics;
    public final File loadAd;
    public final C4910l mopub;
    public final String purchase;
    public final C8688l subs;
    public final InterfaceC12932l yandex;

    public C7761l(InterfaceC12932l interfaceC12932l, File file) {
        this.yandex = interfaceC12932l;
        this.loadAd = file;
        Object obj = FileObserverC14818l.loadAd;
        final int i = 1;
        this.crashlytics = new C1274l(new C17949l(file, null, i), C17218l.f33421l, -2, 1, 0);
        this.amazon = ".lock";
        this.purchase = ".version";
        this.billing = "fcntl failed: EAGAIN";
        this.mopub = AbstractC8618l.yandex();
        final int i2 = 0;
        this.admob = new C8688l(new Function0(this) { // from class: lٌٍؙ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C7761l f13301l;

            {
                this.f13301l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                Throwable th;
                ParcelFileDescriptor parcelFileDescriptorOpen;
                int i3 = i2;
                C7761l c7761l = this.f13301l;
                switch (i3) {
                    case 0:
                        File file2 = new File(c7761l.loadAd.getAbsolutePath() + c7761l.amazon);
                        C7761l.billing(file2);
                        return file2;
                    default:
                        InterfaceC16452l.yandex.getClass();
                        File file3 = new File(c7761l.loadAd.getAbsolutePath() + c7761l.purchase);
                        C7761l.billing(file3);
                        C14103l c14103l = null;
                        try {
                            parcelFileDescriptorOpen = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                NativeSharedCounter nativeSharedCounter = C18083l.loadAd;
                                if (nativeSharedCounter != null) {
                                    int fd = parcelFileDescriptorOpen.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                        if (jNativeCreateSharedCounter >= 0) {
                                            c14103l = new C14103l(nativeSharedCounter, jNativeCreateSharedCounter);
                                        } else {
                                            C18262l.metrica("Failed to mmap counter file");
                                        }
                                    } else {
                                        C18262l.metrica("Failed to truncate counter file");
                                    }
                                } else {
                                    C8339l.smaato("DataStore failed to load the native library to create SharedCounter.");
                                }
                                parcelFileDescriptorOpen.close();
                                return c14103l;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptorOpen != null) {
                                    parcelFileDescriptorOpen.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptorOpen = null;
                        }
                        break;
                }
            }
        });
        this.subs = new C8688l(new Function0(this) { // from class: lٌٍؙ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C7761l f13301l;

            {
                this.f13301l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                Throwable th;
                ParcelFileDescriptor parcelFileDescriptorOpen;
                int i3 = i;
                C7761l c7761l = this.f13301l;
                switch (i3) {
                    case 0:
                        File file2 = new File(c7761l.loadAd.getAbsolutePath() + c7761l.amazon);
                        C7761l.billing(file2);
                        return file2;
                    default:
                        InterfaceC16452l.yandex.getClass();
                        File file3 = new File(c7761l.loadAd.getAbsolutePath() + c7761l.purchase);
                        C7761l.billing(file3);
                        C14103l c14103l = null;
                        try {
                            parcelFileDescriptorOpen = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                NativeSharedCounter nativeSharedCounter = C18083l.loadAd;
                                if (nativeSharedCounter != null) {
                                    int fd = parcelFileDescriptorOpen.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                        if (jNativeCreateSharedCounter >= 0) {
                                            c14103l = new C14103l(nativeSharedCounter, jNativeCreateSharedCounter);
                                        } else {
                                            C18262l.metrica("Failed to mmap counter file");
                                        }
                                    } else {
                                        C18262l.metrica("Failed to truncate counter file");
                                    }
                                } else {
                                    C8339l.smaato("DataStore failed to load the native library to create SharedCounter.");
                                }
                                parcelFileDescriptorOpen.close();
                                return c14103l;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptorOpen != null) {
                                    parcelFileDescriptorOpen.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptorOpen = null;
                        }
                        break;
                }
            }
        });
    }

    public static void billing(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                C10754l.pro(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc A[Catch: all -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e0, blocks: (B:61:0x00dc, B:75:0x00f7, B:76:0x00fa), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7 A[Catch: all -> 0x00e0, TRY_ENTER, TryCatch #1 {all -> 0x00e0, blocks: (B:61:0x00dc, B:75:0x00f7, B:76:0x00fa), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v10, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r2v13, types: [lٖؗؓ] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, lّْٛ] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, java.io.Closeable] */
    @Override // defpackage.InterfaceC4335l
    public final Object amazon(Function2 function2, AbstractC0283l abstractC0283l) throws Throwable {
        ?? c12578l;
        ?? r1;
        ?? r2;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        FileInputStream fileInputStream;
        ?? r3;
        ?? r4;
        if (abstractC0283l instanceof C12578l) {
            C12578l c12578l2 = (C12578l) abstractC0283l;
            int i = c12578l2.f24760l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12578l2.f24760l = i - RecyclerView.UNDEFINED_DURATION;
                c12578l = c12578l2;
            } else {
                c12578l = new C12578l(this, abstractC0283l);
            }
        } else {
            c12578l = new C12578l(this, abstractC0283l);
        }
        Object objInvoke = c12578l.f24759l;
        ?? r5 = c12578l.f24760l;
        try {
            if (r5 == 0) {
                AbstractC2829l.crashlytics(objInvoke);
                C4910l c4910l = this.mopub;
                boolean zMopub = c4910l.mopub();
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                try {
                    if (zMopub) {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.admob.getValue());
                        try {
                            try {
                                fileLockTryLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (IOException e) {
                                String message2 = e.getMessage();
                                if ((message2 == null || !AbstractC16648l.isVip(message2, this.billing, false)) && ((message = e.getMessage()) == null || !AbstractC16648l.isVip(message, "Resource deadlock would occur", false))) {
                                    throw e;
                                }
                                fileLockTryLock = null;
                            }
                            try {
                                Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                                c12578l.f24762l = c4910l;
                                c12578l.f24761l = fileInputStream2;
                                c12578l.f24764l = fileLockTryLock;
                                c12578l.f24758l = zMopub;
                                c12578l.f24760l = 2;
                                objInvoke = function2.invoke(boolValueOf, c12578l);
                                if (objInvoke != enumC9342l) {
                                    fileLock = fileLockTryLock;
                                    c12578l = c4910l;
                                    r1 = zMopub;
                                    fileInputStream = fileInputStream2;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    AbstractC7876l.loadAd(fileInputStream, null);
                                    if (r1 != 0) {
                                        c12578l.billing(null);
                                    }
                                    return objInvoke;
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        c12578l.f24762l = c4910l;
                        c12578l.f24758l = zMopub;
                        c12578l.f24760l = 1;
                        objInvoke = function2.invoke(bool, c12578l);
                        if (objInvoke != enumC9342l) {
                            r3 = c4910l;
                            r4 = zMopub;
                            if (r4 != 0) {
                                r3.billing(null);
                            }
                            return objInvoke;
                        }
                    }
                    return enumC9342l;
                } catch (Throwable th3) {
                    th = th3;
                    r2 = c4910l;
                    r1 = zMopub;
                }
            } else if (r5 == 1) {
                r1 = c12578l.f24758l;
                r2 = c12578l.f24762l;
                try {
                    AbstractC2829l.crashlytics(objInvoke);
                    r4 = r1;
                    r3 = r2;
                    if (r4 != 0) {
                        r3.billing(null);
                    }
                    return objInvoke;
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                if (r5 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z = c12578l.f24758l;
                fileLock = c12578l.f24764l;
                fileInputStream = c12578l.f24761l;
                C4910l c4910l2 = c12578l.f24762l;
                try {
                    AbstractC2829l.crashlytics(objInvoke);
                    r1 = z;
                    c12578l = c4910l2;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    try {
                        AbstractC7876l.loadAd(fileInputStream, null);
                        if (r1 != 0) {
                            c12578l.billing(null);
                        }
                        return objInvoke;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    AbstractC7876l.loadAd(r5, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r1 = this;
                }
            }
        }
        r2 = c12578l;
        if (r1 != 0) {
            r2.billing(null);
        }
        throw th;
    }

    @Override // defpackage.InterfaceC4335l
    public final Object crashlytics(C12674l c12674l) {
        C8688l c8688l = this.subs;
        if (c8688l.yandex()) {
            C14103l c14103l = (C14103l) ((InterfaceC16452l) c8688l.getValue());
            return new Integer(c14103l.loadAd.nativeIncrementAndGetCounterValue(c14103l.crashlytics));
        }
        return AbstractC10999l.firebase(this.yandex, new C2245l(this, null, 1), c12674l);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[Catch: all -> 0x00c4, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00c4, blocks: (B:42:0x00c0, B:58:0x00de, B:59:0x00e1), top: B:73:0x0023, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00de A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #3 {all -> 0x00c4, blocks: (B:42:0x00c0, B:58:0x00de, B:59:0x00e1), top: B:73:0x0023, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.Closeable, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r1v7, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // defpackage.InterfaceC4335l
    public final Object loadAd(Function1 function1, AbstractC0283l abstractC0283l) throws Throwable {
        C8357l c8357l;
        int i;
        ?? r10;
        FileOutputStream fileOutputStream;
        Object objStartapp;
        ?? r4;
        Closeable closeable;
        int i2;
        FileLock fileLock;
        ?? r1;
        ?? r0;
        if (abstractC0283l instanceof C8357l) {
            c8357l = (C8357l) abstractC0283l;
            int i3 = c8357l.f17296l;
            if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8357l.f17296l = i3 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8357l = new C8357l(this, abstractC0283l);
            }
        } else {
            c8357l = new C8357l(this, abstractC0283l);
        }
        Object objInvoke = c8357l.f17305l;
        ?? r2 = c8357l.f17296l;
        int i4 = 0;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            try {
                try {
                    if (r2 == 0) {
                        AbstractC2829l.crashlytics(objInvoke);
                        c8357l.f17301l = function1;
                        C4910l c4910l = this.mopub;
                        c8357l.f17300l = c4910l;
                        c8357l.f17298l = 0;
                        c8357l.f17296l = 1;
                        if (c4910l.yandex(c8357l) != enumC9342l) {
                            r2 = c4910l;
                            i = 0;
                            r10 = function1;
                        }
                        return enumC9342l;
                    }
                    if (r2 != 1) {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileLock = c8357l.f17297l;
                            closeable = c8357l.f17304l;
                            InterfaceC1601l interfaceC1601l = c8357l.f17300l;
                            try {
                                AbstractC2829l.crashlytics(objInvoke);
                                r0 = interfaceC1601l;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    AbstractC7876l.loadAd(closeable, null);
                                    r0.billing(null);
                                    return objInvoke;
                                } catch (Throwable th) {
                                    th = th;
                                    r2 = r0;
                                    r2.billing(null);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        int i5 = c8357l.f17299l;
                        int i6 = c8357l.f17303l;
                        int i7 = c8357l.f17298l;
                        Closeable closeable2 = c8357l.f17304l;
                        InterfaceC1601l interfaceC1601l2 = c8357l.f17300l;
                        Function1 function2 = c8357l.f17301l;
                        try {
                            AbstractC2829l.crashlytics(objInvoke);
                            i4 = i6;
                            objStartapp = objInvoke;
                            i = i7;
                            closeable = closeable2;
                            r1 = interfaceC1601l2;
                            i2 = i5;
                            r4 = function2;
                            try {
                                fileLock = (FileLock) objStartapp;
                                try {
                                    c8357l.f17301l = null;
                                    c8357l.f17300l = r1;
                                    c8357l.f17304l = closeable;
                                    c8357l.f17297l = fileLock;
                                    c8357l.f17298l = i;
                                    c8357l.f17303l = i4;
                                    c8357l.f17299l = i2;
                                    c8357l.f17296l = 3;
                                    objInvoke = r4.invoke(c8357l);
                                    if (objInvoke != enumC9342l) {
                                        r0 = r1;
                                        if (fileLock != null) {
                                            fileLock.release();
                                        }
                                        AbstractC7876l.loadAd(closeable, null);
                                        r0.billing(null);
                                        return objInvoke;
                                    }
                                    return enumC9342l;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    int i8 = c8357l.f17298l;
                    InterfaceC1601l interfaceC1601l3 = c8357l.f17300l;
                    Function1 function3 = c8357l.f17301l;
                    AbstractC2829l.crashlytics(objInvoke);
                    i = i8;
                    r10 = function3;
                    r2 = interfaceC1601l3;
                    c8357l.f17301l = r10;
                    c8357l.f17300l = r2;
                    c8357l.f17304l = fileOutputStream;
                    c8357l.f17298l = i;
                    c8357l.f17303l = 0;
                    c8357l.f17299l = 0;
                    c8357l.f17296l = 2;
                    objStartapp = C6162l.startapp(fileOutputStream, c8357l);
                    if (objStartapp != enumC9342l) {
                        r4 = r10;
                        closeable = fileOutputStream;
                        i2 = 0;
                        r1 = r2;
                        fileLock = (FileLock) objStartapp;
                        c8357l.f17301l = null;
                        c8357l.f17300l = r1;
                        c8357l.f17304l = closeable;
                        c8357l.f17297l = fileLock;
                        c8357l.f17298l = i;
                        c8357l.f17303l = i4;
                        c8357l.f17299l = i2;
                        c8357l.f17296l = 3;
                        objInvoke = r4.invoke(c8357l);
                        if (objInvoke != enumC9342l) {
                            r0 = r1;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            AbstractC7876l.loadAd(closeable, null);
                            r0.billing(null);
                            return objInvoke;
                        }
                    }
                    return enumC9342l;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                fileOutputStream = new FileOutputStream((File) this.admob.getValue());
            } catch (Throwable th7) {
                th = th7;
                r2.billing(null);
                throw th;
            }
        } catch (Throwable th8) {
            r2 = c8357l;
            try {
                throw th8;
            } catch (Throwable th9) {
                AbstractC7876l.loadAd(function1, th8);
                throw th9;
            }
        }
    }

    @Override // defpackage.InterfaceC4335l
    public final InterfaceC6942l purchase() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC4335l
    public final Object yandex(AbstractC0283l abstractC0283l) {
        C8688l c8688l = this.subs;
        if (c8688l.yandex()) {
            C14103l c14103l = (C14103l) ((InterfaceC16452l) c8688l.getValue());
            return new Integer(c14103l.loadAd.nativeGetCounterValue(c14103l.crashlytics));
        }
        return AbstractC10999l.firebase(this.yandex, new C2245l(this, null, 0), abstractC0283l);
    }
}
