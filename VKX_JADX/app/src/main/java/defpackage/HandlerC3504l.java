package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؕٛٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC3504l extends Handler {
    public final /* synthetic */ C17646l crashlytics;
    public final ArrayList yandex = new ArrayList();
    public final ArrayList loadAd = new ArrayList();

    public HandlerC3504l(C17646l c17646l) {
        this.crashlytics = c17646l;
    }

    public static void yandex(C11179l c11179l, int i, Object obj, int i2) {
        C12736l c12736l;
        C12736l c12736l2;
        C9961l c9961l = c11179l.yandex;
        AbstractC2660l abstractC2660l = c11179l.loadAd;
        int i3 = 65280 & i;
        if (i3 != 256) {
            if (i3 != 512) {
                if (i3 == 768 && i == 769) {
                    abstractC2660l.getClass();
                    return;
                }
                return;
            }
            switch (i) {
                case 513:
                    abstractC2660l.getClass();
                    return;
                case 514:
                    abstractC2660l.getClass();
                    return;
                case 515:
                    abstractC2660l.getClass();
                    return;
                default:
                    return;
            }
        }
        if (i == 264 || i == 262) {
            C16197l c16197l = (C16197l) obj;
            C12736l c12736l3 = c16197l.loadAd;
            c12736l = c16197l.yandex;
            c12736l2 = c12736l3;
        } else {
            if (i == 265 || i == 266) {
                throw AbstractC12589l.signatures(obj);
            }
            c12736l2 = (C12736l) obj;
            c12736l = null;
        }
        if (c12736l2 != null) {
            boolean zCrashlytics = true;
            if ((c11179l.amazon & 2) == 0 && !c12736l2.purchase(c11179l.crashlytics)) {
                C9868l c9868l = C9961l.crashlytics().Signature;
                zCrashlytics = ((c9868l == null ? false : c9868l.crashlytics) && c12736l2.crashlytics() && i == 262 && i2 == 3 && c12736l != null) ? true ^ c12736l.crashlytics() : false;
            }
            if (zCrashlytics) {
                switch (i) {
                    case 257:
                        abstractC2660l.yandex(c9961l, c12736l2);
                        return;
                    case 258:
                        abstractC2660l.purchase(c9961l, c12736l2);
                        return;
                    case 259:
                        abstractC2660l.loadAd(c9961l, c12736l2);
                        return;
                    case 260:
                        abstractC2660l.getClass();
                        return;
                    case 261:
                        abstractC2660l.getClass();
                        return;
                    case 262:
                        abstractC2660l.billing(c9961l, c12736l2, i2, c12736l2);
                        return;
                    case 263:
                        abstractC2660l.mopub(c9961l, c12736l2, i2);
                        return;
                    case 264:
                        abstractC2660l.billing(c9961l, c12736l2, i2, c12736l);
                        return;
                    case 265:
                        abstractC2660l.crashlytics(c12736l, c12736l2);
                        return;
                    case 266:
                        abstractC2660l.amazon(c12736l, c12736l2, i2);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int iFirebase;
        ArrayList arrayList = this.yandex;
        C17646l c17646l = this.crashlytics;
        ArrayList arrayList2 = c17646l.admob;
        C14633l c14633l = c17646l.subscription;
        int i = message.what;
        Object obj = message.obj;
        int i2 = message.arg1;
        if (i == 259 && c17646l.mopub().crashlytics.equals(((C12736l) obj).crashlytics)) {
            c17646l.startapp(true);
        }
        ArrayList arrayList3 = this.loadAd;
        if (i == 262) {
            C16197l c16197l = (C16197l) obj;
            C12736l c12736l = c16197l.loadAd;
            if (c16197l.crashlytics) {
                c14633l.adcel(c12736l);
            }
            if (c17646l.license != null && c12736l.crashlytics()) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    c14633l.startapp((C12736l) it.next());
                }
                arrayList3.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case 257:
                    c14633l.metrica((C12736l) obj);
                    break;
                case 258:
                    c14633l.startapp((C12736l) obj);
                    break;
                case 259:
                    C12736l c12736l2 = (C12736l) obj;
                    c14633l.getClass();
                    if (c12736l2.yandex() != c14633l && (iFirebase = c14633l.firebase(c12736l2)) >= 0) {
                        C14633l.tapsense((C5211l) c14633l.f28650l.get(iFirebase));
                    }
                    break;
            }
        } else {
            C16197l c16197l2 = (C16197l) obj;
            C12736l c12736l3 = c16197l2.loadAd;
            arrayList3.add(c12736l3);
            c14633l.metrica(c12736l3);
            if (c16197l2.crashlytics) {
                c14633l.adcel(c12736l3);
            }
        }
        try {
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        yandex((C11179l) it2.next(), i, obj, i2);
                    }
                    return;
                } else {
                    C9961l c9961l = (C9961l) ((WeakReference) arrayList2.get(size)).get();
                    if (c9961l == null) {
                        arrayList2.remove(size);
                    } else {
                        arrayList.addAll(c9961l.loadAd);
                    }
                }
            }
        } finally {
            arrayList.clear();
        }
    }

    public final void loadAd(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }
}
