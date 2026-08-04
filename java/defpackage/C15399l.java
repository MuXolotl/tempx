package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lٕؒ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15399l {
    public final C14529l yandex;

    public C15399l(C14529l c14529l) {
        this.yandex = c14529l;
    }

    public static String crashlytics(String str, String str2) {
        return !AbstractC16648l.isVip(str2, "http", false) ? str.substring(0, AbstractC12024l.m3343switch(str, '/', 0, 6) + 1).concat(str2) : str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object loadAd(C15399l c15399l, C4273l c4273l, int i, String str, Map map, AbstractC0283l abstractC0283l) throws Exception {
        C0487l c0487l;
        byte[] bArr;
        c15399l.getClass();
        if (abstractC0283l instanceof C0487l) {
            c0487l = (C0487l) abstractC0283l;
            int i2 = c0487l.f1798l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0487l.f1798l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0487l = new C0487l(c15399l, abstractC0283l);
            }
        } else {
            c0487l = new C0487l(c15399l, abstractC0283l);
        }
        Object objAmazon = c0487l.f1799l;
        int i3 = c0487l.f1798l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objAmazon);
            bArr = (byte[]) map.get(c4273l.loadAd);
            if (bArr == null) {
                c0487l.f1800l = i;
                c0487l.f1798l = 1;
                objAmazon = c15399l.amazon(c4273l, str, c0487l);
                Object obj = EnumC9342l.f19165l;
                if (objAmazon == obj) {
                    return obj;
                }
            }
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(ByteBuffer.allocate(16).putInt(0).putInt(0).putInt(0).putInt(i).array()));
            return cipher;
        }
        if (i3 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = c0487l.f1800l;
        AbstractC2829l.crashlytics(objAmazon);
        bArr = (byte[]) objAmazon;
        Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher2.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(ByteBuffer.allocate(16).putInt(0).putInt(0).putInt(0).putInt(i).array()));
        return cipher2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:97|102|25|(1:126)(12:28|108|29|(9:110|31|32|119|33|34|104|35|(1:127)(1:38))(1:50)|118|51|(5:114|54|(2:56|(2:122|58)(2:59|123))(2:61|124)|60|52)|112|65|66|67|(5:68|(1:70)|71|(1:73)(1:74)|(3:125|76|77)(2:79|1c8)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:114|54|(2:56|(2:122|58)(2:59|123))(2:61|124)|60|52) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:110|31|32|119|33|34|104|35|(1:127)(1:38)) */
    /* JADX WARN: Code duplicated, block: B:100:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:50:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c A[Catch: Exception -> 0x0156, TryCatch #7 {Exception -> 0x0156, blocks: (B:54:0x0130, B:56:0x013c, B:59:0x0148, B:61:0x0150), top: B:114:0x0130 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0148 A[Catch: Exception -> 0x0156, TryCatch #7 {Exception -> 0x0156, blocks: (B:54:0x0130, B:56:0x013c, B:59:0x0148, B:61:0x0150), top: B:114:0x0130 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0150 A[Catch: Exception -> 0x0156, TRY_LEAVE, TryCatch #7 {Exception -> 0x0156, blocks: (B:54:0x0130, B:56:0x013c, B:59:0x0148, B:61:0x0150), top: B:114:0x0130 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0191 A[Catch: Exception -> 0x01d4, TryCatch #9 {Exception -> 0x01d4, blocks: (B:51:0x0125, B:52:0x012a, B:67:0x0182, B:68:0x018d, B:70:0x0191, B:71:0x0197, B:76:0x01a5, B:79:0x01b0, B:80:0x01c8, B:86:0x01d3, B:74:0x019d, B:81:0x01c9, B:82:0x01ce), top: B:118:0x0125, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x019b  */
    /* JADX WARN: Code duplicated, block: B:74:0x019d A[Catch: Exception -> 0x01d4, TryCatch #9 {Exception -> 0x01d4, blocks: (B:51:0x0125, B:52:0x012a, B:67:0x0182, B:68:0x018d, B:70:0x0191, B:71:0x0197, B:76:0x01a5, B:79:0x01b0, B:80:0x01c8, B:86:0x01d3, B:74:0x019d, B:81:0x01c9, B:82:0x01ce), top: B:118:0x0125, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b0 A[Catch: Exception -> 0x01d4, TryCatch #9 {Exception -> 0x01d4, blocks: (B:51:0x0125, B:52:0x012a, B:67:0x0182, B:68:0x018d, B:70:0x0191, B:71:0x0197, B:76:0x01a5, B:79:0x01b0, B:80:0x01c8, B:86:0x01d3, B:74:0x019d, B:81:0x01c9, B:82:0x01ce), top: B:118:0x0125, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ef  */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e1, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010d, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010e, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0112, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0115, code lost:
    
        r3 = r5;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0118, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0119, code lost:
    
        r3 = r5;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0156, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ee -> B:39:0x00f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x011e -> B:118:0x0125). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object yandex(defpackage.C15399l r18, java.lang.String r19, defpackage.C0657l r20, int r21, java.util.Map r22, defpackage.AbstractC0283l r23) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15399l.yandex(lٕؒ۟, java.lang.String, lٟؑۢ, int, java.util.Map, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:18|33|19|20|(1:22)(1:23)) */
    /* JADX WARN: Code duplicated, block: B:22:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        r6 = r3;
        r3 = r10;
        r10 = r4;
        r4 = r6;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006e -> B:26:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object amazon(defpackage.C4273l r8, java.lang.String r9, defpackage.AbstractC0283l r10) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.C0866l
            if (r0 == 0) goto L13
            r0 = r10
            lؘؙؒ r0 = (defpackage.C0866l) r0
            int r1 = r0.f2525l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2525l = r1
            goto L18
        L13:
            lؘؙؒ r0 = new lؘؙؒ
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f2523l
            int r1 = r0.f2525l
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L36
            int r8 = r0.f2519l
            int r9 = r0.f2518l
            int r1 = r0.f2524l
            java.lang.String r3 = r0.f2521l
            lؖٝۥ r4 = r0.f2522l
            defpackage.AbstractC2829l.crashlytics(r10)     // Catch: java.lang.Exception -> L2f
            return r10
        L2f:
            r10 = move-exception
            r6 = r0
            r0 = r9
            r9 = r4
            r4 = r1
            r1 = r6
            goto L72
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            r7 = 0
            return r7
        L3d:
            defpackage.AbstractC2829l.crashlytics(r10)
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r1 = "This should not be visible here!"
            r10.<init>(r1)
            r10 = 0
            r1 = 3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            r8 = r0
        L4f:
            lٓۤۚ r4 = r7.yandex     // Catch: java.lang.Exception -> L6d
            java.lang.String r5 = r9.loadAd     // Catch: java.lang.Exception -> L6d
            java.lang.String r5 = crashlytics(r10, r5)     // Catch: java.lang.Exception -> L6d
            r1.f2522l = r9     // Catch: java.lang.Exception -> L6d
            r1.f2521l = r10     // Catch: java.lang.Exception -> L6d
            r1.f2524l = r3     // Catch: java.lang.Exception -> L6d
            r1.f2518l = r0     // Catch: java.lang.Exception -> L6d
            r1.f2519l = r8     // Catch: java.lang.Exception -> L6d
            r1.f2525l = r2     // Catch: java.lang.Exception -> L6d
            java.io.Serializable r7 = r4.loadAd(r5, r1)     // Catch: java.lang.Exception -> L6d
            lٍؗؐ r8 = defpackage.EnumC9342l.f19165l
            if (r7 != r8) goto L6c
            return r8
        L6c:
            return r7
        L6d:
            r4 = move-exception
            r6 = r3
            r3 = r10
            r10 = r4
            r4 = r6
        L72:
            r10.printStackTrace()
            if (r8 == r4) goto L7c
            int r8 = r8 + 1
            r10 = r3
            r3 = r4
            goto L4f
        L7c:
            r10.printStackTrace()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15399l.amazon(lؖٝۥ, java.lang.String, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object purchase(String str, AbstractC0283l abstractC0283l) {
        C14768l c14768l;
        Closeable closeable;
        Closeable closeable2;
        C9173l c9173l;
        Object next;
        if (abstractC0283l instanceof C14768l) {
            c14768l = (C14768l) abstractC0283l;
            int i = c14768l.f28848l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14768l.f28848l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14768l = new C14768l(this, abstractC0283l);
            }
        } else {
            c14768l = new C14768l(this, abstractC0283l);
        }
        Object objAmazon = c14768l.f28851l;
        int i2 = c14768l.f28848l;
        Object obj = EnumC9342l.f19165l;
        try {
            try {
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(objAmazon);
                    c14768l.f28850l = str;
                    c14768l.f28848l = 1;
                    objAmazon = this.yandex.amazon(str, c14768l);
                    if (objAmazon != obj) {
                    }
                    return obj;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    closeable2 = c14768l.f28849l;
                    try {
                        AbstractC2829l.crashlytics(objAmazon);
                        c9173l = (C9173l) objAmazon;
                        AbstractC7876l.loadAd(closeable2, null);
                        return c9173l;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC7876l.loadAd(closeable2, th);
                            throw th2;
                        }
                    }
                }
                str = c14768l.f28850l;
                AbstractC2829l.crashlytics(objAmazon);
                C2434l c2434lMo1235l = ((AbstractC17054l) new C5501l((InputStream) closeable).f11764l).mo1235l();
                if (c2434lMo1235l.yandex()) {
                    Iterator it = c2434lMo1235l.yandex.yandex.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int i3 = ((C4246l) next).loadAd.yandex;
                            do {
                                Object next2 = it.next();
                                int i4 = ((C4246l) next2).loadAd.yandex;
                                if (i3 < i4) {
                                    next = next2;
                                    i3 = i4;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    String strCrashlytics = crashlytics(str, ((C4246l) next).yandex);
                    c14768l.f28850l = null;
                    c14768l.f28849l = closeable;
                    c14768l.f28848l = 2;
                    Object objPurchase = purchase(strCrashlytics, c14768l);
                    if (objPurchase != obj) {
                        objAmazon = objPurchase;
                        closeable2 = closeable;
                        c9173l = (C9173l) objAmazon;
                    }
                    return obj;
                }
                c9173l = c2434lMo1235l.loadAd;
                closeable2 = closeable;
                AbstractC7876l.loadAd(closeable2, null);
                return c9173l;
            } catch (Throwable th3) {
                th = th3;
                closeable2 = closeable;
                throw th;
            }
            EnumC6690l enumC6690l = EnumC6690l.f14038l;
        } catch (Throwable th4) {
            th = th4;
        }
        closeable = (Closeable) objAmazon;
    }
}
