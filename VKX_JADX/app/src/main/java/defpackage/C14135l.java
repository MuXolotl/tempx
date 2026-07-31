package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٓٓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14135l {
    public final C17190l yandex;
    public static final AtomicReference loadAd = new AtomicReference();
    public static final AtomicReference crashlytics = new AtomicReference();
    public static final AtomicReference amazon = new AtomicReference();

    public C14135l(C17190l c17190l) {
        this.yandex = c17190l;
    }

    public static final String mopub(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC1051l.subs(atomicReference);
        AbstractC1051l.loadAd(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String amazon(C13236l c13236l) {
        String string;
        C17190l c17190l = this.yandex;
        if (!c17190l.loadAd()) {
            return c13236l.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(c13236l.f26008l);
        sb.append(",name=");
        sb.append(yandex(c13236l.f26010l));
        sb.append(",params=");
        C16021l c16021l = c13236l.f26009l;
        if (c16021l == null) {
            string = null;
        } else {
            string = !c17190l.loadAd() ? c16021l.f31403l.toString() : purchase(c16021l.firebase());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String billing(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbAd = AbstractC5020l.ad("[");
        for (Object obj : objArr) {
            String strPurchase = obj instanceof Bundle ? purchase((Bundle) obj) : String.valueOf(obj);
            if (strPurchase != null) {
                if (sbAd.length() != 1) {
                    sbAd.append(", ");
                }
                sbAd.append(strPurchase);
            }
        }
        sbAd.append("]");
        return sbAd.toString();
    }

    public final String crashlytics(String str) {
        if (str == null) {
            return null;
        }
        if (this.yandex.loadAd()) {
            return str.startsWith("_exp_") ? AbstractC15560l.Signature("experiment_id(", str, ")") : mopub(str, AbstractC8020l.billing, AbstractC8020l.purchase, amazon);
        }
        return str;
    }

    public final String loadAd(String str) {
        if (str == null) {
            return null;
        }
        return !this.yandex.loadAd() ? str : mopub(str, AbstractC6873l.crashlytics, AbstractC6873l.loadAd, crashlytics);
    }

    public final String purchase(Bundle bundle) {
        String strBilling;
        if (bundle == null) {
            return null;
        }
        if (!this.yandex.loadAd()) {
            return bundle.toString();
        }
        StringBuilder sbAd = AbstractC5020l.ad("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbAd.length() != 8) {
                sbAd.append(", ");
            }
            sbAd.append(loadAd(str));
            sbAd.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strBilling = billing(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strBilling = billing((Object[]) obj);
            } else {
                strBilling = obj instanceof ArrayList ? billing(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbAd.append(strBilling);
        }
        sbAd.append("}]");
        return sbAd.toString();
    }

    public final String yandex(String str) {
        if (str == null) {
            return null;
        }
        return !this.yandex.loadAd() ? str : mopub(str, AbstractC7572l.mopub, AbstractC7572l.loadAd, loadAd);
    }
}
