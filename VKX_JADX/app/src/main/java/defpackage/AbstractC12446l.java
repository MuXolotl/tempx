package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;

/* JADX INFO: renamed from: lؚّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12446l {
    public static final C6167l yandex = new C6167l();
    public static final C9714l loadAd = new C9714l();

    public static final float amazon(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i2 * 3;
        return (fArr[i3 + 2] * fArr2[6 + i]) + (fArr[i3 + 1] * fArr2[3 + i]) + (fArr2[i] * fArr[i3]);
    }

    public static final void billing(C2397l c2397l, InterfaceC14029l interfaceC14029l, boolean z) {
        Object obj = C2397l.f5163l.get(c2397l);
        Throwable thPurchase = c2397l.purchase(obj);
        Object c18435l = thPurchase != null ? new C18435l(thPurchase) : c2397l.billing(obj);
        if (!z) {
            interfaceC14029l.subs(c18435l);
            return;
        }
        C16477l c16477l = (C16477l) interfaceC14029l;
        AbstractC0283l abstractC0283l = c16477l.f32209l;
        Object obj2 = c16477l.f32208l;
        InterfaceC12932l interfaceC12932lMetrica = abstractC0283l.metrica();
        Object objLoadAd = AbstractC7999l.loadAd(interfaceC12932lMetrica, obj2);
        C13887l c13887lRemoteconfig = objLoadAd != AbstractC7999l.yandex ? AbstractC14425l.remoteconfig(abstractC0283l, interfaceC12932lMetrica, objLoadAd) : null;
        try {
            c16477l.f32209l.subs(c18435l);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (c13887lRemoteconfig == null || c13887lRemoteconfig.m3796l()) {
                AbstractC7999l.yandex(interfaceC12932lMetrica, objLoadAd);
            }
        }
    }

    public static final float[] crashlytics(float f, float f2, float f3, float[] fArr) {
        return new float[]{fArr[0] * f, fArr[1] * f2, fArr[2] * f3, fArr[3] * f, fArr[4] * f2, fArr[5] * f3, fArr[6] * f, fArr[7] * f2, fArr[8] * f3};
    }

    public static final float[] loadAd(float f, float f2, float f3, float[] fArr) {
        return new float[]{(fArr[2] * f3) + (fArr[1] * f2) + (fArr[0] * f), (fArr[5] * f3) + (fArr[4] * f2) + (fArr[3] * f), (fArr[8] * f3) + (fArr[7] * f2) + (fArr[6] * f)};
    }

    public static C11337l mopub() {
        ClassLoader classLoader = AbstractC12446l.class.getClassLoader();
        if (C11337l.class.equals(C11337l.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new AbstractC12446l[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e2) {
                    Logger.getLogger(AbstractC10908l.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(C11337l.class.getSimpleName()), (Throwable) e2);
                }
            }
            if (arrayList.size() == 1) {
                return (C11337l) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C11337l) C11337l.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e3) {
                C11983l.ads(e3);
                return null;
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static float[] purchase(float[] fArr) {
        double d = fArr[0];
        double d2 = fArr[1];
        double d3 = fArr[2];
        double d4 = fArr[3];
        double d5 = fArr[4];
        double d6 = fArr[5];
        double d7 = fArr[6];
        double d8 = fArr[7];
        double d9 = fArr[8];
        double d10 = (d5 * d9) - (d8 * d6);
        double d11 = (d8 * d3) - (d2 * d9);
        double d12 = (d2 * d6) - (d5 * d3);
        double d13 = (d7 * d12) + (d4 * d11) + (d * d10);
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        fArrCopyOf[0] = (float) (d10 / d13);
        fArrCopyOf[3] = (float) (((d7 * d6) - (d4 * d9)) / d13);
        fArrCopyOf[6] = (float) (((d4 * d8) - (d7 * d5)) / d13);
        fArrCopyOf[1] = (float) (d11 / d13);
        fArrCopyOf[4] = (float) (((d9 * d) - (d7 * d3)) / d13);
        fArrCopyOf[7] = (float) (((d7 * d2) - (d8 * d)) / d13);
        fArrCopyOf[2] = (float) (d12 / d13);
        fArrCopyOf[5] = (float) (((d4 * d3) - (d * d6)) / d13);
        fArrCopyOf[8] = (float) (((d * d5) - (d4 * d2)) / d13);
        return fArrCopyOf;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ca A[Catch: all -> 0x0103, TRY_LEAVE, TryCatch #0 {all -> 0x0103, blocks: (B:43:0x00c4, B:45:0x00ca, B:42:0x00b8), top: B:66:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00fb -> B:20:0x004f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object yandex(defpackage.C11129l r17, defpackage.AbstractC5921l r18, defpackage.C11315l r19, defpackage.C14025l r20, boolean r21, defpackage.AbstractC12050l r22) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12446l.yandex(lُٙۛ, lؘۘۜ, lُۚٞ, lًٓۤ, boolean, lِۗٓ):java.lang.Object");
    }
}
