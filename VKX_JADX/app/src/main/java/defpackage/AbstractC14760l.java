package defpackage;

import android.R;
import android.net.Uri;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًٔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14760l {
    public static final int[] yandex = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] loadAd = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] crashlytics = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] amazon = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] purchase = {R.attr.drawable};
    public static final int[] billing = {R.attr.name, R.attr.animation};
    public static final int[] mopub = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] admob = {R.attr.ordering};
    public static final int[] subs = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] isPro = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] firebase = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};
    public static final C12591l smaato = new C12591l();

    public static IOException admob(C2830l c2830l, Uri uri, IOException iOException, String str) {
        try {
            C14882l c14882l = new C14882l();
            c14882l.f29109l = true;
            File file = (File) c2830l.yandex(uri, c14882l);
            if (!file.exists()) {
                return subs(file, iOException, str);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    return file.canWrite() ? subs(file, iOException, str) : subs(file, iOException, str);
                }
                return file.canWrite() ? subs(file, iOException, str) : subs(file, iOException, str);
            }
            if (file.canRead()) {
                return file.canWrite() ? subs(file, iOException, str) : subs(file, iOException, str);
            }
            return file.canWrite() ? subs(file, iOException, str) : subs(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static C10282l amazon(int i) {
        int i2 = (i & 1) != 0 ? 8 : 10;
        float f = i2;
        float fCos = 1.0f / ((float) Math.cos(AbstractC12481l.loadAd / f));
        C2428l c2428l = new C2428l(2, 1.0f);
        float[] fArr = new float[i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long jFirebase = AbstractC10433l.firebase(AbstractC12481l.amazon(fCos, (AbstractC12481l.loadAd / f) * 2.0f * i4), C9699l.yandex(0.0f, 0.0f));
            int i5 = i3 + 1;
            fArr[i3] = AbstractC10433l.mopub(jFirebase);
            i3 += 2;
            fArr[i5] = AbstractC10433l.admob(jFirebase);
        }
        return AbstractC9498l.loadAd(fArr, c2428l, null, 0.0f, 0.0f);
    }

    public static C10282l billing(int i, C2428l c2428l) {
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f = AbstractC12481l.loadAd / i;
            long jAmazon = AbstractC12481l.amazon(1.0f, 2.0f * f * i3);
            fArr[i2] = AbstractC10433l.mopub(jAmazon) + 0.0f;
            fArr[i2 + 1] = AbstractC10433l.admob(jAmazon) + 0.0f;
            long jAmazon2 = AbstractC12481l.amazon(0.8f, f * ((i3 * 2) + 1));
            int i4 = i2 + 3;
            fArr[i2 + 2] = AbstractC10433l.mopub(jAmazon2) + 0.0f;
            i2 += 4;
            fArr[i4] = AbstractC10433l.admob(jAmazon2) + 0.0f;
        }
        return AbstractC9498l.loadAd(fArr, c2428l, null, 0.0f, 0.0f);
    }

    public static final void crashlytics(C10038l c10038l, InterfaceC18636l interfaceC18636l, Throwable th) {
        String str;
        try {
            try {
                Object objIsPro = interfaceC18636l.adcel().isPro();
                if (objIsPro == null) {
                    objIsPro = "Unhandled";
                }
                try {
                    InterfaceC14280l interfaceC14280lBilling = interfaceC18636l.billing();
                    str = ((C17721l) ((C1080l) AbstractC5715l.yandex(interfaceC14280lBilling)).f2971l).yandex + " - " + AbstractC7000l.billing(interfaceC14280lBilling);
                } catch (Throwable th2) {
                    str = "(request error: " + th2 + ')';
                }
                String str2 = objIsPro + ": " + str + ". Exception " + AbstractC18202l.yandex.loadAd(th.getClass()) + ": " + th.getMessage();
                if (!(th instanceof CancellationException) && !(th instanceof ClosedChannelException) && !(th instanceof C7166l) && !(th instanceof IOException) && !(th instanceof C12789l) && !(th instanceof C14279l) && !(th instanceof C14504l)) {
                    ((InterfaceC6272l) c10038l.f20462l).amazon(objIsPro + ": " + str, th);
                    return;
                }
                ((InterfaceC6272l) c10038l.f20462l).isPro(str2, th);
            } catch (OutOfMemoryError unused) {
                System.err.print((Object) "OutOfMemoryError: ");
                System.err.print((Object) th.getMessage());
                System.err.print((Object) "\n");
            }
        } catch (OutOfMemoryError unused2) {
            InterfaceC6272l interfaceC6272l = (InterfaceC6272l) c10038l.f20462l;
            String message = th.getMessage();
            if (message == null) {
                message = "Exception of type " + AbstractC18202l.yandex.loadAd(th.getClass());
            }
            interfaceC6272l.amazon(message, th);
        }
    }

    public static IOException isPro(File file, IOException iOException, String str) {
        String strConcat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
            StringBuilder sb = new StringBuilder(str2.length() + 16);
            sb.append("Inoperable file:");
            sb.append(str2);
            strConcat = sb.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
                StringBuilder sb2 = new StringBuilder(strConcat.length() + str3.length());
                sb2.append(strConcat);
                sb2.append(str3);
                strConcat = sb2.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    public static C5587l loadAd(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 8) != 0) {
            f2 = 0.0f;
        }
        return new C5587l(0.0f, f, f2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (r7.mo1554while(r9, r0, r2) == r10) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object mopub(defpackage.InterfaceC18636l r7, defpackage.C2759l r8, java.lang.String r9, defpackage.AbstractC0283l r10) {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class<lٜؔٔ> r1 = defpackage.C2759l.class
            boolean r2 = r10 instanceof defpackage.C2146l
            if (r2 == 0) goto L17
            r2 = r10
            lًؓ۟ r2 = (defpackage.C2146l) r2
            int r3 = r2.f4784l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f4784l = r3
            goto L1c
        L17:
            lًؓ۟ r2 = new lًؓ۟
            r2.<init>(r10)
        L1c:
            java.lang.Object r10 = r2.f4785l
            int r3 = r2.f4784l
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L33
            if (r3 == r5) goto L29
            if (r3 != r4) goto L2d
        L29:
            defpackage.AbstractC2829l.crashlytics(r10)     // Catch: defpackage.C4703l -> L86
            goto L86
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            return r6
        L33:
            defpackage.AbstractC2829l.crashlytics(r10)
            lٗۖؕ r10 = r7.adcel()
            boolean r10 = r10.smaato()
            if (r10 != 0) goto L89
            lٗۖؕ r10 = r7.adcel()
            boolean r10 = r10.admob()
            if (r10 == 0) goto L4b
            goto L89
        L4b:
            lٍؗؐ r10 = defpackage.EnumC9342l.f19165l
            if (r9 != 0) goto L67
            lٕؔؒ r9 = defpackage.AbstractC18202l.yandex     // Catch: defpackage.C4703l -> L86
            lۣؒ۠ r9 = r9.loadAd(r1)     // Catch: defpackage.C4703l -> L86
            lّٟۧ r6 = defpackage.AbstractC18202l.yandex(r1)     // Catch: java.lang.Throwable -> L59
        L59:
            lُۚٔ r0 = new lُۚٔ     // Catch: defpackage.C4703l -> L86
            r0.<init>(r9, r6)     // Catch: defpackage.C4703l -> L86
            r2.f4784l = r5     // Catch: defpackage.C4703l -> L86
            java.lang.Object r7 = r7.mo1554while(r8, r0, r2)     // Catch: defpackage.C4703l -> L86
            if (r7 != r10) goto L86
            goto L85
        L67:
            lٗۖؕ r1 = r7.adcel()     // Catch: defpackage.C4703l -> L86
            r1.billing(r8)     // Catch: defpackage.C4703l -> L86
            lٕؔؒ r8 = defpackage.AbstractC18202l.yandex     // Catch: defpackage.C4703l -> L86
            lۣؒ۠ r8 = r8.loadAd(r0)     // Catch: defpackage.C4703l -> L86
            lّٟۧ r6 = defpackage.AbstractC18202l.yandex(r0)     // Catch: java.lang.Throwable -> L78
        L78:
            lُۚٔ r0 = new lُۚٔ     // Catch: defpackage.C4703l -> L86
            r0.<init>(r8, r6)     // Catch: defpackage.C4703l -> L86
            r2.f4784l = r4     // Catch: defpackage.C4703l -> L86
            java.lang.Object r7 = r7.mo1554while(r9, r0, r2)     // Catch: defpackage.C4703l -> L86
            if (r7 != r10) goto L86
        L85:
            return r10
        L86:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L89:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC14760l.mopub(lۡ٘, lٜؔٔ, java.lang.String, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
    
        if (mopub(r6, r8, r7, r0) == r5) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object purchase(defpackage.InterfaceC18636l r6, java.lang.Throwable r7, defpackage.AbstractC0283l r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C0955l
            if (r0 == 0) goto L13
            r0 = r8
            lًَؒ r0 = (defpackage.C0955l) r0
            int r1 = r0.f2650l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2650l = r1
            goto L18
        L13:
            lًَؒ r0 = new lًَؒ
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2653l
            int r1 = r0.f2650l
            r2 = 2
            r3 = 1
            r4 = 0
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L98
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r4
        L32:
            java.lang.Throwable r7 = r0.f2651l
            lۡ٘ r6 = r0.f2652l
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L63
        L3a:
            defpackage.AbstractC2829l.crashlytics(r8)
            r0.f2652l = r6
            r0.f2651l = r7
            r0.f2650l = r3
            lٖٓۚ r8 = r6.mo1553throw()
            defpackage.AbstractC13693l.purchase(r8)
            lؒۥۢ r8 = new lؒۥۢ
            r1 = 5
            r8.<init>(r6, r7, r0, r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r8 = r8.Signature(r1)
            if (r8 != r5) goto L59
            goto L5b
        L59:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L5b:
            if (r8 != r5) goto L5e
            goto L60
        L5e:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L60:
            if (r8 != r5) goto L63
            goto L97
        L63:
            boolean r8 = r7 instanceof defpackage.C12789l
            if (r8 == 0) goto L6a
            lٜؔٔ r8 = defpackage.C2759l.f5979l
            goto L83
        L6a:
            boolean r8 = r7 instanceof defpackage.C14279l
            if (r8 != 0) goto L81
            boolean r8 = r7 instanceof defpackage.C14504l
            if (r8 == 0) goto L73
            goto L81
        L73:
            boolean r8 = r7 instanceof java.util.concurrent.TimeoutException
            if (r8 != 0) goto L7e
            boolean r8 = r7 instanceof defpackage.C14749l
            if (r8 == 0) goto L7c
            goto L7e
        L7c:
            r8 = r4
            goto L83
        L7e:
            lٜؔٔ r8 = defpackage.C2759l.f5985l
            goto L83
        L81:
            lٜؔٔ r8 = defpackage.C2759l.f5984l
        L83:
            if (r8 != 0) goto L87
            lٜؔٔ r8 = defpackage.C2759l.f5974l
        L87:
            java.lang.String r7 = r7.getMessage()
            r0.f2652l = r4
            r0.f2651l = r4
            r0.f2650l = r2
            java.lang.Object r6 = mopub(r6, r8, r7, r0)
            if (r6 != r5) goto L98
        L97:
            return r5
        L98:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC14760l.purchase(lۡ٘, java.lang.Throwable, lّؑۧ):java.lang.Object");
    }

    public static IOException subs(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return isPro(file, iOException, str);
        }
        if (!parentFile.exists()) {
            return isPro(file, iOException, str);
        }
        if (parentFile.isDirectory()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? isPro(file, iOException, str) : isPro(file, iOException, str);
            }
            return parentFile.canWrite() ? isPro(file, iOException, str) : isPro(file, iOException, str);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? isPro(file, iOException, str) : isPro(file, iOException, str);
        }
        return parentFile.canWrite() ? isPro(file, iOException, str) : isPro(file, iOException, str);
    }

    public static final void yandex(C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(441837433);
        byte b = 0;
        if (c6956l.m2127for(i & 1, (i & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C6176l();
                c6956l.m2147try(objM2132native);
            }
            C6176l c6176l = (C6176l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = C16395l.f32069l;
                c6956l.m2147try(objM2132native2);
            }
            Function0 function0 = (Function0) objM2132native2;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            if (c6956l.f14603switch) {
                c6956l.loadAd(Unit.INSTANCE, new C14813l(b, 29));
            }
            AbstractC8182l.billing(c6956l, c6176l, C6415l.f13406l);
            c15578l.invoke(c6176l, c6956l, 48);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3782l(c15578l, i, b);
        }
    }
}
