package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2044l {
    public static final C8896l yandex = new C8896l(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final C8896l admob(InterfaceC18212l interfaceC18212l) {
        C8896l c8896lLoadAd = AbstractC9690l.loadAd(interfaceC18212l, true);
        return AbstractC7470l.admob(interfaceC18212l.tapsense(c8896lLoadAd.admob()), interfaceC18212l.tapsense(c8896lLoadAd.purchase()));
    }

    public static final long amazon(C0205l c0205l, long j, C15812l c15812l) {
        InterfaceC18212l interfaceC18212l;
        long jLoadAd;
        long j2;
        C6222l c6222l;
        int iAmazon;
        float fAmazon;
        C6222l c6222l2;
        int iAmazon2;
        C6222l c6222l3;
        int iAmazon3;
        float fLoadAd;
        C6222l c6222l4;
        int iAmazon4;
        C18329l c18329lBilling = c0205l.billing(c15812l);
        if (c18329lBilling == null || (interfaceC18212l = c0205l.f1170l) == null) {
            return 9205357640488583168L;
        }
        C8841l c8841l = c18329lBilling.crashlytics;
        InterfaceC18212l interfaceC18212lCrashlytics = c18329lBilling.crashlytics();
        if (interfaceC18212lCrashlytics == null) {
            return 9205357640488583168L;
        }
        int i = c15812l.loadAd;
        C0327l c0327l = (C0327l) c8841l.invoke();
        if (i > (c0327l == null ? 0 : c18329lBilling.loadAd(c0327l))) {
            return 9205357640488583168L;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC18212lCrashlytics.mo2593throws(interfaceC18212l, ((C1187l) c0205l.f1165l.getValue()).yandex) >> 32));
        C0327l c0327l2 = (C0327l) c8841l.invoke();
        if (c0327l2 == null) {
            jLoadAd = C12814l.loadAd;
        } else {
            C6222l c6222l5 = c0327l2.loadAd;
            int iLoadAd = c18329lBilling.loadAd(c0327l2);
            if (iLoadAd < 1) {
                jLoadAd = C12814l.loadAd;
            } else {
                int iAmazon5 = c6222l5.amazon(AbstractC8576l.purchase(i, 0, iLoadAd - 1));
                jLoadAd = AbstractC2296l.loadAd(c0327l2.subs(iAmazon5), c6222l5.crashlytics(iAmazon5, true));
            }
        }
        if (C12814l.amazon(jLoadAd)) {
            C0327l c0327l3 = (C0327l) c8841l.invoke();
            fAmazon = (c0327l3 != null && (iAmazon4 = (c6222l4 = c0327l3.loadAd).amazon(i)) < c6222l4.billing) ? c0327l3.mopub(iAmazon4) : -1.0f;
            j2 = 4294967295L;
        } else {
            j2 = 4294967295L;
            int i2 = (int) (jLoadAd >> 32);
            C0327l c0327l4 = (C0327l) c8841l.invoke();
            float fMopub = (c0327l4 != null && (iAmazon2 = (c6222l2 = c0327l4.loadAd).amazon(i2)) < c6222l2.billing) ? c0327l4.mopub(iAmazon2) : -1.0f;
            int i3 = ((int) (jLoadAd & 4294967295L)) - 1;
            C0327l c0327l5 = (C0327l) c8841l.invoke();
            float fAdmob = (c0327l5 != null && (iAmazon = (c6222l = c0327l5.loadAd).amazon(i3)) < c6222l.billing) ? c0327l5.admob(iAmazon) : -1.0f;
            fAmazon = AbstractC8576l.amazon(fIntBitsToFloat, Math.min(fMopub, fAdmob), Math.max(fMopub, fAdmob));
        }
        if (fAmazon == -1.0f) {
            return 9205357640488583168L;
        }
        if (!C4999l.loadAd(j, 0L) && Math.abs(fIntBitsToFloat - fAmazon) > ((int) (j >> 32)) / 2) {
            return 9205357640488583168L;
        }
        C0327l c0327l6 = (C0327l) c8841l.invoke();
        if (c0327l6 != null && (iAmazon3 = (c6222l3 = c0327l6.loadAd).amazon(i)) < c6222l3.billing) {
            float fBilling = c6222l3.billing(iAmazon3);
            fLoadAd = ((c6222l3.loadAd(iAmazon3) - fBilling) / 2.0f) + fBilling;
        } else {
            fLoadAd = -1.0f;
        }
        if (fLoadAd == -1.0f) {
            return 9205357640488583168L;
        }
        return interfaceC18212l.mo2593throws(interfaceC18212lCrashlytics, (((long) Float.floatToRawIntBits(fAmazon)) << 32) | (((long) Float.floatToRawIntBits(fLoadAd)) & j2));
    }

    public static final boolean billing(C2139l c2139l) {
        return c2139l.loadAd() == 0;
    }

    public static InterfaceC5763l crashlytics(InterfaceC5763l interfaceC5763l, InterfaceC15446l interfaceC15446l) {
        if (AbstractC8576l.yandex(interfaceC5763l.getKey(), interfaceC15446l)) {
            return interfaceC5763l;
        }
        return null;
    }

    public static final boolean loadAd(long j, C8896l c8896l) {
        float f = c8896l.yandex;
        float f2 = c8896l.crashlytics;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = c8896l.loadAd;
        float f4 = c8896l.amazon;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    public static InterfaceC12932l mopub(InterfaceC5763l interfaceC5763l, InterfaceC15446l interfaceC15446l) {
        return AbstractC8576l.yandex(interfaceC5763l.getKey(), interfaceC15446l) ? C17218l.f33421l : interfaceC5763l;
    }

    public static final int purchase(C2139l c2139l, byte b, int i, int i2) {
        if (i < 0 || i >= c2139l.loadAd()) {
            C10754l.metrica(String.valueOf(i));
            return 0;
        }
        if (i > i2 || i2 > c2139l.loadAd()) {
            C10754l.metrica(String.valueOf(i2));
            return 0;
        }
        int i3 = c2139l.loadAd;
        byte[] bArr = c2139l.yandex;
        while (i < i2) {
            if (bArr[i3 + i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static boolean subs(AbstractC16136l abstractC16136l, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC14181l) {
            collection = ((InterfaceC14181l) collection).zza();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= abstractC16136l.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= abstractC16136l.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = abstractC16136l.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static void yandex(Context context, List list) {
        if (context instanceof AppActivity) {
            ArrayList<MainArtist> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((MainArtist) obj).yandex != null) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (arrayList.size() == 1) {
                AppActivity appActivity = (AppActivity) context;
                String str = ((MainArtist) list.get(0)).yandex;
                if (str == null) {
                    return;
                }
                appActivity.license(new C13379l(str));
                appActivity.applovin();
                return;
            }
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
            for (MainArtist mainArtist : arrayList) {
                arrayList2.add(new C2900l(R.drawable.ic_music_mic_outline_28, mainArtist.crashlytics, new C3005l(context, mainArtist, 29)));
            }
            new C17731l(R.string.libopener_artists, arrayList2).Signature((Activity) context);
        }
    }
}
