package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l٘ؗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17716l {
    public static final byte[] yandex = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] loadAd = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static final InterfaceC17242l amazon(float f, float f2) {
        boolean zIsNaN = Float.isNaN(f);
        InterfaceC17242l c4638l = C4346l.f8873l;
        InterfaceC17242l c4638l2 = !zIsNaN ? new C4638l(AbstractC12013l.yandex, f, Float.NaN) : c4638l;
        if (!Float.isNaN(f2)) {
            c4638l = new C4638l(AbstractC12013l.loadAd, Float.NaN, f2);
        }
        return c4638l2.premium(c4638l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C9902l billing(C9783l c9783l, float f, C9902l c9902l) {
        boolean z;
        C9902l c9902l2 = c9902l;
        c9783l.getClass();
        C10227l c10227lAdmob = AbstractC14055l.admob();
        ArrayList arrayList = c9783l.yandex;
        int size = arrayList.size();
        C17841l c17841l = null;
        C17841l c17841l2 = null;
        int i = 0;
        while (i < size) {
            float[] fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = AbstractC12481l.loadAd(((C17841l) ((C8195l) arrayList.get(i)).f17098l).yandex[i2], ((C17841l) ((C8195l) arrayList.get(i)).f17097l).yandex[i2], f);
            }
            C17841l c17841l3 = new C17841l(fArr);
            if (c17841l2 == null) {
                c17841l2 = c17841l3;
            }
            if (c17841l != null) {
                c10227lAdmob.add(c17841l);
            }
            i++;
            c17841l = c17841l3;
        }
        if (c17841l != null && c17841l2 != null) {
            float[] fArr2 = c17841l.yandex;
            float f2 = fArr2[0];
            float f3 = fArr2[1];
            float f4 = fArr2[2];
            float f5 = fArr2[3];
            float f6 = fArr2[4];
            float f7 = fArr2[5];
            float[] fArr3 = c17841l2.yandex;
            c10227lAdmob.add(AbstractC4603l.yandex(f2, f3, f4, f5, f6, f7, fArr3[0], fArr3[1]));
        }
        C10227l c10227lPurchase = AbstractC14055l.purchase(c10227lAdmob);
        c9902l2.subs();
        int iPro = c10227lPurchase.pro();
        int i3 = 0;
        boolean z2 = true;
        while (i3 < iPro) {
            C17841l c17841l4 = (C17841l) c10227lPurchase.get(i3);
            if (z2) {
                float[] fArr4 = c17841l4.yandex;
                c9902l2.billing(fArr4[0], fArr4[1]);
                z = false;
            } else {
                z = z2;
            }
            float[] fArr5 = c17841l4.yandex;
            c9902l2.crashlytics(fArr5[2], fArr5[3], fArr5[4], fArr5[5], c17841l4.yandex(), c17841l4.loadAd());
            i3++;
            c9902l2 = c9902l;
            z2 = z;
        }
        c9902l.loadAd();
        return c9902l;
    }

    public static final AbstractC1668l crashlytics(AbstractC1668l abstractC1668l) {
        C3654l c3654lLicense = abstractC1668l.f4026l.f35281l;
        while (true) {
            C3654l c3654lLicense2 = c3654lLicense.license();
            if ((c3654lLicense2 != null ? c3654lLicense2.f7693l : null) == null) {
                return ((AbstractC18026l) c3654lLicense.f7703l.purchase).mo2645l();
            }
            C3654l c3654lLicense3 = c3654lLicense.license();
            c3654lLicense = (c3654lLicense3 != null ? c3654lLicense3.f7693l : null).f7704l ? c3654lLicense.license() : c3654lLicense.license().f7693l;
        }
    }

    public static C9412l loadAd(Context context) {
        ProviderInfo providerInfo;
        C17129l c17129l;
        ApplicationInfo applicationInfo;
        int i = 28;
        C18450l c7387l = Build.VERSION.SDK_INT >= 28 ? new C7387l(i) : new C18450l(i);
        PackageManager packageManager = context.getPackageManager();
        AbstractC5641l.amazon(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c17129l = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrSmaato = c7387l.smaato(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrSmaato) {
                    arrayList.add(signature.toByteArray());
                }
                c17129l = new C17129l(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                c17129l = null;
            }
        }
        if (c17129l == null) {
            return null;
        }
        return new C9412l(new C10535l(context, c17129l));
    }

    public static String mopub(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strAds;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strAds = "null";
            } else {
                try {
                    strAds = obj.toString();
                } catch (Exception e) {
                    String strPro = AbstractC9361l.pro(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strPro), (Throwable) e);
                    strAds = AbstractC14814l.ads("<", strPro, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strAds;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static C8128l purchase(int i, InterfaceC10430l interfaceC10430l, C13143l c13143l) throws C17655l {
        C8128l c8128lLoadAd = C8128l.loadAd(interfaceC10430l, c13143l);
        while (true) {
            int i2 = c8128lLoadAd.f16932l;
            if (i2 == i) {
                return c8128lLoadAd;
            }
            AbstractC12900l.subscription("Ignoring unknown WAV chunk: ", i2, "WavHeaderReader");
            long j = c8128lLoadAd.f16931l;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw C17655l.crashlytics("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            interfaceC10430l.remoteconfig((int) j2);
            c8128lLoadAd = C8128l.loadAd(interfaceC10430l, c13143l);
        }
    }

    public static boolean yandex(InterfaceC10430l interfaceC10430l) {
        C13143l c13143l = new C13143l(8);
        int i = C8128l.loadAd(interfaceC10430l, c13143l).f16932l;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        interfaceC10430l.yandex(0, 4, c13143l.yandex);
        c13143l.m3562for(0);
        int iRemoteconfig = c13143l.remoteconfig();
        if (iRemoteconfig == 1463899717) {
            return true;
        }
        AbstractC6427l.admob("WavHeaderReader", "Unsupported form type: " + iRemoteconfig);
        return false;
    }
}
