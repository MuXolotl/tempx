package defpackage;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙ۠ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6805l implements InterfaceC5137l {
    public final C7730l amazon;
    public final InterfaceC4335l crashlytics;
    public final InterfaceC18477l loadAd;
    public final File yandex;
    public final AtomicBoolean purchase = new AtomicBoolean(false);
    public final C4910l billing = AbstractC8618l.yandex();

    public C6805l(File file, InterfaceC18477l interfaceC18477l, InterfaceC4335l interfaceC4335l, C7730l c7730l) {
        this.yandex = file;
        this.loadAd = interfaceC18477l;
        this.crashlytics = interfaceC4335l;
        this.amazon = c7730l;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:34:0x0071, B:43:0x0082, B:42:0x007f, B:39:0x007a), top: B:50:0x0020, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [lؙ۠ۖ] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [lٓۧٗ] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
    @Override // defpackage.InterfaceC5137l
    public final Object amazon(C14570l c14570l, AbstractC0283l abstractC0283l) throws Throwable {
        C1439l c1439l;
        ?? Mopub;
        Throwable th;
        C9685l c9685l;
        ?? r6;
        if (abstractC0283l instanceof C1439l) {
            c1439l = (C1439l) abstractC0283l;
            int i = c1439l.f3623l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1439l.f3623l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1439l = new C1439l(this, abstractC0283l);
            }
        } else {
            c1439l = new C1439l(this, abstractC0283l);
        }
        Object obj = c1439l.f3626l;
        int i2 = c1439l.f3623l;
        C4910l c4910l = this.billing;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = c1439l.f3624l;
                c9685l = c1439l.f3625l;
                try {
                    AbstractC2829l.crashlytics(obj);
                    r6 = this;
                    try {
                        c9685l.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r6 != 0) {
                        c4910l.billing(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        c9685l.close();
                    } catch (Throwable th4) {
                        AbstractC11718l.yandex(th, th4);
                    }
                    throw th;
                }
            }
            AbstractC2829l.crashlytics(obj);
            if (this.purchase.get()) {
                C8339l.smaato("StorageConnection has already been disposed.");
                return null;
            }
            Mopub = c4910l.mopub();
            try {
                C9685l c9685l2 = new C9685l(this.yandex, this.loadAd);
                try {
                    Boolean boolValueOf = Boolean.valueOf((boolean) Mopub);
                    c1439l.f3625l = c9685l2;
                    c1439l.f3624l = Mopub;
                    c1439l.f3623l = 1;
                    Object objInvoke = c14570l.invoke(c9685l2, boolValueOf, c1439l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objInvoke == enumC9342l) {
                        return enumC9342l;
                    }
                    obj = objInvoke;
                    r6 = Mopub == true ? 1 : 0;
                    c9685l = c9685l2;
                    c9685l.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r6 != 0) {
                        c4910l.billing(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    this = Mopub == true ? 1 : 0;
                    c9685l = c9685l2;
                    c9685l.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                if (Mopub != 0) {
                    c4910l.billing(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            Mopub = this;
        }
    }

    @Override // defpackage.InterfaceC1600l
    public final void close() {
        this.purchase.set(true);
        this.amazon.invoke();
    }

    @Override // defpackage.InterfaceC5137l
    public final InterfaceC4335l crashlytics() {
        return this.crashlytics;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:43:0x00c4, B:45:0x00ca, B:47:0x00d0, B:48:0x00d4, B:51:0x00db, B:52:0x00e2, B:55:0x00e8, B:62:0x00f4, B:69:0x0102, B:68:0x00ff), top: B:82:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca A[Catch: all -> 0x00f0, IOException -> 0x00f2, TryCatch #0 {all -> 0x00f0, blocks: (B:43:0x00c4, B:45:0x00ca, B:47:0x00d0, B:48:0x00d4, B:51:0x00db, B:52:0x00e2, B:55:0x00e8, B:62:0x00f4, B:69:0x0102, B:68:0x00ff), top: B:82:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0 A[Catch: all -> 0x00f0, IOException -> 0x00f2, TryCatch #0 {all -> 0x00f0, blocks: (B:43:0x00c4, B:45:0x00ca, B:47:0x00d0, B:48:0x00d4, B:51:0x00db, B:52:0x00e2, B:55:0x00e8, B:62:0x00f4, B:69:0x0102, B:68:0x00ff), top: B:82:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4 A[Catch: all -> 0x00f0, IOException -> 0x00f2, TryCatch #0 {all -> 0x00f0, blocks: (B:43:0x00c4, B:45:0x00ca, B:47:0x00d0, B:48:0x00d4, B:51:0x00db, B:52:0x00e2, B:55:0x00e8, B:62:0x00f4, B:69:0x0102, B:68:0x00ff), top: B:82:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db A[Catch: all -> 0x00f0, IOException -> 0x00f2, TryCatch #0 {all -> 0x00f0, blocks: (B:43:0x00c4, B:45:0x00ca, B:47:0x00d0, B:48:0x00d4, B:51:0x00db, B:52:0x00e2, B:55:0x00e8, B:62:0x00f4, B:69:0x0102, B:68:0x00ff), top: B:82:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f4 A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:43:0x00c4, B:45:0x00ca, B:47:0x00d0, B:48:0x00d4, B:51:0x00db, B:52:0x00e2, B:55:0x00e8, B:62:0x00f4, B:69:0x0102, B:68:0x00ff), top: B:82:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [lٍؓؕ] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.File] */
    @Override // defpackage.InterfaceC5137l
    public final Object yandex(C14822l c14822l, AbstractC0283l abstractC0283l) throws Throwable {
        C11462l c11462l;
        ?? file;
        InterfaceC1601l interfaceC1601l;
        int i;
        C16220l c16220l;
        Throwable th;
        C16220l c16220l2;
        InterfaceC1601l interfaceC1601l2;
        ?? r11;
        if (abstractC0283l instanceof C11462l) {
            c11462l = (C11462l) abstractC0283l;
            int i2 = c11462l.f23051l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11462l.f23051l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11462l = new C11462l(this, abstractC0283l);
            }
        } else {
            c11462l = new C11462l(this, abstractC0283l);
        }
        ?? r12 = c11462l.f23049l;
        int i3 = c11462l.f23051l;
        File file2 = this.yandex;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            try {
                try {
                    try {
                        try {
                            if (i3 == 0) {
                                AbstractC2829l.crashlytics(r12);
                                if (this.purchase.get()) {
                                    C8339l.smaato("StorageConnection has already been disposed.");
                                    return null;
                                }
                                File parentFile = file2.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        C10754l.pro(file2, "Unable to create parent directories of ");
                                        return null;
                                    }
                                }
                                c11462l.f23048l = c14822l;
                                interfaceC1601l = this.billing;
                                c11462l.f23047l = interfaceC1601l;
                                i = 0;
                                c11462l.f23045l = 0;
                                c11462l.f23051l = 1;
                                if (interfaceC1601l.yandex(c11462l) != enumC9342l) {
                                }
                                return enumC9342l;
                            }
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                c16220l2 = c11462l.f23044l;
                                File file3 = c11462l.f23050l;
                                interfaceC1601l2 = c11462l.f23047l;
                                try {
                                    AbstractC2829l.crashlytics(r12);
                                    r11 = file3;
                                    Unit unit = Unit.INSTANCE;
                                    try {
                                        c16220l2.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (r11.exists()) {
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            AbstractC5941l.m1905strictfp(r11, file2);
                                        } else if (r11.renameTo(file2)) {
                                            throw new IOException("File rename failed.");
                                        }
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    interfaceC1601l2.billing(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        c16220l2.close();
                                    } catch (Throwable th4) {
                                        AbstractC11718l.yandex(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            int i4 = c11462l.f23045l;
                            InterfaceC1601l interfaceC1601l3 = c11462l.f23047l;
                            C14822l c14822l2 = c11462l.f23048l;
                            AbstractC2829l.crashlytics(r12);
                            interfaceC1601l = interfaceC1601l3;
                            i = i4;
                            c14822l = c14822l2;
                            c11462l.f23048l = null;
                            c11462l.f23047l = interfaceC1601l;
                            c11462l.f23050l = file;
                            c11462l.f23044l = c16220l;
                            c11462l.f23045l = i;
                            c11462l.f23051l = 2;
                            if (c14822l.invoke(c16220l, c11462l) != enumC9342l) {
                                interfaceC1601l2 = interfaceC1601l;
                                r11 = file;
                                c16220l2 = c16220l;
                                Unit unit3 = Unit.INSTANCE;
                                c16220l2.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (r11.exists()) {
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        AbstractC5941l.m1905strictfp(r11, file2);
                                    } else if (r11.renameTo(file2)) {
                                        throw new IOException("File rename failed.");
                                    }
                                }
                                Unit unit4 = Unit.INSTANCE;
                                interfaceC1601l2.billing(null);
                                return Unit.INSTANCE;
                            }
                            return enumC9342l;
                        } catch (Throwable th5) {
                            th = th5;
                            c16220l2 = c16220l;
                            c16220l2.close();
                            throw th;
                        }
                        c16220l = new C16220l(file, this.loadAd);
                    } catch (IOException e) {
                        e = e;
                        if (file.exists()) {
                            file.delete();
                        }
                        throw new IOException("Unable to rename " + file + " to " + file2 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.", e);
                    }
                    file = new File(file2.getAbsolutePath() + ".tmp");
                } catch (IOException e2) {
                    e = e2;
                    file = c14822l;
                }
            } catch (Throwable th6) {
                th = th6;
                r12.billing(null);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            r12 = c11462l;
            r12.billing(null);
            throw th;
        }
    }
}
