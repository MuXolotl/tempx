package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import j$.util.DesugarCollections;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٌؙْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6427l {
    public static final Object yandex = new Object();

    public static void admob(String str, String str2) {
        synchronized (yandex) {
            Log.e(str, loadAd(str2, null));
        }
    }

    public static AbstractC6786l amazon(InterfaceC1122l interfaceC1122l, ArrayList arrayList, int i) {
        int i2 = i & 1;
        C2580l c2580l = C2580l.f5619l;
        List list = arrayList;
        if (i2 != 0) {
            list = c2580l;
        }
        return purchase(interfaceC1122l, list, false, c2580l, null);
    }

    public static void billing(String str, String str2) {
        synchronized (yandex) {
            Log.d(str, loadAd(str2, null));
        }
    }

    public static final void crashlytics(int i, int i2) {
        if (i == i2) {
            return;
        }
        C8339l.metrica(AbstractC12589l.applovin(i, i2, "Class declares ", " type parameters, but ", " were provided."));
    }

    public static void firebase(String str, String str2) {
        synchronized (yandex) {
            Log.i(str, loadAd(str2, null));
        }
    }

    public static String isPro(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        synchronized (yandex) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    z = false;
                    break;
                }
                try {
                    if (cause instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    cause = cause.getCause();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z) {
                return "UnknownHostException (no network)";
            }
            return Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    public static String loadAd(String str, Throwable th) {
        String strIsPro = isPro(th);
        if (TextUtils.isEmpty(strIsPro)) {
            return str;
        }
        StringBuilder sbAdvert = AbstractC5020l.advert(str, "\n  ");
        sbAdvert.append(strIsPro.replace("\n", "\n  "));
        sbAdvert.append('\n');
        return sbAdvert.toString();
    }

    public static void metrica(String str, String str2, Throwable th) {
        synchronized (yandex) {
            Log.w(str, loadAd(str2, th));
        }
    }

    public static void mopub(String str, String str2, Exception exc) {
        synchronized (yandex) {
            Log.d(str, loadAd(str2, exc));
        }
    }

    public static final AbstractC6786l purchase(InterfaceC1122l interfaceC1122l, List list, boolean z, List list2, InterfaceC1388l interfaceC1388l) {
        InterfaceC15234l interfaceC15234lM1727abstract;
        InterfaceC0218l c12768l;
        if (!AbstractC0367l.yandex) {
            InterfaceC1388l interfaceC1388l2 = interfaceC1122l instanceof InterfaceC1388l ? (InterfaceC1388l) interfaceC1122l : null;
            List listYandex = interfaceC1388l2 != null ? C9552l.yandex(interfaceC1388l2) : null;
            if (listYandex == null) {
                listYandex = C2580l.f5619l;
            }
            crashlytics(listYandex.size(), list.size());
            return new C13267l(interfaceC1122l, list, z, list2, null, false, false, false, interfaceC1388l, null);
        }
        if (interfaceC1122l instanceof C5160l) {
            interfaceC15234lM1727abstract = ((C5160l) interfaceC1122l).m1727abstract();
        } else {
            if (!(interfaceC1122l instanceof C9243l)) {
                StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
                sb.append(interfaceC1122l);
                Class<?> cls = interfaceC1122l.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new C3150l(sb.toString());
            }
            C9243l c9243l = (C9243l) interfaceC1122l;
            InterfaceC16902l interfaceC16902l = c9243l.f19007l;
            if (interfaceC16902l == null) {
                C17132l.metrica(c9243l, "Descriptor-less type parameter: ");
                return null;
            }
            interfaceC15234lM1727abstract = interfaceC16902l;
        }
        crashlytics(interfaceC15234lM1727abstract.metrica().getParameters().size(), list.size());
        InterfaceC1925l interfaceC1925lMetrica = interfaceC15234lM1727abstract.metrica();
        List parameters = interfaceC1925lMetrica.getParameters();
        C16017l.f31395l.getClass();
        C16017l c16017l = C16017l.f31394l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            C0861l c0861l = (C0861l) obj;
            C5380l c5380l = (C5380l) c0861l.loadAd;
            AbstractC18041l abstractC18041l = c5380l != null ? c5380l.f11513l : null;
            int i3 = c0861l.yandex;
            int i4 = i3 == 0 ? -1 : AbstractC18544l.yandex[AbstractC5020l.inmobi(i3)];
            if (i4 == -1) {
                c12768l = new C12768l((InterfaceC16902l) parameters.get(i));
            } else if (i4 == 1) {
                c12768l = new C10636l(1, abstractC18041l);
            } else if (i4 == 2) {
                c12768l = new C10636l(2, abstractC18041l);
            } else {
                if (i4 != 3) {
                    C18725l.billing();
                    return null;
                }
                c12768l = new C10636l(3, abstractC18041l);
            }
            arrayList.add(c12768l);
            i = i2;
        }
        return new C5380l(AbstractC3605l.ads(c16017l, interfaceC1925lMetrica, arrayList, z));
    }

    public static List remoteconfig(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    public static long smaato(C14025l c14025l) {
        C12382l c12382l = AbstractC5921l.f12465l;
        C18402l c18402lMo694private = c12382l.mo694private(c14025l);
        long jLongValue = 0;
        if (c18402lMo694private != null) {
            if (!c18402lMo694private.yandex) {
                C12588l c12588l = new C12588l(AbstractC17587l.startapp(AbstractC17587l.firebase(AbstractC17587l.startapp(c12382l.mo693package(c14025l), new C3151l(1, c12382l, AbstractC5921l.class, "metadataOrNull", "metadataOrNull(Lokio/Path;)Lokio/FileMetadata;", 0, 0, 13)), C12290l.f24361l), C3054l.f6582l));
                while (c12588l.hasNext()) {
                    jLongValue += ((Number) c12588l.next()).longValue();
                }
                return jLongValue;
            }
            Long l = c18402lMo694private.amazon;
            if (l != null) {
                return l.longValue();
            }
        }
        return 0L;
    }

    public static void subs(String str, String str2, Throwable th) {
        synchronized (yandex) {
            Log.e(str, loadAd(str2, th));
        }
    }

    public static void vip(String str, String str2) {
        synchronized (yandex) {
            Log.w(str, loadAd(str2, null));
        }
    }

    public static final void yandex(Surface surface, C11925l c11925l, InterfaceC13490l interfaceC13490l, C13601l c13601l) {
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            C4417l c4417l = c13601l.f26630l;
            EnumC9931l enumC9931l = c4417l.loadAd;
            Canvas canvas = AbstractC10071l.yandex;
            C2151l c2151l = new C2151l();
            c2151l.yandex = canvasLockHardwareCanvas;
            float width = canvasLockHardwareCanvas.getWidth();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(canvasLockHardwareCanvas.getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
            InterfaceC13490l interfaceC13490l2 = c4417l.yandex;
            EnumC9931l enumC9931l2 = c4417l.loadAd;
            InterfaceC14859l interfaceC14859l = c4417l.crashlytics;
            long j = c4417l.amazon;
            c4417l.yandex = interfaceC13490l;
            c4417l.loadAd = enumC9931l;
            c4417l.crashlytics = c2151l;
            c4417l.amazon = jFloatToRawIntBits;
            c2151l.mopub();
            AbstractC2576l.loadAd(c13601l, c11925l);
            c2151l.ads();
            c4417l.yandex = interfaceC13490l2;
            c4417l.loadAd = enumC9931l2;
            c4417l.crashlytics = interfaceC14859l;
            c4417l.amazon = j;
        } finally {
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }
}
